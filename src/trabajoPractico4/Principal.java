package trabajoPractico4;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        //Creo objetos de cada clase con sus atributos
        Profesor p1 = new Profesor("José", 20123456, 'a'); 
        Profesor p2 = new Profesor("Manuel",12987654,'b');
        Profesor p3 = new Profesor("Raúl",14954654,'c');  
        Profesor p4 = new Profesor("Alfonso",34564654,'d');
        
        Asignatura asignatura1 = new Asignatura("Programación", 'z', "8:00");
        Asignatura asignatura2 = new Asignatura("Laboratorio", 'x', "9:00");
        Asignatura asignatura3 = new Asignatura("Inglés", 'y', "10:00");
        Asignatura asignatura4 = new Asignatura("Estadística", 'j', "12:00");
        
        Alumno alumno1 = new Alumno("Sebastián", 10123123); 
        Alumno alumno2 = new Alumno("Alejandro", 20123123);
        Alumno alumno3 = new Alumno("Raúl", 30123123); 
        Alumno alumno4 = new Alumno("Emiliano", 301333323);
       
        Grupo g1 = new Grupo(1, 'm'); Grupo g2 = new Grupo(2, 'n'); Grupo g3 = new Grupo(3, 'p'); Grupo g4 = new Grupo(4, 'r');
       
        asignatura2.setAula('x');  //asigno un aula a la asignatura2
        asignatura3.setAula('y');    //asigno un aula a la asignatura3
        asignatura2.setImparte(p1); //asigno un profesor a la asignatura2
        asignatura3.setImparte(p1); //asigno un profesor a la asignatura3
        asignatura4.setImparte(p4); //asigno un profesor a la asignatura4
        
        //a cada grupo le asigno 1 asignatura
        asignatura1.recibe = g1; asignatura2.recibe = g2; asignatura3.recibe = g3; asignatura4.recibe = g4;
        
        //asigno 2 alumno a 3 grupos distintos
        alumno1.pertenece[0] = g1; alumno1.pertenece[1] = g2; alumno1.pertenece[2] = g3; alumno1.pertenece[3] = g4;
        alumno2.pertenece[0] = g1; alumno2.pertenece[1] = g2; alumno2.pertenece[2] = g3; alumno2.pertenece[3] = g4;
        
        //asignaturas que reciben los grupos        
        g1.recibe[0] = asignatura1; g1.recibe[1] = asignatura2; g1.recibe[2] = asignatura3; g1.recibe[3] = asignatura4;
        g2.recibe[0] = asignatura1; g2.recibe[1] = asignatura2; g2.recibe[2] = asignatura3; g2.recibe[3] = asignatura4;
        g4.recibe[0] = asignatura1; g4.recibe[1] = asignatura2; g4.recibe[2] = asignatura3; g4.recibe[3] = asignatura4;
        
        //alumnos que pertenecen al grupo 1, 2, 3 y 4
        g1.pertenece[0] = alumno1; g1.pertenece[1] = alumno2; g1.pertenece[2] = alumno3;        
        g2.pertenece[0] = alumno1; g2.pertenece[1] = alumno2; g2.pertenece[2] = alumno3;
        g3.pertenece[0] = alumno1; g3.pertenece[1] = alumno2; g3.pertenece[2] = alumno3;
        g4.pertenece[0] = alumno1; g4.pertenece[1] = alumno2; g4.pertenece[2] = alumno3;
        
        //asigno profesores a las distinas materias
        asignatura1.setImparte(p1); asignatura2.setImparte(p2); asignatura3.setImparte(p3); asignatura4.setImparte(p4);
        
        //PUNTO 1
        System.out.println("El profesor: " + p1.getNombre() + ", imparte la asignatura: "
                + "" + asignatura2.getNombre() + " en el aula: " + asignatura2.getAula()); //una manera de llamar al p1
        System.out.println("El profesor: " + p1.getNombre() + ", imparte la asignatura: " //otra manera de llamar al p1
                + "" + asignatura3.getNombre() + " en el aula: " + asignatura3.getAula());
        //PUNTO 2
        System.out.println("El profesor: " + p2.getNombre() + " imparte la clase del grupo: " + g3.getLetra() + ", que coresponde"
                + " a la asignatura: " + asignatura1.getNombre());
        //PUNTO 3
        System.out.println("La asignatura: " + asignatura1.getNombre() + ", recibe al grupo: " + asignatura1.recibe.getLetra()+ ""
                + ", cuyos alumnos son:\nNombre: " + g1.pertenece[0].getNombre() + "\nDNI: " + g1.pertenece[0].getDni() + ""
                + "\nNombre: " + g1.pertenece[1].getNombre() + "\nDNI: " + g1.pertenece[1].getDni());
        //PUNTO 4
        System.out.println("El alumno: " + alumno1.getNombre() + ", pertenece al grupo: " + alumno1.pertenece[2].getLetra());
        //PUNTO 5
        System.out.println("El alumno: " + alumno2.getNombre() + ", pertenece al grupo: " + alumno2.pertenece[0].getLetra() + ""
              + " y las asignaturas recibidas son: \n" + g1.recibe[0].getNombre() + ", " + g1.recibe[1].getNombre() +""
                      + ", " + g1.recibe[2].getNombre());
       //PUNTO 6
       int pedido;
       pedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las siguientes asignaturas\n"
               + "1- Programación"
               + "\n2- Laboratorio"
               + "\n3- Inglés \n"
               + "(INGRESE SOLO NUMEROS)"));
       
       switch (pedido){
           case (1):
               System.out.println("Programación es impartida por el profesor: " + asignatura1.getImparte().getNombre());
               break;
           case (2):
               System.out.println("Laboratorio es impartida por el profesor: " + asignatura2.getImparte().getNombre());
               break;
           case (3):
               System.out.println("Inglés es impartida por el profesor: " + asignatura3.getImparte().getNombre());
               break;
            }
       //PUNTO 7
       //los alumnos inscriptos en el grupo de la 4 asignatura
        System.out.println("El grupo de la cuarta asignatura ("+ asignatura4.getNombre()+"), impartida por el"
                + " profesor: "+asignatura4.getImparte().getNombre()+",  está formado por los siguientes alumnos: \n"
                + g4.pertenece[0].getNombre()+", " + g4.pertenece[1].getNombre()+", "+g4.pertenece[2].getNombre());
       
       
       
       
    }
}
