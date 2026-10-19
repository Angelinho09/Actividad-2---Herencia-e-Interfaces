package com.angeldz.figuras;

import com.angeldz.herencia2.Circulo;
import com.angeldz.herencia2.TrianguloRect;
import com.angeldz.herencia2.Figura2D;

public class Test {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.println(f.imprimeFigura());
        
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}
