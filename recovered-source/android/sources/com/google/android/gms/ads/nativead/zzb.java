package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbmp;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzb implements zzblx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NativeAdView f3779a;

    /* JADX INFO: renamed from: a */
    public final void m3313a(MediaContent mediaContent) {
        zzbmp zzbmpVar = this.f3779a.f3777t;
        if (zzbmpVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfb) {
                zzbmpVar.mo2956j2(((zzfb) mediaContent).f3178a);
            } else if (mediaContent == null) {
                zzbmpVar.mo2956j2(null);
            } else {
                zzo.m3068a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzo.m3071d("Unable to call setMediaContent on delegate", e);
        }
    }
}
