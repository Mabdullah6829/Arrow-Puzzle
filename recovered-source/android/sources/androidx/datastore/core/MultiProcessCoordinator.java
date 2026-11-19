package androidx.datastore.core;

import androidx.core.location.LocationRequestCompat;
import com.google.firebase.firestore.util.ExponentialBackoff;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0066v;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p057d0.InterfaceC6281c;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p091y0.AbstractC6582l;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final InterfaceC6353h context;
    private final File file;
    private final InterfaceC0312a inMemoryMutex;
    private final InterfaceC6281c lazySharedCounter;
    private final InterfaceC6281c lockFile$delegate;
    private final InterfaceC0170e updateNotifications;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:45|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            r2 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            if (r2 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        
            r14.L$0 = r13;
            r14.J$0 = r4;
            r14.label = 1;
            r2 = p057d0.C6289k.f24318a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            if (r4 > 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        
            r0 = new p000A0.C0039h(1, p043a.AbstractC0878a.m1802m(r14));
            r0.m86r();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (r4 < androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        
            r6 = r0.f52w.get(p062g0.C6349d.f24408s);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
        
            if ((r6 instanceof p000A0.InterfaceC0003D) != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
        
            r6 = (p000A0.InterfaceC0003D) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        
            if (r6 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
        
            r6 = p000A0.AbstractC0000A.f0a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
        
            r6.mo1i(r4, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
        
            r0 = r0.m85q();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        
            if (r0 == p064h0.EnumC6363a.f24419s) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
        
            r2 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
        
            if (r2 == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b2 -> B:41:0x00b5). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r13, p062g0.InterfaceC6348c r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, g0.c):java.lang.Object");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.MultiProcessCoordinator", m12159f = "MultiProcessCoordinator.android.kt", m12160l = {211, 47, 48}, m12161m = "lock")
    public static final class C13281<T> extends AbstractC6373c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C13281(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.MultiProcessCoordinator", m12159f = "MultiProcessCoordinator.android.kt", m12160l = {62, 87}, m12161m = "tryLock")
    public static final class C13291<T> extends AbstractC6373c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13291(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", m12159f = "MultiProcessCoordinator.android.kt", m12160l = {163}, m12161m = "invokeSuspend")
    public static final class C13302 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13302(InterfaceC6502p interfaceC6502p, MultiProcessCoordinator multiProcessCoordinator, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$block = interfaceC6502p;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C13302(this.$block, this.this$0, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C13302) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return obj;
            }
            AbstractC0243G.m377o(obj);
            InterfaceC6502p interfaceC6502p = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = interfaceC6502p.invoke(sharedCounter, this);
            return objInvoke == enumC6363a ? enumC6363a : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }
    }

    public MultiProcessCoordinator(InterfaceC6353h context, File file) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.Companion.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = new C0315d();
        this.lockFile$delegate = AbstractC0242F.m357n(new MultiProcessCoordinator$lockFile$2(this));
        this.lazySharedCounter = AbstractC0242F.m357n(new MultiProcessCoordinator$lazySharedCounter$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String str) {
        return new File(this.file.getAbsolutePath() + str);
    }

    private final File getLockFile() {
        return (File) this.lockFile$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return (SharedCounter) this.lazySharedCounter.getValue();
    }

    private final <T> Object withLazyCounter(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        if (this.lazySharedCounter.isInitialized()) {
            return interfaceC6502p.invoke(getSharedCounter(), interfaceC6348c);
        }
        return AbstractC0069y.m119r(new C13302(interfaceC6502p, this, null), this.context, interfaceC6348c);
    }

    public final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public InterfaceC0170e getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(InterfaceC6348c interfaceC6348c) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().getValue());
        }
        return AbstractC0069y.m119r(new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), this.context, interfaceC6348c);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(InterfaceC6348c interfaceC6348c) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().incrementAndGetValue());
        }
        return AbstractC0069y.m119r(new C1326xb55e9682(this, null), this.context, interfaceC6348c);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00db, B:57:0x00de), top: B:78:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00db A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00db, B:57:0x00de), top: B:78:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [h0.a, java.io.Closeable, java.lang.Object] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> Object lock(InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13281 c13281;
        MultiProcessCoordinator multiProcessCoordinator;
        FileOutputStream fileOutputStream;
        Throwable th;
        InterfaceC6498l interfaceC6498l2;
        java.io.Closeable closeable;
        Object obj;
        Object obj2;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        java.io.Closeable closeable2;
        Object obj3;
        Object obj4;
        if (interfaceC6348c instanceof C13281) {
            c13281 = (C13281) interfaceC6348c;
            int i2 = c13281.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13281.label = i2 - Integer.MIN_VALUE;
            } else {
                c13281 = new C13281(interfaceC6348c);
            }
        } else {
            c13281 = new C13281(interfaceC6348c);
        }
        Object obj5 = c13281.result;
        ?? r1 = EnumC6363a.f24419s;
        int i3 = c13281.label;
        try {
            try {
                try {
                    if (i3 == 0) {
                        AbstractC0243G.m377o(obj5);
                        InterfaceC0312a interfaceC0312a = this.inMemoryMutex;
                        c13281.L$0 = this;
                        c13281.L$1 = interfaceC6498l;
                        c13281.L$2 = interfaceC0312a;
                        c13281.label = 1;
                        C0315d c0315d = (C0315d) interfaceC0312a;
                        if (c0315d.m462d(c13281) != r1) {
                            multiProcessCoordinator = this;
                            obj5 = c0315d;
                        }
                        return r1;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) c13281.L$2;
                            closeable2 = (java.io.Closeable) c13281.L$1;
                            InterfaceC0312a interfaceC0312a2 = (InterfaceC0312a) c13281.L$0;
                            try {
                                AbstractC0243G.m377o(obj5);
                                obj4 = interfaceC0312a2;
                                obj3 = obj5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    AbstractC0878a.m1797f(closeable2, null);
                                    ((C0315d) obj4).m464f(null);
                                    return obj3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj5 = obj4;
                                    ((C0315d) obj5).m464f(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (java.io.Closeable) c13281.L$2;
                        obj = (InterfaceC0312a) c13281.L$1;
                        interfaceC6498l2 = (InterfaceC6498l) c13281.L$0;
                        try {
                            AbstractC0243G.m377o(obj5);
                            obj = obj;
                            obj2 = obj5;
                            fileLock2 = (FileLock) obj2;
                            try {
                                c13281.L$0 = obj;
                                c13281.L$1 = closeable;
                                c13281.L$2 = fileLock2;
                                c13281.label = 3;
                                objInvoke = interfaceC6498l2.invoke(c13281);
                                if (objInvoke != r1) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    obj3 = objInvoke;
                                    obj4 = obj;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC0878a.m1797f(closeable2, null);
                                    ((C0315d) obj4).m464f(null);
                                    return obj3;
                                }
                                return r1;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    InterfaceC0312a interfaceC0312a3 = (InterfaceC0312a) c13281.L$2;
                    InterfaceC6498l interfaceC6498l3 = (InterfaceC6498l) c13281.L$1;
                    multiProcessCoordinator = (MultiProcessCoordinator) c13281.L$0;
                    AbstractC0243G.m377o(obj5);
                    obj5 = interfaceC0312a3;
                    interfaceC6498l = interfaceC6498l3;
                    Companion companion = Companion;
                    c13281.L$0 = interfaceC6498l;
                    c13281.L$1 = obj5;
                    c13281.L$2 = fileOutputStream;
                    c13281.label = 2;
                    Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, c13281);
                    if (exclusiveFileLockWithRetryIfDeadlock != r1) {
                        interfaceC6498l2 = interfaceC6498l;
                        closeable = fileOutputStream;
                        obj = obj5;
                        obj2 = exclusiveFileLockWithRetryIfDeadlock;
                        fileLock2 = (FileLock) obj2;
                        c13281.L$0 = obj;
                        c13281.L$1 = closeable;
                        c13281.L$2 = fileLock2;
                        c13281.label = 3;
                        objInvoke = interfaceC6498l2.invoke(c13281);
                        if (objInvoke != r1) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            obj3 = objInvoke;
                            obj4 = obj;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            AbstractC0878a.m1797f(closeable2, null);
                            ((C0315d) obj4).m464f(null);
                            return obj3;
                        }
                    }
                    return r1;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream(multiProcessCoordinator.getLockFile());
            } catch (Throwable th7) {
                th = th7;
                ((C0315d) obj5).m464f(null);
                throw th;
            }
        } catch (Throwable th8) {
            obj5 = c13281;
            try {
                throw th8;
            } catch (Throwable th9) {
                AbstractC0878a.m1797f(r1, th8);
                throw th9;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0103, B:72:0x0106), top: B:89:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #7 {all -> 0x00ea, blocks: (B:59:0x00e6, B:71:0x0103, B:72:0x0106), top: B:89:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p0.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public <T> Object tryLock(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) throws Throwable {
        ?? c13291;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        InterfaceC0312a interfaceC0312a;
        boolean z;
        java.io.Closeable closeable;
        InterfaceC0312a interfaceC0312a2;
        boolean z2;
        ?? r2 = interfaceC6502p;
        if (interfaceC6348c instanceof C13291) {
            C13291 c13292 = (C13291) interfaceC6348c;
            int i2 = c13292.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13292.label = i2 - Integer.MIN_VALUE;
                c13291 = c13292;
            } else {
                c13291 = new C13291(interfaceC6348c);
            }
        } else {
            c13291 = new C13291(interfaceC6348c);
        }
        Object objInvoke = c13291.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        ?? r5 = c13291.label;
        try {
            try {
                if (r5 != 0) {
                    if (r5 == 1) {
                        z2 = c13291.Z$0;
                        interfaceC0312a2 = (InterfaceC0312a) c13291.L$0;
                        AbstractC0243G.m377o(objInvoke);
                        if (z2) {
                            ((C0315d) interfaceC0312a2).m464f(null);
                        }
                        return objInvoke;
                    }
                    if (r5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = c13291.Z$0;
                    fileLock = (FileLock) c13291.L$2;
                    closeable = (java.io.Closeable) c13291.L$1;
                    interfaceC0312a = (InterfaceC0312a) c13291.L$0;
                    try {
                        AbstractC0243G.m377o(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        AbstractC0878a.m1797f(closeable, null);
                        if (z) {
                            ((C0315d) interfaceC0312a).m464f(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                AbstractC0243G.m377o(objInvoke);
                C0315d c0315d = (C0315d) this.inMemoryMutex;
                boolean zM463e = c0315d.m463e(null);
                try {
                    if (zM463e) {
                        FileInputStream fileInputStream = new FileInputStream(getLockFile());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, LocationRequestCompat.PASSIVE_INTERVAL, true);
                            } catch (IOException e) {
                                String message2 = e.getMessage();
                                if ((message2 == null || !AbstractC6582l.m12236u(message2, this.LOCK_ERROR_MESSAGE)) && ((message = e.getMessage()) == null || !AbstractC6582l.m12236u(message, DEADLOCK_ERROR_MESSAGE))) {
                                    throw e;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                c13291.L$0 = c0315d;
                                c13291.L$1 = fileInputStream;
                                c13291.L$2 = fileLockTryLock;
                                c13291.Z$0 = zM463e;
                                c13291.label = 2;
                                objInvoke = r2.invoke(boolValueOf, c13291);
                                if (objInvoke != enumC6363a) {
                                    interfaceC0312a = c0315d;
                                    z = zM463e;
                                    closeable = fileInputStream;
                                    fileLock = fileLockTryLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC0878a.m1797f(closeable, null);
                                    if (z) {
                                        ((C0315d) interfaceC0312a).m464f(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        c13291.L$0 = c0315d;
                        c13291.Z$0 = zM463e;
                        c13291.label = 1;
                        objInvoke = r2.invoke(bool, c13291);
                        if (objInvoke != enumC6363a) {
                            interfaceC0312a2 = c0315d;
                            z2 = zM463e;
                            if (z2) {
                                ((C0315d) interfaceC0312a2).m464f(null);
                            }
                            return objInvoke;
                        }
                    }
                    return enumC6363a;
                } catch (Throwable th4) {
                    th = th4;
                    c13291 = c0315d;
                    r2 = zM463e;
                    if (r2 != 0) {
                        ((C0315d) c13291).m464f(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            ?? r4 = c13291;
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    AbstractC0878a.m1797f(r5, th6);
                    throw th7;
                } catch (Throwable th8) {
                    th = th8;
                    r2 = r2;
                    c13291 = r4;
                    if (r2 != 0) {
                        ((C0315d) c13291).m464f(null);
                    }
                    throw th;
                }
            }
        }
    }
}
