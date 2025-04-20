
import java.util.Date;

public class Medicamento implements Descontavel{
   private String nome;
   private double valor;
   private String id;
   private int quantidade;
   private String dataValidade;

    public Medicamento(String nome, double valor, String id, int quantidade, String dataValidade) {
        this.nome = nome;
        this.valor = valor;
        this.id = id;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }

    public String getNome() {return nome;}
    public double getValor() {return valor;}
    public String getId() {return id;}
    public int getQuantidade() {return quantidade;}
    public String getDataValidade() {return dataValidade;}
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    @Override
    public Double aplicarDesconto(Double percentualDesconto) {
        Double valorDesconto = 
                (this.valor * percentualDesconto) / 100;
        
        Double valor = this.valor - valorDesconto;
        return valor;
    
    }

    @Override
    public String toString() {
        return "Nome - " + this.getNome() 
               + "Valor -  " + this.getValor() 
               + "Id - " + this.getId() 
               + "Quantidade - " + this.getQuantidade() 
               + "Data de validade - " + this.dataValidade();
       
    }

    private String dataValidade() {
        return this.dataValidade;
    }

    void diminuirQuantidade(int quantidade) {
        if (this.quantidade >= quantidade){
            this.quantidade -= quantidade;
        }else {
 throw new IllegalArgumentException("Quantidade insuficiente em " + "estoque.");}}
