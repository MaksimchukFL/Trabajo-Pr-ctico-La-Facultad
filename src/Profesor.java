public class Profesor extends Persona{
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.antiguedad=antiguedad;
        this.basico=basico;
    }


    public double getBasico() {
        return basico;
    }

    public void setBasico(int basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(){
        double aumento=this.basico*0.1;
        return this.basico+(aumento*this.antiguedad);
    }


}
