package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Poligono Regular");
        System.out.println("================");

        System.out.println();

        // Poligono Regular 1: usar constructor con todos los argumentos
        System.out.println("Poligono Regular 1:");
        System.out.print("Proporcione el valor de n:");
        int n = entrada.nextInt();
        System.out.print("Proporcione el valor de lado:");
        double lado = entrada.nextDouble();
        System.out.print("Proporcione el valor de x:");
        double x = entrada.nextDouble();
        System.out.print("Proporcione el valor de y:");
        double y = entrada.nextDouble();

        // Crear primer poligono regular
        PoligonoRegular pr1 = new PoligonoRegular(n,lado,x,y);

        // Poligono Regular 2: usar constructor con n y lado

        // Crear segundo poligono regular
        PoligonoRegular pr2 = new PoligonoRegular(n,lado);

        // Poligono Regular 3: usar constructor sin argumentos (no leer datos desde el teclado)
        PoligonoRegular pr3 = new PoligonoRegular();

        // Poligonos Regulares creados
        System.out.println();
        System.out.println("Poligonos Regulares creados:");
        System.out.println( pr1 );

        entrada.close();
    }
}