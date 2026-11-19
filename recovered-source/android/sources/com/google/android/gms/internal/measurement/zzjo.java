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
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();

    /* JADX INFO: renamed from: A */
    public final int f22550A;

    /* JADX INFO: renamed from: s */
    public final String f22551s;

    /* JADX INFO: renamed from: t */
    public final long f22552t;

    /* JADX INFO: renamed from: u */
    public final boolean f22553u;

    /* JADX INFO: renamed from: v */
    public final double f22554v;

    /* JADX INFO: renamed from: w */
    public final String f22555w;

    /* JADX INFO: renamed from: x */
    public final byte[] f22556x;

    /* JADX INFO: renamed from: y */
    public final int f22557y;

    /* JADX INFO: renamed from: z */
    public final int f22558z;

    public zzjo(String str, long j2, boolean z, double d, String str2, byte[] bArr, int i2, int i3, int i4) {
        this.f22551s = str;
        this.f22552t = j2;
        this.f22553u = z;
        this.f22554v = d;
        this.f22555w = str2;
        this.f22556x = bArr;
        this.f22557y = i2;
        this.f22558z = i3;
        this.f22550A = i4;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(zzjo zzjoVar) {
        int i2;
        zzjo zzjoVar2 = zzjoVar;
        int iCompareTo = this.f22551s.compareTo(zzjoVar2.f22551s);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i3 = zzjoVar2.f22557y;
        int i4 = this.f22557y;
        if (i4 < i3) {
            i2 = -1;
        } else {
            i2 = i4 != i3 ? 1 : 0;
        }
        if (i2 != 0) {
            return i2;
        }
        if (i4 == 1) {
            long j2 = this.f22552t;
            long j3 = zzjoVar2.f22552t;
            if (j2 >= j3) {
                if (j2 == j3) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i4 == 2) {
            boolean z = zzjoVar2.f22553u;
            boolean z2 = this.f22553u;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i4 == 3) {
            return Double.compare(this.f22554v, zzjoVar2.f22554v);
        }
        if (i4 == 4) {
            String str = zzjoVar2.f22555w;
            String str2 = this.f22555w;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i4 != 5) {
            throw new AssertionError(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i4).length() + 20), "Invalid enum value: ", i4));
        }
        byte[] bArr = zzjoVar2.f22556x;
        byte[] bArr2 = this.f22556x;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i5 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i5 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i6 = bArr2[i5] - bArr[i5];
                        if (i6 != 0) {
                            return i6;
                        }
                        i5++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzkl.m10462a(this.f22551s, zzjoVar.f22551s)) {
                int i2 = zzjoVar.f22557y;
                int i3 = this.f22557y;
                if (i3 == i2 && this.f22558z == zzjoVar.f22558z && this.f22550A == zzjoVar.f22550A) {
                    if (i3 == 1) {
                        return this.f22552t == zzjoVar.f22552t;
                    }
                    if (i3 == 2) {
                        return this.f22553u == zzjoVar.f22553u;
                    }
                    if (i3 == 3) {
                        return this.f22554v == zzjoVar.f22554v;
                    }
                    if (i3 == 4) {
                        return zzkl.m10462a(this.f22555w, zzjoVar.f22555w);
                    }
                    if (i3 == 5) {
                        return Arrays.equals(this.f22556x, zzjoVar.f22556x);
                    }
                    throw new AssertionError(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 20), "Invalid enum value: ", i3));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m10458w(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public final void m10458w(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f22551s;
        sb.append(str);
        sb.append(", ");
        int i2 = this.f22557y;
        if (i2 == 1) {
            sb.append(this.f22552t);
        } else if (i2 == 2) {
            sb.append(this.f22553u);
        } else if (i2 == 3) {
            sb.append(this.f22554v);
        } else if (i2 == 4) {
            sb.append("'");
            String str2 = this.f22555w;
            Preconditions.m3544h(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i2 != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i2).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i2);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f22556x;
            Preconditions.m3544h(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(this.f22558z);
        sb.append(", ");
        sb.append(this.f22550A);
        sb.append(")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f22551s;
        boolean z = str == null;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        if (!z) {
            SafeParcelWriter.m3583i(parcel, 2, str);
        }
        long j2 = this.f22552t;
        if (j2 != 0) {
            SafeParcelWriter.m3588n(parcel, 3, 8);
            parcel.writeLong(j2);
        }
        if (this.f22553u) {
            SafeParcelWriter.m3588n(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.f22554v;
        if (d != 0.0d) {
            SafeParcelWriter.m3588n(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.f22555w;
        if (str2 != null) {
            SafeParcelWriter.m3583i(parcel, 6, str2);
        }
        byte[] bArr = this.f22556x;
        if (bArr != null) {
            SafeParcelWriter.m3576b(parcel, 7, bArr);
        }
        int i3 = this.f22557y;
        if (i3 != 0) {
            SafeParcelWriter.m3588n(parcel, 8, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.f22558z;
        if (i4 != 0) {
            SafeParcelWriter.m3588n(parcel, 9, 4);
            parcel.writeInt(i4);
        }
        int i5 = this.f22550A;
        if (i5 != 0) {
            SafeParcelWriter.m3588n(parcel, 10, 4);
            parcel.writeInt(i5);
        }
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
