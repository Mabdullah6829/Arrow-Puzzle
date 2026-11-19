package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0352E0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0352E0 DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER;
    private int bitField0_;
    private int direction_;
    private C0454z0 field_;

    static {
        C0352E0 c0352e0 = new C0352E0();
        DEFAULT_INSTANCE = c0352e0;
        AbstractC6185M.registerDefaultInstance(C0352E0.class, c0352e0);
    }

    /* JADX INFO: renamed from: e */
    public static void m542e(C0352E0 c0352e0, C0454z0 c0454z0) {
        c0352e0.getClass();
        c0454z0.getClass();
        c0352e0.field_ = c0454z0;
        c0352e0.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m543f(C0352E0 c0352e0, EnumC0444u0 enumC0444u0) {
        c0352e0.getClass();
        c0352e0.direction_ = enumC0444u0.getNumber();
    }

    /* JADX INFO: renamed from: i */
    public static C0350D0 m544i() {
        return (C0350D0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
            case 3:
                return new C0352E0();
            case 4:
                return new C0350D0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0352E0.class) {
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
    public final EnumC0444u0 m545g() {
        EnumC0444u0 enumC0444u0;
        int i2 = this.direction_;
        if (i2 == 0) {
            enumC0444u0 = EnumC0444u0.DIRECTION_UNSPECIFIED;
        } else if (i2 != 1) {
            enumC0444u0 = i2 != 2 ? null : EnumC0444u0.DESCENDING;
        } else {
            enumC0444u0 = EnumC0444u0.ASCENDING;
        }
        return enumC0444u0 == null ? EnumC0444u0.UNRECOGNIZED : enumC0444u0;
    }

    /* JADX INFO: renamed from: h */
    public final C0454z0 m546h() {
        C0454z0 c0454z0 = this.field_;
        return c0454z0 == null ? C0454z0.m944f() : c0454z0;
    }
}
