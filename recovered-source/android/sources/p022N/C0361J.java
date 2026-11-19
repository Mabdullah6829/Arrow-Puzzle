package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6252n0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C0361J extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int ARGS_FIELD_NUMBER = 2;
    private static final C0361J DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC6162A0 PARSER;
    private C6252n0 options_ = C6252n0.f24222t;
    private String name_ = "";
    private InterfaceC6210Z args_ = AbstractC6185M.emptyProtobufList();

    static {
        C0361J c0361j = new C0361J();
        DEFAULT_INSTANCE = c0361j;
        AbstractC6185M.registerDefaultInstance(C0361J.class, c0361j);
    }

    /* JADX INFO: renamed from: e */
    public static void m574e(C0361J c0361j, String str) {
        c0361j.getClass();
        str.getClass();
        c0361j.name_ = str;
    }

    /* JADX INFO: renamed from: f */
    public static C6252n0 m575f(C0361J c0361j) {
        C6252n0 c6252n0 = c0361j.options_;
        if (!c6252n0.f24223s) {
            c0361j.options_ = c6252n0.m11901c();
        }
        return c0361j.options_;
    }

    /* JADX INFO: renamed from: g */
    public static void m576g(C0361J c0361j, C0393Z0 c0393z0) {
        c0361j.getClass();
        c0393z0.getClass();
        InterfaceC6210Z interfaceC6210Z = c0361j.args_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0361j.args_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0361j.args_.add(c0393z0);
    }

    /* JADX INFO: renamed from: i */
    public static C0361J m577i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C0357H m578j() {
        return (C0357H) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001Ȉ\u0002\u001b\u00032", new Object[]{"name_", "args_", C0393Z0.class, "options_", AbstractC0359I.f712a});
            case 3:
                return new C0361J();
            case 4:
                return new C0357H(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0361J.class) {
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
    public final InterfaceC6210Z m579h() {
        return this.args_;
    }
}
