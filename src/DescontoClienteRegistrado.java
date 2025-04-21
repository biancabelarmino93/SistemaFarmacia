
public class DescontoClienteRegistrado implements Desconto{
    private Cliente cliente;
    
    public DescontoClienteRegistrado(Cliente cliente){
        this.cliente = cliente;
    }
    
    
    @Override
    public void aplicarDesconto(Venda venda){
        if (cliente.cpfValido()){
            double desconto = venda.getValorTotal()*0.05;
            venda.aplicarDesconto(desconto);
            System.out.println("Desconto de 5% para clientes registrados aplicado.");
        }
    }
    
}
