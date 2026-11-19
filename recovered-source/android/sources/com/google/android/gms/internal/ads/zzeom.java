package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeom implements zzeog {

    /* JADX INFO: renamed from: a */
    public final zzdok f14393a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f14394b;

    /* JADX INFO: renamed from: c */
    public final zzdsv f14395c;

    /* JADX INFO: renamed from: d */
    public final zzfmf f14396d;

    /* JADX INFO: renamed from: e */
    public final zzdvl f14397e;

    /* JADX INFO: renamed from: f */
    public final zzdzo f14398f;

    /* JADX INFO: renamed from: g */
    public final VersionInfoParcel f14399g;

    /* JADX INFO: renamed from: h */
    public final Context f14400h;

    public zzeom(zzdok zzdokVar, zzhcp zzhcpVar, zzdsv zzdsvVar, zzfmf zzfmfVar, zzdvl zzdvlVar, zzdzo zzdzoVar, VersionInfoParcel versionInfoParcel, Context context, zzcdq zzcdqVar) {
        this.f14399g = versionInfoParcel;
        this.f14400h = context;
        this.f14393a = zzdokVar;
        this.f14394b = zzhcpVar;
        this.f14395c = zzdsvVar;
        this.f14396d = zzfmfVar;
        this.f14397e = zzdvlVar;
        this.f14398f = zzdzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8192L2)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, this.f14398f, "rendering-native-ads-native-js-webview-start");
        }
        ListenableFuture listenableFutureM6531b = this.f14396d.m6531b();
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) throws JSONException {
                final zzdvf zzdvfVar = (zzdvf) obj;
                zzbio zzbioVar = zzbix.f8192L2;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                boolean zBooleanValue = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue();
                final zzeom zzeomVar = this.f14391a;
                if (zBooleanValue) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-native-ads-preprocess-start");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isNonagon", true);
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8284Q9)).booleanValue() && PlatformVersion.m3654b()) {
                    jSONObject.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("response", zzfknVar.f15952s.f15994c);
                jSONObject2.put("sdk_params", jSONObject);
                return zzhcf.m7374h(zzdvfVar.m6068a(jSONObject2, "google.afma.nativeAds.preProcessJson"), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeoi
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final ListenableFuture mo3248b(Object obj2) throws zzbue {
                        zzeom zzeomVar2 = zzeomVar;
                        zzdvf zzdvfVar2 = zzdvfVar;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        zzfmf zzfmfVar = zzeomVar2.f14396d;
                        ListenableFuture listenableFutureM7367a = zzhcf.m7367a(zzdvfVar2);
                        synchronized (zzfmfVar) {
                            zzfmfVar.f16106a.addFirst(listenableFutureM7367a);
                        }
                        if (!jSONObject3.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                            throw new zzbue("process json failed");
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8192L2)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar2.f14398f, "rendering-native-ads-preprocess-end");
                        }
                        return zzhcf.m7367a(jSONObject3.getJSONObject("json").getJSONArray("ads"));
                    }
                }, zzeomVar.f14394b);
            }
        };
        zzhcp zzhcpVar = this.f14394b;
        return zzhcf.m7374h(zzhcf.m7374h(listenableFutureM6531b, zzhbnVar, zzhcpVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return zzhcf.m7368b(new zzeel(3));
                }
                zzfky zzfkyVar2 = zzfkyVar;
                int i2 = zzfkyVar2.f16005a.f15998a.f16048l;
                zzeom zzeomVar = this.f14377a;
                zzfkn zzfknVar2 = zzfknVar;
                if (i2 <= 1) {
                    return zzhcf.m7375i(zzeomVar.m6295c(zzfkyVar2, zzfknVar2, jSONArray.getJSONObject(0)), new zzgti() { // from class: com.google.android.gms.internal.ads.zzeoj
                        @Override // com.google.android.gms.internal.ads.zzgti
                        public final /* synthetic */ Object apply(Object obj2) {
                            return Collections.singletonList(zzhcf.m7367a((zzdpw) obj2));
                        }
                    }, zzeomVar.f14394b);
                }
                int length = jSONArray.length();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8226N2)).booleanValue()) {
                    zzeomVar.f14398f.m6103b("nsl", String.valueOf(length));
                }
                zzeomVar.f14396d.m6530a(Math.min(length, i2));
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (i3 < length) {
                        arrayList.add(zzeomVar.m6295c(zzfkyVar2, zzfknVar2, jSONArray.getJSONObject(i3)));
                    } else {
                        arrayList.add(zzhcf.m7368b(new zzeel(3)));
                    }
                }
                return zzhcf.m7367a(arrayList);
            }
        }, zzhcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.f15952s;
        return (zzfksVar == null || zzfksVar.f15994c == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x033b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0360  */
    /* JADX WARN: Code duplicated, block: B:109:0x0378 A[PHI: r26
  0x0378: PHI (r26v5 com.google.android.gms.internal.ads.zzdzo) = 
  (r26v4 com.google.android.gms.internal.ads.zzdzo)
  (r26v4 com.google.android.gms.internal.ads.zzdzo)
  (r26v4 com.google.android.gms.internal.ads.zzdzo)
  (r26v4 com.google.android.gms.internal.ads.zzdzo)
  (r26v6 com.google.android.gms.internal.ads.zzdzo)
  (r26v6 com.google.android.gms.internal.ads.zzdzo)
  (r26v6 com.google.android.gms.internal.ads.zzdzo)
 binds: [B:102:0x035e, B:104:0x0364, B:106:0x0370, B:108:0x0376, B:179:0x0378, B:176:0x0378, B:118:0x03a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:130:0x0406  */
    /* JADX WARN: Code duplicated, block: B:132:0x0418  */
    /* JADX WARN: Code duplicated, block: B:133:0x0426  */
    /* JADX WARN: Code duplicated, block: B:136:0x0434  */
    /* JADX WARN: Code duplicated, block: B:138:0x043c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0448  */
    /* JADX WARN: Code duplicated, block: B:143:0x0452  */
    /* JADX WARN: Code duplicated, block: B:144:0x0459  */
    /* JADX WARN: Code duplicated, block: B:146:0x046b  */
    /* JADX WARN: Code duplicated, block: B:147:0x047d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0483  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:155:0x04ce A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:156:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:161:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:162:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:164:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x0523  */
    /* JADX WARN: Code duplicated, block: B:171:0x0570  */
    /* JADX WARN: Code duplicated, block: B:173:0x0579  */
    /* JADX WARN: Code duplicated, block: B:48:0x016f  */
    /* JADX WARN: Code duplicated, block: B:50:0x017d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x021c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0222  */
    /* JADX WARN: Code duplicated, block: B:67:0x0268  */
    /* JADX WARN: Code duplicated, block: B:68:0x026a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0274  */
    /* JADX WARN: Code duplicated, block: B:73:0x027a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0289  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:95:0x032c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0330  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final ListenableFuture m6295c(final zzfky zzfkyVar, final zzfkn zzfknVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        final zzcdp zzcdpVar;
        zzfkq zzfkqVar;
        Executor executor;
        ListenableFuture listenableFutureM7374h;
        int i2;
        final com.google.android.gms.ads.internal.client.zzr zzrVar;
        ListenableFuture listenableFuture;
        ListenableFuture listenableFutureM6056b;
        ListenableFuture listenableFutureM6056b2;
        final JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        ListenableFuture listenableFutureM6058e;
        ListenableFuture listenableFuture2;
        String[] strArr;
        JSONObject jSONObjectM3127k;
        JSONObject jSONObjectOptJSONObject3;
        String str;
        ListenableFuture listenableFutureM6057d;
        final zzcdp zzcdpVar2;
        zzdzo zzdzoVar;
        ListenableFuture listenableFutureM7367a;
        ListenableFuture listenableFuture3;
        zzdtp zzdtpVar;
        Executor executor2;
        JSONArray jSONArrayOptJSONArray2;
        ArrayList arrayList;
        int length;
        int i3;
        ListenableFuture listenableFuture4;
        ListenableFuture listenableFutureM7375i;
        JSONObject jSONObjectOptJSONObject4;
        JSONArray jSONArray;
        final String strOptString;
        int i4;
        String strOptString2;
        ListenableFuture listenableFutureM7375i2;
        ListenableFuture listenableFuture5;
        JSONObject jSONObjectOptJSONObject5;
        final String strOptString3;
        zzbio zzbioVar;
        com.google.android.gms.ads.internal.client.zzba zzbaVar;
        ListenableFuture listenableFutureM7374h2;
        ListenableFuture listenableFuture6;
        ArrayList arrayList2;
        JSONArray jSONArrayOptJSONArray3;
        final JSONObject jSONObjectOptJSONObject6;
        String strOptString4;
        boolean z;
        final zzduc zzducVar;
        ListenableFuture listenableFutureM7374h3;
        String str2;
        zzcdp zzcdpVar3;
        zzbio zzbioVar2 = zzbix.f8209M2;
        com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar2.f3098c;
        zzbiv zzbivVar2 = zzbaVar2.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar2)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, this.f14398f, "rendering-webview-creation-start");
        }
        final ListenableFuture listenableFutureM6531b = this.f14396d.m6531b();
        boolean zBooleanValue = ((Boolean) zzbivVar2.m5030a(zzbix.f8537ff)).booleanValue();
        Context context = this.f14400h;
        if (zBooleanValue) {
            zzcdr zzcdrVar = zzfknVar.f15881A;
            if (zzcdrVar != null) {
                zzfks zzfksVar = zzfknVar.f15952s;
                zzcdpVar3 = new zzcdp(context, this.f14399g, zzcdrVar, zzfksVar == null ? null : zzfksVar.f15993b);
            } else {
                zzcdpVar3 = null;
            }
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzcdpVar3);
            zzcdpVar = zzcdpVar3;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, null);
            zzcdpVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzdsv zzdsvVar = this.f14395c;
        zzhcp zzhcpVar = zzdsvVar.f12846a;
        final zzdtk zzdtkVar = zzdsvVar.f12847b;
        zzbma zzbmaVar = zzdtkVar.f12887h;
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8192L2)).booleanValue()) {
            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdsvVar.f12849d, "rendering-native-assets-loading-start");
        }
        ListenableFuture listenableFutureSubmit = zzhcpVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdsu
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzepp {
                zzdsv zzdsvVar2 = zzdsvVar;
                zzfky zzfkyVar2 = zzfkyVar;
                zzfkn zzfknVar2 = zzfknVar;
                JSONObject jSONObject2 = jSONObject;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdsvVar2.f12849d, "native-assets-loading-basic-start");
                }
                zzdqb zzdqbVar = new zzdqb();
                int iOptInt = jSONObject2.optInt("template_id", -1);
                synchronized (zzdqbVar) {
                    zzdqbVar.f12610a = iOptInt;
                }
                String strOptString5 = jSONObject2.optString("custom_template_id");
                synchronized (zzdqbVar) {
                    zzdqbVar.f12630u = strOptString5;
                }
                JSONObject jSONObjectOptJSONObject7 = jSONObject2.optJSONObject("omid_settings");
                String strOptString6 = jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optString("omid_partner_name") : null;
                synchronized (zzdqbVar) {
                    zzdqbVar.f12634y = strOptString6;
                }
                zzflg zzflgVar = zzfkyVar2.f16005a.f15998a;
                if (!zzflgVar.f16044h.contains(Integer.toString(zzdqbVar.m6011q()))) {
                    int iM6011q = zzdqbVar.m6011q();
                    throw new zzepp(1, AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM6011q).length() + 21), "Invalid template ID: ", iM6011q));
                }
                if (zzdqbVar.m6011q() == 3) {
                    if (zzdqbVar.m6004g() == null) {
                        throw new zzepp(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzflgVar.f16045i.contains(zzdqbVar.m6004g())) {
                        throw new zzepp(1, "Unexpected custom template id in the response.");
                    }
                }
                double dOptDouble = jSONObject2.optDouble("rating", -1.0d);
                synchronized (zzdqbVar) {
                    zzdqbVar.f12627r = dOptDouble;
                }
                String strOptString7 = jSONObject2.optString("headline", null);
                if (zzfknVar2.f15902M) {
                    com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                    com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
                    com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
                    Resources resourcesM5383c = zztVar.f3708h.m5383c();
                    String string = resourcesM5383c != null ? resourcesM5383c.getString(R.string.s7) : "Test Ad";
                    strOptString7 = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(strOptString7).length()), string, " : ", strOptString7);
                }
                zzdqbVar.m6009o("headline", strOptString7);
                zzdqbVar.m6009o("body", jSONObject2.optString("body", null));
                zzdqbVar.m6009o("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdqbVar.m6009o("store", jSONObject2.optString("store", null));
                zzdqbVar.m6009o(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                zzdqbVar.m6009o("advertiser", jSONObject2.optString("advertiser", null));
                return zzdqbVar;
            }
        });
        zzdsvVar.m6048a(listenableFutureSubmit, zzdzc.NATIVE_ASSETS_LOADING_BASIC_END);
        Executor executor3 = zzdtkVar.f12886g;
        zzdzo zzdzoVar2 = zzdtkVar.f12897r;
        zzhcp zzhcpVar2 = zzhcpVar;
        ListenableFuture listenableFutureM6055a = zzdtkVar.m6055a(jSONObject.optJSONArray("images"), zzbmaVar.f9167t, zzbmaVar.f9169v, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_START);
        zzdsvVar.m6048a(listenableFutureM6055a, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_END);
        final zzfkq zzfkqVar2 = zzfkyVar.f16006b.f16002b;
        String str3 = "html";
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8787ub)).booleanValue()) {
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("images");
            if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                zzdtkVar = zzdtkVar;
                str3 = "html";
                zzbmaVar = zzbmaVar;
                listenableFutureSubmit = listenableFutureSubmit;
                zzdzoVar2 = zzdzoVar2;
                zzhcpVar2 = zzhcpVar2;
                listenableFutureM6055a = listenableFutureM6055a;
                zzfkqVar = zzfkqVar2;
                executor = executor3;
                listenableFutureM7374h = zzhcj.f18518t;
            } else {
                JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray4.optJSONObject(0);
                if (jSONObjectOptJSONObject7 == null) {
                    listenableFuture = zzhcj.f18518t;
                } else if (((Boolean) zzbivVar2.m5030a(zzbix.f8245O4)).booleanValue() && jSONObjectOptJSONObject7.has((String) zzbivVar2.m5030a(zzbix.f8262P4))) {
                    listenableFuture = zzhcj.f18518t;
                } else {
                    final String strOptString5 = jSONObjectOptJSONObject7.optString("base_url");
                    final String strOptString6 = jSONObjectOptJSONObject7.optString("html");
                    int iOptInt = jSONObjectOptJSONObject7.optInt("width", 0);
                    int iOptInt2 = jSONObjectOptJSONObject7.optInt("height", 0);
                    if (iOptInt == 0) {
                        if (iOptInt2 != 0) {
                            i2 = 0;
                        } else {
                            zzrVar = com.google.android.gms.ads.internal.client.zzr.m2981w();
                        }
                        if (TextUtils.isEmpty(strOptString6)) {
                            zzbmaVar = zzbmaVar;
                            zzdzoVar2 = zzdzoVar2;
                            zzhcpVar2 = zzhcpVar2;
                            zzfkqVar = zzfkqVar2;
                            zzdtkVar = zzdtkVar;
                            str3 = str3;
                            listenableFutureM6055a = listenableFutureM6055a;
                            listenableFutureSubmit = listenableFutureSubmit;
                            executor = executor3;
                            listenableFutureM7374h = zzhcj.f18518t;
                        } else {
                            if (((Boolean) zzbivVar2.m5030a(zzbix.f8277Q2)).booleanValue()) {
                                AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar2, "native-assets-loading-image-composition-start");
                            }
                            ListenableFuture listenableFuture7 = zzhcj.f18518t;
                            final zzcdp zzcdpVar4 = zzcdpVar;
                            listenableFutureSubmit = listenableFutureSubmit;
                            zzbmaVar = zzbmaVar;
                            zzdzoVar2 = zzdzoVar2;
                            zzhcpVar2 = zzhcpVar2;
                            str3 = "html";
                            listenableFutureM6055a = listenableFutureM6055a;
                            executor = executor3;
                            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdta
                                @Override // com.google.android.gms.internal.ads.zzhbn
                                /* JADX INFO: renamed from: b */
                                public final ListenableFuture mo3248b(Object obj) throws zzclq {
                                    zzeaw zzeawVar;
                                    zzdtk zzdtkVar2 = zzdtkVar;
                                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzrVar;
                                    zzfkn zzfknVar2 = zzfknVar;
                                    zzfkq zzfkqVar3 = zzfkqVar2;
                                    com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
                                    zzcdu zzcduVar = zzcdpVar4;
                                    String str4 = strOptString5;
                                    String str5 = strOptString6;
                                    zzclb zzclbVarM6077a = zzdtkVar2.f12889j.m6077a(zzrVar2, zzfknVar2, zzfkqVar3);
                                    final zzcgc zzcgcVar = new zzcgc(zzclbVarM6077a);
                                    zzdvi zzdviVar = zzdtkVar2.f12891l.f13105a;
                                    zzclm zzclmVarMo5582K = zzclbVarM6077a.mo5582K();
                                    zzbio zzbioVar3 = zzbix.f8537ff;
                                    zzbiv zzbivVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                                    zzclmVarMo5582K.m5640l(zzdviVar, zzdviVar, zzdviVar, zzdviVar, zzdviVar, false, null, !((Boolean) zzbivVar3.m5030a(zzbioVar3)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(zzdtkVar2.f12880a, null) : zzbVar3, null, true != ((Boolean) zzbivVar3.m5030a(zzbioVar3)).booleanValue() ? null : zzcduVar, zzdtkVar2.f12894o, zzdtkVar2.f12893n, zzdtkVar2.f12892m, null, zzdviVar, null, null, null, null, null, null, null);
                                    zzclbVarM6077a.mo5616v0("/getNativeAdViewSignals", zzbpw.f9239s);
                                    zzclbVarM6077a.mo5616v0("/getNativeClickMeta", zzbpw.f9240t);
                                    if (((Boolean) zzbivVar3.m5030a(zzbix.f8130H8)).booleanValue() && ((Boolean) zzbivVar3.m5030a(zzbix.f8164J8)).booleanValue() && (zzeawVar = zzdtkVar2.f12898s) != null) {
                                        zzclbVarM6077a.mo5616v0("/onDeviceStorageEvent", new zzbqf(zzeawVar));
                                    }
                                    zzclm zzclmVarMo5582K2 = zzclbVarM6077a.mo5582K();
                                    synchronized (zzclmVarMo5582K2.f10447v) {
                                        zzclmVarMo5582K2.f10428K = true;
                                    }
                                    zzclbVarM6077a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdti
                                        @Override // com.google.android.gms.internal.ads.zzcmx
                                        /* JADX INFO: renamed from: a */
                                        public final void mo3001a(int i5, String str6, String str7, boolean z2) {
                                            zzcgc zzcgcVar2 = zzcgcVar;
                                            if (z2) {
                                                zzcgcVar2.m5396c();
                                                return;
                                            }
                                            int length2 = String.valueOf(i5).length();
                                            StringBuilder sb = new StringBuilder(length2 + 58 + String.valueOf(str6).length() + 15 + String.valueOf(str7).length());
                                            sb.append("Image Web View failed to load. Error code: ");
                                            sb.append(i5);
                                            sb.append(", Description: ");
                                            sb.append(str6);
                                            zzcgcVar2.m5398b(new zzepp(1, AbstractC0271e0.m403k(sb, ", Failing URL: ", str7)));
                                        }
                                    };
                                    zzclbVarM6077a.mo5608o0(str4, str5);
                                    return zzcgcVar;
                                }
                            };
                            zzdtkVar = zzdtkVar;
                            zzfkqVar = zzfkqVar2;
                            zzbVar2 = zzbVar2;
                            zzcdpVar = zzcdpVar4;
                            final ListenableFuture listenableFutureM7374h4 = zzhcf.m7374h(listenableFuture7, zzhbnVar, zzcfy.f9951f);
                            listenableFutureM7374h = zzhcf.m7374h(listenableFutureM7374h4, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtb
                                @Override // com.google.android.gms.internal.ads.zzhbn
                                /* JADX INFO: renamed from: b */
                                public final ListenableFuture mo3248b(Object obj) throws zzepp {
                                    if (((zzclb) obj) != null) {
                                        return listenableFutureM7374h4;
                                    }
                                    throw new zzepp(1, "Retrieve Web View from image ad response failed.");
                                }
                            }, zzcfy.f9953h);
                            if (((Boolean) zzbivVar2.m5030a(zzbix.f8294R2)).booleanValue()) {
                                zzcgb.m5394a(listenableFutureM7374h, "NativeAssetsLoader.loadImageHtml", executor);
                            }
                        }
                    } else {
                        i2 = iOptInt;
                    }
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr(zzdtkVar.f12880a, new AdSize(i2, iOptInt2));
                    if (TextUtils.isEmpty(strOptString6)) {
                        if (((Boolean) zzbivVar2.m5030a(zzbix.f8277Q2)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar2, "native-assets-loading-image-composition-start");
                        }
                        ListenableFuture listenableFuture8 = zzhcj.f18518t;
                        final zzcdp zzcdpVar5 = zzcdpVar;
                        listenableFutureSubmit = listenableFutureSubmit;
                        zzbmaVar = zzbmaVar;
                        zzdzoVar2 = zzdzoVar2;
                        zzhcpVar2 = zzhcpVar2;
                        str3 = "html";
                        listenableFutureM6055a = listenableFutureM6055a;
                        executor = executor3;
                        zzhbn zzhbnVar2 = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdta
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final ListenableFuture mo3248b(Object obj) throws zzclq {
                                zzeaw zzeawVar;
                                zzdtk zzdtkVar2 = zzdtkVar;
                                com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzrVar;
                                zzfkn zzfknVar2 = zzfknVar;
                                zzfkq zzfkqVar3 = zzfkqVar2;
                                com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
                                zzcdu zzcduVar = zzcdpVar5;
                                String str4 = strOptString5;
                                String str5 = strOptString6;
                                zzclb zzclbVarM6077a = zzdtkVar2.f12889j.m6077a(zzrVar2, zzfknVar2, zzfkqVar3);
                                final zzcgc zzcgcVar = new zzcgc(zzclbVarM6077a);
                                zzdvi zzdviVar = zzdtkVar2.f12891l.f13105a;
                                zzclm zzclmVarMo5582K = zzclbVarM6077a.mo5582K();
                                zzbio zzbioVar3 = zzbix.f8537ff;
                                zzbiv zzbivVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                                zzclmVarMo5582K.m5640l(zzdviVar, zzdviVar, zzdviVar, zzdviVar, zzdviVar, false, null, !((Boolean) zzbivVar3.m5030a(zzbioVar3)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(zzdtkVar2.f12880a, null) : zzbVar3, null, true != ((Boolean) zzbivVar3.m5030a(zzbioVar3)).booleanValue() ? null : zzcduVar, zzdtkVar2.f12894o, zzdtkVar2.f12893n, zzdtkVar2.f12892m, null, zzdviVar, null, null, null, null, null, null, null);
                                zzclbVarM6077a.mo5616v0("/getNativeAdViewSignals", zzbpw.f9239s);
                                zzclbVarM6077a.mo5616v0("/getNativeClickMeta", zzbpw.f9240t);
                                if (((Boolean) zzbivVar3.m5030a(zzbix.f8130H8)).booleanValue() && ((Boolean) zzbivVar3.m5030a(zzbix.f8164J8)).booleanValue() && (zzeawVar = zzdtkVar2.f12898s) != null) {
                                    zzclbVarM6077a.mo5616v0("/onDeviceStorageEvent", new zzbqf(zzeawVar));
                                }
                                zzclm zzclmVarMo5582K2 = zzclbVarM6077a.mo5582K();
                                synchronized (zzclmVarMo5582K2.f10447v) {
                                    zzclmVarMo5582K2.f10428K = true;
                                }
                                zzclbVarM6077a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdti
                                    @Override // com.google.android.gms.internal.ads.zzcmx
                                    /* JADX INFO: renamed from: a */
                                    public final void mo3001a(int i5, String str6, String str7, boolean z2) {
                                        zzcgc zzcgcVar2 = zzcgcVar;
                                        if (z2) {
                                            zzcgcVar2.m5396c();
                                            return;
                                        }
                                        int length2 = String.valueOf(i5).length();
                                        StringBuilder sb = new StringBuilder(length2 + 58 + String.valueOf(str6).length() + 15 + String.valueOf(str7).length());
                                        sb.append("Image Web View failed to load. Error code: ");
                                        sb.append(i5);
                                        sb.append(", Description: ");
                                        sb.append(str6);
                                        zzcgcVar2.m5398b(new zzepp(1, AbstractC0271e0.m403k(sb, ", Failing URL: ", str7)));
                                    }
                                };
                                zzclbVarM6077a.mo5608o0(str4, str5);
                                return zzcgcVar;
                            }
                        };
                        zzdtkVar = zzdtkVar;
                        zzfkqVar = zzfkqVar2;
                        zzbVar2 = zzbVar2;
                        zzcdpVar = zzcdpVar5;
                        final ListenableFuture listenableFutureM7374h5 = zzhcf.m7374h(listenableFuture8, zzhbnVar2, zzcfy.f9951f);
                        listenableFutureM7374h = zzhcf.m7374h(listenableFutureM7374h5, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtb
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final ListenableFuture mo3248b(Object obj) throws zzepp {
                                if (((zzclb) obj) != null) {
                                    return listenableFutureM7374h5;
                                }
                                throw new zzepp(1, "Retrieve Web View from image ad response failed.");
                            }
                        }, zzcfy.f9953h);
                        if (((Boolean) zzbivVar2.m5030a(zzbix.f8294R2)).booleanValue()) {
                            zzcgb.m5394a(listenableFutureM7374h, "NativeAssetsLoader.loadImageHtml", executor);
                        }
                    } else {
                        zzbmaVar = zzbmaVar;
                        zzdzoVar2 = zzdzoVar2;
                        zzhcpVar2 = zzhcpVar2;
                        zzfkqVar = zzfkqVar2;
                        zzdtkVar = zzdtkVar;
                        str3 = str3;
                        listenableFutureM6055a = listenableFutureM6055a;
                        listenableFutureSubmit = listenableFutureSubmit;
                        executor = executor3;
                        listenableFutureM7374h = zzhcj.f18518t;
                    }
                }
                listenableFutureM7374h = listenableFuture;
                zzfkqVar = zzfkqVar2;
            }
            zzdsvVar.m6048a(listenableFutureM7374h, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
            listenableFutureM6056b = zzdtkVar.m6056b(jSONObject.optJSONObject("secondary_image"), zzbmaVar.f9167t, zzdzc.NATIVE_ASSETS_LOADING_LOGO_START);
            zzdsvVar.m6048a(listenableFutureM6056b, zzdzc.NATIVE_ASSETS_LOADING_LOGO_END);
            listenableFutureM6056b2 = zzdtkVar.m6056b(jSONObject.optJSONObject("app_icon"), zzbmaVar.f9167t, zzdzc.NATIVE_ASSETS_LOADING_ICON_START);
            zzdsvVar.m6048a(listenableFutureM6056b2, zzdzc.NATIVE_ASSETS_LOADING_ICON_END);
            jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                listenableFutureM6058e = zzhcj.f18518t;
            } else {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
                if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
                }
                listenableFutureM6058e = zzdtkVar.m6058e("NativeAssetsLoader.loadAttributionInfo", jSONObjectOptJSONObject.optBoolean("require"), zzhcf.m7375i(zzdtkVar.m6055a(jSONArrayOptJSONArray, false, true, zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_START), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtc
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        zzdtk zzdtkVar2 = zzdtkVar;
                        zzdtkVar2.getClass();
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        JSONObject jSONObject2 = jSONObjectOptJSONObject;
                        String strOptString7 = jSONObject2.optString("text");
                        Integer numM6053c = zzdtk.m6053c(jSONObject2, "bg_color");
                        Integer numM6053c2 = zzdtk.m6053c(jSONObject2, "text_color");
                        int iOptInt3 = jSONObject2.optInt("text_size", -1);
                        jSONObject2.optBoolean("allow_pub_rendering");
                        int iOptInt4 = jSONObject2.optInt("animation_ms", 1000);
                        return new zzblt(strOptString7, list, numM6053c, numM6053c2, iOptInt3 > 0 ? Integer.valueOf(iOptInt3) : null, jSONObject2.optInt("presentation_ms", 4000) + iOptInt4, zzdtkVar2.f12887h.f9170w);
                    }
                }, executor));
            }
            listenableFuture2 = listenableFutureM6058e;
            zzdsvVar.m6048a(listenableFuture2, zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
            strArr = new String[]{"html_containers", "instream"};
            jSONObjectM3127k = com.google.android.gms.ads.internal.util.zzbp.m3127k(jSONObject, strArr);
            if (jSONObjectM3127k == null) {
                jSONObjectOptJSONObject3 = null;
            } else {
                jSONObjectOptJSONObject3 = jSONObjectM3127k.optJSONObject(strArr[1]);
            }
            str = "video";
            if (jSONObjectOptJSONObject3 == null) {
                jSONObjectOptJSONObject6 = jSONObject.optJSONObject("video");
                if (jSONObjectOptJSONObject6 == null) {
                    listenableFutureM6057d = zzhcj.f18518t;
                } else {
                    strOptString4 = jSONObjectOptJSONObject6.optString("vast_xml");
                    if (((Boolean) zzbivVar2.m5030a(zzbix.f8770tb)).booleanValue() || !jSONObjectOptJSONObject6.has(str3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (TextUtils.isEmpty(strOptString4) || z) {
                        if (z) {
                            listenableFutureM7374h3 = zzdtkVar.m6057d(jSONObjectOptJSONObject6, zzfknVar, zzfkqVar, zzbVar2, zzcdpVar);
                            listenableFutureM6056b2 = listenableFutureM6056b2;
                            listenableFutureM6056b = listenableFutureM6056b;
                        } else {
                            zzducVar = zzdtkVar.f12888i;
                            zzducVar.getClass();
                            if (((Boolean) zzbivVar2.m5030a(zzbix.f8277Q2)).booleanValue()) {
                                AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzducVar.f12965i, "native-assets-loading-video-start");
                            }
                            ListenableFuture listenableFuture9 = zzhcj.f18518t;
                            zzhbn zzhbnVar3 = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtx
                                @Override // com.google.android.gms.internal.ads.zzhbn
                                /* JADX INFO: renamed from: b */
                                public final ListenableFuture mo3248b(Object obj) throws zzclq {
                                    zzduc zzducVar2 = zzducVar;
                                    zzclb zzclbVarM6077a = zzducVar2.f12959c.m6077a(com.google.android.gms.ads.internal.client.zzr.m2981w(), null, null);
                                    final zzcgc zzcgcVar = new zzcgc(zzclbVarM6077a);
                                    zzducVar2.m6061a(zzclbVarM6077a, zzbVar2, zzcdpVar);
                                    zzclbVarM6077a.mo5582K().f10451z = new zzcmy() { // from class: com.google.android.gms.internal.ads.zzdty
                                        @Override // com.google.android.gms.internal.ads.zzcmy
                                        public final /* synthetic */ void zza() {
                                            zzcgcVar.m5396c();
                                        }
                                    };
                                    zzclbVarM6077a.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8092F4));
                                    return zzcgcVar;
                                }
                            };
                            Executor executor4 = zzducVar.f12958b;
                            listenableFutureM7374h3 = zzhcf.m7374h(zzhcf.m7374h(listenableFuture9, zzhbnVar3, executor4), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdub
                                @Override // com.google.android.gms.internal.ads.zzhbn
                                /* JADX INFO: renamed from: b */
                                public final ListenableFuture mo3248b(Object obj) {
                                    final zzclb zzclbVar = (zzclb) obj;
                                    final zzduc zzducVar2 = zzducVar;
                                    zzbsi zzbsiVar = zzducVar2.f12957a.f16038b;
                                    final zzcgc zzcgcVar = new zzcgc(zzclbVar);
                                    if (zzbsiVar != null) {
                                        zzclbVar.mo5602h0(new zzcnl(5, 0, 0));
                                    } else {
                                        zzclbVar.mo5602h0(new zzcnl(4, 0, 0));
                                    }
                                    zzclbVar.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdua
                                        @Override // com.google.android.gms.internal.ads.zzcmx
                                        /* JADX INFO: renamed from: a */
                                        public final void mo3001a(int i5, String str4, String str5, boolean z2) {
                                            zzduc zzducVar3 = zzducVar2;
                                            zzducVar3.getClass();
                                            zzflg zzflgVar = zzducVar3.f12957a;
                                            boolean zBooleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8228N4)).booleanValue();
                                            zzclb zzclbVar2 = zzclbVar;
                                            zzcgc zzcgcVar2 = zzcgcVar;
                                            if (!zBooleanValue2) {
                                                com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflgVar.f16037a;
                                                if (zzfwVar != null && zzclbVar2.zzh() != null) {
                                                    zzclbVar2.zzh().m5669l4(zzfwVar);
                                                }
                                                zzcgcVar2.m5396c();
                                                return;
                                            }
                                            if (z2) {
                                                com.google.android.gms.ads.internal.client.zzfw zzfwVar2 = zzflgVar.f16037a;
                                                if (zzfwVar2 != null && zzclbVar2.zzh() != null) {
                                                    zzclbVar2.zzh().m5669l4(zzfwVar2);
                                                }
                                                zzcgcVar2.m5396c();
                                                return;
                                            }
                                            int length2 = String.valueOf(i5).length();
                                            StringBuilder sb = new StringBuilder(length2 + 64 + String.valueOf(str4).length() + 15 + String.valueOf(str5).length());
                                            sb.append("Native Video WebView failed to load. Error code: ");
                                            sb.append(i5);
                                            sb.append(", Description: ");
                                            sb.append(str4);
                                            zzcgcVar2.m5398b(new zzepp(1, AbstractC0271e0.m403k(sb, ", Failing URL: ", str5)));
                                        }
                                    };
                                    zzclbVar.mo5131j(jSONObjectOptJSONObject6, "google.afma.nativeAds.renderVideo");
                                    return zzcgcVar;
                                }
                            }, executor4);
                        }
                        ListenableFuture listenableFutureM7373g = zzhcf.m7373g(listenableFutureM7374h3, ((Integer) zzbivVar2.m5030a(zzbix.f8109G4)).intValue(), TimeUnit.SECONDS, zzdtkVar.f12890k);
                        if (true != z) {
                            str2 = "NativeAssetsLoader.loadVideoView";
                        } else {
                            str2 = "NativeAssetsLoader.loadVideoHtml";
                        }
                        listenableFutureM6057d = zzdtkVar.m6058e(str2, false, listenableFutureM7373g);
                    } else {
                        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Required field 'vast_xml' or 'html' is missing");
                        listenableFutureM6057d = zzhcj.f18518t;
                    }
                }
                str = "video";
                zzcdpVar2 = zzcdpVar;
                zzdsvVar.m6048a(listenableFutureM6057d, zzdzc.NATIVE_ASSETS_LOADING_VIDEO_END);
                if (((Boolean) zzbivVar2.m5030a(zzbix.f8824we)).booleanValue() || !jSONObject.has(str)) {
                    zzdzoVar = zzdzoVar2;
                    listenableFutureM7367a = zzhcf.m7367a(new Bundle());
                } else {
                    JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject(str);
                    if (!jSONObjectOptJSONObject8.has("flags") || (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject8.optJSONArray("flags")) == null) {
                        zzdzoVar = zzdzoVar2;
                        listenableFutureM7367a = zzhcf.m7367a(new Bundle());
                    } else {
                        int i6 = 0;
                        while (true) {
                            if (i6 < jSONArrayOptJSONArray3.length()) {
                                JSONObject jSONObjectOptJSONObject9 = jSONArrayOptJSONArray3.optJSONObject(i6);
                                if (jSONObjectOptJSONObject9 == null || !jSONObjectOptJSONObject9.optString("key").equals("afma_video_player_type")) {
                                    i6++;
                                    zzdzoVar2 = zzdzoVar2;
                                } else {
                                    try {
                                        if (Integer.parseInt(jSONObjectOptJSONObject9.optString("value")) == 3) {
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
                                                zzdzoVar = zzdzoVar2;
                                                AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "native-assets-loading-media-start");
                                            } else {
                                                zzdzoVar = zzdzoVar2;
                                            }
                                            zzcgd zzcgdVar = new zzcgd();
                                            listenableFutureM6057d.addListener(new zzhcd(listenableFutureM6057d, new zzdsy(zzdtkVar, zzcgdVar)), zzcfy.f9951f);
                                            zzdsvVar.m6048a(zzcgdVar, zzdzc.NATIVE_ASSETS_LOADING_MEDIA_END);
                                            listenableFutureM7367a = zzcgdVar;
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            zzdzoVar = zzdzoVar2;
                            listenableFutureM7367a = zzhcf.m7367a(new Bundle());
                        }
                    }
                }
                listenableFuture3 = listenableFutureM7367a;
                zzdtpVar = zzdsvVar.f12848c;
                executor2 = zzdtpVar.f12923a;
                jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
                if (jSONArrayOptJSONArray2 == null) {
                    listenableFutureM7375i = zzhcf.m7367a(Collections.EMPTY_LIST);
                    listenableFuture4 = listenableFutureM6057d;
                    listenableFuture5 = listenableFuture3;
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdtpVar.f12925c, "native-assets-loading-custom-start");
                    }
                    arrayList = new ArrayList();
                    length = jSONArrayOptJSONArray2.length();
                    i3 = 0;
                    while (i3 < length) {
                        int i7 = length;
                        jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i3);
                        if (jSONObjectOptJSONObject4 == null) {
                            listenableFutureM7375i2 = zzhcj.f18518t;
                            jSONArray = jSONArrayOptJSONArray2;
                        } else {
                            jSONArray = jSONArrayOptJSONArray2;
                            strOptString = jSONObjectOptJSONObject4.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                            if (strOptString == null) {
                                listenableFutureM7375i2 = zzhcj.f18518t;
                            } else {
                                i4 = i3;
                                strOptString2 = jSONObjectOptJSONObject4.optString("type");
                                listenableFutureM6057d = listenableFutureM6057d;
                                if (TypedValues.Custom.S_STRING.equals(strOptString2)) {
                                    listenableFutureM7375i2 = zzhcf.m7367a(new zzdtm(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                    zzdtpVar = zzdtpVar;
                                } else if ("image".equals(strOptString2)) {
                                    zzdtk zzdtkVar2 = zzdtpVar.f12924b;
                                    zzdtpVar = zzdtpVar;
                                    listenableFutureM7375i2 = zzhcf.m7375i(zzdtkVar2.m6056b(jSONObjectOptJSONObject4.optJSONObject("image_value"), zzdtkVar2.f12887h.f9167t, null), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtn
                                        @Override // com.google.android.gms.internal.ads.zzgti
                                        public final /* synthetic */ Object apply(Object obj) {
                                            return new zzdtm(strOptString, (zzblw) obj);
                                        }
                                    }, executor2);
                                } else {
                                    zzdtpVar = zzdtpVar;
                                    listenableFutureM7375i2 = zzhcj.f18518t;
                                }
                            }
                            arrayList.add(listenableFutureM7375i2);
                            i3 = i4 + 1;
                            length = i7;
                            jSONArrayOptJSONArray2 = jSONArray;
                            listenableFutureM6057d = listenableFutureM6057d;
                            zzdtpVar = zzdtpVar;
                        }
                        i4 = i3;
                        arrayList.add(listenableFutureM7375i2);
                        i3 = i4 + 1;
                        length = i7;
                        jSONArrayOptJSONArray2 = jSONArray;
                        listenableFutureM6057d = listenableFutureM6057d;
                        zzdtpVar = zzdtpVar;
                    }
                    listenableFuture4 = listenableFutureM6057d;
                    listenableFutureM7375i = zzhcf.m7375i(zzhcf.m7376j(arrayList), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdto
                        @Override // com.google.android.gms.internal.ads.zzgti
                        public final /* synthetic */ Object apply(Object obj) {
                            ArrayList arrayList3 = new ArrayList();
                            for (zzdtm zzdtmVar : (List) obj) {
                                if (zzdtmVar != null) {
                                    arrayList3.add(zzdtmVar);
                                }
                            }
                            return arrayList3;
                        }
                    }, executor2);
                    listenableFuture5 = listenableFuture3;
                }
                zzdsvVar.m6048a(listenableFutureM7375i, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_END);
                if (jSONObject.optBoolean("enable_omid") || (jSONObjectOptJSONObject5 = jSONObject.optJSONObject("omid_settings")) == null) {
                    listenableFuture6 = zzhcj.f18518t;
                } else {
                    strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                    if (TextUtils.isEmpty(strOptString3)) {
                        listenableFuture6 = zzhcj.f18518t;
                    } else {
                        zzbioVar = zzbix.f8277Q2;
                        zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "native-assets-loading-omid-start");
                        }
                        listenableFutureM7374h2 = zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtd
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            /* JADX INFO: renamed from: b */
                            public final ListenableFuture mo3248b(Object obj) throws zzclq {
                                zzdtk zzdtkVar3 = zzdtkVar;
                                zzdtkVar3.getClass();
                                zzclr zzclrVar = com.google.android.gms.ads.internal.zzt.f3698C.f3704d;
                                Context context2 = zzdtkVar3.f12880a;
                                zzekz zzekzVar = zzdtkVar3.f12895p;
                                zzcnl zzcnlVar = new zzcnl(0, 0, 0);
                                zzbaw zzbawVar = zzdtkVar3.f12882c;
                                zzclb zzclbVarM5647a = zzclr.m5647a(context2, zzdtkVar3.f12883d, zzdtkVar3.f12884e, null, zzbawVar, zzdtkVar3.f12885f, null, zzcnlVar, zzdtkVar3.f12892m, zzekzVar, null, null, zzdtkVar3.f12896q, "native-omid", false, false);
                                final zzcgc zzcgcVar = new zzcgc(zzclbVarM5647a);
                                zzclbVarM5647a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdth
                                    @Override // com.google.android.gms.internal.ads.zzcmx
                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ void mo3001a(int i8, String str4, String str5, boolean z2) {
                                        zzcgcVar.m5396c();
                                    }
                                };
                                zzclbVarM5647a.loadData(Base64.encodeToString(strOptString3.getBytes(), 1), "text/html", "base64");
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8537ff)).booleanValue()) {
                                    zzcdu zzcduVar = zzcdpVar2;
                                    if (zzcduVar != null) {
                                        zzclbVarM5647a.mo5582K().f10434Q = zzcduVar;
                                    }
                                    zzclbVarM5647a.mo5582K().f10432O = zzbVar2;
                                }
                                return zzcgcVar;
                            }
                        }, zzcfy.f9951f);
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8294R2)).booleanValue()) {
                            zzcgb.m5394a(listenableFutureM7374h2, "NativeAssetsLoader.omidWebView", executor);
                        }
                        listenableFuture6 = listenableFutureM7374h2;
                    }
                }
                zzdsvVar.m6048a(listenableFuture6, zzdzc.NATIVE_ASSETS_LOADING_OMID_END);
                arrayList2 = new ArrayList();
                final ListenableFuture listenableFuture10 = listenableFutureSubmit;
                arrayList2.add(listenableFuture10);
                final ListenableFuture listenableFuture11 = listenableFutureM6055a;
                arrayList2.add(listenableFuture11);
                arrayList2.add(listenableFutureM7374h);
                final ListenableFuture listenableFuture12 = listenableFutureM6056b;
                arrayList2.add(listenableFuture12);
                final ListenableFuture listenableFuture13 = listenableFutureM6056b2;
                arrayList2.add(listenableFuture13);
                final ListenableFuture listenableFuture14 = listenableFuture2;
                arrayList2.add(listenableFuture14);
                final ListenableFuture listenableFuture15 = listenableFuture4;
                arrayList2.add(listenableFuture15);
                final ListenableFuture listenableFuture16 = listenableFuture5;
                arrayList2.add(listenableFuture16);
                arrayList2.add(listenableFutureM7375i);
                final ListenableFuture listenableFuture17 = listenableFutureM7374h;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue() || jSONObject.optInt("template_id") == 3) {
                    arrayList2.add(listenableFuture6);
                }
                final ListenableFuture listenableFuture18 = listenableFutureM7375i;
                final ListenableFuture listenableFuture19 = listenableFuture6;
                final ListenableFuture listenableFutureM7366a = new zzhce(zzgwt.m7220t(arrayList2), false).m7366a(zzhcpVar2, new Callable() { // from class: com.google.android.gms.internal.ads.zzdst
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        JSONArray jSONArrayOptJSONArray5;
                        zzgwt zzgwtVarM7220t;
                        JSONObject jSONObjectOptJSONObject10;
                        zzdsv zzdsvVar2 = zzdsvVar;
                        ListenableFuture listenableFuture20 = listenableFuture10;
                        ListenableFuture listenableFuture21 = listenableFuture11;
                        ListenableFuture listenableFuture22 = listenableFuture13;
                        ListenableFuture listenableFuture23 = listenableFuture12;
                        ListenableFuture listenableFuture24 = listenableFuture14;
                        JSONObject jSONObject2 = jSONObject;
                        ListenableFuture listenableFuture25 = listenableFuture15;
                        ListenableFuture listenableFuture26 = listenableFuture16;
                        ListenableFuture listenableFuture27 = listenableFuture17;
                        ListenableFuture listenableFuture28 = listenableFuture19;
                        ListenableFuture listenableFuture29 = listenableFuture18;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8192L2)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdsvVar2.f12849d, "rendering-native-assets-loading-end");
                        }
                        zzdqb zzdqbVar = (zzdqb) listenableFuture20.get();
                        List list = (List) listenableFuture21.get();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12614e = list;
                        }
                        zzbml zzbmlVar = (zzbml) listenableFuture22.get();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12628s = zzbmlVar;
                        }
                        zzbml zzbmlVar2 = (zzbml) listenableFuture23.get();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12629t = zzbmlVar2;
                        }
                        zzbme zzbmeVar = (zzbme) listenableFuture24.get();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12612c = zzbmeVar;
                        }
                        JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                        if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                            zzgzi zzgziVar = zzgwt.f18303t;
                            zzgwtVarM7220t = zzgyo.f18355w;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i8 = 0; i8 < jSONArrayOptJSONArray5.length(); i8++) {
                                com.google.android.gms.ads.internal.client.zzew zzewVarM6054f = zzdtk.m6054f(jSONArrayOptJSONArray5.optJSONObject(i8));
                                if (zzewVarM6054f != null) {
                                    arrayList3.add(zzewVarM6054f);
                                }
                            }
                            zzgwtVarM7220t = zzgwt.m7220t(arrayList3);
                        }
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12615f = zzgwtVarM7220t;
                        }
                        JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                        com.google.android.gms.ads.internal.client.zzew zzewVarM6054f2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : zzdtk.m6054f(jSONObjectOptJSONObject10);
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12616g = zzewVarM6054f2;
                        }
                        zzclb zzclbVar = (zzclb) listenableFuture25.get();
                        if (zzclbVar != null) {
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12618i = zzclbVar;
                            }
                            View viewMo5577H = zzclbVar.mo5577H();
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12624o = viewMo5577H;
                            }
                            zzcmh zzcmhVarZzh = zzclbVar.zzh();
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12611b = zzcmhVarZzh;
                            }
                        }
                        zzdqbVar.m6001d().putAll((Bundle) listenableFuture26.get());
                        zzclb zzclbVar2 = (zzclb) listenableFuture27.get();
                        if (zzclbVar2 != null) {
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12619j = zzclbVar2;
                            }
                            View viewMo5577H2 = zzclbVar2.mo5577H();
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12625p = viewMo5577H2;
                            }
                        }
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                            zzclb zzclbVar3 = (zzclb) listenableFuture28.get();
                            if (zzclbVar3 != null) {
                                synchronized (zzdqbVar) {
                                    zzdqbVar.f12620k = zzclbVar3;
                                }
                            }
                        } else {
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12622m = listenableFuture28;
                            }
                            zzcgd zzcgdVar2 = new zzcgd();
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12623n = zzcgdVar2;
                            }
                        }
                        for (zzdtm zzdtmVar : (List) listenableFuture29.get()) {
                            if (zzdtmVar.f12917a != 1) {
                                String str4 = zzdtmVar.f12918b;
                                zzblw zzblwVar = zzdtmVar.f12920d;
                                synchronized (zzdqbVar) {
                                    if (zzblwVar == null) {
                                        zzdqbVar.f12631v.remove(str4);
                                    } else {
                                        zzdqbVar.f12631v.put(str4, zzblwVar);
                                    }
                                }
                            } else {
                                zzdqbVar.m6009o(zzdtmVar.f12918b, zzdtmVar.f12919c);
                            }
                        }
                        return zzdqbVar;
                    }
                });
                final com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
                return new zzhce(zzgwt.m7221u(new ListenableFuture[]{listenableFutureM6531b, listenableFutureM7366a}), true).m7366a(this.f14394b, new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
                    /* JADX WARN: Code duplicated, block: B:47:0x01d9  */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzeom zzeomVar = this.f14383a;
                        ListenableFuture listenableFuture20 = listenableFutureM7366a;
                        ListenableFuture listenableFuture21 = listenableFutureM6531b;
                        zzfky zzfkyVar2 = zzfkyVar;
                        zzfkn zzfknVar2 = zzfknVar;
                        JSONObject jSONObject2 = jSONObject;
                        com.google.android.gms.ads.internal.zzb zzbVar4 = zzbVar3;
                        zzcdu zzcduVar = zzcdpVar2;
                        zzdqb zzdqbVar = (zzdqb) ((zzhay) listenableFuture20).get();
                        zzdvf zzdvfVar = (zzdvf) listenableFuture21.get();
                        zzbio zzbioVar3 = zzbix.f8209M2;
                        com.google.android.gms.ads.internal.client.zzba zzbaVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-webview-creation-end");
                        }
                        zzdqc zzdqcVarMo5727c = zzeomVar.f14393a.mo5727c(new zzcyq(zzfkyVar2, zzfknVar2, null), new zzdqm(zzdqbVar), new zzdox(jSONObject2, zzdvfVar, zzbVar4, zzcduVar));
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            zzdzo zzdzoVar3 = zzeomVar.f14398f;
                            zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                            zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-configure-webview-start");
                        }
                        zzcpq zzcpqVar = (zzcpq) zzdqcVarMo5727c;
                        zzimy zzimyVar = zzcpqVar.f11026e;
                        zzdox zzdoxVar = zzcpqVar.f11023b;
                        zzdqm zzdqmVar = zzcpqVar.f11022a;
                        zzdql zzdqlVar = zzcpqVar.f11024c.f10689a.f12434a;
                        zzinh.m8554a(zzdqlVar);
                        zzdqb zzdqbVar2 = zzdqmVar.f12661a;
                        zzinh.m8554a(zzdqbVar2);
                        zzdvf zzdvfVar2 = zzdoxVar.f12515b;
                        zzinh.m8554a(zzdvfVar2);
                        zzdus zzdusVar = new zzdus(zzdqlVar, zzdqbVar2, zzdvfVar2, zzimy.m8548b(zzimyVar));
                        if (zzdusVar.f13019a != null) {
                            zzdusVar.f13020b.m6069b("/nativeAdCustomClick", zzdusVar);
                        }
                        zzdva zzdvaVar = (zzdva) zzcpqVar.f11027f.zzb();
                        final zzdeg zzdegVar = zzdvaVar.f13038b;
                        zzdut zzdutVar = zzdvfVar.f13063a;
                        Objects.requireNonNull(zzdegVar);
                        com.google.android.gms.ads.internal.overlay.zzad zzadVar = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzduz
                            @Override // com.google.android.gms.ads.internal.overlay.zzad
                            public final /* synthetic */ void zzl() {
                                zzdegVar.m5907K0();
                            }
                        };
                        zzdcx zzdcxVar = zzdvaVar.f13037a;
                        zzdet zzdetVar = zzdvaVar.f13039c;
                        zzdfk zzdfkVar = zzdvaVar.f13040d;
                        zzdid zzdidVar = zzdvaVar.f13041e;
                        synchronized (zzdutVar) {
                            zzdutVar.f13022s = zzdcxVar;
                            zzdutVar.f13023t = zzdetVar;
                            zzdutVar.f13024u = zzdfkVar;
                            zzdutVar.f13025v = zzdidVar;
                            zzdutVar.f13026w = zzadVar;
                        }
                        zzfkn zzfknVar3 = zzdvaVar.f13042f;
                        zzfkq zzfkqVar3 = zzdvaVar.f13043g;
                        zzctq zzctqVar = zzdvaVar.f13044h;
                        synchronized (zzdvfVar) {
                            ListenableFuture listenableFuture22 = zzdvfVar.f13075m;
                            if (listenableFuture22 != null) {
                                zzduy zzduyVar = new zzduy(zzdvfVar, zzfknVar3, zzfkqVar3, zzctqVar);
                                Executor executor5 = zzdvfVar.f13067e;
                                ((zzhay) listenableFuture22).addListener(new zzhcd(listenableFuture22, zzduyVar), executor5);
                            }
                        }
                        final zzdtv zzdtvVar = (zzdtv) zzcpqVar.f11028g.zzb();
                        final zzclb zzclbVarM6005h = zzdqbVar.m6005h();
                        if (zzclbVarM6005h == null) {
                            zzdtvVar.getClass();
                        } else {
                            zzdla zzdlaVar = zzdtvVar.f12934c;
                            zzdlaVar.m5935K0(zzclbVarM6005h.mo5577H());
                            zzbex zzbexVar = new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtu
                                @Override // com.google.android.gms.internal.ads.zzbex
                                /* JADX INFO: renamed from: t */
                                public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                                    Rect rect = zzbewVar.f7701d;
                                    zzclbVarM6005h.mo5582K().m5639j(rect.left, rect.top);
                                }
                            };
                            Executor executor6 = zzdtvVar.f12932a;
                            zzdlaVar.m5924Y(zzbexVar, executor6);
                            zzdlaVar.m5924Y(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtr
                                @Override // com.google.android.gms.internal.ads.zzbex
                                /* JADX INFO: renamed from: t */
                                public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                                    HashMap map = new HashMap();
                                    map.put("isVisible", true != zzbewVar.f7707j ? "0" : "1");
                                    zzclbVarM6005h.mo5129b("onAdVisibilityChanged", map);
                                }
                            }, executor6);
                            zzcux zzcuxVar = zzdtvVar.f12933b;
                            zzdlaVar.m5924Y(zzcuxVar, executor6);
                            zzcuxVar.f11525s = zzclbVarM6005h;
                            zzclm zzclmVarMo5582K = zzclbVarM6005h.mo5582K();
                            if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8014Ab)).booleanValue() && zzclmVarMo5582K != null) {
                                zzctq zzctqVar2 = zzdtvVar.f12935d;
                                zzclmVarMo5582K.m5634c("/click");
                                zzdlg zzdlgVar = zzclmVarMo5582K.f10420C;
                                zzbpx zzbpxVar = zzbpw.f9221a;
                                zzclmVarMo5582K.m5633b("/click", new zzbpr(zzdlgVar, zzctqVar2));
                                zzclmVarMo5582K.m5645x(zzctqVar2, null, null);
                            }
                            zzclbVarM6005h.mo5616v0("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdts
                                @Override // com.google.android.gms.internal.ads.zzbpx
                                /* JADX INFO: renamed from: a */
                                public final void mo5095a(Object obj, Map map) {
                                    zzcux zzcuxVar2 = zzdtvVar.f12933b;
                                    zzcuxVar2.f11529w = true;
                                    zzcuxVar2.m5842a();
                                }
                            });
                            zzclbVarM6005h.mo5616v0("/untrackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdtt
                                @Override // com.google.android.gms.internal.ads.zzbpx
                                /* JADX INFO: renamed from: a */
                                public final void mo5095a(Object obj, Map map) {
                                    zzdtvVar.f12933b.f11529w = false;
                                }
                            });
                            zzclbVarM6005h.mo5582K().f10436S = zzdtvVar.f12936e;
                        }
                        zzdvk zzdvkVar = (zzdvk) zzcpqVar.f11029h.zzb();
                        zzdvl zzdvlVar = zzeomVar.f14397e;
                        zzclb zzclbVarM6006i = zzdqbVar.m6006i();
                        zzdvkVar.getClass();
                        zzdvi zzdviVar = zzdvlVar.f13105a;
                        final zzdeg zzdegVar2 = zzdvkVar.f13096b;
                        Objects.requireNonNull(zzdegVar2);
                        com.google.android.gms.ads.internal.overlay.zzad zzadVar2 = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvj
                            @Override // com.google.android.gms.ads.internal.overlay.zzad
                            public final /* synthetic */ void zzl() {
                                zzdegVar2.m5907K0();
                            }
                        };
                        zzdcx zzdcxVar2 = zzdvkVar.f13095a;
                        zzdet zzdetVar2 = zzdvkVar.f13097c;
                        zzdfk zzdfkVar2 = zzdvkVar.f13098d;
                        zzdid zzdidVar2 = zzdvkVar.f13099e;
                        zzdle zzdleVar = zzdvkVar.f13100f;
                        synchronized (zzdviVar) {
                            synchronized (zzdviVar) {
                                zzdviVar.f13022s = zzdcxVar2;
                                zzdviVar.f13023t = zzdetVar2;
                                zzdviVar.f13024u = zzdfkVar2;
                                zzdviVar.f13025v = zzdidVar2;
                                zzdviVar.f13026w = zzadVar2;
                            }
                            if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue() && zzclbVarM6006i != null && zzclbVarM6006i.mo5582K() != null) {
                                zzclm zzclmVarMo5582K2 = zzclbVarM6006i.mo5582K();
                                zzctq zzctqVar3 = zzdvkVar.f13104j;
                                zzeko zzekoVar = zzdvkVar.f13103i;
                                zzclmVarMo5582K2.m5644v(zzctqVar3, zzekoVar, zzdvkVar.f13102h);
                                zzclmVarMo5582K2.m5645x(zzctqVar3, zzekoVar, zzdvkVar.f13101g);
                            }
                            if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                                AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                            }
                            return zzdqcVarMo5727c.mo5761g();
                        }
                        zzdviVar.f13093x = zzdleVar;
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue()) {
                            zzclm zzclmVarMo5582K3 = zzclbVarM6006i.mo5582K();
                            zzctq zzctqVar4 = zzdvkVar.f13104j;
                            zzeko zzekoVar2 = zzdvkVar.f13103i;
                            zzclmVarMo5582K3.m5644v(zzctqVar4, zzekoVar2, zzdvkVar.f13102h);
                            zzclmVarMo5582K3.m5645x(zzctqVar4, zzekoVar2, zzdvkVar.f13101g);
                        }
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                        }
                        return zzdqcVarMo5727c.mo5761g();
                    }
                });
            }
            listenableFutureM6056b = listenableFutureM6056b;
            listenableFuture2 = listenableFuture2;
            listenableFutureM6056b2 = listenableFutureM6056b2;
            str = "video";
            listenableFutureM6057d = zzdtkVar.m6057d(jSONObjectOptJSONObject3, zzfknVar, zzfkqVar, zzbVar2, zzcdpVar);
            zzbVar2 = zzbVar2;
            zzcdpVar2 = zzcdpVar;
            zzdsvVar.m6048a(listenableFutureM6057d, zzdzc.NATIVE_ASSETS_LOADING_VIDEO_END);
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8824we)).booleanValue()) {
                zzdzoVar = zzdzoVar2;
                listenableFutureM7367a = zzhcf.m7367a(new Bundle());
            } else {
                zzdzoVar = zzdzoVar2;
                listenableFutureM7367a = zzhcf.m7367a(new Bundle());
            }
            listenableFuture3 = listenableFutureM7367a;
            zzdtpVar = zzdsvVar.f12848c;
            executor2 = zzdtpVar.f12923a;
            jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
            if (jSONArrayOptJSONArray2 == null) {
                listenableFutureM7375i = zzhcf.m7367a(Collections.EMPTY_LIST);
                listenableFuture4 = listenableFutureM6057d;
                listenableFuture5 = listenableFuture3;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdtpVar.f12925c, "native-assets-loading-custom-start");
                }
                arrayList = new ArrayList();
                length = jSONArrayOptJSONArray2.length();
                i3 = 0;
                while (i3 < length) {
                    int i8 = length;
                    jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i3);
                    if (jSONObjectOptJSONObject4 == null) {
                        listenableFutureM7375i2 = zzhcj.f18518t;
                        jSONArray = jSONArrayOptJSONArray2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        strOptString = jSONObjectOptJSONObject4.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                        if (strOptString == null) {
                            listenableFutureM7375i2 = zzhcj.f18518t;
                        } else {
                            i4 = i3;
                            strOptString2 = jSONObjectOptJSONObject4.optString("type");
                            listenableFutureM6057d = listenableFutureM6057d;
                            if (TypedValues.Custom.S_STRING.equals(strOptString2)) {
                                listenableFutureM7375i2 = zzhcf.m7367a(new zzdtm(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                zzdtpVar = zzdtpVar;
                            } else if ("image".equals(strOptString2)) {
                                zzdtk zzdtkVar3 = zzdtpVar.f12924b;
                                zzdtpVar = zzdtpVar;
                                listenableFutureM7375i2 = zzhcf.m7375i(zzdtkVar3.m6056b(jSONObjectOptJSONObject4.optJSONObject("image_value"), zzdtkVar3.f12887h.f9167t, null), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtn
                                    @Override // com.google.android.gms.internal.ads.zzgti
                                    public final /* synthetic */ Object apply(Object obj) {
                                        return new zzdtm(strOptString, (zzblw) obj);
                                    }
                                }, executor2);
                            } else {
                                zzdtpVar = zzdtpVar;
                                listenableFutureM7375i2 = zzhcj.f18518t;
                            }
                        }
                        arrayList.add(listenableFutureM7375i2);
                        i3 = i4 + 1;
                        length = i8;
                        jSONArrayOptJSONArray2 = jSONArray;
                        listenableFutureM6057d = listenableFutureM6057d;
                        zzdtpVar = zzdtpVar;
                    }
                    i4 = i3;
                    arrayList.add(listenableFutureM7375i2);
                    i3 = i4 + 1;
                    length = i8;
                    jSONArrayOptJSONArray2 = jSONArray;
                    listenableFutureM6057d = listenableFutureM6057d;
                    zzdtpVar = zzdtpVar;
                }
                listenableFuture4 = listenableFutureM6057d;
                listenableFutureM7375i = zzhcf.m7375i(zzhcf.m7376j(arrayList), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdto
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        ArrayList arrayList3 = new ArrayList();
                        for (zzdtm zzdtmVar : (List) obj) {
                            if (zzdtmVar != null) {
                                arrayList3.add(zzdtmVar);
                            }
                        }
                        return arrayList3;
                    }
                }, executor2);
                listenableFuture5 = listenableFuture3;
            }
            zzdsvVar.m6048a(listenableFutureM7375i, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_END);
            if (jSONObject.optBoolean("enable_omid")) {
                listenableFuture6 = zzhcj.f18518t;
            } else {
                strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                if (TextUtils.isEmpty(strOptString3)) {
                    listenableFuture6 = zzhcj.f18518t;
                } else {
                    zzbioVar = zzbix.f8277Q2;
                    zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "native-assets-loading-omid-start");
                    }
                    listenableFutureM7374h2 = zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtd
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj) throws zzclq {
                            zzdtk zzdtkVar4 = zzdtkVar;
                            zzdtkVar4.getClass();
                            zzclr zzclrVar = com.google.android.gms.ads.internal.zzt.f3698C.f3704d;
                            Context context2 = zzdtkVar4.f12880a;
                            zzekz zzekzVar = zzdtkVar4.f12895p;
                            zzcnl zzcnlVar = new zzcnl(0, 0, 0);
                            zzbaw zzbawVar = zzdtkVar4.f12882c;
                            zzclb zzclbVarM5647a = zzclr.m5647a(context2, zzdtkVar4.f12883d, zzdtkVar4.f12884e, null, zzbawVar, zzdtkVar4.f12885f, null, zzcnlVar, zzdtkVar4.f12892m, zzekzVar, null, null, zzdtkVar4.f12896q, "native-omid", false, false);
                            final zzcgc zzcgcVar = new zzcgc(zzclbVarM5647a);
                            zzclbVarM5647a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdth
                                @Override // com.google.android.gms.internal.ads.zzcmx
                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ void mo3001a(int i9, String str4, String str5, boolean z2) {
                                    zzcgcVar.m5396c();
                                }
                            };
                            zzclbVarM5647a.loadData(Base64.encodeToString(strOptString3.getBytes(), 1), "text/html", "base64");
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8537ff)).booleanValue()) {
                                zzcdu zzcduVar = zzcdpVar2;
                                if (zzcduVar != null) {
                                    zzclbVarM5647a.mo5582K().f10434Q = zzcduVar;
                                }
                                zzclbVarM5647a.mo5582K().f10432O = zzbVar2;
                            }
                            return zzcgcVar;
                        }
                    }, zzcfy.f9951f);
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8294R2)).booleanValue()) {
                        zzcgb.m5394a(listenableFutureM7374h2, "NativeAssetsLoader.omidWebView", executor);
                    }
                    listenableFuture6 = listenableFutureM7374h2;
                }
            }
            zzdsvVar.m6048a(listenableFuture6, zzdzc.NATIVE_ASSETS_LOADING_OMID_END);
            arrayList2 = new ArrayList();
            final ListenableFuture listenableFuture110 = listenableFutureSubmit;
            arrayList2.add(listenableFuture110);
            final ListenableFuture listenableFuture111 = listenableFutureM6055a;
            arrayList2.add(listenableFuture111);
            arrayList2.add(listenableFutureM7374h);
            final ListenableFuture listenableFuture112 = listenableFutureM6056b;
            arrayList2.add(listenableFuture112);
            final ListenableFuture listenableFuture113 = listenableFutureM6056b2;
            arrayList2.add(listenableFuture113);
            final ListenableFuture listenableFuture114 = listenableFuture2;
            arrayList2.add(listenableFuture114);
            final ListenableFuture listenableFuture115 = listenableFuture4;
            arrayList2.add(listenableFuture115);
            final ListenableFuture listenableFuture116 = listenableFuture5;
            arrayList2.add(listenableFuture116);
            arrayList2.add(listenableFutureM7375i);
            final ListenableFuture listenableFuture117 = listenableFutureM7374h;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue()) {
                arrayList2.add(listenableFuture6);
            } else {
                arrayList2.add(listenableFuture6);
            }
            final ListenableFuture listenableFuture118 = listenableFutureM7375i;
            final ListenableFuture listenableFuture119 = listenableFuture6;
            final ListenableFuture listenableFutureM7366a2 = new zzhce(zzgwt.m7220t(arrayList2), false).m7366a(zzhcpVar2, new Callable() { // from class: com.google.android.gms.internal.ads.zzdst
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONArray jSONArrayOptJSONArray5;
                    zzgwt zzgwtVarM7220t;
                    JSONObject jSONObjectOptJSONObject10;
                    zzdsv zzdsvVar2 = zzdsvVar;
                    ListenableFuture listenableFuture20 = listenableFuture110;
                    ListenableFuture listenableFuture21 = listenableFuture111;
                    ListenableFuture listenableFuture22 = listenableFuture113;
                    ListenableFuture listenableFuture23 = listenableFuture112;
                    ListenableFuture listenableFuture24 = listenableFuture114;
                    JSONObject jSONObject2 = jSONObject;
                    ListenableFuture listenableFuture25 = listenableFuture115;
                    ListenableFuture listenableFuture26 = listenableFuture116;
                    ListenableFuture listenableFuture27 = listenableFuture117;
                    ListenableFuture listenableFuture28 = listenableFuture119;
                    ListenableFuture listenableFuture29 = listenableFuture118;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8192L2)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdsvVar2.f12849d, "rendering-native-assets-loading-end");
                    }
                    zzdqb zzdqbVar = (zzdqb) listenableFuture20.get();
                    List list = (List) listenableFuture21.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12614e = list;
                    }
                    zzbml zzbmlVar = (zzbml) listenableFuture22.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12628s = zzbmlVar;
                    }
                    zzbml zzbmlVar2 = (zzbml) listenableFuture23.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12629t = zzbmlVar2;
                    }
                    zzbme zzbmeVar = (zzbme) listenableFuture24.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12612c = zzbmeVar;
                    }
                    JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                    if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                        zzgzi zzgziVar = zzgwt.f18303t;
                        zzgwtVarM7220t = zzgyo.f18355w;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i9 = 0; i9 < jSONArrayOptJSONArray5.length(); i9++) {
                            com.google.android.gms.ads.internal.client.zzew zzewVarM6054f = zzdtk.m6054f(jSONArrayOptJSONArray5.optJSONObject(i9));
                            if (zzewVarM6054f != null) {
                                arrayList3.add(zzewVarM6054f);
                            }
                        }
                        zzgwtVarM7220t = zzgwt.m7220t(arrayList3);
                    }
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12615f = zzgwtVarM7220t;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                    com.google.android.gms.ads.internal.client.zzew zzewVarM6054f2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : zzdtk.m6054f(jSONObjectOptJSONObject10);
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12616g = zzewVarM6054f2;
                    }
                    zzclb zzclbVar = (zzclb) listenableFuture25.get();
                    if (zzclbVar != null) {
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12618i = zzclbVar;
                        }
                        View viewMo5577H = zzclbVar.mo5577H();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12624o = viewMo5577H;
                        }
                        zzcmh zzcmhVarZzh = zzclbVar.zzh();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12611b = zzcmhVarZzh;
                        }
                    }
                    zzdqbVar.m6001d().putAll((Bundle) listenableFuture26.get());
                    zzclb zzclbVar2 = (zzclb) listenableFuture27.get();
                    if (zzclbVar2 != null) {
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12619j = zzclbVar2;
                        }
                        View viewMo5577H2 = zzclbVar2.mo5577H();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12625p = viewMo5577H2;
                        }
                    }
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        zzclb zzclbVar3 = (zzclb) listenableFuture28.get();
                        if (zzclbVar3 != null) {
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12620k = zzclbVar3;
                            }
                        }
                    } else {
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12622m = listenableFuture28;
                        }
                        zzcgd zzcgdVar2 = new zzcgd();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12623n = zzcgdVar2;
                        }
                    }
                    for (zzdtm zzdtmVar : (List) listenableFuture29.get()) {
                        if (zzdtmVar.f12917a != 1) {
                            String str4 = zzdtmVar.f12918b;
                            zzblw zzblwVar = zzdtmVar.f12920d;
                            synchronized (zzdqbVar) {
                                if (zzblwVar == null) {
                                    zzdqbVar.f12631v.remove(str4);
                                } else {
                                    zzdqbVar.f12631v.put(str4, zzblwVar);
                                }
                            }
                        } else {
                            zzdqbVar.m6009o(zzdtmVar.f12918b, zzdtmVar.f12919c);
                        }
                    }
                    return zzdqbVar;
                }
            });
            final com.google.android.gms.ads.internal.zzb zzbVar4 = zzbVar2;
            return new zzhce(zzgwt.m7221u(new ListenableFuture[]{listenableFutureM6531b, listenableFutureM7366a2}), true).m7366a(this.f14394b, new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
                /* JADX WARN: Code duplicated, block: B:47:0x01d9  */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzeom zzeomVar = this.f14383a;
                    ListenableFuture listenableFuture20 = listenableFutureM7366a2;
                    ListenableFuture listenableFuture21 = listenableFutureM6531b;
                    zzfky zzfkyVar2 = zzfkyVar;
                    zzfkn zzfknVar2 = zzfknVar;
                    JSONObject jSONObject2 = jSONObject;
                    com.google.android.gms.ads.internal.zzb zzbVar5 = zzbVar4;
                    zzcdu zzcduVar = zzcdpVar2;
                    zzdqb zzdqbVar = (zzdqb) ((zzhay) listenableFuture20).get();
                    zzdvf zzdvfVar = (zzdvf) listenableFuture21.get();
                    zzbio zzbioVar3 = zzbix.f8209M2;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-webview-creation-end");
                    }
                    zzdqc zzdqcVarMo5727c = zzeomVar.f14393a.mo5727c(new zzcyq(zzfkyVar2, zzfknVar2, null), new zzdqm(zzdqbVar), new zzdox(jSONObject2, zzdvfVar, zzbVar5, zzcduVar));
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        zzdzo zzdzoVar3 = zzeomVar.f14398f;
                        zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                        zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-configure-webview-start");
                    }
                    zzcpq zzcpqVar = (zzcpq) zzdqcVarMo5727c;
                    zzimy zzimyVar = zzcpqVar.f11026e;
                    zzdox zzdoxVar = zzcpqVar.f11023b;
                    zzdqm zzdqmVar = zzcpqVar.f11022a;
                    zzdql zzdqlVar = zzcpqVar.f11024c.f10689a.f12434a;
                    zzinh.m8554a(zzdqlVar);
                    zzdqb zzdqbVar2 = zzdqmVar.f12661a;
                    zzinh.m8554a(zzdqbVar2);
                    zzdvf zzdvfVar2 = zzdoxVar.f12515b;
                    zzinh.m8554a(zzdvfVar2);
                    zzdus zzdusVar = new zzdus(zzdqlVar, zzdqbVar2, zzdvfVar2, zzimy.m8548b(zzimyVar));
                    if (zzdusVar.f13019a != null) {
                        zzdusVar.f13020b.m6069b("/nativeAdCustomClick", zzdusVar);
                    }
                    zzdva zzdvaVar = (zzdva) zzcpqVar.f11027f.zzb();
                    final zzdeg zzdegVar = zzdvaVar.f13038b;
                    zzdut zzdutVar = zzdvfVar.f13063a;
                    Objects.requireNonNull(zzdegVar);
                    com.google.android.gms.ads.internal.overlay.zzad zzadVar = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzduz
                        @Override // com.google.android.gms.ads.internal.overlay.zzad
                        public final /* synthetic */ void zzl() {
                            zzdegVar.m5907K0();
                        }
                    };
                    zzdcx zzdcxVar = zzdvaVar.f13037a;
                    zzdet zzdetVar = zzdvaVar.f13039c;
                    zzdfk zzdfkVar = zzdvaVar.f13040d;
                    zzdid zzdidVar = zzdvaVar.f13041e;
                    synchronized (zzdutVar) {
                        zzdutVar.f13022s = zzdcxVar;
                        zzdutVar.f13023t = zzdetVar;
                        zzdutVar.f13024u = zzdfkVar;
                        zzdutVar.f13025v = zzdidVar;
                        zzdutVar.f13026w = zzadVar;
                    }
                    zzfkn zzfknVar3 = zzdvaVar.f13042f;
                    zzfkq zzfkqVar3 = zzdvaVar.f13043g;
                    zzctq zzctqVar = zzdvaVar.f13044h;
                    synchronized (zzdvfVar) {
                        ListenableFuture listenableFuture22 = zzdvfVar.f13075m;
                        if (listenableFuture22 != null) {
                            zzduy zzduyVar = new zzduy(zzdvfVar, zzfknVar3, zzfkqVar3, zzctqVar);
                            Executor executor5 = zzdvfVar.f13067e;
                            ((zzhay) listenableFuture22).addListener(new zzhcd(listenableFuture22, zzduyVar), executor5);
                        }
                    }
                    final zzdtv zzdtvVar = (zzdtv) zzcpqVar.f11028g.zzb();
                    final zzclb zzclbVarM6005h = zzdqbVar.m6005h();
                    if (zzclbVarM6005h == null) {
                        zzdtvVar.getClass();
                    } else {
                        zzdla zzdlaVar = zzdtvVar.f12934c;
                        zzdlaVar.m5935K0(zzclbVarM6005h.mo5577H());
                        zzbex zzbexVar = new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtu
                            @Override // com.google.android.gms.internal.ads.zzbex
                            /* JADX INFO: renamed from: t */
                            public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                                Rect rect = zzbewVar.f7701d;
                                zzclbVarM6005h.mo5582K().m5639j(rect.left, rect.top);
                            }
                        };
                        Executor executor6 = zzdtvVar.f12932a;
                        zzdlaVar.m5924Y(zzbexVar, executor6);
                        zzdlaVar.m5924Y(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtr
                            @Override // com.google.android.gms.internal.ads.zzbex
                            /* JADX INFO: renamed from: t */
                            public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                                HashMap map = new HashMap();
                                map.put("isVisible", true != zzbewVar.f7707j ? "0" : "1");
                                zzclbVarM6005h.mo5129b("onAdVisibilityChanged", map);
                            }
                        }, executor6);
                        zzcux zzcuxVar = zzdtvVar.f12933b;
                        zzdlaVar.m5924Y(zzcuxVar, executor6);
                        zzcuxVar.f11525s = zzclbVarM6005h;
                        zzclm zzclmVarMo5582K = zzclbVarM6005h.mo5582K();
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8014Ab)).booleanValue() && zzclmVarMo5582K != null) {
                            zzctq zzctqVar2 = zzdtvVar.f12935d;
                            zzclmVarMo5582K.m5634c("/click");
                            zzdlg zzdlgVar = zzclmVarMo5582K.f10420C;
                            zzbpx zzbpxVar = zzbpw.f9221a;
                            zzclmVarMo5582K.m5633b("/click", new zzbpr(zzdlgVar, zzctqVar2));
                            zzclmVarMo5582K.m5645x(zzctqVar2, null, null);
                        }
                        zzclbVarM6005h.mo5616v0("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdts
                            @Override // com.google.android.gms.internal.ads.zzbpx
                            /* JADX INFO: renamed from: a */
                            public final void mo5095a(Object obj, Map map) {
                                zzcux zzcuxVar2 = zzdtvVar.f12933b;
                                zzcuxVar2.f11529w = true;
                                zzcuxVar2.m5842a();
                            }
                        });
                        zzclbVarM6005h.mo5616v0("/untrackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdtt
                            @Override // com.google.android.gms.internal.ads.zzbpx
                            /* JADX INFO: renamed from: a */
                            public final void mo5095a(Object obj, Map map) {
                                zzdtvVar.f12933b.f11529w = false;
                            }
                        });
                        zzclbVarM6005h.mo5582K().f10436S = zzdtvVar.f12936e;
                    }
                    zzdvk zzdvkVar = (zzdvk) zzcpqVar.f11029h.zzb();
                    zzdvl zzdvlVar = zzeomVar.f14397e;
                    zzclb zzclbVarM6006i = zzdqbVar.m6006i();
                    zzdvkVar.getClass();
                    zzdvi zzdviVar = zzdvlVar.f13105a;
                    final zzdeg zzdegVar2 = zzdvkVar.f13096b;
                    Objects.requireNonNull(zzdegVar2);
                    com.google.android.gms.ads.internal.overlay.zzad zzadVar2 = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvj
                        @Override // com.google.android.gms.ads.internal.overlay.zzad
                        public final /* synthetic */ void zzl() {
                            zzdegVar2.m5907K0();
                        }
                    };
                    zzdcx zzdcxVar2 = zzdvkVar.f13095a;
                    zzdet zzdetVar2 = zzdvkVar.f13097c;
                    zzdfk zzdfkVar2 = zzdvkVar.f13098d;
                    zzdid zzdidVar2 = zzdvkVar.f13099e;
                    zzdle zzdleVar = zzdvkVar.f13100f;
                    synchronized (zzdviVar) {
                        synchronized (zzdviVar) {
                            zzdviVar.f13022s = zzdcxVar2;
                            zzdviVar.f13023t = zzdetVar2;
                            zzdviVar.f13024u = zzdfkVar2;
                            zzdviVar.f13025v = zzdidVar2;
                            zzdviVar.f13026w = zzadVar2;
                        }
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue() && zzclbVarM6006i != null && zzclbVarM6006i.mo5582K() != null) {
                            zzclm zzclmVarMo5582K3 = zzclbVarM6006i.mo5582K();
                            zzctq zzctqVar4 = zzdvkVar.f13104j;
                            zzeko zzekoVar2 = zzdvkVar.f13103i;
                            zzclmVarMo5582K3.m5644v(zzctqVar4, zzekoVar2, zzdvkVar.f13102h);
                            zzclmVarMo5582K3.m5645x(zzctqVar4, zzekoVar2, zzdvkVar.f13101g);
                        }
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                        }
                        return zzdqcVarMo5727c.mo5761g();
                    }
                    zzdviVar.f13093x = zzdleVar;
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue()) {
                        zzclm zzclmVarMo5582K4 = zzclbVarM6006i.mo5582K();
                        zzctq zzctqVar5 = zzdvkVar.f13104j;
                        zzeko zzekoVar3 = zzdvkVar.f13103i;
                        zzclmVarMo5582K4.m5644v(zzctqVar5, zzekoVar3, zzdvkVar.f13102h);
                        zzclmVarMo5582K4.m5645x(zzctqVar5, zzekoVar3, zzdvkVar.f13101g);
                    }
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                    }
                    return zzdqcVarMo5727c.mo5761g();
                }
            });
        }
        zzfkqVar = zzfkqVar2;
        listenableFutureM7374h = zzhcj.f18518t;
        executor = executor3;
        zzdsvVar.m6048a(listenableFutureM7374h, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        listenableFutureM6056b = zzdtkVar.m6056b(jSONObject.optJSONObject("secondary_image"), zzbmaVar.f9167t, zzdzc.NATIVE_ASSETS_LOADING_LOGO_START);
        zzdsvVar.m6048a(listenableFutureM6056b, zzdzc.NATIVE_ASSETS_LOADING_LOGO_END);
        listenableFutureM6056b2 = zzdtkVar.m6056b(jSONObject.optJSONObject("app_icon"), zzbmaVar.f9167t, zzdzc.NATIVE_ASSETS_LOADING_ICON_START);
        zzdsvVar.m6048a(listenableFutureM6056b2, zzdzc.NATIVE_ASSETS_LOADING_ICON_END);
        jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            listenableFutureM6058e = zzhcj.f18518t;
        } else {
            jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
            }
            listenableFutureM6058e = zzdtkVar.m6058e("NativeAssetsLoader.loadAttributionInfo", jSONObjectOptJSONObject.optBoolean("require"), zzhcf.m7375i(zzdtkVar.m6055a(jSONArrayOptJSONArray, false, true, zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_START), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtc
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    zzdtk zzdtkVar4 = zzdtkVar;
                    zzdtkVar4.getClass();
                    if (list == null || list.isEmpty()) {
                        return null;
                    }
                    JSONObject jSONObject2 = jSONObjectOptJSONObject;
                    String strOptString7 = jSONObject2.optString("text");
                    Integer numM6053c = zzdtk.m6053c(jSONObject2, "bg_color");
                    Integer numM6053c2 = zzdtk.m6053c(jSONObject2, "text_color");
                    int iOptInt3 = jSONObject2.optInt("text_size", -1);
                    jSONObject2.optBoolean("allow_pub_rendering");
                    int iOptInt4 = jSONObject2.optInt("animation_ms", 1000);
                    return new zzblt(strOptString7, list, numM6053c, numM6053c2, iOptInt3 > 0 ? Integer.valueOf(iOptInt3) : null, jSONObject2.optInt("presentation_ms", 4000) + iOptInt4, zzdtkVar4.f12887h.f9170w);
                }
            }, executor));
        }
        listenableFuture2 = listenableFutureM6058e;
        zzdsvVar.m6048a(listenableFuture2, zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        strArr = new String[]{"html_containers", "instream"};
        jSONObjectM3127k = com.google.android.gms.ads.internal.util.zzbp.m3127k(jSONObject, strArr);
        if (jSONObjectM3127k == null) {
            jSONObjectOptJSONObject3 = null;
        } else {
            jSONObjectOptJSONObject3 = jSONObjectM3127k.optJSONObject(strArr[1]);
        }
        str = "video";
        if (jSONObjectOptJSONObject3 == null) {
            jSONObjectOptJSONObject6 = jSONObject.optJSONObject("video");
            if (jSONObjectOptJSONObject6 == null) {
                listenableFutureM6057d = zzhcj.f18518t;
            } else {
                strOptString4 = jSONObjectOptJSONObject6.optString("vast_xml");
                if (((Boolean) zzbivVar2.m5030a(zzbix.f8770tb)).booleanValue()) {
                    z = false;
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(strOptString4)) {
                }
                if (z) {
                    listenableFutureM7374h3 = zzdtkVar.m6057d(jSONObjectOptJSONObject6, zzfknVar, zzfkqVar, zzbVar2, zzcdpVar);
                    listenableFutureM6056b2 = listenableFutureM6056b2;
                    listenableFutureM6056b = listenableFutureM6056b;
                } else {
                    zzducVar = zzdtkVar.f12888i;
                    zzducVar.getClass();
                    if (((Boolean) zzbivVar2.m5030a(zzbix.f8277Q2)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzducVar.f12965i, "native-assets-loading-video-start");
                    }
                    ListenableFuture listenableFuture20 = zzhcj.f18518t;
                    zzhbn zzhbnVar4 = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtx
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj) throws zzclq {
                            zzduc zzducVar2 = zzducVar;
                            zzclb zzclbVarM6077a = zzducVar2.f12959c.m6077a(com.google.android.gms.ads.internal.client.zzr.m2981w(), null, null);
                            final zzcgc zzcgcVar = new zzcgc(zzclbVarM6077a);
                            zzducVar2.m6061a(zzclbVarM6077a, zzbVar2, zzcdpVar);
                            zzclbVarM6077a.mo5582K().f10451z = new zzcmy() { // from class: com.google.android.gms.internal.ads.zzdty
                                @Override // com.google.android.gms.internal.ads.zzcmy
                                public final /* synthetic */ void zza() {
                                    zzcgcVar.m5396c();
                                }
                            };
                            zzclbVarM6077a.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8092F4));
                            return zzcgcVar;
                        }
                    };
                    Executor executor5 = zzducVar.f12958b;
                    listenableFutureM7374h3 = zzhcf.m7374h(zzhcf.m7374h(listenableFuture20, zzhbnVar4, executor5), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdub
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj) {
                            final zzclb zzclbVar = (zzclb) obj;
                            final zzduc zzducVar2 = zzducVar;
                            zzbsi zzbsiVar = zzducVar2.f12957a.f16038b;
                            final zzcgc zzcgcVar = new zzcgc(zzclbVar);
                            if (zzbsiVar != null) {
                                zzclbVar.mo5602h0(new zzcnl(5, 0, 0));
                            } else {
                                zzclbVar.mo5602h0(new zzcnl(4, 0, 0));
                            }
                            zzclbVar.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdua
                                @Override // com.google.android.gms.internal.ads.zzcmx
                                /* JADX INFO: renamed from: a */
                                public final void mo3001a(int i9, String str4, String str5, boolean z2) {
                                    zzduc zzducVar3 = zzducVar2;
                                    zzducVar3.getClass();
                                    zzflg zzflgVar = zzducVar3.f12957a;
                                    boolean zBooleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8228N4)).booleanValue();
                                    zzclb zzclbVar2 = zzclbVar;
                                    zzcgc zzcgcVar2 = zzcgcVar;
                                    if (!zBooleanValue2) {
                                        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflgVar.f16037a;
                                        if (zzfwVar != null && zzclbVar2.zzh() != null) {
                                            zzclbVar2.zzh().m5669l4(zzfwVar);
                                        }
                                        zzcgcVar2.m5396c();
                                        return;
                                    }
                                    if (z2) {
                                        com.google.android.gms.ads.internal.client.zzfw zzfwVar2 = zzflgVar.f16037a;
                                        if (zzfwVar2 != null && zzclbVar2.zzh() != null) {
                                            zzclbVar2.zzh().m5669l4(zzfwVar2);
                                        }
                                        zzcgcVar2.m5396c();
                                        return;
                                    }
                                    int length2 = String.valueOf(i9).length();
                                    StringBuilder sb = new StringBuilder(length2 + 64 + String.valueOf(str4).length() + 15 + String.valueOf(str5).length());
                                    sb.append("Native Video WebView failed to load. Error code: ");
                                    sb.append(i9);
                                    sb.append(", Description: ");
                                    sb.append(str4);
                                    zzcgcVar2.m5398b(new zzepp(1, AbstractC0271e0.m403k(sb, ", Failing URL: ", str5)));
                                }
                            };
                            zzclbVar.mo5131j(jSONObjectOptJSONObject6, "google.afma.nativeAds.renderVideo");
                            return zzcgcVar;
                        }
                    }, executor5);
                }
                ListenableFuture listenableFutureM7373g2 = zzhcf.m7373g(listenableFutureM7374h3, ((Integer) zzbivVar2.m5030a(zzbix.f8109G4)).intValue(), TimeUnit.SECONDS, zzdtkVar.f12890k);
                if (true != z) {
                    str2 = "NativeAssetsLoader.loadVideoView";
                } else {
                    str2 = "NativeAssetsLoader.loadVideoHtml";
                }
                listenableFutureM6057d = zzdtkVar.m6058e(str2, false, listenableFutureM7373g2);
            }
            str = "video";
            zzcdpVar2 = zzcdpVar;
            zzdsvVar.m6048a(listenableFutureM6057d, zzdzc.NATIVE_ASSETS_LOADING_VIDEO_END);
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8824we)).booleanValue()) {
                zzdzoVar = zzdzoVar2;
                listenableFutureM7367a = zzhcf.m7367a(new Bundle());
            } else {
                zzdzoVar = zzdzoVar2;
                listenableFutureM7367a = zzhcf.m7367a(new Bundle());
            }
            listenableFuture3 = listenableFutureM7367a;
            zzdtpVar = zzdsvVar.f12848c;
            executor2 = zzdtpVar.f12923a;
            jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
            if (jSONArrayOptJSONArray2 == null) {
                listenableFutureM7375i = zzhcf.m7367a(Collections.EMPTY_LIST);
                listenableFuture4 = listenableFutureM6057d;
                listenableFuture5 = listenableFuture3;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdtpVar.f12925c, "native-assets-loading-custom-start");
                }
                arrayList = new ArrayList();
                length = jSONArrayOptJSONArray2.length();
                i3 = 0;
                while (i3 < length) {
                    int i9 = length;
                    jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i3);
                    if (jSONObjectOptJSONObject4 == null) {
                        listenableFutureM7375i2 = zzhcj.f18518t;
                        jSONArray = jSONArrayOptJSONArray2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        strOptString = jSONObjectOptJSONObject4.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                        if (strOptString == null) {
                            listenableFutureM7375i2 = zzhcj.f18518t;
                        } else {
                            i4 = i3;
                            strOptString2 = jSONObjectOptJSONObject4.optString("type");
                            listenableFutureM6057d = listenableFutureM6057d;
                            if (TypedValues.Custom.S_STRING.equals(strOptString2)) {
                                listenableFutureM7375i2 = zzhcf.m7367a(new zzdtm(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                                zzdtpVar = zzdtpVar;
                            } else if ("image".equals(strOptString2)) {
                                zzdtk zzdtkVar4 = zzdtpVar.f12924b;
                                zzdtpVar = zzdtpVar;
                                listenableFutureM7375i2 = zzhcf.m7375i(zzdtkVar4.m6056b(jSONObjectOptJSONObject4.optJSONObject("image_value"), zzdtkVar4.f12887h.f9167t, null), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtn
                                    @Override // com.google.android.gms.internal.ads.zzgti
                                    public final /* synthetic */ Object apply(Object obj) {
                                        return new zzdtm(strOptString, (zzblw) obj);
                                    }
                                }, executor2);
                            } else {
                                zzdtpVar = zzdtpVar;
                                listenableFutureM7375i2 = zzhcj.f18518t;
                            }
                        }
                        arrayList.add(listenableFutureM7375i2);
                        i3 = i4 + 1;
                        length = i9;
                        jSONArrayOptJSONArray2 = jSONArray;
                        listenableFutureM6057d = listenableFutureM6057d;
                        zzdtpVar = zzdtpVar;
                    }
                    i4 = i3;
                    arrayList.add(listenableFutureM7375i2);
                    i3 = i4 + 1;
                    length = i9;
                    jSONArrayOptJSONArray2 = jSONArray;
                    listenableFutureM6057d = listenableFutureM6057d;
                    zzdtpVar = zzdtpVar;
                }
                listenableFuture4 = listenableFutureM6057d;
                listenableFutureM7375i = zzhcf.m7375i(zzhcf.m7376j(arrayList), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdto
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        ArrayList arrayList3 = new ArrayList();
                        for (zzdtm zzdtmVar : (List) obj) {
                            if (zzdtmVar != null) {
                                arrayList3.add(zzdtmVar);
                            }
                        }
                        return arrayList3;
                    }
                }, executor2);
                listenableFuture5 = listenableFuture3;
            }
            zzdsvVar.m6048a(listenableFutureM7375i, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_END);
            if (jSONObject.optBoolean("enable_omid")) {
                listenableFuture6 = zzhcj.f18518t;
            } else {
                strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
                if (TextUtils.isEmpty(strOptString3)) {
                    listenableFuture6 = zzhcj.f18518t;
                } else {
                    zzbioVar = zzbix.f8277Q2;
                    zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "native-assets-loading-omid-start");
                    }
                    listenableFutureM7374h2 = zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtd
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        /* JADX INFO: renamed from: b */
                        public final ListenableFuture mo3248b(Object obj) throws zzclq {
                            zzdtk zzdtkVar5 = zzdtkVar;
                            zzdtkVar5.getClass();
                            zzclr zzclrVar = com.google.android.gms.ads.internal.zzt.f3698C.f3704d;
                            Context context2 = zzdtkVar5.f12880a;
                            zzekz zzekzVar = zzdtkVar5.f12895p;
                            zzcnl zzcnlVar = new zzcnl(0, 0, 0);
                            zzbaw zzbawVar = zzdtkVar5.f12882c;
                            zzclb zzclbVarM5647a = zzclr.m5647a(context2, zzdtkVar5.f12883d, zzdtkVar5.f12884e, null, zzbawVar, zzdtkVar5.f12885f, null, zzcnlVar, zzdtkVar5.f12892m, zzekzVar, null, null, zzdtkVar5.f12896q, "native-omid", false, false);
                            final zzcgc zzcgcVar = new zzcgc(zzclbVarM5647a);
                            zzclbVarM5647a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdth
                                @Override // com.google.android.gms.internal.ads.zzcmx
                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ void mo3001a(int i10, String str4, String str5, boolean z2) {
                                    zzcgcVar.m5396c();
                                }
                            };
                            zzclbVarM5647a.loadData(Base64.encodeToString(strOptString3.getBytes(), 1), "text/html", "base64");
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8537ff)).booleanValue()) {
                                zzcdu zzcduVar = zzcdpVar2;
                                if (zzcduVar != null) {
                                    zzclbVarM5647a.mo5582K().f10434Q = zzcduVar;
                                }
                                zzclbVarM5647a.mo5582K().f10432O = zzbVar2;
                            }
                            return zzcgcVar;
                        }
                    }, zzcfy.f9951f);
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8294R2)).booleanValue()) {
                        zzcgb.m5394a(listenableFutureM7374h2, "NativeAssetsLoader.omidWebView", executor);
                    }
                    listenableFuture6 = listenableFutureM7374h2;
                }
            }
            zzdsvVar.m6048a(listenableFuture6, zzdzc.NATIVE_ASSETS_LOADING_OMID_END);
            arrayList2 = new ArrayList();
            final ListenableFuture listenableFuture1110 = listenableFutureSubmit;
            arrayList2.add(listenableFuture1110);
            final ListenableFuture listenableFuture1111 = listenableFutureM6055a;
            arrayList2.add(listenableFuture1111);
            arrayList2.add(listenableFutureM7374h);
            final ListenableFuture listenableFuture1112 = listenableFutureM6056b;
            arrayList2.add(listenableFuture1112);
            final ListenableFuture listenableFuture1113 = listenableFutureM6056b2;
            arrayList2.add(listenableFuture1113);
            final ListenableFuture listenableFuture1114 = listenableFuture2;
            arrayList2.add(listenableFuture1114);
            final ListenableFuture listenableFuture1115 = listenableFuture4;
            arrayList2.add(listenableFuture1115);
            final ListenableFuture listenableFuture1116 = listenableFuture5;
            arrayList2.add(listenableFuture1116);
            arrayList2.add(listenableFutureM7375i);
            final ListenableFuture listenableFuture1117 = listenableFutureM7374h;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue()) {
                arrayList2.add(listenableFuture6);
            } else {
                arrayList2.add(listenableFuture6);
            }
            final ListenableFuture listenableFuture1118 = listenableFutureM7375i;
            final ListenableFuture listenableFuture1119 = listenableFuture6;
            final ListenableFuture listenableFutureM7366a3 = new zzhce(zzgwt.m7220t(arrayList2), false).m7366a(zzhcpVar2, new Callable() { // from class: com.google.android.gms.internal.ads.zzdst
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONArray jSONArrayOptJSONArray5;
                    zzgwt zzgwtVarM7220t;
                    JSONObject jSONObjectOptJSONObject10;
                    zzdsv zzdsvVar2 = zzdsvVar;
                    ListenableFuture listenableFuture21 = listenableFuture1110;
                    ListenableFuture listenableFuture22 = listenableFuture1111;
                    ListenableFuture listenableFuture23 = listenableFuture1113;
                    ListenableFuture listenableFuture24 = listenableFuture1112;
                    ListenableFuture listenableFuture25 = listenableFuture1114;
                    JSONObject jSONObject2 = jSONObject;
                    ListenableFuture listenableFuture26 = listenableFuture1115;
                    ListenableFuture listenableFuture27 = listenableFuture1116;
                    ListenableFuture listenableFuture28 = listenableFuture1117;
                    ListenableFuture listenableFuture29 = listenableFuture1119;
                    ListenableFuture listenableFuture210 = listenableFuture1118;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8192L2)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdsvVar2.f12849d, "rendering-native-assets-loading-end");
                    }
                    zzdqb zzdqbVar = (zzdqb) listenableFuture21.get();
                    List list = (List) listenableFuture22.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12614e = list;
                    }
                    zzbml zzbmlVar = (zzbml) listenableFuture23.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12628s = zzbmlVar;
                    }
                    zzbml zzbmlVar2 = (zzbml) listenableFuture24.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12629t = zzbmlVar2;
                    }
                    zzbme zzbmeVar = (zzbme) listenableFuture25.get();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12612c = zzbmeVar;
                    }
                    JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                    if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                        zzgzi zzgziVar = zzgwt.f18303t;
                        zzgwtVarM7220t = zzgyo.f18355w;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray5.length(); i10++) {
                            com.google.android.gms.ads.internal.client.zzew zzewVarM6054f = zzdtk.m6054f(jSONArrayOptJSONArray5.optJSONObject(i10));
                            if (zzewVarM6054f != null) {
                                arrayList3.add(zzewVarM6054f);
                            }
                        }
                        zzgwtVarM7220t = zzgwt.m7220t(arrayList3);
                    }
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12615f = zzgwtVarM7220t;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                    com.google.android.gms.ads.internal.client.zzew zzewVarM6054f2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : zzdtk.m6054f(jSONObjectOptJSONObject10);
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12616g = zzewVarM6054f2;
                    }
                    zzclb zzclbVar = (zzclb) listenableFuture26.get();
                    if (zzclbVar != null) {
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12618i = zzclbVar;
                        }
                        View viewMo5577H = zzclbVar.mo5577H();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12624o = viewMo5577H;
                        }
                        zzcmh zzcmhVarZzh = zzclbVar.zzh();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12611b = zzcmhVarZzh;
                        }
                    }
                    zzdqbVar.m6001d().putAll((Bundle) listenableFuture27.get());
                    zzclb zzclbVar2 = (zzclb) listenableFuture28.get();
                    if (zzclbVar2 != null) {
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12619j = zzclbVar2;
                        }
                        View viewMo5577H2 = zzclbVar2.mo5577H();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12625p = viewMo5577H2;
                        }
                    }
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        zzclb zzclbVar3 = (zzclb) listenableFuture29.get();
                        if (zzclbVar3 != null) {
                            synchronized (zzdqbVar) {
                                zzdqbVar.f12620k = zzclbVar3;
                            }
                        }
                    } else {
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12622m = listenableFuture29;
                        }
                        zzcgd zzcgdVar2 = new zzcgd();
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12623n = zzcgdVar2;
                        }
                    }
                    for (zzdtm zzdtmVar : (List) listenableFuture210.get()) {
                        if (zzdtmVar.f12917a != 1) {
                            String str4 = zzdtmVar.f12918b;
                            zzblw zzblwVar = zzdtmVar.f12920d;
                            synchronized (zzdqbVar) {
                                if (zzblwVar == null) {
                                    zzdqbVar.f12631v.remove(str4);
                                } else {
                                    zzdqbVar.f12631v.put(str4, zzblwVar);
                                }
                            }
                        } else {
                            zzdqbVar.m6009o(zzdtmVar.f12918b, zzdtmVar.f12919c);
                        }
                    }
                    return zzdqbVar;
                }
            });
            final com.google.android.gms.ads.internal.zzb zzbVar5 = zzbVar2;
            return new zzhce(zzgwt.m7221u(new ListenableFuture[]{listenableFutureM6531b, listenableFutureM7366a3}), true).m7366a(this.f14394b, new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
                /* JADX WARN: Code duplicated, block: B:47:0x01d9  */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzeom zzeomVar = this.f14383a;
                    ListenableFuture listenableFuture21 = listenableFutureM7366a3;
                    ListenableFuture listenableFuture22 = listenableFutureM6531b;
                    zzfky zzfkyVar2 = zzfkyVar;
                    zzfkn zzfknVar2 = zzfknVar;
                    JSONObject jSONObject2 = jSONObject;
                    com.google.android.gms.ads.internal.zzb zzbVar6 = zzbVar5;
                    zzcdu zzcduVar = zzcdpVar2;
                    zzdqb zzdqbVar = (zzdqb) ((zzhay) listenableFuture21).get();
                    zzdvf zzdvfVar = (zzdvf) listenableFuture22.get();
                    zzbio zzbioVar3 = zzbix.f8209M2;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-webview-creation-end");
                    }
                    zzdqc zzdqcVarMo5727c = zzeomVar.f14393a.mo5727c(new zzcyq(zzfkyVar2, zzfknVar2, null), new zzdqm(zzdqbVar), new zzdox(jSONObject2, zzdvfVar, zzbVar6, zzcduVar));
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        zzdzo zzdzoVar3 = zzeomVar.f14398f;
                        zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                        zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-configure-webview-start");
                    }
                    zzcpq zzcpqVar = (zzcpq) zzdqcVarMo5727c;
                    zzimy zzimyVar = zzcpqVar.f11026e;
                    zzdox zzdoxVar = zzcpqVar.f11023b;
                    zzdqm zzdqmVar = zzcpqVar.f11022a;
                    zzdql zzdqlVar = zzcpqVar.f11024c.f10689a.f12434a;
                    zzinh.m8554a(zzdqlVar);
                    zzdqb zzdqbVar2 = zzdqmVar.f12661a;
                    zzinh.m8554a(zzdqbVar2);
                    zzdvf zzdvfVar2 = zzdoxVar.f12515b;
                    zzinh.m8554a(zzdvfVar2);
                    zzdus zzdusVar = new zzdus(zzdqlVar, zzdqbVar2, zzdvfVar2, zzimy.m8548b(zzimyVar));
                    if (zzdusVar.f13019a != null) {
                        zzdusVar.f13020b.m6069b("/nativeAdCustomClick", zzdusVar);
                    }
                    zzdva zzdvaVar = (zzdva) zzcpqVar.f11027f.zzb();
                    final zzdeg zzdegVar = zzdvaVar.f13038b;
                    zzdut zzdutVar = zzdvfVar.f13063a;
                    Objects.requireNonNull(zzdegVar);
                    com.google.android.gms.ads.internal.overlay.zzad zzadVar = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzduz
                        @Override // com.google.android.gms.ads.internal.overlay.zzad
                        public final /* synthetic */ void zzl() {
                            zzdegVar.m5907K0();
                        }
                    };
                    zzdcx zzdcxVar = zzdvaVar.f13037a;
                    zzdet zzdetVar = zzdvaVar.f13039c;
                    zzdfk zzdfkVar = zzdvaVar.f13040d;
                    zzdid zzdidVar = zzdvaVar.f13041e;
                    synchronized (zzdutVar) {
                        zzdutVar.f13022s = zzdcxVar;
                        zzdutVar.f13023t = zzdetVar;
                        zzdutVar.f13024u = zzdfkVar;
                        zzdutVar.f13025v = zzdidVar;
                        zzdutVar.f13026w = zzadVar;
                    }
                    zzfkn zzfknVar3 = zzdvaVar.f13042f;
                    zzfkq zzfkqVar3 = zzdvaVar.f13043g;
                    zzctq zzctqVar = zzdvaVar.f13044h;
                    synchronized (zzdvfVar) {
                        ListenableFuture listenableFuture23 = zzdvfVar.f13075m;
                        if (listenableFuture23 != null) {
                            zzduy zzduyVar = new zzduy(zzdvfVar, zzfknVar3, zzfkqVar3, zzctqVar);
                            Executor executor6 = zzdvfVar.f13067e;
                            ((zzhay) listenableFuture23).addListener(new zzhcd(listenableFuture23, zzduyVar), executor6);
                        }
                    }
                    final zzdtv zzdtvVar = (zzdtv) zzcpqVar.f11028g.zzb();
                    final zzclb zzclbVarM6005h = zzdqbVar.m6005h();
                    if (zzclbVarM6005h == null) {
                        zzdtvVar.getClass();
                    } else {
                        zzdla zzdlaVar = zzdtvVar.f12934c;
                        zzdlaVar.m5935K0(zzclbVarM6005h.mo5577H());
                        zzbex zzbexVar = new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtu
                            @Override // com.google.android.gms.internal.ads.zzbex
                            /* JADX INFO: renamed from: t */
                            public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                                Rect rect = zzbewVar.f7701d;
                                zzclbVarM6005h.mo5582K().m5639j(rect.left, rect.top);
                            }
                        };
                        Executor executor7 = zzdtvVar.f12932a;
                        zzdlaVar.m5924Y(zzbexVar, executor7);
                        zzdlaVar.m5924Y(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtr
                            @Override // com.google.android.gms.internal.ads.zzbex
                            /* JADX INFO: renamed from: t */
                            public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                                HashMap map = new HashMap();
                                map.put("isVisible", true != zzbewVar.f7707j ? "0" : "1");
                                zzclbVarM6005h.mo5129b("onAdVisibilityChanged", map);
                            }
                        }, executor7);
                        zzcux zzcuxVar = zzdtvVar.f12933b;
                        zzdlaVar.m5924Y(zzcuxVar, executor7);
                        zzcuxVar.f11525s = zzclbVarM6005h;
                        zzclm zzclmVarMo5582K = zzclbVarM6005h.mo5582K();
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8014Ab)).booleanValue() && zzclmVarMo5582K != null) {
                            zzctq zzctqVar2 = zzdtvVar.f12935d;
                            zzclmVarMo5582K.m5634c("/click");
                            zzdlg zzdlgVar = zzclmVarMo5582K.f10420C;
                            zzbpx zzbpxVar = zzbpw.f9221a;
                            zzclmVarMo5582K.m5633b("/click", new zzbpr(zzdlgVar, zzctqVar2));
                            zzclmVarMo5582K.m5645x(zzctqVar2, null, null);
                        }
                        zzclbVarM6005h.mo5616v0("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdts
                            @Override // com.google.android.gms.internal.ads.zzbpx
                            /* JADX INFO: renamed from: a */
                            public final void mo5095a(Object obj, Map map) {
                                zzcux zzcuxVar2 = zzdtvVar.f12933b;
                                zzcuxVar2.f11529w = true;
                                zzcuxVar2.m5842a();
                            }
                        });
                        zzclbVarM6005h.mo5616v0("/untrackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdtt
                            @Override // com.google.android.gms.internal.ads.zzbpx
                            /* JADX INFO: renamed from: a */
                            public final void mo5095a(Object obj, Map map) {
                                zzdtvVar.f12933b.f11529w = false;
                            }
                        });
                        zzclbVarM6005h.mo5582K().f10436S = zzdtvVar.f12936e;
                    }
                    zzdvk zzdvkVar = (zzdvk) zzcpqVar.f11029h.zzb();
                    zzdvl zzdvlVar = zzeomVar.f14397e;
                    zzclb zzclbVarM6006i = zzdqbVar.m6006i();
                    zzdvkVar.getClass();
                    zzdvi zzdviVar = zzdvlVar.f13105a;
                    final zzdeg zzdegVar2 = zzdvkVar.f13096b;
                    Objects.requireNonNull(zzdegVar2);
                    com.google.android.gms.ads.internal.overlay.zzad zzadVar2 = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvj
                        @Override // com.google.android.gms.ads.internal.overlay.zzad
                        public final /* synthetic */ void zzl() {
                            zzdegVar2.m5907K0();
                        }
                    };
                    zzdcx zzdcxVar2 = zzdvkVar.f13095a;
                    zzdet zzdetVar2 = zzdvkVar.f13097c;
                    zzdfk zzdfkVar2 = zzdvkVar.f13098d;
                    zzdid zzdidVar2 = zzdvkVar.f13099e;
                    zzdle zzdleVar = zzdvkVar.f13100f;
                    synchronized (zzdviVar) {
                        synchronized (zzdviVar) {
                            zzdviVar.f13022s = zzdcxVar2;
                            zzdviVar.f13023t = zzdetVar2;
                            zzdviVar.f13024u = zzdfkVar2;
                            zzdviVar.f13025v = zzdidVar2;
                            zzdviVar.f13026w = zzadVar2;
                        }
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue() && zzclbVarM6006i != null && zzclbVarM6006i.mo5582K() != null) {
                            zzclm zzclmVarMo5582K4 = zzclbVarM6006i.mo5582K();
                            zzctq zzctqVar5 = zzdvkVar.f13104j;
                            zzeko zzekoVar3 = zzdvkVar.f13103i;
                            zzclmVarMo5582K4.m5644v(zzctqVar5, zzekoVar3, zzdvkVar.f13102h);
                            zzclmVarMo5582K4.m5645x(zzctqVar5, zzekoVar3, zzdvkVar.f13101g);
                        }
                        if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                            AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                        }
                        return zzdqcVarMo5727c.mo5761g();
                    }
                    zzdviVar.f13093x = zzdleVar;
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue()) {
                        zzclm zzclmVarMo5582K5 = zzclbVarM6006i.mo5582K();
                        zzctq zzctqVar6 = zzdvkVar.f13104j;
                        zzeko zzekoVar4 = zzdvkVar.f13103i;
                        zzclmVarMo5582K5.m5644v(zzctqVar6, zzekoVar4, zzdvkVar.f13102h);
                        zzclmVarMo5582K5.m5645x(zzctqVar6, zzekoVar4, zzdvkVar.f13101g);
                    }
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                    }
                    return zzdqcVarMo5727c.mo5761g();
                }
            });
        }
        listenableFutureM6056b = listenableFutureM6056b;
        listenableFuture2 = listenableFuture2;
        listenableFutureM6056b2 = listenableFutureM6056b2;
        str = "video";
        listenableFutureM6057d = zzdtkVar.m6057d(jSONObjectOptJSONObject3, zzfknVar, zzfkqVar, zzbVar2, zzcdpVar);
        zzbVar2 = zzbVar2;
        zzcdpVar2 = zzcdpVar;
        zzdsvVar.m6048a(listenableFutureM6057d, zzdzc.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8824we)).booleanValue()) {
            zzdzoVar = zzdzoVar2;
            listenableFutureM7367a = zzhcf.m7367a(new Bundle());
        } else {
            zzdzoVar = zzdzoVar2;
            listenableFutureM7367a = zzhcf.m7367a(new Bundle());
        }
        listenableFuture3 = listenableFutureM7367a;
        zzdtpVar = zzdsvVar.f12848c;
        executor2 = zzdtpVar.f12923a;
        jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray2 == null) {
            listenableFutureM7375i = zzhcf.m7367a(Collections.EMPTY_LIST);
            listenableFuture4 = listenableFutureM6057d;
            listenableFuture5 = listenableFuture3;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8277Q2)).booleanValue()) {
                AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdtpVar.f12925c, "native-assets-loading-custom-start");
            }
            arrayList = new ArrayList();
            length = jSONArrayOptJSONArray2.length();
            i3 = 0;
            while (i3 < length) {
                int i10 = length;
                jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i3);
                if (jSONObjectOptJSONObject4 == null) {
                    listenableFutureM7375i2 = zzhcj.f18518t;
                    jSONArray = jSONArrayOptJSONArray2;
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    strOptString = jSONObjectOptJSONObject4.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (strOptString == null) {
                        listenableFutureM7375i2 = zzhcj.f18518t;
                    } else {
                        i4 = i3;
                        strOptString2 = jSONObjectOptJSONObject4.optString("type");
                        listenableFutureM6057d = listenableFutureM6057d;
                        if (TypedValues.Custom.S_STRING.equals(strOptString2)) {
                            listenableFutureM7375i2 = zzhcf.m7367a(new zzdtm(strOptString, jSONObjectOptJSONObject4.optString("string_value")));
                            zzdtpVar = zzdtpVar;
                        } else if ("image".equals(strOptString2)) {
                            zzdtk zzdtkVar5 = zzdtpVar.f12924b;
                            zzdtpVar = zzdtpVar;
                            listenableFutureM7375i2 = zzhcf.m7375i(zzdtkVar5.m6056b(jSONObjectOptJSONObject4.optJSONObject("image_value"), zzdtkVar5.f12887h.f9167t, null), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtn
                                @Override // com.google.android.gms.internal.ads.zzgti
                                public final /* synthetic */ Object apply(Object obj) {
                                    return new zzdtm(strOptString, (zzblw) obj);
                                }
                            }, executor2);
                        } else {
                            zzdtpVar = zzdtpVar;
                            listenableFutureM7375i2 = zzhcj.f18518t;
                        }
                    }
                    arrayList.add(listenableFutureM7375i2);
                    i3 = i4 + 1;
                    length = i10;
                    jSONArrayOptJSONArray2 = jSONArray;
                    listenableFutureM6057d = listenableFutureM6057d;
                    zzdtpVar = zzdtpVar;
                }
                i4 = i3;
                arrayList.add(listenableFutureM7375i2);
                i3 = i4 + 1;
                length = i10;
                jSONArrayOptJSONArray2 = jSONArray;
                listenableFutureM6057d = listenableFutureM6057d;
                zzdtpVar = zzdtpVar;
            }
            listenableFuture4 = listenableFutureM6057d;
            listenableFutureM7375i = zzhcf.m7375i(zzhcf.m7376j(arrayList), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdto
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    ArrayList arrayList3 = new ArrayList();
                    for (zzdtm zzdtmVar : (List) obj) {
                        if (zzdtmVar != null) {
                            arrayList3.add(zzdtmVar);
                        }
                    }
                    return arrayList3;
                }
            }, executor2);
            listenableFuture5 = listenableFuture3;
        }
        zzdsvVar.m6048a(listenableFutureM7375i, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_END);
        if (jSONObject.optBoolean("enable_omid")) {
            listenableFuture6 = zzhcj.f18518t;
        } else {
            strOptString3 = jSONObjectOptJSONObject5.optString("omid_html");
            if (TextUtils.isEmpty(strOptString3)) {
                listenableFuture6 = zzhcj.f18518t;
            } else {
                zzbioVar = zzbix.f8277Q2;
                zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdzoVar, "native-assets-loading-omid-start");
                }
                listenableFutureM7374h2 = zzhcf.m7374h(zzhcj.f18518t, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtd
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final ListenableFuture mo3248b(Object obj) throws zzclq {
                        zzdtk zzdtkVar6 = zzdtkVar;
                        zzdtkVar6.getClass();
                        zzclr zzclrVar = com.google.android.gms.ads.internal.zzt.f3698C.f3704d;
                        Context context2 = zzdtkVar6.f12880a;
                        zzekz zzekzVar = zzdtkVar6.f12895p;
                        zzcnl zzcnlVar = new zzcnl(0, 0, 0);
                        zzbaw zzbawVar = zzdtkVar6.f12882c;
                        zzclb zzclbVarM5647a = zzclr.m5647a(context2, zzdtkVar6.f12883d, zzdtkVar6.f12884e, null, zzbawVar, zzdtkVar6.f12885f, null, zzcnlVar, zzdtkVar6.f12892m, zzekzVar, null, null, zzdtkVar6.f12896q, "native-omid", false, false);
                        final zzcgc zzcgcVar = new zzcgc(zzclbVarM5647a);
                        zzclbVarM5647a.mo5582K().f10450y = new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdth
                            @Override // com.google.android.gms.internal.ads.zzcmx
                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ void mo3001a(int i11, String str4, String str5, boolean z2) {
                                zzcgcVar.m5396c();
                            }
                        };
                        zzclbVarM5647a.loadData(Base64.encodeToString(strOptString3.getBytes(), 1), "text/html", "base64");
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8537ff)).booleanValue()) {
                            zzcdu zzcduVar = zzcdpVar2;
                            if (zzcduVar != null) {
                                zzclbVarM5647a.mo5582K().f10434Q = zzcduVar;
                            }
                            zzclbVarM5647a.mo5582K().f10432O = zzbVar2;
                        }
                        return zzcgcVar;
                    }
                }, zzcfy.f9951f);
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8294R2)).booleanValue()) {
                    zzcgb.m5394a(listenableFutureM7374h2, "NativeAssetsLoader.omidWebView", executor);
                }
                listenableFuture6 = listenableFutureM7374h2;
            }
        }
        zzdsvVar.m6048a(listenableFuture6, zzdzc.NATIVE_ASSETS_LOADING_OMID_END);
        arrayList2 = new ArrayList();
        final ListenableFuture listenableFuture11110 = listenableFutureSubmit;
        arrayList2.add(listenableFuture11110);
        final ListenableFuture listenableFuture11111 = listenableFutureM6055a;
        arrayList2.add(listenableFuture11111);
        arrayList2.add(listenableFutureM7374h);
        final ListenableFuture listenableFuture11112 = listenableFutureM6056b;
        arrayList2.add(listenableFuture11112);
        final ListenableFuture listenableFuture11113 = listenableFutureM6056b2;
        arrayList2.add(listenableFuture11113);
        final ListenableFuture listenableFuture11114 = listenableFuture2;
        arrayList2.add(listenableFuture11114);
        final ListenableFuture listenableFuture11115 = listenableFuture4;
        arrayList2.add(listenableFuture11115);
        final ListenableFuture listenableFuture11116 = listenableFuture5;
        arrayList2.add(listenableFuture11116);
        arrayList2.add(listenableFutureM7375i);
        final ListenableFuture listenableFuture11117 = listenableFutureM7374h;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue()) {
            arrayList2.add(listenableFuture6);
        } else {
            arrayList2.add(listenableFuture6);
        }
        final ListenableFuture listenableFuture11118 = listenableFutureM7375i;
        final ListenableFuture listenableFuture11119 = listenableFuture6;
        final ListenableFuture listenableFutureM7366a4 = new zzhce(zzgwt.m7220t(arrayList2), false).m7366a(zzhcpVar2, new Callable() { // from class: com.google.android.gms.internal.ads.zzdst
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArrayOptJSONArray5;
                zzgwt zzgwtVarM7220t;
                JSONObject jSONObjectOptJSONObject10;
                zzdsv zzdsvVar2 = zzdsvVar;
                ListenableFuture listenableFuture21 = listenableFuture11110;
                ListenableFuture listenableFuture22 = listenableFuture11111;
                ListenableFuture listenableFuture23 = listenableFuture11113;
                ListenableFuture listenableFuture24 = listenableFuture11112;
                ListenableFuture listenableFuture25 = listenableFuture11114;
                JSONObject jSONObject2 = jSONObject;
                ListenableFuture listenableFuture26 = listenableFuture11115;
                ListenableFuture listenableFuture27 = listenableFuture11116;
                ListenableFuture listenableFuture28 = listenableFuture11117;
                ListenableFuture listenableFuture29 = listenableFuture11119;
                ListenableFuture listenableFuture210 = listenableFuture11118;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8192L2)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzdsvVar2.f12849d, "rendering-native-assets-loading-end");
                }
                zzdqb zzdqbVar = (zzdqb) listenableFuture21.get();
                List list = (List) listenableFuture22.get();
                synchronized (zzdqbVar) {
                    zzdqbVar.f12614e = list;
                }
                zzbml zzbmlVar = (zzbml) listenableFuture23.get();
                synchronized (zzdqbVar) {
                    zzdqbVar.f12628s = zzbmlVar;
                }
                zzbml zzbmlVar2 = (zzbml) listenableFuture24.get();
                synchronized (zzdqbVar) {
                    zzdqbVar.f12629t = zzbmlVar2;
                }
                zzbme zzbmeVar = (zzbme) listenableFuture25.get();
                synchronized (zzdqbVar) {
                    zzdqbVar.f12612c = zzbmeVar;
                }
                JSONObject jSONObjectOptJSONObject11 = jSONObject2.optJSONObject("mute");
                if (jSONObjectOptJSONObject11 == null || (jSONArrayOptJSONArray5 = jSONObjectOptJSONObject11.optJSONArray("reasons")) == null || jSONArrayOptJSONArray5.length() <= 0) {
                    zzgzi zzgziVar = zzgwt.f18303t;
                    zzgwtVarM7220t = zzgyo.f18355w;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray5.length(); i11++) {
                        com.google.android.gms.ads.internal.client.zzew zzewVarM6054f = zzdtk.m6054f(jSONArrayOptJSONArray5.optJSONObject(i11));
                        if (zzewVarM6054f != null) {
                            arrayList3.add(zzewVarM6054f);
                        }
                    }
                    zzgwtVarM7220t = zzgwt.m7220t(arrayList3);
                }
                synchronized (zzdqbVar) {
                    zzdqbVar.f12615f = zzgwtVarM7220t;
                }
                JSONObject jSONObjectOptJSONObject12 = jSONObject2.optJSONObject("mute");
                com.google.android.gms.ads.internal.client.zzew zzewVarM6054f2 = (jSONObjectOptJSONObject12 == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject12.optJSONObject("default_reason")) == null) ? null : zzdtk.m6054f(jSONObjectOptJSONObject10);
                synchronized (zzdqbVar) {
                    zzdqbVar.f12616g = zzewVarM6054f2;
                }
                zzclb zzclbVar = (zzclb) listenableFuture26.get();
                if (zzclbVar != null) {
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12618i = zzclbVar;
                    }
                    View viewMo5577H = zzclbVar.mo5577H();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12624o = viewMo5577H;
                    }
                    zzcmh zzcmhVarZzh = zzclbVar.zzh();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12611b = zzcmhVarZzh;
                    }
                }
                zzdqbVar.m6001d().putAll((Bundle) listenableFuture27.get());
                zzclb zzclbVar2 = (zzclb) listenableFuture28.get();
                if (zzclbVar2 != null) {
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12619j = zzclbVar2;
                    }
                    View viewMo5577H2 = zzclbVar2.mo5577H();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12625p = viewMo5577H2;
                    }
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                    zzclb zzclbVar3 = (zzclb) listenableFuture29.get();
                    if (zzclbVar3 != null) {
                        synchronized (zzdqbVar) {
                            zzdqbVar.f12620k = zzclbVar3;
                        }
                    }
                } else {
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12622m = listenableFuture29;
                    }
                    zzcgd zzcgdVar2 = new zzcgd();
                    synchronized (zzdqbVar) {
                        zzdqbVar.f12623n = zzcgdVar2;
                    }
                }
                for (zzdtm zzdtmVar : (List) listenableFuture210.get()) {
                    if (zzdtmVar.f12917a != 1) {
                        String str4 = zzdtmVar.f12918b;
                        zzblw zzblwVar = zzdtmVar.f12920d;
                        synchronized (zzdqbVar) {
                            if (zzblwVar == null) {
                                zzdqbVar.f12631v.remove(str4);
                            } else {
                                zzdqbVar.f12631v.put(str4, zzblwVar);
                            }
                        }
                    } else {
                        zzdqbVar.m6009o(zzdtmVar.f12918b, zzdtmVar.f12919c);
                    }
                }
                return zzdqbVar;
            }
        });
        final com.google.android.gms.ads.internal.zzb zzbVar6 = zzbVar2;
        return new zzhce(zzgwt.m7221u(new ListenableFuture[]{listenableFutureM6531b, listenableFutureM7366a4}), true).m7366a(this.f14394b, new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            /* JADX WARN: Code duplicated, block: B:47:0x01d9  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeom zzeomVar = this.f14383a;
                ListenableFuture listenableFuture21 = listenableFutureM7366a4;
                ListenableFuture listenableFuture22 = listenableFutureM6531b;
                zzfky zzfkyVar2 = zzfkyVar;
                zzfkn zzfknVar2 = zzfknVar;
                JSONObject jSONObject2 = jSONObject;
                com.google.android.gms.ads.internal.zzb zzbVar7 = zzbVar6;
                zzcdu zzcduVar = zzcdpVar2;
                zzdqb zzdqbVar = (zzdqb) ((zzhay) listenableFuture21).get();
                zzdvf zzdvfVar = (zzdvf) listenableFuture22.get();
                zzbio zzbioVar3 = zzbix.f8209M2;
                com.google.android.gms.ads.internal.client.zzba zzbaVar3 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-webview-creation-end");
                }
                zzdqc zzdqcVarMo5727c = zzeomVar.f14393a.mo5727c(new zzcyq(zzfkyVar2, zzfknVar2, null), new zzdqm(zzdqbVar), new zzdox(jSONObject2, zzdvfVar, zzbVar7, zzcduVar));
                if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    zzdzo zzdzoVar3 = zzeomVar.f14398f;
                    zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-ad-component-creation-end");
                    zzdzoVar3.m6104c(jCurrentTimeMillis, "rendering-configure-webview-start");
                }
                zzcpq zzcpqVar = (zzcpq) zzdqcVarMo5727c;
                zzimy zzimyVar = zzcpqVar.f11026e;
                zzdox zzdoxVar = zzcpqVar.f11023b;
                zzdqm zzdqmVar = zzcpqVar.f11022a;
                zzdql zzdqlVar = zzcpqVar.f11024c.f10689a.f12434a;
                zzinh.m8554a(zzdqlVar);
                zzdqb zzdqbVar2 = zzdqmVar.f12661a;
                zzinh.m8554a(zzdqbVar2);
                zzdvf zzdvfVar2 = zzdoxVar.f12515b;
                zzinh.m8554a(zzdvfVar2);
                zzdus zzdusVar = new zzdus(zzdqlVar, zzdqbVar2, zzdvfVar2, zzimy.m8548b(zzimyVar));
                if (zzdusVar.f13019a != null) {
                    zzdusVar.f13020b.m6069b("/nativeAdCustomClick", zzdusVar);
                }
                zzdva zzdvaVar = (zzdva) zzcpqVar.f11027f.zzb();
                final zzdeg zzdegVar = zzdvaVar.f13038b;
                zzdut zzdutVar = zzdvfVar.f13063a;
                Objects.requireNonNull(zzdegVar);
                com.google.android.gms.ads.internal.overlay.zzad zzadVar = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzduz
                    @Override // com.google.android.gms.ads.internal.overlay.zzad
                    public final /* synthetic */ void zzl() {
                        zzdegVar.m5907K0();
                    }
                };
                zzdcx zzdcxVar = zzdvaVar.f13037a;
                zzdet zzdetVar = zzdvaVar.f13039c;
                zzdfk zzdfkVar = zzdvaVar.f13040d;
                zzdid zzdidVar = zzdvaVar.f13041e;
                synchronized (zzdutVar) {
                    zzdutVar.f13022s = zzdcxVar;
                    zzdutVar.f13023t = zzdetVar;
                    zzdutVar.f13024u = zzdfkVar;
                    zzdutVar.f13025v = zzdidVar;
                    zzdutVar.f13026w = zzadVar;
                }
                zzfkn zzfknVar3 = zzdvaVar.f13042f;
                zzfkq zzfkqVar3 = zzdvaVar.f13043g;
                zzctq zzctqVar = zzdvaVar.f13044h;
                synchronized (zzdvfVar) {
                    ListenableFuture listenableFuture23 = zzdvfVar.f13075m;
                    if (listenableFuture23 != null) {
                        zzduy zzduyVar = new zzduy(zzdvfVar, zzfknVar3, zzfkqVar3, zzctqVar);
                        Executor executor6 = zzdvfVar.f13067e;
                        ((zzhay) listenableFuture23).addListener(new zzhcd(listenableFuture23, zzduyVar), executor6);
                    }
                }
                final zzdtv zzdtvVar = (zzdtv) zzcpqVar.f11028g.zzb();
                final zzclb zzclbVarM6005h = zzdqbVar.m6005h();
                if (zzclbVarM6005h == null) {
                    zzdtvVar.getClass();
                } else {
                    zzdla zzdlaVar = zzdtvVar.f12934c;
                    zzdlaVar.m5935K0(zzclbVarM6005h.mo5577H());
                    zzbex zzbexVar = new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtu
                        @Override // com.google.android.gms.internal.ads.zzbex
                        /* JADX INFO: renamed from: t */
                        public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                            Rect rect = zzbewVar.f7701d;
                            zzclbVarM6005h.mo5582K().m5639j(rect.left, rect.top);
                        }
                    };
                    Executor executor7 = zzdtvVar.f12932a;
                    zzdlaVar.m5924Y(zzbexVar, executor7);
                    zzdlaVar.m5924Y(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdtr
                        @Override // com.google.android.gms.internal.ads.zzbex
                        /* JADX INFO: renamed from: t */
                        public final /* synthetic */ void mo4826t(zzbew zzbewVar) {
                            HashMap map = new HashMap();
                            map.put("isVisible", true != zzbewVar.f7707j ? "0" : "1");
                            zzclbVarM6005h.mo5129b("onAdVisibilityChanged", map);
                        }
                    }, executor7);
                    zzcux zzcuxVar = zzdtvVar.f12933b;
                    zzdlaVar.m5924Y(zzcuxVar, executor7);
                    zzcuxVar.f11525s = zzclbVarM6005h;
                    zzclm zzclmVarMo5582K = zzclbVarM6005h.mo5582K();
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8014Ab)).booleanValue() && zzclmVarMo5582K != null) {
                        zzctq zzctqVar2 = zzdtvVar.f12935d;
                        zzclmVarMo5582K.m5634c("/click");
                        zzdlg zzdlgVar = zzclmVarMo5582K.f10420C;
                        zzbpx zzbpxVar = zzbpw.f9221a;
                        zzclmVarMo5582K.m5633b("/click", new zzbpr(zzdlgVar, zzctqVar2));
                        zzclmVarMo5582K.m5645x(zzctqVar2, null, null);
                    }
                    zzclbVarM6005h.mo5616v0("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdts
                        @Override // com.google.android.gms.internal.ads.zzbpx
                        /* JADX INFO: renamed from: a */
                        public final void mo5095a(Object obj, Map map) {
                            zzcux zzcuxVar2 = zzdtvVar.f12933b;
                            zzcuxVar2.f11529w = true;
                            zzcuxVar2.m5842a();
                        }
                    });
                    zzclbVarM6005h.mo5616v0("/untrackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdtt
                        @Override // com.google.android.gms.internal.ads.zzbpx
                        /* JADX INFO: renamed from: a */
                        public final void mo5095a(Object obj, Map map) {
                            zzdtvVar.f12933b.f11529w = false;
                        }
                    });
                    zzclbVarM6005h.mo5582K().f10436S = zzdtvVar.f12936e;
                }
                zzdvk zzdvkVar = (zzdvk) zzcpqVar.f11029h.zzb();
                zzdvl zzdvlVar = zzeomVar.f14397e;
                zzclb zzclbVarM6006i = zzdqbVar.m6006i();
                zzdvkVar.getClass();
                zzdvi zzdviVar = zzdvlVar.f13105a;
                final zzdeg zzdegVar2 = zzdvkVar.f13096b;
                Objects.requireNonNull(zzdegVar2);
                com.google.android.gms.ads.internal.overlay.zzad zzadVar2 = new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvj
                    @Override // com.google.android.gms.ads.internal.overlay.zzad
                    public final /* synthetic */ void zzl() {
                        zzdegVar2.m5907K0();
                    }
                };
                zzdcx zzdcxVar2 = zzdvkVar.f13095a;
                zzdet zzdetVar2 = zzdvkVar.f13097c;
                zzdfk zzdfkVar2 = zzdvkVar.f13098d;
                zzdid zzdidVar2 = zzdvkVar.f13099e;
                zzdle zzdleVar = zzdvkVar.f13100f;
                synchronized (zzdviVar) {
                    synchronized (zzdviVar) {
                        zzdviVar.f13022s = zzdcxVar2;
                        zzdviVar.f13023t = zzdetVar2;
                        zzdviVar.f13024u = zzdfkVar2;
                        zzdviVar.f13025v = zzdidVar2;
                        zzdviVar.f13026w = zzadVar2;
                    }
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue() && zzclbVarM6006i != null && zzclbVarM6006i.mo5582K() != null) {
                        zzclm zzclmVarMo5582K5 = zzclbVarM6006i.mo5582K();
                        zzctq zzctqVar6 = zzdvkVar.f13104j;
                        zzeko zzekoVar4 = zzdvkVar.f13103i;
                        zzclmVarMo5582K5.m5644v(zzctqVar6, zzekoVar4, zzdvkVar.f13102h);
                        zzclmVarMo5582K5.m5645x(zzctqVar6, zzekoVar4, zzdvkVar.f13101g);
                    }
                    if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                        AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                    }
                    return zzdqcVarMo5727c.mo5761g();
                }
                zzdviVar.f13093x = zzdleVar;
                if (((Boolean) zzbaVar3.f3098c.m5030a(zzbix.f8031Bb)).booleanValue()) {
                    zzclm zzclmVarMo5582K6 = zzclbVarM6006i.mo5582K();
                    zzctq zzctqVar7 = zzdvkVar.f13104j;
                    zzeko zzekoVar5 = zzdvkVar.f13103i;
                    zzclmVarMo5582K6.m5644v(zzctqVar7, zzekoVar5, zzdvkVar.f13102h);
                    zzclmVarMo5582K6.m5645x(zzctqVar7, zzekoVar5, zzdvkVar.f13101g);
                }
                if (((Boolean) zzbaVar3.f3098c.m5030a(zzbioVar3)).booleanValue()) {
                    AbstractC5152f.m3774f(com.google.android.gms.ads.internal.zzt.f3698C.f3711k, zzeomVar.f14398f, "rendering-configure-webview-end");
                }
                return zzdqcVarMo5727c.mo5761g();
            }
        });
    }
}
