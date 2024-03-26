public class Leitor extends Pessoa {
    private String telefone;
    private static int totalLeitores;

    public Leitor(String telefone) {
        this.telefone = telefone;
        Leitor.totalLeitores++;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static int getTotalLeitores() {
        return totalLeitores;
    }

    public void informacoes(){
        System.out.println("Nome: " + super.nome + "\nCPF: " + super.cpf + "\nE-mail: " + super.email + "\nTelefone: " + this.telefone);
    }
}
