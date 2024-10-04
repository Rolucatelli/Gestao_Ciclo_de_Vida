module com.rolucatelli.loginmysqljavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.rolucatelli.loginmysqljavafx to javafx.fxml;
    exports com.rolucatelli.loginmysqljavafx;
    exports com.rolucatelli.loginmysqljavafx.demo;
    opens com.rolucatelli.loginmysqljavafx.demo to javafx.fxml;
}