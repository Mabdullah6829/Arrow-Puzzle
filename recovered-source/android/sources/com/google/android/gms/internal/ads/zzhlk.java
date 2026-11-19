package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzhlk {

    /* JADX INFO: renamed from: a */
    public final long[] f18921a;

    /* JADX INFO: renamed from: b */
    public final long[] f18922b;

    /* JADX INFO: renamed from: c */
    public final long[] f18923c;

    public zzhlk(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18921a = jArr;
        this.f18922b = jArr2;
        this.f18923c = jArr3;
    }

    /* JADX INFO: renamed from: a */
    public void mo7511a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    /* JADX INFO: renamed from: b */
    public final void m7512b(zzhlk zzhlkVar, int i2) {
        zzhlj.m7510a(this.f18921a, zzhlkVar.f18921a, i2);
        zzhlj.m7510a(this.f18922b, zzhlkVar.f18922b, i2);
        zzhlj.m7510a(this.f18923c, zzhlkVar.f18923c, i2);
    }

    public zzhlk() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhlk(int i2) {
        zzhlk zzhlkVar = zzhlp.f18932a;
        this.f18921a = Arrays.copyOf(zzhlkVar.f18921a, 10);
        this.f18922b = Arrays.copyOf(zzhlkVar.f18922b, 10);
        this.f18923c = Arrays.copyOf(zzhlkVar.f18923c, 10);
    }
}
