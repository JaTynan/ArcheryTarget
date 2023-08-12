module com.assessment1.archerytarget {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assessment1.archerytarget to javafx.fxml;
    exports com.assessment1.archerytarget;
}