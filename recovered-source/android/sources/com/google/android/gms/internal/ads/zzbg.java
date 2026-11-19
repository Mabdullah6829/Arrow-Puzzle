package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbg {

    /* JADX INFO: renamed from: a */
    public final int f7807a;

    /* JADX INFO: renamed from: b */
    public final String f7808b;

    /* JADX INFO: renamed from: c */
    public final int f7809c;

    /* JADX INFO: renamed from: d */
    public final zzv[] f7810d;

    /* JADX INFO: renamed from: e */
    public int f7811e;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbg(String str, zzv... zzvVarArr) {
        int length = zzvVarArr.length;
        int i2 = 1;
        zzgtr.m7128a(length > 0);
        this.f7808b = str;
        this.f7810d = zzvVarArr;
        this.f7807a = length;
        String str2 = zzvVarArr[0].f21061o;
        this.f7809c = TextUtils.isEmpty(str2) ? zzas.m4354f(zzvVarArr[0].f21060n) : zzas.m4354f(str2);
        zzv zzvVar = zzvVarArr[0];
        String str3 = zzvVar.f21050d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i3 = zzvVar.f21052f | 16384;
        while (true) {
            zzv[] zzvVarArr2 = this.f7810d;
            if (i2 >= zzvVarArr2.length) {
                return;
            }
            zzv zzvVar2 = zzvVarArr2[i2];
            String str4 = zzvVar2.f21050d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                m4859a("languages", zzvVarArr2[0].f21050d, str4, i2);
                return;
            } else {
                if (i3 != (zzvVar2.f21052f | 16384)) {
                    m4859a("role flags", Integer.toBinaryString(zzvVarArr2[0].f21052f), Integer.toBinaryString(this.f7810d[i2].f21052f), i2);
                    return;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4859a(String str, String str2, String str3, int i2) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i2).length() + 1);
        AbstractC0271e0.m413u(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i2);
        sb.append(")");
        zzeh.m6214f("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.f7808b.equals(zzbgVar.f7808b) && Arrays.equals(this.f7810d, zzbgVar.f7810d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f7811e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f7810d) + ((this.f7808b.hashCode() + 527) * 31);
        this.f7811e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.f7810d);
        String str = this.f7808b;
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), str, ": ", string);
    }
}
