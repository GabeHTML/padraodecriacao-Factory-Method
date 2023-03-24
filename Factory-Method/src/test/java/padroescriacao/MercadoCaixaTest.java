package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

class MercadoCaixaTest {

    @Test
    void deveExecutarCaixa() {
        IMercado mercado = MercadoFactory.obterMercado("Caixa");
        assertEquals("Caixa concluido", mercado.executar());
    }

    @Test
    void deveEncerrarCaixa() {
        IMercado mercado = MercadoFactory.obterMercado("Caixa");
        assertEquals("Caixa encerrado", mercado.encerrar());
    }

}