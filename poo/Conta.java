public class Conta {


    private double balance;


    public void checkBalanceInAccount() {
         System.out.println(balance);
    }

    public void depositValueAccount(double value){
        this.balance+=value;
        System.out.println("Sucesso, foi depositado o valor de: R$" + value + " em sua conta.");
    }

    public void withdrawValueAccount(double value){
        if (balance < value){
            System.out.println("Olá, é impossível retirar este saldo de sua conta.");
        } else {
            balance-=value;
            System.out.println("Tudo correto, saldo no valor de R$" + value + " retirado de sua conta.");
        }
    }


}
