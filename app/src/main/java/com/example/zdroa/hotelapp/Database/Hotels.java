package com.example.zdroa.hotelapp.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.content.Intent;

import com.example.zdroa.hotelapp.Objects.Account;
import com.example.zdroa.hotelapp.Objects.Room;

import java.util.List;

@Entity(tableName = "hotels_table")
class Hotels {

    @PrimaryKey(autoGenerate = true)
    private Integer primaryKey;

    @ColumnInfo(name = "hotel_name")
    private String hotel_name;

    @ColumnInfo(name = "accounts")
    private List<Account> accounts;

    @ColumnInfo(name = "rooms")
    private List<Room> rooms;

    /////////////////////////////////


    public void setPrimaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    ////////////////////////////////////


    public Integer getPrimaryKey() {
        return primaryKey;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public String getHotel_name() {
        return hotel_name;
    }
}
