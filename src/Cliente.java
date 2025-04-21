
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

    boolean cpfValido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
