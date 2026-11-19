package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0348C0 extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final C0348C0 DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;

    static {
        C0348C0 c0348c0 = new C0348C0();
        DEFAULT_INSTANCE = c0348c0;
        AbstractC6185M.registerDefaultInstance(C0348C0.class, c0348c0);
    }

    /* JADX INFO: renamed from: e */
    public static void m523e(C0348C0 c0348c0, C0450x0 c0450x0) {
        c0348c0.getClass();
        c0450x0.getClass();
        c0348c0.filterType_ = c0450x0;
        c0348c0.filterTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: f */
    public static void m524f(C0348C0 c0348c0, C0360I0 c0360i0) {
        c0348c0.getClass();
        c0360i0.getClass();
        c0348c0.filterType_ = c0360i0;
        c0348c0.filterTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: g */
    public static void m525g(C0348C0 c0348c0, C0442t0 c0442t0) {
        c0348c0.getClass();
        c0442t0.getClass();
        c0348c0.filterType_ = c0442t0;
        c0348c0.filterTypeCase_ = 1;
    }

    /* JADX INFO: renamed from: i */
    public static C0348C0 m526i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static C0344A0 m527m() {
        return (C0344A0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", C0442t0.class, C0450x0.class, C0360I0.class});
            case 3:
                return new C0348C0();
            case 4:
                return new C0344A0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0348C0.class) {
                    try {
                        c6177i = PARSER;
                        if (c6177i == null) {
                            c6177i = new C6177I(DEFAULT_INSTANCE);
                            PARSER = c6177i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c6177i;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: h */
    public final C0442t0 m528h() {
        return this.filterTypeCase_ == 1 ? (C0442t0) this.filterType_ : C0442t0.m910g();
    }

    /* JADX INFO: renamed from: j */
    public final C0450x0 m529j() {
        return this.filterTypeCase_ == 2 ? (C0450x0) this.filterType_ : C0450x0.m932h();
    }

    /* JADX INFO: renamed from: k */
    public final EnumC0346B0 m530k() {
        int i2 = this.filterTypeCase_;
        if (i2 == 0) {
            return EnumC0346B0.f687v;
        }
        if (i2 == 1) {
            return EnumC0346B0.f684s;
        }
        if (i2 == 2) {
            return EnumC0346B0.f685t;
        }
        if (i2 != 3) {
            return null;
        }
        return EnumC0346B0.f686u;
    }

    /* JADX INFO: renamed from: l */
    public final C0360I0 m531l() {
        return this.filterTypeCase_ == 3 ? (C0360I0) this.filterType_ : C0360I0.m570g();
    }
}
