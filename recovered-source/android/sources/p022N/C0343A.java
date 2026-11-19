package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0343A extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
    private static final C0343A DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int INCREMENT_FIELD_NUMBER = 3;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 5;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
    public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
    private Object transformType_;
    private int transformTypeCase_ = 0;
    private String fieldPath_ = "";

    static {
        C0343A c0343a = new C0343A();
        DEFAULT_INSTANCE = c0343a;
        AbstractC6185M.registerDefaultInstance(C0343A.class, c0343a);
    }

    /* JADX INFO: renamed from: e */
    public static void m504e(C0343A c0343a, C0406e c0406e) {
        c0343a.getClass();
        c0406e.getClass();
        c0343a.transformType_ = c0406e;
        c0343a.transformTypeCase_ = 6;
    }

    /* JADX INFO: renamed from: f */
    public static void m505f(C0343A c0343a, String str) {
        c0343a.getClass();
        str.getClass();
        c0343a.fieldPath_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m506g(C0343A c0343a, C0406e c0406e) {
        c0343a.getClass();
        c0406e.getClass();
        c0343a.transformType_ = c0406e;
        c0343a.transformTypeCase_ = 7;
    }

    /* JADX INFO: renamed from: h */
    public static void m507h(C0343A c0343a) {
        c0343a.getClass();
        c0343a.transformType_ = Integer.valueOf(EnumC0453z.REQUEST_TIME.getNumber());
        c0343a.transformTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: i */
    public static void m508i(C0343A c0343a, C0393Z0 c0393z0) {
        c0343a.getClass();
        c0393z0.getClass();
        c0343a.transformType_ = c0393z0;
        c0343a.transformTypeCase_ = 3;
    }

    /* JADX INFO: renamed from: p */
    public static C0451y m509p() {
        return (C0451y) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", C0393Z0.class, C0393Z0.class, C0393Z0.class, C0406e.class, C0406e.class});
            case 3:
                return new C0343A();
            case 4:
                return new C0451y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0343A.class) {
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

    /* JADX INFO: renamed from: j */
    public final C0406e m510j() {
        return this.transformTypeCase_ == 6 ? (C0406e) this.transformType_ : C0406e.m797h();
    }

    /* JADX INFO: renamed from: k */
    public final String m511k() {
        return this.fieldPath_;
    }

    /* JADX INFO: renamed from: l */
    public final C0393Z0 m512l() {
        return this.transformTypeCase_ == 3 ? (C0393Z0) this.transformType_ : C0393Z0.m730w();
    }

    /* JADX INFO: renamed from: m */
    public final C0406e m513m() {
        return this.transformTypeCase_ == 7 ? (C0406e) this.transformType_ : C0406e.m797h();
    }

    /* JADX INFO: renamed from: n */
    public final EnumC0453z m514n() {
        int i2 = this.transformTypeCase_;
        EnumC0453z enumC0453z = EnumC0453z.SERVER_VALUE_UNSPECIFIED;
        if (i2 == 2) {
            int iIntValue = ((Integer) this.transformType_).intValue();
            if (iIntValue != 0) {
                enumC0453z = iIntValue != 1 ? null : EnumC0453z.REQUEST_TIME;
            }
            if (enumC0453z == null) {
                return EnumC0453z.UNRECOGNIZED;
            }
        }
        return enumC0453z;
    }

    /* JADX INFO: renamed from: o */
    public final int m515o() {
        int i2 = this.transformTypeCase_;
        if (i2 == 0) {
            return 7;
        }
        switch (i2) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }
}
