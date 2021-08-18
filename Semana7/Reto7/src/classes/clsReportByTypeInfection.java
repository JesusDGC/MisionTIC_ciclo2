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
public class clsReportByTypeInfection {
    private String typeInfection;
    private int amountTypeInfection;

    public clsReportByTypeInfection() {
    }
    
    
    public clsReportByTypeInfection(String typeInfection, int amountTypeInfection) {
        this.typeInfection = typeInfection;
        this.amountTypeInfection = amountTypeInfection;
    }

    /**
     * @return the typeInfection
     */
    public String getTypeInfection() {
        return typeInfection;
    }

    /**
     * @param typeInfection the typeInfection to set
     */
    public void setTypeInfection(String typeInfection) {
        this.typeInfection = typeInfection;
    }

    /**
     * @return the amountTypeInfection
     */
    public int getAmountTypeInfection() {
        return amountTypeInfection;
    }

    /**
     * @param amountTypeInfection the amountTypeInfection to set
     */
    public void setAmountTypeInfection(int amountTypeInfection) {
        this.amountTypeInfection = amountTypeInfection;
    }
    
    
}
