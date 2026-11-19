package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeg {

    /* JADX INFO: renamed from: a */
    public final Thread f13832a;

    /* JADX INFO: renamed from: b */
    public final zzea f13833b;

    /* JADX INFO: renamed from: c */
    public final zzec f13834c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f13835d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f13836e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f13837f;

    /* JADX INFO: renamed from: g */
    public final Object f13838g;

    /* JADX INFO: renamed from: h */
    public boolean f13839h;

    /* JADX INFO: renamed from: i */
    public final boolean f13840i;

    public zzeg(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m6195a(Object obj) {
        obj.getClass();
        synchronized (this.f13838g) {
            try {
                if (this.f13839h) {
                    return;
                }
                this.f13835d.add(new zzed(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6196b(Object obj) {
        if (this.f13840i) {
            zzgtr.m7133f(Thread.currentThread() == this.f13832a);
        }
        CopyOnWriteArraySet<zzed> copyOnWriteArraySet = this.f13835d;
        for (zzed zzedVar : copyOnWriteArraySet) {
            if (zzedVar.f13654a.equals(obj)) {
                zzedVar.f13657d = true;
                zzec zzecVar = this.f13834c;
                if (zzecVar != null && zzedVar.f13656c) {
                    zzedVar.f13656c = false;
                    zzecVar.mo6149a(zzedVar.f13654a, zzedVar.f13655b.m8846b());
                }
                copyOnWriteArraySet.remove(zzedVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6197c(final int i2, final zzeb zzebVar) {
        if (this.f13840i) {
            zzgtr.m7133f(Thread.currentThread() == this.f13832a);
        }
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f13835d);
        this.f13837f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzee
            @Override // java.lang.Runnable
            public final void run() {
                for (zzed zzedVar : copyOnWriteArraySet) {
                    if (!zzedVar.f13657d) {
                        int i3 = i2;
                        if (i3 != -1) {
                            zzedVar.f13655b.m8845a(i3);
                        }
                        zzedVar.f13656c = true;
                        zzebVar.mo6141b(zzedVar.f13654a);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m6198d() {
        if (this.f13840i) {
            zzgtr.m7133f(Thread.currentThread() == this.f13832a);
        }
        ArrayDeque arrayDeque = this.f13837f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f13834c != null) {
            zzea zzeaVar = this.f13833b;
            zzeaVar.getClass();
            if (!zzeaVar.mo6117b(1)) {
                zzeaVar.mo6119d(zzeaVar.mo6114A(1));
            }
        }
        ArrayDeque arrayDeque2 = this.f13836e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6199e() {
        if (this.f13840i) {
            zzgtr.m7133f(Thread.currentThread() == this.f13832a);
        }
        synchronized (this.f13838g) {
            this.f13839h = true;
        }
        CopyOnWriteArraySet<zzed> copyOnWriteArraySet = this.f13835d;
        for (zzed zzedVar : copyOnWriteArraySet) {
            zzec zzecVar = this.f13834c;
            zzedVar.f13657d = true;
            if (zzecVar != null && zzedVar.f13656c) {
                zzedVar.f13656c = false;
                zzecVar.mo6149a(zzedVar.f13654a, zzedVar.f13655b.m8846b());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public zzeg(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, zzdp zzdpVar, zzec zzecVar, boolean z) {
        this.f13832a = thread;
        this.f13835d = copyOnWriteArraySet;
        this.f13834c = zzecVar;
        this.f13838g = new Object();
        this.f13836e = new ArrayDeque();
        this.f13837f = new ArrayDeque();
        this.f13833b = (looper == null || zzdpVar == null || zzecVar == null) ? null : zzdpVar.mo5975a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzef
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzeg zzegVar = this.f13778s;
                zzec zzecVar2 = zzegVar.f13834c;
                zzecVar2.getClass();
                for (zzed zzedVar : zzegVar.f13835d) {
                    if (!zzedVar.f13657d && zzedVar.f13656c) {
                        zzs zzsVarM8846b = zzedVar.f13655b.m8846b();
                        zzedVar.f13655b = new zzr();
                        zzedVar.f13656c = false;
                        zzecVar2.mo6149a(zzedVar.f13654a, zzsVarM8846b);
                    }
                    zzea zzeaVar = zzegVar.f13833b;
                    zzeaVar.getClass();
                    if (zzeaVar.mo6117b(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f13840i = z;
    }
}
