package pokemon;

import java.util.ArrayList;

public class SimpleMonster {
//removed final keyword in type and type advantages
    final String name;
    String type;
    String strongAgainst, weakAgainst;
    private int maxHP, hp, atk, def, xp, lvl;
    private static ArrayList<SimpleMonster> monsterList = new ArrayList<>();

    public SimpleMonster(String n, int m, int base){
        name = n;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public static ArrayList<SimpleMonster> getMonsterList() {
        return monsterList;
    }

    public void attack(SimpleMonster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public void special(){
        System.out.println(name + " did a pose.");
    }

    public void restoreHealth(){
        hp = maxHP;
    }
       //hello future kendrik, put in separate classes
    public class FireType extends SimpleMonster {
        FireType(){
            type = "fire";
            strongAgainst = "grass";
            weakAgainst = "water";
            atk = (int) (atk*1.3);
            def = (int) (def*0.7);
        }
   
    }
        
    public class WaterType extends SimpleMonster {
        WaterType(){
            type = "water";
            strongAgainst = "fire";
            weakAgainst = "grass";
            atk = (int) (atk*0.7);
            def = (int) (def*1.3);
        }
    }
    
    public class GrassType extends SimpleMonster {
        GrassType(){
            type = "grass";
            strongAgainst = "water";
            weakAgainst = "fire";
        }
    }
    }
    
}
