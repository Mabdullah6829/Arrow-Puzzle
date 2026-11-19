package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbsk extends zzbem implements zzbsl {
    public zzbsk() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzdpy zzdpyVar;
        com.google.android.gms.ads.internal.client.zzea zzeaVar = null;
        zzbmiVar = null;
        zzbmiVar = null;
        zzbmi zzbmiVar = null;
        zzbso zzbsmVar = null;
        if (i2 == 3) {
            zzduh zzduhVar = (zzduh) this;
            Preconditions.m3540d("#008 Must be called on the main UI thread.");
            if (zzduhVar.f12986v) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzeaVar = zzduhVar.f12984t;
            }
            parcel2.writeNoException();
            zzben.m4817e(parcel2, zzeaVar);
        } else if (i2 == 4) {
            zzduh zzduhVar2 = (zzduh) this;
            Preconditions.m3540d("#008 Must be called on the main UI thread.");
            zzduhVar2.m6063l4();
            zzdpw zzdpwVar = zzduhVar2.f12985u;
            if (zzdpwVar != null) {
                zzdpwVar.m5989p();
            }
            zzduhVar2.f12985u = null;
            zzduhVar2.f12983s = null;
            zzduhVar2.f12984t = null;
            zzduhVar2.f12986v = true;
            parcel2.writeNoException();
        } else if (i2 == 5) {
            IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsmVar = iInterfaceQueryLocalInterface instanceof zzbso ? (zzbso) iInterfaceQueryLocalInterface : new zzbsm(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            }
            zzben.m4818f(parcel);
            ((zzduh) this).m6062k4(iObjectWrapperM3696k0, zzbsmVar);
            parcel2.writeNoException();
        } else if (i2 == 6) {
            IObjectWrapper iObjectWrapperM2440g = AbstractC1456a.m2440g(parcel, parcel);
            Preconditions.m3540d("#008 Must be called on the main UI thread.");
            ((zzduh) this).m6062k4(iObjectWrapperM2440g, new zzduf());
            parcel2.writeNoException();
        } else {
            if (i2 != 7) {
                return false;
            }
            zzduh zzduhVar3 = (zzduh) this;
            Preconditions.m3540d("#008 Must be called on the main UI thread.");
            if (zzduhVar3.f12986v) {
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzdpw zzdpwVar2 = zzduhVar3.f12985u;
                if (zzdpwVar2 != null && (zzdpyVar = zzdpwVar2.f12563F) != null) {
                    synchronized (zzdpyVar) {
                        zzbmiVar = zzdpyVar.f12601a;
                    }
                }
            }
            parcel2.writeNoException();
            zzben.m4817e(parcel2, zzbmiVar);
        }
        return true;
    }
}
