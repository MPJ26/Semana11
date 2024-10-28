package programa1;
import java.util.Random;
import java.util.Scanner;
public class tarea3 {
    public static void main(String[]args){
        double[][] ventas = new double[4][4]; 
        double ventaMayor = 0; 
        double ventaMenor = 5000; 
        Random random = new Random();
        
        //entrada
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 10 + (5000 - 10) * random.nextDouble(); 
                System.out.printf("Venta registrada en posición [%d][%d]: %.2f%n", i, j, ventas[i][j]);
                
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
        }
       
            System.out.println();
        System.out.printf("Venta mayor: ", ventaMayor);
        System.out.printf("Venta menor: %.2f%n", ventaMenor);
        }
    }

