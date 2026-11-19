package com.google.android.gms.ads.internal.client;

import android.content.ContextWrapper;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzat extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ContextWrapper f3070b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzaw f3071c;

    public zzat(zzaw zzawVar, ContextWrapper contextWrapper) {
        this.f3070b = contextWrapper;
        Objects.requireNonNull(zzawVar);
        this.f3071c = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3070b, "mobile_ads_settings");
        return new zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        ContextWrapper contextWrapper = this.f3070b;
        zzbix.m5032a(contextWrapper);
        boolean zBooleanValue = ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8483cc)).booleanValue();
        zzaw zzawVar = this.f3071c;
        if (!zBooleanValue) {
            zzfc zzfcVar = zzawVar.f3079c;
            try {
                ObjectWrapper objectWrapper = new ObjectWrapper(contextWrapper);
                zzcz zzczVar = (zzcz) zzfcVar.m3698b(contextWrapper);
                Parcel parcelM4810u = zzczVar.m4810u();
                zzben.m4817e(parcelM4810u, objectWrapper);
                parcelM4810u.writeInt(261710000);
                Parcel parcelM4809k0 = zzczVar.m4809k0(1, parcelM4810u);
                IBinder strongBinder = parcelM4809k0.readStrongBinder();
                parcelM4809k0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(strongBinder);
            } catch (RemoteException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            ObjectWrapper objectWrapper2 = new ObjectWrapper(contextWrapper);
            zzcz zzczVar2 = (zzcz) com.google.android.gms.ads.internal.util.client.zzs.m3079a(contextWrapper, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzas
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object mo2799a(IBinder iBinder) {
                    IBinder iBinder2 = iBinder;
                    if (iBinder2 == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface2 : new zzcz(iBinder2);
                }
            });
            Parcel parcelM4810u2 = zzczVar2.m4810u();
            zzben.m4817e(parcelM4810u2, objectWrapper2);
            parcelM4810u2.writeInt(261710000);
            Parcel parcelM4809k1 = zzczVar2.m4809k0(1, parcelM4810u2);
            IBinder strongBinder2 = parcelM4809k1.readStrongBinder();
            parcelM4809k1.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface2 instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface2 : new zzcw(strongBinder2);
        } catch (RemoteException e3) {
            e = e3;
            zzcah zzcahVarM5286c = zzcaf.m5286c(contextWrapper);
            zzawVar.f3082f = zzcahVarM5286c;
            zzcahVarM5286c.mo5291a("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e4) {
            e = e4;
            zzcah zzcahVarM5286c2 = zzcaf.m5286c(contextWrapper);
            zzawVar.f3082f = zzcahVarM5286c2;
            zzcahVarM5286c2.mo5291a("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            zzcah zzcahVarM5286c3 = zzcaf.m5286c(contextWrapper);
            zzawVar.f3082f = zzcahVarM5286c3;
            zzcahVarM5286c3.mo5291a("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2783F3(new ObjectWrapper(this.f3070b), 261710000);
    }
}
