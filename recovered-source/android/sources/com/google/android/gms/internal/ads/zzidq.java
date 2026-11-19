package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzidq implements zzigm {

    /* JADX INFO: renamed from: a */
    public final zzidp f19739a;

    /* JADX INFO: renamed from: b */
    public int f19740b;

    /* JADX INFO: renamed from: c */
    public int f19741c;

    /* JADX INFO: renamed from: d */
    public int f19742d = 0;

    public zzidq(zzidp zzidpVar) {
        zzidpVar.getClass();
        this.f19739a = zzidpVar;
        zzidpVar.f19738c = this;
    }

    /* JADX INFO: renamed from: v */
    public static final void m8203v(int i2) throws zzifh {
        if ((i2 & 3) != 0) {
            throw new zzifh("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m8204w(int i2) throws zzifh {
        if ((i2 & 7) != 0) {
            throw new zzifh("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: x */
    public static zzidq m8205x(zzidp zzidpVar) {
        Object obj = zzidpVar.f19738c;
        return obj != null ? (zzidq) obj : new zzidq(zzidpVar);
    }

    /* JADX INFO: renamed from: A */
    public final float m8206A() throws zzifg {
        m8243q(5);
        return this.f19739a.mo8173n();
    }

    /* JADX INFO: renamed from: B */
    public final long m8207B() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8174o();
    }

    /* JADX INFO: renamed from: C */
    public final long m8208C() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8175p();
    }

    /* JADX INFO: renamed from: D */
    public final int m8209D() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8176q();
    }

    /* JADX INFO: renamed from: E */
    public final long m8210E() throws zzifg {
        m8243q(1);
        return this.f19739a.mo8177r();
    }

    /* JADX INFO: renamed from: F */
    public final int m8211F() throws zzifg {
        m8243q(5);
        return this.f19739a.mo8178s();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m8212G() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8179t();
    }

    /* JADX INFO: renamed from: H */
    public final String m8213H() throws zzifg {
        m8243q(2);
        return this.f19739a.mo8180u();
    }

    /* JADX INFO: renamed from: I */
    public final String m8214I() throws zzifg {
        m8243q(2);
        return this.f19739a.mo8181v();
    }

    /* JADX INFO: renamed from: J */
    public final void m8215J(zzifz zzifzVar, zzigr zzigrVar, zzidz zzidzVar) throws zzifh {
        m8243q(2);
        m8244r(zzifzVar, zzigrVar, zzidzVar);
    }

    /* JADX INFO: renamed from: K */
    public final void m8216K(zzifz zzifzVar, zzigr zzigrVar, zzidz zzidzVar) throws zzifg {
        m8243q(3);
        m8245s(zzifzVar, zzigrVar, zzidzVar);
    }

    /* JADX INFO: renamed from: L */
    public final zzidl m8217L() throws zzifg {
        m8243q(2);
        return this.f19739a.mo8182w();
    }

    /* JADX INFO: renamed from: M */
    public final int m8218M() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8183x();
    }

    /* JADX INFO: renamed from: N */
    public final int m8219N() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8184y();
    }

    /* JADX INFO: renamed from: O */
    public final int m8220O() throws zzifg {
        m8243q(5);
        return this.f19739a.mo8185z();
    }

    /* JADX INFO: renamed from: P */
    public final long m8221P() throws zzifg {
        m8243q(1);
        return this.f19739a.mo8153A();
    }

    /* JADX INFO: renamed from: Q */
    public final int m8222Q() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8154B();
    }

    /* JADX INFO: renamed from: R */
    public final long m8223R() throws zzifg {
        m8243q(0);
        return this.f19739a.mo8155C();
    }

    /* JADX INFO: renamed from: S */
    public final void m8224S(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzidw;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzidw zzidwVar = (zzidw) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8183x = zzidpVar.mo8183x();
                m8204w(iMo8183x);
                int iMo8168d = zzidpVar.mo8168d() + iMo8183x;
                do {
                    zzidwVar.m8300b(zzidpVar.mo8172m());
                } while (zzidpVar.mo8168d() < iMo8168d);
                return;
            }
            do {
                zzidwVar.m8300b(zzidpVar.mo8172m());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8183x2 = zzidpVar.mo8183x();
                m8204w(iMo8183x2);
                int iMo8168d2 = zzidpVar.mo8168d() + iMo8183x2;
                do {
                    zzifbVar.add(Double.valueOf(zzidpVar.mo8172m()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Double.valueOf(zzidpVar.mo8172m()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: T */
    public final void m8225T(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzieg;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzieg zziegVar = (zzieg) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 == 2) {
                int iMo8183x = zzidpVar.mo8183x();
                m8203v(iMo8183x);
                int iMo8168d = zzidpVar.mo8168d() + iMo8183x;
                do {
                    zziegVar.m8316b(zzidpVar.mo8173n());
                } while (zzidpVar.mo8168d() < iMo8168d);
                return;
            }
            if (i2 != 5) {
                throw new zzifg();
            }
            do {
                zziegVar.m8316b(zzidpVar.mo8173n());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 == 2) {
                int iMo8183x2 = zzidpVar.mo8183x();
                m8203v(iMo8183x2);
                int iMo8168d2 = zzidpVar.mo8168d() + iMo8183x2;
                do {
                    zzifbVar.add(Float.valueOf(zzidpVar.mo8173n()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                return;
            }
            if (i3 != 5) {
                throw new zzifg();
            }
            do {
                zzifbVar.add(Float.valueOf(zzidpVar.mo8173n()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: U */
    public final void m8226U(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzifn;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzifn zzifnVar = (zzifn) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifnVar.mo8353f(zzidpVar.mo8174o());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzifnVar.mo8353f(zzidpVar.mo8174o());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Long.valueOf(zzidpVar.mo8174o()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Long.valueOf(zzidpVar.mo8174o()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: a */
    public final void m8227a(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzifn;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzifn zzifnVar = (zzifn) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifnVar.mo8353f(zzidpVar.mo8175p());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzifnVar.mo8353f(zzidpVar.mo8175p());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Long.valueOf(zzidpVar.mo8175p()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Long.valueOf(zzidpVar.mo8175p()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m8228b(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzieq;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzieq zzieqVar = (zzieq) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzieqVar.mo8348I(zzidpVar.mo8176q());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzieqVar.mo8348I(zzidpVar.mo8176q());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Integer.valueOf(zzidpVar.mo8176q()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Integer.valueOf(zzidpVar.mo8176q()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: c */
    public final void m8229c(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzifn;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzifn zzifnVar = (zzifn) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8183x = zzidpVar.mo8183x();
                m8204w(iMo8183x);
                int iMo8168d = zzidpVar.mo8168d() + iMo8183x;
                do {
                    zzifnVar.mo8353f(zzidpVar.mo8177r());
                } while (zzidpVar.mo8168d() < iMo8168d);
                return;
            }
            do {
                zzifnVar.mo8353f(zzidpVar.mo8177r());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8183x2 = zzidpVar.mo8183x();
                m8204w(iMo8183x2);
                int iMo8168d2 = zzidpVar.mo8168d() + iMo8183x2;
                do {
                    zzifbVar.add(Long.valueOf(zzidpVar.mo8177r()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Long.valueOf(zzidpVar.mo8177r()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: d */
    public final void m8230d(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzieq;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzieq zzieqVar = (zzieq) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 == 2) {
                int iMo8183x = zzidpVar.mo8183x();
                m8203v(iMo8183x);
                int iMo8168d = zzidpVar.mo8168d() + iMo8183x;
                do {
                    zzieqVar.mo8348I(zzidpVar.mo8178s());
                } while (zzidpVar.mo8168d() < iMo8168d);
                return;
            }
            if (i2 != 5) {
                throw new zzifg();
            }
            do {
                zzieqVar.mo8348I(zzidpVar.mo8178s());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 == 2) {
                int iMo8183x2 = zzidpVar.mo8183x();
                m8203v(iMo8183x2);
                int iMo8168d2 = zzidpVar.mo8168d() + iMo8183x2;
                do {
                    zzifbVar.add(Integer.valueOf(zzidpVar.mo8178s()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                return;
            }
            if (i3 != 5) {
                throw new zzifg();
            }
            do {
                zzifbVar.add(Integer.valueOf(zzidpVar.mo8178s()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: e */
    public final void m8231e(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzidb;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzidb zzidbVar = (zzidb) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzidbVar.m8124b(zzidpVar.mo8179t());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzidbVar.m8124b(zzidpVar.mo8179t());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Boolean.valueOf(zzidpVar.mo8179t()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Boolean.valueOf(zzidpVar.mo8179t()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: f */
    public final void m8232f(zzifb zzifbVar, boolean z) throws zzifg {
        int iMo8169j;
        int iMo8169j2;
        if ((this.f19740b & 7) != 2) {
            throw new zzifg();
        }
        boolean z2 = zzifbVar instanceof zzifk;
        zzidp zzidpVar = this.f19739a;
        if (z2 && !z) {
            zzifk zzifkVar = (zzifk) zzifbVar;
            do {
                m8217L();
                zzifkVar.zzb();
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            do {
                zzifbVar.add(z ? m8214I() : m8213H());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: g */
    public final void m8233g(zzifb zzifbVar, zzigr zzigrVar, zzidz zzidzVar) throws zzifh {
        int iMo8169j;
        int i2 = this.f19740b;
        if ((i2 & 7) != 2) {
            throw new zzifg();
        }
        do {
            Object objZza = zzigrVar.zza();
            m8244r(objZza, zzigrVar, zzidzVar);
            zzigrVar.mo8395c(objZza);
            zzifbVar.add(objZza);
            zzidp zzidpVar = this.f19739a;
            if (zzidpVar.mo8167c() || this.f19742d != 0) {
                return;
            } else {
                iMo8169j = zzidpVar.mo8169j();
            }
        } while (iMo8169j == i2);
        this.f19742d = iMo8169j;
    }

    /* JADX INFO: renamed from: h */
    public final void m8234h(zzifb zzifbVar, zzigr zzigrVar, zzidz zzidzVar) throws zzifg {
        int iMo8169j;
        int i2 = this.f19740b;
        if ((i2 & 7) != 3) {
            throw new zzifg();
        }
        do {
            Object objZza = zzigrVar.zza();
            m8245s(objZza, zzigrVar, zzidzVar);
            zzigrVar.mo8395c(objZza);
            zzifbVar.add(objZza);
            zzidp zzidpVar = this.f19739a;
            if (zzidpVar.mo8167c() || this.f19742d != 0) {
                return;
            } else {
                iMo8169j = zzidpVar.mo8169j();
            }
        } while (iMo8169j == i2);
        this.f19742d = iMo8169j;
    }

    /* JADX INFO: renamed from: i */
    public final void m8235i(zzifb zzifbVar) throws zzifg {
        int iMo8169j;
        if ((this.f19740b & 7) != 2) {
            throw new zzifg();
        }
        do {
            zzifbVar.add(m8217L());
            zzidp zzidpVar = this.f19739a;
            if (zzidpVar.mo8167c()) {
                return;
            } else {
                iMo8169j = zzidpVar.mo8169j();
            }
        } while (iMo8169j == this.f19740b);
        this.f19742d = iMo8169j;
    }

    /* JADX INFO: renamed from: j */
    public final void m8236j(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzieq;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzieq zzieqVar = (zzieq) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzieqVar.mo8348I(zzidpVar.mo8183x());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzieqVar.mo8348I(zzidpVar.mo8183x());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Integer.valueOf(zzidpVar.mo8183x()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Integer.valueOf(zzidpVar.mo8183x()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: k */
    public final void m8237k(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzieq;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzieq zzieqVar = (zzieq) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzieqVar.mo8348I(zzidpVar.mo8184y());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzieqVar.mo8348I(zzidpVar.mo8184y());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Integer.valueOf(zzidpVar.mo8184y()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Integer.valueOf(zzidpVar.mo8184y()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: l */
    public final void m8238l(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzieq;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzieq zzieqVar = (zzieq) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 == 2) {
                int iMo8183x = zzidpVar.mo8183x();
                m8203v(iMo8183x);
                int iMo8168d = zzidpVar.mo8168d() + iMo8183x;
                do {
                    zzieqVar.mo8348I(zzidpVar.mo8185z());
                } while (zzidpVar.mo8168d() < iMo8168d);
                return;
            }
            if (i2 != 5) {
                throw new zzifg();
            }
            do {
                zzieqVar.mo8348I(zzidpVar.mo8185z());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 == 2) {
                int iMo8183x2 = zzidpVar.mo8183x();
                m8203v(iMo8183x2);
                int iMo8168d2 = zzidpVar.mo8168d() + iMo8183x2;
                do {
                    zzifbVar.add(Integer.valueOf(zzidpVar.mo8185z()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                return;
            }
            if (i3 != 5) {
                throw new zzifg();
            }
            do {
                zzifbVar.add(Integer.valueOf(zzidpVar.mo8185z()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: m */
    public final void m8239m(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzifn;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzifn zzifnVar = (zzifn) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8183x = zzidpVar.mo8183x();
                m8204w(iMo8183x);
                int iMo8168d = zzidpVar.mo8168d() + iMo8183x;
                do {
                    zzifnVar.mo8353f(zzidpVar.mo8153A());
                } while (zzidpVar.mo8168d() < iMo8168d);
                return;
            }
            do {
                zzifnVar.mo8353f(zzidpVar.mo8153A());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8183x2 = zzidpVar.mo8183x();
                m8204w(iMo8183x2);
                int iMo8168d2 = zzidpVar.mo8168d() + iMo8183x2;
                do {
                    zzifbVar.add(Long.valueOf(zzidpVar.mo8153A()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Long.valueOf(zzidpVar.mo8153A()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: n */
    public final void m8240n(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzieq;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzieq zzieqVar = (zzieq) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzieqVar.mo8348I(zzidpVar.mo8154B());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzieqVar.mo8348I(zzidpVar.mo8154B());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Integer.valueOf(zzidpVar.mo8154B()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Integer.valueOf(zzidpVar.mo8154B()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: o */
    public final void m8241o(zzifb zzifbVar) throws zzifh {
        int iMo8169j;
        int iMo8169j2;
        boolean z = zzifbVar instanceof zzifn;
        zzidp zzidpVar = this.f19739a;
        if (z) {
            zzifn zzifnVar = (zzifn) zzifbVar;
            int i2 = this.f19740b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg();
                }
                int iMo8168d = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifnVar.mo8353f(zzidpVar.mo8155C());
                } while (zzidpVar.mo8168d() < iMo8168d);
                m8247u(iMo8168d);
                return;
            }
            do {
                zzifnVar.mo8353f(zzidpVar.mo8155C());
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j2 = zzidpVar.mo8169j();
                }
            } while (iMo8169j2 == this.f19740b);
        } else {
            int i3 = this.f19740b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzifg();
                }
                int iMo8168d2 = zzidpVar.mo8168d() + zzidpVar.mo8183x();
                do {
                    zzifbVar.add(Long.valueOf(zzidpVar.mo8155C()));
                } while (zzidpVar.mo8168d() < iMo8168d2);
                m8247u(iMo8168d2);
                return;
            }
            do {
                zzifbVar.add(Long.valueOf(zzidpVar.mo8155C()));
                if (zzidpVar.mo8167c()) {
                    return;
                } else {
                    iMo8169j = zzidpVar.mo8169j();
                }
            } while (iMo8169j == this.f19740b);
            iMo8169j2 = iMo8169j;
        }
        this.f19742d = iMo8169j2;
    }

    /* JADX INFO: renamed from: p */
    public final void m8242p(zzift zziftVar, zzifr zzifrVar, zzidz zzidzVar) throws zzifg {
        int i2;
        int i3;
        m8243q(2);
        zzidp zzidpVar = this.f19739a;
        int iMo8165a = zzidpVar.mo8165a(zzidpVar.mo8183x());
        Object obj = zzifrVar.f19834c;
        Object objM8246t = "";
        Object objM8246t2 = obj;
        while (true) {
            try {
                int iM8248y = m8248y();
                if (iM8248y == Integer.MAX_VALUE || zzidpVar.mo8167c()) {
                    break;
                }
                boolean zMo8171l = false;
                if (iM8248y == 1) {
                    objM8246t = m8246t(zzifrVar.f19832a, null, null);
                } else if (iM8248y != 2) {
                    try {
                        if (!((zzidpVar.mo8167c() || (i3 = this.f19740b) == this.f19741c) ? false : zzidpVar.mo8171l(i3))) {
                            throw new zzifh("Unable to parse map entry.");
                        }
                    } catch (zzifg e) {
                        if (!zzidpVar.mo8167c() && (i2 = this.f19740b) != this.f19741c) {
                            zMo8171l = zzidpVar.mo8171l(i2);
                        }
                        if (!zMo8171l) {
                            throw new zzifh("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM8246t2 = m8246t(zzifrVar.f19833b, obj.getClass(), zzidzVar);
                }
            } catch (Throwable th) {
                zzidpVar.mo8166b(iMo8165a);
                throw th;
            }
        }
        zziftVar.put(objM8246t, objM8246t2);
        zzidpVar.mo8166b(iMo8165a);
    }

    /* JADX INFO: renamed from: q */
    public final void m8243q(int i2) throws zzifg {
        if ((this.f19740b & 7) != i2) {
            throw new zzifg();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8244r(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVar = this.f19739a;
        int iMo8183x = zzidpVar.mo8183x();
        if (zzidpVar.f19736a + zzidpVar.f19737b >= 100) {
            throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo8165a = zzidpVar.mo8165a(iMo8183x);
        zzidpVar.f19736a++;
        zzigrVar.mo8398f(obj, this, zzidzVar);
        zzidpVar.mo8170k(0);
        zzidpVar.f19736a--;
        zzidpVar.mo8166b(iMo8165a);
    }

    /* JADX INFO: renamed from: s */
    public final void m8245s(Object obj, zzigr zzigrVar, zzidz zzidzVar) {
        int i2 = this.f19741c;
        this.f19741c = ((this.f19740b >>> 3) << 3) | 4;
        try {
            zzigrVar.mo8398f(obj, this, zzidzVar);
            if (this.f19740b != this.f19741c) {
                throw new zzifh("Failed to parse the message.");
            }
            this.f19741c = i2;
        } catch (Throwable th) {
            this.f19741c = i2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public final Object m8246t(zzihq zzihqVar, Class cls, zzidz zzidzVar) throws zzifh {
        zzihq zzihqVar2 = zzihq.f19911u;
        switch (zzihqVar.ordinal()) {
            case 0:
                return Double.valueOf(m8249z());
            case 1:
                return Float.valueOf(m8206A());
            case 2:
                return Long.valueOf(m8208C());
            case 3:
                return Long.valueOf(m8207B());
            case 4:
                return Integer.valueOf(m8209D());
            case 5:
                return Long.valueOf(m8210E());
            case 6:
                return Integer.valueOf(m8211F());
            case 7:
                return Boolean.valueOf(m8212G());
            case 8:
                return m8214I();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                m8243q(2);
                zzigr zzigrVarM8411a = zzigj.f19860c.m8411a(cls);
                Object objZza = zzigrVarM8411a.zza();
                m8244r(objZza, zzigrVarM8411a, zzidzVar);
                zzigrVarM8411a.mo8395c(objZza);
                return objZza;
            case 11:
                return m8217L();
            case 12:
                return Integer.valueOf(m8218M());
            case 13:
                return Integer.valueOf(m8219N());
            case 14:
                return Integer.valueOf(m8220O());
            case 15:
                return Long.valueOf(m8221P());
            case 16:
                return Integer.valueOf(m8222Q());
            case 17:
                return Long.valueOf(m8223R());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8247u(int i2) throws zzifh {
        if (this.f19739a.mo8168d() != i2) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m8248y() {
        int iMo8169j = this.f19742d;
        if (iMo8169j != 0) {
            this.f19740b = iMo8169j;
            this.f19742d = 0;
        } else {
            iMo8169j = this.f19739a.mo8169j();
            this.f19740b = iMo8169j;
        }
        if (iMo8169j == 0 || iMo8169j == this.f19741c) {
            return Integer.MAX_VALUE;
        }
        return iMo8169j >>> 3;
    }

    /* JADX INFO: renamed from: z */
    public final double m8249z() throws zzifg {
        m8243q(1);
        return this.f19739a.mo8172m();
    }
}
