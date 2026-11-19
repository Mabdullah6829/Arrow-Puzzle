package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqi implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzgqk f18049a;

    public zzgqi(zzgqk zzgqkVar) {
        this.f18049a = zzgqkVar;
    }

    public final void onOpActiveChanged(String str, int i2, String str2, boolean z) {
        zzgqk zzgqkVar = this.f18049a;
        synchronized (zzgqkVar) {
            try {
                if (z) {
                    zzgqkVar.f18055d = System.currentTimeMillis();
                    zzgqkVar.f18058g = true;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = zzgqkVar.f18056e;
                    if (j2 > 0 && jCurrentTimeMillis >= j2) {
                        zzgqkVar.f18057f = jCurrentTimeMillis - j2;
                    }
                    zzgqkVar.f18058g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
