package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0395a0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0395a0 DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    static {
        C0395a0 c0395a0 = new C0395a0();
        DEFAULT_INSTANCE = c0395a0;
        AbstractC6185M.registerDefaultInstance(C0395a0.class, c0395a0);
    }

    /* JADX INFO: renamed from: e */
    public static void m751e(C0395a0 c0395a0, String str) {
        c0395a0.getClass();
        str.getClass();
        c0395a0.parent_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m752f(C0395a0 c0395a0, C0424k0 c0424k0) {
        c0395a0.getClass();
        c0424k0.getClass();
        c0395a0.queryType_ = c0424k0;
        c0395a0.queryTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static C0395a0 m753g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static C0392Z m754h() {
        return (C0392Z) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", C0424k0.class, C0387W0.class, C6197S0.class});
            case 3:
                return new C0395a0();
            case 4:
                return new C0392Z(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0395a0.class) {
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
