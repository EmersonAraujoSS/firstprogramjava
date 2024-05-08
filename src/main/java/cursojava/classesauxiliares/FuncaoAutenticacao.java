package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Somente receber alguém que tem o contrato da interface de PermitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {

    private final PermitirAcesso permitirAcesso;


    public boolean autenticar(){
       return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }
}
