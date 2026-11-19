package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6263t {

    /* JADX INFO: renamed from: a */
    public final AbstractC6261s f24262a;

    /* JADX INFO: renamed from: b */
    public int f24263b;

    /* JADX INFO: renamed from: c */
    public int f24264c;

    /* JADX INFO: renamed from: d */
    public int f24265d = 0;

    public C6263t(AbstractC6261s abstractC6261s) {
        AbstractC6213a0.m11832a(abstractC6261s, "input");
        this.f24262a = abstractC6261s;
        abstractC6261s.f24261c = this;
    }

    /* JADX INFO: renamed from: y */
    public static void m11970y(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.m11743g();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m11971z(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.m11743g();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m11972a() {
        int i2 = this.f24265d;
        if (i2 != 0) {
            this.f24263b = i2;
            this.f24265d = 0;
        } else {
            this.f24263b = this.f24262a.mo11932z();
        }
        int i3 = this.f24263b;
        if (i3 == 0 || i3 == this.f24264c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public final void m11973b(Object obj, InterfaceC6178I0 interfaceC6178I0, C6161A c6161a) {
        int i2 = this.f24264c;
        this.f24264c = ((this.f24263b >>> 3) << 3) | 4;
        try {
            interfaceC6178I0.mo11732b(obj, this, c6161a);
            if (this.f24263b != this.f24264c) {
                throw InvalidProtocolBufferException.m11743g();
            }
            this.f24264c = i2;
        } catch (Throwable th) {
            this.f24264c = i2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11974c(Object obj, InterfaceC6178I0 interfaceC6178I0, C6161A c6161a) {
        AbstractC6261s abstractC6261s = this.f24262a;
        int iMo11902A = abstractC6261s.mo11902A();
        if (abstractC6261s.f24259a >= abstractC6261s.f24260b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo11916i = abstractC6261s.mo11916i(iMo11902A);
        abstractC6261s.f24259a++;
        interfaceC6178I0.mo11732b(obj, this, c6161a);
        abstractC6261s.mo11912a(0);
        abstractC6261s.f24259a--;
        abstractC6261s.mo11915h(iMo11916i);
    }

    /* JADX INFO: renamed from: d */
    public final void m11975d(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6233h;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC6261s.mo11917j()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Boolean.valueOf(abstractC6261s.mo11917j()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6233h c6233h = (C6233h) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6233h.addBoolean(abstractC6261s.mo11917j());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6233h.addBoolean(abstractC6261s.mo11917j());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC6251n m11976e() {
        m11994w(2);
        return this.f24262a.mo11918k();
    }

    /* JADX INFO: renamed from: f */
    public final void m11977f(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo11932z;
        if ((this.f24263b & 7) != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        do {
            list.add(m11976e());
            AbstractC6261s abstractC6261s = this.f24262a;
            if (abstractC6261s.mo11914e()) {
                return;
            } else {
                iMo11932z = abstractC6261s.mo11932z();
            }
        } while (iMo11932z == this.f24263b);
        this.f24265d = iMo11932z;
    }

    /* JADX INFO: renamed from: g */
    public final void m11978g(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6271x;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(abstractC6261s.mo11919l()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11902A = abstractC6261s.mo11902A();
            m11971z(iMo11902A);
            int iMo11913d = abstractC6261s.mo11913d() + iMo11902A;
            do {
                list.add(Double.valueOf(abstractC6261s.mo11919l()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            return;
        }
        C6271x c6271x = (C6271x) list;
        int i3 = this.f24263b & 7;
        if (i3 == 1) {
            do {
                c6271x.addDouble(abstractC6261s.mo11919l());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11902A2 = abstractC6261s.mo11902A();
        m11971z(iMo11902A2);
        int iMo11913d2 = abstractC6261s.mo11913d() + iMo11902A2;
        do {
            c6271x.addDouble(abstractC6261s.mo11919l());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
    }

    /* JADX INFO: renamed from: h */
    public final void m11979h(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6193Q;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC6261s.mo11920m()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Integer.valueOf(abstractC6261s.mo11920m()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6193Q c6193q = (C6193Q) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6193q.addInt(abstractC6261s.mo11920m());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6193q.addInt(abstractC6261s.mo11920m());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: i */
    public final Object m11980i(EnumC6247l1 enumC6247l1, Class cls, C6161A c6161a) {
        int iOrdinal = enumC6247l1.ordinal();
        AbstractC6261s abstractC6261s = this.f24262a;
        switch (iOrdinal) {
            case 0:
                m11994w(1);
                return Double.valueOf(abstractC6261s.mo11919l());
            case 1:
                m11994w(5);
                return Float.valueOf(abstractC6261s.mo11923p());
            case 2:
                m11994w(0);
                return Long.valueOf(abstractC6261s.mo11925r());
            case 3:
                m11994w(0);
                return Long.valueOf(abstractC6261s.mo11903B());
            case 4:
                m11994w(0);
                return Integer.valueOf(abstractC6261s.mo11924q());
            case 5:
                m11994w(1);
                return Long.valueOf(abstractC6261s.mo11922o());
            case 6:
                m11994w(5);
                return Integer.valueOf(abstractC6261s.mo11921n());
            case 7:
                m11994w(0);
                return Boolean.valueOf(abstractC6261s.mo11917j());
            case 8:
                m11994w(2);
                return abstractC6261s.mo11931y();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                m11994w(2);
                InterfaceC6178I0 interfaceC6178I0M11705a = C6166C0.f24055c.m11705a(cls);
                Object objNewInstance = interfaceC6178I0M11705a.newInstance();
                m11974c(objNewInstance, interfaceC6178I0M11705a, c6161a);
                interfaceC6178I0M11705a.makeImmutable(objNewInstance);
                return objNewInstance;
            case 11:
                return m11976e();
            case 12:
                m11994w(0);
                return Integer.valueOf(abstractC6261s.mo11902A());
            case 13:
                m11994w(0);
                return Integer.valueOf(abstractC6261s.mo11920m());
            case 14:
                m11994w(5);
                return Integer.valueOf(abstractC6261s.mo11926t());
            case 15:
                m11994w(1);
                return Long.valueOf(abstractC6261s.mo11927u());
            case 16:
                m11994w(0);
                return Integer.valueOf(abstractC6261s.mo11928v());
            case 17:
                m11994w(0);
                return Long.valueOf(abstractC6261s.mo11929w());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11981j(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6193Q;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 2) {
                int iMo11902A = abstractC6261s.mo11902A();
                m11970y(iMo11902A);
                int iMo11913d = abstractC6261s.mo11913d() + iMo11902A;
                do {
                    list.add(Integer.valueOf(abstractC6261s.mo11921n()));
                } while (abstractC6261s.mo11913d() < iMo11913d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m11740d();
            }
            do {
                list.add(Integer.valueOf(abstractC6261s.mo11921n()));
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z = abstractC6261s.mo11932z();
                }
            } while (iMo11932z == this.f24263b);
            this.f24265d = iMo11932z;
            return;
        }
        C6193Q c6193q = (C6193Q) list;
        int i3 = this.f24263b & 7;
        if (i3 == 2) {
            int iMo11902A2 = abstractC6261s.mo11902A();
            m11970y(iMo11902A2);
            int iMo11913d2 = abstractC6261s.mo11913d() + iMo11902A2;
            do {
                c6193q.addInt(abstractC6261s.mo11921n());
            } while (abstractC6261s.mo11913d() < iMo11913d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m11740d();
        }
        do {
            c6193q.addInt(abstractC6261s.mo11921n());
            if (abstractC6261s.mo11914e()) {
                return;
            } else {
                iMo11932z2 = abstractC6261s.mo11932z();
            }
        } while (iMo11932z2 == this.f24263b);
        this.f24265d = iMo11932z2;
    }

    /* JADX INFO: renamed from: k */
    public final void m11982k(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6237i0;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC6261s.mo11922o()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11902A = abstractC6261s.mo11902A();
            m11971z(iMo11902A);
            int iMo11913d = abstractC6261s.mo11913d() + iMo11902A;
            do {
                list.add(Long.valueOf(abstractC6261s.mo11922o()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            return;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int i3 = this.f24263b & 7;
        if (i3 == 1) {
            do {
                c6237i0.addLong(abstractC6261s.mo11922o());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11902A2 = abstractC6261s.mo11902A();
        m11971z(iMo11902A2);
        int iMo11913d2 = abstractC6261s.mo11913d() + iMo11902A2;
        do {
            c6237i0.addLong(abstractC6261s.mo11922o());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
    }

    /* JADX INFO: renamed from: l */
    public final void m11983l(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6171F;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 2) {
                int iMo11902A = abstractC6261s.mo11902A();
                m11970y(iMo11902A);
                int iMo11913d = abstractC6261s.mo11913d() + iMo11902A;
                do {
                    list.add(Float.valueOf(abstractC6261s.mo11923p()));
                } while (abstractC6261s.mo11913d() < iMo11913d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m11740d();
            }
            do {
                list.add(Float.valueOf(abstractC6261s.mo11923p()));
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z = abstractC6261s.mo11932z();
                }
            } while (iMo11932z == this.f24263b);
            this.f24265d = iMo11932z;
            return;
        }
        C6171F c6171f = (C6171F) list;
        int i3 = this.f24263b & 7;
        if (i3 == 2) {
            int iMo11902A2 = abstractC6261s.mo11902A();
            m11970y(iMo11902A2);
            int iMo11913d2 = abstractC6261s.mo11913d() + iMo11902A2;
            do {
                c6171f.addFloat(abstractC6261s.mo11923p());
            } while (abstractC6261s.mo11913d() < iMo11913d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m11740d();
        }
        do {
            c6171f.addFloat(abstractC6261s.mo11923p());
            if (abstractC6261s.mo11914e()) {
                return;
            } else {
                iMo11932z2 = abstractC6261s.mo11932z();
            }
        } while (iMo11932z2 == this.f24263b);
        this.f24265d = iMo11932z2;
    }

    /* JADX INFO: renamed from: m */
    public final void m11984m(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6193Q;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC6261s.mo11924q()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Integer.valueOf(abstractC6261s.mo11924q()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6193Q c6193q = (C6193Q) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6193q.addInt(abstractC6261s.mo11924q());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6193q.addInt(abstractC6261s.mo11924q());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: n */
    public final void m11985n(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6237i0;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC6261s.mo11925r()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Long.valueOf(abstractC6261s.mo11925r()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6237i0.addLong(abstractC6261s.mo11925r());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6237i0.addLong(abstractC6261s.mo11925r());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: o */
    public final void m11986o(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6193Q;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 2) {
                int iMo11902A = abstractC6261s.mo11902A();
                m11970y(iMo11902A);
                int iMo11913d = abstractC6261s.mo11913d() + iMo11902A;
                do {
                    list.add(Integer.valueOf(abstractC6261s.mo11926t()));
                } while (abstractC6261s.mo11913d() < iMo11913d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m11740d();
            }
            do {
                list.add(Integer.valueOf(abstractC6261s.mo11926t()));
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z = abstractC6261s.mo11932z();
                }
            } while (iMo11932z == this.f24263b);
            this.f24265d = iMo11932z;
            return;
        }
        C6193Q c6193q = (C6193Q) list;
        int i3 = this.f24263b & 7;
        if (i3 == 2) {
            int iMo11902A2 = abstractC6261s.mo11902A();
            m11970y(iMo11902A2);
            int iMo11913d2 = abstractC6261s.mo11913d() + iMo11902A2;
            do {
                c6193q.addInt(abstractC6261s.mo11926t());
            } while (abstractC6261s.mo11913d() < iMo11913d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m11740d();
        }
        do {
            c6193q.addInt(abstractC6261s.mo11926t());
            if (abstractC6261s.mo11914e()) {
                return;
            } else {
                iMo11932z2 = abstractC6261s.mo11932z();
            }
        } while (iMo11932z2 == this.f24263b);
        this.f24265d = iMo11932z2;
    }

    /* JADX INFO: renamed from: p */
    public final void m11987p(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6237i0;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(abstractC6261s.mo11927u()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11902A = abstractC6261s.mo11902A();
            m11971z(iMo11902A);
            int iMo11913d = abstractC6261s.mo11913d() + iMo11902A;
            do {
                list.add(Long.valueOf(abstractC6261s.mo11927u()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            return;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int i3 = this.f24263b & 7;
        if (i3 == 1) {
            do {
                c6237i0.addLong(abstractC6261s.mo11927u());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11902A2 = abstractC6261s.mo11902A();
        m11971z(iMo11902A2);
        int iMo11913d2 = abstractC6261s.mo11913d() + iMo11902A2;
        do {
            c6237i0.addLong(abstractC6261s.mo11927u());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
    }

    /* JADX INFO: renamed from: q */
    public final void m11988q(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6193Q;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC6261s.mo11928v()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Integer.valueOf(abstractC6261s.mo11928v()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6193Q c6193q = (C6193Q) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6193q.addInt(abstractC6261s.mo11928v());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6193q.addInt(abstractC6261s.mo11928v());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: r */
    public final void m11989r(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6237i0;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC6261s.mo11929w()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Long.valueOf(abstractC6261s.mo11929w()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6237i0.addLong(abstractC6261s.mo11929w());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6237i0.addLong(abstractC6261s.mo11929w());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: s */
    public final void m11990s(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo11930x;
        int iMo11932z;
        int iMo11932z2;
        if ((this.f24263b & 7) != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        boolean z2 = list instanceof InterfaceC6225e0;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (z2 && !z) {
            InterfaceC6225e0 interfaceC6225e0 = (InterfaceC6225e0) list;
            do {
                interfaceC6225e0.mo11830i(m11976e());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        do {
            if (z) {
                m11994w(2);
                strMo11930x = abstractC6261s.mo11931y();
            } else {
                m11994w(2);
                strMo11930x = abstractC6261s.mo11930x();
            }
            list.add(strMo11930x);
            if (abstractC6261s.mo11914e()) {
                return;
            } else {
                iMo11932z = abstractC6261s.mo11932z();
            }
        } while (iMo11932z == this.f24263b);
        this.f24265d = iMo11932z;
    }

    /* JADX INFO: renamed from: t */
    public final void m11991t(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6193Q;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC6261s.mo11902A()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Integer.valueOf(abstractC6261s.mo11902A()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6193Q c6193q = (C6193Q) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6193q.addInt(abstractC6261s.mo11902A());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6193q.addInt(abstractC6261s.mo11902A());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: u */
    public final void m11992u(List list) throws InvalidProtocolBufferException {
        int iMo11932z;
        int iMo11932z2;
        boolean z = list instanceof C6237i0;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (!z) {
            int i2 = this.f24263b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC6261s.mo11903B()));
                    if (abstractC6261s.mo11914e()) {
                        return;
                    } else {
                        iMo11932z = abstractC6261s.mo11932z();
                    }
                } while (iMo11932z == this.f24263b);
                this.f24265d = iMo11932z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m11740d();
            }
            int iMo11913d = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
            do {
                list.add(Long.valueOf(abstractC6261s.mo11903B()));
            } while (abstractC6261s.mo11913d() < iMo11913d);
            m11993v(iMo11913d);
            return;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int i3 = this.f24263b & 7;
        if (i3 == 0) {
            do {
                c6237i0.addLong(abstractC6261s.mo11903B());
                if (abstractC6261s.mo11914e()) {
                    return;
                } else {
                    iMo11932z2 = abstractC6261s.mo11932z();
                }
            } while (iMo11932z2 == this.f24263b);
            this.f24265d = iMo11932z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m11740d();
        }
        int iMo11913d2 = abstractC6261s.mo11913d() + abstractC6261s.mo11902A();
        do {
            c6237i0.addLong(abstractC6261s.mo11903B());
        } while (abstractC6261s.mo11913d() < iMo11913d2);
        m11993v(iMo11913d2);
    }

    /* JADX INFO: renamed from: v */
    public final void m11993v(int i2) throws InvalidProtocolBufferException {
        if (this.f24262a.mo11913d() != i2) {
            throw InvalidProtocolBufferException.m11744h();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11994w(int i2) {
        if ((this.f24263b & 7) != i2) {
            throw InvalidProtocolBufferException.m11740d();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m11995x() {
        int i2;
        AbstractC6261s abstractC6261s = this.f24262a;
        if (abstractC6261s.mo11914e() || (i2 = this.f24263b) == this.f24264c) {
            return false;
        }
        return abstractC6261s.mo11904C(i2);
    }
}
