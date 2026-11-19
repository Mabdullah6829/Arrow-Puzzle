package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmz extends zzwz {

    /* JADX INFO: renamed from: c */
    public final zzbe f20485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmz(zzna zznaVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zznaVar);
        this.f20485c = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: d */
    public final zzbd mo4738d(int i2, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.f21246b;
        zzbd zzbdVarMo4738d = zzbfVar.mo4738d(i2, zzbdVar, z);
        if (!zzbfVar.mo4736b(zzbdVarMo4738d.f7634c, this.f20485c, 0L).m4777b()) {
            zzbdVarMo4738d.f7636e = true;
            return zzbdVarMo4738d;
        }
        Object obj = zzbdVar.f7632a;
        Object obj2 = zzbdVar.f7633b;
        int i3 = zzbdVar.f7634c;
        long j2 = zzbdVar.f7635d;
        zzc zzcVar = zzc.f9573b;
        zzbdVarMo4738d.m4753a(obj, obj2, i3, j2, true);
        return zzbdVarMo4738d;
    }
}
