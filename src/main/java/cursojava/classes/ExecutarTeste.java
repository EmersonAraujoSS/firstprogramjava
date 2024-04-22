package cursojava.classes;

import java.math.BigDecimal;

public class ExecutarTeste {

    public static void main (String[] args){

        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Módulo Orientação Objeto");
        produto1.setValor(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setId(2L);
        produto2.setNome("Módulo de Spring Boot API REST");
        produto2.setValor(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setId(3L);
        produto3.setNome("Módulo de Angular 8");
        produto3.setValor(BigDecimal.valueOf(100));

        Produto produto4 = new Produto();
        produto4.setId(4L);
        produto4.setNome("Módulo de Hibernate");
        produto4.setValor(BigDecimal.valueOf(300));

        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda Curso Formação Java");
        venda.setEnderecoEntrega("Entrega pelo email");
        venda.setId(10L);
        venda.setNomeCliente("Emerson Araujo");


        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);
        venda.getListaProdutos().add(produto3);
        venda.getListaProdutos().add(produto4);


        System.out.println("Valor da variável total venda: " + venda.getValorTotal());
        }
    }

