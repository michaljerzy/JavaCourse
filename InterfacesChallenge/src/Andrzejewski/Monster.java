package Andrzejewski;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int life;
    private String variety;

    public Monster(String name, int hitPoints, int life, String variety) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.life = life;
        this.variety = variety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", life=" + life +
                ", variety='" + variety + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> value = new ArrayList<>();
        value.add(0 , this.name);
        value.add(1 , "" + this.life);
        value.add(2 , "" + this.hitPoints);
        value.add(3 , this.variety);
        return value;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.life = Integer.parseInt(savedValues.get(1));
            this.hitPoints = Integer.parseInt(savedValues.get(2));
            this.variety = savedValues.get(3);
        }
    }
}
