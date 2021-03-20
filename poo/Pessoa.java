public class Pessoa {

    private String nome;
    private String endereco;
    private long cpf;
    private int rg;


     public Pessoa(String nome, String endereco, int cpf, int rg){
         this.nome = nome;
         this.endereco = endereco;
         this.cpf = cpf;
         this.rg = rg;
     }

     public void checkCPF() {
         if (getCpf() % 2 != 0) {
             System.out.println("CPF Encontrado");
         } else {
             System.out.println("CPF Não encontrado");
         }
     }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getRg() {
        return rg;
    }

    public String getEndereco() {
        return endereco;
    }


}
