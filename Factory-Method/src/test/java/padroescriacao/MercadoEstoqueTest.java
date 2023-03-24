package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

class MercadoEstoqueTest {

    @Test
    void deveExecutarEstoque() {
        IMercado mercado = MercadoFactory.obterMercado("Estoque");
        assertEquals("Estoque concluido", mercado.executar());
    }

    @Test
    void deveEncerrarEstoque() {
        IMercado mercado = MercadoFactory.obterMercado("Estoque");
        assertEquals("Estoque encerrado", mercado.cancelar());
    }

}