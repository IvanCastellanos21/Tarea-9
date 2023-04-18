public class Vehiculo {
    private String matricula;
    private String modelo;
    private float potenciaCV;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, float potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potenciaCV=" + potenciaCV +
                '}';
    }


    public void encenderMotor(){
        System.out.println("El motor ha sido entendido");
    }
    public void avanzar(){
        System.out.println("El vehiculo esta avanzando");
    }
}
