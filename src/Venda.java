
import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
    
    private int vendaId;
    private List<Medicamento> itensVendidos;
    private double valorTotal;
    private LocalDateTime dataHora;
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda(int vendaId, 
            Funcionario funcionario, Cliente cliente) {
        this.vendaId = vendaId;
        this.itensVendidos = new ArrayList<>();
        this.dataHora = new LocalDateTime<>();
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    public int getVendaId() {
        return vendaId;
    }
    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }
    public List getIntensVendidos() {
        return itensVendidos;
    }
    public void setIntensVendidos(List itensVendidos) {
        this.itensVendidos = itensVendidos;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    void aplicarDesconto(double desconto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void adicionarItem(Medicamento medicamento, int quantidade) throws InventarioInsuficienteException{
        if(medicamento.getQuantidade() >= quantidade){
            Medicamento vendido = Medicamento(
            medicamento.getNome(), medicamento.getValor(), 
                    medicamento.getQuantidade(), medicamento.getDataValidade()
           );
           itensVendidos.add(vendido);
           medicamento.diminuirQuantidade(quantidade);
           calcularTotal();
        }else{
            throw new InventarioInsuficienteException("Inventario insuficiente para " + medicamento.getNome());
        }
    }
    private void calcularTotal(){
        valorTotal =0;
        for(Medicamento med : itensVendidos){
            valorTotal += med.getValor()*med.getQuantidade();
        }
    }

    private Medicamento Medicamento(String nome, double valor, int quantidade, String dataValidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}
