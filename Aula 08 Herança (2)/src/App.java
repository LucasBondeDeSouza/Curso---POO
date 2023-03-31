public class App {
    public static void main(String[] args) throws Exception {
        
        Visitante v1= new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        System.out.println("                                            ");
        System.out.println("****************************************");
        System.out.println("                                            ");

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        System.out.println("                                            ");
        System.out.println("****************************************");
        System.out.println("                                            ");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        System.out.println("                                            ");
        System.out.println("****************************************");
        System.out.println("                                            ");

        Tecnico t1 = new Tecnico();
        t1.setNome("Fernando");
        t1.setIdade(12);
        t1.setCurso("Matematica");
        t1.setMatricula(135325);
        t1.setRegistroProficional(62454178);
        t1.setSexo("M");
        System.out.println(t1.toString());

        System.out.println("                                            ");
        System.out.println("****************************************");
        System.out.println("                                            ");

        Professor p1 = new Professor();
        p1.setNome("João");
        p1.setIdade(55);
        p1.setEspecialidade("Informatica");
        p1.setSalario(2.500f);
        p1.setSexo("M");
        p1.receberAumeto();
        System.out.println(p1.toString());

    }
}