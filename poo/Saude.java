public class Saude {


    private double peso;
    private double altura;


    public Saude(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        return Double.valueOf(this.peso / (this.altura * this.altura));
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}