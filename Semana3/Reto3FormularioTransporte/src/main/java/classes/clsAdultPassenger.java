/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Jesus Garcia
 */
public class clsAdultPassenger extends clsPassenger {
    private String contact;
    private String e_mail;

    public clsAdultPassenger(String contact, String e_mail, String name, String lastName, String documentType, String documentNumber, String gender) {
        super(name, lastName, documentType, documentNumber, gender);
        this.contact = contact;
        this.e_mail = e_mail;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the e_mail
     */
    public String getE_mail() {
        return e_mail;
    }

    /**
     * @param e_mail the e_mail to set
     */
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
    
}
