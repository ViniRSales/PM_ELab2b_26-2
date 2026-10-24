import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {
    
    @Test
    void exemploEstruturaAaa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(1.0);
        // Assert
        assertEquals(0.0, aulas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    @Test
    void testaPagamento() {
        // Arrange
        Personal personal = new Personal("Joao", "P003");
        // Act — troque/complete conforme a classe escolhida
        personal.addAulaAvulsa(6);
        double pagamento = personal.registrarPagamento();
        // Assert
        assertEquals(3989.70, pagamento, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    @Test
    void registraPagamentoAulaAvulsa() {
        // Arrange
        Personal personal = new Personal("Maria", "P002");
        // Act — troque/complete conforme a classe escolhida
        personal.addAulaAvulsa(6);
        double valorAvulsas = personal.getValorAulasAvulsas();
        // Assert
        assertEquals(362.70, valorAvulsas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }


    
    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
