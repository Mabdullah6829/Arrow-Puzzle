package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzifp implements zzifx {

    /* JADX INFO: renamed from: a */
    public final zzifx[] f19829a;

    public zzifp(zzifx... zzifxVarArr) {
        this.f19829a = zzifxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    /* JADX INFO: renamed from: a */
    public final boolean mo8322a(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.f19829a[i2].mo8322a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    /* JADX INFO: renamed from: b */
    public final zzifw mo8323b(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzifx zzifxVar = this.f19829a[i2];
            if (zzifxVar.mo8322a(cls)) {
                return zzifxVar.mo8323b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
