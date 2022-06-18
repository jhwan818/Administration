module jhwan.administration {
    requires javafx.controls;
    requires javafx.fxml;

    opens jhwan.administration.View to javafx.fxml;
    exports jhwan.administration.View;
}