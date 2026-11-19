package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzv extends zzk {

    /* JADX INFO: renamed from: u */
    public int f21590u;

    /* JADX INFO: renamed from: v */
    public int f21591v;

    @Override // com.google.android.gms.internal.common.zzk
    /* JADX INFO: renamed from: a */
    public final String mo9107a() {
        int i2;
        int i3 = this.f21590u;
        if (i3 == -1) {
            this.f21588t = 3;
            return null;
        }
        int iMo9112b = mo9112b(i3);
        if (iMo9112b == -1) {
            throw null;
        }
        int iMo9113c = mo9113c(iMo9112b);
        this.f21590u = iMo9113c;
        if (iMo9113c == i3) {
            this.f21590u = iMo9113c + 1;
            throw null;
        }
        if (i3 < iMo9112b || i3 < iMo9112b || (i2 = this.f21591v) == 1) {
            throw null;
        }
        this.f21591v = i2 - 1;
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo9112b(int i2);

    /* JADX INFO: renamed from: c */
    public abstract int mo9113c(int i2);
}
