public class Livro extends Documento{
    private String autor;
    private String isbn;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void informacoes(){
        System.out.println("Titulo: " + super.titulo + "\nAno de publicação: " + super.anoPublicacao + "\nAutor: " + this.autor + "\nISBN: " + this.isbn);
    }
}
