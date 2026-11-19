package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.O0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0372O0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0372O0 DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int STRUCTURED_PIPELINE_FIELD_NUMBER = 1;
    private int pipelineTypeCase_ = 0;
    private Object pipelineType_;

    static {
        C0372O0 c0372o0 = new C0372O0();
        DEFAULT_INSTANCE = c0372o0;
        AbstractC6185M.registerDefaultInstance(C0372O0.class, c0372o0);
    }

    /* JADX INFO: renamed from: e */
    public static void m636e(C0372O0 c0372o0, C0430n0 c0430n0) {
        c0372o0.getClass();
        c0430n0.getClass();
        c0372o0.pipelineType_ = c0430n0;
        c0372o0.pipelineTypeCase_ = 1;
    }

    /* JADX INFO: renamed from: f */
    public static C0372O0 m637f() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C0370N0 m638i() {
        return (C0370N0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: j */
    public static C0370N0 m639j(C0372O0 c0372o0) {
        return (C0370N0) DEFAULT_INSTANCE.createBuilder(c0372o0);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"pipelineType_", "pipelineTypeCase_", C0430n0.class});
            case 3:
                return new C0372O0();
            case 4:
                return new C0370N0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0372O0.class) {
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
    public final int m640g() {
        int i2 = this.pipelineTypeCase_;
        if (i2 != 0) {
            return i2 != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final C0430n0 m641h() {
        return this.pipelineTypeCase_ == 1 ? (C0430n0) this.pipelineType_ : C0430n0.m866g();
    }
}
