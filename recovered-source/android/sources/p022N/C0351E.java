package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C0351E extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0351E DEFAULT_INSTANCE;
    public static final int EXECUTION_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C6197S0 executionTime_;
    private AbstractC6251n transaction_ = AbstractC6251n.f24219t;
    private InterfaceC6210Z results_ = AbstractC6185M.emptyProtobufList();

    static {
        C0351E c0351e = new C0351E();
        DEFAULT_INSTANCE = c0351e;
        AbstractC6185M.registerDefaultInstance(C0351E.class, c0351e);
    }

    /* JADX INFO: renamed from: e */
    public static C0351E m538e() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "transaction_", "results_", C0439s.class, "executionTime_"});
            case 3:
                return new C0351E();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0351E.class) {
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
    public final C6197S0 m539f() {
        C6197S0 c6197s0 = this.executionTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC6210Z m540g() {
        return this.results_;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m541h() {
        return (this.bitField0_ & 1) != 0;
    }
}
