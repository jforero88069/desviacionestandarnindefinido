
/**
 * Write a description of class desviacionest here.
 * Este programa permite hallar la desviación estandar
 * @autores ean grupo de trabajo Vivian Nathaly Venegas; Jhon Tellez; Juan Forero
 * @version 18082018
 */
 

import java.util.*;
import java.lang.Math.*;
/** import java.util.* permite cargar varios directorios ademas del de escanear
 * 
 * 
 */
public class datos 
{
    static double numero;
    static double media;
    static double varianza;
    static double desviacion;
    static int poblacion;
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("cuantos datos tenemos en la poblacion muestra o universo");
        poblacion = teclado.nextInt();
        
        double numeros[]=new double[poblacion];
        
        for(int i=0;i<poblacion;i++)
        {
            System.out.println("ingrese los datos");
            numeros[i]=teclado.nextDouble();
      
        }
        double suma=0;
        for(double i: numeros)
        {
            suma=suma+i;
        }
        media=suma/poblacion;
        
        double sumatoria;
        for(int i=0;i<poblacion;i++){       
            sumatoria=Math.pow( numeros[i]-media,2);
            varianza=varianza+sumatoria;
        }
        
        varianza=varianza/poblacion;
        
        desviacion=Math.sqrt(varianza);
        double redondeo=Math.rint(desviacion*100)/100;
        System.out.println("LA desviación estadar es:"+redondeo);

    
    }
}

/**Fuentes:
 * 
 * Programar en JAva para calcular la Media y la Desviación Estándar; 2015; FRamebits, Recuperado de https://www.youtube.com/watch?v=3AO3oQIz76Q
 * Calcular la media y la desviación estadar java; 2017 Gabo Rom Recuperado de https://www.youtube.com/watch?v=GE8nResdqkc&vl=es-419
 * 
 * /
 */

