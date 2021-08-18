/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Jesus Garcia
 */

import classes.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import utils.db.Models;
import models.*;
import utils.db.DB;


public class Casos extends Models{
    
    private DB db = new DB();
    
    private Integer id;
    private Date fechaReporteWeb;
    private Date fechaNotificacion;
    private Integer edad;
    private String sexo;
    private String tipoContagio;
    private String ubicacion;
    private String estado;
    private String paisImportado;
    private String recuerpado;
    private Date fechaInicioSintomas;
    private Date fechaDiagnostico;
    private Date fechaRecuperacion;
    private Date fechaMuerte;
    
    private Municipio municipio;

    public Casos() {
    }
    
    public LinkedList<clsReportByAge>ListCasesByAge(){
        LinkedList<clsReportByAge> report = new LinkedList<>();
        try (Connection conn = super.conectar()){
           String query = "SELECT edad, COUNT(edad) FROM casos GROUP BY edad ORDER BY edad";
            PreparedStatement statementcasos = conn.prepareStatement(query);
            ResultSet result = statementcasos.executeQuery();
            while (result.next()){
                clsReportByAge record = new clsReportByAge();
                int age = result.getInt(1);
                int amount = result.getInt(2);
                record.setAge(age);
                record.setAmountCasesByAge(amount);
                report.add(record);
            }
            return report;
            
        }catch(Exception e){
            System.out.println("no genera la grafica");
        }
        return report;
    }
    
    public LinkedList<clsReportByMunicipality>ListCasesByMunicipality(){
        LinkedList<clsReportByMunicipality> report = new LinkedList<>();
        try (Connection conn = super.conectar()){
           String query = "SELECT m.nombre, COUNT(c.municipio_id) FROM casos AS c INNER JOIN municipio AS m ON c.municipio_id = m.id GROUP BY m.nombre ORDER BY COUNT(c.municipio_id) DESC LIMIT 15";
            PreparedStatement statementcasos = conn.prepareStatement(query);
            ResultSet result = statementcasos.executeQuery();
            while (result.next()){
                clsReportByMunicipality record = new clsReportByMunicipality();
                String name = result.getString(1);
                int amount = result.getInt(2);
                record.setNameMunicipality(name);
                record.setAmountCasesMunicipality(amount);
                report.add(record);
            }
            return report;
            
        }catch(Exception e){
            System.out.println("no genera la grafica");
        }
        return report;
    }
    
    public LinkedList<clsReportByDepartment>ListCasesByDepartment(){
        LinkedList<clsReportByDepartment> report = new LinkedList<>();
        try (Connection conn = super.conectar()){
           String query = "SELECT d.nombre , COUNT(c.municipio_id) FROM departamento AS d, municipio AS m, casos AS c WHERE d.id =m.departamento_id AND c.municipio_id=m.id GROUP BY d.nombre ORDER BY COUNT(c.municipio_id) DESC LIMIT 15";
            PreparedStatement statementcasos = conn.prepareStatement(query);
            ResultSet result = statementcasos.executeQuery();
            while (result.next()){
                clsReportByDepartment record = new clsReportByDepartment();
                String name = result.getString(1);
                int amount = result.getInt(2);
                record.setNameDepartment(name);
                record.setAmountCasesDepartment(amount);
                report.add(record);
            }
            return report;
            
        }catch(Exception e){
            System.out.println("no genera la grafica");
        }
        return report;
    }
    
    public LinkedList<clsReportByTypeInfection>ListCasesByTypeInfection(){
        LinkedList<clsReportByTypeInfection> report = new LinkedList<>();
        try (Connection conn = super.conectar()){
           String query = "SELECT c.tipo_contagio, COUNT(c.tipo_contagio) FROM casos c GROUP BY c.tipo_contagio ORDER BY COUNT(c.tipo_contagio) DESC";
            PreparedStatement statementcasos = conn.prepareStatement(query);
            ResultSet result = statementcasos.executeQuery();
            while (result.next()){
                clsReportByTypeInfection record = new clsReportByTypeInfection();
                String typeInfection = result.getString(1);
                int amount = result.getInt(2);
                record.setTypeInfection(typeInfection);
                record.setAmountTypeInfection(amount);
                report.add(record);
            }
            return report;
            
        }catch(Exception e){
            System.out.println("no genera la grafica");
        }
        return report;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the fechaReporteWeb
     */
    public Date getFechaReporteWeb() {
        return fechaReporteWeb;
    }

    /**
     * @param fechaReporteWeb the fechaReporteWeb to set
     */
    public void setFechaReporteWeb(Date fechaReporteWeb) {
        this.fechaReporteWeb = fechaReporteWeb;
    }

    /**
     * @return the fechaNotificacion
     */
    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    /**
     * @param fechaNotificacion the fechaNotificacion to set
     */
    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the tipoContagio
     */
    public String getTipoContagio() {
        return tipoContagio;
    }

    /**
     * @param tipoContagio the tipoContagio to set
     */
    public void setTipoContagio(String tipoContagio) {
        this.tipoContagio = tipoContagio;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the paisImportado
     */
    public String getPaisImportado() {
        return paisImportado;
    }

    /**
     * @param paisImportado the paisImportado to set
     */
    public void setPaisImportado(String paisImportado) {
        this.paisImportado = paisImportado;
    }

    /**
     * @return the recuerpado
     */
    public String getRecuerpado() {
        return recuerpado;
    }

    /**
     * @param recuerpado the recuerpado to set
     */
    public void setRecuerpado(String recuerpado) {
        this.recuerpado = recuerpado;
    }

    /**
     * @return the fechaInicioSintomas
     */
    public Date getFechaInicioSintomas() {
        return fechaInicioSintomas;
    }

    /**
     * @param fechaInicioSintomas the fechaInicioSintomas to set
     */
    public void setFechaInicioSintomas(Date fechaInicioSintomas) {
        this.fechaInicioSintomas = fechaInicioSintomas;
    }

    /**
     * @return the fechaDiagnostico
     */
    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    /**
     * @param fechaDiagnostico the fechaDiagnostico to set
     */
    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    /**
     * @return the fechaRecuperacion
     */
    public Date getFechaRecuperacion() {
        return fechaRecuperacion;
    }

    /**
     * @param fechaRecuperacion the fechaRecuperacion to set
     */
    public void setFechaRecuperacion(Date fechaRecuperacion) {
        this.fechaRecuperacion = fechaRecuperacion;
    }

    /**
     * @return the fechaMuerte
     */
    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    /**
     * @param fechaMuerte the fechaMuerte to set
     */
    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    /**
     * @return the municipio
     */
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public Object find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}