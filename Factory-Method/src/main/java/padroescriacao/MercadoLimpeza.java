package padroescriacao.factorymethod;

public class MercadoLimpeza implements IMercado {

    public String executar() {
        return "Limpeza concluido";
    }

    public String encerrar() {
        return "Limpeza encerrado";
    }
}
