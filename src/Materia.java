
import java.util.Collections;
import java.util.LinkedList;

public class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes = new LinkedList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public Materia(String nombre, Profesor profesor){
        this.nombre = nombre;
        this.titular = profesor;
    }

    public LinkedList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(LinkedList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void eliminarEstudiante(int legajo)
    {
        for (Estudiante estudiante : coleccionEstudiantes){
            if(estudiante.getLegajo()==legajo){
                coleccionEstudiantes.remove(estudiante);
            }
        }
    }
    public void modificarTitular(Profesor profesor)
    {
        this.titular = profesor;
    }
    public void agregarEstudiante(Estudiante estudiante)
    {
        coleccionEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }
}
