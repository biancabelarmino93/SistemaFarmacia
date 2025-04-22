
import java.awt.Button;

public class Funcionario {
    
   private String nome;
   private String matricula;
   Inventario inventario;
   
   public Funcionario(String nome, String matricula){
       this.nome = nome;
       this.matricula = matricula;
   }
   public Funcionario(){
       this.inventario = new Inventario();
   }
    public String getNome(){return this.nome;}
    public String getMatricula(){return this.matricula;}
    
    public void setNome(String n){
       this.nome = n;
   }
   public void setMatricula(String mat){
       this.matricula = mat;
   }
   
   public void adicionarMedicamento(Medicamento m ){
       this.inventario.adicionarMedicamento(m);
   }
   
   


}
