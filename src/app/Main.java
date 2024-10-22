package app;

import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Pinsir pinsir = new Pinsir("A", 10);
        Vulpix vulpix = new Vulpix("B", 10);
        Ninetales ninetales = new Ninetales("C", 10);
        Igglybuff igglybuff = new Igglybuff("D", 10);
        Jigglypuff jigglypuff = new Jigglypuff("E", 10);
        Wigglytuff wigglytuff = new Wigglytuff("F", 10);

        battle.addAlly(pinsir);
        battle.addAlly(vulpix);
        battle.addAlly(ninetales);

        battle.addFoe(igglybuff);
        battle.addFoe(jigglypuff);
        battle.addFoe(wigglytuff);

        battle.go();
    }
}
