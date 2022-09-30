import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Carrera implements Informacion {
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

    public void setMaterias(LinkedList<Materia> materias) {
        this.materias = materias;
    }

    public LinkedList<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public void eliminarMateria(String nombreMateria){
        for(Materia materia: materias){
            if(materia.getNombre().equals(nombreMateria)){
                materias.remove(materia);
            }
        }
    }

    public void encontrarMateria(String nombreMateria){
        Scanner leer = new Scanner(System.in);
        char opcion;

        for(Materia materia: materias){
            if(materia.getNombre().equals(nombreMateria)){
                System.out.println("La materia se encuentra en la carrera");
                System.out.println("¿Desea eliminarla? 's' para eliminar, 'n' para mantener");
                try{
                    opcion = leer.next().charAt(0);
                    while (opcion != 's' && opcion != 'n'){
                        leer.nextLine();
                        System.out.println("Opcion invalida, intente nuevamente");
                        System.out.println("¿Desea eliminarla? 's' para eliminar, 'n' para mantener");
                        try{
                            opcion = leer.next().charAt(0);
                        }catch (InputMismatchException e){
                            e.printStackTrace();
                            System.out.println("ERROR en el ingreso de datos");
                        }
                    }

                    if(opcion == 's'){
                        getMaterias().remove(materia);
                    }
                }catch (InputMismatchException e){
                    e.printStackTrace();
                    System.out.println("ERROR en el ingreso de datos");
                }
            }
        }
    }

    @Override
    public String toString(){
        return "Nombre de la carrera: " + nombre + '\n' + "Materias: " + '\n' + materias;
    }

    @Override
    public int verCantidad() {
        return materias.size();
    }

    @Override
    public String listarContenidos() {
        return null;
    }
}
