package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkn {

    /* JADX INFO: renamed from: A */
    public final zzcdr f15881A;

    /* JADX INFO: renamed from: A0 */
    public final AbstractCollection f15882A0;

    /* JADX INFO: renamed from: B */
    public final String f15883B;

    /* JADX INFO: renamed from: B0 */
    public final boolean f15884B0;

    /* JADX INFO: renamed from: C */
    public final JSONObject f15885C;

    /* JADX INFO: renamed from: C0 */
    public final List f15886C0;

    /* JADX INFO: renamed from: D */
    public final JSONObject f15887D;

    /* JADX INFO: renamed from: D0 */
    public final boolean f15888D0;

    /* JADX INFO: renamed from: E */
    public final String f15889E;

    /* JADX INFO: renamed from: E0 */
    public final int f15890E0;

    /* JADX INFO: renamed from: F */
    public final String f15891F;

    /* JADX INFO: renamed from: F0 */
    public final Bundle f15892F0;

    /* JADX INFO: renamed from: G */
    public final String f15893G;

    /* JADX INFO: renamed from: G0 */
    public final boolean f15894G0;

    /* JADX INFO: renamed from: H */
    public final String f15895H;

    /* JADX INFO: renamed from: H0 */
    public final JSONArray f15896H0;

    /* JADX INFO: renamed from: I */
    public final String f15897I;

    /* JADX INFO: renamed from: I0 */
    public final int f15898I0;

    /* JADX INFO: renamed from: J */
    public final boolean f15899J;

    /* JADX INFO: renamed from: K */
    public final boolean f15900K;

    /* JADX INFO: renamed from: L */
    public final boolean f15901L;

    /* JADX INFO: renamed from: M */
    public final boolean f15902M;

    /* JADX INFO: renamed from: N */
    public final boolean f15903N;

    /* JADX INFO: renamed from: O */
    public final boolean f15904O;

    /* JADX INFO: renamed from: P */
    public final boolean f15905P;

    /* JADX INFO: renamed from: Q */
    public final int f15906Q;

    /* JADX INFO: renamed from: R */
    public final int f15907R;

    /* JADX INFO: renamed from: S */
    public final boolean f15908S;

    /* JADX INFO: renamed from: T */
    public final boolean f15909T;

    /* JADX INFO: renamed from: U */
    public final String f15910U;

    /* JADX INFO: renamed from: V */
    public final zzflj f15911V;

    /* JADX INFO: renamed from: W */
    public final boolean f15912W;

    /* JADX INFO: renamed from: X */
    public final boolean f15913X;

    /* JADX INFO: renamed from: Y */
    public final int f15914Y;

    /* JADX INFO: renamed from: Z */
    public final String f15915Z;

    /* JADX INFO: renamed from: a */
    public final List f15916a;

    /* JADX INFO: renamed from: a0 */
    public final int f15917a0;

    /* JADX INFO: renamed from: b */
    public final int f15918b;

    /* JADX INFO: renamed from: b0 */
    public final String f15919b0;

    /* JADX INFO: renamed from: c */
    public final List f15920c;

    /* JADX INFO: renamed from: c0 */
    public final boolean f15921c0;

    /* JADX INFO: renamed from: d */
    public final List f15922d;

    /* JADX INFO: renamed from: d0 */
    public final zzbzo f15923d0;

    /* JADX INFO: renamed from: e */
    public final int f15924e;

    /* JADX INFO: renamed from: e0 */
    public final com.google.android.gms.ads.internal.client.zzt f15925e0;

    /* JADX INFO: renamed from: f */
    public final List f15926f;

    /* JADX INFO: renamed from: f0 */
    public final String f15927f0;

    /* JADX INFO: renamed from: g */
    public final List f15928g;

    /* JADX INFO: renamed from: g0 */
    public final boolean f15929g0;

    /* JADX INFO: renamed from: h */
    public final List f15930h;

    /* JADX INFO: renamed from: h0 */
    public final JSONObject f15931h0;

    /* JADX INFO: renamed from: i */
    public final List f15932i;

    /* JADX INFO: renamed from: i0 */
    public final boolean f15933i0;

    /* JADX INFO: renamed from: j */
    public final String f15934j;

    /* JADX INFO: renamed from: j0 */
    public final JSONObject f15935j0;

    /* JADX INFO: renamed from: k */
    public final String f15936k;

    /* JADX INFO: renamed from: k0 */
    public final boolean f15937k0;

    /* JADX INFO: renamed from: l */
    public final zzcci f15938l;

    /* JADX INFO: renamed from: l0 */
    public final String f15939l0;

    /* JADX INFO: renamed from: m */
    public final List f15940m;

    /* JADX INFO: renamed from: m0 */
    public final boolean f15941m0;

    /* JADX INFO: renamed from: n */
    public final List f15942n;

    /* JADX INFO: renamed from: n0 */
    public final String f15943n0;

    /* JADX INFO: renamed from: o */
    public final List f15944o;

    /* JADX INFO: renamed from: o0 */
    public final String f15945o0;

    /* JADX INFO: renamed from: p */
    public final List f15946p;

    /* JADX INFO: renamed from: p0 */
    public final String f15947p0;

    /* JADX INFO: renamed from: q */
    public final int f15948q;

    /* JADX INFO: renamed from: q0 */
    public final boolean f15949q0;

    /* JADX INFO: renamed from: r */
    public final List f15950r;

    /* JADX INFO: renamed from: r0 */
    public final boolean f15951r0;

    /* JADX INFO: renamed from: s */
    public final zzfks f15952s;

    /* JADX INFO: renamed from: s0 */
    public final int f15953s0;

    /* JADX INFO: renamed from: t */
    public final List f15954t;

    /* JADX INFO: renamed from: t0 */
    public final String f15955t0;

    /* JADX INFO: renamed from: u */
    public final List f15956u;

    /* JADX INFO: renamed from: u0 */
    public final AbstractCollection f15957u0;

    /* JADX INFO: renamed from: v */
    public final JSONObject f15958v;

    /* JADX INFO: renamed from: v0 */
    public final boolean f15959v0;

    /* JADX INFO: renamed from: w */
    public final String f15960w;

    /* JADX INFO: renamed from: w0 */
    public final HashMap f15961w0;

    /* JADX INFO: renamed from: x */
    public final String f15962x;

    /* JADX INFO: renamed from: x0 */
    public final com.google.android.gms.ads.internal.util.client.zzv f15963x0;

    /* JADX INFO: renamed from: y */
    public final String f15964y;

    /* JADX INFO: renamed from: y0 */
    public final com.google.android.gms.ads.internal.util.client.zzw f15965y0;

    /* JADX INFO: renamed from: z */
    public final String f15966z;

    /* JADX INFO: renamed from: z0 */
    public final double f15967z0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:279:0x05d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    public zzfkn(JsonReader jsonReader) throws JSONException, IOException {
        List list;
        List list2;
        List list3;
        zzeax zzeaxVar;
        List listM3118b = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwt zzgwtVar = zzgyo.f18355w;
        HashMap map = new HashMap();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        List listM3118b2 = listM3118b;
        List listM6483a = listM3118b2;
        List listM3118b3 = listM6483a;
        List listM6483a2 = listM3118b3;
        JSONObject jSONObjectM3119c = jSONObject;
        JSONObject jSONObjectM3119c2 = jSONObject2;
        JSONObject jSONObjectM3119c3 = jSONObject3;
        JSONObject jSONObjectM3119c4 = jSONObject4;
        JSONObject jSONObjectM3119c5 = jSONObject5;
        JSONObject jSONObjectM3119c6 = jSONObject6;
        AbstractCollection abstractCollectionM3118b = zzgwtVar;
        AbstractCollection abstractCollectionM3118b2 = abstractCollectionM3118b;
        AbstractCollection abstractCollectionM7214f = abstractCollectionM3118b2;
        HashMap map2 = map;
        Bundle bundle2 = bundle;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String string = strNextString5;
        String strNextString6 = string;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        double dNextDouble = 0.0d;
        int i2 = 0;
        int i3 = 0;
        zzcci zzcciVarM5329w = null;
        int iNextInt = 0;
        zzfks zzfksVar = null;
        zzcdr zzcdrVar = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int i4 = -1;
        int iNextInt2 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt3 = 0;
        int iNextInt4 = -1;
        boolean zNextBoolean11 = false;
        zzbzo zzbzoVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        String strNextString20 = null;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean19 = false;
        com.google.android.gms.ads.internal.util.client.zzv zzvVarM3084a = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVarM3085d = null;
        int i5 = 2;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        int iNextInt6 = -1;
        boolean zNextBoolean22 = true;
        JSONArray jSONArrayM3120d = null;
        List listM3118b4 = listM6483a2;
        List listM3118b5 = listM3118b4;
        List listM3118b6 = listM3118b5;
        List listM3118b7 = listM3118b6;
        List listM3118b8 = listM3118b7;
        List listM3118b9 = listM3118b8;
        List listM3118b10 = listM3118b9;
        List listM3118b11 = listM3118b10;
        List listM3118b12 = listM3118b11;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = "id";
            switch (strNextName == null ? "" : strNextName) {
                case "renderers":
                    listM3118b10 = listM3118b10;
                    listM3118b12 = listM3118b12;
                    listM3118b = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_type":
                    list = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list2 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    String strNextString21 = jsonReader.nextString();
                    i2 = "banner".equals(strNextString21) ? 1 : "interstitial".equals(strNextString21) ? 2 : "native_express".equals(strNextString21) ? 3 : "native".equals(strNextString21) ? 4 : "rewarded".equals(strNextString21) ? 5 : "app_open_ad".equals(strNextString21) ? 6 : "rewarded_interstitial".equals(strNextString21) ? 7 : 0;
                    listM3118b11 = list2;
                    listM3118b9 = list;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "click_urls":
                    listM3118b4 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "imp_urls":
                    listM3118b5 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_load_urls":
                    listM3118b6 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "impression_type":
                    list = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list2 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    int iNextInt7 = jsonReader.nextInt();
                    i3 = (iNextInt7 == 0 || iNextInt7 == 1 || iNextInt7 == 3 || iNextInt7 == 4) ? iNextInt7 : 0;
                    listM3118b11 = list2;
                    listM3118b9 = list;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "video_start_urls":
                    listM3118b10 = listM3118b10;
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b7 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "video_reward_urls":
                    listM3118b10 = listM3118b10;
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b8 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "video_complete_urls":
                    listM3118b10 = listM3118b10;
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b9 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "transaction_id":
                    listM3118b10 = listM3118b10;
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    strNextString = jsonReader.nextString();
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "valid_from_timestamp":
                    listM3118b10 = listM3118b10;
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    strNextString2 = jsonReader.nextString();
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "rewards":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    zzcciVarM5329w = zzcci.m5329w(com.google.android.gms.ads.internal.util.zzbp.m3120d(jsonReader));
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "fill_urls":
                    listM3118b9 = listM3118b9;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "nofill_urls":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    listM3118b12 = listM3118b12;
                    listM3118b11 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "presentation_error_urls":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "manual_tracking_urls":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b2 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "presentation_error_timeout_ms":
                    listM3118b10 = listM3118b10;
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    iNextInt = jsonReader.nextInt();
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "container_sizes":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM6483a = zzfko.m6483a(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    zzfksVar = new zzfks(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_sizes":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM6483a2 = zzfko.m6483a(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "adapters":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b3 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "allocation_id":
                    strNextString3 = jsonReader.nextString();
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "data":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    jSONObjectM3119c = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "id":
                    strNextString4 = jsonReader.nextString();
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "qdata":
                    strNextString5 = jsonReader.nextString();
                    listM3118b11 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "active_view":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    string = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader).toString();
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "safe_browsing":
                    List list4 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    listM3118b12 = listM3118b12;
                    JSONObject jSONObjectM3119c7 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    Parcelable.Creator<zzcdr> creator = zzcdr.CREATOR;
                    zzcdr zzcdrVar2 = new zzcdr(jSONObjectM3119c7.optString("click_string", ""), jSONObjectM3119c7.optString("report_url", ""), jSONObjectM3119c7.optBoolean("rendered_ad_enabled", false), jSONObjectM3119c7.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbp.m3117a(jSONObjectM3119c7.optJSONArray("allowed_headers"), null), jSONObjectM3119c7.optBoolean("protection_enabled", false), jSONObjectM3119c7.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbp.m3117a(jSONObjectM3119c7.optJSONArray("webview_permissions"), null));
                    listM3118b11 = listM3118b11;
                    listM3118b9 = list4;
                    zzcdrVar = zzcdrVar2;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "debug_dialog_string":
                    strNextString6 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "debug_signals":
                    jSONObjectM3119c2 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "extras":
                    jSONObjectM3119c3 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "allow_pub_rendered_attribution":
                    zNextBoolean = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "allow_pub_owned_ad_view":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "allow_custom_click_gesture":
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "render_test_label":
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "test_mode_enabled":
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_custom_close_blocked":
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_closable_area_disabled":
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "orientation":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    String strNextString22 = jsonReader.nextString();
                    i4 = "landscape".equalsIgnoreCase(strNextString22) ? 6 : "portrait".equalsIgnoreCase(strNextString22) ? 7 : -1;
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "render_timeout_ms":
                    iNextInt2 = jsonReader.nextInt();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "enable_omid":
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "bid_response":
                    strNextString7 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "omid_settings":
                    jSONObjectM3119c4 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_analytics_logging_enabled":
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_scroll_aware":
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "showable_impression_type":
                    iNextInt3 = jsonReader.nextInt();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_close_time_ms":
                    iNextInt4 = jsonReader.nextInt();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "watermark":
                    strNextString8 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "backend_query_id":
                    strNextString9 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "use_third_party_container_height":
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "play_prewarm_options":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    JSONObject jSONObjectM3119c8 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    zzbzoVar = new zzbzo(jSONObjectM3119c8.optString("prefetch_url", ""), jSONObjectM3119c8.optBoolean("enable_prewarming", false), jSONObjectM3119c8.optBoolean("skip_offline_notification_flow", false));
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_close_button_enabled":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    jsonReader.nextBoolean();
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_event_value":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    listM3118b12 = listM3118b12;
                    JSONObject jSONObjectM3119c9 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator2 = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                    zztVar = new com.google.android.gms.ads.internal.client.zzt(jSONObjectM3119c9.getInt("type_num"), jSONObjectM3119c9.getInt("precision_num"), jSONObjectM3119c9.getLong("value"), jSONObjectM3119c9.getString(FirebaseAnalytics.Param.CURRENCY));
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "rule_line_external_id":
                    strNextString10 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_interscroller":
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_cover":
                    jSONObjectM3119c5 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_network_class_name":
                    strNextString11 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "adapter_response_info_key":
                    strNextString18 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_source_name":
                    strNextString12 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_source_id":
                    strNextString13 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_source_instance_name":
                    strNextString14 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "ad_source_instance_id":
                    strNextString15 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_offline_ad":
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "rtb_native_required_assets":
                    jSONObjectM3119c6 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "native_required_asset_viewability":
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "content_url":
                    strNextString20 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "force_disable_hardware_acceleration":
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "cache_hit_urls":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "buffer_click_url_as_ready_to_ping":
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "request_id":
                    strNextString16 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "recursive_server_response_data":
                    strNextString17 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_collapsible":
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_consent":
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "consent_form_action_identifier":
                    iNextInt5 = jsonReader.nextInt();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "parallel_key":
                    strNextString19 = jsonReader.nextString();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "late_load_urls":
                    abstractCollectionM3118b = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "render_serially":
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "preload_sort_value":
                    dNextDouble = jsonReader.nextDouble();
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "preload_sort_type":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    int iNextInt8 = jsonReader.nextInt();
                    int i6 = 3;
                    int[] iArr = {1, 2, 3};
                    int i7 = 0;
                    while (true) {
                        if (i7 < i6) {
                            int i8 = iArr[i7];
                            int i9 = i8 - 1;
                            if (i8 == 0) {
                                throw null;
                            }
                            if (i9 == iNextInt8) {
                                i5 = i8;
                            } else {
                                i7++;
                                i6 = 3;
                            }
                        } else {
                            i5 = 2;
                        }
                    }
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "analytics_event_name_to_parameters_map":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    if (((Boolean) zzbix.f8173K0.m5022f()).booleanValue()) {
                        HashMap map3 = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            HashMap map4 = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                map4.put(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            map3.put(strNextName2, map4);
                        }
                        jsonReader.endObject();
                        map2 = map3;
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    }
                    break;
                case "network_ping_config":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    if (((Boolean) zzbix.f8182K9.m5022f()).booleanValue()) {
                        zzvVarM3084a = com.google.android.gms.ads.internal.util.client.zzv.m3084a(com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader));
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    }
                    break;
                case "offline_ad_config":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    if (((Boolean) zzbix.f8216M9.m5022f()).booleanValue()) {
                        zzwVarM3085d = com.google.android.gms.ads.internal.util.client.zzw.m3085d(com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader));
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    }
                    break;
                case "post_click_lifecycle_monitoring_duration_ms":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    if (((Boolean) zzbix.f8688oe.m5022f()).booleanValue()) {
                        iNextInt6 = jsonReader.nextInt();
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    } else {
                        jsonReader.skipValue();
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    }
                    break;
                case "presentation_urls":
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    listM3118b12 = listM3118b12;
                    abstractCollectionM3118b2 = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "flow_control":
                    listM3118b10 = listM3118b10;
                    listM3118b12 = listM3118b12;
                    zNextBoolean20 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "on_device_storage_configs":
                    if (((Boolean) zzbix.f8130H8.m5022f()).booleanValue()) {
                        zzgzi zzgziVar2 = zzgwt.f18303t;
                        zzgwq zzgwqVar = new zzgwq();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            zzgwt zzgwtVarM7214f = zzgyo.f18355w;
                            jsonReader.beginObject();
                            Long lValueOf = null;
                            while (jsonReader.hasNext()) {
                                String strNextName3 = jsonReader.nextName();
                                if (Objects.equals(strNextName3, str)) {
                                    lValueOf = Long.valueOf(jsonReader.nextLong());
                                } else {
                                    String str2 = str;
                                    if (Objects.equals(strNextName3, "event_types")) {
                                        zzgwq zzgwqVar2 = new zzgwq();
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext()) {
                                            zzgwqVar2.m7203c(Integer.valueOf(jsonReader.nextInt()));
                                        }
                                        jsonReader.endArray();
                                        zzgwtVarM7214f = zzgwqVar2.m7214f();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                    str = str2;
                                }
                            }
                            String str3 = str;
                            jsonReader.endObject();
                            if (lValueOf == null || zzgwtVarM7214f.isEmpty()) {
                                zzeaxVar = null;
                            } else {
                                zzgwt zzgwtVar2 = zzgwtVarM7214f;
                                long jLongValue = lValueOf.longValue();
                                zzgyo zzgyoVar = (zzgyo) zzgwtVar2;
                                int i10 = zzgyoVar.f18357v;
                                int[] iArr2 = new int[i10];
                                for (int i11 = 0; i11 < i10; i11++) {
                                    iArr2[i11] = ((Integer) zzgyoVar.get(i11)).intValue();
                                }
                                zzeaxVar = new zzeax(iArr2, jLongValue);
                            }
                            if (zzeaxVar != null) {
                                zzgwqVar.m7203c(zzeaxVar);
                            }
                            listM3118b12 = listM3118b12;
                            str = str3;
                            listM3118b11 = listM3118b11;
                            listM3118b10 = listM3118b10;
                            listM3118b9 = listM3118b9;
                        }
                        listM3118b9 = listM3118b9;
                        listM3118b10 = listM3118b10;
                        listM3118b12 = listM3118b12;
                        jsonReader.endArray();
                        abstractCollectionM7214f = zzgwqVar.m7214f();
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    } else {
                        listM3118b9 = listM3118b9;
                        listM3118b10 = listM3118b10;
                        list3 = listM3118b11;
                        listM3118b12 = listM3118b12;
                        jsonReader.skipValue();
                        listM3118b11 = list3;
                        listM3118b9 = listM3118b9;
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    }
                    break;
                case "adapter_only_third_party_impression":
                    zNextBoolean21 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "response_info_extras_override":
                    if (((Boolean) zzbix.f8146I7.m5022f()).booleanValue()) {
                        try {
                            Bundle bundleM3124h = com.google.android.gms.ads.internal.util.zzbp.m3124h(com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader));
                            if (bundleM3124h != null) {
                                bundle2 = bundleM3124h;
                            }
                        } catch (IllegalStateException unused) {
                            jsonReader.skipValue();
                            listM3118b9 = listM3118b9;
                            listM3118b10 = listM3118b10;
                            list3 = listM3118b11;
                            listM3118b12 = listM3118b12;
                            listM3118b11 = list3;
                            listM3118b9 = listM3118b9;
                        }
                        listM3118b12 = listM3118b12;
                        listM3118b10 = listM3118b10;
                        break;
                    } else {
                        jsonReader.skipValue();
                    }
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "is_secondary_analytics_logging_enabled":
                    zNextBoolean22 = jsonReader.nextBoolean();
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                case "recursive_signal_collection":
                    jSONArrayM3120d = com.google.android.gms.ads.internal.util.zzbp.m3120d(jsonReader);
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
                default:
                    jsonReader.skipValue();
                    listM3118b9 = listM3118b9;
                    listM3118b10 = listM3118b10;
                    list3 = listM3118b11;
                    listM3118b12 = listM3118b12;
                    listM3118b11 = list3;
                    listM3118b9 = listM3118b9;
                    listM3118b12 = listM3118b12;
                    listM3118b10 = listM3118b10;
                    break;
            }
        }
        jsonReader.endObject();
        this.f15916a = listM3118b;
        this.f15918b = i2;
        this.f15920c = listM3118b4;
        this.f15922d = listM3118b5;
        this.f15926f = listM3118b6;
        this.f15924e = i3;
        this.f15928g = listM3118b7;
        this.f15930h = listM3118b8;
        this.f15932i = listM3118b9;
        this.f15934j = strNextString;
        this.f15936k = strNextString2;
        this.f15938l = zzcciVarM5329w;
        this.f15940m = listM3118b10;
        this.f15942n = listM3118b11;
        this.f15944o = listM3118b12;
        this.f15946p = listM3118b2;
        this.f15948q = iNextInt;
        this.f15950r = listM6483a;
        this.f15952s = zzfksVar;
        this.f15954t = listM3118b3;
        this.f15956u = listM6483a2;
        this.f15960w = strNextString3;
        this.f15958v = jSONObjectM3119c;
        this.f15962x = strNextString4;
        this.f15964y = strNextString5;
        this.f15966z = string;
        this.f15881A = zzcdrVar;
        this.f15883B = strNextString6;
        this.f15885C = jSONObjectM3119c2;
        this.f15887D = jSONObjectM3119c3;
        this.f15899J = zNextBoolean;
        this.f15900K = zNextBoolean2;
        this.f15901L = zNextBoolean3;
        this.f15902M = zNextBoolean4;
        this.f15903N = zNextBoolean5;
        this.f15904O = zNextBoolean6;
        this.f15905P = zNextBoolean7;
        this.f15906Q = i4;
        this.f15907R = iNextInt2;
        this.f15909T = zNextBoolean8;
        this.f15910U = strNextString7;
        this.f15911V = new zzflj(jSONObjectM3119c4);
        this.f15912W = zNextBoolean9;
        this.f15913X = zNextBoolean10;
        this.f15914Y = iNextInt3;
        this.f15915Z = strNextString8;
        this.f15917a0 = iNextInt4;
        this.f15919b0 = strNextString9;
        this.f15921c0 = zNextBoolean11;
        this.f15923d0 = zzbzoVar;
        this.f15925e0 = zztVar;
        this.f15927f0 = strNextString10;
        this.f15929g0 = zNextBoolean12;
        this.f15931h0 = jSONObjectM3119c5;
        this.f15889E = strNextString11;
        this.f15891F = strNextString12;
        this.f15893G = strNextString13;
        this.f15895H = strNextString14;
        this.f15897I = strNextString15;
        this.f15933i0 = zNextBoolean13;
        this.f15935j0 = jSONObjectM3119c6;
        this.f15937k0 = zNextBoolean14;
        this.f15939l0 = strNextString20;
        this.f15941m0 = zNextBoolean15;
        this.f15908S = zNextBoolean16;
        this.f15943n0 = strNextString16;
        this.f15945o0 = strNextString17;
        this.f15947p0 = strNextString18;
        this.f15949q0 = zNextBoolean17;
        this.f15951r0 = zNextBoolean18;
        this.f15953s0 = iNextInt5;
        this.f15957u0 = abstractCollectionM3118b;
        this.f15955t0 = strNextString19;
        this.f15959v0 = zNextBoolean19;
        this.f15961w0 = map2;
        this.f15963x0 = zzvVarM3084a;
        this.f15965y0 = zzwVarM3085d;
        this.f15967z0 = dNextDouble;
        this.f15898I0 = i5;
        this.f15882A0 = abstractCollectionM3118b2;
        this.f15884B0 = zNextBoolean20;
        this.f15886C0 = abstractCollectionM7214f;
        this.f15888D0 = zNextBoolean21;
        this.f15890E0 = iNextInt6;
        this.f15892F0 = bundle2;
        this.f15894G0 = zNextBoolean22;
        this.f15896H0 = jSONArrayM3120d;
    }

    /* JADX INFO: renamed from: a */
    public static String m6481a(int i2) {
        switch (i2) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6482b() {
        return this.f15933i0 || this.f15965y0 != null;
    }
}
