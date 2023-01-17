public class TipoMissaoDiamante implements TipoMissao{
    private static TipoMissaoDiamante TipoMissaoDiamante = new TipoMissaoDiamante();

    private TipoMissaoDiamante() {};

    public static TipoMissaoDiamante getTipoMissaoDiamante() {
        return TipoMissaoDiamante;
    }
}
