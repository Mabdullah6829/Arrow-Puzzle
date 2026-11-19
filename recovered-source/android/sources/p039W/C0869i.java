package p039W;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p033S0.C0613g;
import p033S0.C0616j;
import p033S0.C0628v;

/* JADX INFO: renamed from: W.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0869i implements Closeable {

    /* JADX INFO: renamed from: s */
    public final C0628v f2435s;

    /* JADX INFO: renamed from: t */
    public final C0613g f2436t;

    /* JADX INFO: renamed from: u */
    public final C0864d f2437u;

    /* JADX INFO: renamed from: v */
    public int f2438v;

    /* JADX INFO: renamed from: w */
    public boolean f2439w;

    public C0869i(C0628v c0628v) {
        this.f2435s = c0628v;
        C0613g c0613g = new C0613g();
        this.f2436t = c0613g;
        this.f2437u = new C0864d(c0613g);
        this.f2438v = 16384;
    }

    /* JADX INFO: renamed from: c */
    public final void m1789c(int i2, int i3, byte b, byte b2) {
        Logger logger = C0870j.f2440a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC0867g.m1781a(false, i2, i3, b, b2));
        }
        int i4 = this.f2438v;
        if (i3 > i4) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC1456a.m2443j(i4, i3, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "reserved bit set: "));
        }
        C0628v c0628v = this.f2435s;
        c0628v.m1459h((i3 >>> 16) & 255);
        c0628v.m1459h((i3 >>> 8) & 255);
        c0628v.m1459h(i3 & 255);
        c0628v.m1459h(b & 255);
        c0628v.m1459h(b2 & 255);
        c0628v.m1460i(i2 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f2439w = true;
        this.f2435s.close();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX INFO: renamed from: e */
    public final void m1790e(int i2, List list, boolean z) throws IOException {
        int length;
        int length2;
        if (this.f2439w) {
            throw new IOException("closed");
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0862b c0862b = (C0862b) list.get(i3);
            C0616j c0616jMo1413r = c0862b.f2404a.mo1413r();
            C0616j c0616j = c0862b.f2405b;
            Integer num = (Integer) AbstractC0865e.f2422c.get(c0616jMo1413r);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (length2 < 2 || length2 > 7) {
                    length = length2;
                    length2 = -1;
                } else {
                    C0862b[] c0862bArr = AbstractC0865e.f2421b;
                    if (c0862bArr[iIntValue].f2405b.equals(c0616j)) {
                        length = length2;
                    } else if (c0862bArr[length2].f2405b.equals(c0616j)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            C0864d c0864d = this.f2437u;
            if (length2 == -1) {
                int i4 = c0864d.f2418d + 1;
                while (true) {
                    C0862b[] c0862bArr2 = c0864d.f2416b;
                    if (i4 >= c0862bArr2.length) {
                        break;
                    }
                    if (c0862bArr2[i4].f2404a.equals(c0616jMo1413r)) {
                        if (c0864d.f2416b[i4].f2405b.equals(c0616j)) {
                            length2 = (i4 - c0864d.f2418d) + AbstractC0865e.f2421b.length;
                            break;
                        } else if (length == -1) {
                            length = (i4 - c0864d.f2418d) + AbstractC0865e.f2421b.length;
                        }
                    }
                    i4++;
                }
            }
            if (length2 != -1) {
                c0864d.m1779c(length2, 127, 128);
            } else if (length == -1) {
                c0864d.f2415a.m1387O(64);
                c0864d.m1778b(c0616jMo1413r);
                c0864d.m1778b(c0616j);
                c0864d.m1777a(c0862b);
            } else {
                C0616j prefix = AbstractC0865e.f2420a;
                c0616jMo1413r.getClass();
                AbstractC6452k.m12181e(prefix, "prefix");
                if (!c0616jMo1413r.mo1410n(0, prefix, prefix.mo1404e()) || C0862b.f2403h.equals(c0616jMo1413r)) {
                    c0864d.m1779c(length, 63, 64);
                    c0864d.m1778b(c0616j);
                    c0864d.m1777a(c0862b);
                } else {
                    c0864d.m1779c(length, 15, 0);
                    c0864d.m1778b(c0616j);
                }
            }
        }
        C0613g c0613g = this.f2436t;
        long j2 = c0613g.f1342t;
        int iMin = (int) Math.min(this.f2438v, j2);
        long j3 = iMin;
        byte b = j2 == j3 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m1789c(i2, iMin, (byte) 1, b);
        C0628v c0628v = this.f2435s;
        c0628v.mo1356s(c0613g, j3);
        if (j2 > j3) {
            long j4 = j2 - j3;
            while (j4 > 0) {
                int iMin2 = (int) Math.min(this.f2438v, j4);
                long j5 = iMin2;
                j4 -= j5;
                m1789c(i2, iMin2, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                c0628v.mo1356s(c0613g, j5);
            }
        }
    }
}
