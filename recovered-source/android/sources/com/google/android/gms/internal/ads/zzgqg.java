package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqg extends BroadcastReceiver implements zzgpl, zzgfo {

    /* JADX INFO: renamed from: a */
    public final Context f18044a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f18045b;

    /* JADX INFO: renamed from: c */
    public boolean f18046c = true;

    public zzgqg(Context context, ExecutorService executorService) {
        this.f18044a = context;
        this.f18045b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: a */
    public final void mo7050a(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.f18046c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: b */
    public final void mo7051b(HashMap map) {
        boolean z;
        synchronized (this) {
            z = this.f18046c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: c */
    public final void mo7052c(HashMap map, Context context, View view) {
        boolean z;
        synchronized (this) {
            z = this.f18046c;
        }
        map.put("up", Boolean.valueOf(z));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f18046c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.f18046c = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final ListenableFuture zza() {
        return zzhcf.m7369c(this.f18045b, new Callable() { // from class: com.google.android.gms.internal.ads.zzgqf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgqg zzgqgVar = this.f18043a;
                zzgqgVar.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                zzgqgVar.f18044a.registerReceiver(zzgqgVar, intentFilter);
                return null;
            }
        });
    }
}
