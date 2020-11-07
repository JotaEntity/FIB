import java.util.HashMap;
import java.util.Scanner;

public class Hanoi {

    public static HashMap<Integer, String> moverHanoi = new HashMap<>();
    public Integer jogadas;



    public void fazerJogada(String jogador, int disco, String letra){

        if (moverHanoi.get(disco) != null){
            System.out.println(jogador + " moveu o disco " + disco + " de " + moverHanoi.get(disco) + " para " + letra.toUpperCase());
            moverHanoi.put(disco, letra.toUpperCase());
        } else {
            System.out.println(jogador + " moveu o disco " + disco + " para " + letra + " pela primeira vez!");
            moverHanoi.put(disco, letra.toUpperCase());
        }
        jogadas--;
        if (jogadas == 0){
            finalizar();
        } else {
            Scanner escolha = new Scanner(System.in);
            String hanoi = escolha.nextLine();
            int newdisco = Integer.valueOf(hanoi.substring(0, 1));
            String newletra = hanoi.substring(2, 3);
            fazerJogada(jogador, newdisco, newletra);
        }


    }
    public void finalizar(){
        System.out.println("Seu jogo se encerrou :(");
        System.out.println("Assim ficou seus últimos discos:");
        for (int jogadas : moverHanoi.keySet()){
            System.out.println(jogadas + "-" + moverHanoi.get(jogadas));
        }

    }
    public void setJogadas(int jogadas){
        this.jogadas = jogadas;

    }
}
