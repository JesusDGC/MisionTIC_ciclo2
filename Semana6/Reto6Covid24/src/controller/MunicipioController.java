/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import models.Departamento;
import models.GeneralModel;
import models.Municipio;

/**
 *
 * @author Jesus Garcia
 */
public class MunicipioController {
    
    public ArrayList<Municipio> getMunicipioList(){
        ArrayList<Municipio> munList;
        
        munList = new GeneralModel().getMunicipioList();
        
        return munList;
    }
    
    
    public void saveMunicipio(Integer id, Integer departamento_id,String name, Integer code) throws Exception{
        int codigo = 0;
        String departamento = null;
        Municipio new_mun = null;
        new_mun.setNombre(name);
        new_mun.setDepartamento(departamento);
        new_mun.setCodigo(codigo);
        
        
    }
    
}
