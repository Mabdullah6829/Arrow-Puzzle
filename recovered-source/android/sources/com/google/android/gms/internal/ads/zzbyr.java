package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyr extends NativeAd.Image {

    /* JADX INFO: renamed from: a */
    public final zzbml f9555a;

    /* JADX INFO: renamed from: b */
    public final Drawable f9556b;

    public zzbyr(zzbml zzbmlVar) {
        this.f9555a = zzbmlVar;
        Drawable drawable = null;
        try {
            IObjectWrapper iObjectWrapperZzb = zzbmlVar.zzb();
            if (iObjectWrapperZzb != null) {
                drawable = (Drawable) ObjectWrapper.m3697u0(iObjectWrapperZzb);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
        this.f9556b = drawable;
        try {
            this.f9555a.zzc();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
        }
        try {
            this.f9555a.mo5061d();
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e3);
        }
        try {
            this.f9555a.mo5058a();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e4);
        }
        try {
            this.f9555a.mo5059b();
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e5);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8245O4)).booleanValue()) {
            try {
                this.f9555a.mo5060c();
            } catch (RemoteException unused) {
            }
        }
    }
}
