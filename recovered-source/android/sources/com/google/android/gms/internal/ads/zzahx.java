package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahx implements zzahs {

    /* JADX INFO: renamed from: a */
    public final int f5381a;

    /* JADX INFO: renamed from: b */
    public final int f5382b;

    /* JADX INFO: renamed from: c */
    public final int f5383c;

    /* JADX INFO: renamed from: d */
    public final int f5384d;

    /* JADX INFO: renamed from: e */
    public final int f5385e;

    /* JADX INFO: renamed from: f */
    public final int f5386f;

    public zzahx(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f5381a = i2;
        this.f5382b = i3;
        this.f5383c = i4;
        this.f5384d = i5;
        this.f5385e = i6;
        this.f5386f = i7;
    }

    /* JADX INFO: renamed from: a */
    public final int m4135a() {
        int i2 = this.f5381a;
        if (i2 == 1935960438) {
            return 2;
        }
        if (i2 == 1935963489) {
            return 1;
        }
        if (i2 == 1937012852) {
            return 3;
        }
        zzeh.m6211c("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i2))));
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return 1752331379;
    }
}
