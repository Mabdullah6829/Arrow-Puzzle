package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfue implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzful f16541s;

    public zzfue(zzful zzfulVar) {
        this.f16541s = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzful zzfulVar = this.f16541s;
        if (zzfulVar.f16571q != null) {
            long jCurrentTimeMillis = zzfulVar.f16572r.currentTimeMillis();
            int iM6711s = zzfulVar.m6711s();
            String strM6702g = zzfulVar.m6702g();
            zzfulVar.f16571q.m6684g("pae", "paeo_ts", jCurrentTimeMillis, iM6711s, 0, null, zzfulVar.f16573s, strM6702g);
        }
    }
}
