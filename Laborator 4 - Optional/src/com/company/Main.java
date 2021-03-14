package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	Problem problem = new Problem();
	problem.addPreferences();
	problem.printPreferences();
	problem.setCapacity();
	problem.filterStudents();
	problem.filterSchools();
    }


}
