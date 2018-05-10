package scenechangefast;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Qmppu842
 */
public class SceneTwo {

    protected StackPane root;
    Scene thisScene;
    protected SceneManager manager;

    public SceneTwo(SceneManager manager) {
        this.manager = manager;
        root = new StackPane();
    }

    protected Scene getScene() {
        if (thisScene == null) {
            thisScene = new Scene(root, 400, 400);
            Button btn = new Button();
            btn.setText("Mene Kolmanteen");
            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                    System.out.println("Olet nyt luokassa: " + this.getClass().toString());
                    manager.setScene(3);
                }
            });

            root.getChildren().add(btn);
        }
        return thisScene;
    }

}
