package com.example.dimple.sample;

import java.util.ArrayList;

public class UserList {

    private String listName;
    private int userID;
    private ArrayList<ListItem> listItems = new ArrayList<ListItem>();

    public UserList(){

    }

    public UserList(String listName){
        this.listName = listName;
    }



    public String getListName(){
        return listName;
    }

    public void setListName(String listName){
        this.listName = listName;
    }

    public ArrayList<ListItem> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<ListItem> listItems) {
        this.listItems = listItems;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}


