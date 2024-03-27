public abstract class Documento {
    protected String titulo;
    protected int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("Título inválido");
            return;
        }else {
            this.titulo = titulo;
        }
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void informacoes();
}
