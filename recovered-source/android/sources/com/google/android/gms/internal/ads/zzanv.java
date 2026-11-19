package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
final class zzanv implements zzahm {

    /* JADX INFO: renamed from: a */
    public final zzahm f6146a;

    /* JADX INFO: renamed from: b */
    public final zzanq f6147b;

    /* JADX INFO: renamed from: g */
    public zzans f6152g;

    /* JADX INFO: renamed from: h */
    public zzv f6153h;

    /* JADX INFO: renamed from: i */
    public boolean f6154i;

    /* JADX INFO: renamed from: d */
    public int f6149d = 0;

    /* JADX INFO: renamed from: e */
    public int f6150e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f6151f = zzfm.f16092b;

    /* JADX INFO: renamed from: c */
    public final zzeu f6148c = new zzeu();

    public zzanv(zzahm zzahmVar, zzanq zzanqVar) {
        this.f6146a = zzahmVar;
        this.f6147b = zzanqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: b */
    public final void mo4095b(long j2, int i2, int i3, int i4, zzahl zzahlVar) {
        if (this.f6152g == null) {
            this.f6146a.mo4095b(j2, i2, i3, i4, zzahlVar);
            return;
        }
        zzgtr.m7129b("DRM on subtitles is not supported", zzahlVar == null);
        int i5 = (this.f6150e - i4) - i3;
        try {
            this.f6152g.mo4246a(this.f6151f, i5, i3, new zzanu(this, j2, i2));
        } catch (RuntimeException e) {
            if (!this.f6154i) {
                throw e;
            }
            zzeh.m6212d("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i6 = i5 + i3;
        this.f6149d = i6;
        if (i6 == this.f6150e) {
            this.f6149d = 0;
            this.f6150e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: c */
    public final int mo4096c(zzj zzjVar, int i2, boolean z) throws EOFException {
        if (this.f6152g == null) {
            return this.f6146a.mo4096c(zzjVar, i2, z);
        }
        m4247g(i2);
        int iMo4082b = zzjVar.mo4082b(this.f6151f, this.f6150e, i2);
        if (iMo4082b != -1) {
            this.f6150e += iMo4082b;
            return iMo4082b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: e */
    public final void mo4097e(zzv zzvVar) {
        String str = zzvVar.f21061o;
        str.getClass();
        zzgtr.m7128a(zzas.m4354f(str) == 3);
        boolean zEquals = zzvVar.equals(this.f6153h);
        zzanq zzanqVar = this.f6147b;
        if (!zEquals) {
            this.f6153h = zzvVar;
            this.f6152g = zzanqVar.mo4240a(zzvVar) ? zzanqVar.mo4242c(zzvVar) : null;
        }
        zzans zzansVar = this.f6152g;
        zzahm zzahmVar = this.f6146a;
        if (zzansVar == null) {
            zzahmVar.mo4097e(zzvVar);
            return;
        }
        zzt zztVar = new zzt(zzvVar);
        zztVar.m8853e("application/x-media3-cues");
        zztVar.f20798j = str;
        zztVar.f20807s = LocationRequestCompat.PASSIVE_INTERVAL;
        zztVar.f20787M = zzanqVar.mo4241b(zzvVar);
        zzahmVar.mo4097e(new zzv(zztVar));
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: f */
    public final void mo4098f(zzeu zzeuVar, int i2, int i3) {
        if (this.f6152g == null) {
            this.f6146a.mo4098f(zzeuVar, i2, i3);
            return;
        }
        m4247g(i2);
        zzeuVar.m6366H(this.f6151f, this.f6150e, i2);
        this.f6150e += i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m4247g(int i2) {
        int length = this.f6151f.length;
        int i3 = this.f6150e;
        if (length - i3 >= i2) {
            return;
        }
        int i4 = i3 - this.f6149d;
        int iMax = Math.max(i4 + i4, i2 + i4);
        byte[] bArr = this.f6151f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f6149d, bArr2, 0, i4);
        this.f6149d = 0;
        this.f6150e = i4;
        this.f6151f = bArr2;
    }
}
