/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.*;

/**
 *
 * @author Jesus Garcia
 */
public class DistanciaCorta {
    
    public float calcularDistancia(float x1, float y1, float x2, float y2)
    {
        float distancia;
        
        distancia = (float) Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        
        return distancia;
    }
    public float distanciaTotal(float d1, float d2, float d3, float d4)
    {
        return d1 + d2 + d3 + d4;
    }
}
