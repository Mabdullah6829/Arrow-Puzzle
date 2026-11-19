package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.webkit.internal.AssetHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqr implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final Context f9285a;

    public zzbqr(Context context) {
        this.f9285a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            com.google.android.gms.ads.internal.util.zzs.m3220s(this.f9285a, intent);
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to open Share Sheet", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("ShareSheetGmsgHandler.onGmsg", e);
        }
    }
}
