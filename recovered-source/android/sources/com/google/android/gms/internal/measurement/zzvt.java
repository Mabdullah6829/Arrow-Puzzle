package com.google.android.gms.internal.measurement;

import java.util.UUID;
import p001B.AbstractC0076b;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzvt extends zzvn {

    /* JADX INFO: renamed from: x */
    public final zzwl f23005x;

    public zzvt(String str, zzws zzwsVar, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, zzwsVar, zzwqVar);
        AbstractC0076b.m130e(zzwlVar.f23033c);
        this.f23005x = zzwlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwl.m10693a(this.f23005x, zzl());
    }

    public zzvt(String str, UUID uuid, String str2, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, uuid, str2, zzwqVar);
        AbstractC0076b.m130e(zzwlVar.f23033c);
        this.f23005x = zzwlVar;
    }
}
