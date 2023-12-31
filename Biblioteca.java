import java.util.ArrayList;

public class Biblioteca {
    public String nome;
    public ArrayList<Livro> livros;
    public ArrayList<Midia> midia;

    public static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.midia = new ArrayList<>();

        bibliotecas.add(this);
    }

    public String toString() {
        return "Nome: " + this.nome;
    }
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for (int i = 0; i < this.livros.size(); i++) {
            System.out.println(i + " - " + this.livros.get(i).toString());
        }
    }

    public static void listarBibliotecas() {
        for (int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + " - " + biblioteca.toString());
            biblioteca.listarLivros();
        }
    }

    public void listarMidias() {
        for (int i = 0; i < this.midia.size(); i++) {
            System.out.println(i + " - " + this.midia.get(i).toString());
        }
    }

    public void adicionarMidia(Midia midia) {
        this.midia.add(midia);
    }
}