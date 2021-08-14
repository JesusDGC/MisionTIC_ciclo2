/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.companymanager;

import classes.*;

/**
 *
 * @author Jesus Garcia
 */
public class CompanyManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		
		
        //instancia de los oficios
        clsTrade trade1 = new clsTrade("Enfermer@", "Emplead@");
        clsTrade trade2 = new clsTrade("Enfermer@", "Jefa");
        
        //Instania de los empleados
        clsEmployee employee = new clsEmployee(1000,trade1,"Eda","Yildiz","123456","edayildiz@gmail.com");
        clsEmployee employee2 = new clsEmployee(1200,trade2,"Estefania","Quintero","156896","tefa@gmail.com");
        
        //Instancia de la compañia
        clsCompany hospital = new clsCompany("Hospital la Misericordia", "10278416", "El poblado", employee);
        
        //Instancia de un administrativo
        clsAdministrative administrative = new clsAdministrative("Jefe de enfermeria", 5);
        
        //Instancia de un cliente
        clsClient client = new clsClient("Av colon", "3108881420", "Andres", "Castaño", "8496281", "pipe@gmail.com");
        
        //Verificando los métodos
        hospital.payTax();
        
        administrative.management(employee2);
        
		employee.deal();
       
		client.buyServices();
		client.buyServices("Atención medica");
       
		client.deal();
        
    }
    
}
