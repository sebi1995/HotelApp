package com.example.zdroa.hotelapp.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Room;

@Entity(tableName = "bookings_table")
class Bookings {

    //booking reference number
    @PrimaryKey(autoGenerate = true)
    private Integer primaryKey;

    @ColumnInfo(name = "start_date")
    private String start_date;

    @ColumnInfo(name = "start_time")
    private String start_time;

    @ColumnInfo(name = "room")
    private Room room;

    @ColumnInfo(name = "client")
    private Accounts account;

    ////////////////////////////////////////


    public void setPrimaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    ////////////////////////////////////////
    ////////////////////////////////////////
    ////////////////////////////////////////

    public Integer getPrimaryKey() {
        return primaryKey;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public Accounts getAccount() {
        return account;
    }

    public Room getRoom() {
        return room;
    }
}
