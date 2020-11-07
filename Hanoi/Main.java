import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public  static void main(String[] args) {

        Hanoi game = new Hanoi();
        System.out.println("Olá, bem vindo ao Jogo da Torre de Hanoi.");
        System.out.println("Por favor, introduza seu nome.");

        Scanner usuario = new Scanner(System.in);
        String realname = usuario.nextLine();

        System.out.println("Boa " + realname + "!.");
        System.out.println("Quantos discos terá no jogo?");

        Scanner disk = new Scanner(System.in);
        int discos = disk.nextInt();

        System.out.println("Perfeito, seu jogo terá " + discos + " discos.");
        System.out.println("Quantas jogadas seu jogo terá?");

        Scanner tantasjogadas = new Scanner(System.in);
        int jogada = tantasjogadas.nextInt();
        game.setJogadas(jogada);

        System.out.println("Faça um bom proveito e se divirta.");
        System.out.println("Peças que você pode mexer: A, B\n");
        System.out.println("Exemplo: 1-B (Irá mexer o disco 1 para o B) 2-A (Irá mexer o disco 2 pro A)");

        Scanner escolha = new Scanner(System.in);
        String hanoi = escolha.nextLine();
        int disco = Integer.valueOf(hanoi.substring(0, 1));
        String letra = hanoi.substring(2, 3);
        game.fazerJogada(realname, disco, letra);














    }

}
