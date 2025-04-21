
package farmacia.model;

import java.time.LocalDate;

public class Medicamento {
    private String nome;
    private String id;
    private double preco;
    private int quantidade;
    private LocalDate dataValidade;

    public Medicamento(String nome, String id, double preco, int quantidade, LocalDate dataValidade) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }

    public String getNome() { return nome; }
    public String getId() { return id; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public LocalDate getDataValidade() { return dataValidade; }

    public void diminuirQuantidade(int quantidadeVendida) throws Exception {
        if (quantidade < quantidadeVendida) {
            throw new Exception("Estoque insuficiente para o medicamento: " + nome);
        }
        this.quantidade -= quantidadeVendida;
    }

    @Override
    public String toString() {
        return "Medicamento: Nome=" + nome + ", Preço=" + preco + ", Quantidade=" + quantidade + ", ID=" + id + ", Data de Validade=" + dataValidade;
    }
}
