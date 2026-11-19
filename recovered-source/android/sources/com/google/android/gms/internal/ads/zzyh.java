package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzyh extends zzagq {

    /* JADX INFO: renamed from: b */
    public final zzzc f21332b;

    /* JADX INFO: renamed from: c */
    public final zzafx f21333c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f21334d;

    public zzyh(zzzc zzzcVar) {
        super(zzzcVar);
        this.f21332b = zzzcVar;
        this.f21333c = new zzafx();
        this.f21334d = new AtomicReference(zzyg.f21328s);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: a */
    public final void mo4121a(int i2, zzeu zzeuVar) {
        m9030g().mo4121a(i2, zzeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: b */
    public final void mo4095b(long j2, int i2, int i3, int i4, zzahl zzahlVar) {
        m9030g().mo4095b(j2, i2, i3, i4, zzahlVar);
        AtomicReference atomicReference = this.f21334d;
        if (atomicReference.get() == zzyg.f21329t) {
            this.f21332b.m9059k(false);
            atomicReference.set(zzyg.f21330u);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: c */
    public final int mo4096c(zzj zzjVar, int i2, boolean z) {
        return m9030g().mo4096c(zzjVar, i2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: d */
    public final int mo4122d(zzj zzjVar, int i2, boolean z) {
        return m9030g().mo4122d(zzjVar, i2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    /* JADX INFO: renamed from: f */
    public final void mo4098f(zzeu zzeuVar, int i2, int i3) {
        m9030g().mo4098f(zzeuVar, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public final zzahm m9030g() {
        return this.f21334d.get() == zzyg.f21330u ? this.f21333c : this.f21332b;
    }
}
