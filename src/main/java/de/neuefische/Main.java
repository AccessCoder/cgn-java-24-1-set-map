package de.neuefische;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //Set -> Nur Einzelstücke abspeichert also keine Duplikate

        Set<Student> students = new HashSet<>(); //LinkedHashSet

        Student student1 = new Student("Chrissy", 1);
        Student student2 = new Student("Paul", 2);
        Student student3 = new Student("Carsten", 3);
        Student student4 = new Student("Barbara", 4);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        for (Student s:students) {
            System.out.println(s.getName());
        }

        //Map -> Wörterbuch -> Key, Value Prinzip

        Map<Integer,Student> bootcamp = new HashMap<>();

        bootcamp.put(student1.getId(), student1);
        bootcamp.put(student2.getId(), student2);
        bootcamp.put(student3.getId(), student3);
        bootcamp.put(student4.getId(), student4);

        System.out.println(bootcamp.get(2));
        bootcamp.remove(3);

        System.out.println(bootcamp.size());
        System.out.println(bootcamp.values());

        if (bootcamp.containsKey(3)) {
            String name = bootcamp.get(3).getName();
        }


    }

}