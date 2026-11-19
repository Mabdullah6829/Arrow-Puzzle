package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    /* JADX INFO: renamed from: a */
    public final zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !zzgVar.m9953d(str)) {
            throw new IllegalArgumentException(AbstractC0271e0.m398f("Command not found: ", str));
        }
        zzao zzaoVarM9956g = zzgVar.m9956g(str);
        if (zzaoVarM9956g instanceof zzai) {
            return ((zzai) zzaoVarM9956g).mo9793c(zzgVar, arrayList);
        }
        throw new IllegalArgumentException(AbstractC0271e0.m399g("Function ", str, " is not defined"));
    }
}
