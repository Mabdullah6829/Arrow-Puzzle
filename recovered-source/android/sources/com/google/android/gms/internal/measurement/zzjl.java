package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p022N.AbstractC0355G;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjm();

    /* JADX INFO: renamed from: A */
    public final int[] f22536A;

    /* JADX INFO: renamed from: B */
    public final byte[][] f22537B;

    /* JADX INFO: renamed from: s */
    public final String f22538s;

    /* JADX INFO: renamed from: t */
    public final byte[] f22539t;

    /* JADX INFO: renamed from: u */
    public final byte[][] f22540u;

    /* JADX INFO: renamed from: v */
    public final byte[][] f22541v;

    /* JADX INFO: renamed from: w */
    public final byte[][] f22542w;

    /* JADX INFO: renamed from: x */
    public final byte[][] f22543x;

    /* JADX INFO: renamed from: y */
    public final int[] f22544y;

    /* JADX INFO: renamed from: z */
    public final byte[][] f22545z;

    static {
        byte[][] bArr = new byte[0][];
        new zzjl("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public zzjl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f22538s = str;
        this.f22539t = bArr;
        this.f22540u = bArr2;
        this.f22541v = bArr3;
        this.f22542w = bArr4;
        this.f22543x = bArr5;
        this.f22544y = iArr;
        this.f22545z = bArr6;
        this.f22536A = iArr2;
        this.f22537B = bArr7;
    }

    /* JADX INFO: renamed from: J */
    public static Set m10454J(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetM558l = AbstractC0355G.m558l(length);
        for (byte[] bArr2 : bArr) {
            Preconditions.m3544h(bArr2);
            hashSetM558l.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetM558l;
    }

    /* JADX INFO: renamed from: K */
    public static List m10455K(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i2 = 0; i2 < iArr.length; i2 += 2) {
            arrayList.add(new zzju(iArr[i2], iArr[i2 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static void m10456w(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i2 = 0;
        while (i2 < bArr.length) {
            byte[] bArr2 = bArr[i2];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            Preconditions.m3544h(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i2++;
            z = false;
        }
        sb.append(")");
    }

    /* JADX INFO: renamed from: H */
    public final Set m10457H() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f22545z;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f22539t;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return m10454J((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objM558l;
        Object objM558l2;
        int length;
        int length2;
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (zzkl.m10462a(this.f22538s, zzjlVar.f22538s) && zzkl.m10462a(m10457H(), zzjlVar.m10457H()) && zzkl.m10462a(m10454J(this.f22540u), m10454J(zzjlVar.f22540u)) && zzkl.m10462a(m10454J(this.f22541v), m10454J(zzjlVar.f22541v)) && zzkl.m10462a(m10454J(this.f22542w), m10454J(zzjlVar.f22542w)) && zzkl.m10462a(m10454J(this.f22543x), m10454J(zzjlVar.f22543x))) {
                int[] iArr = this.f22544y;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objM558l = Collections.EMPTY_SET;
                } else {
                    objM558l = AbstractC0355G.m558l(length2);
                    for (int i2 : iArr) {
                        objM558l.add(Integer.valueOf(i2));
                    }
                }
                int[] iArr2 = zzjlVar.f22544y;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objM558l2 = Collections.EMPTY_SET;
                } else {
                    objM558l2 = AbstractC0355G.m558l(length);
                    for (int i3 : iArr2) {
                        objM558l2.add(Integer.valueOf(i3));
                    }
                }
                if (zzkl.m10462a(objM558l, objM558l2) && zzkl.m10462a(m10455K(this.f22536A), m10455K(zzjlVar.f22536A)) && zzkl.m10462a(m10454J(this.f22537B), m10454J(zzjlVar.f22537B))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f22538s;
        sb.append(str == null ? "null" : AbstractC1456a.m2450q(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.f22539t;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m10456w(sb, "GAIA=", this.f22540u);
        sb.append(", ");
        m10456w(sb, "PSEUDO=", this.f22541v);
        sb.append(", ");
        m10456w(sb, "ALWAYS=", this.f22542w);
        sb.append(", ");
        m10456w(sb, "OTHER=", this.f22543x);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f22544y));
        sb.append(", ");
        m10456w(sb, "directs=", this.f22545z);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m10455K(this.f22536A).toArray()));
        sb.append(", ");
        m10456w(sb, "external=", this.f22537B);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f22538s);
        SafeParcelWriter.m3576b(parcel, 3, this.f22539t);
        SafeParcelWriter.m3577c(parcel, 4, this.f22540u);
        SafeParcelWriter.m3577c(parcel, 5, this.f22541v);
        SafeParcelWriter.m3577c(parcel, 6, this.f22542w);
        SafeParcelWriter.m3577c(parcel, 7, this.f22543x);
        SafeParcelWriter.m3579e(parcel, 8, this.f22544y);
        SafeParcelWriter.m3577c(parcel, 9, this.f22545z);
        SafeParcelWriter.m3579e(parcel, 10, this.f22536A);
        SafeParcelWriter.m3577c(parcel, 11, this.f22537B);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
