package p019L;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: L.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0332g extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0332g DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private InterfaceC6210Z fields_ = AbstractC6185M.emptyProtobufList();

    static {
        C0332g c0332g = new C0332g();
        DEFAULT_INSTANCE = c0332g;
        AbstractC6185M.registerDefaultInstance(C0332g.class, c0332g);
    }

    /* JADX INFO: renamed from: e */
    public static void m480e(C0332g c0332g) {
        c0332g.getClass();
        c0332g.queryScope_ = EnumC0331f.COLLECTION_GROUP.getNumber();
    }

    /* JADX INFO: renamed from: f */
    public static void m481f(C0332g c0332g, C0330e c0330e) {
        c0332g.getClass();
        c0330e.getClass();
        InterfaceC6210Z interfaceC6210Z = c0332g.fields_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0332g.fields_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0332g.fields_.add(c0330e);
    }

    /* JADX INFO: renamed from: h */
    public static C0326a m482h() {
        return (C0326a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: i */
    public static C0332g m483i(byte[] bArr) {
        return (C0332g) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", C0330e.class, "state_"});
            case 3:
                return new C0332g();
            case 4:
                return new C0326a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0332g.class) {
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
    public final InterfaceC6210Z m484g() {
        return this.fields_;
    }
}
