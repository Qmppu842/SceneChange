package scenechangefast;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Qmppu842
 */
public abstract class BaseScene {

    protected StackPane root;
    Scene thisScene;
    protected SceneManager manager;

    public BaseScene(SceneManager manager) {
        this.manager = manager;
        root = new StackPane();
    }

    protected abstract Scene getScene();

}
