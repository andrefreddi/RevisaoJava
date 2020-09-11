package BaralhoDeCartas;

import java.util.ArrayList;
import java.util.List;

public class Baralho {

    private final List<Carta> listaCartas;

    public Baralho() {
        listaCartas = new ArrayList<>();

        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        int pos = 0;
        Carta c;

        while (pos < 4) {
            for (int i = 1; i <= 10; i++) {
                c = new Carta();
                c.setNome(i + "");
                c.setNaipe(naipes[pos]);

                listaCartas.add(c);
            }

            c = new Carta();
            c.setNome("Valete");
            c.setNaipe(naipes[pos]);
            listaCartas.add(c);

            c = new Carta();
            c.setNome("Dama");
            c.setNaipe(naipes[pos]);
            listaCartas.add(c);

            c = new Carta();
            c.setNome("Rei");
            c.setNaipe(naipes[pos]);
            listaCartas.add(c);

            c = new Carta();
            c.setNome("Coringa");
            c.setNaipe("Coringa");
            listaCartas.add(c);

            pos++;
        }
    }

    public void imprimeBaralho(){
        StringBuilder sb = new StringBuilder();

        listaCartas.forEach((c) -> {
            sb.append("Carta: ").append(c.getNome()).append(" | Naipe: ").append(c.getNaipe()).append("\n");
        });

        System.out.println(sb.toString());
    }
}
