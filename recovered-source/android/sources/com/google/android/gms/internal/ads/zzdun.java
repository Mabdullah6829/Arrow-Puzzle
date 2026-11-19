package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzdun implements zzbly {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzduo f13002a;

    public zzdun(zzduo zzduoVar) {
        this.f13002a = zzduoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    /* JADX INFO: renamed from: a */
    public final void mo5062a(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    /* JADX INFO: renamed from: d */
    public final JSONObject mo5063d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza() {
        zzdpw zzdpwVar = this.f13002a.f13006v;
        if (zzdpwVar != null) {
            synchronized (zzdpwVar) {
                zzdpwVar.f12569n.mo5946G("_videoMediaView");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzc() {
        return null;
    }
}
