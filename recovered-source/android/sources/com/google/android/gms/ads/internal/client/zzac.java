package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AdActivity f3033b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzaw f3034c;

    public zzac(zzaw zzawVar, AdActivity adActivity) {
        this.f3033b = adActivity;
        this.f3034c = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3033b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        AdActivity adActivity = this.f3033b;
        zzbix.m5032a(adActivity);
        boolean zBooleanValue = ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8483cc)).booleanValue();
        zzaw zzawVar = this.f3034c;
        if (zBooleanValue) {
            try {
                IBinder iBinderMo5279F2 = ((zzbzl) com.google.android.gms.ads.internal.util.client.zzs.m3079a(adActivity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzab
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    /* JADX INFO: renamed from: a */
                    public final Object mo2799a(IBinder iBinder) {
                        IBinder iBinder2 = iBinder;
                        int i2 = zzbzk.f9565s;
                        if (iBinder2 == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                        return iInterfaceQueryLocalInterface instanceof zzbzl ? (zzbzl) iInterfaceQueryLocalInterface : new zzbzj(iBinder2);
                    }
                })).mo5279F2(new ObjectWrapper(adActivity));
                int i2 = zzbzh.f9564s;
                if (iBinderMo5279F2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderMo5279F2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof zzbzi ? (zzbzi) iInterfaceQueryLocalInterface : new zzbzg(iBinderMo5279F2);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzcah zzcahVarM5286c = zzcaf.m5286c(adActivity.getApplicationContext());
                zzawVar.f3082f = zzcahVarM5286c;
                zzcahVarM5286c.mo5291a("ClientApiBroker.createAdOverlay", e);
                return null;
            }
        }
        try {
            IBinder iBinderMo5279F3 = ((zzbzl) zzawVar.f3081e.m3698b(adActivity)).mo5279F2(new ObjectWrapper(adActivity));
            if (iBinderMo5279F3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderMo5279F3.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface2 instanceof zzbzi ? (zzbzi) iInterfaceQueryLocalInterface2 : new zzbzg(iBinderMo5279F3);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not create remote AdOverlay.", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2792g0(new ObjectWrapper(this.f3033b));
    }
}
