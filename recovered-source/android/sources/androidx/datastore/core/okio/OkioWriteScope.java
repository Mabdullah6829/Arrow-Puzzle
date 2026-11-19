package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p033S0.AbstractC0620n;
import p033S0.C0622p;
import p033S0.C0627u;
import p033S0.C0628v;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.okio.OkioWriteScope", m12159f = "OkioStorage.kt", m12160l = {216}, m12161m = "writeData")
    public static final class C13471 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13471(OkioWriteScope<T> okioWriteScope, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = okioWriteScope;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(AbstractC0620n fileSystem, C0627u path, OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        AbstractC6452k.m12181e(fileSystem, "fileSystem");
        AbstractC6452k.m12181e(path, "path");
        AbstractC6452k.m12181e(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3, types: [S0.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [S0.p] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // androidx.datastore.core.WriteScope
    public Object writeData(T t, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13471 c13471;
        ?? Mo1366g;
        ?? r0;
        Throwable th;
        Closeable closeable;
        ?? r1;
        C6289k c6289k;
        Throwable th2;
        ?? r10;
        C6289k c6289k2;
        if (interfaceC6348c instanceof C13471) {
            c13471 = (C13471) interfaceC6348c;
            int i2 = c13471.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13471.label = i2 - Integer.MIN_VALUE;
            } else {
                c13471 = new C13471(this, interfaceC6348c);
            }
        } else {
            c13471 = new C13471(this, interfaceC6348c);
        }
        Object obj = c13471.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13471.label;
        C6289k c6289k3 = C6289k.f24318a;
        Throwable th3 = null;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            checkClose();
            AbstractC0620n fileSystem = getFileSystem();
            C0627u file = getPath();
            fileSystem.getClass();
            AbstractC6452k.m12181e(file, "file");
            Mo1366g = fileSystem.mo1366g(file);
            try {
                C0628v c0628v = new C0628v(C0622p.m1418c(Mo1366g));
                try {
                    OkioSerializer<T> serializer = getSerializer();
                    c13471.L$0 = Mo1366g;
                    c13471.L$1 = Mo1366g;
                    c13471.L$2 = c0628v;
                    c13471.label = 1;
                    if (serializer.writeTo(t, c0628v, c13471) == enumC6363a) {
                        return enumC6363a;
                    }
                    ?? r2 = Mo1366g;
                    r1 = r2;
                    closeable = c0628v;
                    r0 = r2;
                } catch (Throwable th4) {
                    r0 = Mo1366g;
                    th = th4;
                    closeable = c0628v;
                    if (closeable != null) {
                        closeable.close();
                    }
                    th2 = th;
                    r10 = r0;
                    c6289k2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                if (Mo1366g != 0) {
                    Mo1366g.close();
                }
                th3 = th;
                c6289k = null;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) c13471.L$2;
            C0622p c0622p = (C0622p) c13471.L$1;
            r0 = (Closeable) c13471.L$0;
            try {
                AbstractC0243G.m377o(obj);
                r0 = r0;
                r1 = c0622p;
            } catch (Throwable th6) {
                th = th6;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th7) {
                        try {
                            AbstractC0878a.m1796b(th, th7);
                        } catch (Throwable th8) {
                            th = th8;
                            Mo1366g = r0;
                            if (Mo1366g != 0) {
                                try {
                                    Mo1366g.close();
                                } catch (Throwable th9) {
                                    AbstractC0878a.m1796b(th, th9);
                                }
                            }
                            th3 = th;
                            c6289k = null;
                        }
                    }
                }
                th2 = th;
                r10 = r0;
                c6289k2 = null;
            }
        }
        r1.flush();
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        r10 = r0;
        c6289k2 = c6289k3;
        if (th2 != null) {
            throw th2;
        }
        AbstractC6452k.m12178b(c6289k2);
        if (r10 != 0) {
            try {
                r10.close();
            } catch (Throwable th11) {
                th3 = th11;
            }
        }
        c6289k = c6289k3;
        if (th3 != null) {
            throw th3;
        }
        AbstractC6452k.m12178b(c6289k);
        return c6289k3;
    }
}
