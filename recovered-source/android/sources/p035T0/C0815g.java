package p035T0;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p033S0.AbstractC0620n;
import p033S0.C0613g;
import p033S0.C0616j;
import p033S0.C0619m;
import p033S0.C0622p;
import p033S0.C0627u;
import p033S0.InterfaceC0603C;
import p049b0.C1887c;
import p057d0.C6283e;
import p057d0.C6287i;

/* JADX INFO: renamed from: T0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0815g extends AbstractC0620n {

    /* JADX INFO: renamed from: c */
    public static final C0627u f2132c;

    /* JADX INFO: renamed from: b */
    public final C6287i f2133b;

    static {
        String str = C0627u.f1371t;
        f2132c = C1887c.m2718e("/", false);
    }

    public C0815g(ClassLoader classLoader) {
        this.f2133b = AbstractC0242F.m357n(new C0814f(classLoader));
    }

    /* JADX INFO: renamed from: i */
    public static String m1695i(C0627u child) throws EOFException {
        C0627u c0627uM1692d;
        C0627u c0627u = f2132c;
        c0627u.getClass();
        C0616j c0616j = c0627u.f1372s;
        AbstractC6452k.m12181e(child, "child");
        C0627u c0627uM1690b = AbstractC0811c.m1690b(c0627u, child, true);
        C0616j c0616j2 = c0627uM1690b.f1372s;
        int iM1689a = AbstractC0811c.m1689a(c0627uM1690b);
        C0627u c0627u2 = iM1689a == -1 ? null : new C0627u(c0616j2.mo1412p(0, iM1689a));
        int iM1689a2 = AbstractC0811c.m1689a(c0627u);
        if (!AbstractC6452k.m12177a(c0627u2, iM1689a2 != -1 ? new C0627u(c0616j.mo1412p(0, iM1689a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + c0627uM1690b + " and " + c0627u).toString());
        }
        ArrayList arrayListM1451b = c0627uM1690b.m1451b();
        ArrayList arrayListM1451b2 = c0627u.m1451b();
        int iMin = Math.min(arrayListM1451b.size(), arrayListM1451b2.size());
        int i2 = 0;
        while (i2 < iMin && AbstractC6452k.m12177a(arrayListM1451b.get(i2), arrayListM1451b2.get(i2))) {
            i2++;
        }
        if (i2 == iMin && c0616j2.mo1404e() == c0616j.mo1404e()) {
            String str = C0627u.f1371t;
            c0627uM1692d = C1887c.m2718e(".", false);
        } else {
            if (arrayListM1451b2.subList(i2, arrayListM1451b2.size()).indexOf(AbstractC0811c.f2124e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + c0627uM1690b + " and " + c0627u).toString());
            }
            C0613g c0613g = new C0613g();
            C0616j c0616jM1691c = AbstractC0811c.m1691c(c0627u);
            if (c0616jM1691c == null && (c0616jM1691c = AbstractC0811c.m1691c(c0627uM1690b)) == null) {
                c0616jM1691c = AbstractC0811c.m1694f(C0627u.f1371t);
            }
            int size = arrayListM1451b2.size();
            for (int i3 = i2; i3 < size; i3++) {
                c0613g.m1386N(AbstractC0811c.f2124e);
                c0613g.m1386N(c0616jM1691c);
            }
            int size2 = arrayListM1451b.size();
            while (i2 < size2) {
                c0613g.m1386N((C0616j) arrayListM1451b.get(i2));
                c0613g.m1386N(c0616jM1691c);
                i2++;
            }
            c0627uM1692d = AbstractC0811c.m1692d(c0613g, false);
        }
        return c0627uM1692d.f1372s.m1415t();
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: a */
    public final void mo1361a(C0627u c0627u, C0627u target) throws IOException {
        AbstractC6452k.m12181e(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: b */
    public final void mo1362b(C0627u c0627u) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: c */
    public final void mo1363c(C0627u c0627u) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: e */
    public final C0619m mo1364e(C0627u path) throws EOFException {
        AbstractC6452k.m12181e(path, "path");
        if (!C1887c.m2716a(path)) {
            return null;
        }
        String strM1695i = m1695i(path);
        for (C6283e c6283e : (List) this.f2133b.getValue()) {
            C0619m c0619mMo1364e = ((AbstractC0620n) c6283e.f24308s).mo1364e(((C0627u) c6283e.f24309t).m1454f(strM1695i));
            if (c0619mMo1364e != null) {
                return c0619mMo1364e;
            }
        }
        return null;
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: f */
    public final C0622p mo1365f(C0627u c0627u) throws EOFException, FileNotFoundException {
        if (!C1887c.m2716a(c0627u)) {
            throw new FileNotFoundException("file not found: " + c0627u);
        }
        String strM1695i = m1695i(c0627u);
        for (C6283e c6283e : (List) this.f2133b.getValue()) {
            try {
                return ((AbstractC0620n) c6283e.f24308s).mo1365f(((C0627u) c6283e.f24309t).m1454f(strM1695i));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + c0627u);
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: g */
    public final C0622p mo1366g(C0627u c0627u) throws IOException {
        throw new IOException("resources are not writable");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: h */
    public final InterfaceC0603C mo1367h(C0627u file) throws EOFException, FileNotFoundException {
        AbstractC6452k.m12181e(file, "file");
        if (!C1887c.m2716a(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strM1695i = m1695i(file);
        for (C6283e c6283e : (List) this.f2133b.getValue()) {
            try {
                return ((AbstractC0620n) c6283e.f24308s).mo1367h(((C0627u) c6283e.f24309t).m1454f(strM1695i));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
