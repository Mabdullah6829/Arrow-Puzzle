package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzio implements zzhr {

    /* JADX INFO: renamed from: a */
    public final zzhr f20023a;

    /* JADX INFO: renamed from: b */
    public Uri f20024b = Uri.EMPTY;

    public zzio(zzhr zzhrVar) {
        this.f20023a = zzhrVar;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: a */
    public final void mo5493a(zzip zzipVar) {
        zzipVar.getClass();
        this.f20023a.mo5493a(zzipVar);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) {
        return this.f20023a.mo4082b(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) {
        zzhr zzhrVar = this.f20023a;
        this.f20024b = zzhvVar.f19195a;
        Map map = Collections.EMPTY_MAP;
        try {
            long jMo5494c = zzhrVar.mo5494c(zzhvVar);
            if (zzhrVar.zzc() != null) {
            }
            return jMo5494c;
        } finally {
            Uri uriZzc = zzhrVar.zzc();
            if (uriZzc != null) {
                this.f20024b = uriZzc;
            }
            zzhrVar.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        this.f20023a.mo5495d();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f20023a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        return this.f20023a.zzj();
    }
}
