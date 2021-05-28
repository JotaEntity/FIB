import java.util.Scanner;


/* NÃO CONSEGUI FINALIZAR O CÓDIGO DA AULA POR PROBLEMAS DE SAÚDE. */
public class Main {


    public static void main(String[] args) {


        System.out.println("Insira o nome:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Correto, agora sua idade:");
        int idade = sc.nextInt();
        PadariaUser padariaUser = new PadariaUser(name, idade, 0);
            System.out.println("Bem vindo ao nosso sistema, siga nosso menu:");
            System.out.println("0. - Tabela de preços");
            System.out.println("1. - Ver carrinho.");
            System.out.println("2. - Fechar.");
            int dado = sc.nextInt();
            if (dado == 2){
                System.out.println("Fechando...");
                sc.close();
            } else if (dado == 0){
                System.out.println("Produtos:");
                System.out.println("Pão - R$2.00");
                System.out.println("Utilize:");
                System.out.println("1. Para adicionar pão ao seu carrinho.");
                System.out.println("2. Fechar Sistema/Finalizar compra");
                int newvalue = sc.nextInt();
                if (newvalue == 1){
                    if (padariaUser.checkLimitInBread() == false){
                        System.out.println("Você não pode mais adicionar pão ao seu carrinho, finalize a compra.");
                        System.out.println("1. Finalizar compra");
                        int next = sc.nextInt();
                        if (next == 1){
                            System.out.println("Compra finalizada, no valor de R$" + padariaUser.checkLimitInBread());
                            sc.close();
                        } else {
                            System.out.println("Sistema finalizado.");
                            sc.close();
                        }
                    } else {
                        padariaUser.addCompra(1);
                        if (padariaUser.checkLimitInBread() == true){
                            System.out.println("Você deseja comprar mais pão?");
                            System.out.println("1. Para adicionar 1 pão");
                            System.out.println("2. Para finalizar o sistema / Finalizar compra");
                            int menunewnext = sc.nextInt();
                            if (menunewnext == 1){
                                if (padariaUser.checkLimitInBread() == true) {
                                    padariaUser.addCompra(1);
                                    System.out.println("1. Finalizar compra");
                                    System.out.println("2. Adicionar mais pão");
                                    int v = sc.nextInt();
                                    if (v == 1){
                                        System.out.println("Compra finalizada no valor de R$: " + padariaUser.returnValueFromProducts());
                                        sc.close();
                                    } else if (v == 2){
                                        if (padariaUser.checkLimitInBread() == false){
                                            System.out.println("Você não pode mais adicionar pão ao seu carrinho, finalize a compra.");
                                            System.out.println("1. Finalizar compra");
                                            int next = sc.nextInt();
                                            if (next == 1){
                                                System.out.println("Compra finalizada, no valor de R$" + padariaUser.returnValueFromProducts());
                                                sc.close();
                                            } else {
                                                System.out.println("Sistema finalizado.");
                                                sc.close();
                                            }
                                        } else {
                                            padariaUser.addCompra(1);

                                            System.out.println("Sistema finalizado....");
                                            System.out.println("Compra finalizada, no valor de R$" + padariaUser.returnValueFromProducts());
                                            sc.close();

                                        }

                                    }
                                } else {
                                    System.out.println("Sem limite...");
                                    sc.close();
                                }
                                } else if (menunewnext == 2){
                                if (padariaUser.getBreadInCart() > 0) {
                                    System.out.println("Compra finalizada, no valor de R$" + padariaUser.returnValueFromProducts());
                                }
                                sc.close();
                            }

                        } else {
                            System.out.println("Você acabou com os limites");
                            sc.close();
                        }

                    }

                } else {
                    if (padariaUser.getBreadInCart() > 0) {
                        System.out.println("Compra finalizada, no valor de R$" + padariaUser.returnValueFromProducts());
                    }
                    sc.close();
                }

            } else if (dado == 1){
                System.out.println(padariaUser.returnBreadsInCart());
                sc.close();
            }
    }
}
