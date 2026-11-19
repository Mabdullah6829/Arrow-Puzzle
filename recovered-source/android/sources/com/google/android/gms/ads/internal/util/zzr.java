package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzr extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzs f3625a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zEquals = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
        zzs zzsVar = this.f3625a;
        if (zEquals) {
            zzsVar.f3631e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzsVar.f3631e = false;
        }
    }
}
