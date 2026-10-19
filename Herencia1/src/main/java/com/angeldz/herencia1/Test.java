package com.angeldz.herencia1;

public class Test {
    public static void main(String[] args) {
        Alumno a = new Alumno();
        Profesor p = new Profesor(10000);
        System.out.println(a);
        System.out.println(p);
    }
}