public class Automovil extends Vehiculo{
    private String marca;
    private String kilometraje;

    public Automovil() {
    }

    public Automovil(String marca, String kilometraje) {
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", kilometraje='" + kilometraje + '\'' +
                '}';
    }

    public void tocarClaxon(){
        System.out.println("Ha tocado el claxon");
    }
    public void encenderLuces(){
        System.out.println("Ha encendido las luces");
    }
}
