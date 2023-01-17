import java.util.ArrayList;

public abstract class Aventureiro {

    protected ArrayList listMissoes = new ArrayList();
    private Aventureiro aventureiroSuperior;

    public void setAventureiroSuperior(Aventureiro aventureiroSuperior) {
        this.aventureiroSuperior = aventureiroSuperior;
    }

    public abstract String getDescricaoNivel();

    public String aceitarMissao(Missao missao){
        if(listMissoes.contains(missao.getTipoMissao())){
            return getDescricaoNivel();
        }
        else{
            if(aventureiroSuperior != null){
                return aventureiroSuperior.aceitarMissao(missao);
            }
            else {
                return "Missão pendente";
            }
        }
    }
}
