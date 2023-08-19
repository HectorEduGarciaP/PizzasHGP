package Listas;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    public void ejemplo1() {
        List<String> taskList = new ArrayList<String>();

        taskList.add("Sacar al perro");
        taskList.add("Ir de compras ");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");



//        System.out.println(taskList);
//        String primeraTarea = taskList.get(0);
//        System.out.println("Primera tarea: " + primeraTarea);
//
//        taskList.remove(0);
//        primeraTarea = taskList.get(0);
//        System.out.println("Primera tarea: " + primeraTarea);

        int elementos = 1;
        //iterate
        //iteracion
        for (String tarea : taskList) {
            System.out.println(elementos+". Tarea: "+tarea);
            elementos ++;
        }


    }
    public void listaNumeros() {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1000);
        numeros.add(2000);
        numeros.add(300);
        numeros.add(4000);

        int suma = 0;

        for (Integer numero : numeros) {
            System.out.println("cantidad: "+numero);
            suma = suma + numero;
        }
        System.out.println("suma total: "+suma);
    }

    public void ListaTareas(){
        List<Listas.ClsTaskList> tas = new ArrayList<>();
        Listas.ClsTaskList tareaIndividual = new Listas.ClsTaskList();
        tareaIndividual.setTaskName("Sacar al chucho");
        tareaIndividual.setTaskDescription("LLevar a firulais al parque");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new Listas.ClsTaskList();


        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("mi mama o mujer me regaña");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new Listas.ClsTaskList();

        tareaIndividual.setTaskName("Ir de compras");
        tareaIndividual.setTaskDescription("Comprar comida para la sema");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new Listas.ClsTaskList();

        tareaIndividual.setTaskName("ir a votar");
        tareaIndividual.setTaskDescription("Votar por el menos perro");
        tareaIndividual.setDone(false);
        tas.add(tareaIndividual);
        tareaIndividual = new Listas.ClsTaskList();

        tas.get(1).setDone(true);
        tas.get(3).setDone(true);

        int contador = 0;
        for(Listas.ClsTaskList tl : tas) {
            if(tl.isDone() == false){
                System.out.println("\n"+contador+". Tarea: "+tl.getTaskName());
                System.out.println(contador+". Description: "+tl.getTaskDescription());
                System.out.println(contador+". Estado: "+tl.isDone());
            }
//            System.out.println("\n"+contador+". Tarea: "+tl.getTaskName());
//            System.out.println(contador+". Description: "+tl.getTaskDescription());
//            System.out.println(contador+". Estado: "+tl.isDone());
            contador++;
        }

    }
}