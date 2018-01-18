package com.example.vinsonhuang.dealmedan.utilities;

/**
 * Created by User on 11/30/2017.
 */



import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

import com.example.vinsonhuang.dealmedan.model.Favorite;
import com.example.vinsonhuang.dealmedan.model.FavoriteData;
import com.example.vinsonhuang.dealmedan.model.User;
import com.example.vinsonhuang.dealmedan.model.UserData;
import com.google.gson.Gson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//shared preferences merupakan sebuah cache pada android jadi kita bisa menyimpan data berupa string di android
public class Shared {
    // Shared Preferences
    private SharedPreferences sharedPreferences;
    // Editor for Shared preferences
    private Editor editor;
    // Context

    Context context;
    // Shared pref mode
    int PRIVATE_MODE = 0;

    private static final String USER = "user";
    private static final String FAVORITE = "favorite";
    // Sharedpref file name
    private static final String PREF_NAME = "loginPrefs";

    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";

    // User name (make variable public to access from outside)
    public static final String KEY_EMAIL = "email";

    // Email address (make variable public to access from outside)
    public static final String KEY_NAMA = "nama";

    public static final String KEY_PHONE = "phone";

    public static final String KEY_USERID = "userid";


    // Constructor
    public Shared(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }


    // ini merupakan fungsi untuk menyim data saat user login
    //jadi jika berhasil login data saya simpan dan buat islogged in ny true supaya saat masuk kembali tidak perlu login lagi
    public void createLoginSession(String vemail, int id, String nama, String phone){
        // Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);
        // Storing email in pref
        editor.putString(KEY_EMAIL, vemail);
        editor.putInt(KEY_USERID, id);
        editor.putString(KEY_NAMA, nama);
        editor.putString(KEY_PHONE, phone);


        // commit changes
        editor.commit();
    }



    // FUNGSI INI UNTUK MENGAMBIL DATA YANG KITA SIMPAN MELALUI KEY
    //SEPERI KITA MAU SIMPAN EMAIL KITA MEMAKAI KEY_EMAIL SEBAGAI SUATU PENANDA DI CACHE
    //JADI KETIKA KITA PANGGIL KEY_EMAIL MAKA DIA AKAN MERETURN DATA EMAIL KITA
    public String getSession(String key){
        String a = sharedPreferences.getString(key, null);

        return a;
    }

    public int getUserId(){
        int a = sharedPreferences.getInt(KEY_USERID, 0);

        return a;
    }
    /**
     * Clear session details UNTUK LOGOUT
     * */
    public void clearSession(){
        // Clearing all data from Shared Preferences


        editor.clear();
        editor.commit();

        // After logout redirect user to Loing Activity

    }
    /**
     * Quick check for login
     * **/
    // Get Login State
    public boolean isLoggedIn(){
        return sharedPreferences.getBoolean(IS_LOGIN, false);
    }


    //JADI DATA FAVORITE SAYA MASUKIN KE MODEL FAVORITE ADATA DALAM BENTUK LIST<modelnya>
    // jadi cnth datany seperti gini
    //array 1 : id : 1 (user 1), favid= 1,2,3,4 (bersisi id detil item deal medan yang dia simpan)
    // karena shared prefrences tidak menssuport untuk menyimpan array model jadi saya memakai gson tojson untuk mengubah array model ny menjadi string supaya dapat disimpan oleh shredpreference
    public void saveFavorite(Favorite data){
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(FAVORITE,Context.MODE_PRIVATE);
        editor = settings.edit();
        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(data);
        editor.putString("Data", jsonFavorites);
        editor.commit();
    }

    public Favorite getFavorite(){
        SharedPreferences settings;
        Favorite data;
        settings = context.getSharedPreferences(FAVORITE,
                Context.MODE_PRIVATE);

        if (settings.contains("Data")) {
            String jsonFavorites = settings.getString("Data", null);
            Gson gson = new Gson();
            data = gson.fromJson(jsonFavorites,
                    Favorite.class);
            return data;
        }else{
            return null;
        }

    }

