package scenechangefast;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 *
 * @author Qmppu842
 */
public class ScenePi extends BaseScene{


    public ScenePi(SceneManager manager) {
        super(manager);
    }

    @Override
    protected Scene getScene() {
        if (thisScene == null) {
            thisScene = new Scene(root, 400, 400);
            Button btn = new Button();
            btn.setText("Loop it! \n Tämä on luokka joka perii BaseScenen");
            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Olet nyt luokassa: " + this.getClass().toString());
                    manager.setScene(1);
                }
            });

            root.getChildren().add(btn);
        }
        return thisScene;
    }

}
