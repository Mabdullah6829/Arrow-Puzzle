package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0450x0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0450x0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C0454z0 field_;
    private int op_;
    private C0393Z0 value_;

    static {
        C0450x0 c0450x0 = new C0450x0();
        DEFAULT_INSTANCE = c0450x0;
        AbstractC6185M.registerDefaultInstance(C0450x0.class, c0450x0);
    }

    /* JADX INFO: renamed from: e */
    public static void m929e(C0450x0 c0450x0, C0454z0 c0454z0) {
        c0450x0.getClass();
        c0454z0.getClass();
        c0450x0.field_ = c0454z0;
        c0450x0.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m930f(C0450x0 c0450x0, EnumC0448w0 enumC0448w0) {
        c0450x0.getClass();
        c0450x0.op_ = enumC0448w0.getNumber();
    }

    /* JADX INFO: renamed from: g */
    public static void m931g(C0450x0 c0450x0, C0393Z0 c0393z0) {
        c0450x0.getClass();
        c0393z0.getClass();
        c0450x0.value_ = c0393z0;
        c0450x0.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: h */
    public static C0450x0 m932h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static C0446v0 m933l() {
        return (C0446v0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
            case 3:
                return new C0450x0();
            case 4:
                return new C0446v0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0450x0.class) {
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

    /* JADX INFO: renamed from: i */
    public final C0454z0 m934i() {
        C0454z0 c0454z0 = this.field_;
        return c0454z0 == null ? C0454z0.m944f() : c0454z0;
    }

    /* JADX INFO: renamed from: j */
    public final EnumC0448w0 m935j() {
        EnumC0448w0 enumC0448w0;
        switch (this.op_) {
            case 0:
                enumC0448w0 = EnumC0448w0.OPERATOR_UNSPECIFIED;
                break;
            case 1:
                enumC0448w0 = EnumC0448w0.LESS_THAN;
                break;
            case 2:
                enumC0448w0 = EnumC0448w0.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                enumC0448w0 = EnumC0448w0.GREATER_THAN;
                break;
            case 4:
                enumC0448w0 = EnumC0448w0.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                enumC0448w0 = EnumC0448w0.EQUAL;
                break;
            case 6:
                enumC0448w0 = EnumC0448w0.NOT_EQUAL;
                break;
            case 7:
                enumC0448w0 = EnumC0448w0.ARRAY_CONTAINS;
                break;
            case 8:
                enumC0448w0 = EnumC0448w0.IN;
                break;
            case 9:
                enumC0448w0 = EnumC0448w0.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                enumC0448w0 = EnumC0448w0.NOT_IN;
                break;
            default:
                enumC0448w0 = null;
                break;
        }
        return enumC0448w0 == null ? EnumC0448w0.UNRECOGNIZED : enumC0448w0;
    }

    /* JADX INFO: renamed from: k */
    public final C0393Z0 m936k() {
        C0393Z0 c0393z0 = this.value_;
        return c0393z0 == null ? C0393Z0.m730w() : c0393z0;
    }
}
