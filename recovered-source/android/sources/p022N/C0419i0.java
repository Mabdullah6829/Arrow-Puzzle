package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0419i0 extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int ALIAS_FIELD_NUMBER = 7;
    public static final int AVG_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final C0419i0 DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private Object operator_;
    private int operatorCase_ = 0;
    private String alias_ = "";

    static {
        C0419i0 c0419i0 = new C0419i0();
        DEFAULT_INSTANCE = c0419i0;
        AbstractC6185M.registerDefaultInstance(C0419i0.class, c0419i0);
    }

    /* JADX INFO: renamed from: e */
    public static void m832e(C0419i0 c0419i0, C0410f0 c0410f0) {
        c0419i0.getClass();
        c0410f0.getClass();
        c0419i0.operator_ = c0410f0;
        c0419i0.operatorCase_ = 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m833f(C0419i0 c0419i0, C0416h0 c0416h0) {
        c0419i0.getClass();
        c0416h0.getClass();
        c0419i0.operator_ = c0416h0;
        c0419i0.operatorCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static void m834g(C0419i0 c0419i0, C0404d0 c0404d0) {
        c0419i0.getClass();
        c0404d0.getClass();
        c0419i0.operator_ = c0404d0;
        c0419i0.operatorCase_ = 3;
    }

    /* JADX INFO: renamed from: h */
    public static void m835h(C0419i0 c0419i0, String str) {
        c0419i0.getClass();
        str.getClass();
        c0419i0.alias_ = str;
    }

    /* JADX INFO: renamed from: i */
    public static C0407e0 m836i() {
        return (C0407e0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", C0410f0.class, C0416h0.class, C0404d0.class, "alias_"});
            case 3:
                return new C0419i0();
            case 4:
                return new C0407e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0419i0.class) {
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
}
