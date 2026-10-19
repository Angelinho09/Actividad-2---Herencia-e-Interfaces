package com.angeldz.herencia2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextArea txtConsola;

    @FXML
    private void ejecutarAccion(ActionEvent event) {
        
        txtConsola.clear();
        
        
        Figura2D f = new TrianguloRect(3, 4);
        txtConsola.appendText(f.imprimeFigura());
        
        f = new Circulo(3);
        txtConsola.appendText(f.imprimeFigura());
    }
}