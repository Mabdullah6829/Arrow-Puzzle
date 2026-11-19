package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6206X;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C0441t extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0441t DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private C0439s document_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private InterfaceC6206X targetIds_ = AbstractC6185M.emptyIntList();
    private InterfaceC6206X removedTargetIds_ = AbstractC6185M.emptyIntList();

    static {
        C0441t c0441t = new C0441t();
        DEFAULT_INSTANCE = c0441t;
        AbstractC6185M.registerDefaultInstance(C0441t.class, c0441t);
    }

    /* JADX INFO: renamed from: e */
    public static C0441t m905e() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 3:
                return new C0441t();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0441t.class) {
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
    public final InterfaceC6206X m906f() {
        return this.removedTargetIds_;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC6206X m907g() {
        return this.targetIds_;
    }

    public final C0439s getDocument() {
        C0439s c0439s = this.document_;
        return c0439s == null ? C0439s.m897i() : c0439s;
    }
}
