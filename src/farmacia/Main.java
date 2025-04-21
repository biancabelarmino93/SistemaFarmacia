
package farmacia;

import farmacia.descontos.*;
import farmacia.estoque.Inventario;
import farmacia.model.*;
import farmacia.venda.Venda;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Inventario estoque = new Inventario();
            Medicamento m1 = new Medicamento("Paracetamol", "123", 10.0, 50, LocalDate.of(2026, 12, 31));
            estoque.adicionarMedicamento(m1);

            Cliente cliente = new Cliente(1, "João", "12345678901");
            Gerente gerente = new Gerente(101, "Maria");

            Venda venda = new Venda(1, gerente, cliente);
            venda.adicionarItem(m1, 2);

            Desconto d1 = new DescontoClienteRegistrado(cliente);
            Desconto d2 = new DescontoPromocional(10.0);
            d1.aplicarDesconto(venda);
            d2.aplicarDesconto(venda);
            gerente.aplicarDesconto(venda, 5.0);

            venda.imprimirRecibo();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
