package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzauu extends zzimk implements Closeable {
    static {
        zzimr.m8544b(zzauu.class);
    }

    public zzauu(zziml zzimlVar, zzaut zzautVar) {
        zzcip zzcipVar = (zzcip) zzimlVar;
        long jZzb = zzcipVar.zzb();
        this.f19973t = zzimlVar;
        this.f19975v = zzcipVar.zzc();
        zzcipVar.mo5498f(zzcipVar.zzc() + jZzb);
        this.f19976w = zzcipVar.zzc();
        this.f19972s = zzautVar;
    }

    @Override // com.google.android.gms.internal.ads.zzimk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzimk
    public final String toString() {
        String string = this.f19973t.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
