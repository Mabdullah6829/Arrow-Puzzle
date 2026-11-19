package p020M;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;
import p022N.C0362J0;

/* JADX INFO: renamed from: M.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0335c extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0335c DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        C0335c c0335c = new C0335c();
        DEFAULT_INSTANCE = c0335c;
        AbstractC6185M.registerDefaultInstance(C0335c.class, c0335c);
    }

    /* JADX INFO: renamed from: e */
    public static void m488e(C0335c c0335c, String str) {
        c0335c.getClass();
        str.getClass();
        c0335c.parent_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static void m489f(C0335c c0335c, C0362J0 c0362j0) {
        c0335c.getClass();
        c0362j0.getClass();
        c0335c.queryType_ = c0362j0;
        c0335c.queryTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: g */
    public static void m490g(C0335c c0335c, EnumC0334b enumC0334b) {
        c0335c.getClass();
        c0335c.limitType_ = enumC0334b.getNumber();
    }

    /* JADX INFO: renamed from: k */
    public static C0333a m491k() {
        return (C0333a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: l */
    public static C0335c m492l(byte[] bArr) {
        return (C0335c) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", C0362J0.class, "limitType_"});
            case 3:
                return new C0335c();
            case 4:
                return new C0333a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0335c.class) {
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
    public final EnumC0334b m493h() {
        EnumC0334b enumC0334b;
        int i2 = this.limitType_;
        if (i2 != 0) {
            enumC0334b = i2 != 1 ? null : EnumC0334b.LAST;
        } else {
            enumC0334b = EnumC0334b.FIRST;
        }
        return enumC0334b == null ? EnumC0334b.UNRECOGNIZED : enumC0334b;
    }

    /* JADX INFO: renamed from: i */
    public final String m494i() {
        return this.parent_;
    }

    /* JADX INFO: renamed from: j */
    public final C0362J0 m495j() {
        return this.queryTypeCase_ == 2 ? (C0362J0) this.queryType_ : C0362J0.m586k();
    }
}
