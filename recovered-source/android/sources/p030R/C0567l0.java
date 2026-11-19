package p030R;

import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6261s;
import com.google.protobuf.C6177I;
import com.google.protobuf.InterfaceC6262s0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p011H.AbstractC0271e0;
import p041Y.AbstractC0875c;
import p041Y.C0873a;
import p041Y.C0874b;

/* JADX INFO: renamed from: R.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0567l0 {

    /* JADX INFO: renamed from: a */
    public final EnumC0565k0 f1200a;

    /* JADX INFO: renamed from: b */
    public final String f1201b;

    /* JADX INFO: renamed from: c */
    public final String f1202c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0563j0 f1203d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0563j0 f1204e;

    /* JADX INFO: renamed from: f */
    public final boolean f1205f;

    public C0567l0(EnumC0565k0 enumC0565k0, String str, C0874b c0874b, C0874b c0874b2, boolean z) {
        new AtomicReferenceArray(2);
        AbstractC0076b.m133h(enumC0565k0, "type");
        this.f1200a = enumC0565k0;
        AbstractC0076b.m133h(str, "fullMethodName");
        this.f1201b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f1202c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        AbstractC0076b.m133h(c0874b, "requestMarshaller");
        this.f1203d = c0874b;
        AbstractC0076b.m133h(c0874b2, "responseMarshaller");
        this.f1204e = c0874b2;
        this.f1205f = z;
    }

    /* JADX INFO: renamed from: a */
    public static String m1317a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        AbstractC0076b.m133h(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        AbstractC0076b.m133h(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C0561i0 m1318b() {
        C0561i0 c0561i0 = new C0561i0();
        c0561i0.f1192b = null;
        c0561i0.f1193c = null;
        return c0561i0;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC6262s0 m1319c(InputStream inputStream) {
        AbstractC6261s abstractC6261sM11967g;
        byte[] bArr;
        C0874b c0874b = (C0874b) this.f1204e;
        c0874b.getClass();
        if ((inputStream instanceof C0873a) && ((C0873a) inputStream).f2450t == c0874b.f2453a) {
            try {
                InterfaceC6262s0 interfaceC6262s0 = ((C0873a) inputStream).f2449s;
                if (interfaceC6262s0 != null) {
                    return interfaceC6262s0;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof InterfaceC0532N) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return c0874b.f2454b;
                    }
                    abstractC6261sM11967g = null;
                } else {
                    ThreadLocal threadLocal = C0874b.f2452d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i2 = iAvailable;
                    while (i2 > 0) {
                        int i3 = inputStream.read(bArr, iAvailable - i2, i2);
                        if (i3 == -1) {
                            break;
                        }
                        i2 -= i3;
                    }
                    if (i2 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i2));
                    }
                    abstractC6261sM11967g = AbstractC6261s.m11966f(bArr, 0, iAvailable, false);
                }
            } else {
                abstractC6261sM11967g = null;
            }
            if (abstractC6261sM11967g == null) {
                abstractC6261sM11967g = AbstractC6261s.m11967g(inputStream);
            }
            int i4 = c0874b.f2455c;
            if (i4 >= 0) {
                if (i4 < 0) {
                    throw new IllegalArgumentException(AbstractC0271e0.m396d(i4, "Recursion limit cannot be negative: "));
                }
                abstractC6261sM11967g.f24260b = i4;
            }
            try {
                AbstractC6185M partialFrom = AbstractC6185M.parsePartialFrom(((C6177I) c0874b.f2453a).f24087a, abstractC6261sM11967g, AbstractC0875c.f2456a);
                if (partialFrom != null && !partialFrom.isInitialized()) {
                    UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = partialFrom.newUninitializedMessageException();
                    uninitializedMessageExceptionNewUninitializedMessageException.getClass();
                    throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
                }
                abstractC6261sM11967g.mo11912a(0);
                return partialFrom;
            } catch (InvalidProtocolBufferException e) {
                throw new StatusRuntimeException(C0589w0.f1283m.m1354g("Invalid protobuf byte sequence").m1353f(e));
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C0873a m1320d(Object obj) {
        C0874b c0874b = (C0874b) this.f1203d;
        c0874b.getClass();
        return new C0873a((InterfaceC6262s0) obj, c0874b.f2453a);
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1201b, "fullMethodName");
        c0087mM143s.m158b(this.f1200a, "type");
        c0087mM143s.m159c("idempotent", false);
        c0087mM143s.m159c("safe", false);
        c0087mM143s.m159c("sampledToLocalTracing", this.f1205f);
        c0087mM143s.m158b(this.f1203d, "requestMarshaller");
        c0087mM143s.m158b(this.f1204e, "responseMarshaller");
        c0087mM143s.m158b(null, "schemaDescriptor");
        c0087mM143s.f118d = true;
        return c0087mM143s.toString();
    }
}
