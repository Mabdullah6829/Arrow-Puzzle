package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzign extends zzide {

    /* JADX INFO: renamed from: s */
    public final zzigp f19871s;

    /* JADX INFO: renamed from: t */
    public zzidg f19872t = m8414a();

    public zzign(zzigq zzigqVar) {
        this.f19871s = new zzigp(zzigqVar);
    }

    /* JADX INFO: renamed from: a */
    public final zzidg m8414a() {
        zzigp zzigpVar = this.f19871s;
        if (zzigpVar.hasNext()) {
            return new zzidd(zzigpVar.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19872t != null;
    }

    @Override // com.google.android.gms.internal.ads.zzidg
    public final byte zza() {
        zzidg zzidgVar = this.f19872t;
        if (zzidgVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzidgVar.zza();
        if (!this.f19872t.hasNext()) {
            this.f19872t = m8414a();
        }
        return bZza;
    }
}
