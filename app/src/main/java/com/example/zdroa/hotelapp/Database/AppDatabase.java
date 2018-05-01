package com.example.zdroa.hotelapp.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Hotels.class, Accounts.class, Bookings.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract Hotels hotels();
    public abstract Accounts accounts();
    public abstract Bookings bookings();

}
