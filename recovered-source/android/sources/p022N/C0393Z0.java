package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.EnumC6276z0;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;
import p028Q.C0500b;

/* JADX INFO: renamed from: N.Z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0393Z0 extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final C0393Z0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int FIELD_REFERENCE_VALUE_FIELD_NUMBER = 19;
    public static final int FUNCTION_VALUE_FIELD_NUMBER = 20;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int PIPELINE_VALUE_FIELD_NUMBER = 21;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    public static final int VARIABLE_REFERENCE_VALUE_FIELD_NUMBER = 22;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        C0393Z0 c0393z0 = new C0393Z0();
        DEFAULT_INSTANCE = c0393z0;
        AbstractC6185M.registerDefaultInstance(C0393Z0.class, c0393z0);
    }

    /* JADX INFO: renamed from: O */
    public static C0389X0 m714O() {
        return (C0389X0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: e */
    public static void m715e(C0393Z0 c0393z0, C6197S0 c6197s0) {
        c0393z0.getClass();
        c6197s0.getClass();
        c0393z0.valueType_ = c6197s0;
        c0393z0.valueTypeCase_ = 10;
    }

    /* JADX INFO: renamed from: f */
    public static void m716f(String str, C0393Z0 c0393z0) {
        c0393z0.getClass();
        str.getClass();
        c0393z0.valueTypeCase_ = 17;
        c0393z0.valueType_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static void m717g(C0393Z0 c0393z0, AbstractC6251n abstractC6251n) {
        c0393z0.getClass();
        abstractC6251n.getClass();
        c0393z0.valueTypeCase_ = 18;
        c0393z0.valueType_ = abstractC6251n;
    }

    /* JADX INFO: renamed from: h */
    public static void m718h(String str, C0393Z0 c0393z0) {
        c0393z0.getClass();
        str.getClass();
        c0393z0.valueTypeCase_ = 5;
        c0393z0.valueType_ = str;
    }

    /* JADX INFO: renamed from: i */
    public static void m719i(C0393Z0 c0393z0, C0500b c0500b) {
        c0393z0.getClass();
        c0500b.getClass();
        c0393z0.valueType_ = c0500b;
        c0393z0.valueTypeCase_ = 8;
    }

    /* JADX INFO: renamed from: j */
    public static void m720j(C0406e c0406e, C0393Z0 c0393z0) {
        c0393z0.getClass();
        c0406e.getClass();
        c0393z0.valueType_ = c0406e;
        c0393z0.valueTypeCase_ = 9;
    }

    /* JADX INFO: renamed from: k */
    public static void m721k(C0393Z0 c0393z0, C0375Q c0375q) {
        c0393z0.getClass();
        c0375q.getClass();
        c0393z0.valueType_ = c0375q;
        c0393z0.valueTypeCase_ = 6;
    }

    /* JADX INFO: renamed from: l */
    public static void m722l(C0393Z0 c0393z0) {
        c0393z0.getClass();
        c0393z0.valueType_ = Integer.valueOf(EnumC6276z0.NULL_VALUE.getNumber());
        c0393z0.valueTypeCase_ = 11;
    }

    /* JADX INFO: renamed from: m */
    public static void m723m(String str, C0393Z0 c0393z0) {
        c0393z0.getClass();
        str.getClass();
        c0393z0.valueTypeCase_ = 19;
        c0393z0.valueType_ = str;
    }

    /* JADX INFO: renamed from: n */
    public static void m724n(String str, C0393Z0 c0393z0) {
        c0393z0.getClass();
        str.getClass();
        c0393z0.valueTypeCase_ = 22;
        c0393z0.valueType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m725o(C0361J c0361j, C0393Z0 c0393z0) {
        c0393z0.getClass();
        c0361j.getClass();
        c0393z0.valueType_ = c0361j;
        c0393z0.valueTypeCase_ = 20;
    }

    /* JADX INFO: renamed from: p */
    public static void m726p(C0393Z0 c0393z0, C0386W c0386w) {
        c0393z0.getClass();
        c0386w.getClass();
        c0393z0.valueType_ = c0386w;
        c0393z0.valueTypeCase_ = 21;
    }

    /* JADX INFO: renamed from: q */
    public static void m727q(C0393Z0 c0393z0, boolean z) {
        c0393z0.valueTypeCase_ = 1;
        c0393z0.valueType_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: r */
    public static void m728r(C0393Z0 c0393z0, long j2) {
        c0393z0.valueTypeCase_ = 2;
        c0393z0.valueType_ = Long.valueOf(j2);
    }

    /* JADX INFO: renamed from: s */
    public static void m729s(C0393Z0 c0393z0, double d) {
        c0393z0.valueTypeCase_ = 3;
        c0393z0.valueType_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: w */
    public static C0393Z0 m730w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final C0500b m731A() {
        return this.valueTypeCase_ == 8 ? (C0500b) this.valueType_ : C0500b.m1188g();
    }

    /* JADX INFO: renamed from: B */
    public final long m732B() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: C */
    public final C0375Q m733C() {
        return this.valueTypeCase_ == 6 ? (C0375Q) this.valueType_ : C0375Q.m645f();
    }

    /* JADX INFO: renamed from: D */
    public final String m734D() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    /* JADX INFO: renamed from: E */
    public final String m735E() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    /* JADX INFO: renamed from: F */
    public final C6197S0 m736F() {
        return this.valueTypeCase_ == 10 ? (C6197S0) this.valueType_ : C6197S0.m11816g();
    }

    /* JADX INFO: renamed from: G */
    public final EnumC0391Y0 m737G() {
        int i2 = this.valueTypeCase_;
        if (i2 == 0) {
            return EnumC0391Y0.f731H;
        }
        if (i2 == 1) {
            return EnumC0391Y0.f734t;
        }
        if (i2 == 2) {
            return EnumC0391Y0.f735u;
        }
        if (i2 == 3) {
            return EnumC0391Y0.f736v;
        }
        if (i2 == 5) {
            return EnumC0391Y0.f740z;
        }
        if (i2 == 6) {
            return EnumC0391Y0.f726C;
        }
        switch (i2) {
            case 8:
                return EnumC0391Y0.f724A;
            case 9:
                return EnumC0391Y0.f725B;
            case 10:
                return EnumC0391Y0.f737w;
            case 11:
                return EnumC0391Y0.f733s;
            default:
                switch (i2) {
                    case 17:
                        return EnumC0391Y0.f738x;
                    case 18:
                        return EnumC0391Y0.f739y;
                    case 19:
                        return EnumC0391Y0.f727D;
                    case 20:
                        return EnumC0391Y0.f729F;
                    case 21:
                        return EnumC0391Y0.f730G;
                    case 22:
                        return EnumC0391Y0.f728E;
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m738H() {
        return this.valueTypeCase_ == 9;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m739I() {
        return this.valueTypeCase_ == 3;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m740J() {
        return this.valueTypeCase_ == 2;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m741K() {
        return this.valueTypeCase_ == 6;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m742L() {
        return this.valueTypeCase_ == 11;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m743M() {
        return this.valueTypeCase_ == 5;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m744N() {
        return this.valueTypeCase_ == 17;
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0001\u0000\u0001\u0016\u000f\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000\u0013Ȼ\u0000\u0014<\u0000\u0015<\u0000\u0016Ȼ\u0000", new Object[]{"valueType_", "valueTypeCase_", C0375Q.class, C0500b.class, C0406e.class, C6197S0.class, C0361J.class, C0386W.class});
            case 3:
                return new C0393Z0();
            case 4:
                return new C0389X0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0393Z0.class) {
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

    /* JADX INFO: renamed from: t */
    public final C0406e m745t() {
        return this.valueTypeCase_ == 9 ? (C0406e) this.valueType_ : C0406e.m797h();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m746u() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC6251n m747v() {
        return this.valueTypeCase_ == 18 ? (AbstractC6251n) this.valueType_ : AbstractC6251n.f24219t;
    }

    /* JADX INFO: renamed from: x */
    public final double m748x() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: y */
    public final String m749y() {
        return this.valueTypeCase_ == 19 ? (String) this.valueType_ : "";
    }

    /* JADX INFO: renamed from: z */
    public final C0361J m750z() {
        return this.valueTypeCase_ == 20 ? (C0361J) this.valueType_ : C0361J.m577i();
    }
}
