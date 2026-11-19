package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblc;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzbf extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f3915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TaggingLibraryJsInterface f3916b;

    public zzbf(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f3915a = str;
        this.f3916b = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    /* JADX INFO: renamed from: a */
    public final void mo3330a(String str) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean zBooleanValue = ((Boolean) zzblc.f9106c.m5057c()).booleanValue();
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f3916b;
        String strConcat = zBooleanValue ? ",\"as\":".concat(taggingLibraryJsInterface.f3805k.m3315b().toString()) : "";
        Locale locale = Locale.getDefault();
        zzbkh zzbkhVar = zzblc.f9108e;
        final String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f3915a, str, Long.valueOf(((Boolean) zzbkhVar.m5057c()).booleanValue() ? ((Long) zzblc.f9111h.m5057c()).longValue() : 0L), strConcat);
        if (((Boolean) zzbkhVar.m5057c()).booleanValue()) {
            try {
                taggingLibraryJsInterface.f3802h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f3911s.f3916b.f3796b.evaluateJavascript(str2, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e);
            }
        } else {
            taggingLibraryJsInterface.f3796b.evaluateJavascript(str2, null);
        }
        if (((Boolean) zzblc.f9106c.m5057c()).booleanValue() && ((Boolean) zzblc.f9107d.m5057c()).booleanValue()) {
            zze zzeVar = taggingLibraryJsInterface.f3806l;
            zzeVar.getClass();
            zzeVar.f3928b.execute(new zzc(zzeVar));
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    /* JADX INFO: renamed from: b */
    public final void mo3331b(QueryInfo queryInfo) {
        final String str;
        String str2 = this.f3915a;
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f3916b;
        String str3 = queryInfo.f4012a.f3174a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            if (((Boolean) zzblc.f9106c.m5057c()).booleanValue()) {
                jSONObject.put("as", taggingLibraryJsInterface.f3805k.m3315b());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzblc.f9108e.m5057c()).booleanValue() ? ((Long) zzblc.f9111h.m5057c()).longValue() : 0L);
            jSONObject.put("signal", str3);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, queryInfo.f4012a.f3174a, Long.valueOf(((Boolean) zzblc.f9108e.m5057c()).booleanValue() ? ((Long) zzblc.f9111h.m5057c()).longValue() : 0L), ((Boolean) zzblc.f9106c.m5057c()).booleanValue() ? ",\"as\":".concat(taggingLibraryJsInterface.f3805k.m3315b().toString()) : "");
        }
        if (((Boolean) zzblc.f9108e.m5057c()).booleanValue()) {
            try {
                taggingLibraryJsInterface.f3802h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f3913s.f3916b.f3796b.evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e);
            }
        } else {
            taggingLibraryJsInterface.f3796b.evaluateJavascript(str, null);
        }
        if (((Boolean) zzblc.f9106c.m5057c()).booleanValue() && ((Boolean) zzblc.f9107d.m5057c()).booleanValue()) {
            zze zzeVar = taggingLibraryJsInterface.f3806l;
            zzeVar.getClass();
            zzeVar.f3928b.execute(new zzc(zzeVar));
        }
    }
}
