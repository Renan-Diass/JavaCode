import java.util.ArrayList;

public class Midia {
    public String titulo;
    public Autor autor;
    public boolean disponivel;

    public static ArrayList<Midia> midia = new ArrayList<>();

    public Midia(String titulo, Autor autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        midia.add(this);
    }

    public String toString() {
        return "Título: " + this.titulo
                + ". Autor: " + this.autor.nome
                + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }

    public static void ListarMidias() {
        for (int i = 0; i < midia.size(); i++) {
            System.out.println(i + " - " + midia.get(i).toString());
        }
    }

    public void emprestar() throws Exception {
        if (!this.disponivel) {
            throw new Exception("Midia não está disponível");
        }
        this.disponivel = false;
    }

    public void devolver() throws Exception {
        if (this.disponivel) {
            throw new Exception("Midia já está disponível");
        }
        this.disponivel = true;
    }
}