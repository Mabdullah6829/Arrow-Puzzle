package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmm extends NativeAd.Image {

    /* JADX INFO: renamed from: a */
    public final zzbml f9176a;

    /* JADX INFO: renamed from: b */
    public final Drawable f9177b;

    /* JADX INFO: renamed from: c */
    public final Uri f9178c;

    /* JADX INFO: renamed from: d */
    public final double f9179d;

    /* JADX INFO: renamed from: e */
    public final int f9180e;

    /* JADX INFO: renamed from: f */
    public final int f9181f;

    public zzbmm(zzbml zzbmlVar) {
        Drawable drawable;
        double dMo5061d;
        int iMo5058a;
        this.f9176a = zzbmlVar;
        Uri uriZzc = null;
        try {
            IObjectWrapper iObjectWrapperZzb = zzbmlVar.zzb();
            drawable = iObjectWrapperZzb != null ? (Drawable) ObjectWrapper.m3697u0(iObjectWrapperZzb) : null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
        this.f9177b = drawable;
        try {
            uriZzc = this.f9176a.zzc();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
        }
        this.f9178c = uriZzc;
        try {
            dMo5061d = this.f9176a.mo5061d();
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e3);
            dMo5061d = 1.0d;
        }
        this.f9179d = dMo5061d;
        int iMo5059b = -1;
        try {
            iMo5058a = this.f9176a.mo5058a();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e4);
            iMo5058a = -1;
        }
        this.f9180e = iMo5058a;
        try {
            iMo5059b = this.f9176a.mo5059b();
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e5);
        }
        this.f9181f = iMo5059b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    /* JADX INFO: renamed from: a */
    public final Drawable mo2769a() {
        return this.f9177b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    /* JADX INFO: renamed from: b */
    public final double mo2770b() {
        return this.f9179d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    /* JADX INFO: renamed from: c */
    public final Uri mo2771c() {
        return this.f9178c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    /* JADX INFO: renamed from: d */
    public final int mo2772d() {
        return this.f9180e;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    /* JADX INFO: renamed from: e */
    public final int mo2773e() {
        return this.f9181f;
    }
}
