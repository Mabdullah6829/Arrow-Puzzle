package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6218c;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import java.util.List;

/* JADX INFO: renamed from: N.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0406e extends AbstractC6185M implements InterfaceC0409f {
    private static final C0406e DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private InterfaceC6210Z values_ = AbstractC6185M.emptyProtobufList();

    static {
        C0406e c0406e = new C0406e();
        DEFAULT_INSTANCE = c0406e;
        AbstractC6185M.registerDefaultInstance(C0406e.class, c0406e);
    }

    /* JADX INFO: renamed from: e */
    public static void m794e(C0406e c0406e, C0393Z0 c0393z0) {
        c0406e.getClass();
        c0393z0.getClass();
        InterfaceC6210Z interfaceC6210Z = c0406e.values_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0406e.values_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0406e.values_.add(c0393z0);
    }

    /* JADX INFO: renamed from: f */
    public static void m795f(C0406e c0406e, Iterable iterable) {
        InterfaceC6210Z interfaceC6210Z = c0406e.values_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0406e.values_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        AbstractC6218c.addAll(iterable, (List) c0406e.values_);
    }

    /* JADX INFO: renamed from: g */
    public static void m796g(C0406e c0406e, int i2) {
        InterfaceC6210Z interfaceC6210Z = c0406e.values_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0406e.values_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0406e.values_.remove(i2);
    }

    /* JADX INFO: renamed from: h */
    public static C0406e m797h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static C0403d m798k() {
        return (C0403d) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C0393Z0.class});
            case 3:
                return new C0406e();
            case 4:
                return new C0403d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0406e.class) {
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

    @Override // p022N.InterfaceC0409f
    public final List getValuesList() {
        return this.values_;
    }

    /* JADX INFO: renamed from: i */
    public final C0393Z0 m799i(int i2) {
        return (C0393Z0) this.values_.get(i2);
    }

    /* JADX INFO: renamed from: j */
    public final int m800j() {
        return this.values_.size();
    }
}
