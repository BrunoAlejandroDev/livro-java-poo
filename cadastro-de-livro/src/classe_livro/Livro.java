package classe_livro;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;

    void mostrarDetalhes() {
        System.out.println("Detalhes do Livro: ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
    }
}