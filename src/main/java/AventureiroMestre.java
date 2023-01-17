public class AventureiroMestre extends Aventureiro{
    public AventureiroMestre(Aventureiro superior) {
        listMissoes.add(TipoMissaoDiamante.getTipoMissaoDiamante());
        setAventureiroSuperior(superior);
    }

    @Override
    public String getDescricaoNivel() {
        return "Mestre";
    }
}
