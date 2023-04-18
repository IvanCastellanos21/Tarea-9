public class Taxi extends Automovil{
    private int pasajeros;
    private int tarifaKm;

    public Taxi() {
    }

    public Taxi(int pasajeros, int tarifaKm) {
        this.pasajeros = pasajeros;
        this.tarifaKm = tarifaKm;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getTarifaKm() {
        return tarifaKm;
    }

    public void setTarifaKm(int tarifaKm) {
        this.tarifaKm = tarifaKm;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "pasajeros=" + pasajeros +
                ", tarifaKm=" + tarifaKm +
                '}';
    }

    public void recogerPasajero(){
        System.out.println("Ha recogido un pasajero");
    }

    public void dejarPasajero(){
        System.out.println("Ha dejado a un pasajero");
    }
}
