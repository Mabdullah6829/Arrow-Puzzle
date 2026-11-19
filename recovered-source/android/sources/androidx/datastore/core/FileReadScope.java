package androidx.datastore.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public class FileReadScope<T> implements ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final File file;
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.FileReadScope$readData$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.FileReadScope", m12159f = "FileStorage.kt", m12160l = {169, 178}, m12161m = "readData$suspendImpl")
    public static final class C13191<T> extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13191(FileReadScope<T> fileReadScope, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = fileReadScope;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public FileReadScope(File file, Serializer<T> serializer) {
        AbstractC6452k.m12181e(file, "file");
        AbstractC6452k.m12181e(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v21 */
    public static <T> Object readData$suspendImpl(FileReadScope<T> fileReadScope, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13191 c13191;
        FileInputStream fileInputStream;
        Throwable th;
        java.io.Closeable closeable;
        Object from;
        java.io.Closeable closeable2;
        Throwable th2;
        if (interfaceC6348c instanceof C13191) {
            c13191 = (C13191) interfaceC6348c;
            int i2 = c13191.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13191.label = i2 - Integer.MIN_VALUE;
            } else {
                c13191 = new C13191(fileReadScope, interfaceC6348c);
            }
        } else {
            c13191 = new C13191(fileReadScope, interfaceC6348c);
        }
        Object obj = c13191.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        ?? r2 = c13191.label;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    closeable2 = (java.io.Closeable) c13191.L$1;
                    r2 = (FileReadScope) c13191.L$0;
                    try {
                        AbstractC0243G.m377o(obj);
                        AbstractC0878a.m1797f(closeable2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            AbstractC0878a.m1797f(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) c13191.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                    AbstractC0878a.m1797f(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        AbstractC0878a.m1797f(closeable, th);
                        throw th6;
                    }
                }
            }
            AbstractC0243G.m377o(obj);
            fileReadScope.checkNotClosed();
            try {
                FileInputStream fileInputStream2 = new FileInputStream(((FileReadScope) fileReadScope).file);
                try {
                    Serializer<T> serializer = ((FileReadScope) fileReadScope).serializer;
                    c13191.L$0 = fileReadScope;
                    c13191.L$1 = fileInputStream2;
                    c13191.label = 1;
                    Object from2 = serializer.readFrom(fileInputStream2, c13191);
                    if (from2 != enumC6363a) {
                        closeable2 = fileInputStream2;
                        obj = from2;
                        AbstractC0878a.m1797f(closeable2, null);
                        return obj;
                    }
                    return enumC6363a;
                } catch (Throwable th7) {
                    r2 = fileReadScope;
                    closeable2 = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (((FileReadScope) fileReadScope).file.exists()) {
                    return ((FileReadScope) fileReadScope).serializer.getDefaultValue();
                }
                fileInputStream = new FileInputStream(((FileReadScope) fileReadScope).file);
                try {
                    Serializer<T> serializer2 = ((FileReadScope) fileReadScope).serializer;
                    c13191.L$0 = fileInputStream;
                    c13191.L$1 = null;
                    c13191.label = 2;
                    from = serializer2.readFrom(fileInputStream, c13191);
                    if (from != enumC6363a) {
                        obj = from;
                        closeable = fileInputStream;
                        AbstractC0878a.m1797f(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            fileReadScope = (FileReadScope<T>) r2;
            if (((FileReadScope) fileReadScope).file.exists()) {
                return ((FileReadScope) fileReadScope).serializer.getDefaultValue();
            }
            fileInputStream = new FileInputStream(((FileReadScope) fileReadScope).file);
            Serializer<T> serializer3 = ((FileReadScope) fileReadScope).serializer;
            c13191.L$0 = fileInputStream;
            c13191.L$1 = null;
            c13191.label = 2;
            from = serializer3.readFrom(fileInputStream, c13191);
            if (from != enumC6363a) {
                obj = from;
                closeable = fileInputStream;
                AbstractC0878a.m1797f(closeable, null);
                return obj;
            }
            return enumC6363a;
        }
    }

    public final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final File getFile() {
        return this.file;
    }

    public final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(InterfaceC6348c interfaceC6348c) {
        return readData$suspendImpl(this, interfaceC6348c);
    }
}
