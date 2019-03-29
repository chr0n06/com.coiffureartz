/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coiffureartz.DAL;

import com.coiffureartz.model.Testimonial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxime
 */
public class Repository {

    private static Repository repository = null;

    private List<Testimonial> testimonials;

    // private constructor restricted to this class itself 
    private Repository() {
        this.testimonials = new ArrayList<>();
        this.populateTestimonials();
    }

    public static Repository getInstance() {
        if (repository == null) {
            repository = new Repository();
        }
        return repository;
    }
    
    private void populateTestimonials(){
        this.testimonials.add(new Testimonial(0, "\" Cynthia est incroyable, elle fait les meilleurs mèches en ville \"", "-A. Maillot-"));
        this.testimonials.add(new Testimonial(1, "\" Le plus beau salon de coiffure résidentiel pour femme à des kilomètres à la ronde \"", "-M.Laniel-"));
        this.testimonials.add(new Testimonial(2, "\" On en ressort toujours plus beau! \"", "-S. Philips-")); 
        this.testimonials.add(new Testimonial(3, "\" Mille merci pour mes cils! Trop sur la coche ! \"", "-M. Shanna-")); 
        System.out.println("Testimonials has been created");
    }

    public List<Testimonial> getTestimonials() {
        return testimonials;
    }

    public void setTestimonials(List<Testimonial> testimonials) {
        this.testimonials = testimonials;
    }
    
    
}
