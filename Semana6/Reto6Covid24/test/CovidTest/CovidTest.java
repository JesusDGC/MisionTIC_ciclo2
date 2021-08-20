/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CovidTest;

import controller.*;
import models.*;
import utils.db.DBConf;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert;

/**
 *
 * @author Jesus Garcia
 */
public class CovidTest {
    
    
    DepartamentoController Departamento = new DepartamentoController();
  
    public CovidTest() {
    }
    
     @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        DBConf.testMode = true;
        new GeneralModel().startPruebas();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     //@Test
     //public void hello() {}
     
    //C
    @Test
     public void createDepartmentTest() throws Exception{
         List<Departamento> deptlist = Departamento.getDepartamentoList();
         int cantdepartamento = deptlist.size();
         Departamento.saveDepartamento(null, "Viejo Caldas", "100");
         List<Departamento> deptlist1 = Departamento.getDepartamentoList();
         //Si la cantidad de departamentos inicial es diferente a la cantidad de departamentos  
         // final es que se creo uno nuevo
         assertNotEquals(cantdepartamento,deptlist1.size());
     }

    //R
     @Test
     public void readDepartmentTest(){
         Departamento departamento = new Departamento();
         departamento.find(19);
         //Si el departamento con el id 19 es Quindio es que paso
         assertEquals(departamento.getNombre(), "Quindio");
         
     }
     
     //U
     
     @Test
     public void editarDepartamentoTest() throws Exception{
       List<Departamento> DepList = Departamento.getDepartamentoList();
       String deptnombre = DepList.get(10).getNombre();
       
       Departamento.saveDepartamento(11,"Quindos", "63");
       List<Departamento> DepList1 = Departamento.getDepartamentoList();
       String deptnuevo = DepList1.get(10).getNombre();
       
       //Si en el id 11 Que correspondia a Quindio tiene el nombre de Quindos es que la prueba Paso
       assertNotEquals(deptnombre,deptnuevo);
     }
     
     //D
     @Test
     public void deleteDepartmentTest(){
         //Risaralda
         Departamento departamento = (Departamento) new Departamento().find(20);
         
         try{
             departamento.delete();
         }
         catch(Exception e){
             e.printStackTrace();
         }
         
     }
     @Test
     public void deleteMunicipioTest(){
         Municipio municipio = (Municipio) new Municipio().find(16);
         
         municipio.delete();
         Municipio municipioValidacion = (Municipio) new Municipio().find(16);
         if (municipioValidacion !=null){
             assertTrue(false);
         }
         
     }
    
}
