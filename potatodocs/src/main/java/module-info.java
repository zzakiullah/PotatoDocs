module com.potatorg {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.potatorg to javafx.fxml;
    exports com.potatorg;
}
