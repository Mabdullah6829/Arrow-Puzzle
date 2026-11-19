package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzeo {

    /* JADX INFO: renamed from: a */
    public final WeakReference f14361a;

    /* JADX INFO: renamed from: b */
    public final Executor f14362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzes f14363c;

    public zzeo(zzes zzesVar, zzem zzemVar, Executor executor) {
        this.f14363c = zzesVar;
        this.f14361a = new WeakReference(zzemVar);
        this.f14362b = executor;
    }
}
