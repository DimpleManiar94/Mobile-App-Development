package com.example.dimple.sample;

import java.util.ArrayList;

public class UserList {

    private String listName;
    private int userID;
    private ArrayList<String> listItems;

    public void UserList(){

    }
    public String getListName(){
        return listName;
    }

    public void setListName(String listName){
        this.listName = listName;
    }

    public ArrayList<String> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<String> listItems) {
        this.listItems = listItems;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}


