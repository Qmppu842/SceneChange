package scenechangefast;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Qmppu842
 */
public class SceneOne {

    protected Pane root;
    Scene thisScene;
    protected SceneManager manager;
    private Button btn;

    public SceneOne(SceneManager manager) {
        this.manager = manager;
        root = new Pane();
    }

    protected Scene getScene() {
        if (thisScene == null) {
            thisScene = new Scene(root, 400, 400);
            btn = makeNewButton();
            Button btn2 = makeNewButton2();
            btn2.setLayoutX(200);
            
            root.getChildren().add(btn);
            root.getChildren().add(btn2);
        }
        return thisScene;
    }

    private String buttenText;

    public void setButtenText(String buttenText) {
       this.buttenText = buttenText;
       btn.setText(buttenText);
    }
    private Button makeNewButton() {
        Button btnn = new Button();
        btnn.setText("Mene tokaan");
        btnn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                System.out.println("Olet nyt luokassa: " + this.getClass().toString());
                manager.setScene(2);
            }
        });
        return btnn;
    }
    
      private Button makeNewButton2() {
        Button btnn = new Button();
        btnn.setText("Laita toinen nappi sanomaan moimmmmmm");
        btnn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                setButtenText("moimmmmmm");
            }
        });
        return btnn;
    }

}
