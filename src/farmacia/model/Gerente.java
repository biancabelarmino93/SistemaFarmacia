
package farmacia.model;

import farmacia.venda.Venda;

public class Gerente extends Caixa {
    public Gerente(int funcionarioId, String nome) {
        super(funcionarioId, nome);
    }

    public void aplicarDesconto(Venda venda, double percentagem) {
        double desconto = venda.getValorTotal() * (percentagem / 100);
        venda.aplicarDesconto(desconto);
        System.out.println("Desconto de " + percentagem + "% aplicado pelo gerente.");
    }
}
