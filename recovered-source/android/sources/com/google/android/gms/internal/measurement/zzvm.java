package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p011H.AbstractC0253Q;
import p011H.AbstractC0290s;
import p011H.C0254S;
import p011H.C0275g0;
import p011H.C0279i0;
import p011H.EnumC0244H;
import p011H.ExecutorC0273f0;
import p011H.InterfaceC0237A;
import p011H.InterfaceC0238B;
import p011H.RunnableFutureC0281j0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvm {

    /* JADX INFO: renamed from: a */
    public final zzvg f22985a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f22986b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f22987c = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final AtomicReference f22988d = new AtomicReference(null);

    /* JADX INFO: renamed from: e */
    public final ExecutorC0273f0 f22989e;

    /* JADX INFO: renamed from: f */
    public final C0275g0 f22990f;

    public zzvm(InterfaceC0237A interfaceC0237A) {
        long j2 = Integer.MIN_VALUE;
        this.f22986b = new AtomicLong((j2 & 4294967295L) | (j2 << 32));
        EnumC0244H enumC0244H = EnumC0244H.f483s;
        this.f22989e = new ExecutorC0273f0(enumC0244H);
        C0275g0 c0275g0 = new C0275g0();
        this.f22990f = c0275g0;
        zzvg zzvgVar = new zzvg();
        zzvgVar.f22973s = interfaceC0237A;
        zzvgVar.f22974t = enumC0244H;
        this.f22985a = zzvgVar;
        c0275g0.addListener(zzvgVar, enumC0244H);
    }

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
    /* JADX INFO: renamed from: a */
    public final AbstractC0290s m10671a() {
        AtomicLong atomicLong;
        long j2;
        final int i2;
        ListenableFuture listenableFutureM378a;
        EnumC0244H enumC0244H = EnumC0244H.f483s;
        C0275g0 c0275g0 = this.f22990f;
        if (c0275g0.isDone()) {
            return c0275g0;
        }
        do {
            atomicLong = this.f22986b;
            j2 = atomicLong.get();
            i2 = (int) (j2 >>> 32);
        } while (!atomicLong.compareAndSet(j2, (((long) (((int) j2) + 1)) & 4294967295L) | (((long) i2) << 32)));
        AtomicReference atomicReference = this.f22988d;
        final C0275g0 c0275g1 = new C0275g0();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(c0275g1);
        if (listenableFuture == null) {
            zzwx zzwxVarM10703a = zzxa.m10703a(new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zzvi
                @Override // p011H.InterfaceC0237A
                public final /* synthetic */ ListenableFuture call() {
                    return this.f22977s.m10672b(i2);
                }
            });
            RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0();
            runnableFutureC0281j0.f553A = new C0279i0(runnableFutureC0281j0, zzwxVarM10703a);
            enumC0244H.execute(runnableFutureC0281j0);
            listenableFutureM378a = runnableFutureC0281j0;
        } else {
            InterfaceC0238B interfaceC0238B = new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzvh
                @Override // p011H.InterfaceC0238B
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.f22975a.m10672b(i2);
                }
            };
            int i3 = zzxa.f23060a;
            listenableFutureM378a = AbstractC0253Q.m378a(listenableFuture, Throwable.class, new zzwy(zzvy.m10684a(), interfaceC0238B), this.f22989e);
        }
        c0275g1.m439n(listenableFutureM378a);
        final zzvk zzvkVar = new zzvk(this, i2);
        c0275g1.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzvj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C0275g0 c0275g2 = c0275g1;
                zzvk zzvkVar2 = zzvkVar;
                try {
                    Object objM379b = AbstractC0253Q.m379b(c0275g2);
                    C0275g0 c0275g3 = this.f22979s.f22990f;
                    c0275g3.m437l(objM379b);
                    zzvkVar2.m439n(c0275g3);
                } catch (Throwable unused) {
                    zzvkVar2.m439n(c0275g2);
                }
            }
        }, enumC0244H);
        return zzvkVar;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0290s m10672b(int i2) {
        EnumC0244H enumC0244H;
        AtomicLong atomicLong = this.f22986b;
        if (((int) (atomicLong.get() >>> 32)) > i2) {
            C0254S c0254s = C0254S.f503z;
            return c0254s != null ? c0254s : new C0254S();
        }
        zzvl zzvlVar = new zzvl(i2);
        while (true) {
            AtomicReference atomicReference = this.f22987c;
            zzvl zzvlVar2 = (zzvl) atomicReference.get();
            if (zzvlVar2 != null && zzvlVar2.f22984z > i2) {
                C0254S c0254s2 = C0254S.f503z;
                return c0254s2 != null ? c0254s2 : new C0254S();
            }
            do {
                if (atomicReference.compareAndSet(zzvlVar2, zzvlVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i2) {
                        zzvlVar.cancel(true);
                        while (!atomicReference.compareAndSet(zzvlVar, null) && atomicReference.get() == zzvlVar) {
                        }
                        return zzvlVar;
                    }
                    zzvg zzvgVar = this.f22985a;
                    InterfaceC0237A interfaceC0237A = zzvgVar.f22973s;
                    if (interfaceC0237A == null || (enumC0244H = zzvgVar.f22974t) == null) {
                        zzvlVar.m439n(this.f22990f);
                        return zzvlVar;
                    }
                    zzwx zzwxVarM10703a = zzxa.m10703a(interfaceC0237A);
                    RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0();
                    runnableFutureC0281j0.f553A = new C0279i0(runnableFutureC0281j0, zzwxVarM10703a);
                    enumC0244H.execute(runnableFutureC0281j0);
                    zzvlVar.m439n(runnableFutureC0281j0);
                    return zzvlVar;
                }
            } while (atomicReference.get() == zzvlVar2);
        }
    }
}
