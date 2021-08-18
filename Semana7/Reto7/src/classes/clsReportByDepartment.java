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
public class clsReportByDepartment {
    private String nameDepartment;
    private int amountCasesDepartment;

    public clsReportByDepartment() {
    }

    
    public clsReportByDepartment(String nameDepartment, int amountCasesDepartment) {
        this.nameDepartment = nameDepartment;
        this.amountCasesDepartment = amountCasesDepartment;
    }
    
    /**
     * @return the nameDepartment
     */
    public String getNameDepartment() {
        return nameDepartment;
    }

    /**
     * @param nameDepartment the nameDepartment to set
     */
    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    /**
     * @return the amountCasesDepartment
     */
    public int getAmountCasesDepartment() {
        return amountCasesDepartment;
    }

    /**
     * @param amountCasesDepartment the amountCasesDepartment to set
     */
    public void setAmountCasesDepartment(int amountCasesDepartment) {
        this.amountCasesDepartment = amountCasesDepartment;
    }
}
