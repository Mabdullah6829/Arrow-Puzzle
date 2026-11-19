package p035T0;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p033S0.AbstractC0608b;
import p033S0.AbstractC0620n;
import p033S0.C0606F;
import p033S0.C0622p;
import p033S0.C0623q;
import p033S0.C0627u;
import p033S0.C0629w;
import p043a.AbstractC0878a;
import p049b0.C1887c;
import p057d0.C6283e;
import p078p0.InterfaceC6487a;
import p091y0.AbstractC6574d;
import p091y0.AbstractC6582l;

/* JADX INFO: renamed from: T0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0814f extends AbstractC6453l implements InterfaceC6487a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ ClassLoader f2131s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0814f(ClassLoader classLoader) {
        super(0);
        this.f2131s = classLoader;
    }

    @Override // p078p0.InterfaceC6487a
    public final Object invoke() throws IOException {
        String str;
        int iM12223B;
        ArrayList arrayList;
        C6283e c6283e;
        C6283e c6283e2;
        C0627u c0627u = C0815g.f2132c;
        ClassLoader classLoader = this.f2131s;
        Enumeration<URL> resources = classLoader.getResources("");
        AbstractC6452k.m12180d(resources, "getResources(\"\")");
        ArrayList list = Collections.list(resources);
        AbstractC6452k.m12180d(list, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            str = "it";
            if (i2 >= size) {
                break;
            }
            Object obj = list.get(i2);
            i2++;
            URL it = (URL) obj;
            C0627u c0627u2 = C0815g.f2132c;
            AbstractC6452k.m12180d(it, "it");
            if (AbstractC6452k.m12177a(it.getProtocol(), "file")) {
                C0623q c0623q = AbstractC0620n.f1360a;
                String str2 = C0627u.f1371t;
                String string = new File(it.toURI()).toString();
                AbstractC6452k.m12180d(string, "toString()");
                c6283e2 = new C6283e(c0623q, C1887c.m2718e(string, false));
            } else {
                c6283e2 = null;
            }
            if (c6283e2 != null) {
                arrayList2.add(c6283e2);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        AbstractC6452k.m12180d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
        ArrayList list2 = Collections.list(resources2);
        AbstractC6452k.m12180d(list2, "list(this)");
        ArrayList arrayList3 = new ArrayList();
        int size2 = list2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = list2.get(i3);
            i3++;
            URL url = (URL) obj2;
            C0627u c0627u3 = C0815g.f2132c;
            AbstractC6452k.m12180d(url, str);
            String string2 = url.toString();
            AbstractC6452k.m12180d(string2, "toString()");
            if (AbstractC6582l.m12236u(string2, "jar:file:") && (iM12223B = AbstractC6574d.m12223B(string2, "!")) != -1) {
                String str3 = C0627u.f1371t;
                String strSubstring = string2.substring(4, iM12223B);
                AbstractC6452k.m12180d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String string3 = new File(URI.create(strSubstring)).toString();
                AbstractC6452k.m12180d(string3, "toString()");
                C0627u c0627uM2718e = C1887c.m2718e(string3, z);
                C0623q fileSystem = AbstractC0620n.f1360a;
                AbstractC6452k.m12181e(fileSystem, "fileSystem");
                C0622p c0622pMo1365f = fileSystem.mo1365f(c0627uM2718e);
                try {
                    long size3 = c0622pMo1365f.size() - ((long) 22);
                    long j2 = 0;
                    if (size3 < 0) {
                        throw new IOException("not a zip: size=" + c0622pMo1365f.size());
                    }
                    long jMax = Math.max(size3 - 65536, 0L);
                    while (true) {
                        C0629w c0629wM1369b = AbstractC0608b.m1369b(c0622pMo1365f.m1419e(size3));
                        long j3 = j2;
                        try {
                            if (c0629wM1369b.m1466j() == 101010256) {
                                int iM1468n = c0629wM1369b.m1468n() & 65535;
                                int iM1468n2 = c0629wM1369b.m1468n() & 65535;
                                arrayList = arrayList3;
                                long jM1468n = c0629wM1369b.m1468n() & 65535;
                                if (jM1468n != (c0629wM1369b.m1468n() & 65535) || iM1468n != 0 || iM1468n2 != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                c0629wM1369b.m1471r(4L);
                                long jM1466j = ((long) c0629wM1369b.m1466j()) & 4294967295L;
                                int iM1468n3 = c0629wM1369b.m1468n() & 65535;
                                C0812d c0812d = new C0812d(jM1468n, jM1466j, iM1468n3);
                                c0629wM1369b.m1469o(iM1468n3);
                                c0629wM1369b.close();
                                long j4 = size3 - ((long) 20);
                                if (j4 > j3) {
                                    C0629w c0629wM1369b2 = AbstractC0608b.m1369b(c0622pMo1365f.m1419e(j4));
                                    try {
                                        if (c0629wM1369b2.m1466j() == 117853008) {
                                            int iM1466j = c0629wM1369b2.m1466j();
                                            long jM1467l = c0629wM1369b2.m1467l();
                                            if (c0629wM1369b2.m1466j() != 1 || iM1466j != 0) {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                            C0629w c0629wM1369b3 = AbstractC0608b.m1369b(c0622pMo1365f.m1419e(jM1467l));
                                            try {
                                                int iM1466j2 = c0629wM1369b3.m1466j();
                                                if (iM1466j2 != 101075792) {
                                                    throw new IOException("bad zip: expected " + AbstractC0810b.m1684b(101075792) + " but was " + AbstractC0810b.m1684b(iM1466j2));
                                                }
                                                c0629wM1369b3.m1471r(12L);
                                                int iM1466j3 = c0629wM1369b3.m1466j();
                                                int iM1466j4 = c0629wM1369b3.m1466j();
                                                long jM1467l2 = c0629wM1369b3.m1467l();
                                                if (jM1467l2 != c0629wM1369b3.m1467l() || iM1466j3 != 0 || iM1466j4 != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                c0629wM1369b3.m1471r(8L);
                                                C0812d c0812d2 = new C0812d(jM1467l2, c0629wM1369b3.m1467l(), iM1468n3);
                                                c0629wM1369b3.close();
                                                c0812d = c0812d2;
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    AbstractC0878a.m1797f(c0629wM1369b3, th);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        c0629wM1369b2.close();
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            AbstractC0878a.m1797f(c0629wM1369b2, th3);
                                            throw th4;
                                        }
                                    }
                                }
                                C0812d c0812d3 = c0812d;
                                long j5 = c0812d3.f2126b;
                                ArrayList arrayList4 = new ArrayList();
                                C0629w c0629wM1369b4 = AbstractC0608b.m1369b(c0622pMo1365f.m1419e(j5));
                                try {
                                    long j6 = c0812d3.f2125a;
                                    while (j3 < j6) {
                                        C0816h c0816hM1685c = AbstractC0810b.m1685c(c0629wM1369b4);
                                        long j7 = j5;
                                        if (c0816hM1685c.f2140g >= j7) {
                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                        }
                                        C0627u c0627u4 = C0815g.f2132c;
                                        if (C1887c.m2716a(c0816hM1685c.f2134a)) {
                                            arrayList4.add(c0816hM1685c);
                                        }
                                        j3++;
                                        j5 = j7;
                                    }
                                    c0629wM1369b4.close();
                                    C0606F c0606f = new C0606F(c0627uM2718e, fileSystem, AbstractC0810b.m1683a(arrayList4));
                                    c0622pMo1365f.close();
                                    c6283e = new C6283e(c0606f, C0815g.f2132c);
                                    break;
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        AbstractC0878a.m1797f(c0629wM1369b4, th5);
                                        throw th6;
                                    }
                                }
                                try {
                                    throw th;
                                } catch (Throwable th7) {
                                    AbstractC0878a.m1797f(c0622pMo1365f, th);
                                    throw th7;
                                }
                            }
                            ArrayList arrayList5 = arrayList3;
                            c0629wM1369b.close();
                            size3--;
                            if (size3 < jMax) {
                                throw new IOException("not a zip: end of central directory signature not found");
                            }
                            arrayList3 = arrayList5;
                            j2 = j3;
                        } catch (Throwable th8) {
                            c0629wM1369b.close();
                            throw th8;
                        }
                    }
                } catch (Throwable th9) {
                    throw th9;
                }
            } else {
                arrayList = arrayList3;
                c6283e = null;
            }
            ArrayList arrayList6 = arrayList;
            if (c6283e != null) {
                arrayList6.add(c6283e);
            }
            list2 = list2;
            arrayList3 = arrayList6;
            str = str;
            z = false;
        }
        ArrayList arrayList7 = arrayList3;
        ArrayList arrayList8 = new ArrayList(arrayList7.size() + arrayList2.size());
        arrayList8.addAll(arrayList2);
        arrayList8.addAll(arrayList7);
        return arrayList8;
    }
}
