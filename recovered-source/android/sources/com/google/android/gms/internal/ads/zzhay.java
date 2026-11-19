package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhay<V> extends zzhaz<V> {

    final class zza {

        /* JADX INFO: renamed from: c */
        public static final zza f18441c;

        /* JADX INFO: renamed from: d */
        public static final zza f18442d;

        /* JADX INFO: renamed from: a */
        public final boolean f18443a;

        /* JADX INFO: renamed from: b */
        public final Throwable f18444b;

        static {
            if (zzhaz.f18455x) {
                f18442d = null;
                f18441c = null;
            } else {
                f18442d = new zza(false, null);
                f18441c = new zza(true, null);
            }
        }

        public zza(boolean z, Throwable th) {
            this.f18443a = z;
            this.f18444b = th;
        }
    }

    final class zzb<V> implements Runnable {

        /* JADX INFO: renamed from: s */
        public final zzhay f18445s;

        /* JADX INFO: renamed from: t */
        public final ListenableFuture f18446t;

        public zzb(zzhay zzhayVar, ListenableFuture listenableFuture) {
            this.f18445s = zzhayVar;
            this.f18446t = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f18445s.f18457s != this) {
                return;
            }
            ListenableFuture listenableFuture = this.f18446t;
            if (zzhaz.f18456y.mo7334g(this.f18445s, this, zzhay.m7314g(listenableFuture))) {
                zzhay.m7317n(this.f18445s, false);
            }
        }
    }

    final class zzc {

        /* JADX INFO: renamed from: b */
        public static final zzc f18447b = new zzc(new C51751("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        public final Throwable f18448a;

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzhay$zzc$1 */
        public class C51751 extends Throwable {
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        }

        public zzc(Throwable th) {
            th.getClass();
            this.f18448a = th;
        }
    }

    final class zzd {

        /* JADX INFO: renamed from: d */
        public static final zzd f18449d = new zzd();

        /* JADX INFO: renamed from: a */
        public final Runnable f18450a;

        /* JADX INFO: renamed from: b */
        public final Executor f18451b;

        /* JADX INFO: renamed from: c */
        public zzd f18452c;

        public zzd() {
            this.f18450a = null;
            this.f18451b = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.f18450a = runnable;
            this.f18451b = executor;
        }
    }

    interface zze<V> extends ListenableFuture {
    }

    abstract class zzf<V> extends zzhay<V> implements zze<V> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Object m7314g(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thMo7319a;
        if (listenableFuture instanceof zze) {
            Object zzaVar = ((zzhay) listenableFuture).f18457s;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.f18443a) {
                    Throwable th = zzaVar2.f18444b;
                    zzaVar = th != null ? new zza(false, th) : zza.f18442d;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((listenableFuture instanceof zzhdh) && (thMo7319a = ((zzhdh) listenableFuture).mo7319a()) != null) {
            return new zzc(thMo7319a);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!zzhaz.f18455x) && zIsCancelled) {
            zza zzaVar3 = zza.f18442d;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new zzc(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new zzc(e);
            } catch (CancellationException e3) {
                return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e3)) : new zza(false, e3);
            } catch (ExecutionException e4) {
                return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e4)) : new zzc(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? zzhaz.f18453v : obj;
        }
        String strValueOf = String.valueOf(listenableFuture);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb.append(strValueOf);
        return new zza(false, new IllegalArgumentException(sb.toString()));
    }

    /* JADX INFO: renamed from: h */
    public static Object m7315h(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((zza) obj).f18444b);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).f18448a);
        }
        if (obj == zzhaz.f18453v) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7316i(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: renamed from: n */
    public static void m7317n(zzhay zzhayVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzhaz.zze zzeVarMo7332e = zzhaz.f18456y.mo7332e(zzhayVar); zzeVarMo7332e != null; zzeVarMo7332e = zzeVarMo7332e.f18473b) {
                Thread thread = zzeVarMo7332e.f18472a;
                if (thread != null) {
                    zzeVarMo7332e.f18472a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzhayVar.mo7322j();
            }
            zzhayVar.mo6897e();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarMo7333f = zzhaz.f18456y.mo7333f(zzhayVar, zzd.f18449d);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarMo7333f != null) {
                zzd zzdVar4 = zzdVarMo7333f.f18452c;
                zzdVarMo7333f.f18452c = zzdVar3;
                zzdVar3 = zzdVarMo7333f;
                zzdVarMo7333f = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.f18450a;
                zzdVar = zzdVar3.f18452c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof zzb) {
                    zzb zzbVar = (zzb) runnable;
                    zzhayVar = zzbVar.f18445s;
                    if (zzhayVar.f18457s == zzbVar) {
                        if (zzhaz.f18456y.mo7334g(zzhayVar, zzbVar, m7314g(zzbVar.f18446t))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.f18451b;
                    Objects.requireNonNull(executor);
                    m7318p(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m7318p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerM7383a = zzhaz.f18454w.m7383a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerM7383a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC1456a.m2451r(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdh
    /* JADX INFO: renamed from: a */
    public final Throwable mo7319a() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.f18457s;
        if (obj instanceof zzc) {
            return ((zzc) obj).f18448a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzgtr.m7135h(runnable, "Runnable was null.");
        zzgtr.m7135h(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.f18458t) != zzd.f18449d) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.f18452c = zzdVar;
                if (zzhaz.f18456y.mo7331d(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.f18458t;
                }
            } while (zzdVar != zzd.f18449d);
        }
        m7318p(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public boolean m7320c(Object obj) {
        if (obj == null) {
            obj = zzhaz.f18453v;
        }
        if (!zzhaz.f18456y.mo7334g(this, null, obj)) {
            return false;
        }
        m7317n(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zza zzaVar;
        Object obj = this.f18457s;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzhaz.f18455x) {
            zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z ? zza.f18441c : zza.f18442d;
            Objects.requireNonNull(zzaVar);
        }
        zzhay<V> zzhayVar = this;
        boolean z2 = false;
        while (true) {
            if (zzhaz.f18456y.mo7334g(zzhayVar, obj, zzaVar)) {
                m7317n(zzhayVar, z);
                if (obj instanceof zzb) {
                    ListenableFuture listenableFuture = ((zzb) obj).f18446t;
                    if (listenableFuture instanceof zze) {
                        zzhayVar = (zzhay) listenableFuture;
                        obj = zzhayVar.f18457s;
                        if (!(obj == null) && !(obj instanceof zzb)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = zzhayVar.f18457s;
            if (m7316i(obj)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m7321d(Throwable th) {
        if (!zzhaz.f18456y.mo7334g(this, null, new zzc(th))) {
            return false;
        }
        m7317n(this, false);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void mo6897e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public String mo6898f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        zzhaz.zze zzeVar = zzhaz.zze.f18471c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f18457s;
        if ((obj2 != null) && m7316i(obj2)) {
            return m7315h(obj2);
        }
        zzhaz.zze zzeVar2 = this.f18459u;
        if (zzeVar2 != zzeVar) {
            zzhaz.zze zzeVar3 = new zzhaz.zze();
            do {
                zzhaz.zza zzaVar = zzhaz.f18456y;
                zzaVar.mo7329b(zzeVar3, zzeVar2);
                if (zzaVar.mo7330c(this, zzeVar2, zzeVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m7327b(zzeVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f18457s;
                    } while (!((obj != null) & m7316i(obj)));
                    return m7315h(obj);
                }
                zzeVar2 = this.f18459u;
            } while (zzeVar2 != zzeVar);
        }
        Object obj3 = this.f18457s;
        Objects.requireNonNull(obj3);
        return m7315h(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f18457s instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f18457s;
        return (obj != null) & m7316i(obj);
    }

    /* JADX INFO: renamed from: j */
    public void mo7322j() {
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7323k() {
        Object obj = this.f18457s;
        return (obj instanceof zza) && ((zza) obj).f18443a;
    }

    /* JADX INFO: renamed from: l */
    public final void m7324l(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.f18457s;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (zzhaz.f18456y.mo7334g(this, null, m7314g(listenableFuture))) {
                    m7317n(this, false);
                    return;
                }
                return;
            }
            zzb zzbVar = new zzb(this, listenableFuture);
            if (zzhaz.f18456y.mo7334g(this, null, zzbVar)) {
                try {
                    listenableFuture.addListener(zzbVar, zzhbu.f18506s);
                    return;
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.f18447b;
                    }
                    zzhaz.f18456y.mo7334g(this, zzbVar, zzcVar);
                    return;
                }
            }
            obj = this.f18457s;
        }
        if (obj instanceof zza) {
            listenableFuture.cancel(((zza) obj).f18443a);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7325m(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m7323k());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7326o(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (v == null) {
            sb.append("null");
        } else if (v == this) {
            sb.append("this future");
        } else {
            sb.append(v.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(v)));
        }
        sb.append("]");
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7326o(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f18457s;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((zzb) obj).f18446t;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = mo6898f();
                    if (zzgtq.m7127a(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m7326o(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j3;
        boolean z;
        zzhaz.zze zzeVar = zzhaz.zze.f18471c;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f18457s;
            if ((obj != null) & m7316i(obj)) {
                return m7315h(obj);
            }
            long j4 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzhaz.zze zzeVar2 = this.f18459u;
                if (zzeVar2 != zzeVar) {
                    zzhaz.zze zzeVar3 = new zzhaz.zze();
                    z = true;
                    while (true) {
                        zzhaz.zza zzaVar = zzhaz.f18456y;
                        zzaVar.mo7329b(zzeVar3, zzeVar2);
                        if (zzaVar.mo7330c(this, zzeVar2, zzeVar3)) {
                            j3 = j4;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f18457s;
                                    if ((obj2 != null) & m7316i(obj2)) {
                                        return m7315h(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m7327b(zzeVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m7327b(zzeVar3);
                            break;
                        }
                        long j5 = j4;
                        zzeVar2 = this.f18459u;
                        if (zzeVar2 != zzeVar) {
                            j4 = j5;
                        }
                    }
                }
                Object obj3 = this.f18457s;
                Objects.requireNonNull(obj3);
                return m7315h(obj3);
            }
            j3 = 0;
            z = true;
            while (nanos > j3) {
                Object obj4 = this.f18457s;
                if ((obj4 != null ? z : false) & m7316i(obj4)) {
                    return m7315h(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 8 + String.valueOf(lowerCase2).length());
            AbstractC1456a.m2456w(sb, "Waited ", j2, " ");
            sb.append(lowerCase2);
            String string3 = sb.toString();
            if (nanos + 1000 < j3) {
                String strConcat = string3.concat(" (plus ");
                long j6 = -nanos;
                long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(jConvert);
                boolean z2 = (jConvert == j3 || nanos2 > 1000) ? z : false;
                if (jConvert > j3) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                    AbstractC1456a.m2456w(sb2, strConcat, jConvert, " ");
                    sb2.append(lowerCase);
                    String string4 = sb2.toString();
                    if (z2) {
                        string4 = string4.concat(",");
                    }
                    strConcat = string4.concat(" ");
                }
                if (z2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                    sb3.append(strConcat);
                    sb3.append(nanos2);
                    sb3.append(" nanoseconds ");
                    strConcat = sb3.toString();
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC1456a.m2450q(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }
}
