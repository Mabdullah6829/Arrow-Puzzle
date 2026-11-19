package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzqi {

    /* JADX INFO: renamed from: d */
    public static final zzqi f20627d;

    /* JADX INFO: renamed from: a */
    public final int f20628a;

    /* JADX INFO: renamed from: b */
    public final int f20629b;

    /* JADX INFO: renamed from: c */
    public final zzgxd f20630c;

    static {
        zzqi zzqiVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgxc zzgxcVar = new zzgxc();
            for (int i2 = 1; i2 <= 10; i2++) {
                zzgxcVar.m7235f(Integer.valueOf(zzfm.m6503e(i2)));
            }
            zzqiVar = new zzqi(zzgxcVar.m7237h(), 2);
        } else {
            zzqiVar = new zzqi(2, 10);
        }
        f20627d = zzqiVar;
    }

    public zzqi(int i2, int i3) {
        this.f20628a = i2;
        this.f20629b = i3;
        this.f20630c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqi)) {
            return false;
        }
        zzqi zzqiVar = (zzqi) obj;
        return this.f20628a == zzqiVar.f20628a && this.f20629b == zzqiVar.f20629b && Objects.equals(this.f20630c, zzqiVar.f20630c);
    }

    public final int hashCode() {
        zzgxd zzgxdVar = this.f20630c;
        return (((this.f20628a * 31) + this.f20629b) * 31) + (zzgxdVar == null ? 0 : zzgxdVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f20630c);
        int i2 = this.f20628a;
        int length = String.valueOf(i2).length();
        int i3 = this.f20629b;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 38, String.valueOf(i3).length(), 15, strValueOf.length()) + 1);
        AbstractC1456a.m2455v(sb, "AudioProfile[format=", i2, ", maxChannelCount=", i3);
        return AbstractC1456a.m2450q(sb, ", channelMasks=", strValueOf, "]");
    }

    public zzqi(Set set, int i2) {
        this.f20628a = i2;
        zzgxd zzgxdVarM7241r = zzgxd.m7241r(set);
        this.f20630c = zzgxdVarM7241r;
        zzgzh it = zzgxdVarM7241r.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f20629b = iMax;
    }
}
