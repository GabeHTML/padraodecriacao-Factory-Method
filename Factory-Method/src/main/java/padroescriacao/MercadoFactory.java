package padroescriacao.factorymethod;

public class MercadoFactory {

    public static IMercado obterMercado(String mercado) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Mercado" + mercado);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Mercado inexistente");
        }
        if (!(objeto instanceof IMercado)) {
            throw new IllegalArgumentException("Mercado inválido");
        }
        return (IMercado) objeto;
    }
}
