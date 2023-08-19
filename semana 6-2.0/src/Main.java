import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClsEjercicio6> empleados = new ArrayList<>();
        empleados.add(new ClsEjercicio6(3500, 250));
        empleados.add(new ClsEjercicio6(3500, 250));
        empleados.add(new ClsEjercicio6(3500, 250));
        empleados.add(new ClsEjercicio6(3500, 250));
        empleados.add(new ClsEjercicio6(3500, 250));

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
            System.out.println("Empleado " + (i+1));
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