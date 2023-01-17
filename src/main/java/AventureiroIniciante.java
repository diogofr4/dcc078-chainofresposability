public class AventureiroIniciante extends Aventureiro{
    public AventureiroIniciante(Aventureiro superior) {
        listMissoes.add(TipoMissaoBronze.getTipoMissaoBronze());
        setAventureiroSuperior(superior);
    }

    @Override
    public String getDescricaoNivel() {
        return "Iniciante";
    }
}
