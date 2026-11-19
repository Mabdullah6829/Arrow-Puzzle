package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcv implements zzcp {

    /* JADX INFO: renamed from: b */
    public int f11540b;

    /* JADX INFO: renamed from: c */
    public float f11541c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f11542d = 1.0f;

    /* JADX INFO: renamed from: e */
    public zzcl f11543e;

    /* JADX INFO: renamed from: f */
    public zzcl f11544f;

    /* JADX INFO: renamed from: g */
    public zzcl f11545g;

    /* JADX INFO: renamed from: h */
    public zzcl f11546h;

    /* JADX INFO: renamed from: i */
    public boolean f11547i;

    /* JADX INFO: renamed from: j */
    public zzcu f11548j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f11549k;

    /* JADX INFO: renamed from: l */
    public ByteBuffer f11550l;

    /* JADX INFO: renamed from: m */
    public long f11551m;

    /* JADX INFO: renamed from: n */
    public long f11552n;

    /* JADX INFO: renamed from: o */
    public boolean f11553o;

    public zzcv() {
        zzcl zzclVar = zzcl.f10386e;
        this.f11543e = zzclVar;
        this.f11544f = zzclVar;
        this.f11545g = zzclVar;
        this.f11546h = zzclVar;
        ByteBuffer byteBuffer = zzcp.f10655a;
        this.f11549k = byteBuffer;
        this.f11550l = byteBuffer;
        this.f11540b = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: a */
    public final void mo5714a() {
        zzcu zzcuVar = this.f11548j;
        if (zzcuVar != null) {
            int i2 = zzcuVar.f11427j;
            int i3 = zzcuVar.f11432o;
            int i4 = zzcuVar.f11428k;
            float f2 = zzcuVar.f11420c;
            float f3 = zzcuVar.f11421d;
            int i5 = i4 + ((int) ((((((((double) (i2 - i3)) / ((double) (f2 / f3))) + ((double) i3)) + zzcuVar.f11434q) + ((double) zzcuVar.f11429l)) / ((double) (zzcuVar.f11422e * f3))) + 0.5d));
            zzcuVar.f11434q = 0.0d;
            int i6 = zzcuVar.f11425h;
            int i7 = i6 + i6;
            zzcs zzcsVar = zzcuVar.f11426i;
            zzcsVar.mo5798R(i2 + i7);
            zzcsVar.mo5808j(i2 * zzcuVar.f11419b, i7);
            zzcuVar.f11427j += i7;
            zzcuVar.m5832b();
            if (zzcuVar.f11428k > i5) {
                zzcuVar.f11428k = Math.max(i5, 0);
            }
            zzcuVar.f11427j = 0;
            zzcuVar.f11432o = 0;
            zzcuVar.f11429l = 0;
        }
        this.f11553o = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: b */
    public final ByteBuffer mo5715b() {
        zzcu zzcuVar = this.f11548j;
        if (zzcuVar != null) {
            zzcs zzcsVar = zzcuVar.f11426i;
            int i2 = zzcuVar.f11419b;
            zzgtr.m7133f(zzcuVar.f11428k >= 0);
            int iZza = zzcuVar.f11428k * i2 * zzcsVar.zza();
            if (iZza > 0) {
                if (this.f11549k.capacity() < iZza) {
                    this.f11549k = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                } else {
                    this.f11549k.clear();
                }
                ByteBuffer byteBuffer = this.f11549k;
                zzgtr.m7133f(zzcuVar.f11428k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (zzcsVar.zza() * i2), zzcuVar.f11428k);
                zzcsVar.mo5810l(iMin, byteBuffer);
                zzcuVar.f11428k -= iMin;
                System.arraycopy(zzcsVar.mo5804f(), iMin * i2, zzcsVar.mo5804f(), 0, zzcuVar.f11428k * i2);
                this.f11549k.flip();
                this.f11552n += (long) iZza;
                this.f11550l = this.f11549k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11550l;
        this.f11550l = zzcp.f10655a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: c */
    public final boolean mo5716c() {
        if (this.f11553o) {
            zzcu zzcuVar = this.f11548j;
            if (zzcuVar != null) {
                zzgtr.m7133f(zzcuVar.f11428k >= 0);
                if (zzcuVar.f11428k * zzcuVar.f11419b * zzcuVar.f11426i.zza() != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: d */
    public final void mo5717d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcu zzcuVar = this.f11548j;
            zzcuVar.getClass();
            this.f11551m += (long) byteBuffer.remaining();
            zzcs zzcsVar = zzcuVar.f11426i;
            int iRemaining = byteBuffer.remaining();
            int iZza = iRemaining / (zzcuVar.f11419b * zzcsVar.zza());
            zzcsVar.mo5798R(iZza);
            zzcsVar.mo5806h(iRemaining, byteBuffer);
            zzcuVar.f11427j += iZza;
            zzcuVar.m5832b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: e */
    public final long mo5718e(long j2) {
        if (this.f11552n < 1024) {
            return (long) (j2 / ((double) this.f11541c));
        }
        long j3 = this.f11551m;
        zzcu zzcuVar = this.f11548j;
        zzcuVar.getClass();
        long jZza = j3 - ((long) ((zzcuVar.f11427j * zzcuVar.f11419b) * zzcuVar.f11426i.zza()));
        int i2 = this.f11546h.f10387a;
        int i3 = this.f11545g.f10387a;
        return i2 == i3 ? zzfm.m6521w(j2, this.f11552n, jZza, RoundingMode.DOWN) : zzfm.m6521w(j2, this.f11552n * ((long) i3), jZza * ((long) i2), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: f */
    public final zzcl mo5719f(zzcl zzclVar) throws zzco {
        int i2 = zzclVar.f10389c;
        if (i2 != 2 && i2 != 4) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i3 = this.f11540b;
        if (i3 == -1) {
            i3 = zzclVar.f10387a;
        }
        this.f11543e = zzclVar;
        zzcl zzclVar2 = new zzcl(i3, zzclVar.f10388b, i2);
        this.f11544f = zzclVar2;
        this.f11547i = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: g */
    public final void mo5720g(zzcn zzcnVar) {
        if (zzc()) {
            zzcl zzclVar = this.f11543e;
            this.f11545g = zzclVar;
            zzcl zzclVar2 = this.f11544f;
            this.f11546h = zzclVar2;
            if (this.f11547i) {
                this.f11548j = new zzcu(zzclVar.f10387a, zzclVar.f10388b, this.f11541c, this.f11542d, zzclVar2.f10387a, zzclVar.f10389c == 4);
            } else {
                zzcu zzcuVar = this.f11548j;
                if (zzcuVar != null) {
                    zzcuVar.f11427j = 0;
                    zzcuVar.f11428k = 0;
                    zzcuVar.f11429l = 0;
                    zzcuVar.f11430m = 0;
                    zzcuVar.f11431n = 0;
                    zzcuVar.f11432o = 0;
                    zzcuVar.f11433p = 0;
                    zzcuVar.f11434q = 0.0d;
                    zzcuVar.f11426i.mo5801c();
                }
            }
        }
        this.f11550l = zzcp.f10655a;
        this.f11551m = 0L;
        this.f11552n = 0L;
        this.f11553o = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        if (this.f11544f.f10387a != -1) {
            return Math.abs(this.f11541c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f11542d + (-1.0f)) >= 1.0E-4f || this.f11544f.f10387a != this.f11543e.f10387a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        this.f11541c = 1.0f;
        this.f11542d = 1.0f;
        zzcl zzclVar = zzcl.f10386e;
        this.f11543e = zzclVar;
        this.f11544f = zzclVar;
        this.f11545g = zzclVar;
        this.f11546h = zzclVar;
        ByteBuffer byteBuffer = zzcp.f10655a;
        this.f11549k = byteBuffer;
        this.f11550l = byteBuffer;
        this.f11540b = -1;
        this.f11547i = false;
        this.f11548j = null;
        this.f11551m = 0L;
        this.f11552n = 0L;
        this.f11553o = false;
    }
}
