package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public final class zzeb extends zzbel implements zzed {
    public zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    /* JADX INFO: renamed from: J2 */
    public final void mo2933J2(boolean z) {
        Parcel parcelM4810u = m4810u();
        ClassLoader classLoader = zzben.f7689a;
        parcelM4810u.writeInt(z ? 1 : 0);
        m4811u0(5, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    /* JADX INFO: renamed from: a */
    public final void mo2934a() {
        m4811u0(1, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    /* JADX INFO: renamed from: b */
    public final void mo2935b() {
        m4811u0(2, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    /* JADX INFO: renamed from: c */
    public final void mo2936c() {
        m4811u0(3, m4810u());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() {
        m4811u0(4, m4810u());
    }
}
