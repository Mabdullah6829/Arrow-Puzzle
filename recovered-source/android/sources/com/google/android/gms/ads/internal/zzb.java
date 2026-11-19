package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcdu;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {

    /* JADX INFO: renamed from: a */
    public final Context f3641a;

    /* JADX INFO: renamed from: b */
    public boolean f3642b;

    /* JADX INFO: renamed from: c */
    public final zzcdu f3643c;

    /* JADX INFO: renamed from: d */
    public final zzcar f3644d = new zzcar(Collections.EMPTY_LIST, false);

    public zzb(Context context, zzcdu zzcduVar) {
        this.f3641a = context;
        this.f3643c = zzcduVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3246a() {
        zzcdu zzcduVar = this.f3643c;
        return ((zzcduVar == null || !zzcduVar.zza().f9793x) && !this.f3644d.f9659s) || this.f3642b;
    }

    /* JADX INFO: renamed from: b */
    public final void m3247b(String str) {
        List<String> list;
        zzcar zzcarVar = this.f3644d;
        zzcdu zzcduVar = this.f3643c;
        if ((zzcduVar == null || !zzcduVar.zza().f9793x) && !zzcarVar.f9659s) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (zzcduVar != null) {
            zzcduVar.mo5351c(str, null, 3);
            return;
        }
        if (!zzcarVar.f9659s || (list = zzcarVar.f9660t) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                com.google.android.gms.ads.internal.util.zzs zzsVar = zzt.f3698C.f3703c;
                com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
                new zzbt(this.f3641a, "", strReplace, null).mo3108b();
            }
        }
    }
}
