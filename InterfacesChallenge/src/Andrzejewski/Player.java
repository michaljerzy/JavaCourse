package Andrzejewski;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    private float life;
    private String weapon;
    private String type;


    public Player(String name, int hitPoints, int strength, float life, String weapon, String type) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.life = life;
        this.weapon = weapon;
        this.type = type;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, this.weapon);
        values.add(2, "" + this.hitPoints);
        values.add(3,"" + this.life);
        values.add(4, this.type);


        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public float getLife() {
        return life;
    }

    public void setLife(float life) {
        this.life = life;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", life=" + life +
                ", weapon='" + weapon + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
