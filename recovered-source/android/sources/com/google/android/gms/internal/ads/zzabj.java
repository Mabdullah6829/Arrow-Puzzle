package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabj {

    /* JADX INFO: renamed from: a */
    public final int f4844a;

    /* JADX INFO: renamed from: b */
    public final zznf[] f4845b;

    /* JADX INFO: renamed from: c */
    public final zzabb[] f4846c;

    /* JADX INFO: renamed from: d */
    public final zzbn f4847d;

    /* JADX INFO: renamed from: e */
    public final Object f4848e;

    public zzabj(zznf[] zznfVarArr, zzabb[] zzabbVarArr, zzbn zzbnVar, zzabe zzabeVar) {
        int length = zznfVarArr.length;
        zzgtr.m7128a(length == zzabbVarArr.length);
        this.f4845b = zznfVarArr;
        this.f4846c = (zzabb[]) zzabbVarArr.clone();
        this.f4847d = zzbnVar;
        this.f4848e = zzabeVar;
        this.f4844a = length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3924a(int i2) {
        return this.f4845b[i2] != null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3925b(zzabj zzabjVar, int i2) {
        return zzabjVar != null && Objects.equals(this.f4845b[i2], zzabjVar.f4845b[i2]) && Objects.equals(this.f4846c[i2], zzabjVar.f4846c[i2]);
    }
}
