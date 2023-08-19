import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {
    private double sueldo_base;
    private double descuento;
    private double sueldo_liquido;

    public ClsEjercicio6(double sueldo_base, double descuento) {
        this.sueldo_base = sueldo_base;
        this.descuento = descuento;
        this.sueldo_liquido = sueldo_base - descuento;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Emiliano");
        nombres.add("Don Jose");
        nombres.add("Alberto");

        List<ClsEjercicio6> empleados = new ArrayList<>();
        for (String nombre : nombres) {
            ClsEjercicio6 empleado = new ClsEjercicio6(3500, 250);
            empleados.add(empleado);
        }

        double sueldoTotal = 0;
        double descuentosTotal = 0;
        double sueldoLiquidoTotal = 0;

        for (ClsEjercicio6 empleado : empleados) {
            sueldoTotal += empleado.getSueldo_base();
            descuentosTotal += empleado.getDescuento();
            sueldoLiquidoTotal += empleado.getSueldo_liquido();
        }

        System.out.println("Reporte de sueldos:");
        System.out.println("------------------------------");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i));
            System.out.println("Sueldo base: " + empleados.get(i).getSueldo_base());
            System.out.println("Descuento: " + empleados.get(i).getDescuento());
            System.out.println("Sueldo líquido: " + empleados.get(i).getSueldo_liquido());
            System.out.println("------------------------------");
        }

        System.out.println("Total de sueldos: " + sueldoTotal);
        System.out.println("Total de descuentos: " + descuentosTotal);
        System.out.println("Total de sueldos líquidos: " + sueldoLiquidoTotal);
    }
}