public class Saude {


    private double peso;
    private double altura;


    public Saude(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(){
        double value = Double.valueOf(this.peso / (this.altura * this.altura));
        if (value >= 40 ) {
            return "Obesidade Grave (" + value + ")";
        } else if (value >= 30 && value <= 39.9){
            return "Obesidade (" + value + ")";
        } else if (value >= 25 && value <= 29.9){
            return "Sobrepeso (" + value + ")" ;
        } else if (value >= 18.5 && value <= 24.9){
            return "Normal (" + value + ")";
        } else if (value < 18.5){
            return "Magreza (" + value + ")";
        }
        return "Não foi possível calcular o seu IMC.";
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}

//                                 Peso, Altura
//         Saude saude = new Saude(80, 1.80);
//         System.out.println(saude.calcularIMC());

