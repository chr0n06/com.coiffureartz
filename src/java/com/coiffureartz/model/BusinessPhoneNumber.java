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
public class BusinessPhoneNumber {

    private String phoneNumberText;
    private String phoneNumberSymbol;
    private String phoneNumberReference;

    public BusinessPhoneNumber() {
        this.phoneNumberText = "(514) 266-7727";
        this.phoneNumberSymbol = "&#9743";
        this.phoneNumberReference = "tel:5142667727";
    }

        public String getPhoneNumberText() {
        return phoneNumberText;
    }

    public void setPhoneNumberText(String phoneNumberText) {
        this.phoneNumberText = phoneNumberText;
    }

    public String getPhoneNumberSymbol() {
        return phoneNumberSymbol;
    }

    public void setPhoneNumberSymbol(String phoneNumberSymbol) {
        this.phoneNumberSymbol = phoneNumberSymbol;
    }

    public String getPhoneNumberReference() {
        return phoneNumberReference;
    }

    public void setPhoneNumberReference(String phoneNumberReference) {
        this.phoneNumberReference = phoneNumberReference;
    }
    
}
