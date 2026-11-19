package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzwf extends zzvt implements zzvs {

    /* JADX INFO: renamed from: y */
    public final Exception f23019y;

    /* JADX INFO: renamed from: z */
    public final boolean f23020z;

    public zzwf(String str, zzvs zzvsVar, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        super("<missing root>:".concat(str), zzvsVar, zzwl.m10693a(zzwlVar, zzwk.f23029f), zzwqVar);
        this.f23019y = zzvsVar.mo10681b();
        this.f23020z = z;
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
        return this.f23019y;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    /* JADX INFO: renamed from: z */
    public final zzws mo10682z(String str, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        boolean z2 = this.f23020z;
        if (z && !z2) {
            AtomicReference atomicReference = zzvy.f23008a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new zzwf(str, this, zzwlVar, z3, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.f23028e;
    }

    public zzwf(UUID uuid, String str, String str2, zzwl zzwlVar, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>:".concat(str2), uuid, str, zzwl.m10693a(zzwlVar, zzwk.f23029f), zzwqVar);
        this.f23019y = zzvrVar;
        this.f23020z = false;
    }
}
