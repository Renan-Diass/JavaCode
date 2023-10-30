import java.util.ArrayList;

public class Pessoa {
    public String nome;
    public static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Pessoa(String nome) {
        this.nome = nome;

        pessoas.add(this);
    }

    public String toString() {
        return "Nome: " + this.nome;
    } }
