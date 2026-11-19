package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;

/* JADX INFO: loaded from: classes.dex */
final class zzav extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NativeAdView f3073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FrameLayout f3074c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f3075d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzaw f3076e;

    public zzav(zzaw zzawVar, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f3073b = nativeAdView;
        this.f3074c = frameLayout;
        this.f3075d = context;
        this.f3076e = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3075d, "native_ad_view_delegate");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        Context context = this.f3075d;
        zzbix.m5032a(context);
        boolean zBooleanValue = ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8483cc)).booleanValue();
        zzaw zzawVar = this.f3076e;
        FrameLayout frameLayout = this.f3074c;
        NativeAdView nativeAdView = this.f3073b;
        if (zBooleanValue) {
            try {
                IBinder iBinderMo5067q3 = ((zzbms) com.google.android.gms.ads.internal.util.client.zzs.m3079a(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzau
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    /* JADX INFO: renamed from: a */
                    public final Object mo2799a(IBinder iBinder) {
                        IBinder iBinder2 = iBinder;
                        int i2 = zzbmr.f9183s;
                        if (iBinder2 == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                        return iInterfaceQueryLocalInterface instanceof zzbms ? (zzbms) iInterfaceQueryLocalInterface : new zzbmq(iBinder2);
                    }
                })).mo5067q3(new ObjectWrapper(context), new ObjectWrapper(nativeAdView), new ObjectWrapper(frameLayout));
                int i2 = zzbmo.f9182s;
                if (iBinderMo5067q3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderMo5067q3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof zzbmp ? (zzbmp) iInterfaceQueryLocalInterface : new zzbmn(iBinderMo5067q3);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzcah zzcahVarM5286c = zzcaf.m5286c(context);
                zzawVar.f3082f = zzcahVarM5286c;
                zzcahVarM5286c.mo5291a("ClientApiBroker.createNativeAdViewDelegate", e);
                return null;
            }
        }
        try {
            IBinder iBinderMo5067q4 = ((zzbms) zzawVar.f3080d.m3698b(context)).mo5067q3(new ObjectWrapper(context), new ObjectWrapper(nativeAdView), new ObjectWrapper(frameLayout));
            if (iBinderMo5067q4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderMo5067q4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface2 instanceof zzbmp ? (zzbmp) iInterfaceQueryLocalInterface2 : new zzbmn(iBinderMo5067q4);
        } catch (RemoteException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2795v0(new ObjectWrapper(this.f3073b), new ObjectWrapper(this.f3074c));
    }
}
