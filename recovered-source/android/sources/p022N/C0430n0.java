package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6252n0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0430n0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0430n0 DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int PIPELINE_FIELD_NUMBER = 1;
    private int bitField0_;
    private C6252n0 options_ = C6252n0.f24222t;
    private C0386W pipeline_;

    static {
        C0430n0 c0430n0 = new C0430n0();
        DEFAULT_INSTANCE = c0430n0;
        AbstractC6185M.registerDefaultInstance(C0430n0.class, c0430n0);
    }

    /* JADX INFO: renamed from: e */
    public static void m864e(C0430n0 c0430n0, C0386W c0386w) {
        c0430n0.getClass();
        c0386w.getClass();
        c0430n0.pipeline_ = c0386w;
        c0430n0.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: f */
    public static C6252n0 m865f(C0430n0 c0430n0) {
        C6252n0 c6252n0 = c0430n0.options_;
        if (!c6252n0.f24223s) {
            c0430n0.options_ = c6252n0.m11901c();
        }
        return c0430n0.options_;
    }

    /* JADX INFO: renamed from: g */
    public static C0430n0 m866g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C0426l0 m867i() {
        return (C0426l0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "pipeline_", "options_", AbstractC0428m0.f749a});
            case 3:
                return new C0430n0();
            case 4:
                return new C0426l0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0430n0.class) {
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
    public final C0386W m868h() {
        C0386W c0386w = this.pipeline_;
        return c0386w == null ? C0386W.m681f() : c0386w;
    }
}
