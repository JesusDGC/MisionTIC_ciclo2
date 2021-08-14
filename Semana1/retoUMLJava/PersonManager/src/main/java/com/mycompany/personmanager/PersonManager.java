/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personmanager;

import classes.clsPerson;

/**
 *
 * @author Jesus Garcia
 */
public class PersonManager {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        clsPerson person1 = new clsPerson();
        person1.setName("Jesus Daniel");
        person1.setLast_name("Garcia Castaño");
        person1.setAge(22);
        person1.setIdentification("1097407832");
        person1.setGender("Masculino");
        person1.setLanguage("Ingles");
        
        clsPerson person2 = new clsPerson("Antonia", "Medina Garcia", 2, "1508423", "Femenino", "Español");
        
        person1.speak();
        person2.speak();
        person1.walking();
        person2.walking();
        System.out.println (person1.getName() + " tiene " + person1.getAge() + " años");
        System.out.println (person2.getName() + " tiene " + person2.getAge() + " años");
    }
}
