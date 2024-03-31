import java.util.Scanner;

/*As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se forem compradas
pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o
custo total da compra. */

public class Main {
    public static void main (String[] args) {
        // Instanciando teclado
        Scanner ler = new Scanner(System.in);
        // Instanciando a SuperClasse Fruta
        Fruta f = new Fruta();
        // Instanciando SubClasse Maçã
        Apple a = new Apple();
        // Operadores

        System.out.println("Bem vindo(a) a loja de maçãs, quantas vai querer ?");
        a.setQtd(ler.nextInt());

        if (a.getQtd() < 12) {
            a.setPrice(1.30);
        }
        if (a.getQtd() >= 12) {
            a.setPrice(1);
        }

        System.out.println("Ok,ficou R$" +f.calcularP(a.getPrice(), a.getQtd())+ " no total.");
        System.out.println("Crébito ou Dédito ?");

    }
}