package programa1;
import java.util.Scanner;
public class tarea2 {
    public static void main(String[]args){
        double[][] ventas = new double[4][4]; 
        double totalVentas = 0; 
        Scanner lectura=new Scanner(System.in);
        
        //entrada
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingresar el valor de la venta para la posición [" + i + "][" + j + "]: ");
                ventas[i][j] = lectura.nextDouble();
                totalVentas += ventas[i][j];
    }
}
        double promedioVentas = totalVentas / 16; 
        //proceso
        System.out.println("ventas:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
                }
                System.out.println();
            }

        //salida de datos
        System.out.println("el total de ventas es: " + totalVentas);
        System.out.println("el promedio de ventases: " + promedioVentas);
    }
}

