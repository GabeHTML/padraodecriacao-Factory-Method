package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoFactoryTest {

    @Test
    void deveRetornarExcecaoParaMercadoInexistente() {
        try {
            IMercado mercado = MercadoFactory.obterMercado("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Mercado inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMercadoInvalido() {
        try {
            IMercado mercado = MercadoFactory.obterMercado("Jubilamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Mercado inválido", e.getMessage());
        }
    }
}