package com.example.punchandroidtest.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/punchandroidtest/util/NetworkReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class NetworkReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.punchandroidtest.util.NetworkReceiver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIFI = "Wi-Fi";
    private static boolean wifiConnected = false;
    private static boolean mobileConnected = false;
    private static boolean refreshDisplay = true;
    
    public NetworkReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/example/punchandroidtest/util/NetworkReceiver$Companion;", "", "()V", "WIFI", "", "mobileConnected", "", "getMobileConnected", "()Z", "setMobileConnected", "(Z)V", "refreshDisplay", "getRefreshDisplay", "setRefreshDisplay", "wifiConnected", "getWifiConnected", "setWifiConnected", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getWifiConnected() {
            return false;
        }
        
        public final void setWifiConnected(boolean p0) {
        }
        
        public final boolean getMobileConnected() {
            return false;
        }
        
        public final void setMobileConnected(boolean p0) {
        }
        
        public final boolean getRefreshDisplay() {
            return false;
        }
        
        public final void setRefreshDisplay(boolean p0) {
        }
    }
}