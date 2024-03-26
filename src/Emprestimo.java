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

    public int qtdDiarias(){
        return dataDevolucao.getDayOfMonth()-dataEmprestimo.getDayOfMonth();
    }

    public int qtdDiarias(LocalDate dataDevolucaoAposRenovacao){
        return dataDevolucaoAposRenovacao.getDayOfMonth()-LocalDate.now().getDayOfMonth();
    }
}
