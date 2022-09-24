import java.util.LinkedList;

public class Carrera {
    private String nombre;
    private LinkedList<Materia> materias;

    public Carrera(String nombre){
        this.nombre = nombre;
        materias = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public void eliminarMateria(String nombreMateria){
        for(Materia materia: materias){
            if(materia.getNombre() == nombreMateria){
                materias.remove(materia);
            }
        }
    }

    public void encontrarMateria(String nombreMateria){
        for(Materia materia: materias){
            if(materia.getNombre() == nombreMateria){
                System.out.println("La materia se encuentra en la carrera");
            }
        }
    }
}
