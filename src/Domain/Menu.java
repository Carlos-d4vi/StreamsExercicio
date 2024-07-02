package Domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String resposta;

    public String Run(){

        /*Scanner scanner = new Scanner(System.in);
        String resposta;*/
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        do {
            System.out.println("(1) - Adicionar nova pessoa - (2) - Mostrar mulheres - (3) - Finalizar");
            resposta = scanner.nextLine();

            if (resposta.equals("1")){
                addPeople(listaPessoas);
            }

        }while (!resposta.equals("3"));

        return "String";
    }

    private void addPeople(ArrayList<Pessoa> listaDePessoa){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, sexo, idade);

        listaDePessoa.add(pessoa);
    }
}
