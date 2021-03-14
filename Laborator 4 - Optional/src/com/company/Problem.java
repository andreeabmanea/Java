package com.company;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Problem {
    protected List<Student> studentList;
    protected TreeSet<School> schoolList;
    protected Map<Student, List<School>> studentPrefMap;
    protected Map<School, Integer> capacity;
    protected Map<School, List<Student>> schoolPrefMap;
    protected Student[] students;
    protected School[] schools;


    public Problem() {
        studentList = new ArrayList<>();
        schoolList = new TreeSet<>();
        studentPrefMap = new HashMap<>();
        capacity = new HashMap<>();
        schoolPrefMap = new HashMap<>();

    }

    public void setCapacity() {

        capacity.put(schools[0],1);
        capacity.put(schools[1],2);
        capacity.put(schools[2],2);
    }

    public void addPreferences() {

        students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i)).toArray(Student[]::new);
        studentList.addAll(Arrays.asList(students));
        schools = IntStream.rangeClosed(0, 2).mapToObj(i -> new School("H" + i)).toArray(School[]::new);
        schoolList.addAll(Arrays.asList(schools));
        studentPrefMap.put(students[0], Arrays.asList(schools[0],schools[1],schools[2]));
        studentPrefMap.put(students[1], Arrays.asList(schools[0],schools[1],schools[2]));
        studentPrefMap.put(students[2], Arrays.asList(schools[0],schools[1]));
        studentPrefMap.put(students[3], Arrays.asList(schools[0],schools[2]));

        schoolPrefMap.put(schools[0], Arrays.asList(students[3], students[0], students[1], students[2]));
        schoolPrefMap.put(schools[1], Arrays.asList(students[0], students[2], students[1]));
        schoolPrefMap.put(schools[2], Arrays.asList(students[0], students[1], students[3]));
    }

    public void printPreferences() {
        System.out.println(studentPrefMap);
    }


    public void filterStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Schools that take S" + i + " as preference:");
            int finalI = i;
            schoolList.stream().filter(sch -> schoolPrefMap.get(sch).contains(students[finalI])).forEach(System.out::println);
        }
    }

    public void filterSchools() {
        List<School> target = Arrays.asList(schools[0], schools[1]);
        List<Student> result = studentList.stream().filter(std -> studentPrefMap.get(std).containsAll(target)).collect(Collectors.toList());
        System.out.println("Students that take into consideration H0 and H1 are: " + result);
    }

}
