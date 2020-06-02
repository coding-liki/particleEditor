module particleEditor {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.vinylcoding to javafx.fxml;
    exports ru.vinylcoding;
}