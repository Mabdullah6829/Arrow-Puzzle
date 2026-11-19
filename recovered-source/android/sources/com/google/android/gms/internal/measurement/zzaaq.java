package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaq implements zzaai {

    /* JADX INFO: renamed from: a */
    public final Level f21874a;

    /* JADX INFO: renamed from: b */
    public final Set f21875b;

    /* JADX INFO: renamed from: c */
    public final zzzq f21876c;

    private zzaaq() {
        this(Level.ALL, zzaas.f21880f, zzaas.f21881g);
    }

    @Override // com.google.android.gms.internal.measurement.zzaai
    public final zzzf zza(String str) {
        return new zzaas(str, this.f21874a, this.f21875b, this.f21876c);
    }

    public zzaaq(Level level, Set set, zzzq zzzqVar) {
        this.f21874a = level;
        this.f21875b = set;
        this.f21876c = zzzqVar;
    }
}
