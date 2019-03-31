/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coiffureartz.model;

/**
 *
 * @author Maxime
 */
public class BrandingProduct {
    private int ID;
    private String imagePath;
    private String URI;

    public BrandingProduct(int ID, String imagePath, String URI) {
        this.ID = ID;
        this.imagePath = imagePath;
        this.URI = URI;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }    
}
