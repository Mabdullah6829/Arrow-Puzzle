package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhh extends com.google.android.gms.ads.internal.zzc {
    public zzbhh(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(123, zzcbu.m5311a(context), looper, baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zzbhk ? (zzbhk) iInterfaceQueryLocalInterface : new zzbhk(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4888e() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue()) {
            Feature feature = com.google.android.gms.ads.zzh.f4032a;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Objects.m3535a(availableFeatures[i2], feature)) {
                    if (i2 >= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.ads.zzh.f4033b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
