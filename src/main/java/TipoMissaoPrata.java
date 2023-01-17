public class TipoMissaoPrata implements TipoMissao{
    private static TipoMissaoPrata TipoMissaoPrata = new TipoMissaoPrata();

    private TipoMissaoPrata() {};

    public static TipoMissaoPrata getTipoMissaoPrata() {
        return TipoMissaoPrata;
    }
}
