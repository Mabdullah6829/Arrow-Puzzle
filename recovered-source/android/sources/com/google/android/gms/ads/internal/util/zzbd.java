package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd {

    /* JADX INFO: renamed from: a */
    public final String f3512a;

    /* JADX INFO: renamed from: b */
    public final double f3513b;

    /* JADX INFO: renamed from: c */
    public final double f3514c;

    /* JADX INFO: renamed from: d */
    public final double f3515d;

    /* JADX INFO: renamed from: e */
    public final int f3516e;

    public zzbd(String str, double d, double d2, double d3, int i2) {
        this.f3512a = str;
        this.f3514c = d;
        this.f3513b = d2;
        this.f3515d = d3;
        this.f3516e = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return Objects.m3535a(this.f3512a, zzbdVar.f3512a) && this.f3513b == zzbdVar.f3513b && this.f3514c == zzbdVar.f3514c && this.f3516e == zzbdVar.f3516e && Double.compare(this.f3515d, zzbdVar.f3515d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3512a, Double.valueOf(this.f3513b), Double.valueOf(this.f3514c), Double.valueOf(this.f3515d), Integer.valueOf(this.f3516e)});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m3536a(this.f3512a, AppMeasurementSdk.ConditionalUserProperty.NAME);
        toStringHelper.m3536a(Double.valueOf(this.f3514c), "minBound");
        toStringHelper.m3536a(Double.valueOf(this.f3513b), "maxBound");
        toStringHelper.m3536a(Double.valueOf(this.f3515d), "percent");
        toStringHelper.m3536a(Integer.valueOf(this.f3516e), "count");
        return toStringHelper.toString();
    }
}
