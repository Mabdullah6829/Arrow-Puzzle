package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzhln {

    /* JADX INFO: renamed from: a */
    public final long[] f18927a;

    /* JADX INFO: renamed from: b */
    public final long[] f18928b;

    /* JADX INFO: renamed from: c */
    public final long[] f18929c;

    public zzhln(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18927a = jArr;
        this.f18928b = jArr2;
        this.f18929c = jArr3;
    }

    /* JADX INFO: renamed from: a */
    public static void m7513a(zzhlm zzhlmVar, zzhln zzhlnVar) {
        zzhln zzhlnVar2 = zzhlmVar.f18925a;
        long[] jArr = zzhlnVar.f18927a;
        long[] jArr2 = zzhlnVar2.f18927a;
        long[] jArr3 = zzhlmVar.f18926b;
        zzhlw.m7546e(jArr, jArr2, jArr3);
        long[] jArr4 = zzhlnVar.f18928b;
        long[] jArr5 = zzhlnVar2.f18928b;
        long[] jArr6 = zzhlnVar2.f18929c;
        zzhlw.m7546e(jArr4, jArr5, jArr6);
        zzhlw.m7546e(zzhlnVar.f18929c, jArr6, jArr3);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m7514b() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.f18929c;
        zzhlw.m7547f(jArr4, jArr14);
        zzhlw.m7547f(jArr13, jArr4);
        zzhlw.m7547f(jArr12, jArr13);
        zzhlw.m7546e(jArr5, jArr12, jArr14);
        zzhlw.m7546e(jArr6, jArr5, jArr4);
        zzhlw.m7547f(jArr12, jArr6);
        zzhlw.m7546e(jArr7, jArr12, jArr5);
        zzhlw.m7547f(jArr12, jArr7);
        zzhlw.m7547f(jArr13, jArr12);
        zzhlw.m7547f(jArr12, jArr13);
        zzhlw.m7547f(jArr13, jArr12);
        zzhlw.m7547f(jArr12, jArr13);
        zzhlw.m7546e(jArr8, jArr12, jArr7);
        zzhlw.m7547f(jArr12, jArr8);
        zzhlw.m7547f(jArr13, jArr12);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            zzhlw.m7547f(jArr12, jArr13);
            zzhlw.m7547f(jArr13, jArr12);
        }
        zzhlw.m7546e(jArr9, jArr13, jArr8);
        zzhlw.m7547f(jArr12, jArr9);
        zzhlw.m7547f(jArr13, jArr12);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            zzhlw.m7547f(jArr12, jArr13);
            zzhlw.m7547f(jArr13, jArr12);
        }
        zzhlw.m7546e(jArr12, jArr13, jArr9);
        zzhlw.m7547f(jArr13, jArr12);
        zzhlw.m7547f(jArr12, jArr13);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            zzhlw.m7547f(jArr13, jArr12);
            zzhlw.m7547f(jArr12, jArr13);
        }
        zzhlw.m7546e(jArr10, jArr12, jArr8);
        zzhlw.m7547f(jArr12, jArr10);
        zzhlw.m7547f(jArr13, jArr12);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            zzhlw.m7547f(jArr12, jArr13);
            zzhlw.m7547f(jArr13, jArr12);
        }
        zzhlw.m7546e(jArr11, jArr13, jArr10);
        zzhlw.m7547f(jArr13, jArr11);
        zzhlw.m7547f(jArr12, jArr13);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            zzhlw.m7547f(jArr13, jArr12);
            zzhlw.m7547f(jArr12, jArr13);
        }
        zzhlw.m7546e(jArr13, jArr12, jArr11);
        zzhlw.m7547f(jArr12, jArr13);
        zzhlw.m7547f(jArr13, jArr12);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzhlw.m7547f(jArr12, jArr13);
            zzhlw.m7547f(jArr13, jArr12);
        }
        zzhlw.m7546e(jArr12, jArr13, jArr10);
        zzhlw.m7547f(jArr13, jArr12);
        zzhlw.m7547f(jArr12, jArr13);
        zzhlw.m7547f(jArr13, jArr12);
        zzhlw.m7547f(jArr12, jArr13);
        zzhlw.m7547f(jArr13, jArr12);
        zzhlw.m7546e(jArr, jArr13, jArr6);
        zzhlw.m7546e(jArr2, this.f18927a, jArr);
        zzhlw.m7546e(jArr3, this.f18928b, jArr);
        byte[] bArrM7549h = zzhlw.m7549h(jArr3);
        bArrM7549h[31] = (byte) (((zzhlw.m7549h(jArr2)[0] & 1) << 7) ^ bArrM7549h[31]);
        return bArrM7549h;
    }

    public zzhln() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhln(zzhlm zzhlmVar) {
        this();
        m7513a(zzhlmVar, this);
    }

    public zzhln(zzhln zzhlnVar) {
        this.f18927a = Arrays.copyOf(zzhlnVar.f18927a, 10);
        this.f18928b = Arrays.copyOf(zzhlnVar.f18928b, 10);
        this.f18929c = Arrays.copyOf(zzhlnVar.f18929c, 10);
    }
}
