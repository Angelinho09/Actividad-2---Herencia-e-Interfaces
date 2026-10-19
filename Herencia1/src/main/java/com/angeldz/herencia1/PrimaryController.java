package com.angeldz.herencia1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextArea txtConsola;

    @FXML
    private void ejecutarAccion(ActionEvent event) {
               txtConsola.clear();
                
        Alumno a = new Alumno();
        Profesor p = new Profesor(10008000);
        
        
        txtConsola.appendText(a.toString() );
        txtConsola.appendText(p.toString() );
    }
}