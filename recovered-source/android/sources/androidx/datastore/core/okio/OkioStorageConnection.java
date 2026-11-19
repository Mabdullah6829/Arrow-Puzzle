package androidx.datastore.core.okio;

import androidx.datastore.core.Closeable;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p033S0.AbstractC0620n;
import p033S0.C0627u;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p058e0.C6301i;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final AbstractC0620n fileSystem;
    private final InterfaceC6487a onClose;
    private final C0627u path;
    private final OkioSerializer<T> serializer;
    private final InterfaceC0312a transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$readScope$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.okio.OkioStorageConnection", m12159f = "OkioStorage.kt", m12160l = {113}, m12161m = "readScope")
    public static final class C13451<R> extends AbstractC6373c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13451(OkioStorageConnection<T> okioStorageConnection, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = okioStorageConnection;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.okio.OkioStorageConnection", m12159f = "OkioStorage.kt", m12160l = {236, 137}, m12161m = "writeScope")
    public static final class C13461 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13461(OkioStorageConnection<T> okioStorageConnection, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = okioStorageConnection;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(AbstractC0620n fileSystem, C0627u path, OkioSerializer<T> serializer, InterProcessCoordinator coordinator, InterfaceC6487a onClose) {
        AbstractC6452k.m12181e(fileSystem, "fileSystem");
        AbstractC6452k.m12181e(path, "path");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(coordinator, "coordinator");
        AbstractC6452k.m12181e(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = new C0315d();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:31:0x007c, B:40:0x008d, B:39:0x008a, B:36:0x0085), top: B:52:0x0020, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p0.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.datastore.core.StorageConnection
    public <R> Object readScope(InterfaceC6503q interfaceC6503q, InterfaceC6348c interfaceC6348c) throws Throwable {
        ?? c13451;
        Throwable th;
        Closeable closeable;
        ?? r9;
        ?? r0;
        if (interfaceC6348c instanceof C13451) {
            C13451 c13452 = (C13451) interfaceC6348c;
            int i2 = c13452.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13452.label = i2 - Integer.MIN_VALUE;
                c13451 = c13452;
            } else {
                c13451 = new C13451(this, interfaceC6348c);
            }
        } else {
            c13451 = new C13451(this, interfaceC6348c);
        }
        Object obj = c13451.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13451.label;
        Throwable th2 = null;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC6503q = c13451.Z$0;
                closeable = (Closeable) c13451.L$1;
                c13451 = (OkioStorageConnection) c13451.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                    r0 = c13451;
                    r9 = interfaceC6503q;
                    try {
                        closeable.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    if (th2 == null) {
                        throw th2;
                    }
                    if (r9 != 0) {
                        ((C0315d) r0.transactionMutex).m464f(null);
                    }
                    return obj;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        closeable.close();
                    } catch (Throwable th5) {
                        AbstractC0878a.m1796b(th, th5);
                    }
                    throw th;
                }
            }
            AbstractC0243G.m377o(obj);
            checkNotClosed();
            boolean zM463e = ((C0315d) this.transactionMutex).m463e(null);
            try {
                OkioReadScope okioReadScope = new OkioReadScope(this.fileSystem, this.path, this.serializer);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zM463e);
                    c13451.L$0 = this;
                    c13451.L$1 = okioReadScope;
                    c13451.Z$0 = zM463e;
                    c13451.label = 1;
                    Object objInvoke = interfaceC6503q.invoke(okioReadScope, boolValueOf, c13451);
                    if (objInvoke == enumC6363a) {
                        return enumC6363a;
                    }
                    obj = objInvoke;
                    r9 = zM463e;
                    r0 = this;
                    closeable = okioReadScope;
                    closeable.close();
                    if (th2 == null) {
                        throw th2;
                    }
                    if (r9 != 0) {
                        ((C0315d) r0.transactionMutex).m464f(null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th = th6;
                    interfaceC6503q = zM463e;
                    c13451 = this;
                    closeable = okioReadScope;
                    closeable.close();
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                interfaceC6503q = zM463e;
                c13451 = this;
                if (interfaceC6503q != 0) {
                    ((C0315d) c13451.transactionMutex).m464f(null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (interfaceC6503q != 0) {
                ((C0315d) c13451.transactionMutex).m464f(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fb A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TryCatch #9 {IOException -> 0x010e, all -> 0x010b, blocks: (B:45:0x00fb, B:47:0x0103, B:55:0x011b, B:62:0x012a, B:61:0x0127, B:58:0x0122), top: B:79:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0103 A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_LEAVE, TryCatch #9 {IOException -> 0x010e, all -> 0x010b, blocks: (B:45:0x00fb, B:47:0x0103, B:55:0x011b, B:62:0x012a, B:61:0x0127, B:58:0x0122), top: B:79:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x011b A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x010e, all -> 0x010b, blocks: (B:45:0x00fb, B:47:0x0103, B:55:0x011b, B:62:0x012a, B:61:0x0127, B:58:0x0122), top: B:79:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$writeScope$1, g0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [S0.n] */
    /* JADX WARN: Type inference failed for: r0v6, types: [S0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v18, types: [S0.n] */
    /* JADX WARN: Type inference failed for: r10v21, types: [S0.n] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v7, types: [p0.p] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [I0.d] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [h0.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [S0.u] */
    /* JADX WARN: Type inference failed for: r1v7, types: [S0.u] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16, types: [I0.a] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [S0.u] */
    /* JADX WARN: Type inference failed for: r2v7, types: [S0.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v4, types: [S0.n] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.datastore.core.okio.OkioStorageConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.core.StorageConnection
    public Object writeScope(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) throws Throwable {
        ?? c13461;
        ?? r6;
        ?? M1454f;
        C0627u c0627uM1453e;
        ?? r11;
        ?? r10;
        OkioWriteScope okioWriteScope;
        Throwable th;
        Closeable closeable;
        ?? r1;
        ?? r0;
        ?? r2;
        if (interfaceC6348c instanceof C13461) {
            C13461 c13462 = (C13461) interfaceC6348c;
            int i2 = c13462.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13462.label = i2 - Integer.MIN_VALUE;
                c13461 = c13462;
            } else {
                c13461 = new C13461(this, interfaceC6348c);
            }
        } else {
            c13461 = new C13461(this, interfaceC6348c);
        }
        ?? r12 = c13461.result;
        ?? r3 = EnumC6363a.f24419s;
        ?? r4 = c13461.label;
        try {
            try {
                try {
                    try {
                        if (r4 == 0) {
                            AbstractC0243G.m377o(r12);
                            checkNotClosed();
                            c0627uM1453e = this.path.m1453e();
                            if (c0627uM1453e == null) {
                                throw new IllegalStateException("must have a parent path");
                            }
                            AbstractC0620n abstractC0620n = this.fileSystem;
                            abstractC0620n.getClass();
                            C6301i<C0627u> c6301i = new C6301i();
                            for (C0627u c0627uM1453e2 = c0627uM1453e; c0627uM1453e2 != null && !abstractC0620n.m1417d(c0627uM1453e2); c0627uM1453e2 = c0627uM1453e2.m1453e()) {
                                c6301i.addFirst(c0627uM1453e2);
                            }
                            for (C0627u dir : c6301i) {
                                AbstractC6452k.m12181e(dir, "dir");
                                abstractC0620n.mo1362b(dir);
                            }
                            InterfaceC0312a interfaceC0312a = this.transactionMutex;
                            c13461.L$0 = this;
                            c13461.L$1 = interfaceC6502p;
                            c13461.L$2 = c0627uM1453e;
                            c13461.L$3 = interfaceC0312a;
                            c13461.label = 1;
                            ?? r13 = (C0315d) interfaceC0312a;
                            if (r13.m462d(c13461) != r3) {
                                r6 = this;
                                r10 = interfaceC6502p;
                                r11 = r13;
                            }
                            return r3;
                        }
                        if (r4 != 1) {
                            if (r4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            closeable = (Closeable) c13461.L$3;
                            r3 = (C0627u) c13461.L$2;
                            r4 = (InterfaceC0312a) c13461.L$1;
                            c13461 = (OkioStorageConnection) c13461.L$0;
                            try {
                                AbstractC0243G.m377o(r12);
                                r0 = c13461;
                                r1 = r3;
                                r2 = r4;
                                try {
                                    closeable.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r0.fileSystem.m1417d(r1)) {
                                    r0.fileSystem.mo1361a(r1, r0.path);
                                }
                                ((C0315d) r2).m464f(null);
                                return C6289k.f24318a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    closeable.close();
                                } catch (Throwable th4) {
                                    AbstractC0878a.m1796b(th, th4);
                                }
                                throw th;
                            }
                        }
                        InterfaceC0312a interfaceC0312a2 = (InterfaceC0312a) c13461.L$3;
                        c0627uM1453e = (C0627u) c13461.L$2;
                        InterfaceC6502p interfaceC6502p2 = (InterfaceC6502p) c13461.L$1;
                        OkioStorageConnection okioStorageConnection = (OkioStorageConnection) c13461.L$0;
                        AbstractC0243G.m377o(r12);
                        r11 = interfaceC0312a2;
                        r10 = interfaceC6502p2;
                        r6 = okioStorageConnection;
                        c13461.L$0 = r6;
                        c13461.L$1 = r11;
                        c13461.L$2 = M1454f;
                        c13461.L$3 = okioWriteScope;
                        c13461.label = 2;
                        if (r10.invoke(okioWriteScope, c13461) != r3) {
                            r1 = M1454f;
                            closeable = okioWriteScope;
                            r0 = r6;
                            r2 = r11;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r0.fileSystem.m1417d(r1)) {
                                r0.fileSystem.mo1361a(r1, r0.path);
                            }
                            ((C0315d) r2).m464f(null);
                            return C6289k.f24318a;
                        }
                        return r3;
                    } catch (Throwable th5) {
                        r3 = M1454f;
                        c13461 = r6;
                        r4 = r11;
                        th = th5;
                        closeable = okioWriteScope;
                        closeable.close();
                        throw th;
                    }
                    r6.fileSystem.mo1363c(M1454f);
                    okioWriteScope = new OkioWriteScope(r6.fileSystem, M1454f, r6.serializer);
                } catch (IOException e) {
                    e = e;
                    if (r6.fileSystem.m1417d(M1454f)) {
                        try {
                            ?? r5 = r6.fileSystem;
                            r5.getClass();
                            r5.mo1363c(M1454f);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                M1454f = c0627uM1453e.m1454f(r6.path.m1452c() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                ((C0315d) r12).m464f(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            r6 = c13461;
            M1454f = r3;
            if (r6.fileSystem.m1417d(M1454f)) {
                ?? r7 = r6.fileSystem;
                r7.getClass();
                r7.mo1363c(M1454f);
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            r12 = r4;
            ((C0315d) r12).m464f(null);
            throw th;
        }
    }
}
