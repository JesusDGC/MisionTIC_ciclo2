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
public class clsClient extends clsPerson{
    private String address;
    private String phone;

    public clsClient(String address, String phone, String name, String lastName, String identification, String e_mail) {
        super(name, lastName, identification, e_mail);
        this.address = address;
        this.phone = phone;
    }
	
	public void buyServices(){
        System.out.println("El cliente esta comprando un servicio");
    }
    
    public void buyServices(String service){
        System.out.println("El cliente esta comprando el servicio de " + service);
    }
    
    
    @Override
    public void deal(){
        System.out.println("Estoy comprando un producto");
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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
