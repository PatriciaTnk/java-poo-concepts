public class Leitor extends Pessoa {

    private String telefone;
    private String endereco;
    private static int totalLeitores;

    public Leitor(String telefone, String endereco) {
        this.telefone = telefone;
        this.endereco = endereco;
        Leitor.totalLeitores++;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public static int getTotalLeitores() {
        return totalLeitores;
    }

    
    
}
