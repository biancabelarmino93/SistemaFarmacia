
public class Gerente extends Caixa {
  
    public Gerente(String nome, String matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
    }
    
    public void cancelarCompra(){
        System.out.println("Compra cancelada");
    }

    @Override
    public String toString() {
        return "Nome" + this.getNome();
    }
    
    public Double aplicarDesconto(Double percentualDesconto) {
        double valor = 0;
        return valor;
    }
    public void aplicarDesconto(Venda venda, double percentual){
        double desconto = venda.getValorTotal()*(percentual/100);
        venda.setValorTotal(venda.getValorTotal()-desconto);
        System.out.println("Desconto de " + percentual + 
                "% aplicado pelo gerente " + getNome());
    }
 
}
