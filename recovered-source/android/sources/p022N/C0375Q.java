package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6252n0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: N.Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0375Q extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0375Q DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER;
    private C6252n0 fields_ = C6252n0.f24222t;

    static {
        C0375Q c0375q = new C0375Q();
        DEFAULT_INSTANCE = c0375q;
        AbstractC6185M.registerDefaultInstance(C0375Q.class, c0375q);
    }

    /* JADX INFO: renamed from: e */
    public static C6252n0 m644e(C0375Q c0375q) {
        C6252n0 c6252n0 = c0375q.fields_;
        if (!c6252n0.f24223s) {
            c0375q.fields_ = c6252n0.m11901c();
        }
        return c0375q.fields_;
    }

    /* JADX INFO: renamed from: f */
    public static C0375Q m645f() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static C0371O m646k() {
        return (C0371O) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", AbstractC0373P.f714a});
            case 3:
                return new C0375Q();
            case 4:
                return new C0371O(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0375Q.class) {
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
    public final int m647g() {
        return this.fields_.size();
    }

    /* JADX INFO: renamed from: h */
    public final Map m648h() {
        return Collections.unmodifiableMap(this.fields_);
    }

    /* JADX INFO: renamed from: i */
    public final C0393Z0 m649i(String str) {
        str.getClass();
        C6252n0 c6252n0 = this.fields_;
        if (c6252n0.containsKey(str)) {
            return (C0393Z0) c6252n0.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final C0393Z0 m650j(String str) {
        str.getClass();
        C6252n0 c6252n0 = this.fields_;
        if (c6252n0.containsKey(str)) {
            return (C0393Z0) c6252n0.get(str);
        }
        throw new IllegalArgumentException();
    }
}
