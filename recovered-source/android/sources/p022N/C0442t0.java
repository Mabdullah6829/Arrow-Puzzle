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

/* JADX INFO: renamed from: N.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0442t0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0442t0 DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER;
    private InterfaceC6210Z filters_ = AbstractC6185M.emptyProtobufList();
    private int op_;

    static {
        C0442t0 c0442t0 = new C0442t0();
        DEFAULT_INSTANCE = c0442t0;
        AbstractC6185M.registerDefaultInstance(C0442t0.class, c0442t0);
    }

    /* JADX INFO: renamed from: e */
    public static void m908e(C0442t0 c0442t0, EnumC0440s0 enumC0440s0) {
        c0442t0.getClass();
        c0442t0.op_ = enumC0440s0.getNumber();
    }

    /* JADX INFO: renamed from: f */
    public static void m909f(C0442t0 c0442t0, ArrayList arrayList) {
        InterfaceC6210Z interfaceC6210Z = c0442t0.filters_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0442t0.filters_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        AbstractC6218c.addAll((Iterable) arrayList, (List) c0442t0.filters_);
    }

    /* JADX INFO: renamed from: g */
    public static C0442t0 m910g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static C0438r0 m911j() {
        return (C0438r0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", C0348C0.class});
            case 3:
                return new C0442t0();
            case 4:
                return new C0438r0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0442t0.class) {
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

    /* JADX INFO: renamed from: h */
    public final InterfaceC6210Z m912h() {
        return this.filters_;
    }

    /* JADX INFO: renamed from: i */
    public final EnumC0440s0 m913i() {
        EnumC0440s0 enumC0440s0;
        int i2 = this.op_;
        if (i2 == 0) {
            enumC0440s0 = EnumC0440s0.OPERATOR_UNSPECIFIED;
        } else if (i2 != 1) {
            enumC0440s0 = i2 != 2 ? null : EnumC0440s0.OR;
        } else {
            enumC0440s0 = EnumC0440s0.AND;
        }
        return enumC0440s0 == null ? EnumC0440s0.UNRECOGNIZED : enumC0440s0;
    }
}
