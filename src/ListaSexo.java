import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Estudante
 */

public class ListaSexo {

    public static void programaListaSexo() {

        Scanner s = new Scanner(System.in);

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        System.out.println("****************************************************************");
        System.out.println("Informe os nomes e sexo (m/f): Ex: anderson-m,nataly-f");

        String resposta = s.next();

        String[] pares = resposta.split(",");

        for (String par : pares) {

            String[] nomeESexo = par.split("-");

            if (nomeESexo[1].equalsIgnoreCase("M")) {
                nomesMasculinos.add(nomeESexo[0]);
            } else if ((nomeESexo[1].equalsIgnoreCase("F"))) {
                nomesFemininos.add(nomeESexo[0]);
            } else {
                System.out.println("Nome " + nomeESexo[0] + " não foi adicionado, pois, não foi informado o sexo!");
            }
        }

        System.out.println("================================================================");

        System.out.println("Nomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("================================================================");
        System.out.println("Nomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        System.out.println("================================================================");
        System.out.println("****************************************************************");

    }
}
