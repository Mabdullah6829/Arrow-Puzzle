package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanm {
    /* JADX INFO: renamed from: a */
    public static void m4243a(zzann zzannVar, zzdu zzduVar) {
        for (int i2 = 0; i2 < zzannVar.zza(); i2++) {
            long jMo4245b = zzannVar.mo4245b(i2);
            ArrayList arrayListMo4244a = zzannVar.mo4244a(jMo4245b);
            if (!arrayListMo4244a.isEmpty()) {
                if (i2 == zzannVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jMo4245b2 = zzannVar.mo4245b(i2 + 1) - zzannVar.mo4245b(i2);
                if (jMo4245b2 > 0) {
                    ((zzanu) zzduVar).mo3942b(new zzank(arrayListMo4244a, jMo4245b, jMo4245b2));
                }
            }
        }
    }
}
