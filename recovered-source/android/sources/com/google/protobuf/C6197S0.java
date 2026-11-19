package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6197S0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C6197S0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        C6197S0 c6197s0 = new C6197S0();
        DEFAULT_INSTANCE = c6197s0;
        AbstractC6185M.registerDefaultInstance(C6197S0.class, c6197s0);
    }

    /* JADX INFO: renamed from: e */
    public static void m11814e(C6197S0 c6197s0, long j2) {
        c6197s0.seconds_ = j2;
    }

    /* JADX INFO: renamed from: f */
    public static void m11815f(C6197S0 c6197s0, int i2) {
        c6197s0.nanos_ = i2;
    }

    /* JADX INFO: renamed from: g */
    public static C6197S0 m11816g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C6195R0 m11817j() {
        return (C6195R0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: k */
    public static C6195R0 m11818k(C6197S0 c6197s0) {
        return (C6195R0) DEFAULT_INSTANCE.createBuilder(c6197s0);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new C6197S0();
            case 4:
                return new C6195R0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C6197S0.class) {
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
    public final int m11819h() {
        return this.nanos_;
    }

    /* JADX INFO: renamed from: i */
    public final long m11820i() {
        return this.seconds_;
    }
}
