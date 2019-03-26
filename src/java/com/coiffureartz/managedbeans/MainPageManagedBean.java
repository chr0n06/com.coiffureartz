/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coiffureartz.managedbeans;

import com.coiffureartz.model.BusinessPhoneNumber;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Maxime
 */
@ManagedBean(name = "MainPage")
@ViewScoped
public class MainPageManagedBean {

    BusinessPhoneNumber businessPhoneNumber = new BusinessPhoneNumber();

    /**
     * Creates a new instance of MainPageManagedBean
     */
    public MainPageManagedBean() {

    }

    public String showPhoneInfoManager(boolean isNotConfidential) {
        String result = "";

        if (isNotConfidential) {
            result = "<li>"
                    + "<a href=\""+this.businessPhoneNumber.getPhoneNumberReference()+"\">" 
                    + this.businessPhoneNumber.getPhoneNumberSymbol() + "; "
                    + this.businessPhoneNumber.getPhoneNumberText() 
                    + "</a>"
                    + "</li>";
        } else {
            return result;
        }
        return result;
    }

}
