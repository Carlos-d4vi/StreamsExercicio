package Domain;

import java.util.Scanner;

public class Menu {
    public String Show(){

        Scanner scanner = new Scanner(System.in);
        String resposta;
        do {
            System.out.println("(1) - Adicionar nova pessoa - (2) - Mostrar mulheres - (3) - Finalizar");
            resposta = scanner.nextLine();

            if (resposta.equals("1")){

            }

        }while (!resposta.equals("3"));

    }
}
