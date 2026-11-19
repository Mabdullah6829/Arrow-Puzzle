package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzye implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzyd f23094s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzyf f23095t;

    public zzye(zzyf zzyfVar, zzyd zzydVar) {
        this.f23094s = zzydVar;
        Objects.requireNonNull(zzyfVar);
        this.f23095t = zzyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23095t.f23096a.remove(this.f23094s);
    }
}
