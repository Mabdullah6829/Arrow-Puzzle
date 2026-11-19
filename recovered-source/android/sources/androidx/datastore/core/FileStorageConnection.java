package androidx.datastore.core;

import androidx.constraintlayout.widget.C1137R;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final InterfaceC6487a onClose;
    private final Serializer<T> serializer;
    private final InterfaceC0312a transactionMutex;

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$readScope$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.FileStorageConnection", m12159f = "FileStorage.kt", m12160l = {101}, m12161m = "readScope")
    public static final class C13221<R> extends AbstractC6373c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13221(FileStorageConnection<T> fileStorageConnection, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = fileStorageConnection;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorageConnection$writeScope$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.FileStorageConnection", m12159f = "FileStorage.kt", m12160l = {214, C1137R.styleable.ConstraintSet_polarRelativeTo}, m12161m = "writeScope")
    public static final class C13231 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13231(FileStorageConnection<T> fileStorageConnection, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = fileStorageConnection;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator coordinator, InterfaceC6487a onClose) {
        AbstractC6452k.m12181e(file, "file");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(coordinator, "coordinator");
        AbstractC6452k.m12181e(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = new C0315d();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
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

    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007b, blocks: (B:31:0x007a, B:40:0x008b, B:39:0x0088, B:36:0x0083), top: B:50:0x0020, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [p0.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.datastore.core.StorageConnection
    public <R> Object readScope(InterfaceC6503q interfaceC6503q, InterfaceC6348c interfaceC6348c) throws Throwable {
        ?? c13221;
        Throwable th;
        Closeable closeable;
        ?? r8;
        ?? r0;
        if (interfaceC6348c instanceof C13221) {
            C13221 c13222 = (C13221) interfaceC6348c;
            int i2 = c13222.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13222.label = i2 - Integer.MIN_VALUE;
                c13221 = c13222;
            } else {
                c13221 = new C13221(this, interfaceC6348c);
            }
        } else {
            c13221 = new C13221(this, interfaceC6348c);
        }
        Object obj = c13221.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13221.label;
        Throwable th2 = null;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC6503q = c13221.Z$0;
                closeable = (Closeable) c13221.L$1;
                c13221 = (FileStorageConnection) c13221.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                    r0 = c13221;
                    r8 = interfaceC6503q;
                    try {
                        closeable.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    if (th2 == null) {
                        throw th2;
                    }
                    if (r8 != 0) {
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
                FileReadScope fileReadScope = new FileReadScope(this.file, this.serializer);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zM463e);
                    c13221.L$0 = this;
                    c13221.L$1 = fileReadScope;
                    c13221.Z$0 = zM463e;
                    c13221.label = 1;
                    Object objInvoke = interfaceC6503q.invoke(fileReadScope, boolValueOf, c13221);
                    if (objInvoke == enumC6363a) {
                        return enumC6363a;
                    }
                    obj = objInvoke;
                    r8 = zM463e;
                    r0 = this;
                    closeable = fileReadScope;
                    closeable.close();
                    if (th2 == null) {
                        throw th2;
                    }
                    if (r8 != 0) {
                        ((C0315d) r0.transactionMutex).m464f(null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th = th6;
                    interfaceC6503q = zM463e;
                    c13221 = this;
                    closeable = fileReadScope;
                    closeable.close();
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                interfaceC6503q = zM463e;
                c13221 = this;
                if (interfaceC6503q != 0) {
                    ((C0315d) c13221.transactionMutex).m464f(null);
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (interfaceC6503q != 0) {
                ((C0315d) c13221.transactionMutex).m464f(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[Catch: all -> 0x00eb, IOException -> 0x00ed, TRY_ENTER, TryCatch #4 {all -> 0x00eb, blocks: (B:34:0x00bb, B:36:0x00c1, B:39:0x00ca, B:40:0x00ea, B:47:0x00f8, B:56:0x0107, B:58:0x010d, B:59:0x0110, B:54:0x0105, B:53:0x0102, B:24:0x007c, B:25:0x0098), top: B:70:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[Catch: all -> 0x00eb, IOException -> 0x00ed, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00eb, blocks: (B:34:0x00bb, B:36:0x00c1, B:39:0x00ca, B:40:0x00ea, B:47:0x00f8, B:56:0x0107, B:58:0x010d, B:59:0x0110, B:54:0x0105, B:53:0x0102, B:24:0x007c, B:25:0x0098), top: B:70:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.core.StorageConnection
    public Object writeScope(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13231 c13231;
        File file;
        FileStorageConnection<T> fileStorageConnection;
        InterfaceC0312a interfaceC0312a;
        FileWriteScope fileWriteScope;
        Throwable th;
        Closeable closeable;
        File file2;
        FileStorageConnection<T> fileStorageConnection2;
        if (interfaceC6348c instanceof C13231) {
            c13231 = (C13231) interfaceC6348c;
            int i2 = c13231.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13231.label = i2 - Integer.MIN_VALUE;
            } else {
                c13231 = new C13231(this, interfaceC6348c);
            }
        } else {
            c13231 = new C13231(this, interfaceC6348c);
        }
        Object obj = c13231.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13231.label;
        try {
            try {
                try {
                    try {
                        if (i3 == 0) {
                            AbstractC0243G.m377o(obj);
                            checkNotClosed();
                            createParentDirectories(this.file);
                            InterfaceC0312a interfaceC0312a2 = this.transactionMutex;
                            c13231.L$0 = this;
                            c13231.L$1 = interfaceC6502p;
                            c13231.L$2 = interfaceC0312a2;
                            c13231.label = 1;
                            C0315d c0315d = (C0315d) interfaceC0312a2;
                            if (c0315d.m462d(c13231) != enumC6363a) {
                                fileStorageConnection = this;
                                interfaceC0312a = c0315d;
                            }
                            return enumC6363a;
                        }
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            closeable = (Closeable) c13231.L$3;
                            File file3 = (File) c13231.L$2;
                            interfaceC0312a = (InterfaceC0312a) c13231.L$1;
                            fileStorageConnection2 = (FileStorageConnection) c13231.L$0;
                            try {
                                AbstractC0243G.m377o(obj);
                                file2 = file3;
                                try {
                                    closeable.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists() && !FileMoves_androidKt.atomicMoveTo(file2, fileStorageConnection2.file)) {
                                    throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                ((C0315d) interfaceC0312a).m464f(null);
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
                        InterfaceC0312a interfaceC0312a3 = (InterfaceC0312a) c13231.L$2;
                        InterfaceC6502p interfaceC6502p2 = (InterfaceC6502p) c13231.L$1;
                        fileStorageConnection = (FileStorageConnection) c13231.L$0;
                        AbstractC0243G.m377o(obj);
                        interfaceC0312a = interfaceC0312a3;
                        interfaceC6502p = interfaceC6502p2;
                        c13231.L$0 = fileStorageConnection;
                        c13231.L$1 = interfaceC0312a;
                        c13231.L$2 = file;
                        c13231.L$3 = fileWriteScope;
                        c13231.label = 2;
                        if (interfaceC6502p.invoke(fileWriteScope, c13231) != enumC6363a) {
                            file2 = file;
                            fileStorageConnection2 = fileStorageConnection;
                            closeable = fileWriteScope;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                throw new IOException("Unable to rename " + file2 + " to " + fileStorageConnection2.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            ((C0315d) interfaceC0312a).m464f(null);
                            return C6289k.f24318a;
                        }
                        return enumC6363a;
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = fileWriteScope;
                        closeable.close();
                        throw th;
                    }
                    fileWriteScope = new FileWriteScope(file, fileStorageConnection.serializer);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(fileStorageConnection.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                ((C0315d) interfaceC0312a).m464f(null);
                throw th6;
            }
        } catch (IOException e2) {
            e = e2;
            file = enumC6363a;
        }
    }
}
