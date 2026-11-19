package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;

/* JADX INFO: loaded from: classes.dex */
final class zzap extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3061b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3062c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbvf f3063d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzaw f3064e;

    public zzap(zzaw zzawVar, Context context, String str, zzbvf zzbvfVar) {
        this.f3061b = context;
        this.f3062c = str;
        this.f3063d = zzbvfVar;
        this.f3064e = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3061b, "native_ad");
        return new zzff();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        Context context = this.f3061b;
        zzbix.m5032a(context);
        boolean zBooleanValue = ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8483cc)).booleanValue();
        zzaw zzawVar = this.f3064e;
        zzbvf zzbvfVar = this.f3063d;
        String str = this.f3062c;
        if (!zBooleanValue) {
            zzi zziVar = zzawVar.f3078b;
            try {
                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                zzbr zzbrVar = (zzbr) zziVar.m3698b(context);
                Parcel parcelM4810u = zzbrVar.m4810u();
                zzben.m4817e(parcelM4810u, objectWrapper);
                parcelM4810u.writeString(str);
                zzben.m4817e(parcelM4810u, zzbvfVar);
                parcelM4810u.writeInt(261710000);
                Parcel parcelM4809k0 = zzbrVar.m4809k0(1, parcelM4810u);
                IBinder strongBinder = parcelM4809k0.readStrongBinder();
                parcelM4809k0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
            } catch (RemoteException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
            zzbr zzbrVar2 = (zzbr) com.google.android.gms.ads.internal.util.client.zzs.m3079a(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzao
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object mo2799a(IBinder iBinder) {
                    IBinder iBinder2 = iBinder;
                    if (iBinder2 == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface2 instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface2 : new zzbr(iBinder2);
                }
            });
            Parcel parcelM4810u2 = zzbrVar2.m4810u();
            zzben.m4817e(parcelM4810u2, objectWrapper2);
            parcelM4810u2.writeString(str);
            zzben.m4817e(parcelM4810u2, zzbvfVar);
            parcelM4810u2.writeInt(261710000);
            Parcel parcelM4809k1 = zzbrVar2.m4809k0(1, parcelM4810u2);
            IBinder strongBinder2 = parcelM4809k1.readStrongBinder();
            parcelM4809k1.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface2 instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface2 : new zzbo(strongBinder2);
        } catch (RemoteException e3) {
            e = e3;
            zzcah zzcahVarM5286c = zzcaf.m5286c(context);
            zzawVar.f3082f = zzcahVarM5286c;
            zzcahVarM5286c.mo5291a("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e4) {
            e = e4;
            zzcah zzcahVarM5286c2 = zzcaf.m5286c(context);
            zzawVar.f3082f = zzcahVarM5286c2;
            zzcahVarM5286c2.mo5291a("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            zzcah zzcahVarM5286c3 = zzcaf.m5286c(context);
            zzawVar.f3082f = zzcahVarM5286c3;
            zzcahVarM5286c3.mo5291a("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2788P1(new ObjectWrapper(this.f3061b), this.f3062c, this.f3063d, 261710000);
    }
}
