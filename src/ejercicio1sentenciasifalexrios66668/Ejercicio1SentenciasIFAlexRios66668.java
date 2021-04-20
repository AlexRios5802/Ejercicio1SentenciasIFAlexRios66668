/*
 * Alex Omar Rios Perez
 * Universidad Autonoma de Campeche
 * Facultad de Ingenieria
* Ingenieria en Sistemas Computacionales
 */
package ejercicio1sentenciasifalexrios66668;

import java.util.Scanner;

public class Ejercicio1SentenciasIFAlexRios66668 {

    public static void main(String[] args) {
        System.out.println("Actividad 1.1 // Leer dos valores y determinar cual de las dos es mayor");
        int valor1  = 0;
        int valor2 =0;
        
        System.out.println("Ingresa tu primer valor: ");
        Scanner teclado = new Scanner(System.in);
        valor1 = teclado.nextInt( );
        
        System.out.println("Ingresa tu segundo valor: ");
        Scanner teclado2 = new Scanner(System.in);
        valor2 = teclado2.nextInt( );
        
        if (valor1 > valor2) {
            System.out.println(valor1 + " es mayor que " + valor2);
        }else {
            if (valor2 > valor1) {
                System.out.println(valor2 + " es mayor que " + valor1);
            }else{
                System.out.println("Tus valores son iguales, por lo tanto; no te puedo decir cual es el mayor");
            }
        }
        
        System.out.println("Actividad 1.2 // Leer dos valores y determinar cual es el mayor y el menor");
        int valor3 = 0;
        int valor4 = 0;
        
        System.out.println("Ingresa tu primer valor: ");
        Scanner teclado3 = new Scanner(System.in);
        valor3 = teclado3.nextInt( );
        
        System.out.println("Ingresa tu segundo valor");
        Scanner teclado4 = new Scanner(System.in);
        valor4 = teclado4.nextInt( );
        
        if (valor3 > valor4) {
            System.out.println(valor3 + " es el valor mayor ");
            System.out.println(valor4 + " es el valor menor");
        }else{
            if (valor4 > valor3) {
                System.out.println(valor4 + " es el valor mayor");
                System.out.println(valor3 + " es el valor menor");
            }else{
                System.out.println("Tus valores son iguales, por lo tanto; no te puedo decir cual es el mayor y el menor");
            }
        }
        
        System.out.println("Actividad 1.3 // Leer dos valores y determinar cual es el mayor, el menor o si son iguales");
        int valor5 = 0;
        int valor6 = 0;
        
        System.out.println("Ingresa tu primer valor: ");
        Scanner teclado5 = new Scanner (System.in);
        valor5 = teclado5.nextInt( );
        
        System.out.println("Ingresa tu segundo valor: ");
        Scanner teclado6 = new Scanner (System.in);
        valor6 = teclado6.nextInt( );
        
        if (valor5 > valor6) {
            System.out.println(valor5 + " es el valor mayor");
            System.out.println(valor6 + " es el valor menor");
        }else{
            if (valor6 > valor5) {
                System.out.println(valor6 + " es el valor mayor");
                System.out.println(valor5 + " es el valor menor");
            }else{
                System.out.println("Tus valores son iguales");
            }
        }
        
        System.out.println("Actividad 1.4 // Con base al año actual, leer un valor en años, para así determinar cuantos");
        System.out.println("años han pasado desde el año actual o ver cuanto le falta para llegar para el año actual");
        System.out.println(" ");
        
        int año = 0;
        int fijoa = 2021;
        
        System.out.println("Ingresa un año: ");
        Scanner añot = new Scanner (System.in);
        año = añot.nextInt( );
        
        int restaup = año - 2021;
        int restadown = 2021 - año;
        
        if (año > 2021 ) {
            System.out.println("Faltan " + restaup + " año/s");
        }else{
            if (año < 2019) {
                System.out.println("Han pasado " + restadown + " año/s");
            }else{
               System.out.println("El año que ingresaste es igual al actual, reinicia el programa e ingresa otro año");
               
            }
        }
        
        System.out.println("Actividad 1.5 // Ingresar un valor, y saber si es negativo o positivo");
        
        int valor7 = 0;
        
        System.out.println("Ingresa un valor: ");
        Scanner signo = new Scanner (System.in);
        valor7 = signo.nextInt ( );
        
        if (valor7 > 0) {
            System.out.println("Tu numero es positivo");
        }if (valor7 < 0) {
            System.out.println("Tu numero es negativo");
        }if (valor7 > -1 & valor7 < 1) {
            System.out.println("Tu valor es cero, por lo tanto es un valor intermedio");
        }
        
        System.out.println("Actividad 1.6 // Ingresar un valor, y saber si son de dos cifras o de una");
        
        int valor8 = 0;
        
        System.out.println("Ingresa un valor: ");
        Scanner cifras = new Scanner (System.in);
        valor8 = cifras.nextInt ( );
        
        if (valor8 > 9) {
            System.out.println("Tu valor tiene dos cifras ");
        }else{
            if (valor8 < 10) {
                System.out.println("Tu valor solo tiene una cifra");
            }else{
                System.out.println("N/A");
        } 
     }
        System.out.println("FIN");
}
