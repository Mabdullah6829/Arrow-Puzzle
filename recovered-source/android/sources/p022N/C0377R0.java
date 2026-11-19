package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6189O;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.R0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0377R0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0377R0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int PIPELINE_QUERY_FIELD_NUMBER = 13;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private C6189O expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static {
        C0377R0 c0377r0 = new C0377R0();
        DEFAULT_INSTANCE = c0377r0;
        AbstractC6185M.registerDefaultInstance(C0377R0.class, c0377r0);
    }

    /* JADX INFO: renamed from: e */
    public static void m658e(C0377R0 c0377r0, C0376Q0 c0376q0) {
        c0377r0.getClass();
        c0376q0.getClass();
        c0377r0.targetType_ = c0376q0;
        c0377r0.targetTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: f */
    public static void m659f(C0377R0 c0377r0, C0368M0 c0368m0) {
        c0377r0.getClass();
        c0368m0.getClass();
        c0377r0.targetType_ = c0368m0;
        c0377r0.targetTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: g */
    public static void m660g(C0377R0 c0377r0, C0372O0 c0372o0) {
        c0377r0.getClass();
        c0372o0.getClass();
        c0377r0.targetType_ = c0372o0;
        c0377r0.targetTypeCase_ = 13;
    }

    /* JADX INFO: renamed from: h */
    public static void m661h(C0377R0 c0377r0, AbstractC6251n abstractC6251n) {
        c0377r0.getClass();
        abstractC6251n.getClass();
        c0377r0.resumeTypeCase_ = 4;
        c0377r0.resumeType_ = abstractC6251n;
    }

    /* JADX INFO: renamed from: i */
    public static void m662i(C0377R0 c0377r0, C6197S0 c6197s0) {
        c0377r0.getClass();
        c6197s0.getClass();
        c0377r0.resumeType_ = c6197s0;
        c0377r0.resumeTypeCase_ = 11;
    }

    /* JADX INFO: renamed from: j */
    public static void m663j(C0377R0 c0377r0, int i2) {
        c0377r0.targetId_ = i2;
    }

    /* JADX INFO: renamed from: k */
    public static void m664k(C0377R0 c0377r0, C6189O c6189o) {
        c0377r0.getClass();
        c6189o.getClass();
        c0377r0.expectedCount_ = c6189o;
        c0377r0.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: l */
    public static C0364K0 m665l() {
        return (C0364K0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0002\u0001\u0002\r\b\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000\r<\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", C0376Q0.class, C0368M0.class, "targetId_", "once_", C6197S0.class, "expectedCount_", C0372O0.class});
            case 3:
                return new C0377R0();
            case 4:
                return new C0364K0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0377R0.class) {
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
