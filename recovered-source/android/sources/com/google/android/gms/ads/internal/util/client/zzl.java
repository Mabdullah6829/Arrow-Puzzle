package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class zzl {

    /* JADX INFO: renamed from: c */
    public static boolean f3425c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f3426d = false;

    /* JADX INFO: renamed from: a */
    public final List f3429a;

    /* JADX INFO: renamed from: b */
    public static final Object f3424b = new Object();

    /* JADX INFO: renamed from: e */
    public static final DefaultClock f3427e = DefaultClock.f4636a;

    /* JADX INFO: renamed from: f */
    public static final HashSet f3428f = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3052e() {
        boolean z;
        synchronized (f3424b) {
            try {
                z = false;
                if (f3425c && f3426d) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public static void m3053h(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!f3428f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzo.m3070c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    /* JADX INFO: renamed from: a */
    public final void m3054a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m3052e()) {
            m3060i("onNetworkRequest", new zzj(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3055b(String str, Map map, byte[] bArr) {
        if (m3052e()) {
            m3060i("onNetworkRequest", new zzj(str, ShareTarget.METHOD_GET, map, bArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3056c(HttpURLConnection httpURLConnection, int i2) {
        if (m3052e()) {
            String responseMessage = null;
            m3058f(i2, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()));
            if (i2 < 200 || i2 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    zzo.m3073f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                m3059g(responseMessage);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3057d(final byte[] bArr) {
        m3060i("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            /* JADX INFO: renamed from: a */
            public final void mo3051a(JsonWriter jsonWriter) throws IOException {
                Object obj = zzl.f3424b;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strEncodeToString = Base64.encodeToString(bArr2, 0);
                if (length < 10000) {
                    jsonWriter.name("body").value(strEncodeToString);
                } else {
                    String strM3035d = zzf.m3035d(strEncodeToString, "MD5");
                    if (strM3035d != null) {
                        jsonWriter.name("bodydigest").value(strM3035d);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m3058f(final int i2, final Map map) {
        m3060i("onNetworkResponse", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo3051a(JsonWriter jsonWriter) throws IOException {
                Object obj = zzl.f3424b;
                jsonWriter.name("params").beginObject();
                jsonWriter.name("firstline").beginObject();
                jsonWriter.name("code").value(i2);
                jsonWriter.endObject();
                zzl.m3053h(jsonWriter, map);
                jsonWriter.endObject();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m3059g(final String str) {
        m3060i("onNetworkRequestError", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo3051a(JsonWriter jsonWriter) throws IOException {
                Object obj = zzl.f3424b;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m3060i(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            JsonWriter jsonWriterName = jsonWriter.name("timestamp");
            f3427e.getClass();
            jsonWriterName.value(System.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f3429a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.mo3051a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzo.m3071d("unable to log", e);
        }
        String string = stringWriter.toString();
        synchronized (zzl.class) {
            try {
                zzo.m3072e("GMA Debug BEGIN");
                int i2 = 0;
                while (i2 < string.length()) {
                    int i3 = i2 + 4000;
                    zzo.m3072e("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i2, Math.min(i3, string.length())))));
                    i2 = i3;
                }
                zzo.m3072e("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzl(int i2) {
        this.f3429a = !m3052e() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
