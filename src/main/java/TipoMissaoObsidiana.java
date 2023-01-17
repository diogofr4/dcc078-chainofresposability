public class TipoMissaoObsidiana implements TipoMissao{
    private static TipoMissaoObsidiana TipoMissaoObsidiana = new TipoMissaoObsidiana();

    private TipoMissaoObsidiana() {};

    public static TipoMissaoObsidiana getTipoMissaoObsidiana() {
        return TipoMissaoObsidiana;
    }
}
