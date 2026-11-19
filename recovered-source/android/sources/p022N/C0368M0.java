package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.M0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0368M0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0368M0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER;
    private InterfaceC6210Z documents_ = AbstractC6185M.emptyProtobufList();

    static {
        C0368M0 c0368m0 = new C0368M0();
        DEFAULT_INSTANCE = c0368m0;
        AbstractC6185M.registerDefaultInstance(C0368M0.class, c0368m0);
    }

    /* JADX INFO: renamed from: e */
    public static void m618e(C0368M0 c0368m0, String str) {
        c0368m0.getClass();
        str.getClass();
        InterfaceC6210Z interfaceC6210Z = c0368m0.documents_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0368m0.documents_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0368m0.documents_.add(str);
    }

    /* JADX INFO: renamed from: f */
    public static C0368M0 m619f() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C0366L0 m620i() {
        return (C0366L0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: j */
    public static C0366L0 m621j(C0368M0 c0368m0) {
        return (C0366L0) DEFAULT_INSTANCE.createBuilder(c0368m0);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
            case 3:
                return new C0368M0();
            case 4:
                return new C0366L0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0368M0.class) {
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
    public final String m622g() {
        return (String) this.documents_.get(0);
    }

    /* JADX INFO: renamed from: h */
    public final int m623h() {
        return this.documents_.size();
    }
}
