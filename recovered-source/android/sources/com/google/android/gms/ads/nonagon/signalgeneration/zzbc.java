package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcbk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc {

    /* JADX INFO: renamed from: a */
    public final String f3905a;

    /* JADX INFO: renamed from: b */
    public String f3906b;

    /* JADX INFO: renamed from: c */
    public final zzcbk f3907c;

    /* JADX INFO: renamed from: d */
    public final Bundle f3908d = new Bundle();

    /* JADX INFO: renamed from: e */
    public final long f3909e;

    /* JADX INFO: renamed from: f */
    public final long f3910f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    public zzbc(JsonReader jsonReader, zzcbk zzcbkVar) throws IOException {
        Bundle bundle;
        byte b;
        this.f3909e = -1L;
        this.f3910f = -1L;
        this.f3907c = zzcbkVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b = 2;
                    break;
                case "params":
                    b = 0;
                    break;
                case "signal_dictionary":
                    b = 1;
                    break;
                case "end_time":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                strNextString = jsonReader.nextString();
            } else if (b == 1) {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b == 2) {
                this.f3909e = jsonReader.nextLong();
            } else if (b != 3) {
                jsonReader.skipValue();
            } else {
                this.f3910f = jsonReader.nextLong();
            }
        }
        this.f3905a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f3908d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8158J2)).booleanValue() || zzcbkVar == null || (bundle = zzcbkVar.f9681E) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.f3909e);
        bundle.putLong("get-signals-sdkcore-end", this.f3910f);
    }
}
