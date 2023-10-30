import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("Minha Biblioteca");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar autor");
            System.out.println("2 - Criar livro ou midia");
            System.out.println("3 - Criar biblioteca");
            System.out.println("4 - Adicionar livro ou midia");
            System.out.println("5 - Emprestar livro ou midia");
            System.out.println("6 - Devolver livro ou midia");
            System.out.println("7 - Listar Autores");
            System.out.println("8 - Inserir Clientes");
            System.out.println("9 - Listar Midias ");
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                op = 99;
            }

            switch (op) {
                case 0: {
                    System.out.println("Sair....");
                    break;
                }
                case 1: {
                    System.out.println("Digite o nome do autor");
                    String nome = sc.next();
                    new Autor(nome);
                    break;
                }
                case 2: {
                    System.out.println("Você deseja adicionar um livro ou uma midia?");
                    System.out.println("1 - Livro");
                    System.out.println("2 - Midia");
                    int opcao = sc.nextInt();
                    switch (opcao) {
                        case 1: {
                            System.out.println("Digite o titulo do Livro");
                            String titulo = sc.next();
                            int posicaoAutor = -1;
                            do {
                                Autor.listarAutores();
                                try {
                                    posicaoAutor = sc.nextInt();
                                    if (posicaoAutor >= Autor.autores.size()) {
                                        throw new Exception("Autor inválido");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Autor inválido");
                                    posicaoAutor = -1;
                                }
                            } while (posicaoAutor < 0);
                            Autor autor = Autor.autores.get(posicaoAutor);
                            new Livro(titulo, autor, true);
                            break;
                        }
                        case 2: {
                            System.out.println("Digite o titulo da Midia");
                            String titulo = sc.next();
                            int posicaoAutor = -1;
                            do {
                                Autor.listarAutores();
                                try {
                                    posicaoAutor = sc.nextInt();
                                    if (posicaoAutor >= Autor.autores.size()) {
                                        throw new Exception("Autor inválido");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Autor inválido");
                                    posicaoAutor = -1;
                                }
                            } while (posicaoAutor < 0);

                            Autor autor = Autor.autores.get(posicaoAutor);
                            new Midia(titulo, autor, true);
                            break;

                        }
                        default: {
                            System.out.println("Opção inválida");
                            break;
                        }

                    }
                    break;
                }
                case 3: {
                    System.out.println("Digite o nome da biblioteca");
                    String nomeBiblioteca = sc.next();
                    new Biblioteca(nomeBiblioteca);
                    break;
                }

                case 4: {
                    System.out.println("Você deseja adicionar um livro ou uma midia?");
                    System.out.println("1 - Livro");
                    System.out.println("2 - Midia");
                    int opcao = sc.nextInt();
                    switch (opcao) {
                        case 1: {
                            int posicaoBiblioteca = -1;
                            do {
                                Biblioteca.listarBibliotecas();
                                try {
                                    posicaoBiblioteca = sc.nextInt();
                                    if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                        throw new Exception("Biblioteca inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Biblioteca inválida");
                                    posicaoBiblioteca = -1;
                                }
                            } while (posicaoBiblioteca < 0);

                            Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                            int posicaoLivro = -1;
                            do {
                                Livro.listarLivros();
                                try {
                                    posicaoLivro = sc.nextInt();
                                    if (posicaoLivro >= Livro.livros.size()) {
                                        throw new Exception("Livro inválido");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Livro inválido");
                                    posicaoLivro = -1;
                                }
                            } while (posicaoLivro < 0);

                            Livro livro = Livro.livros.get(posicaoLivro);

                            biblioteca.adicionarLivro(livro);

                            break;
                        }
                        case 2: {
                            int posicaoBiblioteca = -1;
                            do {
                                Biblioteca.listarBibliotecas();
                                try {
                                    posicaoBiblioteca = sc.nextInt();
                                    if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                        throw new Exception("Biblioteca inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Biblioteca inválida");
                                    posicaoBiblioteca = -1;
                                }
                            } while (posicaoBiblioteca < 0);

                            Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                            int posicaoMidia = -1;
                            do {
                                Midia.ListarMidias();
                                try {
                                    posicaoMidia = sc.nextInt();
                                    if (posicaoMidia >= Midia.midia.size()) {
                                        throw new Exception("Midia invalida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Midia inválida");
                                    posicaoMidia = -1;
                                }
                            } while (posicaoMidia < 0);

                            Midia midia = Midia.midia.get(posicaoMidia);

                            biblioteca.adicionarMidia(midia);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case 5: {
                    System.out.println("Você deseja emprestar um livro ou uma midia?");
                    System.out.println("1 - Livro");
                    System.out.println("2 - Midia");
                    int opcao = sc.nextInt();
                    switch (opcao) {
                        case 1: {
                            int posicaoBiblioteca = -1;
                            do {
                                Biblioteca.listarBibliotecas();
                                try {
                                    posicaoBiblioteca = sc.nextInt();
                                    if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                        throw new Exception("Biblioteca inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Biblioteca inválida");
                                    posicaoBiblioteca = -1;
                                }
                            } while (posicaoBiblioteca < 0);

                            Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                            int posicaoLivro = -1;
                            do {
                                biblioteca.listarLivros();
                                try {
                                    posicaoLivro = sc.nextInt();
                                    if (posicaoLivro >= Livro.livros.size()) {
                                        throw new Exception("Livro inválido");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Livro inválido");
                                    posicaoLivro = -1;
                                }
                            } while (posicaoLivro < 0);

                            Livro livro = biblioteca.livros.get(posicaoLivro);
                            try {
                                livro.emprestar();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                            break;

                        }
                        case 2: {
                            int posicaoBiblioteca = -1;
                            do {
                                Biblioteca.listarBibliotecas();
                                try {
                                    posicaoBiblioteca = sc.nextInt();
                                    if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                        throw new Exception("Biblioteca inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Biblioteca inválida");
                                    posicaoBiblioteca = -1;
                                }
                            } while (posicaoBiblioteca < 0);

                            Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                            int posicaoMidia = -1;
                            do {
                                biblioteca.listarMidias();
                                try {
                                    posicaoMidia = sc.nextInt();
                                    if (posicaoMidia >= Midia.midia.size()) {
                                        throw new Exception("Midia inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Midia inválida");
                                    posicaoMidia = -1;
                                }
                            } while (posicaoMidia < 0);

                            Midia midia = biblioteca.midia.get(posicaoMidia);
                            try {
                                midia.emprestar();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        }

                    }
                    break;
                }

                case 6: {
                    System.out.println("Você deseja devolver um livro ou uma midia?");
                    System.out.println("1 - Livro");
                    System.out.println("2 - Midia");
                    int opcao = sc.nextInt();
                    switch (opcao) {
                        case 1: {
                            int posicaoBiblioteca = -1;
                            do {
                                Biblioteca.listarBibliotecas();
                                try {
                                    posicaoBiblioteca = sc.nextInt();
                                    if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                        throw new Exception("Biblioteca inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Biblioteca inválida");
                                    posicaoBiblioteca = -1;
                                }
                            } while (posicaoBiblioteca < 0);

                            Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                            int posicaoLivro = -1;
                            do {
                                biblioteca.listarLivros();
                                try {
                                    posicaoLivro = sc.nextInt();
                                    if (posicaoLivro >= Livro.livros.size()) {
                                        throw new Exception("Livro inválido");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Livro inválido");
                                    posicaoLivro = -1;
                                }
                            } while (posicaoLivro < 0);

                            Livro livro = biblioteca.livros.get(posicaoLivro);
                            try {
                                livro.devolver();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        }
                        case 2: {
                            int posicaoBiblioteca = -1;
                            do {
                                Biblioteca.listarBibliotecas();
                                try {
                                    posicaoBiblioteca = sc.nextInt();
                                    if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                        throw new Exception("Biblioteca inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Biblioteca inválida");
                                    posicaoBiblioteca = -1;
                                }
                            } while (posicaoBiblioteca < 0);

                            Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                            int posicaoMidia = -1;
                            do {
                                biblioteca.listarMidias();
                                try {
                                    posicaoMidia = sc.nextInt();
                                    if (posicaoMidia >= Midia.midia.size()) {
                                        throw new Exception("Midia inválida");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Midia inválida");
                                    posicaoMidia = -1;
                                }
                            } while (posicaoMidia < 0);

                            Midia midia = biblioteca.midia.get(posicaoMidia);
                            try {
                                midia.devolver();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Lista dos autores:");
                    Autor.listarAutores();
                    sc.next();
                    break;

                }
                case 8: {
                    System.out.println("Digite o nome do cliente");
                    String nome = sc.next();
                    new Pessoa(nome);
                    break;

                }
                case 9: {
                    System.out.println("Lista das midias:");
                    Midia.ListarMidias();
                    sc.next();
                    break;

                }

                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}
