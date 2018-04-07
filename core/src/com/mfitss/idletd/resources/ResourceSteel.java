package com.mfitss.idletd.resources;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class ResourceSteel extends GameResource {

    private static ResourceSteel resource;

    private ResourceSteel() {
        resource = new ResourceSteel();
        name = "Steel";
        icon = new Sprite(new Texture("")); // TODO: 29.03.2018 add icon
    }

    public static ResourceSteel getResource() {
        return resource;
    }
}