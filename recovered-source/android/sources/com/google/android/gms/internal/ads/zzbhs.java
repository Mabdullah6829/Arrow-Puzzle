package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhs {

    /* JADX INFO: renamed from: a */
    public zzbhh f7876a;

    /* JADX INFO: renamed from: b */
    public boolean f7877b;

    /* JADX INFO: renamed from: c */
    public final Object f7878c = new Object();

    public zzbhs(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m4890a() {
        synchronized (this.f7878c) {
            try {
                zzbhh zzbhhVar = this.f7876a;
                if (zzbhhVar == null) {
                    return;
                }
                zzbhhVar.disconnect();
                this.f7876a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
