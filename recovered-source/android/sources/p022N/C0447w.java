package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C0447w extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0447w DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER;
    private InterfaceC6210Z fieldPaths_ = AbstractC6185M.emptyProtobufList();

    static {
        C0447w c0447w = new C0447w();
        DEFAULT_INSTANCE = c0447w;
        AbstractC6185M.registerDefaultInstance(C0447w.class, c0447w);
    }

    /* JADX INFO: renamed from: e */
    public static void m921e(C0447w c0447w, String str) {
        c0447w.getClass();
        str.getClass();
        InterfaceC6210Z interfaceC6210Z = c0447w.fieldPaths_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0447w.fieldPaths_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0447w.fieldPaths_.add(str);
    }

    /* JADX INFO: renamed from: f */
    public static C0447w m922f() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C0445v m923i() {
        return (C0445v) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new C0447w();
            case 4:
                return new C0445v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0447w.class) {
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
    public final String m924g(int i2) {
        return (String) this.fieldPaths_.get(i2);
    }

    /* JADX INFO: renamed from: h */
    public final int m925h() {
        return this.fieldPaths_.size();
    }
}
