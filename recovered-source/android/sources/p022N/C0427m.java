package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C0427m extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0427m DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private InterfaceC6210Z writes_ = AbstractC6185M.emptyProtobufList();
    private AbstractC6251n transaction_ = AbstractC6251n.f24219t;

    static {
        C0427m c0427m = new C0427m();
        DEFAULT_INSTANCE = c0427m;
        AbstractC6185M.registerDefaultInstance(C0427m.class, c0427m);
    }

    /* JADX INFO: renamed from: e */
    public static void m856e(C0427m c0427m, String str) {
        c0427m.getClass();
        str.getClass();
        c0427m.database_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m857f(C0427m c0427m, C0402c1 c0402c1) {
        c0427m.getClass();
        c0402c1.getClass();
        InterfaceC6210Z interfaceC6210Z = c0427m.writes_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0427m.writes_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0427m.writes_.add(c0402c1);
    }

    /* JADX INFO: renamed from: g */
    public static C0427m m858g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static C0425l m859h() {
        return (C0425l) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", C0402c1.class, "transaction_"});
            case 3:
                return new C0427m();
            case 4:
                return new C0425l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0427m.class) {
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
