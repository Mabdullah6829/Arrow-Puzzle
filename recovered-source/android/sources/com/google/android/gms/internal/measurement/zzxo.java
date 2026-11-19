package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxo extends zzxz implements zzyi {
    @Override // com.google.android.gms.internal.measurement.zzxz
    /* JADX INFO: renamed from: c */
    public final zzabl mo10707c() {
        return zzabl.f21917b;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    /* JADX INFO: renamed from: d */
    public final boolean mo10708d(zzyd zzydVar) {
        zzzj zzzjVarM10725k = m10725k();
        int iMo10713a = zzzjVarM10725k.mo10713a();
        for (int i2 = 0; i2 < iMo10713a; i2++) {
            if (zzzjVarM10725k.mo10714b(i2).f23097a == "eye3tag") {
                if (zzzjVarM10725k.mo10716d(zzxx.f23070a) != null) {
                    break;
                }
                zzyl zzylVar = zzxx.f23078i;
                if (zzzjVarM10725k.mo10716d(zzylVar) != null) {
                    break;
                }
                m10726l(zzylVar, zzyv.SMALL);
                break;
            }
        }
        return super.mo10708d(zzydVar);
    }
}
