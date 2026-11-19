package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class zzaap extends zzaat {

    /* JADX INFO: renamed from: b */
    public static final zzaap f21872b = new zzaap(zzaav.f21887a);

    /* JADX INFO: renamed from: a */
    public final AtomicReference f21873a;

    public zzaap(zzaat zzaatVar) {
        this.f21873a = new AtomicReference(zzaatVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    /* JADX INFO: renamed from: a */
    public final void mo9316a(String str, Level level, boolean z) {
        ((zzaat) this.f21873a.get()).mo9316a(str, level, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    /* JADX INFO: renamed from: b */
    public final zzabe mo9317b() {
        return ((zzaat) this.f21873a.get()).mo9317b();
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    /* JADX INFO: renamed from: c */
    public final zzzj mo9318c() {
        return ((zzaat) this.f21873a.get()).mo9318c();
    }
}
