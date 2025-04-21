
package farmacia.estoque;

import farmacia.model.Medicamento;
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Medicamento> medicamentos;

    public Inventario() {
        medicamentos = new HashMap<>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.put(medicamento.getId(), medicamento);
    }

    public Medicamento buscarPorId(String id) {
        return medicamentos.get(id);
    }

    public void removerMedicamento(String id) {
        medicamentos.remove(id);
    }

    public void listarMedicamentos() {
        for (Medicamento m : medicamentos.values()) {
            System.out.println(m);
        }
    }
}
