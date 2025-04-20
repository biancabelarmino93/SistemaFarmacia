
public class Cliente {
    
    private String clienteId;
    private String nome;
    private String cpf;

    public Cliente(String clienteId, String nome, String cpf) {
        this.clienteId = clienteId;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getClientId(){
       return this.clienteId;
   }
    public String getNome(){
       return this.nome;
   }
    public String getCpf(){
       return this.cpf;
   }
   public boolean isCpfValido(){
       return cpf != null && cpf.matches("\\d{11}");
   }
}
