package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C0429n extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final C0429n DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private C6197S0 commitTime_;
    private InterfaceC6210Z writeResults_ = AbstractC6185M.emptyProtobufList();

    static {
        C0429n c0429n = new C0429n();
        DEFAULT_INSTANCE = c0429n;
        AbstractC6185M.registerDefaultInstance(C0429n.class, c0429n);
    }

    /* JADX INFO: renamed from: f */
    public static C0429n m860f() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", C0420i1.class, "commitTime_"});
            case 3:
                return new C0429n();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0429n.class) {
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
    public final C6197S0 m861e() {
        C6197S0 c6197s0 = this.commitTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    /* JADX INFO: renamed from: g */
    public final C0420i1 m862g(int i2) {
        return (C0420i1) this.writeResults_.get(i2);
    }

    /* JADX INFO: renamed from: h */
    public final int m863h() {
        return this.writeResults_.size();
    }
}
