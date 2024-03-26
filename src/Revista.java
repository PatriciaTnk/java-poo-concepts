public class Revista extends Documento{
    private String editora;
    private int numeroEdicao;
    
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getNumeroEdicao() {
        return numeroEdicao;
    }
    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public void informacoes(){
        System.out.println("Titulo: " + super.titulo + "\nAno de publicação: " + super.anoPublicacao + "\nEditora: " + this.editora + "\nNº edição: " + this.numeroEdicao);
    }
}
