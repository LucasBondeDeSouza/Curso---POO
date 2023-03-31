public class App {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno(null, 0, null, 0, null);
        Professor p3 = new Professor(null, 0, null, null, 0);
        Funcionario p4 = new Funcionario(null, 0, null, null, false);

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Clúdio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.receberAumento(500f);
        p4.mudarTrabalho();
        p2.cancelarMatr();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}