package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zza {

    /* JADX INFO: renamed from: a */
    public final int f4739a;

    /* JADX INFO: renamed from: b */
    public final Uri[] f4740b;

    /* JADX INFO: renamed from: c */
    public final zzak[] f4741c;

    /* JADX INFO: renamed from: d */
    public final int[] f4742d;

    /* JADX INFO: renamed from: e */
    public final long[] f4743e;

    /* JADX INFO: renamed from: f */
    public final String[] f4744f;

    /* JADX INFO: renamed from: g */
    public final zzb[] f4745g;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
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
    }

    public zza(int i2, int[] iArr, zzak[] zzakVarArr, long[] jArr, String[] strArr, zzb[] zzbVarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzakVarArr.length;
        int i3 = 0;
        zzgtr.m7128a(length == length2);
        zzgtr.m7128a(length == zzbVarArr.length);
        this.f4739a = i2;
        this.f4742d = iArr;
        this.f4741c = zzakVarArr;
        this.f4743e = jArr;
        this.f4740b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f4740b;
            if (i3 >= uriArr.length) {
                this.f4744f = strArr;
                this.f4745g = zzbVarArr;
                return;
            }
            zzak zzakVar = zzakVarArr[i3];
            if (zzakVar == null) {
                uri = null;
            } else {
                zzag zzagVar = zzakVar.f5574b;
                zzagVar.getClass();
                uri = zzagVar.f5240a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.f4739a == zzaVar.f4739a && Arrays.equals(this.f4741c, zzaVar.f4741c) && Arrays.equals(this.f4742d, zzaVar.f4742d) && Arrays.equals(this.f4743e, zzaVar.f4743e) && Arrays.equals(this.f4744f, zzaVar.f4744f) && Arrays.equals(this.f4745g, zzaVar.f4745g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f4745g) + ((((Arrays.hashCode(this.f4743e) + ((Arrays.hashCode(this.f4742d) + ((Arrays.hashCode(this.f4741c) + (((this.f4739a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f4744f)) * 31)) * 31;
    }
}
