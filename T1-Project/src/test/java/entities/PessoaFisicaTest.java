package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaFisicaTest {

    @Test
    public void testCalculaCompletude() {
        NomeCompleto nome1 = new NomeCompleto("John", "", "Lennon");

        PessoaFisica pessoa1 = new PessoaFisica(nome1, "123.456.000-61", "18/0055444", "Masculino", "email@email.com");

        double porcentagem = pessoa1.calculaCompletude();

        Assertions.assertEquals(porcentagem, 93);
    }

}