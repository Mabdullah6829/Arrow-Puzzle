package p022N;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6189O;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import com.google.protobuf.InterfaceC6264t0;

/* JADX INFO: renamed from: N.J0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0362J0 extends AbstractC6185M implements InterfaceC6264t0 {
    private static final C0362J0 DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C0433p endAt_;
    private C6189O limit_;
    private int offset_;
    private C0354F0 select_;
    private C0433p startAt_;
    private C0348C0 where_;
    private InterfaceC6210Z from_ = AbstractC6185M.emptyProtobufList();
    private InterfaceC6210Z orderBy_ = AbstractC6185M.emptyProtobufList();

    static {
        C0362J0 c0362j0 = new C0362J0();
        DEFAULT_INSTANCE = c0362j0;
        AbstractC6185M.registerDefaultInstance(C0362J0.class, c0362j0);
    }

    /* JADX INFO: renamed from: e */
    public static void m580e(C0362J0 c0362j0, C0436q0 c0436q0) {
        c0362j0.getClass();
        c0436q0.getClass();
        InterfaceC6210Z interfaceC6210Z = c0362j0.from_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0362j0.from_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0362j0.from_.add(c0436q0);
    }

    /* JADX INFO: renamed from: f */
    public static void m581f(C0362J0 c0362j0, C0348C0 c0348c0) {
        c0362j0.getClass();
        c0348c0.getClass();
        c0362j0.where_ = c0348c0;
        c0362j0.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: g */
    public static void m582g(C0362J0 c0362j0, C0352E0 c0352e0) {
        c0362j0.getClass();
        c0352e0.getClass();
        InterfaceC6210Z interfaceC6210Z = c0362j0.orderBy_;
        if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
            c0362j0.orderBy_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
        }
        c0362j0.orderBy_.add(c0352e0);
    }

    /* JADX INFO: renamed from: h */
    public static void m583h(C0362J0 c0362j0, C0433p c0433p) {
        c0362j0.getClass();
        c0433p.getClass();
        c0362j0.startAt_ = c0433p;
        c0362j0.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: i */
    public static void m584i(C0362J0 c0362j0, C0433p c0433p) {
        c0362j0.getClass();
        c0433p.getClass();
        c0362j0.endAt_ = c0433p;
        c0362j0.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: j */
    public static void m585j(C0362J0 c0362j0, C6189O c6189o) {
        c0362j0.getClass();
        c6189o.getClass();
        c0362j0.limit_ = c6189o;
        c0362j0.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: k */
    public static C0362J0 m586k() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static C0432o0 m587x() {
        return (C0432o0) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", C0436q0.class, "where_", "orderBy_", C0352E0.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 3:
                return new C0362J0();
            case 4:
                return new C0432o0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (C0362J0.class) {
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

    /* JADX INFO: renamed from: l */
    public final C0433p m588l() {
        C0433p c0433p = this.endAt_;
        return c0433p == null ? C0433p.m879h() : c0433p;
    }

    /* JADX INFO: renamed from: m */
    public final C0436q0 m589m() {
        return (C0436q0) this.from_.get(0);
    }

    /* JADX INFO: renamed from: n */
    public final int m590n() {
        return this.from_.size();
    }

    /* JADX INFO: renamed from: o */
    public final C6189O m591o() {
        C6189O c6189o = this.limit_;
        return c6189o == null ? C6189O.m11807f() : c6189o;
    }

    /* JADX INFO: renamed from: p */
    public final C0352E0 m592p(int i2) {
        return (C0352E0) this.orderBy_.get(i2);
    }

    /* JADX INFO: renamed from: q */
    public final int m593q() {
        return this.orderBy_.size();
    }

    /* JADX INFO: renamed from: r */
    public final C0433p m594r() {
        C0433p c0433p = this.startAt_;
        return c0433p == null ? C0433p.m879h() : c0433p;
    }

    /* JADX INFO: renamed from: s */
    public final C0348C0 m595s() {
        C0348C0 c0348c0 = this.where_;
        return c0348c0 == null ? C0348C0.m526i() : c0348c0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m596t() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m597u() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m598v() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m599w() {
        return (this.bitField0_ & 2) != 0;
    }
}
