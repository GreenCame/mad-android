package com.mad.android.mad_android.madapi.dispatch;

import com.mad.android.mad_android.madapi.models.*;
import com.mad.android.mad_android.madapi.models.Item;

import java.util.List;

/**
 * Created by Ju on 18/01/2018.
 */

public class Character {
    private List<Attribute> attributes;
    private List<Loot> loots;
    private List<Item> Items;
    private List<Attribute> Attributes;
    private List<StatusEffect> StatusEffects;
    private List<Ability> Abilities;
    private User user;

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<StatusEffect> getStatusEffects() {
        return StatusEffects;
    }

    public void setStatusEffects(List<StatusEffect> statusEffects) {
        StatusEffects = statusEffects;
    }

    public List<Ability> getAbilities() {
        return Abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        Abilities = abilities;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Loot> getLoots() {
        return loots;
    }

    public void setLoots(List<Loot> loots) {
        this.loots = loots;
    }

    public List<Item> getItems() {
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }
}
