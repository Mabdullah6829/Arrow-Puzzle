package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfa {

    /* JADX INFO: renamed from: a */
    public final int f15245a;

    /* JADX INFO: renamed from: b */
    public Object f15246b;

    /* JADX INFO: renamed from: c */
    public int f15247c;

    /* JADX INFO: renamed from: d */
    public int f15248d;

    /* JADX INFO: renamed from: e */
    public long f15249e;

    /* JADX INFO: renamed from: f */
    public boolean f15250f;

    /* JADX INFO: renamed from: g */
    public long f15251g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zzfd f15252h;

    public zzfa(zzfd zzfdVar, int i2) {
        this.f15252h = zzfdVar;
        this.f15245a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m6413a() {
        zzfd zzfdVar = this.f15252h;
        zzbb zzbbVar = zzfdVar.f15443a;
        zzea zzeaVar = zzfdVar.f15447e;
        if (!((zzf) zzbbVar).m6412a()) {
            if (this.f15250f) {
                zzeaVar.mo6115E(2);
            }
            this.f15250f = false;
            return;
        }
        zzlj zzljVar = (zzlj) zzbbVar;
        zzbf zzbfVarMo4709f = zzljVar.mo4709f();
        Object objMo4740f = zzbfVarMo4709f.m4833g() ? null : zzbfVarMo4709f.mo4740f(zzljVar.mo4714n());
        int iMo4713l = zzljVar.mo4713l();
        int iMo4716x = zzljVar.mo4716x();
        long jMo4712k = zzljVar.mo4712k();
        if (objMo4740f != null && iMo4713l == -1) {
            zzbfVarMo4709f.mo4841o(objMo4740f, zzfdVar.f15446d);
            jMo4712k -= zzfm.m6518t(0L);
            iMo4713l = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f15250f;
        int i2 = this.f15245a;
        if (z && Objects.equals(objMo4740f, this.f15246b) && iMo4713l == this.f15247c && iMo4716x == this.f15248d && jMo4712k == this.f15249e) {
            if (jElapsedRealtime - this.f15251g >= i2) {
                zzfdVar.f15445c.mo6409e(new zzfe(2, i2));
                return;
            }
            return;
        }
        this.f15250f = true;
        this.f15251g = jElapsedRealtime;
        this.f15246b = objMo4740f;
        this.f15247c = iMo4713l;
        this.f15248d = iMo4716x;
        this.f15249e = jMo4712k;
        zzeaVar.mo6115E(2);
        zzeaVar.mo6120e(2, i2);
    }
}
