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
public class clsPerson {
    private String name;
    private String last_name;
    private int age;
    private String identification;
    private String gender;
    private String language; 
    
    //Constructor
    // Ctrl + space me crea los constructores automaticamente
    public clsPerson() {
    }

    public clsPerson(String name, String last_name, int age, String identification, String gender, String language) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.identification = identification;
        this.gender = gender;
        this.language = language;
    }
    
    
    public void speak(){
        //Habla 
        String text = this.name + " esta hablando en " + this.language;
        System.out.println (text);
    }
    public void walking(){
        //
        System.out.println (this.name + " esta caminando por las calles");
    }
    //IMPORTANTE Todo esto lo hice en la pestaña refactor, en la opcion encapsuled fields
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the identification
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * @param identification the identification to set
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }
}
