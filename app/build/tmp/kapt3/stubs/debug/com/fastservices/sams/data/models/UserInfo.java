package com.fastservices.sams.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u000eH\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011\u00a8\u00060"}, d2 = {"Lcom/fastservices/sams/data/models/UserInfo;", "", "access_token", "", "token_type", "expires_in", "", "UserId", "DistributionID", "UserName", "DistributorTypeID", "DistributorName", "OTPicturesManadatory", "DistributorRegister", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDistributionID", "()Ljava/lang/String;", "setDistributionID", "(Ljava/lang/String;)V", "getDistributorName", "getDistributorRegister", "()I", "getDistributorTypeID", "getOTPicturesManadatory", "getUserId", "setUserId", "getUserName", "getAccess_token", "getExpires_in", "()J", "getToken_type", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class UserInfo {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String access_token = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String token_type = null;
    private final long expires_in = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String UserId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DistributionID;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String UserName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DistributorTypeID = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DistributorName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String OTPicturesManadatory = null;
    @com.google.gson.annotations.SerializedName(value = "IsDistributorRegister")
    private final int DistributorRegister = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccess_token() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken_type() {
        return null;
    }
    
    public final long getExpires_in() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistributionID() {
        return null;
    }
    
    public final void setDistributionID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistributorTypeID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistributorName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOTPicturesManadatory() {
        return null;
    }
    
    public final int getDistributorRegister() {
        return 0;
    }
    
    public UserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String access_token, @org.jetbrains.annotations.NotNull()
    java.lang.String token_type, long expires_in, @org.jetbrains.annotations.NotNull()
    java.lang.String UserId, @org.jetbrains.annotations.NotNull()
    java.lang.String DistributionID, @org.jetbrains.annotations.NotNull()
    java.lang.String UserName, @org.jetbrains.annotations.NotNull()
    java.lang.String DistributorTypeID, @org.jetbrains.annotations.NotNull()
    java.lang.String DistributorName, @org.jetbrains.annotations.NotNull()
    java.lang.String OTPicturesManadatory, int DistributorRegister) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.models.UserInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String access_token, @org.jetbrains.annotations.NotNull()
    java.lang.String token_type, long expires_in, @org.jetbrains.annotations.NotNull()
    java.lang.String UserId, @org.jetbrains.annotations.NotNull()
    java.lang.String DistributionID, @org.jetbrains.annotations.NotNull()
    java.lang.String UserName, @org.jetbrains.annotations.NotNull()
    java.lang.String DistributorTypeID, @org.jetbrains.annotations.NotNull()
    java.lang.String DistributorName, @org.jetbrains.annotations.NotNull()
    java.lang.String OTPicturesManadatory, int DistributorRegister) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
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