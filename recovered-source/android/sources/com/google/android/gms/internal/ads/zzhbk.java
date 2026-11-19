package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzhbk extends zzhbi {
    private zzhbk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    /* JADX INFO: renamed from: a */
    public final void mo7351a(zzhbh zzhbhVar, Set set) {
        synchronized (zzhbhVar) {
            try {
                if (zzhbhVar.f18498z == null) {
                    zzhbhVar.f18498z = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    /* JADX INFO: renamed from: b */
    public final int mo7352b(zzhbh zzhbhVar) {
        int i2;
        synchronized (zzhbhVar) {
            i2 = zzhbhVar.f18497A - 1;
            zzhbhVar.f18497A = i2;
        }
        return i2;
    }
}
