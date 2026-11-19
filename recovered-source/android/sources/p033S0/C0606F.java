package p033S0;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6452k;
import p035T0.AbstractC0810b;
import p035T0.AbstractC0811c;
import p035T0.C0813e;
import p035T0.C0816h;
import p043a.AbstractC0878a;
import p049b0.C1887c;

/* JADX INFO: renamed from: S0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0606F extends AbstractC0620n {

    /* JADX INFO: renamed from: e */
    public static final C0627u f1326e;

    /* JADX INFO: renamed from: b */
    public final C0627u f1327b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0620n f1328c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f1329d;

    static {
        String str = C0627u.f1371t;
        f1326e = C1887c.m2718e("/", false);
    }

    public C0606F(C0627u c0627u, AbstractC0620n fileSystem, LinkedHashMap linkedHashMap) {
        AbstractC6452k.m12181e(fileSystem, "fileSystem");
        this.f1327b = c0627u;
        this.f1328c = fileSystem;
        this.f1329d = linkedHashMap;
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: a */
    public final void mo1361a(C0627u c0627u, C0627u target) throws IOException {
        AbstractC6452k.m12181e(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: b */
    public final void mo1362b(C0627u c0627u) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: c */
    public final void mo1363c(C0627u c0627u) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: e */
    public final C0619m mo1364e(C0627u path) throws Throwable {
        C0629w c0629wM1369b;
        AbstractC6452k.m12181e(path, "path");
        C0627u c0627u = f1326e;
        c0627u.getClass();
        C0816h c0816h = (C0816h) this.f1329d.get(AbstractC0811c.m1690b(c0627u, path, true));
        Throwable th = null;
        if (c0816h == null) {
            return null;
        }
        long j2 = c0816h.f2140g;
        boolean z = c0816h.f2135b;
        C0619m c0619m = new C0619m(!z, z, z ? null : Long.valueOf(c0816h.f2137d), null, c0816h.f2139f, null);
        if (j2 == -1) {
            return c0619m;
        }
        C0622p c0622pMo1365f = this.f1328c.mo1365f(this.f1327b);
        try {
            c0629wM1369b = AbstractC0608b.m1369b(c0622pMo1365f.m1419e(j2));
            try {
                c0622pMo1365f.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (c0622pMo1365f != null) {
                try {
                    c0622pMo1365f.close();
                } catch (Throwable th4) {
                    AbstractC0878a.m1796b(th3, th4);
                }
            }
            c0629wM1369b = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        AbstractC6452k.m12178b(c0629wM1369b);
        C0619m c0619mM1687e = AbstractC0810b.m1687e(c0629wM1369b, c0619m);
        AbstractC6452k.m12178b(c0619mM1687e);
        return c0619mM1687e;
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: f */
    public final C0622p mo1365f(C0627u c0627u) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: g */
    public final C0622p mo1366g(C0627u c0627u) throws IOException {
        throw new IOException("zip entries are not writable");
    }

    @Override // p033S0.AbstractC0620n
    /* JADX INFO: renamed from: h */
    public final InterfaceC0603C mo1367h(C0627u file) throws Throwable {
        Throwable th;
        C0629w c0629wM1369b;
        AbstractC6452k.m12181e(file, "file");
        C0627u c0627u = f1326e;
        c0627u.getClass();
        C0816h c0816h = (C0816h) this.f1329d.get(AbstractC0811c.m1690b(c0627u, file, true));
        if (c0816h == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j2 = c0816h.f2137d;
        C0622p c0622pMo1365f = this.f1328c.mo1365f(this.f1327b);
        try {
            c0629wM1369b = AbstractC0608b.m1369b(c0622pMo1365f.m1419e(c0816h.f2140g));
            try {
                c0622pMo1365f.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (c0622pMo1365f != null) {
                try {
                    c0622pMo1365f.close();
                } catch (Throwable th4) {
                    AbstractC0878a.m1796b(th3, th4);
                }
            }
            th = th3;
            c0629wM1369b = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC6452k.m12178b(c0629wM1369b);
        AbstractC0810b.m1687e(c0629wM1369b, null);
        return c0816h.f2138e == 0 ? new C0813e(c0629wM1369b, j2, true) : new C0813e(new C0621o(new C0813e(c0629wM1369b, c0816h.f2136c, true), new Inflater(true)), j2, false);
    }
}
