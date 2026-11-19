package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbnc;

/* JADX INFO: loaded from: classes.dex */
public final class zzfb implements MediaContent {

    /* JADX INFO: renamed from: a */
    public final zzbmi f3178a;

    /* JADX INFO: renamed from: b */
    public final VideoController f3179b = new VideoController();

    public zzfb(zzbmi zzbmiVar) {
        this.f3178a = zzbmiVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    /* JADX INFO: renamed from: a */
    public final boolean mo2757a() {
        try {
            return this.f3178a.zzk();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zza() {
        try {
            return this.f3178a.zzl();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final zzbnc zzb() {
        return null;
    }
}
