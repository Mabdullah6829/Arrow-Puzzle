package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzhcu extends zzhay.zzf implements Runnable {

    /* JADX INFO: renamed from: z */
    public final Runnable f18531z;

    public zzhcu(Runnable runnable) {
        runnable.getClass();
        this.f18531z = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: f */
    public final String mo6898f() {
        String string = this.f18531z.toString();
        return AbstractC1456a.m2450q(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18531z.run();
        } catch (Throwable th) {
            m7321d(th);
            throw th;
        }
    }
}
