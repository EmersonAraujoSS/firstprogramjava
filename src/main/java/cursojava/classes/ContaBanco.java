package cursojava.classes;

public class ContaBanco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    //MÉTODOS PERSONALIZADOS

    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Dono: " + this.dono);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }


    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo.equals("CC")){
            setSaldo(50);
        } else if (tipo.equals("CP")) {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        }else if (getSaldo() < 0) {
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (getStatus()){
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + getDono());
        }
    }

    public void sacar(float valor) {
        if (getStatus()){
            if (getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                 System.out.println("Saque realizado na conta de " + getDono());
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (getTipo().equals("CC")){
            v = 12;
        } else if (getTipo().equals("CP")) {
            v = 20;
        }

        if (getStatus()){
                setSaldo(getSaldo() - v);
                System.out.println("Mensal realizado com sucesso");
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }


    //MÉTODOS ESPECIAIS (CONSTRUTORES)
        public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
