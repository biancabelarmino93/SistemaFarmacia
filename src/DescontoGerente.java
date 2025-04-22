
public class DescontoGerente implements Desconto{
    private double percentual;
    private Funcionario funcionario;
    
    public DescontoGerente(Funcionario funcionario, double percentual){
        this.funcionario = funcionario;
        this.percentual = percentual;
    }
    @Override
    public void aplicarDesconto(Venda venda){
        if(funcionario instanceof Gerente){
            double desconto = venda.getValorTotal()*(percentual/100);
            venda.aplicarDesconto(desconto);
            System.out.println("Desconto de " + percentual + "% aplicado pelo gerente.");
        }else{
            throw new RuntimeException("Apenas gerentes podem aplicar este desconto.");
        }
    }
}
