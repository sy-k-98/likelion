module com.likelion.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.junit.jupiter.api;


    opens com.likelion.javaproject2 to javafx.fxml;
    opens com.likelion.javaproject2.week1.day1 to javafx.fxml;
    exports com.likelion.javaproject2;
}