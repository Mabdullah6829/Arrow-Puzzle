package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzey {

    /* JADX INFO: renamed from: a */
    public final int f15125a;

    /* JADX INFO: renamed from: b */
    public Object f15126b;

    /* JADX INFO: renamed from: c */
    public int f15127c;

    /* JADX INFO: renamed from: d */
    public int f15128d;

    /* JADX INFO: renamed from: e */
    public long f15129e;

    /* JADX INFO: renamed from: f */
    public long f15130f;

    /* JADX INFO: renamed from: g */
    public boolean f15131g;

    /* JADX INFO: renamed from: h */
    public long f15132h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zzfd f15133i;

    public zzey(zzfd zzfdVar, int i2) {
        this.f15133i = zzfdVar;
        this.f15125a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m6411a() {
        int i2;
        zzfd zzfdVar = this.f15133i;
        zzbb zzbbVar = zzfdVar.f15443a;
        zzea zzeaVar = zzfdVar.f15447e;
        if (((zzlj) zzbbVar).zzh() == 2) {
            zzlj zzljVar = (zzlj) zzbbVar;
            if (zzljVar.zzk() && zzljVar.zzi() == 0) {
                zzbf zzbfVarMo4709f = zzljVar.mo4709f();
                Object objMo4740f = zzbfVarMo4709f.m4833g() ? null : zzbfVarMo4709f.mo4740f(zzljVar.mo4714n());
                int iMo4713l = zzljVar.mo4713l();
                int iMo4716x = zzljVar.mo4716x();
                long jM8627B = zzljVar.m8627B();
                long jMax = Math.max(0L, zzljVar.mo4717z() - Math.max(0L, jM8627B - zzljVar.mo4712k()));
                if (objMo4740f != null && iMo4713l == -1) {
                    zzbfVarMo4709f.mo4841o(objMo4740f, zzfdVar.f15446d);
                    jM8627B -= zzfm.m6518t(0L);
                    iMo4713l = -1;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = this.f15131g;
                int i3 = this.f15125a;
                if (z && Objects.equals(objMo4740f, this.f15126b) && iMo4713l == this.f15127c && iMo4716x == this.f15128d) {
                    i2 = iMo4713l;
                    if (jM8627B == this.f15129e && jMax == this.f15130f) {
                        if (jElapsedRealtime - this.f15132h >= i3) {
                            zzfdVar.f15445c.mo6409e(new zzfe(1, i3));
                            return;
                        }
                        return;
                    }
                } else {
                    i2 = iMo4713l;
                }
                this.f15131g = true;
                this.f15132h = jElapsedRealtime;
                this.f15126b = objMo4740f;
                this.f15127c = i2;
                this.f15128d = iMo4716x;
                this.f15129e = jM8627B;
                this.f15130f = jMax;
                zzeaVar.mo6115E(1);
                zzeaVar.mo6120e(1, i3);
                return;
            }
        }
        if (this.f15131g) {
            zzeaVar.mo6115E(1);
        }
        this.f15131g = false;
    }
}
