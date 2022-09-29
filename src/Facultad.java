import java.util.LinkedList;

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
    public void eliminarCarrera(Carrera carrera){
        this.coleccionCarreras.remove(carrera);
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
        return 0;
    }

    @Override
    public String listarContenidos() {
        return null;
    }
}