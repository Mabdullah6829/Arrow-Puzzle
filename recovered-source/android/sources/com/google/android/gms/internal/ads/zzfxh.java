package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxh extends zzfxd {
    @Override // com.google.android.gms.internal.ads.zzfxe
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        m6758b(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m6758b(String str) {
        zzfvs zzfvsVar = zzfvs.f16671c;
        if (zzfvsVar != null) {
            for (zzfuy zzfuyVar : Collections.unmodifiableCollection(zzfvsVar.f16672a)) {
                if (this.f16746c.contains(zzfuyVar.f16619g)) {
                    zzfwi zzfwiVar = zzfuyVar.f16616d;
                    if (this.f16748e >= zzfwiVar.f16704c && zzfwiVar.f16705d != 3) {
                        zzfwiVar.f16705d = 3;
                        zzfvz.f16687a.m6735a(zzfwiVar.m6743c(), "setNativeViewHierarchy", str, zzfwiVar.f16702a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f16747d.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m6758b(str);
        super.onPostExecute(str);
    }
}
