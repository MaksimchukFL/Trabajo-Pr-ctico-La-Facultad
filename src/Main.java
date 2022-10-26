import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Facultad creada
        Facultad f1 = new Facultad("UTN");

        //Carreras creadas
        Carrera c1 = new Carrera("TUP");
        Carrera c2 = new Carrera("ISI");
        //Profesores creados
        Profesor p1 = new Profesor("Carina", "Jovanovich", 125, 55000,10);
        Profesor p2 = new Profesor("Uferer", "Facundo", 133, 75000,8);
        Profesor p3 = new Profesor("Juan", "Sanchez", 145, 59000,5);

        //Materias creadas
        Materia m1 = new Materia("Matemática", p1);
        Materia m2 = new Materia("Laboratorio de Programación", p2);
        Materia m3 = new Materia("Fisica", p3);

        //Estudiantes creados
        Estudiante e1 = new Estudiante("Guido", "Olivera", 23312);
        Estudiante e2 = new Estudiante("Matias", "Barboza", 23552);
        Estudiante e3 = new Estudiante("Jose", "Alegre", 11233);
        Estudiante e4 = new Estudiante("Castillo", "Franco", 24123);
        Estudiante e5 = new Estudiante("Alejo", "Czombos", 214122);

        //Carreras agregadas a la facultad.
        System.out.println("0--------------------------------------------------------------------");
        f1.agregarCarrera(c1);
        f1.agregarCarrera(c2);

        //Agregando materias a carreras.
        c1.agregarMateria(m1);
        c1.agregarMateria(m2);
        c2.agregarMateria(m1);
        c2.agregarMateria(m2);
        c2.agregarMateria(m3);


        //Agregando estudiantes a materias.
        m1.agregarEstudiante(e1);
        m1.agregarEstudiante(e3);
        m2.agregarEstudiante(e2);
        m3.agregarEstudiante(e4);
        m3.agregarEstudiante(e5);

        //Listando contenidos de la facultad.
        System.out.println("1----------------------------------------------------------------------");
        System.out.println(f1.listarContenidos());

        //Ver cantidad de carreras.
        System.out.println("2----------------------------------------------------------------------");
        System.out.println("Cantidad de carreras: " + f1.verCantidad());

        //Eliminando una carrera.
        System.out.println("3----------------------------------------------------------------------");
        f1.eliminarCarrera("ISI");

        //Eliminando un estudiante.
        m1.eliminarEstudiante("Jose");

        //Elimando una materia.
        c2.eliminarMateria(m2.getNombre());

        //Buscando si existe una materia.
        System.out.println("4----------------------------------------------------------------------");
        System.out.println("Ingrese el nombre de una materia a buscar en la carrera: " + c1.getNombre());
        String materiaBuscada = leer.nextLine();
        c1.encontrarMateria(materiaBuscada);

        //Buscando si existe una materia.
        System.out.println("4----------------------------------------------------------------------");
        System.out.println("Ingrese el nombre de una materia a buscar en la carrera: " + c2.getNombre());
        materiaBuscada = leer.nextLine();
        c2.encontrarMateria(materiaBuscada);

        //Modificando el titular de una materia.
        m1.modificarTitular(p2);

        //Calculando el suelo dependiendo de la antigüedad.
        System.out.println("5----------------------------------------------------------------------");
        System.out.println("Calculo del sueldo del profesor " + p2.getNombre() + " es: " + p2.calcularSueldo());

        //Viendo cantidad de carreras, materias y estudiantes asignados.
        System.out.println("6----------------------------------------------------------------------");
        System.out.println("Cantidad de carreras: " + f1.verCantidad());
        System.out.println("7----------------------------------------------------------------------");
        System.out.println("Cantidad de materias de " + c1.getNombre()+ ": " + c1.verCantidad());
        System.out.println("8----------------------------------------------------------------------");
        System.out.println("Cantidad de estudiantes de "+ m1.getNombre()+ ": " + m1.verCantidad());

        //Viendo contenidos
        System.out.println("9----------------------------------------------------------------------");
        System.out.println(f1.listarContenidos());

        //Elimando un estudiante
        System.out.println("10----------------------------------------------------------------------");
        f1.eliminarEstudiante(e2);

        //Viendo contenidos
        System.out.println("11----------------------------------------------------------------------");
        System.out.println(f1.listarContenidos());
    }
}
