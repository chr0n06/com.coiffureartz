/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coiffureartz.DAL;

import com.coiffureartz.model.BrandingProduct;
import com.coiffureartz.model.ServiceCard;
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
    private List<ServiceCard> serviceCard;
    private List<BrandingProduct> brandingProducts;

    // private constructor restricted to this class itself 
    private Repository() {
        this.testimonials = new ArrayList<>();
        this.serviceCard = new ArrayList<>();
        this.brandingProducts = new ArrayList<>();
        this.populateTestimonials();
        this.populateServiceCard();
        this.populateBrandingProducts();

    }

    public static Repository getInstance() {
        if (repository == null) {
            repository = new Repository();
        }
        return repository;
    }

    private void populateTestimonials() {
        //this.testimonials.add(new Testimonial(1, "\" Cynthia est incroyable, elle fait les meilleurs mèches en ville \"", "-A. Maillot-"));
        this.testimonials.add(new Testimonial(0, "\" Le plus beau salon de coiffure résidentiel pour femme à des kilomètres à la ronde \"", "-M.Laniel-"));
        //this.testimonials.add(new Testimonial(2, "\" On en ressort toujours plus beau! \"", "-S. Philips-"));
        //this.testimonials.add(new Testimonial(3, "\" Mille merci pour mes cils! Trop sur la coche ! \"", "-M. Shanna-"));
        System.out.println("Testimonials has been created");
    }

    private void populateServiceCard() {
        this.serviceCard.add(new ServiceCard(
                0,
                "Coiffure",
                "Coupes & Rallonges",
                "Revamper votre look avec une simple coupe stylisée ou avec une pose de rallonge à bille ou à clip",
                "./Assets/images/wall3.jpg")
        );
        this.serviceCard.add(new ServiceCard(
                1,
                "Coloration",
                "Mèches/Teinture",
                "Vaste choix de couleurs et de produits",
                "./Assets/images/coiffure.jpg")
        );
        this.serviceCard.add(new ServiceCard(
                2,
                "Pose de cils",
                "Microblading",
                "Pour un regard qui ne laissera personne indifférent !",
                "./Assets/images/ServiceCard_Microblading.jpg")
        );/*
        this.serviceCard.add(new ServiceCard(
                3,
                "Soins dentaire",
                "Blanchiement",
                "Offrez vous un sourire éclatant et souriez à la vie !",
                "./Assets/images/Blanchiment_Dentaire.jpg")
        );*/
        
        System.out.println("ServiceCards has been created");
    }

    private void populateBrandingProducts() {
        this.brandingProducts.add(new BrandingProduct(
                0,
                "./Assets/images/branding/Wella.png",
                "https://www.wella.com/")
        );
        this.brandingProducts.add(new BrandingProduct(
                1,
                "./Assets/images/branding/FaroukChi.png",
                "https://farouk.com/")
        );
        this.brandingProducts.add(new BrandingProduct(
                2,
                "./Assets/images/branding/LorealPro.png",
                "https://www.lorealprofessionnel.ca/ca-fr/")
        );
        this.brandingProducts.add(new BrandingProduct(
                3,
                "./Assets/images/branding/Misencil.png",
                "https://misencil.com/ca/fr/")
        );
        this.brandingProducts.add(new BrandingProduct(
                4,
                "./Assets/images/branding/PaulMitchell.png",
                "https://www.paulmitchell.com/")
        );

        System.out.println("BrandingProducts has been created");
    }

    public List<Testimonial> getTestimonials() {
        return testimonials;
    }

    public void setTestimonials(List<Testimonial> testimonials) {
        this.testimonials = testimonials;
    }

    public List<ServiceCard> getServiceCard() {
        return serviceCard;
    }

    public void setServiceCard(List<ServiceCard> serviceCard) {
        this.serviceCard = serviceCard;
    }

    public List<BrandingProduct> getBrandingProducts() {
        return brandingProducts;
    }

    public void setBrandingProducts(List<BrandingProduct> brandingProducts) {
        this.brandingProducts = brandingProducts;
    }

}
