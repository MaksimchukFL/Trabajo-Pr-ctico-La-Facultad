import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;

    public Persona(String nombre,String apellido,int legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void modificarDatos(){
        Scanner leer = new Scanner(System.in);
        int opcion,legajo;
        String nombre,apellido;

        System.out.println("¿Que desea modificar?");
        System.out.println("1. Nombre \n2.Apellido \n3.Legajo");
        try{
            opcion = leer.nextInt();
            leer.nextLine();
            if(opcion == 1){
                System.out.println("Ingrese el nombre para modificar: ");
                try{
                    nombre = leer.nextLine();
                    setNombre(nombre);
                    System.out.println("Cambio hecho");
                    System.out.println(getApellido() + ", " + getNombre());
                }catch (InputMismatchException e){
                    e.printStackTrace();
                    System.out.println("ERROR en el ingreso de datos");
                    System.out.println("Cambios descartados");
                }

            }else if(opcion == 2){
                System.out.println("Ingrese el apellido para modificar: ");
                try{
                    apellido = leer.nextLine();
                    setApellido(apellido);
                    System.out.println("Cambio hecho");
                    System.out.println(getApellido() + ", " + getNombre());
                }catch (InputMismatchException e){
                    e.printStackTrace();
                    System.out.println("ERROR en el ingreso de datos");
                    System.out.println("Cambios descartados");
                }
            }else if(opcion == 3){
                System.out.println("Ingrese el legajo para modificar: ");
                try{
                    legajo = leer.nextInt();
                    setLegajo(legajo);
                    System.out.println("Cambio hecho");
                    System.out.println(getLegajo());
                }catch (InputMismatchException e){
                    e.printStackTrace();
                    System.out.println("ERROR en el ingreso de datos");
                    System.out.println("Cambios descartados");
                }

            }else{
                System.out.println("Opcion invalida");
            }
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("ERROR en el ingreso de datos");
        }
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Legajo: " + legajo;
    }
}
