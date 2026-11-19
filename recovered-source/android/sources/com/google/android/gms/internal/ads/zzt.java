package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt {

    /* JADX INFO: renamed from: A */
    public float f20775A;

    /* JADX INFO: renamed from: B */
    public byte[] f20776B;

    /* JADX INFO: renamed from: C */
    public int f20777C;

    /* JADX INFO: renamed from: D */
    public zzi f20778D;

    /* JADX INFO: renamed from: E */
    public int f20779E;

    /* JADX INFO: renamed from: F */
    public int f20780F;

    /* JADX INFO: renamed from: G */
    public int f20781G;

    /* JADX INFO: renamed from: H */
    public int f20782H;

    /* JADX INFO: renamed from: I */
    public int f20783I;

    /* JADX INFO: renamed from: J */
    public int f20784J;

    /* JADX INFO: renamed from: K */
    public int f20785K;

    /* JADX INFO: renamed from: L */
    public int f20786L;

    /* JADX INFO: renamed from: M */
    public int f20787M;

    /* JADX INFO: renamed from: N */
    public int f20788N;

    /* JADX INFO: renamed from: a */
    public String f20789a;

    /* JADX INFO: renamed from: b */
    public String f20790b;

    /* JADX INFO: renamed from: c */
    public zzgwt f20791c;

    /* JADX INFO: renamed from: d */
    public String f20792d;

    /* JADX INFO: renamed from: e */
    public int f20793e;

    /* JADX INFO: renamed from: f */
    public int f20794f;

    /* JADX INFO: renamed from: g */
    public int f20795g;

    /* JADX INFO: renamed from: h */
    public int f20796h;

    /* JADX INFO: renamed from: i */
    public int f20797i;

    /* JADX INFO: renamed from: j */
    public String f20798j;

    /* JADX INFO: renamed from: k */
    public zzap f20799k;

    /* JADX INFO: renamed from: l */
    public String f20800l;

    /* JADX INFO: renamed from: m */
    public String f20801m;

    /* JADX INFO: renamed from: n */
    public String f20802n;

    /* JADX INFO: renamed from: o */
    public int f20803o;

    /* JADX INFO: renamed from: p */
    public int f20804p;

    /* JADX INFO: renamed from: q */
    public List f20805q;

    /* JADX INFO: renamed from: r */
    public zzq f20806r;

    /* JADX INFO: renamed from: s */
    public long f20807s;

    /* JADX INFO: renamed from: t */
    public boolean f20808t;

    /* JADX INFO: renamed from: u */
    public int f20809u;

    /* JADX INFO: renamed from: v */
    public int f20810v;

    /* JADX INFO: renamed from: w */
    public int f20811w;

    /* JADX INFO: renamed from: x */
    public int f20812x;

    /* JADX INFO: renamed from: y */
    public float f20813y;

    /* JADX INFO: renamed from: z */
    public int f20814z;

    public /* synthetic */ zzt(zzv zzvVar) {
        this.f20789a = zzvVar.f21047a;
        this.f20790b = zzvVar.f21048b;
        this.f20791c = zzvVar.f21049c;
        this.f20792d = zzvVar.f21050d;
        this.f20793e = zzvVar.f21051e;
        this.f20794f = zzvVar.f21052f;
        this.f20796h = zzvVar.f21054h;
        this.f20797i = zzvVar.f21055i;
        this.f20798j = zzvVar.f21057k;
        this.f20799k = zzvVar.f21058l;
        this.f20800l = zzvVar.f21059m;
        this.f20801m = zzvVar.f21060n;
        this.f20802n = zzvVar.f21061o;
        this.f20803o = zzvVar.f21062p;
        this.f20804p = zzvVar.f21063q;
        this.f20805q = zzvVar.f21064r;
        this.f20806r = zzvVar.f21065s;
        this.f20807s = zzvVar.f21066t;
        this.f20808t = zzvVar.f21067u;
        this.f20809u = zzvVar.f21068v;
        this.f20810v = zzvVar.f21069w;
        this.f20811w = zzvVar.f21070x;
        this.f20812x = zzvVar.f21071y;
        this.f20813y = zzvVar.f21072z;
        this.f20814z = zzvVar.f21031A;
        this.f20775A = zzvVar.f21032B;
        this.f20776B = zzvVar.f21033C;
        this.f20777C = zzvVar.f21034D;
        this.f20778D = zzvVar.f21035E;
        this.f20779E = zzvVar.f21036F;
        this.f20780F = zzvVar.f21037G;
        this.f20781G = zzvVar.f21038H;
        this.f20782H = zzvVar.f21039I;
        this.f20783I = zzvVar.f21040J;
        this.f20784J = zzvVar.f21041K;
        this.f20785K = zzvVar.f21042L;
        this.f20786L = zzvVar.f21043M;
        this.f20787M = zzvVar.f21044N;
        this.f20788N = zzvVar.f21045O;
    }

    /* JADX INFO: renamed from: a */
    public final void m8849a(int i2) {
        this.f20784J = i2;
    }

    /* JADX INFO: renamed from: b */
    public final zzv m8850b() {
        return new zzv(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m8851c(int i2) {
        this.f20789a = Integer.toString(i2);
    }

    /* JADX INFO: renamed from: d */
    public final void m8852d(String str) {
        this.f20801m = zzas.m4356h(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m8853e(String str) {
        this.f20802n = zzas.m4356h(str);
    }

    public zzt() {
        zzgzi zzgziVar = zzgwt.f18303t;
        this.f20791c = zzgyo.f18355w;
        this.f20796h = -1;
        this.f20797i = -1;
        this.f20803o = -1;
        this.f20804p = -1;
        this.f20807s = LocationRequestCompat.PASSIVE_INTERVAL;
        this.f20809u = -1;
        this.f20810v = -1;
        this.f20811w = -1;
        this.f20812x = -1;
        this.f20813y = -1.0f;
        this.f20775A = 1.0f;
        this.f20777C = -1;
        this.f20779E = -1;
        this.f20780F = -1;
        this.f20781G = -1;
        this.f20782H = -1;
        this.f20783I = -1;
        this.f20786L = -1;
        this.f20787M = 1;
        this.f20788N = 0;
        this.f20795g = 0;
    }
}
