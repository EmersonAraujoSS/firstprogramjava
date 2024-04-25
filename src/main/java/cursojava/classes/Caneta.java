package cursojava.classes;

public class Caneta {

       public String modelo;
       public String cor;
       private float ponta;
       protected int carga;
       protected boolean tampada;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Tampada: " + tampada);
    }

    void rabiscar(){
        if(tampada == true){
            System.out.println("Erro! Não posso rabiscar.");
        }else {
            System.out.println("Estou Rabiscando");
        }
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ponta=" + ponta +
                ", carga=" + carga +
                ", tampada=" + tampada +
                '}';
    }

    void tampar(){
        if(tampada == true){
            System.out.println("Erro! Tampando");
        }else{
            System.out.println("Destampada");
        }


    }
}

