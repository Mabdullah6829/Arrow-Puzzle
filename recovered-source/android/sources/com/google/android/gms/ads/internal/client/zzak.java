package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzbrh;

/* JADX INFO: loaded from: classes.dex */
final class zzak extends zzax {
    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2796a() {
        return new zzbrh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        try {
            return ((zzbrd) com.google.android.gms.ads.internal.util.client.zzs.m3079a(null, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaj
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                /* JADX INFO: renamed from: a */
                public final Object mo2799a(IBinder iBinder) {
                    IBinder iBinder2 = iBinder;
                    int i2 = zzbrc.f9289s;
                    if (iBinder2 == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbrd ? (zzbrd) iInterfaceQueryLocalInterface : new zzbrb(iBinder2, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                }
            })).mo5121v2(new ObjectWrapper(null), null, new zzbqu());
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2794n3(new ObjectWrapper(null), null, 261710000, new zzbqu());
    }
}
