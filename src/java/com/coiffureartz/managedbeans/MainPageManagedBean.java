/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coiffureartz.managedbeans;

import com.coiffureartz.DAL.Repository;
import com.coiffureartz.model.BusinessPhoneNumber;
import com.coiffureartz.model.Testimonial;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.swing.JEditorPane;
import javax.swing.text.html.HTML;
import org.apache.taglibs.standard.tag.el.xml.ParseTag;

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

    public List<Testimonial> getAllTestimonials() {
        return repository.getTestimonials();
    }

    public String showPhoneInfoManager(boolean isNotConfidential) {
        String result = "";

        if (isNotConfidential) {
            result = "<h1>Test</h1>";
            /*result = "<li>"
                    + "<a href=\"" + this.businessPhoneNumber.getPhoneNumberReference() + "\">"
                    + this.businessPhoneNumber.getPhoneNumberSymbol() + "; "
                    + this.businessPhoneNumber.getPhoneNumberText()
                    + "</a>"
                    + "</li>";
             */
        }
        return result;
    }

}
