/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.*;
import models.Casos;
import java.util.LinkedList;

/**
 *
 * @author Jesus Garcia
 */

public class CasosController {
    private Casos casos;

    public CasosController() {
        this.casos = new Casos();
    }
    
     public LinkedList<clsReportByAge> listAge(){
        LinkedList<clsReportByAge> report = this.casos.ListCasesByAge();
        return report;
        
    }
    
    public LinkedList<clsReportByMunicipality> listMunicipality(){
        LinkedList<clsReportByMunicipality> report = this.casos.ListCasesByMunicipality();
        return report;
        
    }
    
    public LinkedList<clsReportByDepartment> listDepartment(){
        LinkedList<clsReportByDepartment> report = this.casos.ListCasesByDepartment();
        return report;
    }
    
    public LinkedList<clsReportByTypeInfection> listTypeInfection(){
        LinkedList<clsReportByTypeInfection> report = this.casos.ListCasesByTypeInfection();
        return report;
    }
}

