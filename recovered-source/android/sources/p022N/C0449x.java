package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6206X;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C0449x extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0449x DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C6197S0 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private InterfaceC6206X removedTargetIds_ = AbstractC6185M.emptyIntList();

    static {
        C0449x c0449x = new C0449x();
        DEFAULT_INSTANCE = c0449x;
        AbstractC6185M.registerDefaultInstance(C0449x.class, c0449x);
    }

    /* JADX INFO: renamed from: e */
    public static C0449x m926e() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0004ဉ\u0000", new Object[]{"bitField0_", "document_", "removedTargetIds_", "readTime_"});
            case 3:
                return new C0449x();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0449x.class) {
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
    public final String m927f() {
        return this.document_;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC6206X m928g() {
        return this.removedTargetIds_;
    }
}
