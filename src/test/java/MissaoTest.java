import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissaoTest {

    AventureiroEspecialista aventureiroEspecialista;
    AventureiroExperiente aventureiroExperiente;
    AventureiroMestre aventureiroMestre;
    AventureiroIniciante aventureiroIniciante;

    @BeforeEach
    void setUp() {
        aventureiroMestre = new AventureiroMestre(null);
        aventureiroEspecialista = new AventureiroEspecialista(aventureiroMestre);
        aventureiroExperiente = new AventureiroExperiente(aventureiroEspecialista);
        aventureiroIniciante = new AventureiroIniciante(aventureiroExperiente);
    }

    @Test
    void deveRetornarInicianteParaAceitarMissaoBronze() {
        assertEquals("Iniciante", aventureiroIniciante.aceitarMissao(new Missao(TipoMissaoBronze.getTipoMissaoBronze())));
    }

    @Test
    void deveRetornarExperienteParaAceitarMissaoPrata() {
        assertEquals("Experiente", aventureiroIniciante.aceitarMissao(new Missao(TipoMissaoPrata.getTipoMissaoPrata())));
    }

    @Test
    void deveRetornarEspecialistaParaAceitarMissaoOuro() {
        assertEquals("Especialista", aventureiroIniciante.aceitarMissao(new Missao(TipoMissaoOuro.getTipoMissaoOuro())));
    }

    @Test
    void deveRetornarMestreParaAceitarMissaoDiamante() {
        assertEquals("Mestre", aventureiroIniciante.aceitarMissao(new Missao(TipoMissaoDiamante.getTipoMissaoDiamante())));
    }

    @Test
    void deveRetornarMissaoPendenteParaMissaoObsidiana() {
        assertEquals("Missão pendente", aventureiroIniciante.aceitarMissao(new Missao(TipoMissaoObsidiana.getTipoMissaoObsidiana())));
    }
}
