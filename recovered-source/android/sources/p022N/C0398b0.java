package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0398b0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0398b0 DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private C6197S0 readTime_;
    private C0400c result_;
    private AbstractC6251n transaction_ = AbstractC6251n.f24219t;

    static {
        C0398b0 c0398b0 = new C0398b0();
        DEFAULT_INSTANCE = c0398b0;
        AbstractC6185M.registerDefaultInstance(C0398b0.class, c0398b0);
    }

    /* JADX INFO: renamed from: e */
    public static C0398b0 m761e() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 3:
                return new C0398b0();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0398b0.class) {
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

    /* JADX INFO: renamed from: f */
    public final C0400c m762f() {
        C0400c c0400c = this.result_;
        return c0400c == null ? C0400c.m763f() : c0400c;
    }
}
