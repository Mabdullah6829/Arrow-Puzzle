package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6218c;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;
import java.util.List;

/* JADX INFO: renamed from: N.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C0433p extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C0433p DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private InterfaceC6210Z values_ = AbstractC6185M.emptyProtobufList();

    static {
        C0433p c0433p = new C0433p();
        DEFAULT_INSTANCE = c0433p;
        AbstractC6185M.registerDefaultInstance(C0433p.class, c0433p);
    }

    /* JADX INFO: renamed from: e */
    public static void m877e(C0433p c0433p, Iterable iterable) {
        InterfaceC6210Z interfaceC6210Z = c0433p.values_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0433p.values_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        AbstractC6218c.addAll(iterable, (List) c0433p.values_);
    }

    /* JADX INFO: renamed from: f */
    public static void m878f(C0433p c0433p, boolean z) {
        c0433p.before_ = z;
    }

    /* JADX INFO: renamed from: h */
    public static C0433p m879h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static C0431o m880i() {
        return (C0431o) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", C0393Z0.class, "before_"});
            case 3:
                return new C0433p();
            case 4:
                return new C0431o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0433p.class) {
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
    public final boolean m881g() {
        return this.before_;
    }

    public final List getValuesList() {
        return this.values_;
    }
}
