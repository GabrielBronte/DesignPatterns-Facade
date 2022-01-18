import java.util.ArrayList;
import java.util.List;

public abstract class Status {
    private List<Fighter> fight = new ArrayList<Fighter>();

    public void addFight(Fighter fighter){
        this.fight.add(fighter);
    }
    public boolean checkFight(Fighter fighter){
        return this.fight.contains(fighter);
    }
}