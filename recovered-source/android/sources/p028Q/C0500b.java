package p028Q;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: Q.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0500b extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0500b DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER;
    private double latitude_;
    private double longitude_;

    static {
        C0500b c0500b = new C0500b();
        DEFAULT_INSTANCE = c0500b;
        AbstractC6185M.registerDefaultInstance(C0500b.class, c0500b);
    }

    /* JADX INFO: renamed from: e */
    public static void m1186e(C0500b c0500b, double d) {
        c0500b.latitude_ = d;
    }

    /* JADX INFO: renamed from: f */
    public static void m1187f(C0500b c0500b, double d) {
        c0500b.longitude_ = d;
    }

    /* JADX INFO: renamed from: g */
    public static C0500b m1188g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C0499a m1189j() {
        return (C0499a) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 3:
                return new C0500b();
            case 4:
                return new C0499a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0500b.class) {
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
    public final double m1190h() {
        return this.latitude_;
    }

    /* JADX INFO: renamed from: i */
    public final double m1191i() {
        return this.longitude_;
    }
}
