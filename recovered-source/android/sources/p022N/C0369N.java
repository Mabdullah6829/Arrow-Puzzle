package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0369N extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0369N DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        C0369N c0369n = new C0369N();
        DEFAULT_INSTANCE = c0369n;
        AbstractC6185M.registerDefaultInstance(C0369N.class, c0369n);
    }

    /* JADX INFO: renamed from: e */
    public static C0369N m624e() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", C0381T0.class, C0441t.class, C0443u.class, C0353F.class, C0449x.class});
            case 3:
                return new C0369N();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0369N.class) {
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
    public final C0441t m625f() {
        return this.responseTypeCase_ == 3 ? (C0441t) this.responseType_ : C0441t.m905e();
    }

    /* JADX INFO: renamed from: g */
    public final C0443u m626g() {
        return this.responseTypeCase_ == 4 ? (C0443u) this.responseType_ : C0443u.m914e();
    }

    /* JADX INFO: renamed from: h */
    public final C0449x m627h() {
        return this.responseTypeCase_ == 6 ? (C0449x) this.responseType_ : C0449x.m926e();
    }

    /* JADX INFO: renamed from: i */
    public final C0353F m628i() {
        return this.responseTypeCase_ == 5 ? (C0353F) this.responseType_ : C0353F.m547f();
    }

    /* JADX INFO: renamed from: j */
    public final int m629j() {
        int i2 = this.responseTypeCase_;
        if (i2 == 0) {
            return 6;
        }
        if (i2 == 2) {
            return 1;
        }
        int i3 = 3;
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 4) {
            i3 = 5;
            if (i2 != 5) {
                return i2 != 6 ? 0 : 4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: k */
    public final C0381T0 m630k() {
        return this.responseTypeCase_ == 2 ? (C0381T0) this.responseType_ : C0381T0.m670f();
    }
}
