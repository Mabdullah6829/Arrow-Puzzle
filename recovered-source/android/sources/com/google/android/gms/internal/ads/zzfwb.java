package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwb extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfwc f16693a;

    public zzfwb(zzfwc zzfwcVar) {
        Objects.requireNonNull(zzfwcVar);
        this.f16693a = zzfwcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zEquals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
        zzfwc zzfwcVar = this.f16693a;
        if (zEquals) {
            zzfwcVar.m6738a(true, zzfwcVar.f16697c);
            zzfwcVar.f16696b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfwcVar.m6738a(false, zzfwcVar.f16697c);
            zzfwcVar.f16696b = false;
        }
    }
}
