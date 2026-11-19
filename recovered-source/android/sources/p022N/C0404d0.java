package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0404d0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0404d0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER;
    private int bitField0_;
    private C0454z0 field_;

    static {
        C0404d0 c0404d0 = new C0404d0();
        DEFAULT_INSTANCE = c0404d0;
        AbstractC6185M.registerDefaultInstance(C0404d0.class, c0404d0);
    }

    /* JADX INFO: renamed from: e */
    public static void m792e(C0404d0 c0404d0, C0454z0 c0454z0) {
        c0404d0.getClass();
        c0454z0.getClass();
        c0404d0.field_ = c0454z0;
        c0404d0.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: f */
    public static C0401c0 m793f() {
        return (C0401c0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
            case 3:
                return new C0404d0();
            case 4:
                return new C0401c0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0404d0.class) {
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
