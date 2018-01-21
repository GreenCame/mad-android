package com.mad.android.mad_android.madapi;

import com.mad.android.mad_android.madapi.models.Item;
import com.mad.android.mad_android.madapi.models.Character;
import com.mad.android.mad_android.madapi.models.User;

import java.util.List;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Ju on 19/01/2018.
 */

public interface Service {
    //|--------------------------------------------|
    //|USER                                        |
    //|--------------------------------------------|

    @GET("/auth")
    Call<User> getToken(@Query("token") String token);

    @POST("/users")
    Call<User> createUser(@Body User user);

    @GET("/users")
    Call<List<User>> getUsers();

    @GET("/users/{user_id}")
    Call<User> getUser(@Path("user_id") int userId);

    @GET("/users/{user_id}/?withCharacters=true")
    Call<com.mad.android.mad_android.madapi.dispatch.User> getUserWithCharacters(@Path("user_id") int userId);

    @PUT("/users/{user_id}")
    Class<User> setUser(@Path("user_id") int userId, @Body User user);

    @DELETE("/users/{user_id}")
    Class<String> deleteUser(@Path("user_id") int userId, @Body int id);

    //|--------------------------------------------|
    //|ITEM                                        |
    //|--------------------------------------------|

    @GET("/users/{ user_id }/items/")
    Call<List<Item>> getItems(@Path("user_id") int user_id);

    @GET("/users/{ user_id }/items/{item_id}")
    Call<Item> getItem(@Path("user_id") int user_id, @Path("item_id") int itemId);

    @PUT("/users/{ user_id }/items/{user_id}")
    Class<Item> setItem(@Path("user_id") int user_id, @Path("item_id") int itemId, @Body User user);

    @DELETE("/users/{ user_id }/items/{user_id}")
    Class<String> deleteItem(@Path("user_id") int user_id, @Path("item_id") int itemId, @Body int id);

    //|--------------------------------------------|
    //|CHARACTER                                   |
    //|--------------------------------------------|

    @GET("/users/{ user_id }/characters/")
    Call<List<Character>> getCharacters(@Path("user_id") int user_id);

    @GET("/users/{ user_id }/characters/{character_id}")
    Call<Character> getCharacter(@Path("user_id") int user_id, @Path("character_id") int character_id);

    @PUT("/users/{ user_id }/characters/{character_id}")
    Class<Character> setCharacter(@Path("user_id") int user_id, @Path("character_id") int character_id, @Body User user);

    @DELETE("/users/{ user_id }/characters/{character_id}")
    Class<String> deleteCharacter(@Path("user_id") int user_id, @Path("character_id") int character_id, @Body int id);

}
