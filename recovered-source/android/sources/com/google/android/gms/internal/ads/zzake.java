package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class zzake {

    /* JADX INFO: renamed from: a */
    public final byte[] f5586a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f5587b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final zzako f5588c = new zzako();

    /* JADX INFO: renamed from: d */
    public zzakf f5589d;

    /* JADX INFO: renamed from: e */
    public int f5590e;

    /* JADX INFO: renamed from: f */
    public int f5591f;

    /* JADX INFO: renamed from: g */
    public long f5592g;

    /* JADX INFO: renamed from: a */
    public final long m4162a(zzagb zzagbVar, int i2) {
        byte[] bArr = this.f5586a;
        zzagbVar.mo4076F(bArr, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | ((long) (bArr[i3] & 255));
        }
        return j2;
    }
}
