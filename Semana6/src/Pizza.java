import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;
    private List<String> ingredientes;

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }

    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }
}
