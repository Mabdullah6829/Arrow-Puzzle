package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p033S0.AbstractC0608b;
import p033S0.AbstractC0620n;
import p033S0.C0627u;
import p033S0.C0629w;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final AbstractC0620n fileSystem;
    private final C0627u path;
    private final OkioSerializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioReadScope$readData$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.okio.OkioReadScope", m12159f = "OkioStorage.kt", m12160l = {180, 187}, m12161m = "readData$suspendImpl")
    public static final class C13421<T> extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13421(OkioReadScope<T> okioReadScope, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = okioReadScope;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public OkioReadScope(AbstractC0620n fileSystem, C0627u path, OkioSerializer<T> serializer) {
        AbstractC6452k.m12181e(fileSystem, "fileSystem");
        AbstractC6452k.m12181e(path, "path");
        AbstractC6452k.m12181e(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008e A[Catch: FileNotFoundException -> 0x0088, TryCatch #8 {FileNotFoundException -> 0x0088, blocks: (B:46:0x008e, B:47:0x0092, B:42:0x0084, B:39:0x007f), top: B:80:0x007f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0092 A[Catch: FileNotFoundException -> 0x0088, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x0088, blocks: (B:46:0x008e, B:47:0x0092, B:42:0x0084, B:39:0x007f), top: B:80:0x007f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static <T> Object readData$suspendImpl(OkioReadScope<T> okioReadScope, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13421 c13421;
        OkioReadScope<T> okioReadScope2;
        Closeable closeable;
        Throwable th;
        C0629w c0629wM1369b;
        Throwable th2;
        Closeable closeable2;
        Object from;
        Throwable th3;
        if (interfaceC6348c instanceof C13421) {
            c13421 = (C13421) interfaceC6348c;
            int i2 = c13421.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13421.label = i2 - Integer.MIN_VALUE;
            } else {
                c13421 = new C13421(okioReadScope, interfaceC6348c);
            }
        } else {
            c13421 = new C13421(okioReadScope, interfaceC6348c);
        }
        Object obj = c13421.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13421.label;
        Throwable th4 = null;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            okioReadScope.checkClose();
            try {
                C0629w c0629wM1369b2 = AbstractC0608b.m1369b(((OkioReadScope) okioReadScope).fileSystem.mo1367h(((OkioReadScope) okioReadScope).path));
                try {
                    OkioSerializer<T> okioSerializer = ((OkioReadScope) okioReadScope).serializer;
                    c13421.L$0 = okioReadScope;
                    c13421.L$1 = c0629wM1369b2;
                    c13421.label = 1;
                    Object from2 = okioSerializer.readFrom(c0629wM1369b2, c13421);
                    if (from2 != enumC6363a) {
                        closeable = c0629wM1369b2;
                        obj = from2;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th3 = null;
                        if (th3 == null) {
                            throw th3;
                        }
                        AbstractC6452k.m12178b(obj);
                        return obj;
                    }
                    return enumC6363a;
                } catch (Throwable th5) {
                    okioReadScope2 = okioReadScope;
                    closeable = c0629wM1369b2;
                    th = th5;
                    if (closeable != null) {
                        closeable.close();
                    }
                    th3 = th;
                    obj = null;
                }
            } catch (FileNotFoundException unused) {
                if (((OkioReadScope) okioReadScope).fileSystem.m1417d(((OkioReadScope) okioReadScope).path)) {
                    return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                }
                c0629wM1369b = AbstractC0608b.m1369b(((OkioReadScope) okioReadScope).fileSystem.mo1367h(((OkioReadScope) okioReadScope).path));
                OkioSerializer<T> okioSerializer2 = ((OkioReadScope) okioReadScope).serializer;
                c13421.L$0 = c0629wM1369b;
                c13421.L$1 = null;
                c13421.label = 2;
                from = okioSerializer2.readFrom(c0629wM1369b, c13421);
                if (from != enumC6363a) {
                    obj = from;
                    closeable2 = c0629wM1369b;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    if (th4 != null) {
                        throw th4;
                    }
                    AbstractC6452k.m12178b(obj);
                    return obj;
                }
            }
        } else {
            if (i3 == 1) {
                closeable = (Closeable) c13421.L$1;
                okioReadScope2 = (OkioReadScope) c13421.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th6) {
                            th3 = th6;
                        }
                    }
                    th3 = null;
                } catch (Throwable th7) {
                    th = th7;
                    if (closeable != null) {
                        try {
                            try {
                                closeable.close();
                            } catch (Throwable th8) {
                                AbstractC0878a.m1796b(th, th8);
                            }
                        } catch (FileNotFoundException unused2) {
                            okioReadScope = okioReadScope2;
                            if (((OkioReadScope) okioReadScope).fileSystem.m1417d(((OkioReadScope) okioReadScope).path)) {
                                return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                            }
                            c0629wM1369b = AbstractC0608b.m1369b(((OkioReadScope) okioReadScope).fileSystem.mo1367h(((OkioReadScope) okioReadScope).path));
                            try {
                                OkioSerializer<T> okioSerializer3 = ((OkioReadScope) okioReadScope).serializer;
                                c13421.L$0 = c0629wM1369b;
                                c13421.L$1 = null;
                                c13421.label = 2;
                                from = okioSerializer3.readFrom(c0629wM1369b, c13421);
                                if (from != enumC6363a) {
                                    obj = from;
                                    closeable2 = c0629wM1369b;
                                    if (closeable2 != null) {
                                        closeable2.close();
                                    }
                                    if (th4 != null) {
                                        throw th4;
                                    }
                                    AbstractC6452k.m12178b(obj);
                                    return obj;
                                }
                                return enumC6363a;
                            } catch (Throwable th9) {
                                th2 = th9;
                                closeable2 = c0629wM1369b;
                                if (closeable2 != null) {
                                    closeable2.close();
                                }
                                th4 = th2;
                                obj = null;
                            }
                        }
                    }
                    th3 = th;
                    obj = null;
                }
                if (th3 == null) {
                    throw th3;
                }
                AbstractC6452k.m12178b(obj);
                return obj;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (Closeable) c13421.L$0;
            try {
                AbstractC0243G.m377o(obj);
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th10) {
                        th4 = th10;
                    }
                }
            } catch (Throwable th11) {
                th2 = th11;
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th12) {
                        AbstractC0878a.m1796b(th2, th12);
                    }
                }
                th4 = th2;
                obj = null;
            }
        }
        if (th4 != null) {
            throw th4;
        }
        AbstractC6452k.m12178b(obj);
        return obj;
    }

    public final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final AbstractC0620n getFileSystem() {
        return this.fileSystem;
    }

    public final C0627u getPath() {
        return this.path;
    }

    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(InterfaceC6348c interfaceC6348c) {
        return readData$suspendImpl(this, interfaceC6348c);
    }
}
