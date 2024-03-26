public class Bibliotecario extends Pessoa{
    private double salario;
    private String login;
    private String senha;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void informacoes(){
        System.out.println("Nome: " + super.nome + "\nCPF: " + super.cpf + "\nE-mail: " + super.email + "\nSalário: R$" + this.salario);
    }
}
