package com.google.android.gms.internal.ads;

import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {

    /* JADX INFO: renamed from: b */
    public static final zzc f9573b = new zzc(new zza[0]);

    /* JADX INFO: renamed from: c */
    public static final zza f9574c;

    /* JADX INFO: renamed from: a */
    public final zza[] f9575a;

    static {
        zza zzaVar = new zza(-1, new int[0], new zzak[0], new long[0], new String[0], new zzb[0]);
        int[] iArr = zzaVar.f4742d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = zzaVar.f4743e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        zzak[] zzakVarArr = (zzak[]) Arrays.copyOf(zzaVar.f4741c, 0);
        String[] strArr = (String[]) Arrays.copyOf(zzaVar.f4744f, 0);
        zzb[] zzbVarArr = zzaVar.f4745g;
        f9574c = new zza(0, iArrCopyOf, zzakVarArr, jArrCopyOf, strArr, (zzb[]) Arrays.copyOf(zzbVarArr, Math.max(0, zzbVarArr.length)));
        String str = zzfm.f16091a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzc(zza[] zzaVarArr) {
        this.f9575a = zzaVarArr;
    }

    /* JADX INFO: renamed from: a */
    public final zza m5285a(int i2) {
        return i2 < 0 ? f9574c : this.f9575a[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzc.class == obj.getClass() && Arrays.equals(this.f9575a, ((zzc) obj).f9575a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9575a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return AbstractC0271e0.m398f("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
