package com.kotlin.task.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a8\u0006\f"}, d2 = {"Lcom/kotlin/task/database/dao/ProfileDao;", "", "getAllProfileList", "Landroidx/lifecycle/LiveData;", "", "Lcom/kotlin/task/database/entity/ProfileList;", "getSearchList", "name", "", "insert", "", "profileList", "app_debug"})
public abstract interface ProfileDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.task.database.entity.ProfileList> profileList);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM all_profile_data")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.kotlin.task.database.entity.ProfileList>> getAllProfileList();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM all_profile_data WHERE name LIKE \'%\' || :name || \'%\'")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.kotlin.task.database.entity.ProfileList>> getSearchList(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}