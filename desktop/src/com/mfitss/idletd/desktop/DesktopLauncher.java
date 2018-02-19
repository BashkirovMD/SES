package com.mfitss.idletd.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mfitss.idletd.Main;

public class DesktopLauncher {
    public static void main(String[] arg) {
        System.setProperty("user.name", "Public");
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.height = 450;
        config.width = 800;
        new LwjglApplication(new Main(), config);
    }
}
