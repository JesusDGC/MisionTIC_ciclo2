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
public class clsAdministrative {
    private String category;
    private int subordinates;

    public clsAdministrative(String category, int subordinates) {
        this.category = category;
        this.subordinates = subordinates;
    }
    
    public void management(clsEmployee employee){
        System.out.println("El/La emplead@ " + employee.getName() + "esta subordinando a " + this.subordinates + "empleados" );
    }
    
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the subordinates
     */
    public int getSubordinates() {
        return subordinates;
    }

    /**
     * @param subordinates the subordinates to set
     */
    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }
}
