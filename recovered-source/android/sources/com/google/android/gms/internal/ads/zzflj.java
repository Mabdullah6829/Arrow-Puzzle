package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflj {

    /* JADX INFO: renamed from: a */
    public final JSONObject f16062a;

    public zzflj(JSONObject jSONObject) {
        this.f16062a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final int m6487a() {
        int iOptInt = this.f16062a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
