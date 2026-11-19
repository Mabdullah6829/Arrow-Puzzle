package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbka extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f8948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbkc f8949b;

    public zzbka(zzbkc zzbkcVar, String str) {
        this.f8948a = str;
        Objects.requireNonNull(zzbkcVar);
        this.f8949b = zzbkcVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    /* JADX INFO: renamed from: a */
    public final void mo3330a(String str) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbkc zzbkcVar = this.f8949b;
            zzbkcVar.f8957g.postMessage(zzbkcVar.m5050b(this.f8948a, str).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    /* JADX INFO: renamed from: b */
    public final void mo3331b(QueryInfo queryInfo) {
        String str = queryInfo.f4012a.f3174a;
        try {
            zzbkc zzbkcVar = this.f8949b;
            zzbkcVar.f8957g.postMessage(zzbkcVar.m5051c(this.f8948a, str).toString(), null);
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
