package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.I0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0360I0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0360I0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;

    static {
        C0360I0 c0360i0 = new C0360I0();
        DEFAULT_INSTANCE = c0360i0;
        AbstractC6185M.registerDefaultInstance(C0360I0.class, c0360i0);
    }

    /* JADX INFO: renamed from: e */
    public static void m568e(C0360I0 c0360i0, EnumC0358H0 enumC0358H0) {
        c0360i0.getClass();
        c0360i0.op_ = enumC0358H0.getNumber();
    }

    /* JADX INFO: renamed from: f */
    public static void m569f(C0360I0 c0360i0, C0454z0 c0454z0) {
        c0360i0.getClass();
        c0454z0.getClass();
        c0360i0.operandType_ = c0454z0;
        c0360i0.operandTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static C0360I0 m570g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C0356G0 m571j() {
        return (C0356G0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", C0454z0.class});
            case 3:
                return new C0360I0();
            case 4:
                return new C0356G0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0360I0.class) {
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
    public final C0454z0 m572h() {
        return this.operandTypeCase_ == 2 ? (C0454z0) this.operandType_ : C0454z0.m944f();
    }

    /* JADX INFO: renamed from: i */
    public final EnumC0358H0 m573i() {
        EnumC0358H0 enumC0358H0;
        int i2 = this.op_;
        if (i2 == 0) {
            enumC0358H0 = EnumC0358H0.OPERATOR_UNSPECIFIED;
        } else if (i2 == 2) {
            enumC0358H0 = EnumC0358H0.IS_NAN;
        } else if (i2 == 3) {
            enumC0358H0 = EnumC0358H0.IS_NULL;
        } else if (i2 != 4) {
            enumC0358H0 = i2 != 5 ? null : EnumC0358H0.IS_NOT_NULL;
        } else {
            enumC0358H0 = EnumC0358H0.IS_NOT_NAN;
        }
        return enumC0358H0 == null ? EnumC0358H0.UNRECOGNIZED : enumC0358H0;
    }
}
