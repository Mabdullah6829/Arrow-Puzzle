package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkq {

    /* JADX INFO: renamed from: a */
    public final List f15972a;

    /* JADX INFO: renamed from: b */
    public final String f15973b;

    /* JADX INFO: renamed from: c */
    public final int f15974c;

    /* JADX INFO: renamed from: d */
    public final int f15975d;

    /* JADX INFO: renamed from: e */
    public final String f15976e;

    /* JADX INFO: renamed from: f */
    public final int f15977f;

    /* JADX INFO: renamed from: g */
    public final long f15978g;

    /* JADX INFO: renamed from: h */
    public final boolean f15979h;

    /* JADX INFO: renamed from: i */
    public final String f15980i;

    /* JADX INFO: renamed from: j */
    public final zzfkp f15981j;

    /* JADX INFO: renamed from: k */
    public final Bundle f15982k;

    /* JADX INFO: renamed from: l */
    public final String f15983l;

    /* JADX INFO: renamed from: m */
    public final String f15984m;

    /* JADX INFO: renamed from: n */
    public final String f15985n;

    /* JADX INFO: renamed from: o */
    public final JSONObject f15986o;

    /* JADX INFO: renamed from: p */
    public final JSONObject f15987p;

    /* JADX INFO: renamed from: q */
    public final String f15988q;

    /* JADX INFO: renamed from: r */
    public final int f15989r;

    /* JADX INFO: renamed from: s */
    public final long f15990s;

    /* JADX INFO: renamed from: t */
    public final long f15991t;

    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    public zzfkq(JsonReader jsonReader) throws IOException {
        String str;
        byte b;
        List listM3118b = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        zzfkp zzfkpVar = null;
        long j2 = -1;
        long jNextLong = 0;
        long j3 = -1;
        int iNextInt = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listM3118b = com.google.android.gms.ads.internal.util.zzbp.m3118b(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt3 = jsonReader.nextInt();
            } else {
                if ("latency".equals(strNextName)) {
                    jNextLong = jsonReader.nextLong();
                } else {
                    zzbio zzbioVar = zzbix.f8819w9;
                    str = str2;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    long j4 = j2;
                    zzbiv zzbivVar = zzbaVar.f3098c;
                    zzbiv zzbivVar2 = zzbaVar.f3098c;
                    if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        zzfkp zzfkpVar2 = new zzfkp();
                        jsonReader.beginObject();
                        String strNextString8 = str;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            int iHashCode = strNextName2.hashCode();
                            if (iHashCode != -1724546052) {
                                if (iHashCode == 3059181 && strNextName2.equals("code")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (strNextName2.equals("description")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                jsonReader.nextInt();
                            } else if (b != 1) {
                                jsonReader.skipValue();
                            } else {
                                strNextString8 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzfkpVar2.f15971a = strNextString8;
                        zzfkpVar = zzfkpVar2;
                    } else if ("bidding_data".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else {
                        if (((Boolean) zzbivVar2.m5030a(zzbix.f8252Ob)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                            jsonReader.nextBoolean();
                        } else if ("adapter_response_replacement_key".equals(strNextName)) {
                            strNextString7 = jsonReader.nextString();
                        } else if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) zzbivVar2.m5030a(zzbix.f8129H7)).booleanValue()) {
                                try {
                                    Bundle bundleM3124h = com.google.android.gms.ads.internal.util.zzbp.m3124h(com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader));
                                    if (bundleM3124h != null) {
                                        bundle = bundleM3124h;
                                    }
                                } catch (IOException | JSONException unused) {
                                    j2 = j4;
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                    j2 = j4;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) zzbivVar2.m5030a(zzbix.f8064Da)).booleanValue()) {
                                strNextString5 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (!"adRequestUrl".equals(strNextName)) {
                            zzbio zzbioVar2 = zzbix.f8081Ea;
                            if (((Boolean) zzbivVar2.m5030a(zzbioVar2)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString6 = jsonReader.nextString();
                            } else if (((Boolean) zzbivVar2.m5030a(zzbioVar2)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                            } else {
                                if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else if (((Boolean) zzbivVar2.m5030a(zzbix.f8217Ma)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                                } else if (((Boolean) zzbivVar2.m5030a(zzbix.f8175K2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleM3124h2 = com.google.android.gms.ads.internal.util.zzbp.m3124h(com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader));
                                        if (bundleM3124h2 != null) {
                                            double d = bundleM3124h2.getDouble("start_time");
                                            long j5 = (d > 9.223372036854776E18d || d < -9.223372036854776E18d) ? -1L : (long) d;
                                            try {
                                                double d2 = bundleM3124h2.getDouble("end_time");
                                                long j6 = (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) ? -1L : (long) d2;
                                                j3 = j5;
                                                j2 = j6;
                                            } catch (IOException | JSONException unused3) {
                                                j3 = j5;
                                                j2 = j4;
                                            } catch (IllegalStateException unused4) {
                                                j3 = j5;
                                                jsonReader.skipValue();
                                                j2 = j4;
                                            }
                                        }
                                    } catch (IOException | JSONException unused5) {
                                    } catch (IllegalStateException unused6) {
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                j2 = j4;
                            }
                        } else if (((Boolean) zzbivVar2.m5030a(zzbix.f8064Da)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                        j2 = j4;
                    }
                    j2 = j4;
                }
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j7 = j2;
        jsonReader.endObject();
        this.f15972a = listM3118b;
        this.f15974c = iNextInt;
        if (((Boolean) zzbld.f9116e.m5057c()).booleanValue()) {
            this.f15975d = -1;
        } else {
            zzbkh zzbkhVar = zzbkl.f8982a;
            if (((Long) zzbkhVar.m5057c()).longValue() > -1) {
                this.f15975d = ((Long) zzbkhVar.m5057c()).intValue();
            } else {
                this.f15975d = iNextInt2;
            }
        }
        this.f15973b = strNextString;
        this.f15976e = strNextString2;
        this.f15977f = iNextInt3;
        this.f15978g = jNextLong;
        this.f15981j = zzfkpVar;
        this.f15979h = zNextBoolean;
        this.f15980i = strNextString3;
        this.f15982k = bundle;
        this.f15983l = strNextString4;
        this.f15984m = strNextString5;
        this.f15985n = strNextString6;
        this.f15986o = jSONObject;
        this.f15987p = jSONObject2;
        this.f15988q = strNextString7;
        zzbkh zzbkhVar2 = zzblb.f9103a;
        this.f15989r = ((Long) zzbkhVar2.m5057c()).longValue() > 0 ? ((Long) zzbkhVar2.m5057c()).intValue() : iMax;
        this.f15990s = j3;
        this.f15991t = j7;
    }
}
