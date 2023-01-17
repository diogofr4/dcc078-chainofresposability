public class AventureiroEspecialista extends Aventureiro {
    public AventureiroEspecialista(Aventureiro superior) {
        listMissoes.add(TipoMissaoOuro.getTipoMissaoOuro());
        setAventureiroSuperior(superior);
    }

    @Override
    public String getDescricaoNivel() {
        return "Especialista";
    }
}
