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
public class clsReportByAge {
    private Integer Age;
    private int amountCasesByAge;

    public clsReportByAge() {
    }
    

    public clsReportByAge(Integer Age, int amountCasesByAge) {
        this.Age = Age;
        this.amountCasesByAge = amountCasesByAge;
    }
    

    /**
     * @return the Age
     */
    public Integer getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(Integer Age) {
        this.Age = Age;
    }

    /**
     * @return the amountCasesByAge
     */
    public int getAmountCasesByAge() {
        return amountCasesByAge;
    }

    /**
     * @param amountCasesByAge the amountCasesByAge to set
     */
    public void setAmountCasesByAge(int amountCasesByAge) {
        this.amountCasesByAge = amountCasesByAge;
    }
}
