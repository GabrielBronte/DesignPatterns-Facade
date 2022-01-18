import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {
    @Test
    void deveRetornarContrato(){
        Fighter fighter = new Fighter();
        Contract.getInstancia().addFight(fighter);
        assertEquals(false, fighter.toFight());
    }
    @Test
    void deveRetornarAntiDoping(){
        Fighter fighter = new Fighter();
        AntiDoping.getInstancia().addFight(fighter);
        assertEquals(false, fighter.toFight());
    }
    @Test
    void deveRetornarPesagem(){
        Fighter fighter = new Fighter();
        Weighing.getInstancia().addFight(fighter);
        assertEquals(false, fighter.toFight());
    }
    @Test
    void verificaPreparadoParaLutar(){
        Fighter fighter = new Fighter();
        assertEquals(true, fighter.toFight());
    }

}