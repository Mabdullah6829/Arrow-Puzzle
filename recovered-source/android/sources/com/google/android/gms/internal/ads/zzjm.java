package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjm extends zzau {

    /* JADX INFO: renamed from: A */
    public final boolean f20135A;

    /* JADX INFO: renamed from: u */
    public final int f20136u;

    /* JADX INFO: renamed from: v */
    public final String f20137v;

    /* JADX INFO: renamed from: w */
    public final int f20138w;

    /* JADX INFO: renamed from: x */
    public final zzv f20139x;

    /* JADX INFO: renamed from: y */
    public final int f20140y;

    /* JADX INFO: renamed from: z */
    public final zzxl f20141z;

    public zzjm(int i2, Exception exc, int i3) {
        this(i2, exc, i3, null, -1, null, 4, null, false);
    }

    /* JADX INFO: renamed from: a */
    public final zzjm m8620a(zzxl zzxlVar) {
        String message = getMessage();
        String str = zzfm.f16091a;
        return new zzjm(message, getCause(), this.f6926s, this.f20136u, this.f20137v, this.f20138w, this.f20139x, this.f20140y, zzxlVar, this.f6927t, this.f20135A);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzjm(int i2, Exception exc, int i3, String str, int i4, zzv zzvVar, int i5, zzxl zzxlVar, boolean z) {
        String str2;
        int i6;
        String strM2450q;
        String str3;
        if (i2 == 0) {
            str2 = str;
            i6 = i4;
            strM2450q = "Source error";
        } else if (i2 != 1) {
            strM2450q = "Unexpected runtime error";
            str2 = str;
            i6 = i4;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str4 = zzfm.f16091a;
            if (i5 == 0) {
                str3 = "NO";
            } else if (i5 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i5 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i5 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder(str3.length() + strValueOf.length() + AbstractC1456a.m2438e(String.valueOf(str).length() + 14, 9, String.valueOf(i4)) + 19);
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i6 = i4;
            sb.append(i6);
            sb.append(", format=");
            strM2450q = AbstractC1456a.m2450q(sb, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strM2450q : strM2450q.concat(": null"), exc, i3, i2, str2, i6, zzvVar, i5, zzxlVar, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjm(String str, Throwable th, int i2, int i3, String str2, int i4, zzv zzvVar, int i5, zzxl zzxlVar, long j2, boolean z) {
        int i6;
        boolean z2;
        super(i2, j2, str, th);
        Bundle bundle = Bundle.EMPTY;
        if (!z) {
            i6 = i3;
            z2 = true;
        } else if (i3 == 1) {
            i6 = 1;
            z2 = true;
        } else {
            i6 = i3;
            z2 = false;
        }
        zzgtr.m7128a(z2);
        zzgtr.m7128a(th != null);
        this.f20136u = i6;
        this.f20137v = str2;
        this.f20138w = i4;
        this.f20139x = zzvVar;
        this.f20140y = i5;
        this.f20141z = zzxlVar;
        this.f20135A = z;
    }
}
