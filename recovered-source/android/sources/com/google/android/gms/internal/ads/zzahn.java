package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahn {

    /* JADX INFO: renamed from: a */
    public final byte[] f5327a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f5328b;

    /* JADX INFO: renamed from: c */
    public int f5329c;

    /* JADX INFO: renamed from: d */
    public long f5330d;

    /* JADX INFO: renamed from: e */
    public int f5331e;

    /* JADX INFO: renamed from: f */
    public int f5332f;

    /* JADX INFO: renamed from: g */
    public int f5333g;

    /* JADX INFO: renamed from: a */
    public final void m4129a(zzagb zzagbVar) {
        if (this.f5328b) {
            return;
        }
        byte[] bArr = this.f5327a;
        zzagbVar.mo4078H(bArr, 0, 10);
        zzagbVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f5328b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4130b(zzahm zzahmVar, long j2, int i2, int i3, int i4, zzahl zzahlVar) {
        zzgtr.m7134g("TrueHD chunk samples must be contiguous in the sample queue.", this.f5333g <= i3 + i4);
        if (this.f5328b) {
            int i5 = this.f5329c;
            int i6 = i5 + 1;
            this.f5329c = i6;
            if (i5 == 0) {
                this.f5330d = j2;
                this.f5331e = i2;
                this.f5332f = 0;
            }
            this.f5332f += i3;
            this.f5333g = i4;
            if (i6 >= 16) {
                m4131c(zzahmVar, zzahlVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4131c(zzahm zzahmVar, zzahl zzahlVar) {
        if (this.f5329c > 0) {
            zzahmVar.mo4095b(this.f5330d, this.f5331e, this.f5332f, this.f5333g, zzahlVar);
            this.f5329c = 0;
        }
    }
}
