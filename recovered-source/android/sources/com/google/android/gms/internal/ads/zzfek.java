package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzfek implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final JSONObject f15545a;

    public zzfek(Context context) {
        this.f15545a = zzcbg.m5303b(context, VersionInfoParcel.m3031w());
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8772td)).booleanValue() ? zzhcf.m7367a(new zzfcq() { // from class: com.google.android.gms.internal.ads.zzfei
            @Override // com.google.android.gms.internal.ads.zzfcq
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6399b(Object obj) {
            }
        }) : zzhcf.m7367a(new zzfcq() { // from class: com.google.android.gms.internal.ads.zzfej
            @Override // com.google.android.gms.internal.ads.zzfcq
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6399b(Object obj) {
                try {
                    ((JSONObject) obj).put("gms_sdk_env", this.f15544a.f15545a);
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("Failed putting version constants.");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 46;
    }
}
