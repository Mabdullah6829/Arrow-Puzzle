package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6197S0;
import com.google.protobuf.C6252n0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: N.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C0439s extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final C0439s DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private C6197S0 createTime_;
    private C6252n0 fields_ = C6252n0.f24222t;
    private String name_ = "";
    private C6197S0 updateTime_;

    static {
        C0439s c0439s = new C0439s();
        DEFAULT_INSTANCE = c0439s;
        AbstractC6185M.registerDefaultInstance(C0439s.class, c0439s);
    }

    /* JADX INFO: renamed from: e */
    public static void m894e(C0439s c0439s, String str) {
        c0439s.getClass();
        str.getClass();
        c0439s.name_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static C6252n0 m895f(C0439s c0439s) {
        C6252n0 c6252n0 = c0439s.fields_;
        if (!c6252n0.f24223s) {
            c0439s.fields_ = c6252n0.m11901c();
        }
        return c0439s.fields_;
    }

    /* JADX INFO: renamed from: g */
    public static void m896g(C0439s c0439s, C6197S0 c6197s0) {
        c0439s.getClass();
        c6197s0.getClass();
        c0439s.updateTime_ = c6197s0;
        c0439s.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: i */
    public static C0439s m897i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static C0435q m898n() {
        return (C0435q) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: o */
    public static C0435q m899o(C0439s c0439s) {
        return (C0435q) DEFAULT_INSTANCE.createBuilder(c0439s);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", AbstractC0437r.f750a, "createTime_", "updateTime_"});
            case 3:
                return new C0439s();
            case 4:
                return new C0435q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0439s.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: h */
    public final C6197S0 m900h() {
        C6197S0 c6197s0 = this.createTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    /* JADX INFO: renamed from: j */
    public final Map m901j() {
        return Collections.unmodifiableMap(this.fields_);
    }

    /* JADX INFO: renamed from: k */
    public final C6197S0 m902k() {
        C6197S0 c6197s0 = this.updateTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m903l() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m904m() {
        return (this.bitField0_ & 2) != 0;
    }
}
