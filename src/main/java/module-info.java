module com.example.manejoseventos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.manejoseventos to javafx.fxml;
    exports com.example.manejoseventos;
}