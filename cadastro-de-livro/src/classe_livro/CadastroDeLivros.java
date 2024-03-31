package classe_livro;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.nome = "Java 8 Prático";
        livro1.descricao = "Novos recursos da linguagem";
        livro1.valor = 59.90;
        livro1.isbn = "978-85-66250-46-6";

        livro1.mostrarDetalhes();
    }
}