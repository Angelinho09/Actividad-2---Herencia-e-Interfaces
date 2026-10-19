package com.angeldz.herencia2;
import com.angeldz.figuras.FiguraCircular;
import java.util.Locale;

public class Circulo extends FiguraCircular {
    public Circulo(int radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }
    @Override
    public String imprimeFigura() {
        String detalle = String.format(Locale.US, 
            "Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f\n", 
            this.radio, calcularArea(), calcularPerimetro());
        return super.imprimeFigura() + detalle;
    }
}