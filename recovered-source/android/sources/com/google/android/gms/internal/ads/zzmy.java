package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmy {

    /* JADX INFO: renamed from: a */
    public final zzmx f20479a;

    /* JADX INFO: renamed from: b */
    public final zzmw f20480b;

    /* JADX INFO: renamed from: c */
    public int f20481c;

    /* JADX INFO: renamed from: d */
    public Object f20482d;

    /* JADX INFO: renamed from: e */
    public final Looper f20483e;

    /* JADX INFO: renamed from: f */
    public boolean f20484f;

    public zzmy(zzmw zzmwVar, zzmx zzmxVar, Looper looper) {
        this.f20480b = zzmwVar;
        this.f20479a = zzmxVar;
        this.f20483e = looper;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8766a(boolean z) {
        notifyAll();
    }
}
