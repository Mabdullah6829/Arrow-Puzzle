package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbum {

    /* JADX INFO: renamed from: a */
    public static final zzbuj f9398a = new zzbuk();

    /* JADX INFO: renamed from: b */
    public static final zzbuh f9399b = new zzbuh() { // from class: com.google.android.gms.internal.ads.zzbul
        @Override // com.google.android.gms.internal.ads.zzbuh
        /* JADX INFO: renamed from: n */
        public final /* synthetic */ Object mo5146n(JSONObject jSONObject) {
            return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    };
}
