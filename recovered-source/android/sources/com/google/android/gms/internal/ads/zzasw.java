package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzasw implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzatl f6854s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzasx f6855t;

    public zzasw(zzasx zzasxVar, zzatl zzatlVar) {
        this.f6854s = zzatlVar;
        this.f6855t = zzasxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f6855t.f6858t.put(this.f6854s);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
