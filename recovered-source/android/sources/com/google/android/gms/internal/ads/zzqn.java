package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class zzqn extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzqp f20644a;

    public /* synthetic */ zzqn(zzqp zzqpVar) {
        this.f20644a = zzqpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzqp zzqpVar = this.f20644a;
        zzqpVar.m8838b(zzqj.m8834a(context, intent, zzqpVar.f20654j, zzqpVar.f20653i, zzqpVar.m8837a()));
    }
}
