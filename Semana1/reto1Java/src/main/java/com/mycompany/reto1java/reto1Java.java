/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto1java;

import clases.EspaciosColor;
import clases.DistanciaCorta;
import clases.BajoElRadar;
import clases.CalculadoraAritmetica;
import java.util.Scanner;

/**
 *
 * @author Jesus Garcia
 */
public class reto1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        int opcion;
        
        while(true)
        {
            // TODO code application logic here
        System.out.println ("-----------*  Reto  Java  *-----------");
        System.out.println ("-----------*     Menu     *-----------");
        System.out.println ("Ingresa un numero para realizar el reto disponible");
        System.out.println ("1. Conversion de espacios de color: (1)");
        System.out.println ("2. Calcular distancia entre dos celulares: (2)");
        System.out.println ("3. Detector de velocidad: (3)");
        System.out.println ("4. Calculadora aritmetica: (4)");
        System.out.println ("5. Salir (0)");
        System.out.println ("------------------------------------------------");
        
        System.out.println("Ingrese el reto deseado: ");
        opcion = valor.nextInt();
        
        if(opcion == 1){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
            /*No hacer nada*/
            }
            //Espacios Color
            espaciosColor();
        }
        else if(opcion == 2){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
            /*No hacer nada*/
            }
            //Distancia Corta
            distanciaCorta();
        }
        else if(opcion == 3){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
            /*No hacer nada*/
            }
            //Bajo el radar
            bajoElRadar();
        }
        else if(opcion == 4){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
            /*No hacer nada*/
            }
            //CalculadoraAritmetica
            calculadoraAritmetica();
        }
        else if (opcion == 0)
            break;
        else
            System.out.println ("Ingresa correctamente la operacion deseada");
        }
        
    }
    
    
    
    
    
    
    
    public static void calculadoraAritmetica()
    {
        CalculadoraAritmetica calculadora = new CalculadoraAritmetica();
        
        Scanner valor = new Scanner(System.in);
        int numeroUno, numeroDos;
        int opcion;
        int resultado;
        
        System.out.println ("-----------* Calculadora Aritmetica *-----------");
        System.out.println ("-----------*          Menu          *-----------");
        System.out.println ("Ingresa un numero para realizar la operacion");
        System.out.println ("1. Calcular suma: (1)");
        System.out.println ("2. Calcular la resta: (2)");
        System.out.println ("3. Calcular multiplicacion: (3)");
        System.out.println ("4. Calcular la division: (4)");
        System.out.println ("------------------------------------------------");
        
        System.out.println("Ingrese La operacion deseada: ");
        opcion = valor.nextInt();
        
        //Suma
        if (opcion == 1)
        {
            System.out.println("Ingrese el primer numero: ");
            numeroUno = valor.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            numeroDos = valor.nextInt();
            resultado = calculadora.sumar_numeros(numeroUno, numeroDos);
            System.out.println ("El resultado es: \"" + resultado +"\"");
        }
        else if (opcion == 2)
        {
            System.out.println("Ingrese el primer numero: ");
            numeroUno = valor.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            numeroDos = valor.nextInt();
            resultado = calculadora.restar_numeros(numeroUno, numeroDos);
            System.out.println ("El resultado es: \"" + resultado +"\"");
        }
        else if (opcion == 3)
        {
            System.out.println("Ingrese el primer numero: ");
            numeroUno = valor.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            numeroDos = valor.nextInt();
            resultado = calculadora.multiplicar_numeros(numeroUno, numeroDos);
            System.out.println ("El resultado es: \"" + resultado +"\"");
        }
        else if (opcion == 4)
        {
            System.out.println("Ingrese el primer numero: ");
            numeroUno = valor.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            numeroDos = valor.nextInt();
            if(numeroDos == 0)
                System.out.println (" El resultado es indeterminado ");
            else{
                resultado = calculadora.dividir_numeros(numeroUno, numeroDos);
                System.out.println ("El resultado es: \"" + resultado +"\"");
            }
        } 
        else
            System.out.println ("Ingresa correctamente la operacion deseada");
    }
    
    public static void bajoElRadar()
    {
        BajoElRadar multa = new BajoElRadar();
        
        Scanner valor = new Scanner(System.in);
        int distanciaUno, distanciaDos;
        int tiempo;
        String textoMulta;
        
        System.out.println ("-----------* Empezamos el programa Bajo el Radar *-----------");

        System.out.println("Digite la distancia uno del vehiculo: ");
        distanciaUno = valor.nextInt(); //Invocamos un método sobre un objeto Scanner
        System.out.println("Digite la distancia dos del vehiculo: ");
        distanciaDos = valor.nextInt();
        System.out.println("Ingrese el tiempo en que se tardo de desplazarse entre las distancias: ");
        tiempo = valor.nextInt();
        
        textoMulta = multa.multaVelocidad(distanciaUno, distanciaDos, tiempo);
        System.out.println (textoMulta);
        
    }
    
    public static void distanciaCorta()
    {
        DistanciaCorta distancia = new DistanciaCorta();
        
        //
        Scanner valor = new Scanner(System.in);
        float xc1, yc1, xc2, yc2;
        float xa1, ya1, xa2, ya2;
        float xch, ych;
        float d1, d2, d3, d4;
        float distancia_total;
        
        System.out.println ("-----------* Empezamos el programa Distancia mas corta *-----------");

        System.out.println ("Por favor Digite la coordenada en x del celular 1:");
        xc1 = valor.nextFloat(); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Por favor Digite la coordenada en y del celular 1:");
        yc1 = valor.nextFloat();
        System.out.println ("Por favor Digite la coordenada en x de la antena 1:");
        xa1 = valor.nextFloat(); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Por favor Digite la coordenada en y de la antena 1:");
        ya1 = valor.nextFloat();
        System.out.println ("Por favor Digite la coordenada en x de la central holi:");
        xch = valor.nextFloat(); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Por favor Digite la coordenada en y de la central holi:");
        ych = valor.nextFloat();
        System.out.println ("Por favor Digite la coordenada en x de la antena 2:");
        xa2 = valor.nextFloat(); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Por favor Digite la coordenada en y de la antena 2:");
        ya2 = valor.nextFloat();
        System.out.println ("Por favor Digite la coordenada en x del celular 2:");
        xc2 = valor.nextFloat(); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Por favor Digite la coordenada en y del celular 2:");
        yc2 = valor.nextFloat();
        
        d1 = distancia.calcularDistancia(xc1, yc1, xa1, ya1);
        d2 = distancia.calcularDistancia(xa1, ya1, xch, ych);
        d3 = distancia.calcularDistancia(xch, ych, xa1, ya2);
        d4 = distancia.calcularDistancia(xa2, ya2, xc2, yc2);
        
        distancia_total = distancia.distanciaTotal(d1, d2, d3, d4);
        System.out.println ("La distancia total entre el celular 1 y el celular 2 es: \"" + distancia_total +"\"");
               
    }
    
    public static void espaciosColor()
    {
        EspaciosColor conversion = new EspaciosColor();
        
        //
        Scanner valor = new Scanner(System.in);
        float R, V, A;
        float Y, I, Q;
        float y, Cb, Cr;
        
        System.out.println ("Empezamos el programa Conversion de espacios de color");

        System.out.println ("Por favor digite el valor de R:");
        R = valor.nextFloat(); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Por favor digite el valor de V:");
        V = valor.nextFloat();
        System.out.println ("Por favor digite el valor de A:");
        A = valor.nextFloat();
        float[] rvaArray = new float[]{ R, V, A };
        System.out.println ("Por favor digite el valor de Y:");
        Y = valor.nextFloat();
        System.out.println ("Por favor digite el valor de I:");
        I = valor.nextFloat();
        System.out.println ("Por favor digite el valor de Q:");
        Q = valor.nextFloat();
        float[] yiqArray = new float[]{ Y, I, Q };
        System.out.println ("Por favor digite el valor de Y del espacio de color YCbCr:");
        y = valor.nextFloat();
        System.out.println ("Por favor digite el valor de Cb:");
        Cb = valor.nextFloat();
        System.out.println ("Por favor digite el valor de Cr:");
        Cr = valor.nextFloat();
        float[] yCbCrArray = new float[]{ y, Cb, Cr };

        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        float RVA[] = conversion.convertirYIQaRVA(yiqArray);
        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        float YCbCR[] = conversion.convertirYIQaYCbCr(yiqArray);
        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        float YIQ[] = conversion.convertirRVAaYIQ(rvaArray);
        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        float YCbCr2[] = conversion.convertirRVAaYCbCr(rvaArray);
        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        float RVA2[] = conversion.convertirYCbCraRVA(yCbCrArray);
        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
        float YIQ2[] = conversion.convertirYCbCraYIQ(yCbCrArray);
        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        
    }
}
