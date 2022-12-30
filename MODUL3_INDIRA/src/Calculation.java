public class Calculation implements Runnable{
    public double radius;
    public double side;
    public double area;
    public double phi = 3.14;

    @Override
    public void run() {
        System.out.println("\n====Program will start in====");
        for (int i = 3;i>0;i--){
            try {
                System.out.println("Starting with thread " + i);
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1) {
          throw new IllegalArgumentException("illegal exception: the side must be greater than or equal to 1");
        }
        this.side = side;
        this.area = side * side;
    }
    
    public double getSquare() {
        return this.area;
    }
    
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
          throw new IllegalArgumentException("illegal exception: the radius must be greater than or equal to 1");
        }
        this.radius = radius;
        this.area = phi * radius * radius;
    }
    
    public double getCircle() {
        return this.area;
    }
    
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
          throw new IllegalArgumentException("illegal exception: side of the base, upper side, and the height must be greater than or equal to 1");
        }
        this.area = (a + b) * t / 2;
    }
    
    public double getTrapezoid() {
        return this.area;
    }
}