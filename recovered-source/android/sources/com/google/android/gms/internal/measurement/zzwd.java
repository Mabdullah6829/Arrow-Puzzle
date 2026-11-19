package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwd extends zzvn implements zzvs {

    /* JADX INFO: renamed from: y */
    public static final zzvr f23017y = new zzvr();

    /* JADX INFO: renamed from: x */
    public final Exception f23018x;

    public zzwd(UUID uuid, String str, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>", uuid, str, zzwqVar);
        this.f23018x = zzvrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    /* JADX INFO: renamed from: F */
    public final zzws mo10690F(String str, zzwl zzwlVar, zzwq zzwqVar) {
        AtomicReference atomicReference = zzvy.f23008a;
        return mo10682z(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    /* JADX INFO: renamed from: b */
    public final Exception mo10681b() {
        return this.f23018x;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    /* JADX INFO: renamed from: z */
    public final zzws mo10682z(String str, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        if (z) {
            AtomicReference atomicReference = zzvy.f23008a;
        }
        return new zzwf(str, this, zzwlVar, z, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwk.f23028e;
    }
}
