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

/* JADX INFO: renamed from: N.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0424k0 extends AbstractC6185M implements InterfaceC6264t0 {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final C0424k0 DEFAULT_INSTANCE;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private InterfaceC6210Z aggregations_ = AbstractC6185M.emptyProtobufList();

    static {
        C0424k0 c0424k0 = new C0424k0();
        DEFAULT_INSTANCE = c0424k0;
        AbstractC6185M.registerDefaultInstance(C0424k0.class, c0424k0);
    }

    /* JADX INFO: renamed from: e */
    public static void m849e(C0424k0 c0424k0, C0362J0 c0362j0) {
        c0424k0.getClass();
        c0362j0.getClass();
        c0424k0.queryType_ = c0362j0;
        c0424k0.queryTypeCase_ = 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m850f(C0424k0 c0424k0, ArrayList arrayList) {
        InterfaceC6210Z interfaceC6210Z = c0424k0.aggregations_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0424k0.aggregations_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        AbstractC6218c.addAll((Iterable) arrayList, (List) c0424k0.aggregations_);
    }

    /* JADX INFO: renamed from: g */
    public static C0422j0 m851g() {
        return (C0422j0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", C0362J0.class, "aggregations_", C0419i0.class});
            case 3:
                return new C0424k0();
            case 4:
                return new C0422j0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0424k0.class) {
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
}
