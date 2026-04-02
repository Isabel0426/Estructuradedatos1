import java.util.Scanner;

public class ArreglosDiferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arregloDiferencia = new int[7];

        double sumaTotal = 0;

        System.out.println("Ingrese 7 números para el primer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
            sumaTotal += arreglo1[i];
        }

        System.out.println("\nIngrese 7 números para el segundo arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
            sumaTotal += arreglo2[i];
        }

        for (int i = 0; i < 7; i++) {
            arregloDiferencia[i] = arreglo1[i] - arreglo2[i];
            sumaTotal += arregloDiferencia[i];
        }

        double promedio = sumaTotal / 21;

        System.out.println("\nArreglo diferencia:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arregloDiferencia[i]);
        }

        System.out.println("\nPromedio de todos los datos: " + promedio);

        scanner.close();
    }
}