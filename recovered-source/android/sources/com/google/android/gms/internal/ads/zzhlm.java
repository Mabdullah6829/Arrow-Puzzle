package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzhlm {

    /* JADX INFO: renamed from: a */
    public final zzhln f18925a;

    /* JADX INFO: renamed from: b */
    public final long[] f18926b;

    public zzhlm(zzhln zzhlnVar, long[] jArr) {
        this.f18925a = zzhlnVar;
        this.f18926b = jArr;
    }

    public zzhlm() {
        this(new zzhln(), new long[10]);
    }

    public zzhlm(int i2) {
        zzhlm zzhlmVar = zzhlp.f18933b;
        this.f18925a = new zzhln(zzhlmVar.f18925a);
        this.f18926b = Arrays.copyOf(zzhlmVar.f18926b, 10);
    }
}
