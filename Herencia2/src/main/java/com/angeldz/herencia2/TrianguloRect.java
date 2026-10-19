package com.angeldz.herencia2;
import com.angeldz.figuras.FiguraRecta;
import java.util.Locale;

public class TrianguloRect extends FiguraRecta {
    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    @Override
    public double calcularArea() {
        return (this.ancho * this.alto) / 2.0;
    }
    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(this.ancho, 2) + Math.pow(this.alto, 2));
        return this.ancho + this.alto + hipotenusa;
    }
    @Override
    public String imprimeFigura() {
        String detalle = String.format(Locale.US, 
            "Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f\n", 
            this.alto, this.ancho, calcularArea(), calcularPerimetro());
        return super.imprimeFigura() + detalle;
    }
}