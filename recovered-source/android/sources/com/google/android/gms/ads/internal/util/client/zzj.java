package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzj implements zzk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f3420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f3421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f3422c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte[] f3423d;

    public /* synthetic */ zzj(String str, String str2, Map map, byte[] bArr) {
        this.f3420a = str;
        this.f3421b = str2;
        this.f3422c = map;
        this.f3423d = bArr;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    /* JADX INFO: renamed from: a */
    public final void mo3051a(JsonWriter jsonWriter) throws IOException {
        Object obj = zzl.f3424b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(this.f3420a);
        jsonWriter.name("verb").value(this.f3421b);
        jsonWriter.endObject();
        zzl.m3053h(jsonWriter, this.f3422c);
        byte[] bArr = this.f3423d;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
