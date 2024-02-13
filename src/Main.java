//Creare una classe Student che accetti nel costruttore
// il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creare un ArrayList con 12 elementi
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Giovanni", 7));
        studentList.add(new Student("Marta", 7));
        studentList.add(new Student("Clara", 8));
        studentList.add(new Student("Ivan", 8));
        studentList.add(new Student("Marco", 6));
        studentList.add(new Student("Ilaria", 10));
        studentList.add(new Student("Jack", 7));
        studentList.add(new Student("Marie", 7));
        studentList.add(new Student("Jude", 8));
        studentList.add(new Student("Owen", 8));
        studentList.add(new Student("Eugenia", 7));
        studentList.add(new Student("Stefano", 8));

        //stampa dell'ArrayList in console
        System.out.println("la lista di studenti e' la seguente:");
        for (Student student : studentList) {
            System.out.println("la lista di studenti e': " + student);
        }

        //Mettere in ordine la collezione
        //ordine per la variabile nome
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //stampare la collezione ordinata per nome in console
        System.out.println("Questa di seguito e' la lista ordinata");
        for (Student student : studentList) {
            System.out.println("la lista di studenti e': " + student);
        }
    }
}