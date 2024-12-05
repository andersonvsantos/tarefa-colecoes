import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Estudante
 */

public class ListaNomes {

    public static void programaNomes() {

        Scanner s = new Scanner(System.in);

        System.out.println("****************************************************************");
        System.out.println("Informe nomes separados por vírgula:");

        String entrada = s.next();
        String[] vetorDeNomes = entrada.split(",");

        List<String> listaDeNomes = Arrays.asList(vetorDeNomes);
        Collections.sort(listaDeNomes);

        System.out.println(listaDeNomes);
        for (String nome: listaDeNomes) {
            System.out.println(nome);
        }
        System.out.println("****************************************************************");
    }
}
