package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwg extends zzvt {

    /* JADX INFO: renamed from: y */
    public static final zzwg f23021y;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        f23021y = new zzwg("<skip trace>", uuidRandomUUID, zzvn.m10673c(uuidRandomUUID), zzwk.f23028e, zzvy.m10686c());
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    /* JADX INFO: renamed from: F */
    public final zzws mo10690F(String str, zzwl zzwlVar, zzwq zzwqVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.f23028e;
    }
}
