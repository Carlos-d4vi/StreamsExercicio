package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String resposta;

    public String Run(){

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        do {
            System.out.println("(1) - Adicionar nova pessoa - (2) - Mostrar mulheres - (3) - Finalizar");
            resposta = scanner.nextLine();

            if (resposta.equals("1")){
                addPeople(listaPessoas);
            }
            if (resposta.equals("2")){
                showFemales(listaPessoas);
            }

        }while (!resposta.equals("3"));

        return "String";
    }


    private void addPeople(ArrayList<Pessoa> listaDePessoa){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        if (!sexo.equalsIgnoreCase("Masculino") && !sexo.equalsIgnoreCase("Feminino")){
            System.out.println("Ocorreu um erro!");
        }else {
            System.out.print("Idade: ");
            Integer idade = scanner.nextInt();
            Pessoa pessoa = new Pessoa(nome, sexo, idade);

            listaDePessoa.add(pessoa);
        }
    }

    private void showFemales(ArrayList<Pessoa> listaDePessoas) {
        List<Pessoa> mulheres = listaDePessoas.stream()
                .filter(pessoa -> pessoa.sexo.equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        System.out.println("Mulheres na lista:");
        for (Pessoa mulher:mulheres){
            System.out.println(mulher.name + " " + mulher.getIdade());
        }
    }
}
