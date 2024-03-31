
/*Faça um algoritmo para receber a quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. O sistema deve calcular e exibir a quantidade média
usando a seguinte fórmula: quantidade média = (quantidade máxima + quantidade mínima)/2. Se a
quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar
compra', senão escrever a mensagem 'Efetuar compra'*/
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Estoque e = new Estoque();

        System.out.println("Olá, bem-vindo(a) ao mercadinho do seu Zé");
        System.out.println("Me diga qual é a quantidade máxima em estoque: ");
        e.setQtdMax(ler.nextInt());
        System.out.println("Certo, enquanto a quantidade mínima: ");
        e.setQtdMin(ler.nextInt());
        System.out.println("Ok, e qual é a quantidade atual ?");
        e.setQtdAtual(ler.nextInt());

        double media = e.qtdMedia(e.getQtdMax(), e.getQtdMin());

        if (e.getQtdAtual() >= media) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}
