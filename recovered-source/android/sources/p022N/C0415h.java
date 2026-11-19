package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0415h extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0415h DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private C0447w mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private InterfaceC6210Z documents_ = AbstractC6185M.emptyProtobufList();

    static {
        C0415h c0415h = new C0415h();
        DEFAULT_INSTANCE = c0415h;
        AbstractC6185M.registerDefaultInstance(C0415h.class, c0415h);
    }

    /* JADX INFO: renamed from: e */
    public static void m817e(C0415h c0415h, String str) {
        c0415h.getClass();
        str.getClass();
        c0415h.database_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m818f(C0415h c0415h, String str) {
        c0415h.getClass();
        str.getClass();
        InterfaceC6210Z interfaceC6210Z = c0415h.documents_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0415h.documents_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0415h.documents_.add(str);
    }

    /* JADX INFO: renamed from: g */
    public static C0415h m819g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static C0412g m820h() {
        return (C0412g) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", C0387W0.class, C6197S0.class});
            case 3:
                return new C0415h();
            case 4:
                return new C0412g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0415h.class) {
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
