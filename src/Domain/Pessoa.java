package Domain;

public class Pessoa {
    public Pessoa(String name, String sexo, Integer idade){
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
    }

    String name;
    String sexo;
    Integer idade;
}
