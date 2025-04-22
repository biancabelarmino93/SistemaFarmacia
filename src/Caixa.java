

public class Caixa extends Funcionario {
    
    public Caixa(String nome, String matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
    }
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " processado pelo caixa" + getNome());
    }
    
}
