package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeix implements zzfos {

    /* JADX INFO: renamed from: d */
    public static final Pattern f13998d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* JADX INFO: renamed from: a */
    public final String f13999a;

    /* JADX INFO: renamed from: b */
    public final zzfqg f14000b;

    /* JADX INFO: renamed from: c */
    public final zzfqq f14001c;

    public zzeix(String str, zzfqq zzfqqVar, zzfqg zzfqgVar) {
        this.f13999a = str;
        this.f14001c = zzfqqVar;
        this.f14000b = zzfqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    @Override // com.google.android.gms.internal.ads.zzfos
    /* JADX INFO: renamed from: b */
    public final Object mo5874b(Object obj) throws zzeel {
        zzeel zzeelVar;
        JSONObject jSONObject;
        String strConcat;
        zzeiw zzeiwVar = (zzeiw) obj;
        int iOptInt = zzeiwVar.f13996a.optInt("http_timeout_millis", 60000);
        zzcbm zzcbmVar = zzeiwVar.f13997b;
        int i2 = zzcbmVar.f9696g;
        String str = zzcbmVar.f9702m;
        String str2 = zzcbmVar.f9692c;
        zzfqg zzfqgVar = this.f14000b;
        zzfqq zzfqqVar = this.f14001c;
        int i3 = 1;
        String strJoin = "";
        if (i2 != -2) {
            if (i2 == 1) {
                List list = zzcbmVar.f9690a;
                if (list != null) {
                    strJoin = TextUtils.join(", ", list);
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3070c(strJoin);
                }
                zzeelVar = new zzeel(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzeelVar = new zzeel(1);
            }
            zzfqgVar.mo6566h(zzeelVar);
            zzfqgVar.mo6563L(false);
            zzfqqVar.m6578a(zzfqgVar);
            throw zzeelVar;
        }
        HashMap map = new HashMap();
        if (zzcbmVar.f9694e) {
            String str3 = this.f13999a;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8811w1)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = f13998d.matcher(str3);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(i3);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                            i3 = 1;
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str3);
                }
            }
        }
        if (zzcbmVar.f9693d && (jSONObject = zzeiwVar.f13996a) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.m3150k("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (!TextUtils.isEmpty(str2)) {
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            if (zzcbmVar.f9701l) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.m3151l("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PrepareRequestFunction.apply", e);
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put("Content-Encoding", "gzip");
                } else {
                    byteArray = bytes;
                }
            } else {
                byteArray = bytes;
            }
        }
        String str4 = !TextUtils.isEmpty(str) ? str : "";
        zzfqgVar.mo6563L(true);
        zzfqqVar.m6578a(zzfqgVar);
        return new zzeis(zzcbmVar.f9695f, iOptInt, map, byteArray, str4);
    }
}
