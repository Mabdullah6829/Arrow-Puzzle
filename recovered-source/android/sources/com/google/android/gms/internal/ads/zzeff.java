package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeff implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdcq f13788a;

    public zzeff(zzdcq zzdcqVar) {
        this.f13788a = zzdcqVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        String strValueOf;
        com.google.android.gms.ads.internal.client.zzc zzcVar;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.f13788a.m5898a().f16040d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8581i8)).booleanValue()) {
            String str = zzmVar.f3221P;
            if (TextUtils.isEmpty(str)) {
                zzcVar = zzmVar.f3216K;
                if (zzcVar != null) {
                    strValueOf = new JSONObject(zzcVar.f3101s).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e.nextInt() & Integer.MAX_VALUE);
                    }
                } else {
                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e.nextInt() & Integer.MAX_VALUE);
                }
            } else {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        zzcVar = zzmVar.f3216K;
                        if (zzcVar != null) {
                            try {
                                strValueOf = new JSONObject(zzcVar.f3101s).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e.nextInt() & Integer.MAX_VALUE);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e.nextInt() & Integer.MAX_VALUE);
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        } else {
            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e.nextInt() & Integer.MAX_VALUE);
        }
        zzinh.m8554a(strValueOf);
        return strValueOf;
    }
}
