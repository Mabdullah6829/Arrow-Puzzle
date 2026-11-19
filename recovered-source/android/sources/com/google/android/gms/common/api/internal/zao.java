package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zao implements Runnable {

    /* JADX INFO: renamed from: s */
    public final zam f4362s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zap f4363t;

    public zao(zap zapVar, zam zamVar) {
        this.f4363t = zapVar;
        this.f4362s = zamVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.common.api.internal.LifecycleFragment, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        zap zapVar = this.f4363t;
        if (zapVar.f4364t) {
            zam zamVar = this.f4362s;
            ConnectionResult connectionResult = zamVar.f4359b;
            if (!connectionResult.m3394w()) {
                zapVar.m3468b();
                throw null;
            }
            ?? r3 = zapVar.f4255s;
            Activity activityM3468b = zapVar.m3468b();
            PendingIntent pendingIntent = connectionResult.f4143u;
            Preconditions.m3544h(pendingIntent);
            int i2 = zamVar.f4358a;
            int i3 = GoogleApiActivity.f4203t;
            Intent intent = new Intent(activityM3468b, (Class<?>) GoogleApiActivity.class);
            intent.putExtra("pending_intent", pendingIntent);
            intent.putExtra("failing_client_id", i2);
            intent.putExtra("notify_manager", false);
            r3.startActivityForResult(intent, 1);
        }
    }
}
