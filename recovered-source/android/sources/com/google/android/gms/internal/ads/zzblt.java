package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblt extends zzbmd {

    /* JADX INFO: renamed from: A */
    public static final int f9140A;

    /* JADX INFO: renamed from: B */
    public static final int f9141B;

    /* JADX INFO: renamed from: s */
    public final String f9142s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f9143t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final ArrayList f9144u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final int f9145v;

    /* JADX INFO: renamed from: w */
    public final int f9146w;

    /* JADX INFO: renamed from: x */
    public final int f9147x;

    /* JADX INFO: renamed from: y */
    public final int f9148y;

    /* JADX INFO: renamed from: z */
    public final int f9149z;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f9140A = Color.rgb(204, 204, 204);
        f9141B = iRgb;
    }

    public zzblt(String str, List list, Integer num, Integer num2, Integer num3, int i2, int i3) {
        this.f9142s = str;
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzblw zzblwVar = (zzblw) list.get(i4);
            this.f9143t.add(zzblwVar);
            this.f9144u.add(zzblwVar);
        }
        this.f9145v = num != null ? num.intValue() : f9140A;
        this.f9146w = num2 != null ? num2.intValue() : f9141B;
        this.f9147x = num3 != null ? num3.intValue() : 12;
        this.f9148y = i2;
        this.f9149z = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final String zzb() {
        return this.f9142s;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final ArrayList zzc() {
        return this.f9144u;
    }
}
