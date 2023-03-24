package padroescriacao.factorymethod;

public class MercadoCaixa implements IMercado {

    public String executar() {
        return "Caixa concluido";
    }

    public String encerrar() {
        return "Caixa encerrado";
    }
}
