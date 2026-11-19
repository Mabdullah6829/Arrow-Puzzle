package com.google.android.gms.internal.measurement;

import java.util.UUID;
import p003C.AbstractC0120k;

/* JADX INFO: loaded from: classes2.dex */
final class zzwa extends zzwb {
    @Override // com.google.android.gms.internal.measurement.zzwb
    /* JADX INFO: renamed from: a */
    public final zzwi mo10689a(String str) {
        boolean z;
        zzws zzwsVarMo10682z;
        zzwl zzwlVar = zzwk.f23028e;
        zzwq zzwqVarM10686c = zzvy.m10686c();
        zzws zzwsVar = zzwqVarM10686c.f23052b;
        if (zzwsVar == zzwg.f23021y) {
            zzwsVar = null;
            zzvy.m10685b(zzwqVarM10686c, null);
            z = true;
        } else {
            z = false;
        }
        if (zzwsVar == null) {
            UUID uuidM10688b = zzvz.f23012c.m10688b();
            String strM10673c = zzvn.m10673c(uuidM10688b);
            zzvr zzvrVar = zzwd.f23017y;
            AbstractC0120k abstractC0120k = (AbstractC0120k) zzvy.f23008a.get();
            if (!abstractC0120k.isEmpty()) {
                abstractC0120k.forEach(new zzwe());
            }
            zzwsVarMo10682z = new zzwf(uuidM10688b, strM10673c, str, zzwlVar, zzvrVar, zzwqVarM10686c);
        } else {
            zzwsVarMo10682z = zzwsVar instanceof zzvs ? ((zzvs) zzwsVar).mo10682z(str, zzwlVar, false, zzwqVarM10686c) : zzwsVar.mo10690F(str, zzwlVar, zzwqVarM10686c);
        }
        zzvy.m10685b(zzwqVarM10686c, zzwsVarMo10682z);
        return new zzwi(zzwsVarMo10682z, z);
    }
}
