package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;

/* JADX INFO: renamed from: N.c1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0402c1 extends AbstractC6185M implements InterfaceC0405d1 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final C0402c1 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private C0390Y currentDocument_;
    private Object operation_;
    private C0447w updateMask_;
    private int operationCase_ = 0;
    private InterfaceC6210Z updateTransforms_ = AbstractC6185M.emptyProtobufList();

    static {
        C0402c1 c0402c1 = new C0402c1();
        DEFAULT_INSTANCE = c0402c1;
        AbstractC6185M.registerDefaultInstance(C0402c1.class, c0402c1);
    }

    /* JADX INFO: renamed from: e */
    public static void m766e(C0402c1 c0402c1, C0447w c0447w) {
        c0402c1.getClass();
        c0447w.getClass();
        c0402c1.updateMask_ = c0447w;
        c0402c1.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: f */
    public static void m767f(C0402c1 c0402c1, C0343A c0343a) {
        c0402c1.getClass();
        c0343a.getClass();
        InterfaceC6210Z interfaceC6210Z = c0402c1.updateTransforms_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0402c1.updateTransforms_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0402c1.updateTransforms_.add(c0343a);
    }

    /* JADX INFO: renamed from: g */
    public static void m768g(C0402c1 c0402c1, C0439s c0439s) {
        c0402c1.getClass();
        c0439s.getClass();
        c0402c1.operation_ = c0439s;
        c0402c1.operationCase_ = 1;
    }

    /* JADX INFO: renamed from: h */
    public static void m769h(C0402c1 c0402c1, C0390Y c0390y) {
        c0402c1.getClass();
        c0390y.getClass();
        c0402c1.currentDocument_ = c0390y;
        c0402c1.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: i */
    public static void m770i(C0402c1 c0402c1, String str) {
        c0402c1.getClass();
        str.getClass();
        c0402c1.operationCase_ = 2;
        c0402c1.operation_ = str;
    }

    /* JADX INFO: renamed from: j */
    public static void m771j(C0402c1 c0402c1, String str) {
        c0402c1.getClass();
        str.getClass();
        c0402c1.operationCase_ = 5;
        c0402c1.operation_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static C0396a1 m772w() {
        return (C0396a1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: x */
    public static C0396a1 m773x(C0402c1 c0402c1) {
        return (C0396a1) DEFAULT_INSTANCE.createBuilder(c0402c1);
    }

    /* JADX INFO: renamed from: y */
    public static C0402c1 m774y(byte[] bArr) {
        return (C0402c1) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", C0439s.class, "updateMask_", "currentDocument_", C0345B.class, "updateTransforms_", C0343A.class});
            case 3:
                return new C0402c1();
            case 4:
                return new C0396a1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0402c1.class) {
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

    /* JADX INFO: renamed from: k */
    public final C0390Y m775k() {
        C0390Y c0390y = this.currentDocument_;
        return c0390y == null ? C0390Y.m707h() : c0390y;
    }

    /* JADX INFO: renamed from: l */
    public final String m776l() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    /* JADX INFO: renamed from: m */
    public final EnumC0399b1 m777m() {
        int i2 = this.operationCase_;
        if (i2 == 0) {
            return EnumC0399b1.f746w;
        }
        if (i2 == 1) {
            return EnumC0399b1.f742s;
        }
        if (i2 == 2) {
            return EnumC0399b1.f743t;
        }
        if (i2 == 5) {
            return EnumC0399b1.f744u;
        }
        if (i2 != 6) {
            return null;
        }
        return EnumC0399b1.f745v;
    }

    /* JADX INFO: renamed from: n */
    public final C0345B m778n() {
        return this.operationCase_ == 6 ? (C0345B) this.operation_ : C0345B.m519e();
    }

    /* JADX INFO: renamed from: o */
    public final C0439s m779o() {
        return this.operationCase_ == 1 ? (C0439s) this.operation_ : C0439s.m897i();
    }

    /* JADX INFO: renamed from: p */
    public final C0447w m780p() {
        C0447w c0447w = this.updateMask_;
        return c0447w == null ? C0447w.m922f() : c0447w;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC6210Z m781q() {
        return this.updateTransforms_;
    }

    /* JADX INFO: renamed from: r */
    public final String m782r() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    /* JADX INFO: renamed from: s */
    public final boolean m783s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m784t() {
        return this.operationCase_ == 6;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m785u() {
        return this.operationCase_ == 1;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m786v() {
        return (this.bitField0_ & 1) != 0;
    }
}
