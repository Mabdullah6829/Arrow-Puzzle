package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbkr;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CsiUrlBuilder {

    /* JADX INFO: renamed from: a */
    public final String f4008a = (String) zzbkr.f9012a.m5057c();

    /* JADX INFO: renamed from: a */
    public final String m3355a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f4008a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
