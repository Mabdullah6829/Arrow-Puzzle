package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkx {

    /* JADX INFO: renamed from: a */
    public final List f16001a;

    /* JADX INFO: renamed from: b */
    public final zzfkq f16002b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f16003c;

    /* JADX INFO: renamed from: d */
    public final Bundle f16004d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzfkx(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.f16004d = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue() && bundle != null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            bundle.putLong("server-response-parse-start", System.currentTimeMillis());
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfkq zzfkqVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new zzfkn(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfkqVar = new zzfkq(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8175K2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", zzfkqVar.f15990s);
                            bundle.putLong("normalize-ad-response-end", zzfkqVar.f15991t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectM3119c = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectM3119c = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zzfkw(jSONObjectM3119c, strNextString));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f16003c = arrayList2;
        this.f16001a = arrayList;
        this.f16002b = zzfkqVar == null ? new zzfkq(new JsonReader(new StringReader("{}"))) : zzfkqVar;
    }

    /* JADX INFO: renamed from: a */
    public static zzfkx m6484a(Reader reader, Bundle bundle) {
        try {
            try {
                zzfkx zzfkxVar = new zzfkx(new JsonReader(reader), bundle);
                IOUtils.m3649a(reader);
                return zzfkxVar;
            } catch (Throwable th) {
                IOUtils.m3649a(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfkr("unable to parse ServerResponse", e);
        }
    }
}
