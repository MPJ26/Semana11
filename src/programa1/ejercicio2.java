package programa1;
/*Crear un programa en Java que permita registrar números enteros dentro 
en una matriz de 3x3. Visualizar la suma y el promedio de los números.
Ejemplo:
  1 2 3
4 5 6
7 8 9

sn=45
pnum=5

 */
import java.util.Scanner;
public class ejercicio2 {
     public static void main(String[]args){
        int numero=0,f,c,cem;
        double promedio=0.0,suma=0.0;
        int[][]mnumero=new int[3][3];
        Scanner lectura=new Scanner(System.in);
        
        //entrada
         for ( f = 0; f < mnumero[0].length; f++) {
             for ( c = 0; c < mnumero[0].length; c++) {
                 System.out.print("ingrese el numero : ");
                 numero=lectura.nextInt();
                 mnumero[f][c]=numero;
                 
             }
        }
         //proceso
         for ( f = 0; f < mnumero[0].length; f++) {
             for ( c = 0; c < mnumero[0].length; c++) {
                 suma+=mnumero[f][c];
                 
             }
         }
         cem=mnumero.length*mnumero[0].length;
         promedio=suma/cem;
     //salida de datos
         System.out.println("La suma de los numeros es : "+suma);
         System.out.println("El promedio de los numeros es : "+promedio);
    }   
}

