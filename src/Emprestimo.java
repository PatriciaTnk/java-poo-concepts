import java.time.LocalDate;

public class Emprestimo {
    private Leitor leitor;
    private Documento documento;
    private Bibliotecario bibliotecario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private static int totalEmprestimos;
    
    public Emprestimo(Leitor leitor, Documento documento, Bibliotecario bibliotecario, LocalDate dataDevolucao) {
        this.leitor = leitor;
        this.documento = documento;
        this.bibliotecario = bibliotecario;
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = LocalDate.now();
        Emprestimo.totalEmprestimos++;
    }

    public Leitor getLeitor() {
        return leitor;
    }
    
    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public static int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public String atraso(){

        if(LocalDate.now().isAfter(dataDevolucao)){
            return "Atrasado";
        }
        return "OK";
    }

    public String atraso(LocalDate diaVerificar){
        if(diaVerificar.isAfter(dataDevolucao)){
            return "Atrasado";
        }
        return "OK";
    }

    @Override
    public String toString() {
        return "Emprestimo [leitor=" + leitor.getNome()
        + ", documento=" + documento.getTitulo()
        + ", bibliotecario=" + bibliotecario.getNome()
        + ", dataEmprestimo=" + dataEmprestimo.toString()
        + ", dataDevolucao=" + dataDevolucao.toString() + "]";
    }

    
}
