module garbi.dev.ollama {
    requires javafx.controls;
    requires javafx.fxml;


    opens garbi.dev.ollama to javafx.fxml;
    exports garbi.dev.ollama;
}