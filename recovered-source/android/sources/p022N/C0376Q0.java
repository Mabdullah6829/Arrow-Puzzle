package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.Q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0376Q0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0376Q0 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        C0376Q0 c0376q0 = new C0376Q0();
        DEFAULT_INSTANCE = c0376q0;
        AbstractC6185M.registerDefaultInstance(C0376Q0.class, c0376q0);
    }

    /* JADX INFO: renamed from: e */
    public static void m651e(C0376Q0 c0376q0, C0362J0 c0362j0) {
        c0376q0.getClass();
        c0362j0.getClass();
        c0376q0.queryType_ = c0362j0;
        c0376q0.queryTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: f */
    public static void m652f(C0376Q0 c0376q0, String str) {
        c0376q0.getClass();
        str.getClass();
        c0376q0.parent_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static C0376Q0 m653g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C0374P0 m654j() {
        return (C0374P0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: k */
    public static C0374P0 m655k(C0376Q0 c0376q0) {
        return (C0374P0) DEFAULT_INSTANCE.createBuilder(c0376q0);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", C0362J0.class});
            case 3:
                return new C0376Q0();
            case 4:
                return new C0374P0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0376Q0.class) {
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
    public final String m656h() {
        return this.parent_;
    }

    /* JADX INFO: renamed from: i */
    public final C0362J0 m657i() {
        return this.queryTypeCase_ == 2 ? (C0362J0) this.queryType_ : C0362J0.m586k();
    }
}
