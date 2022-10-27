import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Facultad implements Informacion {
    private String nombre;

    private LinkedList<Carrera> coleccionCarreras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        coleccionCarreras = new LinkedList<>();
    }


    public void agregarCarrera(Carrera carrera){
        this.coleccionCarreras.add(carrera);
    }
    public void eliminarCarrera(String nombre){
        for (Carrera carrera:coleccionCarreras
        ) {
            if (nombre.equals(carrera.getNombre())){
                coleccionCarreras.remove(carrera);
                System.out.println("Se eliminó la carrera  " + nombre );
            }
        }
    }

    public void eliminarEstudiante(Estudiante estudiante){
        for(Carrera carrera:coleccionCarreras){
            for (Materia materia:carrera.getMaterias()){
                for(Estudiante estudiantex:materia.getColeccionEstudiantes()){
                    if(estudiantex.equals(estudiante)){
                        materia.getColeccionEstudiantes().remove(estudiante);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre de la facultad: " + nombre + '\n' +
                "   Carreras de la facultad: " + coleccionCarreras;
    }
    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        TreeSet<String> listaNombresCarreras=new TreeSet<>();
        for (Carrera carrera:coleccionCarreras) {
            listaNombresCarreras.add(carrera.getNombre());
        }
        return listaNombresCarreras.toString();
    }
}