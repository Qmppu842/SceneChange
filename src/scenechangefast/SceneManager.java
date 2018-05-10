package scenechangefast;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Qmppu842
 */
public class SceneManager {

    private Stage primeStage;
    private SceneOne sceneOne;
    private SceneTwo sceneTwo;
    private ScenePi scenePi;

    public SceneManager(Stage primeStage) {
        this.primeStage = primeStage;
        sceneOne = new SceneOne(this);
        sceneTwo = new SceneTwo(this);
        scenePi = new ScenePi(this);
    }

    public void setScene(int sceneId) {
        Scene toBeScene;
        switch (sceneId) {
            default:
            case 1:
                toBeScene = sceneOne.getScene();
                break;
            case 2:
                toBeScene = sceneTwo.getScene();
                
                break;
            case 3:
                toBeScene = scenePi.getScene();
                
                primeStage.setTitle("Koirala");
                break;

        }
        primeStage.setScene(toBeScene);
        primeStage.show();
    }

    public void startUp() {
        setScene(1);
        primeStage.show();
    }
}
