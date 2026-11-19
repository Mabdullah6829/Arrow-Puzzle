package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzdqx implements zzbly {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzdry f12689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f12690b;

    public zzdqx(zzdry zzdryVar, ViewGroup viewGroup) {
        this.f12689a = zzdryVar;
        this.f12690b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    /* JADX INFO: renamed from: a */
    public final void mo5062a(MotionEvent motionEvent) {
        this.f12689a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    /* JADX INFO: renamed from: d */
    public final JSONObject mo5063d() {
        return this.f12689a.mo6027i();
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza() {
        zzgwt zzgwtVar = zzdqw.f12674H;
        zzdry zzdryVar = this.f12689a;
        Map mapZzj = zzdryVar.zzj();
        if (mapZzj == null) {
            return;
        }
        zzgyo zzgyoVar = (zzgyo) zzgwtVar;
        int i2 = zzgyoVar.f18357v;
        int i3 = 0;
        while (i3 < i2) {
            Object obj = mapZzj.get((String) zzgyoVar.get(i3));
            i3++;
            if (obj != null) {
                zzdryVar.onClick(this.f12690b);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzc() {
        return this.f12689a.mo6028j();
    }
}
