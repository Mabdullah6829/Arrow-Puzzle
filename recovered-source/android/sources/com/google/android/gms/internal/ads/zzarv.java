package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzarv implements zzaru {

    /* JADX INFO: renamed from: a */
    public final zzagd f6792a;

    /* JADX INFO: renamed from: b */
    public final zzahm f6793b;

    /* JADX INFO: renamed from: c */
    public final zzary f6794c;

    /* JADX INFO: renamed from: d */
    public final zzv f6795d;

    /* JADX INFO: renamed from: e */
    public final int f6796e;

    /* JADX INFO: renamed from: f */
    public long f6797f;

    /* JADX INFO: renamed from: g */
    public int f6798g;

    /* JADX INFO: renamed from: h */
    public long f6799h;

    public zzarv(zzagd zzagdVar, zzahm zzahmVar, zzary zzaryVar, String str, int i2) throws zzat {
        this.f6792a = zzagdVar;
        this.f6793b = zzahmVar;
        this.f6794c = zzaryVar;
        int i3 = zzaryVar.f6808a;
        int i4 = zzaryVar.f6809b;
        int i5 = zzaryVar.f6811d * i3;
        int i6 = zzaryVar.f6810c;
        int i7 = i5 / 8;
        if (i6 != i7) {
            throw zzat.m4383a(null, AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i7).length() + 28 + String.valueOf(i6).length()), "Expected block size: ", i7, "; got: ", i6));
        }
        int i8 = i4 * i7;
        int i9 = i8 * 8;
        int iMax = Math.max(i7, i8 / 10);
        this.f6796e = iMax;
        zzt zztVar = new zzt();
        zztVar.m8852d("audio/wav");
        zztVar.m8853e(str);
        zztVar.f20796h = i9;
        zztVar.f20797i = i9;
        zztVar.f20803o = iMax;
        zztVar.f20780F = i3;
        int i10 = zzaryVar.f6813f;
        zztVar.f20781G = i10 == 0 ? -1 : i10 << 2;
        zztVar.f20782H = i4;
        zztVar.f20783I = i2;
        this.f6795d = new zzv(zztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    /* JADX INFO: renamed from: a */
    public final void mo4344a(int i2, long j2) {
        this.f6792a.mo4108d(new zzasb(this.f6794c, 1, i2, j2));
        this.f6793b.mo4097e(this.f6795d);
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    /* JADX INFO: renamed from: b */
    public final boolean mo4345b(zzagb zzagbVar, long j2) {
        int i2;
        int i3;
        long j3 = j2;
        while (j3 > 0 && (i2 = this.f6798g) < (i3 = this.f6796e)) {
            int iMo4122d = this.f6793b.mo4122d(zzagbVar, (int) Math.min(i3 - i2, j3), true);
            if (iMo4122d == -1) {
                j3 = 0;
            } else {
                this.f6798g += iMo4122d;
                j3 -= (long) iMo4122d;
            }
        }
        int i4 = this.f6798g;
        zzary zzaryVar = this.f6794c;
        int i5 = zzaryVar.f6810c;
        int i6 = i4 / i5;
        if (i6 > 0) {
            long jM6521w = this.f6797f + zzfm.m6521w(this.f6799h, 1000000L, zzaryVar.f6809b, RoundingMode.DOWN);
            int i7 = i6 * i5;
            int i8 = this.f6798g - i7;
            this.f6793b.mo4095b(jM6521w, 1, i7, i8, null);
            this.f6799h += (long) i6;
            this.f6798g = i8;
        }
        return j3 <= 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    /* JADX INFO: renamed from: e */
    public final void mo4347e(long j2) {
        this.f6797f = j2;
        this.f6798g = 0;
        this.f6799h = 0L;
    }
}
