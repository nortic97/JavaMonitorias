package clases.y.objetos;

import clases.y.objetos.modelo.AnimalModel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ClasesYObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int op;

        AnimalModel animal = new AnimalModel();

        Scanner teclado = new Scanner(System.in);

        animal.setId(0); // aca ni dios ni yo se como funciona.

        System.out.println("Digite el pelaje");

        String pelaje = teclado.nextLine();

        animal.setPelaje(pelaje);

        System.out.println("Digite el Grupo");

        String grupo = teclado.nextLine();

        animal.setGrupo(grupo);

        System.out.println("Seleccione si es invertebrado o no");
        System.out.println("1. Invertebrado");
        System.out.println("2. Vertebrado");

        do {

            op = teclado.nextInt();

            switch (op) {

                case 1:

                    animal.setInvertebrado(true);
                    break;

                case 2:

                    animal.setInvertebrado(false);
                    break;

                default:

                    System.out.println("Opcion invalida");

            }

        } while (op > 2 || op < 1);

        System.out.println(animal);

        // Listas int numeros[] = new array[n];
        /*
        0.
        1.
        2.
        3.
        4.
        5.
        6.
        7.
        8.
        9.
         */
        System.out.println("Arreglos");

        AnimalModel a[] = new AnimalModel[10];

        for (int i = 0; i < 7; i++) {

            a[i] = new AnimalModel(i, "Plumas", "vertebrado", true);

        }

        System.out.println("foreach");
        
        for (AnimalModel temporales : a) {

            System.out.println(temporales);

        }

        System.out.println("for primitivo");
        
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }
        
        ArrayList<AnimalModel> lista = new ArrayList<>();
        
        lista.add(animal);
        
        lista.add(new AnimalModel(0,"Prueba1","Prueba1",false));
        
        System.out.print(lista);

    }

}
