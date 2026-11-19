package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfb {

    /* JADX INFO: renamed from: a */
    public final int f15297a;

    /* JADX INFO: renamed from: b */
    public Object f15298b;

    /* JADX INFO: renamed from: c */
    public int f15299c;

    /* JADX INFO: renamed from: d */
    public int f15300d;

    /* JADX INFO: renamed from: e */
    public boolean f15301e;

    /* JADX INFO: renamed from: f */
    public long f15302f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zzfd f15303g;

    public zzfb(zzfd zzfdVar, int i2) {
        this.f15303g = zzfdVar;
        this.f15297a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m6416a() {
        long j2;
        long jM8626A;
        zzfd zzfdVar = this.f15303g;
        zzbb zzbbVar = zzfdVar.f15443a;
        zzbd zzbdVar = zzfdVar.f15446d;
        zzea zzeaVar = zzfdVar.f15447e;
        zzbf zzbfVarMo4709f = ((zzlj) zzbbVar).mo4709f();
        Object objMo4740f = zzbfVarMo4709f.m4833g() ? null : zzbfVarMo4709f.mo4740f(((zzlj) zzbbVar).mo4714n());
        zzlj zzljVar = (zzlj) zzbbVar;
        int iMo4713l = zzljVar.mo4713l();
        int iMo4716x = zzljVar.mo4716x();
        long jMo4712k = zzljVar.mo4712k();
        if (objMo4740f == null || iMo4713l != -1) {
            j2 = -9223372036854775807L;
            jM8626A = iMo4713l != -1 ? zzljVar.m8626A() : -9223372036854775807L;
        } else {
            zzbfVarMo4709f.mo4841o(objMo4740f, zzbdVar);
            jMo4712k -= zzfm.m6518t(0L);
            j2 = -9223372036854775807L;
            jM8626A = zzfm.m6518t(zzbdVar.f7635d);
            iMo4713l = -1;
        }
        boolean zM6412a = ((zzf) zzbbVar).m6412a();
        if (!zM6412a || jM8626A == j2 || jMo4712k < jM8626A) {
            zzeaVar.mo6115E(3);
            if (zM6412a && jM8626A != j2) {
                zzljVar.m8639w();
                zzeaVar.mo6120e(3, (int) Math.ceil((jM8626A - jMo4712k) / zzljVar.f20244Z.f20470o.f6970a));
            }
            this.f15301e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f15301e;
        int i2 = this.f15297a;
        if (z && Objects.equals(objMo4740f, this.f15298b) && iMo4713l == this.f15299c && iMo4716x == this.f15300d) {
            if (jElapsedRealtime - this.f15302f >= i2) {
                zzfdVar.f15445c.mo6409e(new zzfe(3, i2));
                return;
            }
            return;
        }
        this.f15301e = true;
        this.f15302f = jElapsedRealtime;
        this.f15298b = objMo4740f;
        this.f15299c = iMo4713l;
        this.f15300d = iMo4716x;
        zzeaVar.mo6115E(3);
        zzeaVar.mo6120e(3, i2);
    }
}
