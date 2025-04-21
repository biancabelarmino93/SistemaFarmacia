import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Principal {

    
    public static void main(String[] args) throws Exception {
        Gerente g1 = new Gerente("Pato Donald", "007");
        Gerente g2 = new Gerente("João da Silva", "002");
        Caixa f1 = new Caixa("Pedro", "003");
        Caixa f2 = new Caixa("Beatriz", "004");
        
        Cliente c1 = new Cliente("cl0001", "Bianca", "12345678901");
        Cliente c2 = new Cliente("cl0002", "Debora", "01123456789");
        
        
        
        Medicamento m1,m2;
        m1 = new Medicamento("Dipirona",5.00,"001",100,"05/11/2028") {};
        m2 = new Medicamento("Buscopam",15.00,"002",200,"06/12/202");
        f1.adicionarMedicamento(m1);
        f2.adicionarMedicamento(m2);
        System.out.println("Medicamento no inventario " + m1);
        System.out.println("Medicamento no inventario " + m2);
        
        Venda v1 = new Venda(0001, f1, c1);
        try{
            v1.adicionarItem(m1, 2);
            v1.adicionarItem(m2, 2);
        }catch (InventarioInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Venda 1 - Total antes dos descontos: R$" + v1.getValorTotal());
        
        List<Desconto> descontosV1 = new ArrayList<>();
        descontosV1.add(new DescontoClienteRegistrado(c1));
        descontosV1.add(new DescontoGerente(g1, 10)); // 10% pelo gerente
        descontosV1.add(new DescontoGerente(g2, 10)); // 10% pelo gerente
        descontosV1.add(new DescontoPromocional(5)); // 5% promoção

        for (Desconto d : descontosV1){
            d.aplicarDesconto(v1);
        }
        System.out.println("Venda 1 - Total final: R$" + v1.getValorTotal());
        System.out.println();
        
        
        Venda v2 = new Venda(0002, f2, c2);
        try{
            v1.adicionarItem(m1, 5);
            v1.adicionarItem(m2, 6);
        }catch (InventarioInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Venda 2 - Total antes dos descontos: R$" + v2.getValorTotal());
        
        try {
            Desconto descontoInvalido = new DescontoGerente(f2, 10);
            descontoInvalido.aplicarDesconto(v2);
        }catch (RuntimeException e){
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }
        
        new DescontoPromocional(15).aplicarDesconto(v2);
        System.out.println("Venda 2 - Total final: R$" + v2.getValorTotal());
        System.out.println();
        
        System.out.println("Estoque após as vendas:");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();
        
        inventario.atualizarQuantidade("001", 40);
        inventario.removerMedicamento("002");
        System.out.println("Inventario atualizado:");
        Medicamento busca1 = inventario.buscaPorId("001");
        Medicamento busca2 = inventario.buscaPorId("002");
        System.out.println(busca1 != null ? busca1: "Dipirona removido");
        System.out.println(busca2);
        System.out.println();
        
        System.out.println("Processando pagamento:");
        f1.processarPagamento(v2.getValorTotal());
        
        System.out.println();
        System.out.println("Exemplo do toString de um medicamento:");
        System.out.println(m1.toString());
        
       
    }

   
    }
    
