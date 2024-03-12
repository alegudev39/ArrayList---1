//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creare un ArrayList con n elementi e stamparlo in console.

        Student student1 = new Student("Gigi", 24);
        Student student2 = new Student("Luigi", 27);
        Student student3 = new Student("Maria", 28);

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        System.out.println("listStudents" + listStudents);

        //Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

        listStudents.add(new Student("Calogero", 21));
        listStudents.add(new Student("Lisa", 24));
        listStudents.add(new Student("Luisa", 21));
        listStudents.add(new Student("Mario", 23));

        System.out.println("listStudents aggiornata" + listStudents);
    }
}