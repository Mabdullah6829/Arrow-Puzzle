package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0418i extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0418i DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private C6197S0 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private AbstractC6251n transaction_ = AbstractC6251n.f24219t;

    static {
        C0418i c0418i = new C0418i();
        DEFAULT_INSTANCE = c0418i;
        AbstractC6185M.registerDefaultInstance(C0418i.class, c0418i);
    }

    /* JADX INFO: renamed from: e */
    public static C0418i m828e() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", C0439s.class, "transaction_", "readTime_"});
            case 3:
                return new C0418i();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0418i.class) {
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
    public final C0439s m829f() {
        return this.resultCase_ == 1 ? (C0439s) this.result_ : C0439s.m897i();
    }

    /* JADX INFO: renamed from: g */
    public final String m830g() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    public final C6197S0 getReadTime() {
        C6197S0 c6197s0 = this.readTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    /* JADX INFO: renamed from: h */
    public final int m831h() {
        int i2 = this.resultCase_;
        if (i2 == 0) {
            return 3;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }
}
