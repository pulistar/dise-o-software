package resturant;

import java.util.ArrayList;
import java.util.List;

public class LaMerced {
    private Usuario usuario;
    private Receta receta;
    private List<Ingrediente> ingredientes;

    public LaMerced(Usuario usuario, Receta receta) {
        this.usuario = usuario;
        this.receta = receta;
        this.ingredientes = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void eliminarIngrediente(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }
}
