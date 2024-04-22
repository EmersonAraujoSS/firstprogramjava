package cursojava.classes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private Long id;
    private String nome;
    private BigDecimal valor;

    private List<Produto> listaProdutos = new ArrayList<Produto>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", listaProdutos=" + listaProdutos +
                '}';
    }
}
