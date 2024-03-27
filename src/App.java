import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        int tempoDevolução = 15;

        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setNome("João");
        bibliotecario.setCpf("123.456.789-00");
        bibliotecario.setEmail("teste@mail.com");
        bibliotecario.setSalario(-2550.50);
        bibliotecario.setLogin("joao123");
        bibliotecario.setSenha("123456");

        Leitor leitor1 = new Leitor("(34) 123456789");
        leitor1.setNome("Maria");
        leitor1.setCpf("987.654.321-00");
        leitor1.setEmail("leitor@mail.com");
        System.out.println("Total de leitores: " + Leitor.getTotalLeitores());


        Livro livro1 = new Livro();
        livro1.setTitulo("O Senhor dos Anéis");
        livro1.setAnoPublicacao(1954);
        livro1.setAutor("J.R.R. Tolkien");
        livro1.setIsbn("978-0-395-19395-7");


        Revista revista1 = new Revista();
        revista1.setTitulo("Superinteressante");
        revista1.setAnoPublicacao(1987);
        revista1.setEditora("Abril");
        revista1.setNumeroEdicao(1);


        Emprestimo emprestimo1 = new Emprestimo(leitor1, livro1, bibliotecario, LocalDate.now().plusDays(tempoDevolução));


        //Conceito de sobrecarga
        System.out.println(emprestimo1.atraso());
        

        System.out.println(emprestimo1.atraso(LocalDate.now().plusDays(18)));


        System.out.println("Bibliotecário - ");
        bibliotecario.informacoes();

        //Conceito de sobrescrita
        System.out.println("Leitor - ");
        leitor1.informacoes();

        System.out.println("Livro - ");
        livro1.informacoes();

        System.out.println("Revista - ");
        revista1.informacoes();

        System.out.println(emprestimo1.toString());


    }
}
