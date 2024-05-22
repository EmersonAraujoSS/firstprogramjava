package cursojava.classes;

public class teste_saida_executavel {

    public static void main(String[] args) {

        System.out.println("Bom dia");
        System.out.println("Boa noite");

        classe_teste_saida t1 = new classe_teste_saida();
        t1.setA(32);

        classe_teste_saida t2 = new classe_teste_saida();
        t2.setB(2.34567);

        classe_teste_saida t3 = new classe_teste_saida();
        t3.setC("Bom dia");

        classe_teste_saida t4 = new classe_teste_saida();
        t4.setD(true);

        System.out.println(t1.getA());
        System.out.println(t2.getB());
        System.out.println(t3.getC());
        System.out.println(t4.getC());
        System.out.println(t1.getA() + t1.getC());
    }
}
