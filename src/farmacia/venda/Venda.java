
package farmacia.venda;

import farmacia.model.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int vendaId;
    private List<Medicamento> itensVendidos;
    private double valorTotal;
    private LocalDateTime dataHora;
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda(int vendaId, Funcionario funcionario, Cliente cliente) {
        this.vendaId = vendaId;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.dataHora = LocalDateTime.now();
        this.itensVendidos = new ArrayList<>();
    }

    public void adicionarItem(Medicamento m, int quantidade) throws Exception {
        m.diminuirQuantidade(quantidade);
        for (int i = 0; i < quantidade; i++) {
            itensVendidos.add(m);
        }
        valorTotal += m.getPreco() * quantidade;
    }

    public void aplicarDesconto(double valor) {
        this.valorTotal -= valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void imprimirRecibo() {
        System.out.println("----- RECIBO -----");
        for (Medicamento m : itensVendidos) {
            System.out.println(m);
        }
        System.out.println("Total: R$" + valorTotal);
        System.out.println("Funcionário: " + funcionario.getNome());
        if (cliente != null) System.out.println("Cliente: " + cliente.getNome());
        System.out.println("------------------");
    }
}
