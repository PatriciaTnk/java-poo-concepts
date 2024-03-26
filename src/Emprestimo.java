import java.time.LocalDate;

public class Emprestimo {
    private Leitor leitor;
    private Documento documento;
    private Bibliotecario bibliotecario;
    private LocalDate dataParaDevolucao;
    private static int totalEmprestimos;
    
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
    public LocalDate getDataParaDevolucao() {
        return dataParaDevolucao;
    }
    public void setDataParaDevolucao(LocalDate dataParaDevolucao) {
        this.dataParaDevolucao = dataParaDevolucao;
    }
    public static int getTotalEmprestimos() {
        return totalEmprestimos;
    }
    public static void setTotalEmprestimos(int totalEmprestimos) {
        Emprestimo.totalEmprestimos = totalEmprestimos;
    }

    
}
