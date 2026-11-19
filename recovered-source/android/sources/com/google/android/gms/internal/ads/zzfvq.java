package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvq implements zzfvt {

    /* JADX INFO: renamed from: e */
    public static final zzfvq f16665e = new zzfvq(new zzfvu());

    /* JADX INFO: renamed from: a */
    public Date f16666a;

    /* JADX INFO: renamed from: b */
    public boolean f16667b;

    /* JADX INFO: renamed from: c */
    public final zzfvu f16668c;

    /* JADX INFO: renamed from: d */
    public boolean f16669d;

    public zzfvq(zzfvu zzfvuVar) {
        this.f16668c = zzfvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvt
    /* JADX INFO: renamed from: L */
    public final void mo6730L(boolean z) {
        if (!this.f16669d && z) {
            Date date = new Date();
            Date date2 = this.f16666a;
            if (date2 == null || date.after(date2)) {
                this.f16666a = date;
                if (this.f16667b) {
                    Iterator it = Collections.unmodifiableCollection(zzfvs.f16671c.f16673b).iterator();
                    while (it.hasNext()) {
                        zzfwi zzfwiVar = ((zzfuy) it.next()).f16616d;
                        Date date3 = this.f16666a;
                        zzfwiVar.m6746f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f16669d = z;
    }
}
