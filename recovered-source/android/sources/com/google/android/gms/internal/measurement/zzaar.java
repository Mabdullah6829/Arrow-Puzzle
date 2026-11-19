package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class zzaar extends zzaag {

    /* JADX INFO: renamed from: b */
    public final Level f21877b;

    /* JADX INFO: renamed from: c */
    public final Set f21878c;

    /* JADX INFO: renamed from: d */
    public final zzzq f21879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaar(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = zzaas.f21880f;
        this.f21877b = level;
        this.f21878c = zzaas.f21880f;
        this.f21879d = zzaas.f21881g;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: b */
    public final boolean mo9314b(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: c */
    public final void mo9315c(zzxz zzxzVar) {
        String strMo10727a = (String) zzxzVar.m10725k().mo10716d(zzyw.f23117a);
        if (strMo10727a == null) {
            strMo10727a = this.f21859a;
        }
        if (strMo10727a == null) {
            strMo10727a = zzxzVar.m10722h().mo10727a();
            int iIndexOf = strMo10727a.indexOf(36, strMo10727a.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strMo10727a = strMo10727a.substring(0, iIndexOf);
            }
        }
        zzaas.m9319e(zzxzVar, zzaal.m9311a(strMo10727a), this.f21877b, this.f21878c, this.f21879d);
    }
}
