package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzacr implements Iterable, Serializable {

    /* JADX INFO: renamed from: t */
    public static final zzacr f21972t = new zzacq(zzaed.f22038a);

    /* JADX INFO: renamed from: s */
    public int f21973s = 0;

    static {
        int i2 = zzacf.f21956a;
    }

    /* JADX INFO: renamed from: m */
    public static zzacr m9379m(byte[] bArr, int i2, int i3) {
        try {
            return m9380n(bArr, i2, i3);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static zzacr m9380n(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return f21972t;
        }
        m9381r(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzacq(bArr2);
    }

    /* JADX INFO: renamed from: r */
    public static int m9381r(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 21), "Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 44 + String.valueOf(i3).length()), "Beginning index larger than ending index: ", i2, ", ", i3));
        }
        throw new IndexOutOfBoundsException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i4).length()), "End index: ", i3, " >= ", i4));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m9382s(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i2 + i4;
        m9381r(i2, i5, bArr.length);
        m9381r(i3, i4 + i3, bArr2.length);
        while (i2 < i5) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo9372a(int i2);

    /* JADX INFO: renamed from: b */
    public abstract int mo9373b();

    /* JADX INFO: renamed from: d */
    public abstract zzacr mo9374d(int i2, int i3);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int iMo9373b = mo9373b();
        if (iMo9373b != zzacrVar.mo9373b()) {
            return false;
        }
        if (iMo9373b == 0) {
            return true;
        }
        int i2 = this.f21973s;
        int i3 = zzacrVar.f21973s;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return mo9377j(zzacrVar);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo9375g(int i2, byte[] bArr);

    /* JADX INFO: renamed from: h */
    public abstract void mo9376h(zzada zzadaVar);

    public final int hashCode() {
        int iMo9378k = this.f21973s;
        if (iMo9378k == 0) {
            int iMo9373b = mo9373b();
            iMo9378k = mo9378k(iMo9373b, iMo9373b);
            if (iMo9378k == 0) {
                iMo9378k = 1;
            }
            this.f21973s = iMo9378k;
        }
        return iMo9378k;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzack(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo9377j(zzacr zzacrVar);

    /* JADX INFO: renamed from: k */
    public abstract int mo9378k(int i2, int i3);

    /* JADX INFO: renamed from: q */
    public final byte[] m9383q() {
        int iMo9373b = mo9373b();
        if (iMo9373b == 0) {
            return zzaed.f22038a;
        }
        byte[] bArr = new byte[iMo9373b];
        mo9375g(iMo9373b, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo9373b = mo9373b();
        String strM9673a = mo9373b() <= 50 ? zzafx.m9673a(m9383q()) : zzafx.m9673a(mo9374d(0, 47).m9383q()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo9373b);
        sb.append(" contents=\"");
        return AbstractC0271e0.m403k(sb, strM9673a, "\">");
    }
}
