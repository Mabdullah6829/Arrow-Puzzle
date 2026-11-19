package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfds implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final AdvertisingIdClient.Info f15515a;

    /* JADX INFO: renamed from: b */
    public final String f15516b;

    /* JADX INFO: renamed from: c */
    public final zzgcr f15517c;

    public zzfds(AdvertisingIdClient.Info info, String str, zzgcr zzgcrVar) {
        this.f15515a = info;
        this.f15516b = str;
        this.f15517c = zzgcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        try {
            JSONObject jSONObjectM3123g = com.google.android.gms.ads.internal.util.zzbp.m3123g((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f15515a;
            if (info != null) {
                String str = info.f3021a;
                if (!TextUtils.isEmpty(str)) {
                    jSONObjectM3123g.put("rdid", str);
                    jSONObjectM3123g.put("is_lat", info.f3022b);
                    jSONObjectM3123g.put("idtype", "adid");
                    zzgcr zzgcrVar = this.f15517c;
                    long j2 = zzgcrVar.f16988b;
                    String str2 = zzgcrVar.f16987a;
                    if (str2 != null && j2 > 0) {
                        jSONObjectM3123g.put("paidv1_id_android_3p", str2);
                        jSONObjectM3123g.put("paidv1_creation_time_android_3p", j2);
                        return;
                    }
                    return;
                }
            }
            String str3 = this.f15516b;
            if (str3 != null) {
                jSONObjectM3123g.put("pdid", str3);
                jSONObjectM3123g.put("pdidtype", "ssaid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Failed putting Ad ID.", e);
        }
    }
}
