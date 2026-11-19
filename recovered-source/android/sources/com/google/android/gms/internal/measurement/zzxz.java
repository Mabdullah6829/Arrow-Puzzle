package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzxz implements zzyi, zzzd {

    /* JADX INFO: renamed from: h */
    public static final String f23081h = new String();

    /* JADX INFO: renamed from: a */
    public final Level f23082a;

    /* JADX INFO: renamed from: b */
    public final long f23083b;

    /* JADX INFO: renamed from: c */
    public zzxy f23084c;

    /* JADX INFO: renamed from: d */
    public zzyc f23085d;

    /* JADX INFO: renamed from: e */
    public zzyq f23086e;

    /* JADX INFO: renamed from: f */
    public zzaaf f23087f;

    /* JADX INFO: renamed from: g */
    public Object[] f23088g;

    public zzxz(Level level) {
        zzaab.f21854a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f23084c = null;
        this.f23085d = null;
        this.f23086e = null;
        this.f23087f = null;
        this.f23088g = null;
        zzabr.m9334a(level, FirebaseAnalytics.Param.LEVEL);
        this.f23082a = level;
        this.f23083b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    /* JADX INFO: renamed from: a */
    public final void mo10719a(String str, Object[] objArr) {
        zzxy zzxyVar;
        if (this.f23085d == null) {
            ((zzaaj.C51761) zzaab.f21854a.mo9305a()).getClass();
            this.f23085d = zzyc.f23093a;
        }
        zzyd zzydVarM10734b = this.f23085d;
        if (zzydVarM10734b != zzyc.f23093a) {
            zzxy zzxyVar2 = this.f23084c;
            if (zzxyVar2 != null && zzxyVar2.f23080b > 0) {
                zzabr.m9334a(zzydVarM10734b, "logSiteKey");
                int i2 = zzxyVar2.f23080b;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (zzxx.f23075f.equals(zzxyVar2.mo10714b(i3))) {
                        Object objMo10715c = zzxyVar2.mo10715c(i3);
                        zzydVarM10734b = objMo10715c instanceof zzyj ? ((zzyj) objMo10715c).m10734b() : new zzyu(zzydVarM10734b, objMo10715c);
                    }
                }
            }
        } else {
            zzydVarM10734b = null;
        }
        boolean zMo10708d = mo10708d(zzydVarM10734b);
        zzyq zzyqVar = this.f23086e;
        if (zzyqVar != null) {
            zzyp zzypVar = (zzyp) zzyp.f23104c.m10732b(zzydVarM10734b, this.f23084c);
            AtomicInteger atomicInteger = zzypVar.f23106b;
            AtomicBoolean atomicBoolean = zzypVar.f23105a;
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            int i4 = -1;
            if (zzyqVar != zzyq.f23107a && atomicBoolean.compareAndSet(false, true)) {
                try {
                    zzyqVar.mo10706a();
                    atomicBoolean.set(false);
                    atomicInteger.addAndGet(-iIncrementAndGet);
                    i4 = (-1) + iIncrementAndGet;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            }
            if (zMo10708d && i4 > 0 && (zzxyVar = this.f23084c) != null) {
                zzxyVar.m10717e(zzxx.f23074e, Integer.valueOf(i4));
            }
            zMo10708d &= i4 >= 0;
        }
        if (zMo10708d) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.f23088g = objArrCopyOf;
            for (int i5 = 0; i5 < objArrCopyOf.length; i5++) {
                Object obj = objArrCopyOf[i5];
                if (obj instanceof zzxu) {
                    objArrCopyOf[i5] = ((zzxu) obj).zza();
                }
            }
            if (str != f23081h) {
                this.f23087f = new zzaaf(mo10707c(), str);
            }
            zzabe zzabeVarMo9317b = zzaab.f21854a.mo9307c().mo9317b();
            if (!zzabeVarMo9317b.f21908a.isEmpty()) {
                zzzj zzzjVarM10725k = m10725k();
                zzyl zzylVar = zzxx.f23077h;
                zzabe zzabeVar = (zzabe) zzzjVarM10725k.mo10716d(zzylVar);
                if (zzabeVar != null) {
                    zzabc zzabcVar = zzabeVar.f21908a;
                    if (!zzabcVar.isEmpty()) {
                        zzabc zzabcVar2 = zzabeVarMo9317b.f21908a;
                        if (!zzabcVar2.isEmpty()) {
                            zzabeVar = new zzabe(new zzabc(zzabcVar2, zzabcVar));
                        }
                        zzabeVarMo9317b = zzabeVar;
                    }
                }
                m10726l(zzylVar, zzabeVarMo9317b);
            }
            zzzf zzzfVar = mo10709e().f23063a;
            try {
                zzabt zzabtVar = (zzabt) zzabt.f21924t.get();
                int i6 = zzabtVar.f21925s + 1;
                zzabtVar.f21925s = i6;
                if (i6 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i6 <= 100) {
                        zzzfVar.mo9315c(this);
                    } else {
                        zzxi.m10704a("unbounded recursion in log statement", this);
                    }
                    zzabtVar.close();
                } catch (Throwable th2) {
                    try {
                        zzabtVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (RuntimeException e) {
                try {
                    zzzfVar.mo9309d(e, this);
                } catch (zzzg e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                    String name = e3.getClass().getName();
                    String message = e3.getMessage();
                    StringBuilder sb = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                    sb.append(name);
                    sb.append(": ");
                    sb.append(message);
                    zzxi.m10704a(sb.toString(), this);
                    try {
                        e3.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    /* JADX INFO: renamed from: b */
    public final zzyi mo10720b(Throwable th) {
        zzyl zzylVar = zzxx.f23070a;
        zzabr.m9334a(zzylVar, "metadata key");
        if (th != null) {
            m10726l(zzylVar, th);
        }
        return mo10710f();
    }

    /* JADX INFO: renamed from: c */
    public abstract zzabl mo10707c();

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.internal.measurement.zzxz] */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.google.android.gms.internal.measurement.zzyt] */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX INFO: renamed from: d */
    public boolean mo10708d(zzyd zzydVar) {
        int iM10718f;
        int i2;
        ?? zzynVar;
        zzxk zzxkVar;
        zzyq zzyqVar;
        zzyq zzyqVar2;
        zzyq zzyqVar3;
        ?? r12;
        zzyq zzyqVar4;
        zzyq zzyqVar5;
        zzxy zzxyVar = this.f23084c;
        if (zzxyVar != null) {
            if (zzydVar != null) {
                zzyf zzyfVar = zzxn.f23066d;
                if (((zzxm) zzxyVar.mo10716d(zzxx.f23073d)) == null) {
                    zzynVar = 0;
                } else {
                    zzxn zzxnVar = (zzxn) zzxn.f23066d.m10732b(zzydVar, zzxyVar);
                    long j2 = this.f23083b;
                    if (!(j2 >= 0)) {
                        throw new IllegalArgumentException("timestamp cannot be negative");
                    }
                    AtomicLong atomicLong = zzxnVar.f23067c;
                    long j3 = atomicLong.get();
                    if (j3 >= 0) {
                        throw null;
                    }
                    atomicLong.compareAndSet(j3, -j2);
                    zzynVar = zzxnVar;
                }
                zzxy zzxyVar2 = this.f23084c;
                zzyf zzyfVar2 = zzxk.f23064d;
                Integer num = (Integer) zzxyVar2.mo10716d(zzxx.f23071b);
                if (num == null) {
                    zzyqVar = null;
                } else {
                    zzxkVar = (zzxk) zzxk.f23064d.m10732b(zzydVar, zzxyVar2);
                    if (zzxkVar.f23065c.incrementAndGet() < num.intValue()) {
                        zzyqVar = zzxkVar;
                        zzyqVar = zzyq.f23107a;
                    }
                }
                if (zzynVar == 0) {
                    zzynVar = zzyqVar;
                } else if (zzyqVar != null && zzynVar != (zzyqVar2 = zzyq.f23107a) && zzyqVar != (zzyqVar3 = zzyq.f23108b)) {
                    if (zzyqVar == zzyqVar2 || zzynVar == zzyqVar3) {
                        zzynVar = zzyqVar;
                    } else {
                        zzynVar = new zzyn(zzynVar, zzyqVar);
                    }
                }
                zzxy zzxyVar3 = this.f23084c;
                zzyf zzyfVar3 = zzyt.f23109d;
                Integer num2 = (Integer) zzxyVar3.mo10716d(zzxx.f23072c);
                if (num2 == null || num2.intValue() <= 0) {
                    r12 = 0;
                } else {
                    r12 = (zzyt) zzyt.f23109d.m10732b(zzydVar, zzxyVar3);
                    AtomicInteger atomicInteger = r12.f23111c;
                    if ((((Random) zzyt.f23110e.get()).nextInt(num2.intValue()) == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r12 = zzyq.f23107a;
                    }
                }
                if (zzynVar == 0) {
                    zzynVar = r12;
                } else if (r12 != 0 && zzynVar != (zzyqVar4 = zzyq.f23107a) && r12 != (zzyqVar5 = zzyq.f23108b)) {
                    if (r12 == zzyqVar4 || zzynVar == zzyqVar5) {
                        zzynVar = r12;
                    } else {
                        zzynVar = new zzyn(zzynVar, r12);
                    }
                }
                this.f23086e = zzynVar;
                if (zzynVar == zzyq.f23107a) {
                    return false;
                }
            }
            zzxy zzxyVar4 = this.f23084c;
            zzyl zzylVar = zzxx.f23078i;
            zzyv zzyvVar = (zzyv) zzxyVar4.mo10716d(zzylVar);
            if (zzyvVar != null) {
                zzxy zzxyVar5 = this.f23084c;
                if (zzxyVar5 != null && (iM10718f = zzxyVar5.m10718f(zzylVar)) >= 0) {
                    int i3 = iM10718f + iM10718f;
                    int i4 = i3 + 2;
                    while (true) {
                        i2 = zzxyVar5.f23080b;
                        if (i4 >= i2 + i2) {
                            break;
                        }
                        Object obj = zzxyVar5.f23079a[i4];
                        if (!obj.equals(zzylVar)) {
                            Object[] objArr = zzxyVar5.f23079a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    zzxyVar5.f23080b = i2 - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        zzxyVar5.f23079a[i3] = null;
                        i3++;
                    }
                }
                zzzj zzzjVarM10725k = m10725k();
                zzyl zzylVar2 = zzxx.f23070a;
                Throwable th = (Throwable) zzzjVarM10725k.mo10716d(zzylVar2);
                int i5 = zzyvVar.f23116s;
                String[] strArr = zzabq.f21922a;
                if (i5 <= 0 && i5 != -1) {
                    throw new IllegalArgumentException("invalid maximum depth: 0");
                }
                StackTraceElement[] stackTraceElementArrMo9335b = zzabq.f21923b.mo9335b(i5);
                zzyg zzygVar = new zzyg(zzyvVar.toString(), th);
                zzygVar.setStackTrace(stackTraceElementArrMo9335b);
                m10726l(zzylVar2, zzygVar);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public abstract zzxs mo10709e();

    /* JADX INFO: renamed from: f */
    public abstract zzyi mo10710f();

    @Override // com.google.android.gms.internal.measurement.zzyi
    /* JADX INFO: renamed from: g */
    public final zzyi mo10721g() {
        zzyc zzycVar = zzyc.f23093a;
        zzyb zzybVar = new zzyb();
        if (this.f23085d == null) {
            this.f23085d = zzybVar;
        }
        return mo10710f();
    }

    /* JADX INFO: renamed from: h */
    public final zzyc m10722h() {
        zzyc zzycVar = this.f23085d;
        if (zzycVar != null) {
            return zzycVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    /* JADX INFO: renamed from: i */
    public final Object[] m10723i() {
        if (!(this.f23087f != null)) {
            throw new IllegalStateException("cannot get arguments unless a template context exists");
        }
        Object[] objArr = this.f23088g;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    /* JADX INFO: renamed from: j */
    public final Object m10724j() {
        if (!(this.f23087f == null)) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        Object[] objArr = this.f23088g;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    /* JADX INFO: renamed from: k */
    public final zzzj m10725k() {
        zzxy zzxyVar = this.f23084c;
        return zzxyVar != null ? zzxyVar : zzzi.f23147a;
    }

    /* JADX INFO: renamed from: l */
    public final void m10726l(zzyl zzylVar, Object obj) {
        if (this.f23084c == null) {
            this.f23084c = new zzxy();
        }
        this.f23084c.m10717e(zzylVar, obj);
    }
}
