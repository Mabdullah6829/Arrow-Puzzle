package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6252n0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6264t0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: N.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0400c extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C0400c DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER;
    private C6252n0 aggregateFields_ = C6252n0.f24222t;

    static {
        C0400c c0400c = new C0400c();
        DEFAULT_INSTANCE = c0400c;
        AbstractC6185M.registerDefaultInstance(C0400c.class, c0400c);
    }

    /* JADX INFO: renamed from: f */
    public static C0400c m763f() {
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", AbstractC0394a.f741a});
            case 3:
                return new C0400c();
            case 4:
                return new C0397b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0400c.class) {
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
    public final Map m764e() {
        return Collections.unmodifiableMap(this.aggregateFields_);
    }
}
