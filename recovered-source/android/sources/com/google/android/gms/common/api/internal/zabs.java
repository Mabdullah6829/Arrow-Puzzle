package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class zabs extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f4315a;

    /* JADX INFO: renamed from: b */
    public final zabr f4316b;

    public zabs(zabr zabrVar) {
        this.f4316b = zabrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f4316b.mo3493a();
            synchronized (this) {
                try {
                    Context context2 = this.f4315a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f4315a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
