package br.com.falves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class MainTest {

    @Test
    void deveVerificarListaDeMulheres () {
        List<Pessoa> pessoas = criarListaDePessoas();

        List<Pessoa> listaFeminina = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .toList();

        assertTrue(listaFeminina.stream()
                .allMatch(pessoa -> pessoa.getSexo().equalsIgnoreCase("F")), "Nem todas as pessoas na lista são mulheres.");
    }

    private static List<Pessoa> criarListaDePessoas() {
        List<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Rafael", 22, "M"));
        lista.add(new Pessoa("Pietra", 24, "F"));
        lista.add(new Pessoa("Marcelo", 49, "M"));
        lista.add(new Pessoa("Giovanna", 40, "F"));
        lista.add(new Pessoa("Maicon", 38, "M"));
        lista.add(new Pessoa("Isabela", 30, "F"));
        lista.add(new Pessoa("Jonathan", 40, "M"));
        lista.add(new Pessoa("Edna", 50, "F"));

        return lista;
    }
}