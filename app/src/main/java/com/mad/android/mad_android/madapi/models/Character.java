package com.mad.android.mad_android.madapi.models;

/**
 * Created by Ju on 18/01/2018.
 */

public class Character {
    private int CharacterId;
    private String Name;
    private boolean Alive;
    private int Level;
    private int Xp;
    private int Money;
    private int User_id;

    public int getCharacterId() {
        return CharacterId;
    }

    public void setCharacterId(int characterId) {
        CharacterId = characterId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isAlive() {
        return Alive;
    }

    public void setAlive(boolean alive) {
        Alive = alive;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getXp() {
        return Xp;
    }

    public void setXp(int xp) {
        Xp = xp;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }
}
