public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("bmw", "25000");
        System.out.println(auto);
        auto.tocarClaxon();
        Taxi taxi = new Taxi(4,20);
        System.out.println(taxi);
        taxi.recogerPasajero();
    }
}