    public String[] getFavList(){
        if(getFavorite()!=null){
            for (FavoriteData object : getFavorite().getFavData()) {
                if (object.getId() == getUserId()) {

                    if (object.getFavid().equals("")) {
                        return new String[0];
                    } else {
                        String a ="";
                        String b[]= object.getFavid().split(",");
                        return b;

                    }
                }
            }
        }else{
            return new String[0];
        }

        return new String[0];
    }
    public boolean getFavDetail(String id){
        if(getFavorite()!=null){
            for (FavoriteData object : getFavorite().getFavData()) {
                if (object.getId() == getUserId()) {

                    if (object.getFavid().equals("")) {
                        return false;
                    } else {
                        String a ="";
                        String b[]= object.getFavid().split(",");

                        for(int i=0; i<b.length;i++){
                            Log.d("sad",b[i]);
                            if(b[i].equals(id)){
                                return true;
                            }
                        }
                    }
                }
            }
        }else{
            return false;
        }
        return false;
    }
    public void insertFavorite(String id, String action){
        if(getFavorite()!=null){
            Favorite fav = new Favorite();
            List<FavoriteData> listb= new ArrayList<FavoriteData>();
            for (FavoriteData object : getFavorite().getFavData()) {

                if (object.getId()== getUserId()) {

                    if (object.getFavid().equals("")) {
                        object.setFavid(id);
                        Log.d("1", id);
                    } else {
                        if (action.equals("delete")) {
                            String a = "";
                            String b[] = object.getFavid().split(",");

                            for (int i = 0; i < b.length; i++) {
                                Log.d("2", b[i]);
                                Log.d("2", id);
                                if (!b[i].equals(id)) {
                                    a = a + b[i] + ",";
                                }
                            }
                            if (a.length() != 0) {
                                a = a.substring(0, a.length() - 1);
                            }

                            object.setFavid(a);
                            Log.d("2", a);
                        } else {

                            object.setFavid(object.getFavid() + "," + id);

                        }
                    }
                }
                listb.add(object);
                fav.setFavData(listb);
                saveFavorite(fav);
            }


        }else{

            addFav(id);
        }



    }


    private void addFav(String id){

        Favorite a = new Favorite();
        List<FavoriteData> b= new ArrayList<FavoriteData>();
        FavoriteData c = new FavoriteData();
        c.setId(getUserId());
        c.setFavid(id);
        b.add(c);
        a.setFavData(b);
        saveFavorite(a);
    }

    public void saveUser(User data){
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(USER,Context.MODE_PRIVATE);
        editor = settings.edit();
        Gson gson = new Gson();
        String jsonFavorites = gson.toJson(data);
        editor.putString("Data", jsonFavorites);
        editor.commit();
    }
    //perlakuan sama seperi favorite
    public User getUser(){
        SharedPreferences settings;
        User data;
        settings = context.getSharedPreferences(USER,
                Context.MODE_PRIVATE);

        if (settings.contains("Data")) {
            String jsonFavorites = settings.getString("Data", null);
            Gson gson = new Gson();
            data = gson.fromJson(jsonFavorites,
                    User.class);
            return data;
        }else{
            return null;
        }

    }

    public String login(String email, String pass){
        if(getUser()!=null){

            for (UserData object : getUser().getUserData()) {
                if (object.getEmail().toLowerCase().equals(email.toLowerCase())) {
                    if(!object.getPassword().equals(pass)){
                        return "_wrongpass";
                    }else{
                        createLoginSession(object.getEmail(),object.getId(),object.getName(),object.getHp());
                        return object.getName();
                    }

                }
            }

        }

        return "_notregister";
    }

    public boolean insertUser(String nama, String nohp, String email, String pasword){
        if(getUser()!=null){

            for (UserData object : getUser().getUserData()) {
                if (object.getEmail().toLowerCase().equals(email.toLowerCase())) {
                    return false;
                }
            }

        }

        User a = new User();
        List<UserData> b= new ArrayList<UserData>();
        UserData c = new UserData();
        c.setEmail(email);
        c.setHp(nohp);
        if(getUser()!=null){
            c.setId(getUser().getUserData().size());
        }else{
            c.setId(0);
        }
        c.setPassword(pasword);
        c.setName(nama);
        b.add(c);
        a.setUserData(b);
        saveUser(a);

        return true;
    }

}
