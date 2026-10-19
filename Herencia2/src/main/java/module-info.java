module com.angeldz.herencia2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.angeldz.herencia2 to javafx.fxml;
    exports com.angeldz.herencia2;
}
