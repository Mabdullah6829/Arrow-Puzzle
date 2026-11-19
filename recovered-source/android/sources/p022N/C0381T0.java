package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6193Q;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6206X;
import com.google.protobuf.InterfaceC6264t0;
import p026P.C0493a;

/* JADX INFO: renamed from: N.T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0381T0 extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final C0381T0 DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C0493a cause_;
    private C6197S0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private InterfaceC6206X targetIds_ = AbstractC6185M.emptyIntList();
    private AbstractC6251n resumeToken_ = AbstractC6251n.f24219t;

    static {
        C0381T0 c0381t0 = new C0381T0();
        DEFAULT_INSTANCE = c0381t0;
        AbstractC6185M.registerDefaultInstance(C0381T0.class, c0381t0);
    }

    /* JADX INFO: renamed from: f */
    public static C0381T0 m670f() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new C0381T0();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0381T0.class) {
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
    public final C0493a m671e() {
        C0493a c0493a = this.cause_;
        return c0493a == null ? C0493a.m1179f() : c0493a;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC0379S0 m672g() {
        EnumC0379S0 enumC0379S0;
        int i2 = this.targetChangeType_;
        if (i2 == 0) {
            enumC0379S0 = EnumC0379S0.NO_CHANGE;
        } else if (i2 == 1) {
            enumC0379S0 = EnumC0379S0.ADD;
        } else if (i2 == 2) {
            enumC0379S0 = EnumC0379S0.REMOVE;
        } else if (i2 != 3) {
            enumC0379S0 = i2 != 4 ? null : EnumC0379S0.RESET;
        } else {
            enumC0379S0 = EnumC0379S0.CURRENT;
        }
        return enumC0379S0 == null ? EnumC0379S0.UNRECOGNIZED : enumC0379S0;
    }

    public final C6197S0 getReadTime() {
        C6197S0 c6197s0 = this.readTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    public final AbstractC6251n getResumeToken() {
        return this.resumeToken_;
    }

    /* JADX INFO: renamed from: h */
    public final int m673h() {
        return ((C6193Q) this.targetIds_).size();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC6206X m674i() {
        return this.targetIds_;
    }
}
