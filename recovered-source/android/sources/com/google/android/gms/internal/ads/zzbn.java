package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbn {

    /* JADX INFO: renamed from: b */
    public static final zzbn f9184b;

    /* JADX INFO: renamed from: a */
    public final zzgwt f9185a;

    static {
        zzgzi zzgziVar = zzgwt.f18303t;
        f9184b = new zzbn(zzgyo.f18355w);
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.f9185a = zzgwt.m7220t(list);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5068a(int i2) {
        int i3 = 0;
        while (true) {
            zzgwt zzgwtVar = this.f9185a;
            if (i3 >= zzgwtVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgwtVar.get(i3);
            for (boolean z : zzbmVar.f9162e) {
                if (z) {
                    if (zzbmVar.f9159b.f7809c != i2) {
                        break;
                    }
                    return true;
                }
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.f9185a.equals(((zzbn) obj).f9185a);
    }

    public final int hashCode() {
        return this.f9185a.hashCode();
    }
}
