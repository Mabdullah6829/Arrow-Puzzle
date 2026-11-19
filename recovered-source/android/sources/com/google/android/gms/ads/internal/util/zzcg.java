package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzcg {

    /* JADX INFO: renamed from: d */
    public boolean f3563d;

    /* JADX INFO: renamed from: e */
    public Context f3564e;

    /* JADX INFO: renamed from: c */
    public boolean f3562c = false;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f3561b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final BroadcastReceiver f3560a = new zzcf(this);

    /* JADX INFO: renamed from: a */
    public final synchronized void m3144a(Context context) {
        try {
            if (this.f3562c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f3564e = applicationContext;
            if (applicationContext == null) {
                this.f3564e = context;
            }
            zzbix.m5032a(this.f3564e);
            zzbio zzbioVar = zzbix.f8143I4;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            this.f3563d = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8771tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f3564e.registerReceiver(this.f3560a, intentFilter);
            } else {
                this.f3564e.registerReceiver(this.f3560a, intentFilter, 4);
            }
            this.f3562c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3145b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f3563d) {
            this.f3561b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
