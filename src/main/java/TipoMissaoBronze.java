public class TipoMissaoBronze implements TipoMissao{
    private static TipoMissaoBronze TipoMissaoBronze = new TipoMissaoBronze();

    private TipoMissaoBronze() {};

    public static TipoMissaoBronze getTipoMissaoBronze() {
        return TipoMissaoBronze;
    }
}
