
public class DescontoClienteRegistrado implements Desconto{
    @Override
    public void aplicarDesconto(Venda venda){
        if (venda.getCliente() != null && venda.getCliente().isCpfValido()){
            double desconto = venda.getValorTotal()*0.05;
            venda.setValorTotal(venda.getValorTotal() - desconto);
            System.out.println("Desconto de 5% para clientes registrados apliacdo.");
        }
    }
    
}
