/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Jesus Garcia
 */
public class BajoElRadar {
    
    public String multaVelocidad(int distanciaUno, int distanciaDos, int tiempo)  
    {
        Scanner valor = new Scanner(System.in);
        int espacio = distanciaUno - distanciaDos;
        int velocidad = espacio / tiempo;
        int gradoAlcohol;
        String textoMulta;
        
        
        if (velocidad >= 1 && velocidad < 20){
            textoMulta = "llamado de atencion por baja velocidad";
        }
        else if (velocidad >= 20 && velocidad < 60){
            textoMulta = "Normal";
        }
        else if (velocidad >= 60 && velocidad < 80){
            textoMulta = "llamado de atención por alta velocidad";
        }
        else if (velocidad >= 80 && velocidad <= 120){
            String textoMulta1 = "multa tipo I";
            System.out.print("Ingrese el grado de alcoholemia del conductor: ");
            gradoAlcohol = valor.nextInt();
            String textoAlcohol = this.multaAlcoholemia(gradoAlcohol);
            textoMulta = textoMulta1 + " , " + textoAlcohol;
        }
        else{
            String textoMulta1 = "multa tipo II e inmovilización del vehículo";
            System.out.print("Ingrese el grado de alcoholemia del conductor: ");
            gradoAlcohol = valor.nextInt();
            String textoAlcohol = this.multaAlcoholemia(gradoAlcohol);
            textoMulta = textoMulta1 + " , " + textoAlcohol;
        }
        return textoMulta;
    }
    
    private String multaAlcoholemia(float gradoAlcohol)       
    {
        String textoAlcoholemia;
        if(gradoAlcohol < 20)
        {
            textoAlcoholemia = "No hay sanción adicional por alcoholemia";
        }
        else if (gradoAlcohol >= 20 && gradoAlcohol <40)
        {
            textoAlcoholemia = "además de las sanciones previstas en la presente ley, se decretará la suspensión de la licencia de conducción entre seis (6) y doce (12) meses.";
        }
        else if (gradoAlcohol >= 40 && gradoAlcohol <100)
        {
            textoAlcoholemia = " adicionalmente a la sanción multa, se decretará la suspensión de la Licencia de Conducción entre uno (1) y tres (3) años.";
        }
        else if (gradoAlcohol >= 100 && gradoAlcohol <150)
        {
            textoAlcoholemia = "adicionalmente a la sanción multa, se decretará la suspensión de la Licencia de Conducción entre tres (3) y cinco (5) años, y la obligación de realizar curso de sensibilización, conocimientos y consecuencias de la alcoholemia y drogadicción en centros de rehabilitación debidamente autorizados, por un mínimo de cuarenta (40) horas.";
        }
        else
        {
            textoAlcoholemia = "adicionalmente a la sanción de la sanción de multa, se decretará la suspensión entre cinco (5) y diez (10) años de la Licencia de Conducción, y la obligación de realizar curso de sensibilización, conocimientos y consecuencias de la alcoholemia y drogadicción en centros de rehabilitación debidamente autorizados, por un mínimo de ochenta (80) horas.";
        }
        return textoAlcoholemia;
    }
}
