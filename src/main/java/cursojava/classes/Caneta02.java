package cursojava.classes;

public class Caneta02 {

   public String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;

   public Caneta02(String modelo, float ponta, String cor){

        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
   }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
       this.tampada = true;
    }

    public void destampar(){
       this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("Cor: " + cor);
        System.out.println("Tampada: " + tampada);
    }
}
