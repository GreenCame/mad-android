package com.mad.android.mad_android.madapi.models;

/**
 * Created by Ju on 18/01/2018.
 */

public class Loot {
    private int LootId;
    private int Xp;
    private int Money;

    public int getLootId() {
        return LootId;
    }

    public void setLootId(int lootId) {
        LootId = lootId;
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
}
