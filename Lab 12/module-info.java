/*
Class: CSE 1322L
Section: WJ1
Term: Summer 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 12
*/

module com.example.lab12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab12 to javafx.fxml;
    exports com.example.lab12;
}