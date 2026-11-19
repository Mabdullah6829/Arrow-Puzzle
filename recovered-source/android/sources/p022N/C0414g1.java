package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6252n0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.g1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0414g1 extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0414g1 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C6252n0 labels_ = C6252n0.f24222t;
    private String database_ = "";
    private String streamId_ = "";
    private InterfaceC6210Z writes_ = AbstractC6185M.emptyProtobufList();
    private AbstractC6251n streamToken_ = AbstractC6251n.f24219t;

    static {
        C0414g1 c0414g1 = new C0414g1();
        DEFAULT_INSTANCE = c0414g1;
        AbstractC6185M.registerDefaultInstance(C0414g1.class, c0414g1);
    }

    /* JADX INFO: renamed from: e */
    public static void m812e(C0414g1 c0414g1, String str) {
        c0414g1.getClass();
        str.getClass();
        c0414g1.database_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m813f(C0414g1 c0414g1, AbstractC6251n abstractC6251n) {
        c0414g1.getClass();
        abstractC6251n.getClass();
        c0414g1.streamToken_ = abstractC6251n;
    }

    /* JADX INFO: renamed from: g */
    public static void m814g(C0414g1 c0414g1, C0402c1 c0402c1) {
        c0414g1.getClass();
        c0402c1.getClass();
        InterfaceC6210Z interfaceC6210Z = c0414g1.writes_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0414g1.writes_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0414g1.writes_.add(c0402c1);
    }

    /* JADX INFO: renamed from: h */
    public static C0414g1 m815h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C0408e1 m816i() {
        return (C0408e1) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", C0402c1.class, "streamToken_", "labels_", AbstractC0411f1.f748a});
            case 3:
                return new C0414g1();
            case 4:
                return new C0408e1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0414g1.class) {
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
