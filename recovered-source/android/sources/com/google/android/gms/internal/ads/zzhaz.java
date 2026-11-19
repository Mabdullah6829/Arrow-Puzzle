package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhaz<V> extends zzhdh implements ListenableFuture {

    /* JADX INFO: renamed from: v */
    public static final Object f18453v = new Object();

    /* JADX INFO: renamed from: w */
    public static final zzhcn f18454w = new zzhcn(zzhay.class);

    /* JADX INFO: renamed from: x */
    public static final boolean f18455x;

    /* JADX INFO: renamed from: y */
    public static final zza f18456y;

    /* JADX INFO: renamed from: s */
    public volatile Object f18457s;

    /* JADX INFO: renamed from: t */
    public volatile zzhay.zzd f18458t;

    /* JADX INFO: renamed from: u */
    public volatile zze f18459u;

    abstract class zza {
        /* JADX INFO: renamed from: a */
        public abstract void mo7328a(zze zzeVar, Thread thread);

        /* JADX INFO: renamed from: b */
        public abstract void mo7329b(zze zzeVar, zze zzeVar2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo7330c(zzhaz zzhazVar, zze zzeVar, zze zzeVar2);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo7331d(zzhay zzhayVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2);

        /* JADX INFO: renamed from: e */
        public abstract zze mo7332e(zzhay zzhayVar);

        /* JADX INFO: renamed from: f */
        public abstract zzhay.zzd mo7333f(zzhay zzhayVar, zzhay.zzd zzdVar);

        /* JADX INFO: renamed from: g */
        public abstract boolean mo7334g(zzhaz zzhazVar, Object obj, Object obj2);
    }

    final class zzb extends zza {

        /* JADX INFO: renamed from: a */
        public static final AtomicReferenceFieldUpdater f18460a = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "a");

        /* JADX INFO: renamed from: b */
        public static final AtomicReferenceFieldUpdater f18461b = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "b");

        /* JADX INFO: renamed from: c */
        public static final AtomicReferenceFieldUpdater f18462c = AtomicReferenceFieldUpdater.newUpdater(zzhaz.class, zze.class, "u");

        /* JADX INFO: renamed from: d */
        public static final AtomicReferenceFieldUpdater f18463d = AtomicReferenceFieldUpdater.newUpdater(zzhaz.class, zzhay.zzd.class, "t");

        /* JADX INFO: renamed from: e */
        public static final AtomicReferenceFieldUpdater f18464e = AtomicReferenceFieldUpdater.newUpdater(zzhaz.class, Object.class, "s");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: a */
        public final void mo7328a(zze zzeVar, Thread thread) {
            f18460a.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: b */
        public final void mo7329b(zze zzeVar, zze zzeVar2) {
            f18461b.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: c */
        public final boolean mo7330c(zzhaz zzhazVar, zze zzeVar, zze zzeVar2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = f18462c;
                if (atomicReferenceFieldUpdater.compareAndSet(zzhazVar, zzeVar, zzeVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(zzhazVar) == zzeVar);
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: d */
        public final boolean mo7331d(zzhay zzhayVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = f18463d;
                if (atomicReferenceFieldUpdater.compareAndSet(zzhayVar, zzdVar, zzdVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(zzhayVar) == zzdVar);
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: e */
        public final zze mo7332e(zzhay zzhayVar) {
            return (zze) f18462c.getAndSet(zzhayVar, zze.f18471c);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: f */
        public final zzhay.zzd mo7333f(zzhay zzhayVar, zzhay.zzd zzdVar) {
            return (zzhay.zzd) f18463d.getAndSet(zzhayVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: g */
        public final boolean mo7334g(zzhaz zzhazVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = f18464e;
                if (atomicReferenceFieldUpdater.compareAndSet(zzhazVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(zzhazVar) == obj);
            return false;
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: a */
        public final void mo7328a(zze zzeVar, Thread thread) {
            zzeVar.f18472a = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: b */
        public final void mo7329b(zze zzeVar, zze zzeVar2) {
            zzeVar.f18473b = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: c */
        public final boolean mo7330c(zzhaz zzhazVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzhazVar) {
                try {
                    if (zzhazVar.f18459u != zzeVar) {
                        return false;
                    }
                    zzhazVar.f18459u = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: d */
        public final boolean mo7331d(zzhay zzhayVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2) {
            synchronized (zzhayVar) {
                try {
                    if (zzhayVar.f18458t != zzdVar) {
                        return false;
                    }
                    zzhayVar.f18458t = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: e */
        public final zze mo7332e(zzhay zzhayVar) {
            zze zzeVar;
            zze zzeVar2 = zze.f18471c;
            synchronized (zzhayVar) {
                try {
                    zzeVar = zzhayVar.f18459u;
                    if (zzeVar != zzeVar2) {
                        zzhayVar.f18459u = zzeVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: f */
        public final zzhay.zzd mo7333f(zzhay zzhayVar, zzhay.zzd zzdVar) {
            zzhay.zzd zzdVar2;
            synchronized (zzhayVar) {
                try {
                    zzdVar2 = zzhayVar.f18458t;
                    if (zzdVar2 != zzdVar) {
                        zzhayVar.f18458t = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: g */
        public final boolean mo7334g(zzhaz zzhazVar, Object obj, Object obj2) {
            synchronized (zzhazVar) {
                try {
                    if (zzhazVar.f18457s != obj) {
                        return false;
                    }
                    zzhazVar.f18457s = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    final class zzd extends zza {

        /* JADX INFO: renamed from: a */
        public static final Unsafe f18465a;

        /* JADX INFO: renamed from: b */
        public static final long f18466b;

        /* JADX INFO: renamed from: c */
        public static final long f18467c;

        /* JADX INFO: renamed from: d */
        public static final long f18468d;

        /* JADX INFO: renamed from: e */
        public static final long f18469e;

        /* JADX INFO: renamed from: f */
        public static final long f18470f;

        static {
            Unsafe unsafeM7335h;
            try {
                try {
                    unsafeM7335h = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    try {
                        unsafeM7335h = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.ads.zzhba
                            @Override // java.security.PrivilegedExceptionAction
                            public final /* synthetic */ Object run() {
                                return zzhaz.zzd.m7335h();
                            }
                        });
                    } catch (Exception unused2) {
                        unsafeM7335h = m7335h();
                        Unsafe unsafe = unsafeM7335h;
                    }
                }
                try {
                    f18467c = unsafeM7335h.objectFieldOffset(zzhaz.class.getDeclaredField("u"));
                    f18466b = unsafeM7335h.objectFieldOffset(zzhaz.class.getDeclaredField("t"));
                    f18468d = unsafeM7335h.objectFieldOffset(zzhaz.class.getDeclaredField("s"));
                    f18469e = unsafeM7335h.objectFieldOffset(zze.class.getDeclaredField("a"));
                    f18470f = unsafeM7335h.objectFieldOffset(zze.class.getDeclaredField("b"));
                    f18465a = unsafeM7335h;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2);
            }
        }

        private zzd() {
            throw null;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ Unsafe m7335h() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: a */
        public final void mo7328a(zze zzeVar, Thread thread) {
            f18465a.putObject(zzeVar, f18469e, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: b */
        public final void mo7329b(zze zzeVar, zze zzeVar2) {
            f18465a.putObject(zzeVar, f18470f, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: c */
        public final boolean mo7330c(zzhaz zzhazVar, zze zzeVar, zze zzeVar2) {
            return AbstractC5158l.m3838a(f18465a, zzhazVar, f18467c, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: d */
        public final boolean mo7331d(zzhay zzhayVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2) {
            return AbstractC5157k.m3837a(f18465a, zzhayVar, f18466b, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: e */
        public final zze mo7332e(zzhay zzhayVar) {
            zze zzeVar;
            zze zzeVar2 = zze.f18471c;
            do {
                zzeVar = zzhayVar.f18459u;
                if (zzeVar2 == zzeVar) {
                    break;
                }
            } while (!mo7330c(zzhayVar, zzeVar, zzeVar2));
            return zzeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: f */
        public final zzhay.zzd mo7333f(zzhay zzhayVar, zzhay.zzd zzdVar) {
            zzhay.zzd zzdVar2;
            do {
                zzdVar2 = zzhayVar.f18458t;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!mo7331d(zzhayVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        /* JADX INFO: renamed from: g */
        public final boolean mo7334g(zzhaz zzhazVar, Object obj, Object obj2) {
            return AbstractC5158l.m3838a(f18465a, zzhazVar, f18468d, obj, obj2);
        }
    }

    final class zze {

        /* JADX INFO: renamed from: c */
        public static final zze f18471c = new zze();

        /* JADX INFO: renamed from: a */
        public volatile Thread f18472a;

        /* JADX INFO: renamed from: b */
        public volatile zze f18473b;

        public zze() {
            zzhaz.f18456y.mo7328a(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        zza zzcVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f18455x = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd();
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    zzcVar = new zzc();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                zzcVar = new zzb();
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc();
            }
        }
        th = null;
        th2 = null;
        f18456y = zzcVar;
        if (th != null) {
            zzhcn zzhcnVar = f18454w;
            Logger loggerM7383a = zzhcnVar.m7383a();
            Level level = Level.SEVERE;
            loggerM7383a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzhcnVar.m7383a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7327b(zze zzeVar) {
        zzeVar.f18472a = null;
        while (true) {
            zze zzeVar2 = this.f18459u;
            if (zzeVar2 != zze.f18471c) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.f18473b;
                    if (zzeVar2.f18472a != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.f18473b = zzeVar4;
                        if (zzeVar3.f18472a == null) {
                        }
                    } else if (!f18456y.mo7330c(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }
}
