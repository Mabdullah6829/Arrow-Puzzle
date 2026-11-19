package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzaes implements zzafa {

    /* JADX INFO: renamed from: a */
    public final zzafa[] f22062a;

    public zzaes(zzafa... zzafaVarArr) {
        this.f22062a = zzafaVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    /* JADX INFO: renamed from: a */
    public final boolean mo9550a(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.f22062a[i2].mo9550a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    /* JADX INFO: renamed from: b */
    public final zzaez mo9551b(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzafa zzafaVar = this.f22062a[i2];
            if (zzafaVar.mo9550a(cls)) {
                return zzafaVar.mo9551b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
