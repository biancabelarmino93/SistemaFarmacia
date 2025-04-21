
package farmacia.descontos;

import farmacia.venda.Venda;

public class DescontoPromocional implements Desconto {
    private double percentual;

    public DescontoPromocional(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public void aplicarDesconto(Venda venda) {
        double desconto = venda.getValorTotal() * (percentual / 100);
        venda.aplicarDesconto(desconto);
        System.out.println("Desconto promocional de " + percentual + "% aplicado.");
    }
}
