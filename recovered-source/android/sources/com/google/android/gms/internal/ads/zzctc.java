package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzctc implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final CookieManager f11355a = com.google.android.gms.ads.internal.zzt.f3698C.f3706f.m3237h();

    public zzctc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        CookieManager cookieManager = this.f11355a;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8794v1), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8794v1);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listM7147e = zzgug.m7143a(new zzgtb(';')).m7147e(cookie);
            for (int i2 = 0; i2 < listM7147e.size(); i2++) {
                Iterator it = ((zzgua) zzgug.m7143a(new zzgtb('=')).m7146d((String) listM7147e.get(i2))).iterator();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (0)");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8540g1))));
            }
        }
    }
}
