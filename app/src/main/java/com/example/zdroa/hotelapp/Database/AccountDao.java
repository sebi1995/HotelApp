package com.example.zdroa.hotelapp.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.zdroa.hotelapp.Objects.Account;

import java.util.List;

@Dao
interface AccountDao {

    @Query("SELECT * FROM accounts_table")
    List<Account> getAll();

    @Query("SELECT * FROM accounts_table WHERE personal_id LIKE :personal_id LIMIT 1")
    Account findByID(String personal_id);

    @Query("SELECT * FROM accounts_table WHERE username LIKE :username AND password LIKE :password LIMIT 1")
    Account login(String username, String password);

    @Insert
    void insertAll(Account... accounts);

    @Delete
    void delete(Account account);
}
