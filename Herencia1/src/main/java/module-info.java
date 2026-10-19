module com.angeldz.herencia1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.angeldz.herencia1 to javafx.fxml;
    exports com.angeldz.herencia1;
}
