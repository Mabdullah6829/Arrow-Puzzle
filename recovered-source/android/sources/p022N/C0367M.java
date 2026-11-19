package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6252n0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.M */
/* JADX INFO: loaded from: classes2.dex */
public final class C0367M extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0367M DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private C6252n0 labels_ = C6252n0.f24222t;
    private String database_ = "";

    static {
        C0367M c0367m = new C0367M();
        DEFAULT_INSTANCE = c0367m;
        AbstractC6185M.registerDefaultInstance(C0367M.class, c0367m);
    }

    /* JADX INFO: renamed from: e */
    public static C6252n0 m612e(C0367M c0367m) {
        C6252n0 c6252n0 = c0367m.labels_;
        if (!c6252n0.f24223s) {
            c0367m.labels_ = c6252n0.m11901c();
        }
        return c0367m.labels_;
    }

    /* JADX INFO: renamed from: f */
    public static void m613f(C0367M c0367m, String str) {
        c0367m.getClass();
        str.getClass();
        c0367m.database_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m614g(C0367M c0367m, C0377R0 c0377r0) {
        c0367m.getClass();
        c0377r0.getClass();
        c0367m.targetChange_ = c0377r0;
        c0367m.targetChangeCase_ = 2;
    }

    /* JADX INFO: renamed from: h */
    public static void m615h(C0367M c0367m, int i2) {
        c0367m.targetChangeCase_ = 3;
        c0367m.targetChange_ = Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: i */
    public static C0367M m616i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C0363K m617j() {
        return (C0363K) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", C0377R0.class, "labels_", AbstractC0365L.f713a});
            case 3:
                return new C0367M();
            case 4:
                return new C0363K(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0367M.class) {
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
