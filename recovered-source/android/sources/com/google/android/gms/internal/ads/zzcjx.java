package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjx implements zzhr {

    /* JADX INFO: renamed from: a */
    public final zzhm f10301a;

    /* JADX INFO: renamed from: b */
    public final long f10302b;

    /* JADX INFO: renamed from: c */
    public final zzhr f10303c;

    /* JADX INFO: renamed from: d */
    public long f10304d;

    /* JADX INFO: renamed from: e */
    public Uri f10305e;

    public zzcjx(zzhm zzhmVar, int i2, zzhr zzhrVar) {
        this.f10301a = zzhmVar;
        this.f10302b = i2;
        this.f10303c = zzhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: a */
    public final void mo5493a(zzip zzipVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) {
        int i4;
        long j2 = this.f10304d;
        long j3 = this.f10302b;
        if (j2 < j3) {
            int iMo4082b = this.f10301a.mo4082b(bArr, i2, (int) Math.min(i3, j3 - j2));
            long j4 = this.f10304d + ((long) iMo4082b);
            this.f10304d = j4;
            i4 = iMo4082b;
            j2 = j4;
        } else {
            i4 = 0;
        }
        if (j2 < j3) {
            return i4;
        }
        int iMo4082b2 = this.f10303c.mo4082b(bArr, i2 + i4, i3 - i4);
        int i5 = i4 + iMo4082b2;
        this.f10304d += (long) iMo4082b2;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) {
        zzhv zzhvVar2;
        zzhv zzhvVar3;
        Uri uri = zzhvVar.f19195a;
        long j2 = zzhvVar.f19198d;
        this.f10305e = uri;
        long j3 = zzhvVar.f19197c;
        long j4 = this.f10302b;
        if (j3 >= j4) {
            zzhvVar2 = null;
        } else {
            long jMin = j4 - j3;
            if (j2 != -1) {
                jMin = Math.min(j2, jMin);
            }
            zzhvVar2 = new zzhv(uri, j3, jMin);
        }
        if (j2 == -1 || j3 + j2 > j4) {
            zzhvVar3 = new zzhv(uri, Math.max(j4, j3), j2 != -1 ? Math.min(j2, (j3 + j2) - j4) : -1L);
        } else {
            zzhvVar3 = null;
        }
        long jMo5494c = zzhvVar2 != 0 ? this.f10301a.mo5494c(zzhvVar2) : 0L;
        long jMo5494c2 = zzhvVar3 != null ? this.f10303c.mo5494c(zzhvVar3) : 0L;
        this.f10304d = j3;
        if (jMo5494c == -1 || jMo5494c2 == -1) {
            return -1L;
        }
        return jMo5494c + jMo5494c2;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        this.f10301a.mo5495d();
        this.f10303c.mo5495d();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f10305e;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        return zzgyt.f18367y;
    }
}
