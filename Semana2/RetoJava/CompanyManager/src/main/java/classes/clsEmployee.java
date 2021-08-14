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
public class clsEmployee extends clsPerson{
    private int salary;
    private clsTrade trade;
    private clsAdministrative administrative;

    public clsEmployee(int salary, clsTrade trade, String name, String lastName, String identification, String e_mail) {
        super(name, lastName, identification, e_mail);
        this.salary = salary;
        this.trade = trade;
    }
	
	@Override
    public void deal(){
        System.out.println("Estoy vendiendo un servicio");
    }


    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the administrative
     */
    public clsAdministrative getAdministrative() {
        return administrative;
    }

    /**
     * @param administrative the administrative to set
     */
    public void setAdministrative(clsAdministrative administrative) {
        this.administrative = administrative;
    }

    /**
     * @return the trade
     */
    public clsTrade getTrade() {
        return trade;
    }

    /**
     * @param trade the trade to set
     */
    public void setTrade(clsTrade trade) {
        this.trade = trade;
    }
    
}
