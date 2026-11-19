package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafx implements zzahm {

    /* JADX INFO: renamed from: a */
    public final byte[] f5227a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: b */
    public final void mo4095b(long j2, int i2, int i3, int i4, zzahl zzahlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: c */
    public final int mo4096c(zzj zzjVar, int i2, boolean z) throws EOFException {
        int iMo4082b = zzjVar.mo4082b(this.f5227a, 0, Math.min(4096, i2));
        if (iMo4082b != -1) {
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
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: f */
    public final void mo4098f(zzeu zzeuVar, int i2, int i3) {
        zzeuVar.m6365G(i2);
    }
}
