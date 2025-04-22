
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

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
        this.dataHora = LocalDateTime.now();
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    public int getVendaId() {
        return vendaId;
    }
    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }
    public ArrayList<Medicamento> getItensVendidos() {
        return (ArrayList<Medicamento>) itensVendidos;
    }
    public void setItensVendidos(List itensVendidos) {
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
    public void aplicarDesconto(double valor) {
        this.valorTotal -= valor;
    }
    public void adicionarItem(Medicamento m, int quantidade) throws Exception{
        m.diminuirQuantidade(quantidade);
        for(int i = 0; i < quantidade; i++){
            itensVendidos.add(m);
        }
        valorTotal += m.getValor()*quantidade;
    
    }
    public void imprimirRecibo(){
        System.out.println("   RECIBO   ");
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHora.format(formatter);
        System.out.println("Data e hora da venda: " + dataHoraFormatada);
    
        for (Medicamento m : itensVendidos) {
        System.out.println(m);
    }
    
        System.out.println("Total: R$" + valorTotal);
        System.out.println("Funcionario: " + funcionario.getNome());
        if (cliente != null) System.out.println("Cliente: " + cliente.getNome());
        System.out.println();
}

    private Medicamento Medicamento(String nome, double valor, int quantidade, String dataValidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

