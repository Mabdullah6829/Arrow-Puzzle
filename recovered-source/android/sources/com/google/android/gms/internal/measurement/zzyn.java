package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzyn extends zzyq {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzyq f23102c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzyq f23103d;

    public zzyn(zzyq zzyqVar, zzyq zzyqVar2) {
        this.f23102c = zzyqVar;
        this.f23103d = zzyqVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    /* JADX INFO: renamed from: a */
    public final void mo10706a() {
        zzyq zzyqVar = this.f23103d;
        try {
            this.f23102c.mo10706a();
        } finally {
            zzyqVar.mo10706a();
        }
    }
}
