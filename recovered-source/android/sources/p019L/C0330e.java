package p019L;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0330e extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
    private static final C0330e DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int ORDER_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER;
    private Object valueMode_;
    private int valueModeCase_ = 0;
    private String fieldPath_ = "";

    static {
        C0330e c0330e = new C0330e();
        DEFAULT_INSTANCE = c0330e;
        AbstractC6185M.registerDefaultInstance(C0330e.class, c0330e);
    }

    /* JADX INFO: renamed from: e */
    public static void m473e(C0330e c0330e, String str) {
        c0330e.getClass();
        str.getClass();
        c0330e.fieldPath_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m474f(C0330e c0330e, EnumC0329d enumC0329d) {
        c0330e.getClass();
        c0330e.valueMode_ = Integer.valueOf(enumC0329d.getNumber());
        c0330e.valueModeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static void m475g(C0330e c0330e) {
        c0330e.getClass();
        c0330e.valueMode_ = Integer.valueOf(EnumC0327b.CONTAINS.getNumber());
        c0330e.valueModeCase_ = 3;
    }

    /* JADX INFO: renamed from: k */
    public static C0328c m476k() {
        return (C0328c) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
            case 3:
                return new C0330e();
            case 4:
                return new C0328c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0330e.class) {
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

    /* JADX INFO: renamed from: h */
    public final String m477h() {
        return this.fieldPath_;
    }

    /* JADX INFO: renamed from: i */
    public final EnumC0329d m478i() {
        int i2 = this.valueModeCase_;
        EnumC0329d enumC0329d = EnumC0329d.ORDER_UNSPECIFIED;
        if (i2 == 2) {
            int iIntValue = ((Integer) this.valueMode_).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    enumC0329d = iIntValue != 2 ? null : EnumC0329d.DESCENDING;
                } else {
                    enumC0329d = EnumC0329d.ASCENDING;
                }
            }
            if (enumC0329d == null) {
                return EnumC0329d.UNRECOGNIZED;
            }
        }
        return enumC0329d;
    }

    /* JADX INFO: renamed from: j */
    public final int m479j() {
        int i2 = this.valueModeCase_;
        if (i2 == 0) {
            return 3;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 2;
        }
        return 1;
    }
}
