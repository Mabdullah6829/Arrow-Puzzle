package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtk {

    /* JADX INFO: renamed from: a */
    public final Context f12880a;

    /* JADX INFO: renamed from: b */
    public final zzdsq f12881b;

    /* JADX INFO: renamed from: c */
    public final zzbaw f12882c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f12883d;

    /* JADX INFO: renamed from: e */
    public final com.google.android.gms.ads.internal.zza f12884e;

    /* JADX INFO: renamed from: f */
    public final zzbhw f12885f;

    /* JADX INFO: renamed from: g */
    public final Executor f12886g;

    /* JADX INFO: renamed from: h */
    public final zzbma f12887h;

    /* JADX INFO: renamed from: i */
    public final zzduc f12888i;

    /* JADX INFO: renamed from: j */
    public final zzdwq f12889j;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorService f12890k;

    /* JADX INFO: renamed from: l */
    public final zzdvl f12891l;

    /* JADX INFO: renamed from: m */
    public final zzdzt f12892m;

    /* JADX INFO: renamed from: n */
    public final zzfsm f12893n;

    /* JADX INFO: renamed from: o */
    public final zzeko f12894o;

    /* JADX INFO: renamed from: p */
    public final zzekz f12895p;

    /* JADX INFO: renamed from: q */
    public final zzflk f12896q;

    /* JADX INFO: renamed from: r */
    public final zzdzo f12897r;

    /* JADX INFO: renamed from: s */
    public final zzeaw f12898s;

    public zzdtk(Context context, zzdsq zzdsqVar, zzbaw zzbawVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbhw zzbhwVar, Executor executor, zzflg zzflgVar, zzduc zzducVar, zzdwq zzdwqVar, ScheduledExecutorService scheduledExecutorService, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzdvl zzdvlVar, zzekz zzekzVar, zzflk zzflkVar, zzdzo zzdzoVar, zzeaw zzeawVar) {
        this.f12880a = context;
        this.f12881b = zzdsqVar;
        this.f12882c = zzbawVar;
        this.f12883d = versionInfoParcel;
        this.f12884e = zzaVar;
        this.f12885f = zzbhwVar;
        this.f12886g = executor;
        this.f12887h = zzflgVar.f16046j;
        this.f12888i = zzducVar;
        this.f12889j = zzdwqVar;
        this.f12890k = scheduledExecutorService;
        this.f12892m = zzdztVar;
        this.f12893n = zzfsmVar;
        this.f12894o = zzekoVar;
        this.f12891l = zzdvlVar;
        this.f12895p = zzekzVar;
        this.f12896q = zzflkVar;
        this.f12897r = zzdzoVar;
        this.f12898s = zzeawVar;
    }

    /* JADX INFO: renamed from: c */
    public static Integer m6053c(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final com.google.android.gms.ads.internal.client.zzew m6054f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzew(strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m6055a(JSONArray jSONArray, boolean z, boolean z2, zzdzc zzdzcVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzhcf.m7367a(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, this.f12897r, zzdzcVar.f13394s);
        }
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(m6056b(jSONArray.optJSONObject(i2), z, null));
        }
        return zzhcf.m7375i(zzhcf.m7376j(arrayList), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtj
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzblw zzblwVar : (List) obj) {
                    if (zzblwVar != null) {
                        arrayList2.add(zzblwVar);
                    }
                }
                return arrayList2;
            }
        }, this.f12886g);
    }

    /* JADX INFO: renamed from: b */
    public final ListenableFuture m6056b(JSONObject jSONObject, boolean z, zzdzc zzdzcVar) {
        ListenableFuture listenableFutureM7375i;
        if (jSONObject == null) {
            return zzhcj.f18518t;
        }
        zzbio zzbioVar = zzbix.f8245O4;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        boolean zBooleanValue = ((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue();
        HashMap map = null;
        if (zBooleanValue && jSONObject.has((String) zzbivVar2.m5030a(zzbix.f8262P4))) {
            map = new HashMap();
            for (String str : ((String) zzbivVar2.m5030a(zzbix.f8279Q4)).split(",")) {
                try {
                    map.put(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return zzhcj.f18518t;
        }
        zzbio zzbioVar2 = zzbix.f8277Q2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue() && zzdzcVar != null) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, this.f12897r, zzdzcVar.f13394s);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z || map2 != null) {
            double d = dOptDouble;
            return zzhcf.m7367a(new zzblw(null, Uri.parse(strOptString), d, iOptInt, iOptInt2, map2));
        }
        final zzdsq zzdsqVar = this.f12881b;
        Executor executor = zzdsqVar.f12825c;
        if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8478c7)).booleanValue() && strOptString != null && strOptString.startsWith("data:")) {
            listenableFutureM7375i = zzhcf.m7369c(executor, new Callable() { // from class: com.google.android.gms.internal.ads.zzdso
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzdsq zzdsqVar2 = zzdsqVar;
                    zzdsqVar2.getClass();
                    String str2 = strOptString;
                    int iIndexOf = str2.indexOf(",");
                    if (iIndexOf == -1) {
                        throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
                    }
                    if (!str2.substring(0, iIndexOf).endsWith(";base64")) {
                        throw new IllegalArgumentException("Bad data URL: only base64 is supported");
                    }
                    int iIndexOf2 = str2.indexOf(":");
                    int iIndexOf3 = str2.indexOf(";");
                    if (iIndexOf2 == -1 || !str2.substring(iIndexOf2 + 1, iIndexOf3).startsWith("image/")) {
                        throw new IllegalArgumentException("Bad data URL: only image media is supported");
                    }
                    return zzdsqVar2.m6046a(Base64.decode(str2.substring(iIndexOf + 1), 0), dOptDouble, zOptBoolean);
                }
            });
        } else {
            zzdsqVar.f12823a.getClass();
            zzcgd zzcgdVar = new zzcgd();
            com.google.android.gms.ads.internal.util.zzbl.f3533a.m4398b(new com.google.android.gms.ads.internal.util.zzbk(strOptString, zzcgdVar));
            listenableFutureM7375i = zzhcf.m7375i(zzcgdVar, new zzgti() { // from class: com.google.android.gms.internal.ads.zzdsp
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    zzdsq zzdsqVar2 = zzdsqVar;
                    zzdsqVar2.getClass();
                    return zzdsqVar2.m6046a(((zzath) obj).f6880b, dOptDouble, zOptBoolean);
                }
            }, executor);
        }
        return m6058e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zzhcf.m7375i(listenableFutureM7375i, new zzgti() { // from class: com.google.android.gms.internal.ads.zzdsz
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new zzblw(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.f12886g));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX INFO: renamed from: d */
    public final ListenableFuture m6057d(JSONObject jSONObject, final zzfkn zzfknVar, final zzfkq zzfkqVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdp zzcdpVar) {
        final com.google.android.gms.ads.internal.client.zzr zzrVar;
        final zzduc zzducVar;
        final String strOptString = jSONObject.optString("base_url");
        final String strOptString2 = jSONObject.optString("html");
        int i2 = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                zzrVar = com.google.android.gms.ads.internal.client.zzr.m2981w();
            }
            zzducVar = this.f12888i;
            zzducVar.getClass();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
                AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzducVar.f12965i, "native-assets-loading-video-composition-start");
            }
            final ListenableFuture listenableFutureM7374h = zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtw
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) throws zzclq {
                    final zzduc zzducVar2 = zzducVar;
                    final zzclb zzclbVarM6077a = zzducVar2.f12959c.m6077a(zzrVar, zzfknVar, zzfkqVar);
                    final zzcgc zzcgcVar = new zzcgc(zzclbVarM6077a);
                    zzbsi zzbsiVar = zzducVar2.f12957a.f16038b;
                    com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
                    zzcdu zzcduVar = zzcdpVar;
                    if (zzbsiVar != null) {
                        zzducVar2.m6061a(zzclbVarM6077a, zzbVar2, zzcduVar);
                        zzclbVarM6077a.mo5602h0(new zzcnl(5, 0, 0));
                    } else {
                        zzdvi zzdviVar = zzducVar2.f12960d.f13105a;
                        zzclm zzclmVarMo5582K = zzclbVarM6077a.mo5582K();
                        zzbio zzbioVar = zzbix.f8537ff;
                        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        zzclmVarMo5582K.m5640l(zzdviVar, zzdviVar, zzdviVar, zzdviVar, zzdviVar, false, null, !((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(zzducVar2.f12961e, null) : zzbVar2, null, true != ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? null : zzcduVar, zzducVar2.f12964h, zzducVar2.f12963g, zzducVar2.f12962f, null, zzdviVar, null, null, null, null, zzducVar2.f12966j, null, null);
                        zzduc.m6060b(zzclbVarM6077a);
                    }
                    zzclbVarM6077a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdtz
                        @Override // com.google.android.gms.internal.ads.zzcmx
                        /* JADX INFO: renamed from: a */
                        public final void mo3001a(int i3, String str, String str2, boolean z) {
                            zzduc zzducVar3 = zzducVar2;
                            zzcgc zzcgcVar2 = zzcgcVar;
                            if (z) {
                                com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzducVar3.f12957a.f16037a;
                                if (zzfwVar != null) {
                                    zzclb zzclbVar = zzclbVarM6077a;
                                    if (zzclbVar.zzh() != null) {
                                        zzclbVar.zzh().m5669l4(zzfwVar);
                                    }
                                }
                                zzcgcVar2.m5396c();
                                return;
                            }
                            zzducVar3.getClass();
                            int length = String.valueOf(i3).length();
                            StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                            sb.append("Html video Web View failed to load. Error code: ");
                            sb.append(i3);
                            sb.append(", Description: ");
                            sb.append(str);
                            zzcgcVar2.m5398b(new zzepp(1, AbstractC0271e0.m403k(sb, ", Failing URL: ", str2)));
                        }
                    };
                    zzclbVarM6077a.mo5608o0(strOptString, strOptString2);
                    return zzcgcVar;
                }
            }, zzducVar.f12958b);
            return zzhcf.m7374h(listenableFutureM7374h, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdte
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj) throws zzepp {
                    zzclb zzclbVar = (zzclb) obj;
                    if (zzclbVar == null || zzclbVar.zzh() == null) {
                        throw new zzepp(1, "Retrieve video view in html5 ad response failed.");
                    }
                    return listenableFutureM7374h;
                }
            }, zzcfy.f9953h);
        }
        i2 = iOptInt;
        zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.f12880a, new AdSize(i2, iOptInt2));
        zzducVar = this.f12888i;
        zzducVar.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzducVar.f12965i, "native-assets-loading-video-composition-start");
        }
        final ListenableFuture listenableFutureM7374h2 = zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtw
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws zzclq {
                final zzduc zzducVar2 = zzducVar;
                final zzclb zzclbVarM6077a = zzducVar2.f12959c.m6077a(zzrVar, zzfknVar, zzfkqVar);
                final zzcgc zzcgcVar = new zzcgc(zzclbVarM6077a);
                zzbsi zzbsiVar = zzducVar2.f12957a.f16038b;
                com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
                zzcdu zzcduVar = zzcdpVar;
                if (zzbsiVar != null) {
                    zzducVar2.m6061a(zzclbVarM6077a, zzbVar2, zzcduVar);
                    zzclbVarM6077a.mo5602h0(new zzcnl(5, 0, 0));
                } else {
                    zzdvi zzdviVar = zzducVar2.f12960d.f13105a;
                    zzclm zzclmVarMo5582K = zzclbVarM6077a.mo5582K();
                    zzbio zzbioVar = zzbix.f8537ff;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    zzclmVarMo5582K.m5640l(zzdviVar, zzdviVar, zzdviVar, zzdviVar, zzdviVar, false, null, !((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(zzducVar2.f12961e, null) : zzbVar2, null, true != ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? null : zzcduVar, zzducVar2.f12964h, zzducVar2.f12963g, zzducVar2.f12962f, null, zzdviVar, null, null, null, null, zzducVar2.f12966j, null, null);
                    zzduc.m6060b(zzclbVarM6077a);
                }
                zzclbVarM6077a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdtz
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    /* JADX INFO: renamed from: a */
                    public final void mo3001a(int i3, String str, String str2, boolean z) {
                        zzduc zzducVar3 = zzducVar2;
                        zzcgc zzcgcVar2 = zzcgcVar;
                        if (z) {
                            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzducVar3.f12957a.f16037a;
                            if (zzfwVar != null) {
                                zzclb zzclbVar = zzclbVarM6077a;
                                if (zzclbVar.zzh() != null) {
                                    zzclbVar.zzh().m5669l4(zzfwVar);
                                }
                            }
                            zzcgcVar2.m5396c();
                            return;
                        }
                        zzducVar3.getClass();
                        int length = String.valueOf(i3).length();
                        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                        sb.append("Html video Web View failed to load. Error code: ");
                        sb.append(i3);
                        sb.append(", Description: ");
                        sb.append(str);
                        zzcgcVar2.m5398b(new zzepp(1, AbstractC0271e0.m403k(sb, ", Failing URL: ", str2)));
                    }
                };
                zzclbVarM6077a.mo5608o0(strOptString, strOptString2);
                return zzcgcVar;
            }
        }, zzducVar.f12958b);
        return zzhcf.m7374h(listenableFutureM7374h2, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdte
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws zzepp {
                zzclb zzclbVar = (zzclb) obj;
                if (zzclbVar == null || zzclbVar.zzh() == null) {
                    throw new zzepp(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureM7374h2;
            }
        }, zzcfy.f9953h);
    }

    /* JADX INFO: renamed from: e */
    public final ListenableFuture m6058e(String str, boolean z, final ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8294R2)).booleanValue()) {
            zzcgb.m5394a(listenableFuture, str, this.f12886g);
        }
        return z ? zzhcf.m7374h(listenableFuture, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtg
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                return obj != null ? listenableFuture : zzhcf.m7368b(new zzepp(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcfy.f9953h) : zzhcf.m7372f(listenableFuture, Exception.class, new zzdtf(), zzcfy.f9953h);
    }
}
