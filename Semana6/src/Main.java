import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingredientesPizza = new ArrayList<>();
        ingredientesPizza.add("queso");
        ingredientesPizza.add("tomate");
        ingredientesPizza.add("cebolla");

        Pizza pizza1 = new Pizza("Clásica", 8.99, ingredientesPizza);
        pizza1.preparar();
        System.out.println(pizza1.toString());

        System.out.println();

        PizzaItaliana pizza2 = new PizzaItaliana("Italiana", 10.99, ingredientesPizza, "tomate", 15);
        pizza2.preparar();
        System.out.println(pizza2.toString());

        System.out.println();

        Topping quesoTopping = new Topping("queso extra");
        quesoTopping.agregar(pizza1);

        Topping champinonesTopping = new Topping("champiñones");
        champinonesTopping.agregar(pizza2);
    }
}
