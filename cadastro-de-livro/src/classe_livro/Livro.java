package classe_livro;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {
        System.out.println("Detalhes do Livro: ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        else {
            System.out.println("Autor desconhecido.");
        }
        System.out.println("------");
    }

    boolean temAutor() {
        return this.autor != null;
    }

    // método para dar desconto em um livro
    public void aplicarDescontoDe(double desconto) {
        this.valor -= this.valor * (desconto/100);
    }
}