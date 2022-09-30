public class Main {

    public static void main(String[] args) {

        Facultad f1 = new Facultad("UTN");
//        Facultad f2 = new Facultad("UNNE");

        Carrera c1 = new Carrera("TUP");
        Carrera c2 = new Carrera("ISI");

        Profesor p1 = new Profesor("Carina", "Jovanovich", 125, 55000,10);
        Profesor p2 = new Profesor("Uferer", "Facundo", 133, 75000,8);

        Materia m1 = new Materia("Matemática", p1);
        Materia m2 = new Materia("Laboratorio de Programación", p2);

        Estudiante e1 = new Estudiante("Guido", "Olivera", 23312);
        Estudiante e2 = new Estudiante("Matias", "Barboza", 23552);
        Estudiante e3 = new Estudiante("Jose", "Alegre", 11233);

        m1.agregarEstudiante(e1);
        m2.agregarEstudiante(e2);
        m1.agregarEstudiante(e3);

        c1.agregarMateria(m1);
        c1.agregarMateria(m2);
        c2.agregarMateria(m1);
        c2.agregarMateria(m2);

        f1.agregarCarrera(c1);

        System.out.println(f1.listarContenidos());
        System.out.println(f1.verCantidad());

        f1.eliminarCarrera(c2);
        m1.eliminarEstudiante(e3.getLegajo());

        c2.eliminarMateria(m2.getNombre());
        c1.encontrarMateria("Matematica");

        m1.modificarTitular(p2);
        p2.calcularSueldo();

        System.out.println(f1.verCantidad());
        System.out.println(c1.verCantidad());
        System.out.println(m1.verCantidad());

        System.out.println(f1.listarContenidos());
    }
}
