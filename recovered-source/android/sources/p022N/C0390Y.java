package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0390Y extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0390Y DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        C0390Y c0390y = new C0390Y();
        DEFAULT_INSTANCE = c0390y;
        AbstractC6185M.registerDefaultInstance(C0390Y.class, c0390y);
    }

    /* JADX INFO: renamed from: e */
    public static void m705e(C0390Y c0390y, boolean z) {
        c0390y.conditionTypeCase_ = 1;
        c0390y.conditionType_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: f */
    public static void m706f(C0390Y c0390y, C6197S0 c6197s0) {
        c0390y.getClass();
        c6197s0.getClass();
        c0390y.conditionType_ = c6197s0;
        c0390y.conditionTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: h */
    public static C0390Y m707h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static C0388X m708k() {
        return (C0388X) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", C6197S0.class});
            case 3:
                return new C0390Y();
            case 4:
                return new C0388X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0390Y.class) {
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

    /* JADX INFO: renamed from: g */
    public final int m709g() {
        int i2 = this.conditionTypeCase_;
        if (i2 == 0) {
            return 3;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m710i() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final C6197S0 m711j() {
        return this.conditionTypeCase_ == 2 ? (C6197S0) this.conditionType_ : C6197S0.m11816g();
    }
}
