package scenechangefast;

import java.util.Random;
import javafx.animation.AnimationTimer;
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
public class SceneTwo {

    protected Pane root;
    Scene thisScene;
    protected SceneManager manager;
    private Button tekstiScreeni;

    public SceneTwo(SceneManager manager) {
        this.manager = manager;
        root = new Pane();
    }

    int counter = 0;
    int cap = 100;
    AnimationTimer animator;
    private boolean toggleAnimator;

    protected Scene getScene() {
        if (thisScene == null) {
            thisScene = new Scene(root, 400, 400);
            AnimationTimerMaker();
            tekstiScreeni = makeNewButton();
            root.getChildren().add(tekstiScreeni);
            toggleAnimator = false;

            tekstiScreeni.setLayoutX(200);
            root.getChildren().add(makeNewButton2());
        }
        return thisScene;
    }

    private void AnimationTimerMaker() {
        animator = new AnimationTimer() {
            @Override
            public void handle(long now) {
                counter++;
                if (counter >= cap) {
                    counter -= cap;
                    Random ran = new Random();
                    tekstiScreeni.setText("Moi: " + counter + " jotain cap: " + cap + " + random  to show somethings: " + ran.nextDouble());
                    System.out.println("Moi: " + counter + " jotain cap: " + cap + " + random  to show somethings: " + ran.nextDouble());
                }
            }
        };
//            animator.start();

    }

    private Button makeNewButton() {
        Button btnn = new Button();
        btnn.setText("Next");
        btnn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

            }
        });
        return btnn;
    }

    private Button makeNewButton2() {
        Button btnn = new Button();
        btnn.setText("Aloita animator");
        btnn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (!toggleAnimator) {
                    animator.start();
                    toggleAnimator = true;
                } else {
                    animator.stop();
                    toggleAnimator = false;
                }

            }
        });
        return btnn;
    }

}
