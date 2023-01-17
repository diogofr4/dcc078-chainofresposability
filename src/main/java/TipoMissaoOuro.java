public class TipoMissaoOuro implements TipoMissao{
    private static TipoMissaoOuro tipoMissaoOuro = new TipoMissaoOuro();

    private TipoMissaoOuro() {};

    public static TipoMissaoOuro getTipoMissaoOuro() {
        return tipoMissaoOuro;
    }
}
