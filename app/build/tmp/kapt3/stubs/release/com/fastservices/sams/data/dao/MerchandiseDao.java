package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/fastservices/sams/data/dao/MerchandiseDao;", "", "deleteAll", "", "getAll", "", "Lcom/fastservices/sams/data/entities/Merchandise;", "insert", "m", "list", "app_release"})
public abstract interface MerchandiseDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.Merchandise> list);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.Merchandise m);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM Merchandise")
    public abstract java.util.List<com.fastservices.sams.data.entities.Merchandise> getAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM Merchandise")
    public abstract void deleteAll();
}