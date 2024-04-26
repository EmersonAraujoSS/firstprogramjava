package cursojava.classes;

public class ExecucaoContaBanco {
    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(5678);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        p1.depositar(500);
        p2.depositar(400);

        p1.estadoAtual();
        p2.estadoAtual();

    }

}
