
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

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

    public void eliminarEstudiante(String nombre){
        for (Estudiante estudiante:coleccionEstudiantes) {
            if (nombre.equals(estudiante.getNombre())){
                coleccionEstudiantes.remove(estudiante);
                System.out.println("Estudiante eliminado.");
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
        TreeSet<String> listaNombresEstudiantes=new TreeSet<>();
        for (Estudiante estudiante:coleccionEstudiantes) {
            listaNombresEstudiantes.add(estudiante.getApellido()+","+estudiante.getNombre());
        }
        return listaNombresEstudiantes.toString();
    }
}
