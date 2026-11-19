package p033S0;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6452k;
import p035T0.AbstractC0811c;

/* JADX INFO: renamed from: S0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0627u implements Comparable {

    /* JADX INFO: renamed from: t */
    public static final String f1371t;

    /* JADX INFO: renamed from: s */
    public final C0616j f1372s;

    static {
        String separator = File.separator;
        AbstractC6452k.m12180d(separator, "separator");
        f1371t = separator;
    }

    public C0627u(C0616j bytes) {
        AbstractC6452k.m12181e(bytes, "bytes");
        this.f1372s = bytes;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m1451b() {
        ArrayList arrayList = new ArrayList();
        int iM1689a = AbstractC0811c.m1689a(this);
        C0616j c0616j = this.f1372s;
        if (iM1689a == -1) {
            iM1689a = 0;
        } else if (iM1689a < c0616j.mo1404e() && c0616j.mo1408j(iM1689a) == 92) {
            iM1689a++;
        }
        int iMo1404e = c0616j.mo1404e();
        int i2 = iM1689a;
        while (iM1689a < iMo1404e) {
            if (c0616j.mo1408j(iM1689a) == 47 || c0616j.mo1408j(iM1689a) == 92) {
                arrayList.add(c0616j.mo1412p(i2, iM1689a));
                i2 = iM1689a + 1;
            }
            iM1689a++;
        }
        if (i2 < c0616j.mo1404e()) {
            arrayList.add(c0616j.mo1412p(i2, c0616j.mo1404e()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final String m1452c() {
        C0616j c0616j = AbstractC0811c.f2120a;
        C0616j c0616jM1401q = this.f1372s;
        int iM1399l = C0616j.m1399l(c0616jM1401q, c0616j);
        if (iM1399l == -1) {
            iM1399l = C0616j.m1399l(c0616jM1401q, AbstractC0811c.f2121b);
        }
        if (iM1399l != -1) {
            c0616jM1401q = C0616j.m1401q(c0616jM1401q, iM1399l + 1, 0, 2);
        } else if (m1456h() != null && c0616jM1401q.mo1404e() == 2) {
            c0616jM1401q = C0616j.f1343v;
        }
        return c0616jM1401q.m1415t();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0627u other = (C0627u) obj;
        AbstractC6452k.m12181e(other, "other");
        return this.f1372s.compareTo(other.f1372s);
    }

    /* JADX INFO: renamed from: e */
    public final C0627u m1453e() {
        C0616j c0616j = AbstractC0811c.f2123d;
        C0616j c0616j2 = this.f1372s;
        if (AbstractC6452k.m12177a(c0616j2, c0616j)) {
            return null;
        }
        C0616j c0616j3 = AbstractC0811c.f2120a;
        if (AbstractC6452k.m12177a(c0616j2, c0616j3)) {
            return null;
        }
        C0616j prefix = AbstractC0811c.f2121b;
        if (AbstractC6452k.m12177a(c0616j2, prefix)) {
            return null;
        }
        C0616j suffix = AbstractC0811c.f2124e;
        c0616j2.getClass();
        AbstractC6452k.m12181e(suffix, "suffix");
        int iMo1404e = c0616j2.mo1404e();
        byte[] bArr = suffix.f1344s;
        if (c0616j2.mo1410n(iMo1404e - bArr.length, suffix, bArr.length) && (c0616j2.mo1404e() == 2 || c0616j2.mo1410n(c0616j2.mo1404e() - 3, c0616j3, 1) || c0616j2.mo1410n(c0616j2.mo1404e() - 3, prefix, 1))) {
            return null;
        }
        int iM1399l = C0616j.m1399l(c0616j2, c0616j3);
        if (iM1399l == -1) {
            iM1399l = C0616j.m1399l(c0616j2, prefix);
        }
        if (iM1399l == 2 && m1456h() != null) {
            if (c0616j2.mo1404e() == 3) {
                return null;
            }
            return new C0627u(C0616j.m1401q(c0616j2, 0, 3, 1));
        }
        if (iM1399l == 1) {
            AbstractC6452k.m12181e(prefix, "prefix");
            if (c0616j2.mo1410n(0, prefix, prefix.mo1404e())) {
                return null;
            }
        }
        if (iM1399l != -1 || m1456h() == null) {
            if (iM1399l == -1) {
                return new C0627u(c0616j);
            }
            return iM1399l == 0 ? new C0627u(C0616j.m1401q(c0616j2, 0, 1, 1)) : new C0627u(C0616j.m1401q(c0616j2, 0, iM1399l, 1));
        }
        if (c0616j2.mo1404e() == 2) {
            return null;
        }
        return new C0627u(C0616j.m1401q(c0616j2, 0, 2, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0627u) && AbstractC6452k.m12177a(((C0627u) obj).f1372s, this.f1372s);
    }

    /* JADX INFO: renamed from: f */
    public final C0627u m1454f(String child) {
        AbstractC6452k.m12181e(child, "child");
        C0613g c0613g = new C0613g();
        c0613g.m1389Q(child);
        return AbstractC0811c.m1690b(this, AbstractC0811c.m1692d(c0613g, false), false);
    }

    /* JADX INFO: renamed from: g */
    public final Path m1455g() {
        Path path = Paths.get(this.f1372s.m1415t(), new String[0]);
        AbstractC6452k.m12180d(path, "get(toString())");
        return path;
    }

    /* JADX INFO: renamed from: h */
    public final Character m1456h() {
        C0616j c0616j = AbstractC0811c.f2120a;
        C0616j c0616j2 = this.f1372s;
        if (C0616j.m1398h(c0616j2, c0616j) != -1 || c0616j2.mo1404e() < 2 || c0616j2.mo1408j(1) != 58) {
            return null;
        }
        char cMo1408j = (char) c0616j2.mo1408j(0);
        if (('a' > cMo1408j || cMo1408j >= '{') && ('A' > cMo1408j || cMo1408j >= '[')) {
            return null;
        }
        return Character.valueOf(cMo1408j);
    }

    public final int hashCode() {
        return this.f1372s.hashCode();
    }

    public final File toFile() {
        return new File(this.f1372s.m1415t());
    }

    public final String toString() {
        return this.f1372s.m1415t();
    }
}
