package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public final class zzdy extends zzbel implements zzea {
    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: K2 */
    public final void mo2921K2(zzed zzedVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4817e(parcelM4810u, zzedVar);
        m4811u0(8, parcelM4810u);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: e */
    public final float mo2922e() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: j */
    public final zzed mo2923j() {
        zzed zzebVar;
        Parcel parcelM4809k0 = m4809k0(11, m4810u());
        IBinder strongBinder = parcelM4809k0.readStrongBinder();
        if (strongBinder == null) {
            zzebVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzebVar = iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(strongBinder);
        }
        parcelM4809k0.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        throw null;
    }
}
