package com.mfitss.idletd.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.mfitss.idletd.controllers.SaveManager;

public class Main extends Game {

    private AssetManager assetManager;

    @Override
    public void create() {
        SaveManager.create();
        assetManager = new AssetManager();
        setScreen(new MenuScreen(this));
    }

    public void startGame(){
        setScreen(new LoadScreen(this, assetManager));
    }

    public void showGameScreen(){
        setScreen(new GameScreen(this, assetManager));
    }

    public void showTutorial() {
        setScreen(new TutorialScreen(this));
    }

    public void returnToMenu(){
        setScreen(new MenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        screen.dispose();
        Gdx.app.exit();
    }
}
