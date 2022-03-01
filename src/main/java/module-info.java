module com.example.lab4_systemsdevint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab4_systemsdevint to javafx.fxml;
    exports com.example.lab4_systemsdevint;
}