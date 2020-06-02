package ru.vinylcoding;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class Particle{
    Sphere sphere;
    public void addToGroup(Group group){
        sphere = new Sphere(50);
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseMap(new Image(getClass().getResourceAsStream("particleMgnite.png")));
        sphere.setMaterial(material);
        group.getChildren().add(sphere);
    }

    public void rotate(Point3D axis, float degrees) {
        sphere.setRotationAxis(axis);
        sphere.setRotate(sphere.getRotate()+degrees);
    }
}