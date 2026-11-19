package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzaua;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzfzu;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgax;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzay extends zzaua {

    /* JADX INFO: renamed from: c */
    public final Context f3507c;

    public zzay(Context context, zzaum zzaumVar) {
        super(zzaumVar);
        this.f3507c = context;
    }

    /* JADX INFO: renamed from: b */
    public static zzato m3106b(Context context) {
        zzay zzayVar = new zzay(context, new zzaum());
        zzfzv zzfzvVar = zzfzu.f16872a;
        File cacheDir = context.getCacheDir();
        zzfzvVar.getClass();
        zzato zzatoVar = new zzato(new zzauh(new File(zzfzv.m6833a(cacheDir, "admob_volley"))), zzayVar);
        zzatoVar.m4397a();
        return zzatoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaua, com.google.android.gms.internal.ads.zzate
    /* JADX INFO: renamed from: a */
    public final zzath mo3107a(zzatl zzatlVar) {
        int i2 = zzatlVar.f6892t;
        String str = zzatlVar.f6893u;
        if (i2 == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8713q5), str)) {
                com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
                zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
                Context context = this.f3507c;
                if (googleApiAvailabilityLight.m3403c(context, 13400000) == 0) {
                    zzath zzathVarMo3107a = new zzbrv(context).mo3107a(zzatlVar);
                    if (zzathVarMo3107a != null) {
                        zze.m3150k("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return zzathVarMo3107a;
                    }
                    zze.m3150k("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.mo3107a(zzatlVar);
    }
}
