package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzba {

    /* JADX INFO: renamed from: a */
    public final Object f7227a;

    /* JADX INFO: renamed from: b */
    public final int f7228b;

    /* JADX INFO: renamed from: c */
    public final zzak f7229c;

    /* JADX INFO: renamed from: d */
    public final Object f7230d;

    /* JADX INFO: renamed from: e */
    public final int f7231e;

    /* JADX INFO: renamed from: f */
    public final long f7232f;

    /* JADX INFO: renamed from: g */
    public final long f7233g;

    /* JADX INFO: renamed from: h */
    public final int f7234h;

    /* JADX INFO: renamed from: i */
    public final int f7235i;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzba(Object obj, int i2, zzak zzakVar, Object obj2, int i3, long j2, long j3, int i4, int i5) {
        zzgtr.m7128a(i2 >= 0);
        zzgtr.m7128a(i3 >= 0);
        this.f7227a = obj;
        this.f7228b = i2;
        this.f7229c = zzakVar;
        this.f7230d = obj2;
        this.f7231e = i3;
        this.f7232f = j2;
        this.f7233g = j3;
        this.f7234h = i4;
        this.f7235i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.f7228b == zzbaVar.f7228b && this.f7231e == zzbaVar.f7231e && this.f7232f == zzbaVar.f7232f && this.f7233g == zzbaVar.f7233g && this.f7234h == zzbaVar.f7234h && this.f7235i == zzbaVar.f7235i && Objects.equals(this.f7229c, zzbaVar.f7229c) && Objects.equals(this.f7227a, zzbaVar.f7227a) && Objects.equals(this.f7230d, zzbaVar.f7230d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7227a, Integer.valueOf(this.f7228b), this.f7229c, this.f7230d, Integer.valueOf(this.f7231e), Long.valueOf(this.f7232f), Long.valueOf(this.f7233g), Integer.valueOf(this.f7234h), Integer.valueOf(this.f7235i));
    }

    public final String toString() {
        int i2 = this.f7228b;
        int length = String.valueOf(i2).length();
        int i3 = this.f7231e;
        int length2 = String.valueOf(i3).length();
        long j2 = this.f7232f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j2).length());
        AbstractC1456a.m2455v(sb, "mediaItem=", i2, ", period=", i3);
        sb.append(", pos=");
        sb.append(j2);
        String string = sb.toString();
        int i4 = this.f7234h;
        if (i4 == -1) {
            return string;
        }
        int length3 = string.length();
        long j3 = this.f7233g;
        int length4 = String.valueOf(i4).length() + length3 + 13 + String.valueOf(j3).length() + 10;
        int i5 = this.f7235i;
        StringBuilder sb2 = new StringBuilder(length4 + 5 + String.valueOf(i5).length());
        sb2.append(string);
        sb2.append(", contentPos=");
        sb2.append(j3);
        return AbstractC1456a.m2449p(sb2, ", adGroup=", i4, ", ad=", i5);
    }
}
