import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void printMenu(){
        System.out.println("===Menu Program===");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculation calculate = new Calculation();
            boolean repeat = true;
            do{
                try {
                    printMenu();
                    System.out.print("Select menu : ");
                    int menu = scanner.nextInt();
                    switch (menu){
                        case 1 :
                            System.out.print("\nEnter the length of the side of the square : ");
                            double side = scanner.nextDouble();
                            calculate.setSquare(side);
                            calculate.run();
                            System.out.println("\nThe calculation result : " + calculate.getSquare());
                            break;
                        case 2:
                            System.out.print("Enter the radius of the circle : ");
                            double rad = scanner.nextDouble();
                            calculate.setCircle(rad);
                            calculate.run();
                            System.out.println("The calculation result : " + calculate.getCircle());
                            break;
                        case 3:
                            System.out.print("Insert the side of the base of the trapezoid: ");
                            double side_base = scanner.nextDouble();
                            System.out.print("Enter the upper side of the trapezoid: ");
                            double side_upper = scanner.nextDouble();
                            System.out.print("Enter the height of the trapezoid: ");
                            double height = scanner.nextDouble();
                            calculate.setTrapezoid(side_base,side_upper,height);
                            calculate.run();
                            System.out.println("The calculation result: " + calculate.getTrapezoid());
                            break;
                        case 0:
                            System.out.println("Program Ended");
                        default:
                            System.out.println("\nOption not available\n");
                            continue;
                    }
                    repeat = false;

                }catch (InputMismatchException e){
                    System.out.println("Error: input must be a number");
                    break;
                }catch (IllegalArgumentException e){
                    e.printStackTrace();
                }
            }while (repeat);
        }
    }
}
