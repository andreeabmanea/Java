package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	var students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i)).toArray(Student[]::new);
	var schools = IntStream.rangeClosed(0, 2).mapToObj(i -> new School("H" + i)).toArray(School[]::new);

	List<Student> studentList = new ArrayList<>();
	studentList.addAll(Arrays.asList(students));
	List<Student> newSortedList = studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());

	TreeSet<School> schoolList = new TreeSet<School>();
	schoolList.addAll(Arrays.asList(schools));


	Map<Student, List<School>> studentPrefMap = new HashMap<>();
	studentPrefMap.put(students[0], Arrays.asList(schools[0],schools[1],schools[2]));
	studentPrefMap.put(students[1], Arrays.asList(schools[0],schools[1],schools[2]));
	studentPrefMap.put(students[2], Arrays.asList(schools[0],schools[1]));
	studentPrefMap.put(students[3], Arrays.asList(schools[0],schools[2]));

	System.out.println(studentPrefMap);
    }


}
