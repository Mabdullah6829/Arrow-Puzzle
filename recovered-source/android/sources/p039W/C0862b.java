package p039W;

import p011H.AbstractC0271e0;
import p033S0.AbstractC0608b;
import p033S0.C0616j;

/* JADX INFO: renamed from: W.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0862b {

    /* JADX INFO: renamed from: d */
    public static final C0616j f2399d;

    /* JADX INFO: renamed from: e */
    public static final C0616j f2400e;

    /* JADX INFO: renamed from: f */
    public static final C0616j f2401f;

    /* JADX INFO: renamed from: g */
    public static final C0616j f2402g;

    /* JADX INFO: renamed from: h */
    public static final C0616j f2403h;

    /* JADX INFO: renamed from: a */
    public final C0616j f2404a;

    /* JADX INFO: renamed from: b */
    public final C0616j f2405b;

    /* JADX INFO: renamed from: c */
    public final int f2406c;

    static {
        C0616j c0616j = C0616j.f1343v;
        f2399d = AbstractC0608b.m1371d(":status");
        f2400e = AbstractC0608b.m1371d(":method");
        f2401f = AbstractC0608b.m1371d(":path");
        f2402g = AbstractC0608b.m1371d(":scheme");
        f2403h = AbstractC0608b.m1371d(":authority");
        AbstractC0608b.m1371d(":host");
        AbstractC0608b.m1371d(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0862b(C0616j c0616j, String str) {
        this(c0616j, AbstractC0608b.m1371d(str));
        C0616j c0616j2 = C0616j.f1343v;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0862b) {
            C0862b c0862b = (C0862b) obj;
            if (this.f2404a.equals(c0862b.f2404a) && this.f2405b.equals(c0862b.f2405b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2405b.hashCode() + ((this.f2404a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return AbstractC0271e0.m415w(this.f2404a.m1415t(), ": ", this.f2405b.m1415t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0862b(String str, String str2) {
        this(AbstractC0608b.m1371d(str), AbstractC0608b.m1371d(str2));
        C0616j c0616j = C0616j.f1343v;
    }

    public C0862b(C0616j c0616j, C0616j c0616j2) {
        this.f2404a = c0616j;
        this.f2405b = c0616j2;
        this.f2406c = c0616j2.mo1404e() + c0616j.mo1404e() + 32;
    }
}
