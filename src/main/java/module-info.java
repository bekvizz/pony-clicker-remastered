module com.bekvizz.ponyclicker {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.almasb.fxgl.all;


    opens com.bekvizz.ponyclicker to javafx.fxml;
    exports com.bekvizz.ponyclicker;
}