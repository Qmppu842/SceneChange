/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
