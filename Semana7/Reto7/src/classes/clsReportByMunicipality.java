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
public class clsReportByMunicipality {
    private String nameMunicipality;
    private int amountCasesMunicipality;

    public clsReportByMunicipality() {
    }
    
    
    public clsReportByMunicipality(String nameMunicipality, int amountCasesMunicipality) {
        this.nameMunicipality = nameMunicipality;
        this.amountCasesMunicipality = amountCasesMunicipality;
    }

    /**
     * @return the nameMunicipality
     */
    public String getNameMunicipality() {
        return nameMunicipality;
    }

    /**
     * @param nameMunicipality the nameMunicipality to set
     */
    public void setNameMunicipality(String nameMunicipality) {
        this.nameMunicipality = nameMunicipality;
    }

    /**
     * @return the amountCasesMunicipality
     */
    public int getAmountCasesMunicipality() {
        return amountCasesMunicipality;
    }

    /**
     * @param amountCasesMunicipality the amountCasesMunicipality to set
     */
    public void setAmountCasesMunicipality(int amountCasesMunicipality) {
        this.amountCasesMunicipality = amountCasesMunicipality;
    }
    
    
}
