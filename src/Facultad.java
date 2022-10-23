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
        for (Carrera c: coleccionCarreras){
            if(c.getNombre().equals(carrera.getNombre())){
                System.out.println("Se agregó la carrera " + carrera.getNombre());
            }
        }
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
                        System.out.println("Se eliminó el estudiante " + estudiante.getNombre() + " " + estudiante.getApellido());
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
        String listado=coleccionCarreras.toString();
        return listado;
    }
}