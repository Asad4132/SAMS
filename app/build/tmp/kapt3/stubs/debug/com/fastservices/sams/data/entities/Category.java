package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "CATEGORY")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\b\u0010\u001b\u001a\u00020\u0005H\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/fastservices/sams/data/entities/Category;", "Ljava/io/Serializable;", "SKU_HIE_ID", "", "SKU_HIE_NAME", "", "PARENT_SKU_HIE_ID", "(ILjava/lang/String;I)V", "getPARENT_SKU_HIE_ID", "()I", "setPARENT_SKU_HIE_ID", "(I)V", "getSKU_HIE_ID", "setSKU_HIE_ID", "getSKU_HIE_NAME", "()Ljava/lang/String;", "setSKU_HIE_NAME", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Category implements java.io.Serializable {
    @android.arch.persistence.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "skU_HIE_ID")
    private int SKU_HIE_ID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "skU_HIE_NAME")
    private java.lang.String SKU_HIE_NAME;
    @com.google.gson.annotations.SerializedName(value = "parenT_SKU_HIE_ID")
    private int PARENT_SKU_HIE_ID;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final int getSKU_HIE_ID() {
        return 0;
    }
    
    public final void setSKU_HIE_ID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSKU_HIE_NAME() {
        return null;
    }
    
    public final void setSKU_HIE_NAME(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPARENT_SKU_HIE_ID() {
        return 0;
    }
    
    public final void setPARENT_SKU_HIE_ID(int p0) {
    }
    
    public Category(int SKU_HIE_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_HIE_NAME, int PARENT_SKU_HIE_ID) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.Category copy(int SKU_HIE_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_HIE_NAME, int PARENT_SKU_HIE_ID) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}