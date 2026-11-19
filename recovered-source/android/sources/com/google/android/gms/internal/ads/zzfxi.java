package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxi extends zzfxd {
    @Override // com.google.android.gms.internal.ads.zzfxe, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        zzfvs zzfvsVar;
        if (!TextUtils.isEmpty(str) && (zzfvsVar = zzfvs.f16671c) != null) {
            for (zzfuy zzfuyVar : Collections.unmodifiableCollection(zzfvsVar.f16672a)) {
                if (this.f16746c.contains(zzfuyVar.f16619g)) {
                    zzfwi zzfwiVar = zzfuyVar.f16616d;
                    if (this.f16748e >= zzfwiVar.f16704c) {
                        zzfwiVar.f16705d = 2;
                        zzfvz.f16687a.m6735a(zzfwiVar.m6743c(), "setNativeViewHierarchy", str, zzfwiVar.f16702a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzfww zzfwwVar = this.f16750b;
        JSONObject jSONObject = zzfwwVar.f16728a;
        JSONObject jSONObject2 = this.f16747d;
        if (zzfwo.m6751e(jSONObject2, jSONObject)) {
            return null;
        }
        zzfwwVar.f16728a = jSONObject2;
        return jSONObject2.toString();
    }
}
