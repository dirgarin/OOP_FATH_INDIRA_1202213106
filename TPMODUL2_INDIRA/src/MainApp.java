public class MainApp {
    public static void main (String[] args) throws Exception {
        Perangkat prngkt = new Perangkat("Adata",2, 1.80f);
        prngkt.informasi();
        System.out.println("");
        
        Laptop lptp = new Laptop("Seagate", 8, 2.40f, true);
        lptp.informasi();
        lptp.bukaGame("Dota 2");
        lptp.kirimEmail("niceyuk@gmail.com");
        lptp.kirimEmail("aanarji@gmail.com","rusmango@gmail.com");
        System.out.println("");

        Handphone hp = new Handphone ("Sandisk",3, 2.20f, false);
        hp.informasi();
        hp.telfon(628122122);
        hp.kirimSMS(62852112);
        hp.kirimSMS(628121212, 629292211);
        System.out.println();
    }
}
