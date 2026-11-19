package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhlo {

    /* JADX INFO: renamed from: a */
    public final zzhln f18930a;

    /* JADX INFO: renamed from: b */
    public final long[] f18931b;

    public zzhlo(zzhln zzhlnVar, long[] jArr) {
        this.f18930a = zzhlnVar;
        this.f18931b = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m7515a(zzhlo zzhloVar, zzhlm zzhlmVar) {
        zzhln zzhlnVar = zzhlmVar.f18925a;
        zzhln zzhlnVar2 = zzhloVar.f18930a;
        long[] jArr = zzhlnVar2.f18927a;
        long[] jArr2 = zzhlnVar.f18927a;
        long[] jArr3 = zzhlmVar.f18926b;
        zzhlw.m7546e(jArr, jArr2, jArr3);
        long[] jArr4 = zzhlnVar2.f18928b;
        long[] jArr5 = zzhlnVar.f18928b;
        long[] jArr6 = zzhlnVar.f18929c;
        zzhlw.m7546e(jArr4, jArr5, jArr6);
        zzhlw.m7546e(zzhlnVar2.f18929c, jArr6, jArr3);
        zzhlw.m7546e(zzhloVar.f18931b, jArr2, jArr5);
    }

    public zzhlo() {
        this(new zzhln(), new long[10]);
    }

    public zzhlo(zzhlm zzhlmVar) {
        this();
        m7515a(this, zzhlmVar);
    }
}
