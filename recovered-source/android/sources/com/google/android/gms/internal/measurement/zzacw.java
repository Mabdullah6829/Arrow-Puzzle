package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzacw implements zzafo {

    /* JADX INFO: renamed from: a */
    public final zzacv f21991a;

    /* JADX INFO: renamed from: b */
    public int f21992b;

    /* JADX INFO: renamed from: c */
    public int f21993c;

    /* JADX INFO: renamed from: d */
    public int f21994d = 0;

    public zzacw(zzacv zzacvVar) {
        this.f21991a = zzacvVar;
        zzacvVar.f21990c = this;
    }

    /* JADX INFO: renamed from: v */
    public static final void m9434v(int i2) throws zzaeh {
        if ((i2 & 3) != 0) {
            throw new zzaeh("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m9435w(int i2) throws zzaeh {
        if ((i2 & 7) != 0) {
            throw new zzaeh("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: A */
    public final long m9436A() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9411q();
    }

    /* JADX INFO: renamed from: B */
    public final long m9437B() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9412r();
    }

    /* JADX INFO: renamed from: C */
    public final int m9438C() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9413s();
    }

    /* JADX INFO: renamed from: D */
    public final long m9439D() throws zzaeg {
        m9472q(1);
        return this.f21991a.mo9414t();
    }

    /* JADX INFO: renamed from: E */
    public final int m9440E() throws zzaeg {
        m9472q(5);
        return this.f21991a.mo9415u();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9441F() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9416v();
    }

    /* JADX INFO: renamed from: G */
    public final String m9442G() throws zzaeg {
        m9472q(2);
        return this.f21991a.mo9417w();
    }

    /* JADX INFO: renamed from: H */
    public final String m9443H() throws zzaeg {
        m9472q(2);
        return this.f21991a.mo9418x();
    }

    /* JADX INFO: renamed from: I */
    public final void m9444I(zzafc zzafcVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeh {
        m9472q(2);
        m9473r(zzafcVar, zzafpVar, zzadfVar);
    }

    /* JADX INFO: renamed from: J */
    public final void m9445J(zzafc zzafcVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeg {
        m9472q(3);
        m9474s(zzafcVar, zzafpVar, zzadfVar);
    }

    /* JADX INFO: renamed from: K */
    public final zzacr m9446K() throws zzaeg {
        m9472q(2);
        return this.f21991a.mo9419y();
    }

    /* JADX INFO: renamed from: L */
    public final int m9447L() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9384A();
    }

    /* JADX INFO: renamed from: M */
    public final int m9448M() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9385B();
    }

    /* JADX INFO: renamed from: N */
    public final int m9449N() throws zzaeg {
        m9472q(5);
        return this.f21991a.mo9386C();
    }

    /* JADX INFO: renamed from: O */
    public final long m9450O() throws zzaeg {
        m9472q(1);
        return this.f21991a.mo9387D();
    }

    /* JADX INFO: renamed from: P */
    public final int m9451P() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9388E();
    }

    /* JADX INFO: renamed from: Q */
    public final long m9452Q() throws zzaeg {
        m9472q(0);
        return this.f21991a.mo9389F();
    }

    /* JADX INFO: renamed from: R */
    public final void m9453R(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadc;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadc zzadcVar = (zzadc) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9384A = zzacvVar.mo9384A();
                m9435w(iMo9384A);
                int iMo9403e = zzacvVar.mo9403e() + iMo9384A;
                do {
                    zzadcVar.m9532b(zzacvVar.mo9409o());
                } while (zzacvVar.mo9403e() < iMo9403e);
                return;
            }
            do {
                zzadcVar.m9532b(zzacvVar.mo9409o());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9384A2 = zzacvVar.mo9384A();
                m9435w(iMo9384A2);
                int iMo9403e2 = zzacvVar.mo9403e() + iMo9384A2;
                do {
                    zzaefVar.add(Double.valueOf(zzacvVar.mo9409o()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Double.valueOf(zzacvVar.mo9409o()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: S */
    public final void m9454S(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadm;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadm zzadmVar = (zzadm) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 == 2) {
                int iMo9384A = zzacvVar.mo9384A();
                m9434v(iMo9384A);
                int iMo9403e = zzacvVar.mo9403e() + iMo9384A;
                do {
                    zzadmVar.m9545b(zzacvVar.mo9410p());
                } while (zzacvVar.mo9403e() < iMo9403e);
                return;
            }
            if (i2 != 5) {
                throw new zzaeg();
            }
            do {
                zzadmVar.m9545b(zzacvVar.mo9410p());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 == 2) {
                int iMo9384A2 = zzacvVar.mo9384A();
                m9434v(iMo9384A2);
                int iMo9403e2 = zzacvVar.mo9403e() + iMo9384A2;
                do {
                    zzaefVar.add(Float.valueOf(zzacvVar.mo9410p()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                return;
            }
            if (i3 != 5) {
                throw new zzaeg();
            }
            do {
                zzaefVar.add(Float.valueOf(zzacvVar.mo9410p()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: T */
    public final void m9455T(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaeqVar.m9602b(zzacvVar.mo9411q());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzaeqVar.m9602b(zzacvVar.mo9411q());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.mo9411q()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.mo9411q()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: a */
    public final void m9456a(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaeqVar.m9602b(zzacvVar.mo9412r());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzaeqVar.m9602b(zzacvVar.mo9412r());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.mo9412r()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.mo9412r()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: b */
    public final void m9457b(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzadvVar.m9575b(zzacvVar.mo9413s());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzadvVar.m9575b(zzacvVar.mo9413s());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.mo9413s()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.mo9413s()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: c */
    public final void m9458c(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9384A = zzacvVar.mo9384A();
                m9435w(iMo9384A);
                int iMo9403e = zzacvVar.mo9403e() + iMo9384A;
                do {
                    zzaeqVar.m9602b(zzacvVar.mo9414t());
                } while (zzacvVar.mo9403e() < iMo9403e);
                return;
            }
            do {
                zzaeqVar.m9602b(zzacvVar.mo9414t());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9384A2 = zzacvVar.mo9384A();
                m9435w(iMo9384A2);
                int iMo9403e2 = zzacvVar.mo9403e() + iMo9384A2;
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.mo9414t()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.mo9414t()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: d */
    public final void m9459d(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 == 2) {
                int iMo9384A = zzacvVar.mo9384A();
                m9434v(iMo9384A);
                int iMo9403e = zzacvVar.mo9403e() + iMo9384A;
                do {
                    zzadvVar.m9575b(zzacvVar.mo9415u());
                } while (zzacvVar.mo9403e() < iMo9403e);
                return;
            }
            if (i2 != 5) {
                throw new zzaeg();
            }
            do {
                zzadvVar.m9575b(zzacvVar.mo9415u());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 == 2) {
                int iMo9384A2 = zzacvVar.mo9384A();
                m9434v(iMo9384A2);
                int iMo9403e2 = zzacvVar.mo9403e() + iMo9384A2;
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.mo9415u()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                return;
            }
            if (i3 != 5) {
                throw new zzaeg();
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.mo9415u()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: e */
    public final void m9460e(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzaci;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzaci zzaciVar = (zzaci) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaciVar.m9368b(zzacvVar.mo9416v());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzaciVar.m9368b(zzacvVar.mo9416v());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Boolean.valueOf(zzacvVar.mo9416v()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Boolean.valueOf(zzacvVar.mo9416v()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: f */
    public final void m9461f(zzaef zzaefVar, boolean z) throws zzaeg {
        int iMo9406l;
        int iMo9406l2;
        if ((this.f21992b & 7) != 2) {
            throw new zzaeg();
        }
        boolean z2 = zzaefVar instanceof zzaen;
        zzacv zzacvVar = this.f21991a;
        if (z2 && !z) {
            zzaen zzaenVar = (zzaen) zzaefVar;
            do {
                m9446K();
                zzaenVar.zzb();
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            do {
                zzaefVar.add(z ? m9443H() : m9442G());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: g */
    public final void m9462g(zzaef zzaefVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeh {
        int iMo9406l;
        int i2 = this.f21992b;
        if ((i2 & 7) != 2) {
            throw new zzaeg();
        }
        do {
            Object objZza = zzafpVar.zza();
            m9473r(objZza, zzafpVar, zzadfVar);
            zzafpVar.mo9633c(objZza);
            zzaefVar.add(objZza);
            zzacv zzacvVar = this.f21991a;
            if (zzacvVar.mo9402d() || this.f21994d != 0) {
                return;
            } else {
                iMo9406l = zzacvVar.mo9406l();
            }
        } while (iMo9406l == i2);
        this.f21994d = iMo9406l;
    }

    /* JADX INFO: renamed from: h */
    public final void m9463h(zzaef zzaefVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeg {
        int iMo9406l;
        int i2 = this.f21992b;
        if ((i2 & 7) != 3) {
            throw new zzaeg();
        }
        do {
            Object objZza = zzafpVar.zza();
            m9474s(objZza, zzafpVar, zzadfVar);
            zzafpVar.mo9633c(objZza);
            zzaefVar.add(objZza);
            zzacv zzacvVar = this.f21991a;
            if (zzacvVar.mo9402d() || this.f21994d != 0) {
                return;
            } else {
                iMo9406l = zzacvVar.mo9406l();
            }
        } while (iMo9406l == i2);
        this.f21994d = iMo9406l;
    }

    /* JADX INFO: renamed from: i */
    public final void m9464i(zzaef zzaefVar) throws zzaeg {
        int iMo9406l;
        if ((this.f21992b & 7) != 2) {
            throw new zzaeg();
        }
        do {
            zzaefVar.add(m9446K());
            zzacv zzacvVar = this.f21991a;
            if (zzacvVar.mo9402d()) {
                return;
            } else {
                iMo9406l = zzacvVar.mo9406l();
            }
        } while (iMo9406l == this.f21992b);
        this.f21994d = iMo9406l;
    }

    /* JADX INFO: renamed from: j */
    public final void m9465j(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzadvVar.m9575b(zzacvVar.mo9384A());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzadvVar.m9575b(zzacvVar.mo9384A());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.mo9384A()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.mo9384A()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: k */
    public final void m9466k(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzadvVar.m9575b(zzacvVar.mo9385B());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzadvVar.m9575b(zzacvVar.mo9385B());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.mo9385B()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.mo9385B()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: l */
    public final void m9467l(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 == 2) {
                int iMo9384A = zzacvVar.mo9384A();
                m9434v(iMo9384A);
                int iMo9403e = zzacvVar.mo9403e() + iMo9384A;
                do {
                    zzadvVar.m9575b(zzacvVar.mo9386C());
                } while (zzacvVar.mo9403e() < iMo9403e);
                return;
            }
            if (i2 != 5) {
                throw new zzaeg();
            }
            do {
                zzadvVar.m9575b(zzacvVar.mo9386C());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 == 2) {
                int iMo9384A2 = zzacvVar.mo9384A();
                m9434v(iMo9384A2);
                int iMo9403e2 = zzacvVar.mo9403e() + iMo9384A2;
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.mo9386C()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                return;
            }
            if (i3 != 5) {
                throw new zzaeg();
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.mo9386C()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: m */
    public final void m9468m(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9384A = zzacvVar.mo9384A();
                m9435w(iMo9384A);
                int iMo9403e = zzacvVar.mo9403e() + iMo9384A;
                do {
                    zzaeqVar.m9602b(zzacvVar.mo9387D());
                } while (zzacvVar.mo9403e() < iMo9403e);
                return;
            }
            do {
                zzaeqVar.m9602b(zzacvVar.mo9387D());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9384A2 = zzacvVar.mo9384A();
                m9435w(iMo9384A2);
                int iMo9403e2 = zzacvVar.mo9403e() + iMo9384A2;
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.mo9387D()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.mo9387D()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: n */
    public final void m9469n(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzadvVar.m9575b(zzacvVar.mo9388E());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzadvVar.m9575b(zzacvVar.mo9388E());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.mo9388E()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.mo9388E()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: o */
    public final void m9470o(zzaef zzaefVar) throws zzaeh {
        int iMo9406l;
        int iMo9406l2;
        boolean z = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f21991a;
        if (z) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i2 = this.f21992b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaeqVar.m9602b(zzacvVar.mo9389F());
                } while (zzacvVar.mo9403e() < iMo9403e);
                m9476u(iMo9403e);
                return;
            }
            do {
                zzaeqVar.m9602b(zzacvVar.mo9389F());
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l2 = zzacvVar.mo9406l();
                }
            } while (iMo9406l2 == this.f21992b);
        } else {
            int i3 = this.f21992b & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzaeg();
                }
                int iMo9403e2 = zzacvVar.mo9403e() + zzacvVar.mo9384A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.mo9389F()));
                } while (zzacvVar.mo9403e() < iMo9403e2);
                m9476u(iMo9403e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.mo9389F()));
                if (zzacvVar.mo9402d()) {
                    return;
                } else {
                    iMo9406l = zzacvVar.mo9406l();
                }
            } while (iMo9406l == this.f21992b);
            iMo9406l2 = iMo9406l;
        }
        this.f21994d = iMo9406l2;
    }

    /* JADX INFO: renamed from: p */
    public final void m9471p(zzaew zzaewVar, zzaeu zzaeuVar, zzadf zzadfVar) throws zzaeg {
        int i2;
        int i3;
        m9472q(2);
        zzacv zzacvVar = this.f21991a;
        int iMo9399a = zzacvVar.mo9399a(zzacvVar.mo9384A());
        Object obj = zzaeuVar.f22067c;
        Object objM9475t = "";
        Object objM9475t2 = obj;
        while (true) {
            try {
                int iM9477x = m9477x();
                if (iM9477x == Integer.MAX_VALUE || zzacvVar.mo9402d()) {
                    break;
                }
                boolean zMo9408n = false;
                if (iM9477x == 1) {
                    objM9475t = m9475t(zzaeuVar.f22065a, null, null);
                } else if (iM9477x != 2) {
                    try {
                        if (!((zzacvVar.mo9402d() || (i3 = this.f21992b) == this.f21993c) ? false : zzacvVar.mo9408n(i3))) {
                            throw new zzaeh("Unable to parse map entry.");
                        }
                    } catch (zzaeg e) {
                        if (!zzacvVar.mo9402d() && (i2 = this.f21992b) != this.f21993c) {
                            zMo9408n = zzacvVar.mo9408n(i2);
                        }
                        if (!zMo9408n) {
                            throw new zzaeh("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM9475t2 = m9475t(zzaeuVar.f22066b, obj.getClass(), zzadfVar);
                }
            } catch (Throwable th) {
                zzacvVar.mo9400b(iMo9399a);
                throw th;
            }
        }
        zzaewVar.put(objM9475t, objM9475t2);
        zzacvVar.mo9400b(iMo9399a);
    }

    /* JADX INFO: renamed from: q */
    public final void m9472q(int i2) throws zzaeg {
        if ((this.f21992b & 7) != i2) {
            throw new zzaeg();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9473r(Object obj, zzafp zzafpVar, zzadf zzadfVar) throws zzaeh {
        zzacv zzacvVar = this.f21991a;
        int iMo9384A = zzacvVar.mo9384A();
        if (zzacvVar.f21988a + zzacvVar.f21989b >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo9399a = zzacvVar.mo9399a(iMo9384A);
        zzacvVar.f21988a++;
        zzafpVar.mo9638h(obj, this, zzadfVar);
        zzacvVar.mo9407m(0);
        zzacvVar.f21988a--;
        zzacvVar.mo9400b(iMo9399a);
    }

    /* JADX INFO: renamed from: s */
    public final void m9474s(Object obj, zzafp zzafpVar, zzadf zzadfVar) {
        int i2 = this.f21993c;
        this.f21993c = ((this.f21992b >>> 3) << 3) | 4;
        try {
            zzafpVar.mo9638h(obj, this, zzadfVar);
            if (this.f21992b != this.f21993c) {
                throw new zzaeh("Failed to parse the message.");
            }
            this.f21993c = i2;
        } catch (Throwable th) {
            this.f21993c = i2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public final Object m9475t(zzagm zzagmVar, Class cls, zzadf zzadfVar) throws zzaeh {
        zzagm zzagmVar2 = zzagm.f22134u;
        switch (zzagmVar.ordinal()) {
            case 0:
                return Double.valueOf(m9478y());
            case 1:
                return Float.valueOf(m9479z());
            case 2:
                return Long.valueOf(m9437B());
            case 3:
                return Long.valueOf(m9436A());
            case 4:
                return Integer.valueOf(m9438C());
            case 5:
                return Long.valueOf(m9439D());
            case 6:
                return Integer.valueOf(m9440E());
            case 7:
                return Boolean.valueOf(m9441F());
            case 8:
                return m9443H();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                m9472q(2);
                zzafp zzafpVarM9649a = zzafl.f22093c.m9649a(cls);
                Object objZza = zzafpVarM9649a.zza();
                m9473r(objZza, zzafpVarM9649a, zzadfVar);
                zzafpVarM9649a.mo9633c(objZza);
                return objZza;
            case 11:
                return m9446K();
            case 12:
                return Integer.valueOf(m9447L());
            case 13:
                return Integer.valueOf(m9448M());
            case 14:
                return Integer.valueOf(m9449N());
            case 15:
                return Long.valueOf(m9450O());
            case 16:
                return Integer.valueOf(m9451P());
            case 17:
                return Long.valueOf(m9452Q());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9476u(int i2) throws zzaeh {
        if (this.f21991a.mo9403e() != i2) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m9477x() {
        int iMo9406l = this.f21994d;
        if (iMo9406l != 0) {
            this.f21992b = iMo9406l;
            this.f21994d = 0;
        } else {
            iMo9406l = this.f21991a.mo9406l();
            this.f21992b = iMo9406l;
        }
        if (iMo9406l == 0 || iMo9406l == this.f21993c) {
            return Integer.MAX_VALUE;
        }
        return iMo9406l >>> 3;
    }

    /* JADX INFO: renamed from: y */
    public final double m9478y() throws zzaeg {
        m9472q(1);
        return this.f21991a.mo9409o();
    }

    /* JADX INFO: renamed from: z */
    public final float m9479z() throws zzaeg {
        m9472q(5);
        return this.f21991a.mo9410p();
    }
}
