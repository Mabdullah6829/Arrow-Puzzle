package com.google.android.gms.tasks;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class zzr {

    /* JADX INFO: renamed from: a */
    public final Object f23264a = new Object();

    /* JADX INFO: renamed from: b */
    public ArrayDeque f23265b;

    /* JADX INFO: renamed from: c */
    public boolean f23266c;

    /* JADX INFO: renamed from: a */
    public final void m10781a(zzq zzqVar) {
        synchronized (this.f23264a) {
            try {
                if (this.f23265b == null) {
                    this.f23265b = new ArrayDeque();
                }
                this.f23265b.add(zzqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10782b(Task task) {
        zzq zzqVar;
        synchronized (this.f23264a) {
            if (this.f23265b != null && !this.f23266c) {
                this.f23266c = true;
                while (true) {
                    synchronized (this.f23264a) {
                        try {
                            zzqVar = (zzq) this.f23265b.poll();
                            if (zzqVar == null) {
                                this.f23266c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    zzqVar.mo10780a(task);
                }
            }
        }
    }
}
