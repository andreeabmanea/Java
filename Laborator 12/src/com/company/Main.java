package com.company;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {

        //I tried it for com.company.Test
        System.out.println("Specify a class:");
        Scanner scanner = new Scanner(System.in);
        String inputClass = scanner.nextLine();

        File f = new File("C:\\");
        URL urls[] = new URL[1];
        urls[0]= f.toURI().toURL();
        ClassLoader cl = new URLClassLoader(urls);
        cl.loadClass(inputClass);

        Class myClass = null;
        try {
            myClass = Class.forName(inputClass);
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }

        System.out.println("Package of the class:");
        System.out.println(myClass.getPackage().getName());

        System.out.println("Methods of the class:");
        for (Method method : myClass.getMethods()) {
            System.out.println(method.getName());
        }
    }
}
