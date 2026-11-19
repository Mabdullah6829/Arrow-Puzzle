package com.google.android.gms.ads.query;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbzz;

/* JADX INFO: loaded from: classes.dex */
public class QueryInfo {

    /* JADX INFO: renamed from: a */
    public final zzex f4012a;

    public QueryInfo(zzex zzexVar) {
        this.f4012a = zzexVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m3358a(final Context context, final AdRequest adRequest, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzbix.m5032a(context);
        if (((Boolean) zzbkv.f9048j.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        new zzbzz(context, adRequest.f2945a).m5284a(queryInfoGenerationCallback);
                    }
                });
                return;
            }
        }
        new zzbzz(context, adRequest.f2945a).m5284a(queryInfoGenerationCallback);
    }
}
