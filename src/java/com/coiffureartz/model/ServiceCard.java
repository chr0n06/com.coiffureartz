/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coiffureartz.model;

import java.awt.Image;

/**
 *
 * @author Maxime
 */
public class ServiceCard {

    private int ID;
    private String title;
    private String subTitle;
    private String description;
    private String imagePath;

    public ServiceCard(int ID, String title, String subtitle, String description, String Path) {
        this.ID = ID;
        this.title = title;
        this.subTitle = subtitle;
        this.description = description;
        this.imagePath = Path;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
