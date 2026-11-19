package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C0349D extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0349D DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_PIPELINE_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private Object consistencySelector_;
    private Object pipelineType_;
    private int pipelineTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";

    static {
        C0349D c0349d = new C0349D();
        DEFAULT_INSTANCE = c0349d;
        AbstractC6185M.registerDefaultInstance(C0349D.class, c0349d);
    }

    /* JADX INFO: renamed from: e */
    public static void m532e(C0349D c0349d, String str) {
        c0349d.getClass();
        str.getClass();
        c0349d.database_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m533f(C0349D c0349d, C0430n0 c0430n0) {
        c0349d.getClass();
        c0430n0.getClass();
        c0349d.pipelineType_ = c0430n0;
        c0349d.pipelineTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static C0349D m534g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static C0347C m535h() {
        return (C0347C) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0005=\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"pipelineType_", "pipelineTypeCase_", "consistencySelector_", "consistencySelectorCase_", "database_", C0430n0.class, C0387W0.class, C6197S0.class});
            case 3:
                return new C0349D();
            case 4:
                return new C0347C(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0349D.class) {
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
