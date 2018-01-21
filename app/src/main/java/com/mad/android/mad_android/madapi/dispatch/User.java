package com.mad.android.mad_android.madapi.dispatch;

import com.mad.android.mad_android.madapi.models.Character;

import java.util.List;

/**
 * Created by Ju on 18/01/2018.
 */

public class User {
    private com.mad.android.mad_android.madapi.models.User user;
    private List<Character> Characters;

    public com.mad.android.mad_android.madapi.models.User getUser() {
        return user;
    }

    public void setUser(com.mad.android.mad_android.madapi.models.User user) {
        this.user = user;
    }

    public List<Character> getCharacters() {
        return Characters;
    }

    public void setCharacters(List<Character> characters) {
        Characters = characters;
    }
}
