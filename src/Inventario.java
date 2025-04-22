
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private final Map<String, Medicamento> medicamentos;
    
    public Inventario(){
        this.medicamentos = new HashMap<>();
    }
    
    public void adicionarMedicamento(Medicamento medicamento){
        medicamentos.put(medicamento.getId(), medicamento);
    }
    public Medicamento buscarPorId(String id){
        return medicamentos.get(id);
    }
    public void listarMedicamentos(){
        for(Medicamento m : medicamentos.values()){
            System.out.println(m);
        }
    }
    public void removerMedicamento(String id){
        medicamentos.remove(id);
    }
    public void atualizarQuantidade(String id, int novaQuantidade){
        Medicamento m = buscarPorId(id);
        if (m != null){
            m.setQuantidade(novaQuantidade);
        }
    }
    public boolean temInventario(String id, int quantidade){
        Medicamento medicamento = buscarPorId(id);
        return medicamento != null && medicamento.getQuantidade() >= quantidade;
    }
}
