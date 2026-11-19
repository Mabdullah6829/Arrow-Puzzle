package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzck {

    /* JADX INFO: renamed from: a */
    public final zzgwt f10310a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f10311b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f10312c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public boolean f10313d;

    public zzck(zzgwt zzgwtVar) {
        this.f10310a = zzgwtVar;
        zzcl zzclVar = zzcl.f10386e;
        this.f10313d = false;
    }

    /* JADX INFO: renamed from: a */
    public final zzcl m5531a(zzcl zzclVar) throws zzco {
        zzcl zzclVar2 = zzcl.f10386e;
        if (zzclVar.equals(zzclVar2)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i2 = 0;
        while (true) {
            zzgwt zzgwtVar = this.f10310a;
            if (i2 >= zzgwtVar.size()) {
                return zzclVar;
            }
            zzcp zzcpVar = (zzcp) zzgwtVar.get(i2);
            zzcl zzclVarMo5719f = zzcpVar.mo5719f(zzclVar);
            if (zzcpVar.zzc()) {
                zzgtr.m7133f(!zzclVarMo5719f.equals(zzclVar2));
                zzclVar = zzclVarMo5719f;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5532b() {
        return !this.f10311b.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5533c() {
        return this.f10313d && ((zzcp) this.f10311b.get(m5535e())).mo5716c() && !this.f10312c[m5535e()].hasRemaining();
    }

    /* JADX INFO: renamed from: d */
    public final void m5534d(ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i2 = 0; i2 <= m5535e(); i2++) {
                if (!this.f10312c[i2].hasRemaining()) {
                    ArrayList arrayList = this.f10311b;
                    zzcp zzcpVar = (zzcp) arrayList.get(i2);
                    if (!zzcpVar.mo5716c()) {
                        ByteBuffer byteBuffer2 = i2 > 0 ? this.f10312c[i2 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcp.f10655a;
                        long jRemaining = byteBuffer2.remaining();
                        zzcpVar.mo5717d(byteBuffer2);
                        this.f10312c[i2] = zzcpVar.mo5715b();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.f10312c[i2].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.f10312c[i2].hasRemaining() && i2 < m5535e()) {
                        ((zzcp) arrayList.get(i2 + 1)).mo5714a();
                    }
                }
            }
        } while (z);
    }

    /* JADX INFO: renamed from: e */
    public final int m5535e() {
        return this.f10312c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgwt zzgwtVar = this.f10310a;
        int size = zzgwtVar.size();
        zzgwt zzgwtVar2 = ((zzck) obj).f10310a;
        if (size != zzgwtVar2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < zzgwtVar.size(); i2++) {
            if (zzgwtVar.get(i2) != zzgwtVar2.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f10310a.hashCode();
    }
}
