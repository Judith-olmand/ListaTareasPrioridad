import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListaTareasPrioridad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tareas = new ArrayList<>();
        int opcion = -1;
        String tarea;
        int posicion;

        do {
            try {
                System.out.println("Elija una opción");
                System.out.println("1. Añadir una tarea al final");
                System.out.println("2. Insertara una tarea en una posición concreta");
                System.out.println("3. Eliminar una tarea por posición");
                System.out.println("4. Mostrar todas las tareas numeradas");
                System.out.println("0. Salir");
                opcion = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("\uD83D\uDDF6 Elija una opción correcta");
                sc.nextLine();
            }


            switch (opcion) {
                case 1:
                    System.out.println("Indique la tarea que desea añadir");
                    tarea = sc.nextLine();
                    tareas.add(tarea);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Indique la tarea que desea añadir");
                    tarea = sc.nextLine();
                    System.out.println("Indique la posición donde desea añadir la tarea");
                    posicion = sc.nextInt();
                    sc.nextLine();
                    tareas.add(posicion, tarea);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Indique la posición de la tarea que desea eliminar");
                    posicion = sc.nextInt();
                    sc.nextLine();
                    tareas.remove(posicion);
                    System.out.println();
                    break;
                case 4:
                    for(int i = 0; i < tareas.size(); i++){
                        System.out.println(i + ". " + tareas.get(i));
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Hasta pronto!!!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    System.out.println();
                    break;
            }
        } while (opcion != 0);

    }
}