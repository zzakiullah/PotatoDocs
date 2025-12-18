module com.potatorg {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens com.potatorg to javafx.fxml;
    exports com.potatorg;
}
