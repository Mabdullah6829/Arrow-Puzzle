package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzdqw;
import com.google.android.gms.internal.ads.zzebk;
import com.google.android.gms.internal.ads.zzesl;
import com.google.android.gms.internal.ads.zzffo;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfkg;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: F3 */
    public final zzcy mo2783F3(IObjectWrapper iObjectWrapper, int i2) {
        return zzcnq.m5679f((Context) ObjectWrapper.m3697u0(iObjectWrapper), null, i2).mo5691j();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: J1 */
    public final zzccp mo2784J1(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i2) {
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        zzfkg zzfkgVarMo5701t = zzcnq.m5679f(context, zzbvjVar, i2).mo5701t();
        zzfkgVarMo5701t.mo5786d(context);
        zzfkgVarMo5701t.mo5787m(str);
        return zzfkgVarMo5701t.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: L1 */
    public final zzbu mo2785L1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        zzfhc zzfhcVarMo5694m = zzcnq.m5679f(context, zzbvjVar, i2).mo5694m();
        zzfhcVarMo5694m.mo5759b(context);
        zzfhcVarMo5694m.mo5758a(zzrVar);
        zzfhcVarMo5694m.mo5757D(str);
        return zzfhcVarMo5694m.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: O3 */
    public final zzbu mo2786O3(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        zzffo zzffoVarMo5696o = zzcnq.m5679f(context, zzbvjVar, i2).mo5696o();
        zzffoVarMo5696o.mo5746m(str);
        zzffoVarMo5696o.mo5745d(context);
        return zzffoVarMo5696o.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: P0 */
    public final zzcet mo2787P0(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        return zzcnq.m5679f((Context) ObjectWrapper.m3697u0(iObjectWrapper), zzbvjVar, i2).mo5703v();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: P1 */
    public final zzbq mo2788P1(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i2) {
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        return new zzesl(zzcnq.m5679f(context, zzbvjVar, i2), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: T2 */
    public final zzch mo2789T2(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        return zzcnq.m5679f((Context) ObjectWrapper.m3697u0(iObjectWrapper), zzbvjVar, i2).mo5692k();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: e4 */
    public final zzbzb mo2790e4(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        return zzcnq.m5679f((Context) ObjectWrapper.m3697u0(iObjectWrapper), zzbvjVar, i2).mo5705x();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: f3 */
    public final zzdt mo2791f3(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2) {
        return zzcnq.m5679f((Context) ObjectWrapper.m3697u0(iObjectWrapper), zzbvjVar, i2).mo5685c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: g0 */
    public final zzbzi mo2792g0(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.m3697u0(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelM2984w = AdOverlayInfoParcel.m2984w(activity.getIntent());
        if (adOverlayInfoParcelM2984w == null) {
            return new zzw(activity);
        }
        int i2 = adOverlayInfoParcelM2984w.f3289C;
        if (i2 == 1) {
            return new zzv(activity);
        }
        if (i2 == 2) {
            return new zzai(activity);
        }
        if (i2 == 3) {
            return new zzaj(activity);
        }
        if (i2 != 4) {
            return i2 != 5 ? new zzw(activity) : new zzag(activity);
        }
        return new zzac(activity, adOverlayInfoParcelM2984w);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: i1 */
    public final zzbu mo2793i1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        zzfis zzfisVarMo5698q = zzcnq.m5679f(context, zzbvjVar, i2).mo5698q();
        zzfisVarMo5698q.mo5780b(context);
        zzfisVarMo5698q.mo5779a(zzrVar);
        zzfisVarMo5698q.mo5778D(str);
        return zzfisVarMo5698q.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: n3 */
    public final zzbra mo2794n3(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i2, zzbqx zzbqxVar) {
        Context context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
        zzebk zzebkVarMo5683a = zzcnq.m5679f(context, zzbvjVar, i2).mo5683a();
        zzebkVarMo5683a.mo5766d(context);
        zzebkVarMo5683a.mo5765a(zzbqxVar);
        return zzebkVarMo5683a.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    /* JADX INFO: renamed from: v0 */
    public final zzbmp mo2795v0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdqw((FrameLayout) ObjectWrapper.m3697u0(iObjectWrapper), (FrameLayout) ObjectWrapper.m3697u0(iObjectWrapper2));
    }
}
