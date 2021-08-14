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
public class clsCompany {
    private String companyName;
    private String nit;
    private String address;
    private clsEmployee employee;
    private clsClient client;

    public clsCompany(String companyName, String nit, String address, clsEmployee employee) {
        this.companyName = companyName;
        this.nit = nit;
        this.address = address;
        this.employee = employee;
    }
	
	 public void payTax(){
        System.out.println(this.companyName + " esta pagando impuestos");
    }
    
    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the employee
     */
    public clsEmployee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(clsEmployee employee) {
        this.employee = employee;
    }

    /**
     * @return the client
     */
    public clsClient getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(clsClient client) {
        this.client = client;
    }
}
