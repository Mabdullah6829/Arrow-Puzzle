package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0421j extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final C0421j DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER;
    private AbstractC6251n bitmap_ = AbstractC6251n.f24219t;
    private int padding_;

    static {
        C0421j c0421j = new C0421j();
        DEFAULT_INSTANCE = c0421j;
        AbstractC6185M.registerDefaultInstance(C0421j.class, c0421j);
    }

    /* JADX INFO: renamed from: f */
    public static C0421j m840f() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 3:
                return new C0421j();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0421j.class) {
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

    /* JADX INFO: renamed from: e */
    public final AbstractC6251n m841e() {
        return this.bitmap_;
    }

    /* JADX INFO: renamed from: g */
    public final int m842g() {
        return this.padding_;
    }
}
