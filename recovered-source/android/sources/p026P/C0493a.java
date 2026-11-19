package p026P;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6227f;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;
import p022N.C0397b;

/* JADX INFO: renamed from: P.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0493a extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final C0493a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER;
    private int code_;
    private String message_ = "";
    private InterfaceC6210Z details_ = AbstractC6185M.emptyProtobufList();

    static {
        C0493a c0493a = new C0493a();
        DEFAULT_INSTANCE = c0493a;
        AbstractC6185M.registerDefaultInstance(C0493a.class, c0493a);
    }

    /* JADX INFO: renamed from: f */
    public static C0493a m1179f() {
        return DEFAULT_INSTANCE;
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C6227f.class});
            case 3:
                return new C0493a();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0493a.class) {
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

    /* JADX INFO: renamed from: e */
    public final int m1180e() {
        return this.code_;
    }

    /* JADX INFO: renamed from: g */
    public final String m1181g() {
        return this.message_;
    }
}
