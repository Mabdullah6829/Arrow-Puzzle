package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.i1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0420i1 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0420i1 DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private InterfaceC6210Z transformResults_ = AbstractC6185M.emptyProtobufList();
    private C6197S0 updateTime_;

    static {
        C0420i1 c0420i1 = new C0420i1();
        DEFAULT_INSTANCE = c0420i1;
        AbstractC6185M.registerDefaultInstance(C0420i1.class, c0420i1);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", C0393Z0.class});
            case 3:
                return new C0420i1();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0420i1.class) {
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
    public final C0393Z0 m837e(int i2) {
        return (C0393Z0) this.transformResults_.get(i2);
    }

    /* JADX INFO: renamed from: f */
    public final int m838f() {
        return this.transformResults_.size();
    }

    /* JADX INFO: renamed from: g */
    public final C6197S0 m839g() {
        C6197S0 c6197s0 = this.updateTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }
}
