package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzega {

    /* JADX INFO: renamed from: p */
    public static final Pattern f13841p = Pattern.compile("\\?");

    /* JADX INFO: renamed from: a */
    public final zzcnq f13842a;

    /* JADX INFO: renamed from: b */
    public final Context f13843b;

    /* JADX INFO: renamed from: c */
    public final VersionInfoParcel f13844c;

    /* JADX INFO: renamed from: d */
    public final zzflg f13845d;

    /* JADX INFO: renamed from: e */
    public final Executor f13846e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f13847f;

    /* JADX INFO: renamed from: g */
    public final String f13848g;

    /* JADX INFO: renamed from: h */
    public final zzfqq f13849h;

    /* JADX INFO: renamed from: i */
    public final zzdzo f13850i;

    /* JADX INFO: renamed from: j */
    public final zzfsm f13851j;

    /* JADX INFO: renamed from: k */
    public final zzdgd f13852k;

    /* JADX INFO: renamed from: l */
    public final Object f13853l = new Object();

    /* JADX INFO: renamed from: m */
    public String f13854m;

    /* JADX INFO: renamed from: n */
    public List f13855n;

    /* JADX INFO: renamed from: o */
    public Bundle f13856o;

    public zzega(zzcnq zzcnqVar, Context context, VersionInfoParcel versionInfoParcel, zzflg zzflgVar, Executor executor, String str, zzfqq zzfqqVar, zzdzo zzdzoVar, zzcbs zzcbsVar, ScheduledExecutorService scheduledExecutorService, zzfsm zzfsmVar, zzdgd zzdgdVar) {
        this.f13842a = zzcnqVar;
        this.f13843b = context;
        this.f13844c = versionInfoParcel;
        this.f13845d = zzflgVar;
        this.f13846e = executor;
        this.f13848g = str;
        this.f13849h = zzfqqVar;
        zzcnqVar.mo5684b();
        this.f13850i = zzdzoVar;
        this.f13847f = scheduledExecutorService;
        this.f13851j = zzfsmVar;
        this.f13852k = zzdgdVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzhay m6200a(String str, final String str2) {
        ListenableFuture listenableFutureM7367a;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return (zzhay) zzhcf.m7368b(new zzepp(15, "Invalid ad string."));
        }
        Context context = this.f13843b;
        zzfqg zzfqgVarM6562l = zzfqg.m6562l(context, 11);
        zzfqgVarM6562l.zza();
        zzbup zzbupVarM5145b = com.google.android.gms.ads.internal.zzt.f3698C.f3718r.m5145b(context, this.f13844c, this.f13842a.mo5680A());
        zzbuj zzbujVar = zzbum.f9398a;
        final zzbut zzbutVarM5148a = zzbupVarM5145b.m5148a("google.afma.response.normalize", zzbujVar, zzbujVar);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8428Z7)).booleanValue();
        Executor executor = this.f13846e;
        zzdzo zzdzoVar = this.f13850i;
        if (zBooleanValue) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.f13854m = jSONObject.optString("fetch_url", "");
                    this.f13855n = com.google.android.gms.ads.internal.util.zzbp.m3117a(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Invalid ad response.");
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            String string = this.f13854m;
            final List list = this.f13855n;
            if (TextUtils.isEmpty(string)) {
                listenableFutureM7367a = zzhcf.m7367a(str3);
                zzdzoVar.m6103b("sst", "1");
            } else {
                zzdzoVar.m6103b("sst", "2");
                zzbio zzbioVar = zzbix.f8462b8;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                zzbiv zzbivVar = zzbaVar.f3098c;
                zzbiv zzbivVar2 = zzbaVar.f3098c;
                String str5 = (String) zzbivVar.m5030a(zzbioVar);
                if (((Boolean) zzbivVar2.m5030a(zzbix.f8445a8)).booleanValue()) {
                    final zzgtk zzgtkVar = new zzgtk(f13841p);
                    zzgtr.m7132e("The pattern may not match the empty string: %s", !((zzgtj) zzgtkVar.mo7125a("")).f18173a.matches(), zzgtkVar);
                    List listM7147e = new zzgug(new zzguf() { // from class: com.google.android.gms.internal.ads.zzgub
                        @Override // com.google.android.gms.internal.ads.zzguf
                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Iterator mo7142a(zzgug zzgugVar, CharSequence charSequence) {
                            return new zzgty(zzgugVar, charSequence, zzgtkVar.mo7125a(charSequence));
                        }
                    }).m7147e(string);
                    if (listM7147e.size() < 2) {
                        listenableFutureM7367a = zzhcf.m7368b(new zzepp(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listM7147e.get(1);
                        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzeis zzeisVar = new zzeis(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5);
                        listenableFutureM7367a = (zzhbx) zzhcf.m7372f((zzhbx) zzhcf.m7373g(zzhbx.m7360q(((zzhbb) zzcfy.f9946a).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefx
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws zzepp {
                                zzeis zzeisVar2 = zzeisVar;
                                zzdzc zzdzcVar = zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_START;
                                zzega zzegaVar = this.f13827a;
                                zzegaVar.m6201b(zzdzcVar);
                                int i3 = 0;
                                int i4 = -1;
                                while (true) {
                                    try {
                                        zzbio zzbioVar2 = zzbix.f8496d8;
                                        com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                        if (i3 >= ((Integer) zzbaVar2.f3098c.m5030a(zzbioVar2)).intValue()) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 40);
                                            sb.append("Received HTTP error code from ad server:");
                                            sb.append(i4);
                                            throw new zzepp(1, sb.toString());
                                        }
                                        Context context2 = zzegaVar.f13843b;
                                        String str6 = zzegaVar.f13844c.f3396s;
                                        Binder.getCallingUid();
                                        zzeit zzeitVarMo5874b = new zzeiu(context2, str6, null).mo5874b(zzeisVar2);
                                        int i5 = zzeitVarMo5874b.f13989a;
                                        if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8513e8)).booleanValue()) {
                                            zzegaVar.f13850i.m6103b("fr", String.valueOf(i3));
                                        }
                                        if (i5 == 200) {
                                            zzegaVar.m6201b(zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_END);
                                            return zzeitVarMo5874b.f13991c;
                                        }
                                        i3++;
                                        i4 = i5;
                                    } catch (Exception e) {
                                        throw new zzepp(e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
                                    }
                                }
                            }
                        })), ((Integer) zzbivVar2.m5030a(zzbix.f8479c8)).intValue(), TimeUnit.MILLISECONDS, this.f13847f), Exception.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefy
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final ListenableFuture mo3248b(Object obj) {
                                zzepp zzeppVar;
                                Exception exc = (Exception) obj;
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                                if (exc instanceof TimeoutException) {
                                    zzeppVar = new zzepp(1, "Timed out waiting for ad response.");
                                } else if (exc instanceof zzepp) {
                                    zzeppVar = (zzepp) exc;
                                } else {
                                    zzeppVar = new zzepp(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                                }
                                String message = zzeppVar.getMessage() == null ? "" : zzeppVar.getMessage();
                                List list2 = list;
                                if (list2 != null && !list2.isEmpty()) {
                                    String str6 = "0.6.0.0";
                                    if (!TextUtils.isEmpty(message)) {
                                        if (message.contains("Timed out waiting for ad response.")) {
                                            message = "timeout";
                                            str6 = "0.2.0.0";
                                        } else if (message.contains("Received HTTP error code from ad server:")) {
                                            List listM7147e2 = zzgug.m7143a(new zzgtb(':')).m7147e(message);
                                            if (listM7147e2.size() == 2) {
                                                message = (String) listM7147e2.get(1);
                                            }
                                        }
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(zzfsi.m6639c(zzfsi.m6639c((String) it.next(), "@gw_adnetstatus@", str6), "@error_code@", message));
                                    }
                                    this.f13829a.f13851j.m6642a(arrayList, null);
                                }
                                return zzhcf.m7368b(zzeppVar);
                            }
                        }, executor);
                    }
                } else {
                    final zzeis zzeisVar2 = new zzeis(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5);
                    listenableFutureM7367a = (zzhbx) zzhcf.m7372f((zzhbx) zzhcf.m7373g(zzhbx.m7360q(((zzhbb) zzcfy.f9946a).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefx
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws zzepp {
                            zzeis zzeisVar3 = zzeisVar2;
                            zzdzc zzdzcVar = zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_START;
                            zzega zzegaVar = this.f13827a;
                            zzegaVar.m6201b(zzdzcVar);
                            int i3 = 0;
                            int i4 = -1;
                            while (true) {
                                try {
                                    zzbio zzbioVar2 = zzbix.f8496d8;
                                    com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                    if (i3 >= ((Integer) zzbaVar2.f3098c.m5030a(zzbioVar2)).intValue()) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 40);
                                        sb.append("Received HTTP error code from ad server:");
                                        sb.append(i4);
                                        throw new zzepp(1, sb.toString());
                                    }
                                    Context context2 = zzegaVar.f13843b;
                                    String str6 = zzegaVar.f13844c.f3396s;
                                    Binder.getCallingUid();
                                    zzeit zzeitVarMo5874b = new zzeiu(context2, str6, null).mo5874b(zzeisVar3);
                                    int i5 = zzeitVarMo5874b.f13989a;
                                    if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8513e8)).booleanValue()) {
                                        zzegaVar.f13850i.m6103b("fr", String.valueOf(i3));
                                    }
                                    if (i5 == 200) {
                                        zzegaVar.m6201b(zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_END);
                                        return zzeitVarMo5874b.f13991c;
                                    }
                                    i3++;
                                    i4 = i5;
                                } catch (Exception e) {
                                    throw new zzepp(e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
                                }
                            }
                        }
                    })), ((Integer) zzbivVar2.m5030a(zzbix.f8479c8)).intValue(), TimeUnit.MILLISECONDS, this.f13847f), Exception.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefy
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj) {
                            zzepp zzeppVar;
                            Exception exc = (Exception) obj;
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                            if (exc instanceof TimeoutException) {
                                zzeppVar = new zzepp(1, "Timed out waiting for ad response.");
                            } else if (exc instanceof zzepp) {
                                zzeppVar = (zzepp) exc;
                            } else {
                                zzeppVar = new zzepp(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                            }
                            String message = zzeppVar.getMessage() == null ? "" : zzeppVar.getMessage();
                            List list2 = list;
                            if (list2 != null && !list2.isEmpty()) {
                                String str6 = "0.6.0.0";
                                if (!TextUtils.isEmpty(message)) {
                                    if (message.contains("Timed out waiting for ad response.")) {
                                        message = "timeout";
                                        str6 = "0.2.0.0";
                                    } else if (message.contains("Received HTTP error code from ad server:")) {
                                        List listM7147e2 = zzgug.m7143a(new zzgtb(':')).m7147e(message);
                                        if (listM7147e2.size() == 2) {
                                            message = (String) listM7147e2.get(1);
                                        }
                                    }
                                }
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(zzfsi.m6639c(zzfsi.m6639c((String) it.next(), "@gw_adnetstatus@", str6), "@error_code@", message));
                                }
                                this.f13829a.f13851j.m6642a(arrayList, null);
                            }
                            return zzhcf.m7368b(zzeppVar);
                        }
                    }, executor);
                }
            }
        } else {
            listenableFutureM7367a = zzhcf.m7367a(str);
            zzdzoVar.m6103b("sst", "1");
        }
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(zzhcf.m7374h(zzhcf.m7374h(listenableFutureM7367a, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) throws JSONException {
                String str6 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str6);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzhcf.m7367a(jSONObject2);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8192L2)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, this.f13824a.f13850i, "scar-preloader-processing-done");
                }
                return zzbutVarM5148a.m5149a(jSONObject2);
            }
        }, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                zzega zzegaVar = this.f13826a;
                zzfkv zzfkvVar = new zzfkv(zzegaVar.f13845d);
                String string2 = ((JSONObject) obj).toString();
                return zzhcf.m7367a(new zzfky(zzfkvVar, zzfkx.m6484a(new StringReader(string2), zzegaVar.f13856o)));
            }
        }, executor);
        zzfqp.m6577c(listenableFutureM7374h, this.f13849h, zzfqgVarM6562l, false);
        zzefu zzefuVar = new zzefu(this);
        zzhcp zzhcpVar = zzcfy.f9953h;
        zzhcd zzhcdVar = new zzhcd(listenableFutureM7374h, zzefuVar);
        zzhay zzhayVar = (zzhay) listenableFutureM7374h;
        zzhayVar.addListener(zzhcdVar, zzhcpVar);
        return zzhayVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m6201b(zzdzc zzdzcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8513e8)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, this.f13850i, zzdzcVar.f13394s);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m6202c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f13848g));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strConcat);
            return str;
        }
    }
}
