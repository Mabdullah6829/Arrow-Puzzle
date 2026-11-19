package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executor;
import p011H.AbstractC0253Q;

/* JADX INFO: loaded from: classes2.dex */
final class zztx extends zzuw {

    /* JADX INFO: renamed from: a */
    public static final zzuw f22914a = new zztx();

    private zztx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    /* JADX INFO: renamed from: b */
    public final zzui mo10661b(zztr zztrVar, String str, Executor executor, zzru zzruVar) {
        zzadf zzadfVarM9535a;
        zzte zzteVar = (zzte) zztrVar;
        if (zzteVar.f22888f) {
            zzadfVarM9535a = zzadf.m9535a();
        } else {
            zzadf zzadfVar = zzadf.f22012b;
            int i2 = zzacf.f21956a;
            zzadfVarM9535a = zzadf.f22013c;
        }
        return new zzui(str, AbstractC0253Q.m381d(zzteVar.f22883a), new zzvd(zzteVar.f22884b, zzadfVarM9535a), executor, zzruVar, zzteVar.f22885c, new zzwa());
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    /* JADX INFO: renamed from: a */
    public final void mo10660a() {
    }
}
