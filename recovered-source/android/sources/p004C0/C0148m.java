package p004C0;

import kotlin.jvm.internal.AbstractC6463v;
import p000A0.InterfaceC0064t0;
import p011H.AbstractC0271e0;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;

/* JADX INFO: renamed from: C0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0148m extends C0138c {

    /* JADX INFO: renamed from: C */
    public final EnumC0136a f264C;

    public C0148m(int i2, EnumC0136a enumC0136a) {
        super(i2);
        this.f264C = enumC0136a;
        if (enumC0136a != EnumC0136a.f215s) {
            if (i2 < 1) {
                throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC6463v.m12189a(C0138c.class).m12176b() + " instead").toString());
        }
    }

    /* JADX INFO: renamed from: G */
    public final Object m252G(Object obj, boolean z) {
        EnumC0136a enumC0136a = this.f264C;
        EnumC0136a enumC0136a2 = EnumC0136a.f217u;
        C6289k c6289k = C6289k.f24318a;
        if (enumC0136a == enumC0136a2) {
            Object objMo227g = super.mo227g(obj);
            return (!(objMo227g instanceof C0144i) || (objMo227g instanceof C0143h)) ? objMo227g : c6289k;
        }
        Object obj2 = AbstractC0140e.f236d;
        C0146k c0146k = (C0146k) C0138c.f228x.get(this);
        while (true) {
            long andIncrement = C0138c.f224t.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean zM239u = m239u(false, andIncrement);
            int i2 = AbstractC0140e.f234b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (c0146k.f466c != j4) {
                C0146k c0146kM214c = C0138c.m214c(this, j4, c0146k);
                if (c0146kM214c != null) {
                    c0146k = c0146kM214c;
                } else if (zM239u) {
                    return new C0143h(m237r());
                }
            }
            int iM216h = C0138c.m216h(this, c0146k, i3, obj, j2, obj2, zM239u);
            if (iM216h == 0) {
                c0146k.m307a();
                return c6289k;
            }
            if (iM216h != 1) {
                if (iM216h != 2) {
                    if (iM216h == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iM216h == 4) {
                        if (j2 < C0138c.f225u.get(this)) {
                            c0146k.m307a();
                        }
                        return new C0143h(m237r());
                    }
                    if (iM216h == 5) {
                        c0146k.m307a();
                    }
                } else {
                    if (zM239u) {
                        c0146k.m329h();
                        return new C0143h(m237r());
                    }
                    InterfaceC0064t0 interfaceC0064t0 = obj2 instanceof InterfaceC0064t0 ? (InterfaceC0064t0) obj2 : null;
                    if (interfaceC0064t0 != null) {
                        interfaceC0064t0.mo78a(c0146k, i3 + i2);
                    }
                    m232m((c0146k.f466c * j3) + ((long) i3));
                }
            }
            return c6289k;
        }
    }

    @Override // p004C0.C0138c, p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: g */
    public final Object mo227g(Object obj) {
        return m252G(obj, false);
    }

    @Override // p004C0.C0138c, p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: i */
    public final Object mo228i(InterfaceC6348c interfaceC6348c, Object obj) throws Throwable {
        if (m252G(obj, true) instanceof C0143h) {
            throw m237r();
        }
        return C6289k.f24318a;
    }

    @Override // p004C0.C0138c
    /* JADX INFO: renamed from: w */
    public final boolean mo241w() {
        return this.f264C == EnumC0136a.f216t;
    }
}
