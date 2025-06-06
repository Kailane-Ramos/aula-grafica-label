package myproject.aula_interface_graf;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(400, 300);
        
        TextField txNome = new TextField();
        txNome.setText("Teste");
        String nome = txNome.getText();
        txNome.setPromptText("Adicione o seu nome");
        pane.getChildren().add(txNome);
        
        PasswordField txSenha = new PasswordField();
        txSenha.setPromptText("Adicione sua senha");
        pane.getChildren().add(txSenha);
        
        Button btEntrar = new Button("Entrar");
        pane.getChildren().add(btEntrar);
        
        Image iconlike = new Image("https://e1.pngegg.com/pngimages/26/201/png-clipart-pucca-girl-cartoon-character.png");
        Label foto = new Label("Nome", new ImageView(iconlike));
        foto.setScaleX(0.1);
        foto.setScaleY(0.1);
        
        
        pane.getChildren().add(foto);
        
        Label label = new Label("Login");
        label.setFont(new Font("Arial",30));
        label.setPrefWidth(100);
        label.setWrapText(true);
        pane.getChildren().add(label);
        
        
        btEntrar.setOnAction((ActionEvent e) -> {
            txNome.setText("Usuario!");
        });    
        btEntrar.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Ok");
            }
        });
        
        
        Scene scene = new Scene(pane);
        stage.setTitle("Formulario 01");
        stage.setScene(scene);
        stage.show();
        
        btEntrar.setLayoutX( (pane.getWidth() - btEntrar.getWidth()) / 2);
        btEntrar.setLayoutY(130);
        
        txNome.setLayoutX( (pane.getWidth() - txNome.getWidth()) / 2);
        txNome.setLayoutY(50);
        
        txSenha.setLayoutX( (pane.getWidth() - txSenha.getWidth()) / 2);
        txSenha.setLayoutY(100);
        
        label.setLayoutX( (pane.getWidth() - label.getWidth()) /2);
        label.setLayoutY(15);
      
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}