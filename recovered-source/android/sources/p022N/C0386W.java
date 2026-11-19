package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6218c;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: N.W */
/* JADX INFO: loaded from: classes2.dex */
public final class C0386W extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0386W DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int STAGES_FIELD_NUMBER = 1;
    private InterfaceC6210Z stages_ = AbstractC6185M.emptyProtobufList();

    static {
        C0386W c0386w = new C0386W();
        DEFAULT_INSTANCE = c0386w;
        AbstractC6185M.registerDefaultInstance(C0386W.class, c0386w);
    }

    /* JADX INFO: renamed from: e */
    public static void m680e(C0386W c0386w, ArrayList arrayList) {
        InterfaceC6210Z interfaceC6210Z = c0386w.stages_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0386w.stages_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        AbstractC6218c.addAll((Iterable) arrayList, (List) c0386w.stages_);
    }

    /* JADX INFO: renamed from: f */
    public static C0386W m681f() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static C0378S m682h() {
        return (C0378S) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stages_", C0384V.class});
            case 3:
                return new C0386W();
            case 4:
                return new C0378S(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0386W.class) {
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
    public final InterfaceC6210Z m683g() {
        return this.stages_;
    }
}
