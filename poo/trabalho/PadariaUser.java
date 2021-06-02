public class PadariaUser {

    private String name;
    private int age;
    private int breadInCart = 0;
    private int compras = 0;

    public PadariaUser(String name, int age, int breadInCart){
        this.name = name;
        this.age = age;
        this.breadInCart = breadInCart;
    }

    public boolean checkLimitInBread(){
        if (breadInCart >= 2){
            return false;
        } else {
            return true;
        }
    }
    public int returnValueFromProducts(){
        return breadInCart * 2;
    }
    public void addCompra(int pao){
       compras+=1;
       breadInCart+=pao;
    }
    public String returnBreadsInCart(){
        if (breadInCart == 0){
            return "Sem pão no carrinho";
        } else if (breadInCart == 1){
            return "1 Pão no carrinho";
        } else {
            return breadInCart + " pães no carrinho";
        }
    }
    public int getBreadInCart(){
        return breadInCart;
    }
}
