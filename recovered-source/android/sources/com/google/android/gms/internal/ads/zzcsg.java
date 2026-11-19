package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsg implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final zzecz f11326a;

    public zzcsg(zzecz zzeczVar) {
        this.f11326a = zzeczVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        byte b;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("flick")) {
            b = 1;
        } else {
            b = -1;
        }
        zzecz zzeczVar = this.f11326a;
        if (b == 0) {
            zzeczVar.m6169h(zzecv.f13622t, true);
        } else if (b != 1) {
            zzeczVar.m6169h(zzecv.f13621s, true);
        } else {
            zzeczVar.m6169h(zzecv.f13623u, true);
        }
    }
}
