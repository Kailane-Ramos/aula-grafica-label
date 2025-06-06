package myproject.aula_interface_graf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

public class Formulario01 extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(400, 300);
        
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
