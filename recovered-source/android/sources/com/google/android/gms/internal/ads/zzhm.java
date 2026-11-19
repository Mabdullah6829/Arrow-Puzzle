package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhm extends zzhj {

    /* JADX INFO: renamed from: e */
    public final zzhl f18965e;

    /* JADX INFO: renamed from: f */
    public Uri f18966f;

    /* JADX INFO: renamed from: g */
    public byte[] f18967g;

    /* JADX INFO: renamed from: h */
    public int f18968h;

    /* JADX INFO: renamed from: i */
    public int f18969i;

    /* JADX INFO: renamed from: j */
    public boolean f18970j;

    public zzhm(byte[] bArr) {
        zzhk zzhkVar = new zzhk(bArr);
        super(false);
        this.f18965e = zzhkVar;
        zzgtr.m7128a(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f18969i;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        byte[] bArr2 = this.f18967g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f18968h, bArr, i2, iMin);
        this.f18968h += iMin;
        this.f18969i -= iMin;
        m7470i(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zzhs {
        m7468f(zzhvVar);
        this.f18966f = zzhvVar.f19195a;
        byte[] bArr = ((zzhk) this.f18965e).f18882a;
        this.f18967g = bArr;
        long j2 = zzhvVar.f19197c;
        int length = bArr.length;
        if (j2 > length) {
            throw new zzhs();
        }
        int i2 = (int) j2;
        this.f18968h = i2;
        int i3 = length - i2;
        this.f18969i = i3;
        long j3 = zzhvVar.f19198d;
        if (j3 != -1) {
            this.f18969i = (int) Math.min(i3, j3);
        }
        this.f18970j = true;
        m7469h(zzhvVar);
        return j3 != -1 ? j3 : this.f18969i;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        if (this.f18970j) {
            this.f18970j = false;
            m7471k();
        }
        this.f18966f = null;
        this.f18967g = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f18966f;
    }
}
