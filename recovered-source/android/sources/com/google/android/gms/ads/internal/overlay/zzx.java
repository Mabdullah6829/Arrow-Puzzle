package com.google.android.gms.ads.internal.overlay;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzgsc;
import com.google.android.gms.internal.ads.zzgsd;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class zzx implements zzgsd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzz f3386a;

    public zzx(zzz zzzVar) {
        this.f3386a = zzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsd
    /* JADX INFO: renamed from: a */
    public final void mo3025a(zzgsc zzgscVar) {
        zzz zzzVar = this.f3386a;
        zzzVar.getClass();
        if (!TextUtils.isEmpty(zzgscVar.mo7094b())) {
            if (!((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8369Vc)).booleanValue()) {
                zzzVar.f3390a = zzgscVar.mo7094b();
            }
        }
        switch (zzgscVar.mo7093a()) {
            case 8152:
                zzzVar.m3029d(new HashMap(), "onLMDOverlayOpened");
                break;
            case 8153:
                zzzVar.m3029d(new HashMap(), "onLMDOverlayClicked");
                break;
            case 8155:
                zzzVar.m3029d(new HashMap(), "onLMDOverlayClose");
                break;
            case 8157:
                zzzVar.f3390a = null;
                zzzVar.f3391b = null;
                zzzVar.f3394e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, String.valueOf(zzgscVar.mo7093a()));
                zzzVar.m3029d(map, "onLMDOverlayFailedToOpen");
                break;
        }
    }
}
