package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbe {

    /* JADX INFO: renamed from: m */
    public static final Object f7673m = new Object();

    /* JADX INFO: renamed from: n */
    public static final zzak f7674n;

    /* JADX INFO: renamed from: a */
    public Object f7675a = f7673m;

    /* JADX INFO: renamed from: b */
    public zzak f7676b = f7674n;

    /* JADX INFO: renamed from: c */
    public long f7677c;

    /* JADX INFO: renamed from: d */
    public long f7678d;

    /* JADX INFO: renamed from: e */
    public long f7679e;

    /* JADX INFO: renamed from: f */
    public boolean f7680f;

    /* JADX INFO: renamed from: g */
    public boolean f7681g;

    /* JADX INFO: renamed from: h */
    public zzaf f7682h;

    /* JADX INFO: renamed from: i */
    public boolean f7683i;

    /* JADX INFO: renamed from: j */
    public long f7684j;

    /* JADX INFO: renamed from: k */
    public int f7685k;

    /* JADX INFO: renamed from: l */
    public int f7686l;

    static {
        zzz zzzVar = new zzz();
        zzzVar.f21433a = "androidx.media3.common.Timeline";
        zzzVar.f21434b = Uri.EMPTY;
        f7674n = zzzVar.m9054a();
        String str = zzfm.f16091a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    /* JADX INFO: renamed from: a */
    public final void m4776a(zzak zzakVar, boolean z, boolean z2, zzaf zzafVar, long j2) {
        this.f7675a = f7673m;
        if (zzakVar == null) {
            zzakVar = f7674n;
        }
        this.f7676b = zzakVar;
        this.f7677c = -9223372036854775807L;
        this.f7678d = -9223372036854775807L;
        this.f7679e = -9223372036854775807L;
        this.f7680f = z;
        this.f7681g = z2;
        this.f7682h = zzafVar;
        this.f7684j = j2;
        this.f7685k = 0;
        this.f7686l = 0;
        this.f7683i = false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4777b() {
        return this.f7682h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zzbe.class.equals(obj.getClass())) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        return Objects.equals(this.f7675a, zzbeVar.f7675a) && Objects.equals(this.f7676b, zzbeVar.f7676b) && Objects.equals(this.f7682h, zzbeVar.f7682h) && this.f7677c == zzbeVar.f7677c && this.f7678d == zzbeVar.f7678d && this.f7679e == zzbeVar.f7679e && this.f7680f == zzbeVar.f7680f && this.f7681g == zzbeVar.f7681g && this.f7683i == zzbeVar.f7683i && this.f7684j == zzbeVar.f7684j && this.f7685k == zzbeVar.f7685k && this.f7686l == zzbeVar.f7686l;
    }

    public final int hashCode() {
        int iHashCode = ((this.f7675a.hashCode() + 217) * 31) + this.f7676b.hashCode();
        zzaf zzafVar = this.f7682h;
        int iHashCode2 = ((iHashCode * 961) + (zzafVar == null ? 0 : zzafVar.hashCode())) * 31;
        long j2 = this.f7677c;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f7678d;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f7679e;
        int i4 = ((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f7680f ? 1 : 0)) * 31) + (this.f7681g ? 1 : 0)) * 31) + (this.f7683i ? 1 : 0);
        long j5 = this.f7684j;
        return ((((((i4 * 961) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f7685k) * 31) + this.f7686l) * 31;
    }
}
