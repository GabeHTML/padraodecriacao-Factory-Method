package padroescriacao.factorymethod;

public class MercadoProduto implements IMercado {

    public String executar() {
        return "Produto concluido";
    }

    public String encerrar() {
        return "Produto encerrado";
    }
}
