package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoProdutoTest {

    @Test
    void deveExecutarProduto() {
        IMercado servico = MercadoFactory.obterMercado("Produto");
        assertEquals("Produto concluido", mercado.executar());
    }

    @Test
    void deveEncerrarProduto() {
        IMercaco mercado = ServicoFactory.obterMercado("Produto");
        assertEquals("Produto encerrado", mercado.encerrar());
    }

}