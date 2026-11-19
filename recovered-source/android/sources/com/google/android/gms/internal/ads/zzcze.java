package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcze {

    /* JADX INFO: renamed from: a */
    public final zzega f11808a;

    /* JADX INFO: renamed from: b */
    public final zzflg f11809b;

    /* JADX INFO: renamed from: c */
    public final zzfps f11810c;

    /* JADX INFO: renamed from: d */
    public final zzcry f11811d;

    /* JADX INFO: renamed from: e */
    public final zzeps f11812e;

    /* JADX INFO: renamed from: f */
    public final zzdio f11813f;

    /* JADX INFO: renamed from: g */
    public zzfky f11814g;

    /* JADX INFO: renamed from: h */
    public final zzehl f11815h;

    /* JADX INFO: renamed from: i */
    public final zzdce f11816i;

    /* JADX INFO: renamed from: j */
    public final Executor f11817j;

    /* JADX INFO: renamed from: k */
    public final zzegw f11818k;

    /* JADX INFO: renamed from: l */
    public final zzemf f11819l;

    public zzcze(zzega zzegaVar, zzflg zzflgVar, zzfps zzfpsVar, zzcry zzcryVar, zzeps zzepsVar, zzdio zzdioVar, zzfky zzfkyVar, zzehl zzehlVar, zzdce zzdceVar, Executor executor, zzegw zzegwVar, zzemf zzemfVar) {
        this.f11808a = zzegaVar;
        this.f11809b = zzflgVar;
        this.f11810c = zzfpsVar;
        this.f11811d = zzcryVar;
        this.f11812e = zzepsVar;
        this.f11813f = zzdioVar;
        this.f11814g = zzfkyVar;
        this.f11815h = zzehlVar;
        this.f11816i = zzdceVar;
        this.f11817j = executor;
        this.f11818k = zzegwVar;
        this.f11819l = zzemfVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzfoz m5875a(ListenableFuture listenableFuture) {
        if (this.f11814g != null) {
            zzfps zzfpsVar = this.f11810c;
            zzfpm zzfpmVar = zzfpm.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfpsVar);
            return new zzfpj(zzfpsVar, zzfpmVar, null, zzfpk.f16241d, Collections.EMPTY_LIST, zzhcf.m7367a(this.f11814g)).m6555d();
        }
        zzbhe zzbheVar = com.google.android.gms.ads.internal.zzt.f3698C.f3710j;
        zzbheVar.getClass();
        zzbio zzbioVar = zzbix.f8544g5;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            synchronized (zzbheVar.f7844c) {
                try {
                    zzbheVar.m4884d();
                    ScheduledFuture scheduledFuture = zzbheVar.f7842a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ScheduledExecutorService scheduledExecutorService = zzcfy.f9949d;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) scheduledExecutorService;
                    zzbheVar.f7842a = scheduledThreadPoolExecutor.schedule(zzbheVar.f7843b, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8561h5)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzfpj zzfpjVarM6556a = this.f11810c.m6556a(listenableFuture, zzfpm.SERVER_TRANSACTION);
        final zzegw zzegwVar = this.f11818k;
        return zzfpjVarM6556a.m6553b(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return zzegwVar.mo6194a((zzcbk) obj);
            }
        }).m6555d();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0274 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #9 {all -> 0x00f6, blocks: (B:31:0x009a, B:33:0x00b4, B:35:0x00bc, B:37:0x00c9, B:39:0x00e1, B:43:0x010d, B:46:0x0118, B:48:0x0120, B:50:0x0127, B:54:0x0130, B:63:0x0168, B:57:0x0144, B:62:0x0153, B:65:0x016d, B:42:0x00f9, B:66:0x0181, B:73:0x01a0, B:76:0x01a8, B:80:0x01cb, B:82:0x01e1, B:86:0x0203, B:88:0x021a, B:91:0x022e, B:96:0x0241, B:97:0x0242, B:98:0x024f, B:102:0x0254, B:103:0x0255, B:108:0x026b, B:120:0x027b, B:110:0x026d, B:114:0x0271, B:116:0x0273, B:117:0x0274, B:119:0x027a, B:126:0x028e, B:87:0x020d, B:83:0x01f4, B:79:0x01b7, B:70:0x018f, B:71:0x0194, B:118:0x0275, B:104:0x0256, B:106:0x0260, B:92:0x022f, B:94:0x0239), top: B:181:0x009a, inners: #1, #4, #5, #6, #8 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0282  */
    /* JADX WARN: Code duplicated, block: B:129:0x0291  */
    /* JADX WARN: Code duplicated, block: B:131:0x0299  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x0308  */
    /* JADX WARN: Code duplicated, block: B:171:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0203 A[Catch: all -> 0x00f6, TryCatch #9 {all -> 0x00f6, blocks: (B:31:0x009a, B:33:0x00b4, B:35:0x00bc, B:37:0x00c9, B:39:0x00e1, B:43:0x010d, B:46:0x0118, B:48:0x0120, B:50:0x0127, B:54:0x0130, B:63:0x0168, B:57:0x0144, B:62:0x0153, B:65:0x016d, B:42:0x00f9, B:66:0x0181, B:73:0x01a0, B:76:0x01a8, B:80:0x01cb, B:82:0x01e1, B:86:0x0203, B:88:0x021a, B:91:0x022e, B:96:0x0241, B:97:0x0242, B:98:0x024f, B:102:0x0254, B:103:0x0255, B:108:0x026b, B:120:0x027b, B:110:0x026d, B:114:0x0271, B:116:0x0273, B:117:0x0274, B:119:0x027a, B:126:0x028e, B:87:0x020d, B:83:0x01f4, B:79:0x01b7, B:70:0x018f, B:71:0x0194, B:118:0x0275, B:104:0x0256, B:106:0x0260, B:92:0x022f, B:94:0x0239), top: B:181:0x009a, inners: #1, #4, #5, #6, #8 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x020d A[Catch: all -> 0x00f6, TryCatch #9 {all -> 0x00f6, blocks: (B:31:0x009a, B:33:0x00b4, B:35:0x00bc, B:37:0x00c9, B:39:0x00e1, B:43:0x010d, B:46:0x0118, B:48:0x0120, B:50:0x0127, B:54:0x0130, B:63:0x0168, B:57:0x0144, B:62:0x0153, B:65:0x016d, B:42:0x00f9, B:66:0x0181, B:73:0x01a0, B:76:0x01a8, B:80:0x01cb, B:82:0x01e1, B:86:0x0203, B:88:0x021a, B:91:0x022e, B:96:0x0241, B:97:0x0242, B:98:0x024f, B:102:0x0254, B:103:0x0255, B:108:0x026b, B:120:0x027b, B:110:0x026d, B:114:0x0271, B:116:0x0273, B:117:0x0274, B:119:0x027a, B:126:0x028e, B:87:0x020d, B:83:0x01f4, B:79:0x01b7, B:70:0x018f, B:71:0x0194, B:118:0x0275, B:104:0x0256, B:106:0x0260, B:92:0x022f, B:94:0x0239), top: B:181:0x009a, inners: #1, #4, #5, #6, #8 }] */
    /* JADX INFO: renamed from: b */
    public final zzfoz m5876b() {
        com.google.android.gms.ads.internal.client.zzc zzcVar;
        ListenableFuture listenableFutureM7368b;
        String strOptString;
        String strOptString2;
        String strOptString3;
        int i2;
        String str;
        Pair pair;
        String str2;
        List listAsList;
        String string;
        zzflg zzflgVar = this.f11809b;
        if (!zzflgVar.f16058v) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.f16040d;
            if (zzmVar.f3221P != null || zzmVar.f3216K != null) {
                zzfps zzfpsVar = this.f11810c;
                zzfpm zzfpmVar = zzfpm.PRELOADED_LOADER;
                Objects.requireNonNull(zzfpsVar);
                zzega zzegaVar = this.f11808a;
                zzbio zzbioVar = zzbix.f8192L2;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    zzegaVar.f13856o = zzegaVar.f13845d.f16056t;
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzegaVar.f13850i, "scar-preloader-ready");
                }
                String strM6498a = zzegaVar.f13845d.f16040d.f3221P;
                if (TextUtils.isEmpty(strM6498a)) {
                    zzcVar = zzegaVar.f13845d.f16040d.f3216K;
                    if (zzcVar != null) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8231N7)).booleanValue()) {
                            String str3 = zzcVar.f3101s;
                            String str4 = zzcVar.f3102t;
                            strOptString = "";
                            strOptString = new JSONObject(str3).optString("request_id", "");
                            strOptString2 = "";
                            strOptString2 = new JSONObject(str4).optString("request_id", "");
                            if (TextUtils.isEmpty(strOptString2)) {
                            }
                            zzegaVar.f13850i.f13407a.put("ridmm", "true");
                            listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                        }
                        listenableFutureM7368b = zzegaVar.m6200a(zzcVar.f3101s, zzegaVar.m6202c(zzcVar.f3102t));
                    } else {
                        listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                    }
                } else {
                    String strSubstring = "";
                    try {
                        strSubstring = new JSONObject(strM6498a).optString("request_id", "");
                    } catch (JSONException unused) {
                    }
                    zzbio zzbioVar2 = zzbix.f8364V7;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar2)).booleanValue() && strSubstring.isEmpty()) {
                        int iLastIndexOf = strM6498a.lastIndexOf("&request_id=");
                        strSubstring = iLastIndexOf != -1 ? strM6498a.substring(iLastIndexOf + 12) : "";
                    }
                    String str5 = strSubstring;
                    if (TextUtils.isEmpty(str5)) {
                        listenableFutureM7368b = zzhcf.m7368b(new zzepp(15, "Invalid ad string."));
                    } else {
                        synchronized (zzegaVar.f13853l) {
                            try {
                                com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVarMo5704w = zzegaVar.f13842a.mo5704w();
                                zzdzo zzdzoVar = zzegaVar.f13850i;
                                String strM3339a = zzqVarMo5704w.m3339a(str5, zzdzoVar);
                                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar2)).booleanValue() && !TextUtils.isEmpty(strM3339a)) {
                                    try {
                                        JSONObject jSONObjectOptJSONObject = new JSONObject(strM3339a).optJSONObject("extras");
                                        if (jSONObjectOptJSONObject != null) {
                                            String strOptString4 = jSONObjectOptJSONObject.optString("query_info_type", "");
                                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8396X7)).booleanValue()) {
                                                listAsList = Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbix.f8412Y7)).split(","));
                                            } else {
                                                listAsList = Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbix.f8380W7)).split(","));
                                            }
                                            if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3345a(strOptString4))) {
                                                int iLastIndexOf2 = strM6498a.lastIndexOf("&");
                                                String strSubstring2 = iLastIndexOf2 != -1 ? strM6498a.substring(0, iLastIndexOf2) : null;
                                                if (!TextUtils.isEmpty(strSubstring2)) {
                                                    try {
                                                        byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                                                        byte[] bytes = str5.getBytes(StandardCharsets.UTF_8);
                                                        if (TextUtils.isEmpty(strM3339a)) {
                                                            string = null;
                                                        } else {
                                                            try {
                                                                string = new JSONObject(strM3339a).getString("arek");
                                                            } catch (JSONException e) {
                                                                com.google.android.gms.ads.internal.util.zze.m3150k("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CryptoUtils.getKeyFromQueryJsonMap", e);
                                                                string = null;
                                                            }
                                                        }
                                                        strM6498a = zzflw.m6498a(bArrDecode, bytes, string, zzdzoVar);
                                                    } catch (IllegalArgumentException e2) {
                                                        com.google.android.gms.ads.internal.util.zze.m3150k("Failed to decode the adResponse. ".concat(e2.toString()));
                                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PreloadedLoader.decryptAdResponseIfNecessary", e2);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (JSONException unused2) {
                                    }
                                }
                                if (TextUtils.isEmpty(strM6498a)) {
                                    strOptString3 = "";
                                } else {
                                    try {
                                        strOptString3 = new JSONObject(strM6498a).optString("render_id", "");
                                    } catch (JSONException unused3) {
                                        strOptString3 = "";
                                    }
                                }
                                String str6 = strOptString3;
                                if (TextUtils.isEmpty(str6)) {
                                    i2 = 0;
                                    str = null;
                                    if (str != null) {
                                        pair = new Pair(str, Integer.valueOf(i2));
                                    } else {
                                        pair = new Pair("", 0);
                                    }
                                    str2 = (String) pair.first;
                                    int iIntValue = ((Integer) pair.second).intValue();
                                    if (TextUtils.isEmpty(str2)) {
                                        synchronized (zzqVarMo5704w) {
                                            zzqVarMo5704w.f3974e.remove(str5);
                                            if (TextUtils.isEmpty(strM3339a)) {
                                                zzcVar = zzegaVar.f13845d.f16040d.f3216K;
                                                if (zzcVar != null) {
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8231N7)).booleanValue()) {
                                                        String str7 = zzcVar.f3101s;
                                                        String str8 = zzcVar.f3102t;
                                                        strOptString = "";
                                                        strOptString = new JSONObject(str7).optString("request_id", "");
                                                        strOptString2 = "";
                                                        strOptString2 = new JSONObject(str8).optString("request_id", "");
                                                        if (TextUtils.isEmpty(strOptString2)) {
                                                        }
                                                        zzegaVar.f13850i.f13407a.put("ridmm", "true");
                                                        listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                                    }
                                                    listenableFutureM7368b = zzegaVar.m6200a(zzcVar.f3101s, zzegaVar.m6202c(zzcVar.f3102t));
                                                } else {
                                                    listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                                }
                                            } else {
                                                listenableFutureM7368b = zzegaVar.m6200a(strM6498a, zzegaVar.m6202c(strM3339a));
                                            }
                                        }
                                    } else {
                                        synchronized (zzqVarMo5704w) {
                                            zzqVarMo5704w.f3974e.remove(str5);
                                            if (TextUtils.isEmpty(strM3339a)) {
                                                listenableFutureM7368b = zzegaVar.m6200a(strM6498a, zzegaVar.m6202c(strM3339a));
                                            } else {
                                                zzcVar = zzegaVar.f13845d.f16040d.f3216K;
                                                if (zzcVar != null) {
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8231N7)).booleanValue()) {
                                                        String str9 = zzcVar.f3101s;
                                                        String str10 = zzcVar.f3102t;
                                                        strOptString = "";
                                                        strOptString = new JSONObject(str9).optString("request_id", "");
                                                        strOptString2 = "";
                                                        strOptString2 = new JSONObject(str10).optString("request_id", "");
                                                        if (TextUtils.isEmpty(strOptString2)) {
                                                        }
                                                        zzegaVar.f13850i.f13407a.put("ridmm", "true");
                                                        listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                                    }
                                                    listenableFutureM7368b = zzegaVar.m6200a(zzcVar.f3101s, zzegaVar.m6202c(zzcVar.f3102t));
                                                } else {
                                                    listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    String str11 = "";
                                    try {
                                        str11 = new String(Base64.decode(str6, 0), StandardCharsets.UTF_8);
                                    } catch (IllegalArgumentException e3) {
                                        com.google.android.gms.ads.internal.util.zze.m3150k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str6)));
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PreloadedLoader.decodeRenderId", e3);
                                    }
                                    List listM7147e = zzgug.m7143a(new zzgtb(':')).m7147e(str11);
                                    if (listM7147e.size() == 2) {
                                        str = (String) listM7147e.get(0);
                                        i2 = Integer.parseInt((String) listM7147e.get(1));
                                    } else {
                                        com.google.android.gms.ads.internal.util.zze.m3150k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str6)));
                                        i2 = 0;
                                        str = null;
                                    }
                                    if (str != null) {
                                        pair = new Pair(str, Integer.valueOf(i2));
                                    } else {
                                        pair = new Pair("", 0);
                                    }
                                    str2 = (String) pair.first;
                                    int iIntValue2 = ((Integer) pair.second).intValue();
                                    if (TextUtils.isEmpty(str2) || iIntValue2 <= 0) {
                                        synchronized (zzqVarMo5704w) {
                                            zzqVarMo5704w.f3974e.remove(str5);
                                        }
                                        if (TextUtils.isEmpty(strM3339a)) {
                                            listenableFutureM7368b = zzegaVar.m6200a(strM6498a, zzegaVar.m6202c(strM3339a));
                                        } else {
                                            zzcVar = zzegaVar.f13845d.f16040d.f3216K;
                                            if (zzcVar != null) {
                                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8231N7)).booleanValue()) {
                                                    String str12 = zzcVar.f3101s;
                                                    String str13 = zzcVar.f3102t;
                                                    strOptString = "";
                                                    try {
                                                        strOptString = new JSONObject(str12).optString("request_id", "");
                                                    } catch (JSONException unused4) {
                                                    }
                                                    strOptString2 = "";
                                                    try {
                                                        strOptString2 = new JSONObject(str13).optString("request_id", "");
                                                    } catch (JSONException unused5) {
                                                    }
                                                    if (TextUtils.isEmpty(strOptString2) && strOptString.equals(strOptString2)) {
                                                        com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVarMo5704w2 = zzegaVar.f13842a.mo5704w();
                                                        synchronized (zzqVarMo5704w2) {
                                                            zzqVarMo5704w2.f3974e.remove(strOptString);
                                                        }
                                                        zzegaVar.f13850i.f13407a.put("request_id", strOptString);
                                                    } else {
                                                        zzegaVar.f13850i.f13407a.put("ridmm", "true");
                                                        listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                                    }
                                                }
                                                listenableFutureM7368b = zzegaVar.m6200a(zzcVar.f3101s, zzegaVar.m6202c(zzcVar.f3102t));
                                            } else {
                                                listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                            }
                                        }
                                    } else {
                                        synchronized (zzqVarMo5704w) {
                                            try {
                                                com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzo) zzqVarMo5704w.f3974e.get(str5);
                                                if (zzoVar == null || !zzoVar.f3965c.contains(str2)) {
                                                    synchronized (zzqVarMo5704w) {
                                                        com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzo) zzqVarMo5704w.f3974e.get(str5);
                                                        if (zzoVar2 != null) {
                                                            HashSet hashSet = zzoVar2.f3965c;
                                                            hashSet.add(str2);
                                                            if (hashSet.size() < iIntValue2) {
                                                            }
                                                        }
                                                        synchronized (zzqVarMo5704w) {
                                                            zzqVarMo5704w.f3974e.remove(str5);
                                                        }
                                                    }
                                                    if (TextUtils.isEmpty(strM3339a)) {
                                                        listenableFutureM7368b = zzegaVar.m6200a(strM6498a, zzegaVar.m6202c(strM3339a));
                                                    } else {
                                                        zzcVar = zzegaVar.f13845d.f16040d.f3216K;
                                                        if (zzcVar != null) {
                                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8231N7)).booleanValue()) {
                                                                String str14 = zzcVar.f3101s;
                                                                String str15 = zzcVar.f3102t;
                                                                strOptString = "";
                                                                strOptString = new JSONObject(str14).optString("request_id", "");
                                                                strOptString2 = "";
                                                                strOptString2 = new JSONObject(str15).optString("request_id", "");
                                                                if (TextUtils.isEmpty(strOptString2)) {
                                                                }
                                                                zzegaVar.f13850i.f13407a.put("ridmm", "true");
                                                                listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                                            }
                                                            listenableFutureM7368b = zzegaVar.m6200a(zzcVar.f3101s, zzegaVar.m6202c(zzcVar.f3102t));
                                                        } else {
                                                            listenableFutureM7368b = zzhcf.m7368b(new zzepp(14, "Mismatch request IDs."));
                                                        }
                                                    }
                                                } else {
                                                    listenableFutureM7368b = zzhcf.m7368b(new zzepp(10, "The ad has already been shown."));
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                return new zzfpj(zzfpsVar, zzfpmVar, null, zzfpk.f16241d, Collections.EMPTY_LIST, listenableFutureM7368b).m6555d();
            }
        }
        return m5875a(this.f11816i.m5895b());
    }

    /* JADX INFO: renamed from: c */
    public final zzfoz m5877c(ListenableFuture listenableFuture) {
        zzfpj zzfpjVarM6553b = this.f11810c.m6556a(listenableFuture, zzfpm.RENDERER).m6552a(new zzfos() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzfos
            /* JADX INFO: renamed from: b */
            public final Object mo5874b(Object obj) {
                zzfky zzfkyVar = (zzfky) obj;
                zzcry zzcryVar = this.f11806a.f11811d;
                ArrayList arrayList = zzfkyVar.f16006b.f16003c;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    zzfkw zzfkwVar = (zzfkw) obj2;
                    Map map = zzcryVar.f11318a;
                    String str = zzfkwVar.f15999a;
                    JSONObject jSONObject = zzfkwVar.f16000b;
                    if (!map.containsKey(str) || jSONObject == null) {
                        Map map2 = zzcryVar.f11319b;
                        if (map2.containsKey(str) && jSONObject != null) {
                            zzcsa zzcsaVar = (zzcsa) map2.get(str);
                            HashMap map3 = new HashMap();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String strOptString = jSONObject.optString(next);
                                if (strOptString != null) {
                                    map3.put(next, strOptString);
                                }
                            }
                            zzcsaVar.mo5814a(map3);
                        }
                    } else {
                        ((zzcsb) map.get(str)).mo5815n(jSONObject);
                    }
                }
                return zzfkyVar;
            }
        }).m6553b(this.f11812e);
        zzbio zzbioVar = zzbix.f8867z6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            long jIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8009A6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            zzfpjVarM6553b = zzfpjVarM6553b.m6554c(jIntValue);
        }
        return zzfpjVarM6553b.m6555d();
    }
}
