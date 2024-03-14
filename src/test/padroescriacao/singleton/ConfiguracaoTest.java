package test.padroescriacao.singleton;

import main.padroescriacao.singleton.Configuracao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracaoTest {

        @Test
        public void testeDeveRetornarNivelLog() {
            Configuracao.getInstance().setNivelLog("Error");
            assertEquals("Error", Configuracao.getInstance().getNivelLog());
        }

        @Test
        public void testeDeveRetornarDataDoLog() {
            Configuracao.getInstance().setFormatoData("02/02/2015");
            assertEquals("02/02/2015", Configuracao.getInstance().getFormatoData());
        }
}
