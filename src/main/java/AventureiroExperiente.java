public class AventureiroExperiente extends Aventureiro{
    public AventureiroExperiente(Aventureiro superior) {
        listMissoes.add(TipoMissaoPrata.getTipoMissaoPrata());
        setAventureiroSuperior(superior);
    }

    @Override
    public String getDescricaoNivel() {
        return "Experiente";
    }
}
