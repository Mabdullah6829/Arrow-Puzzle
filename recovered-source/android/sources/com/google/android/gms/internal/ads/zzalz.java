package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzalz {
    /* JADX INFO: renamed from: a */
    public static String m4221a(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = ((zzams) obj).f6032a.f6002g.f21061o;
            if (zzas.m4350b(str2)) {
                return "video/mp4";
            }
            if (zzas.m4349a(str2)) {
                z = true;
            } else if (zzas.m4351c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
