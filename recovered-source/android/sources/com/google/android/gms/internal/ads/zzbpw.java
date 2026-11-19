package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpw {

    /* JADX INFO: renamed from: a */
    public static final zzbpx f9221a = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzbpv
        @Override // com.google.android.gms.internal.ads.zzbpx
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo5095a(Object obj, Map map) {
            zzcmn zzcmnVar = (zzcmn) obj;
            zzbpx zzbpxVar = zzbpw.f9221a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcmnVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                StringBuilder sb = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
                sb.append("/canOpenURLs;");
                sb.append(str2);
                sb.append(";");
                sb.append(boolValueOf);
                com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
            }
            ((zzbst) zzcmnVar).mo5129b("openableURLs", map2);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final zzbpx f9222b = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzbpm
        @Override // com.google.android.gms.internal.ads.zzbpx
        /* JADX INFO: renamed from: a */
        public final void mo5095a(Object obj, Map map) {
            zzcmn zzcmnVar = (zzcmn) obj;
            zzbpx zzbpxVar = zzbpw.f9221a;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8768t9)).booleanValue()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcmnVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
            sb.append("/canOpenApp;");
            sb.append(str);
            sb.append(";");
            sb.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
            ((zzbst) zzcmnVar).mo5129b("openableApp", map2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final zzbpx f9223c = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzbpn
        /* JADX WARN: Code duplicated, block: B:19:0x0088  */
        /* JADX WARN: Code duplicated, block: B:21:0x0093  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzbpx
        /* JADX INFO: renamed from: a */
        public final void mo5095a(Object obj, Map map) {
            Intent uri;
            Intent intent;
            String[] strArrSplit;
            zzcmn zzcmnVar = (zzcmn) obj;
            zzbpx zzbpxVar = zzbpw.f9221a;
            PackageManager packageManager = zzcmnVar.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject((String) map.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < jSONArray.length()) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            String strOptString = jSONObject2.optString("id");
                            String strOptString2 = jSONObject2.optString("u");
                            String strOptString3 = jSONObject2.optString("i");
                            String strOptString4 = jSONObject2.optString("m");
                            String strOptString5 = jSONObject2.optString("p");
                            String strOptString6 = jSONObject2.optString("c");
                            String strOptString7 = jSONObject2.optString("intent_url");
                            ResolveInfo resolveInfoResolveActivity = null;
                            try {
                                try {
                                    if (!TextUtils.isEmpty(strOptString7)) {
                                        try {
                                            uri = Intent.parseUri(strOptString7, i2);
                                            i2 = i2;
                                        } catch (URISyntaxException e) {
                                            String strValueOf = String.valueOf(strOptString7);
                                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error parsing the url: ".concat(strValueOf), e);
                                            uri = null;
                                        }
                                        if (uri == null) {
                                            uri = new Intent();
                                            if (!TextUtils.isEmpty(strOptString2)) {
                                                uri.setData(Uri.parse(strOptString2));
                                            }
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                uri.setAction(strOptString3);
                                            }
                                            if (!TextUtils.isEmpty(strOptString4)) {
                                                uri.setType(strOptString4);
                                            }
                                            if (!TextUtils.isEmpty(strOptString5)) {
                                                uri.setPackage(strOptString5);
                                            }
                                            if (!TextUtils.isEmpty(strOptString6)) {
                                                strArrSplit = strOptString6.split("/", 2);
                                                if (strArrSplit.length == 2) {
                                                    uri.setComponent(new ComponentName(strArrSplit[i2], strArrSplit[1]));
                                                }
                                            }
                                        }
                                        intent = uri;
                                        resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                                        jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i2 : 1);
                                        i3++;
                                        i2 = i2;
                                    }
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                                } catch (NullPointerException e2) {
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d(intent.toString(), e2);
                                }
                                jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i2 : 1);
                            } catch (JSONException e3) {
                                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error constructing openable urls response.", e3);
                            }
                            uri = null;
                            if (uri == null) {
                                uri = new Intent();
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    uri.setData(Uri.parse(strOptString2));
                                }
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    uri.setAction(strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    uri.setType(strOptString4);
                                }
                                if (!TextUtils.isEmpty(strOptString5)) {
                                    uri.setPackage(strOptString5);
                                }
                                if (!TextUtils.isEmpty(strOptString6)) {
                                    strArrSplit = strOptString6.split("/", 2);
                                    if (strArrSplit.length == 2) {
                                        uri.setComponent(new ComponentName(strArrSplit[i2], strArrSplit[1]));
                                    }
                                }
                            }
                            intent = uri;
                        } catch (JSONException e4) {
                            i2 = i2;
                            int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error parsing the intent data.", e4);
                        }
                        i3++;
                        i2 = i2;
                    }
                    ((zzbst) zzcmnVar).mo5128a(jSONObject, "openableIntents");
                } catch (JSONException unused) {
                    ((zzbst) zzcmnVar).mo5128a(new JSONObject(), "openableIntents");
                }
            } catch (JSONException unused2) {
                ((zzbst) zzcmnVar).mo5128a(new JSONObject(), "openableIntents");
            }
        }
    };

    /* JADX INFO: renamed from: d */
    public static final zzbpx f9224d = new zzbpe();

    /* JADX INFO: renamed from: e */
    public static final zzbpx f9225e = new zzbpf();

    /* JADX INFO: renamed from: f */
    public static final zzbpx f9226f = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzbps
        @Override // com.google.android.gms.internal.ads.zzbpx
        /* JADX INFO: renamed from: a */
        public final void mo5095a(Object obj, Map map) {
            zzcmn zzcmnVar = (zzcmn) obj;
            zzbpx zzbpxVar = zzbpw.f9221a;
            String str = (String) map.get("u");
            if (str == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("URL missing from httpTrack GMSG.");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8538g)).booleanValue() && str.isEmpty()) {
                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("URL is empty from httpTrack GMSG.");
            } else {
                zzcks zzcksVar = (zzcks) zzcmnVar;
                new com.google.android.gms.ads.internal.util.zzbt(zzcmnVar.getContext(), ((zzcmv) zzcmnVar).mo5472h().f3396s, str, zzcksVar.mo5565B() != null ? zzcksVar.mo5565B().f15963x0 : null).mo3108b();
            }
        }
    };

    /* JADX INFO: renamed from: g */
    public static final zzbpx f9227g = new zzbpg();

    /* JADX INFO: renamed from: h */
    public static final zzbpx f9228h = new zzbph();

    /* JADX INFO: renamed from: i */
    public static final zzbpx f9229i = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzbpt
        @Override // com.google.android.gms.internal.ads.zzbpx
        /* JADX INFO: renamed from: a */
        public final void mo5095a(Object obj, Map map) {
            zzcmu zzcmuVar = (zzcmu) obj;
            zzbpx zzbpxVar = zzbpw.f9221a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i2 = Integer.parseInt(str);
                int i3 = Integer.parseInt(str2);
                int i4 = Integer.parseInt(str3);
                zzbaw zzbawVarMo5611q = zzcmuVar.mo5611q();
                if (zzbawVarMo5611q != null) {
                    zzbawVarMo5611q.f7501b.mo3254a(i2, i3, i4);
                }
            } catch (NumberFormatException unused) {
                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* JADX INFO: renamed from: j */
    public static final zzbpx f9230j = new zzbpi();

    /* JADX INFO: renamed from: k */
    public static final zzbpx f9231k = new zzbpj();

    /* JADX INFO: renamed from: l */
    public static final zzciv f9232l = new zzciv();

    /* JADX INFO: renamed from: m */
    public static final zzciw f9233m = new zzciw();

    /* JADX INFO: renamed from: n */
    public static final zzboq f9234n = new zzboq();

    /* JADX INFO: renamed from: o */
    public static final zzbqo f9235o = new zzbqo();

    /* JADX INFO: renamed from: p */
    public static final zzbpx f9236p = new zzbpk();

    /* JADX INFO: renamed from: q */
    public static final zzbpx f9237q = new zzbpl();

    /* JADX INFO: renamed from: r */
    public static final zzbpx f9238r = new zzbor();

    /* JADX INFO: renamed from: s */
    public static final zzbpx f9239s = new zzbos();

    /* JADX INFO: renamed from: t */
    public static final zzbpx f9240t = new zzbot();

    /* JADX INFO: renamed from: u */
    public static final zzbpx f9241u = new zzbou();

    /* JADX INFO: renamed from: v */
    public static final zzbpx f9242v = new zzbov();

    /* JADX INFO: renamed from: w */
    public static final zzbpx f9243w = new zzbow();

    /* JADX INFO: renamed from: x */
    public static final zzbpx f9244x = new zzbox();

    /* JADX INFO: renamed from: y */
    public static final zzbpx f9245y = new zzboy();

    /* JADX INFO: renamed from: z */
    public static final zzbpx f9246z = new zzboz();

    /* JADX INFO: renamed from: A */
    public static final zzbpx f9218A = new zzbpa();

    /* JADX INFO: renamed from: B */
    public static final zzbpx f9219B = new zzbpc();

    /* JADX INFO: renamed from: C */
    public static final zzbpx f9220C = new zzbpd();

    /* JADX INFO: renamed from: a */
    public static ListenableFuture m5098a(zzclb zzclbVar, String str) {
        String strM5364d;
        final String strReplace;
        Uri uriM4705b = Uri.parse(str);
        try {
            zzbaw zzbawVarMo5611q = zzclbVar.mo5611q();
            zzflk zzflkVarMo5584N = zzclbVar.mo5584N();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8806vd)).booleanValue() || zzflkVarMo5584N == null) {
                if (zzbawVarMo5611q != null && zzbawVarMo5611q.m4704a(uriM4705b)) {
                    uriM4705b = zzbawVarMo5611q.m4705b(uriM4705b, zzclbVar.getContext(), zzclbVar.mo5577H(), zzclbVar.zzj());
                }
            } else if (zzbawVarMo5611q != null && zzbawVarMo5611q.m4704a(uriM4705b)) {
                uriM4705b = zzflkVarMo5584N.m6489a(uriM4705b, zzclbVar.getContext(), zzclbVar.mo5577H(), zzclbVar.zzj());
            }
        } catch (zzbax unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strConcat);
        }
        HashMap map = new HashMap();
        if (zzclbVar.mo5565B() != null) {
            map = zzclbVar.mo5565B().f15961w0;
        }
        Context context = zzclbVar.getContext();
        zzceg zzcegVar = com.google.android.gms.ads.internal.zzt.f3698C.f3725y;
        if (zzcegVar.m5361a(context) && (strM5364d = zzcegVar.m5364d(context)) != null) {
            zzbio zzbioVar = zzbix.f8275Q0;
            zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
            String str2 = (String) zzbivVar.m5030a(zzbioVar);
            String string = uriM4705b.toString();
            if (((Boolean) zzbivVar.m5030a(zzbix.f8258P0)).booleanValue() && string.contains(str2)) {
                zzcegVar.m5366h(context, "_ac", strM5364d, zzceg.m5359f((Map) map.get("_ac")));
                strReplace = zzcei.m5375c(context, string).replace(str2, strM5364d);
            } else if (!TextUtils.isEmpty(uriM4705b.getQueryParameter("fbs_aeid")) || ((Boolean) zzbivVar.m5030a(zzbix.f8241O0)).booleanValue()) {
                strReplace = string;
            } else {
                String string2 = zzcei.m5374b(zzcei.m5375c(context, string), "fbs_aeid", strM5364d).toString();
                zzcegVar.m5366h(context, "_ac", strM5364d, zzceg.m5359f((Map) map.get("_ac")));
                strReplace = string2;
            }
        } else {
            strReplace = uriM4705b.toString();
        }
        long jLongValue = ((Long) zzbkw.f9054e.m5057c()).longValue();
        if (jLongValue <= 0 || jLongValue > 254730000) {
            return zzhcf.m7367a(strReplace);
        }
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzclbVar.mo5603i0());
        zzbpo zzbpoVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzbpo
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpx zzbpxVar = zzbpw.f9221a;
                if (!((Boolean) zzbkw.f9058i.m5057c()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("prepareClickUrl.attestation1", th);
                return "failure_click_attok";
            }
        };
        zzhcp zzhcpVar = zzcfy.f9953h;
        return (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7371e(zzhbxVarM7360q, Throwable.class, zzbpoVar, zzhcpVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzbpp
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                String str3;
                String str4;
                Uri uri;
                String str5 = (String) obj;
                zzbpx zzbpxVar = zzbpw.f9221a;
                String strReplace2 = strReplace;
                if (str5 != null) {
                    if (((Boolean) zzbkw.f9055f.m5057c()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace2).getHost();
                        for (int i3 = 0; i3 < 3; i3++) {
                            if (host.endsWith(strArr[i3])) {
                                str3 = (String) zzbkw.f9050a.m5057c();
                                str4 = (String) zzbkw.f9051b.m5057c();
                                if (!TextUtils.isEmpty(str3)) {
                                    strReplace2 = strReplace2.replace(str3, str5);
                                }
                                if (!TextUtils.isEmpty(str4)) {
                                    uri = Uri.parse(strReplace2);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str4))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str4, str5).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str3 = (String) zzbkw.f9050a.m5057c();
                        str4 = (String) zzbkw.f9051b.m5057c();
                        if (!TextUtils.isEmpty(str3)) {
                            strReplace2 = strReplace2.replace(str3, str5);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            uri = Uri.parse(strReplace2);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str4))) {
                                return uri.buildUpon().appendQueryParameter(str4, str5).toString();
                            }
                        }
                    }
                }
                return strReplace2;
            }
        }, zzhcpVar), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzbpq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpx zzbpxVar = zzbpw.f9221a;
                if (((Boolean) zzbkw.f9058i.m5057c()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("prepareClickUrl.attestation2", th);
                }
                return strReplace;
            }
        }, zzhcpVar);
    }

    /* JADX INFO: renamed from: b */
    public static void m5099b(Map map, zzdlg zzdlgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8534fc)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdlgVar != null) {
            zzdlgVar.mo5626C();
        }
    }
}
