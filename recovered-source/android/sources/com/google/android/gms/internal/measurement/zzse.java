package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import p043a.AbstractC0878a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzse implements zzro {

    /* JADX INFO: renamed from: a */
    public OutputStream f22862a;

    /* JADX INFO: renamed from: b */
    public zzsm f22863b;

    @Override // com.google.android.gms.internal.measurement.zzro
    /* JADX INFO: renamed from: a */
    public final void mo10627a(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) AbstractC0878a.m1801l(arrayList);
        if (outputStream instanceof zzsm) {
            this.f22863b = (zzsm) outputStream;
            this.f22862a = (OutputStream) arrayList.get(0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void zzb() throws IOException {
        if (this.f22863b == null) {
            throw new zzsk("Cannot sync underlying stream");
        }
        this.f22862a.flush();
        this.f22863b.f22866s.getFD().sync();
    }
}
