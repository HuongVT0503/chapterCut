module com.example.chaptercut {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.apache.poi.ooxml; // Add this line
    requires org.apache.poi.poi; // Sometimes needed for POI dependencies

    requires org.controlsfx.controls;

    opens com.example.chaptercut to javafx.fxml;
    exports com.example.chaptercut;
}