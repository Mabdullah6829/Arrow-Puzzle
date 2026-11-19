package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhll extends zzhlk {

    /* JADX INFO: renamed from: d */
    public final long[] f18924d;

    public zzhll() {
        super(new long[10], new long[10], new long[10]);
        this.f18924d = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    /* JADX INFO: renamed from: a */
    public final void mo7511a(long[] jArr, long[] jArr2) {
        zzhlw.m7546e(jArr, jArr2, this.f18924d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzhll(zzhlo zzhloVar) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f18924d = jArr3;
        zzhln zzhlnVar = zzhloVar.f18930a;
        zzhlw.m7542a(jArr, zzhlnVar.f18928b, zzhlnVar.f18927a);
        zzhlw.m7543b(jArr2, zzhlnVar.f18928b, zzhlnVar.f18927a);
        System.arraycopy(zzhlnVar.f18929c, 0, jArr3, 0, 10);
        zzhlw.m7546e(jArr4, zzhloVar.f18931b, zzhlr.f18938b);
    }
}
