package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdb {
    /* JADX INFO: renamed from: a */
    public static final zzccp m5347a(Context context, String str, zzbvf zzbvfVar) {
        try {
            IBinder iBinderM5337D0 = ((zzcct) com.google.android.gms.ads.internal.util.client.zzs.m3079a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzcda
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                /* JADX INFO: renamed from: a */
                public final Object mo2799a(IBinder iBinder) {
                    IBinder iBinder2 = iBinder;
                    if (iBinder2 == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcct ? (zzcct) iInterfaceQueryLocalInterface : new zzcct(iBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                }
            })).m5337D0(new ObjectWrapper(context), str, zzbvfVar);
            if (iBinderM5337D0 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM5337D0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzccp ? (zzccp) iInterfaceQueryLocalInterface : new zzccn(iBinderM5337D0);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
