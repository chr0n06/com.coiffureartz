/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coiffureartz.managedbeans;

import com.coiffureartz.DAL.Repository;
import com.coiffureartz.model.BrandingProduct;
import com.coiffureartz.model.BusinessPhoneNumber;
import com.coiffureartz.model.ServiceCard;
import com.coiffureartz.model.Testimonial;
import com.coiffureartz.settings.Preferences;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author Maxime
 */
@ManagedBean(name = "MainPage")
@ViewScoped
public class MainPageManagedBean {

    BusinessPhoneNumber businessPhoneNumber = new BusinessPhoneNumber();

    Repository repository = Repository.getInstance();

    /**
     * Creates a new instance of MainPageManagedBean
     */
    public MainPageManagedBean() {

    }

    public List<ServiceCard> getAllServiceCards() {
        return repository.getServiceCard();
    }

    public List<Testimonial> getAllTestimonials() {
        return repository.getTestimonials();
    }
    
    public List<BrandingProduct> getAllBrandingProducts() {
        return repository.getBrandingProducts();
    }

    /**
     * ShowPhoneInfoManager() Allows to manage if we show the phone number of
     * the business on the website.
     *
     * @return boolean
     */
    public boolean showPhoneInfoManager() {
        return Preferences.IS_SHOWING_PHONE_ON_WEBSITE;
    }

    /**
     * businessOwnerName() Allows to change the name of the business owner on the website.
     *
     * @return String
     */
    public String businessOwnerName() {
        return Preferences.NAME_OF_THE_BUSINESS_OWNER;
    }
    
     /**
     * businessOwnerEmail() Allows to change the email adress of the business owner on the website.
     *
     * @return String
     */
    public String businessOwnerEmail() {
        return Preferences.EMAIL_OF_THE_BUSINESS_OWNER;
    }
}
