
/*Crie um programa em Java que recebe três comprimentos de lados e determina se esses comprimentos
podem formar um triângulo. Caso positivo, o programa deve indicar o tipo de triângulo formado
(equilátero, isósceles ou escaleno).*/
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Triangle t = new Triangle();

        System.out.println("Me dê três medidas de um triângulo (1/3):");
        t.setLado1(ler.nextDouble());
        System.out.println("Me dê três medidas de um triângulo (2/3):");
        t.setLado2(ler.nextDouble());
        System.out.println("Me dê três medidas de um triângulo (3/3):");
        t.setLado3(ler.nextDouble());

        t.type(t.getLado1(), t.getLado2(), t.getLado3());

        System.out.println("Estas medidas formam um triângulo " +t.tipoDoTriangle);
    }
}
