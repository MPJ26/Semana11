package programa1;
import java.util.Random;
public class tarea4 {
    public static void main(String[] args) {
        double[][] ventas = new double[3][3]; 
        double totalVentas = 0; 
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + (10000 - 1000) * random.nextDouble(); 
                totalVentas += ventas[i][j]; 
            }
        }
        System.out.println("\nMatriz de ventas:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f\t", ventas[i][j]);
            }
            System.out.println(); 
        }
        double promedioVentas = totalVentas / 9; 

        System.out.printf("\nTotal de ventas: %.2f%n", totalVentas);
        System.out.printf("Promedio de ventas: %.2f%n", promedioVentas);
    }
}