package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzmu {

    /* JADX INFO: renamed from: t */
    public static final zzxl f20455t = new zzxl(-1, new Object());

    /* JADX INFO: renamed from: a */
    public final zzbf f20456a;

    /* JADX INFO: renamed from: b */
    public final zzxl f20457b;

    /* JADX INFO: renamed from: c */
    public final long f20458c;

    /* JADX INFO: renamed from: d */
    public final long f20459d;

    /* JADX INFO: renamed from: e */
    public final int f20460e;

    /* JADX INFO: renamed from: f */
    public final zzjm f20461f;

    /* JADX INFO: renamed from: g */
    public final boolean f20462g;

    /* JADX INFO: renamed from: h */
    public final zzzo f20463h;

    /* JADX INFO: renamed from: i */
    public final zzabj f20464i;

    /* JADX INFO: renamed from: j */
    public final List f20465j;

    /* JADX INFO: renamed from: k */
    public final zzxl f20466k;

    /* JADX INFO: renamed from: l */
    public final boolean f20467l;

    /* JADX INFO: renamed from: m */
    public final int f20468m;

    /* JADX INFO: renamed from: n */
    public final int f20469n;

    /* JADX INFO: renamed from: o */
    public final zzav f20470o;

    /* JADX INFO: renamed from: p */
    public volatile long f20471p;

    /* JADX INFO: renamed from: q */
    public volatile long f20472q;

    /* JADX INFO: renamed from: r */
    public volatile long f20473r;

    /* JADX INFO: renamed from: s */
    public volatile long f20474s;

    public zzmu(zzbf zzbfVar, zzxl zzxlVar, long j2, long j3, int i2, zzjm zzjmVar, boolean z, zzzo zzzoVar, zzabj zzabjVar, List list, zzxl zzxlVar2, boolean z2, int i3, int i4, zzav zzavVar, long j4, long j5, long j6, long j7) {
        this.f20456a = zzbfVar;
        this.f20457b = zzxlVar;
        this.f20458c = j2;
        this.f20459d = j3;
        this.f20460e = i2;
        this.f20461f = zzjmVar;
        this.f20462g = z;
        this.f20463h = zzzoVar;
        this.f20464i = zzabjVar;
        this.f20465j = list;
        this.f20466k = zzxlVar2;
        this.f20467l = z2;
        this.f20468m = i3;
        this.f20469n = i4;
        this.f20470o = zzavVar;
        this.f20471p = j4;
        this.f20472q = j5;
        this.f20473r = j6;
        this.f20474s = j7;
    }

    /* JADX INFO: renamed from: a */
    public static zzmu m8756a(zzabj zzabjVar) {
        zzbf zzbfVar = zzbf.f7725a;
        zzzo zzzoVar = zzzo.f21490d;
        zzgwt zzgwtVar = zzgyo.f18355w;
        zzav zzavVar = zzav.f6969d;
        zzxl zzxlVar = f20455t;
        return new zzmu(zzbfVar, zzxlVar, -9223372036854775807L, 0L, 1, null, false, zzzoVar, zzabjVar, zzgwtVar, zzxlVar, false, 1, 0, zzavVar, 0L, 0L, 0L, 0L);
    }

    /* JADX INFO: renamed from: b */
    public final zzmu m8757b(zzxl zzxlVar, long j2, long j3, long j4, long j5, zzzo zzzoVar, zzabj zzabjVar, List list) {
        zzxl zzxlVar2 = this.f20466k;
        boolean z = this.f20467l;
        int i2 = this.f20468m;
        int i3 = this.f20469n;
        zzav zzavVar = this.f20470o;
        long j6 = this.f20471p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmu(this.f20456a, zzxlVar, j3, j4, this.f20460e, this.f20461f, this.f20462g, zzzoVar, zzabjVar, list, zzxlVar2, z, i2, i3, zzavVar, j6, j5, j2, jElapsedRealtime);
    }

    /* JADX INFO: renamed from: c */
    public final zzmu m8758c(zzbf zzbfVar) {
        return new zzmu(zzbfVar, this.f20457b, this.f20458c, this.f20459d, this.f20460e, this.f20461f, this.f20462g, this.f20463h, this.f20464i, this.f20465j, this.f20466k, this.f20467l, this.f20468m, this.f20469n, this.f20470o, this.f20471p, this.f20472q, this.f20473r, this.f20474s);
    }

    /* JADX INFO: renamed from: d */
    public final zzmu m8759d(int i2) {
        return new zzmu(this.f20456a, this.f20457b, this.f20458c, this.f20459d, i2, this.f20461f, this.f20462g, this.f20463h, this.f20464i, this.f20465j, this.f20466k, this.f20467l, this.f20468m, this.f20469n, this.f20470o, this.f20471p, this.f20472q, this.f20473r, this.f20474s);
    }

    /* JADX INFO: renamed from: e */
    public final zzmu m8760e(zzjm zzjmVar) {
        return new zzmu(this.f20456a, this.f20457b, this.f20458c, this.f20459d, this.f20460e, zzjmVar, this.f20462g, this.f20463h, this.f20464i, this.f20465j, this.f20466k, this.f20467l, this.f20468m, this.f20469n, this.f20470o, this.f20471p, this.f20472q, this.f20473r, this.f20474s);
    }

    /* JADX INFO: renamed from: f */
    public final zzmu m8761f(boolean z) {
        return new zzmu(this.f20456a, this.f20457b, this.f20458c, this.f20459d, this.f20460e, this.f20461f, z, this.f20463h, this.f20464i, this.f20465j, this.f20466k, this.f20467l, this.f20468m, this.f20469n, this.f20470o, this.f20471p, this.f20472q, this.f20473r, this.f20474s);
    }

    /* JADX INFO: renamed from: g */
    public final zzmu m8762g(zzxl zzxlVar) {
        return new zzmu(this.f20456a, this.f20457b, this.f20458c, this.f20459d, this.f20460e, this.f20461f, this.f20462g, this.f20463h, this.f20464i, this.f20465j, zzxlVar, this.f20467l, this.f20468m, this.f20469n, this.f20470o, this.f20471p, this.f20472q, this.f20473r, this.f20474s);
    }

    /* JADX INFO: renamed from: h */
    public final zzmu m8763h(int i2, int i3, boolean z) {
        return new zzmu(this.f20456a, this.f20457b, this.f20458c, this.f20459d, this.f20460e, this.f20461f, this.f20462g, this.f20463h, this.f20464i, this.f20465j, this.f20466k, z, i2, i3, this.f20470o, this.f20471p, this.f20472q, this.f20473r, this.f20474s);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8764i() {
        return this.f20460e == 3 && this.f20467l && this.f20469n == 0;
    }
}
