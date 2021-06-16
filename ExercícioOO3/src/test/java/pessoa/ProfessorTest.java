package pessoa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    public void deveRetornarNomeDoProfessor() {
        Professor professor = new Professor();
        professor.setNome("Marina");
        assertEquals("Marina", professor.getNome());


    }

    @Test
    public void deveRetornarTitulacaoMaximaDoProfessor() {
        Professor professor = new Professor();
        professor.setTitulacaoMaxima("Doutorado");
        assertEquals("Doutorado", professor.getTitulacaoMaxima());


    }
}
