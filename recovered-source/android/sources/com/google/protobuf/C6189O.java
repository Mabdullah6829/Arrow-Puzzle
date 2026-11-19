package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.O */
/* JADX INFO: loaded from: classes.dex */
public final class C6189O extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C6189O DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        C6189O c6189o = new C6189O();
        DEFAULT_INSTANCE = c6189o;
        AbstractC6185M.registerDefaultInstance(C6189O.class, c6189o);
    }

    /* JADX INFO: renamed from: e */
    public static void m11806e(C6189O c6189o, int i2) {
        c6189o.value_ = i2;
    }

    /* JADX INFO: renamed from: f */
    public static C6189O m11807f() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static C6187N m11808h() {
        return (C6187N) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new C6189O();
            case 4:
                return new C6187N(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C6189O.class) {
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

    /* JADX INFO: renamed from: g */
    public final int m11809g() {
        return this.value_;
    }
}
