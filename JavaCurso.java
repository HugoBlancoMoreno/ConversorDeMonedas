package javacurso;

import java.util.Scanner;

public class JavaCurso {
    public static void main(String[] args) {
        EXTERNA:
        while(true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1. Euros.\n"
                    + "2. Pesos Mexicanos.\n"
                    + "3. Pesos Colombianos.\n"
                    + "4. Salir.");
            System.out.println("INGRESE UNA OPCIÓN: ");
            Scanner entrada = new Scanner(System.in);
            int opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: convertir(0.9, "Euros");
                break;
                case 2: convertir(16.96, "Pesos Mexicanos");
                break;
                case 3: convertir(3845.20, "Pesos Colombianos");
                break;
                case 4: System.out.println("Has salido del conversor.");
                break EXTERNA;
                default: System.out.println("Opción incorrecta");
                break;
            }
        }
    }
    
    static void convertir(double valorDolar, String paisMoneda){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s: ", paisMoneda);
        double cantidadMoneda = entrada.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        dolares = (double)Math.round(dolares * 100d)/100;
        
        System.out.println("Eso equivale a $ "+dolares+" Dolares");
    }
}
