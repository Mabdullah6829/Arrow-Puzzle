package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class zzae<T> implements zzab<T> {

    /* JADX INFO: renamed from: s */
    public final Object f23221s = new Object();

    /* JADX INFO: renamed from: t */
    public final int f23222t;

    /* JADX INFO: renamed from: u */
    public final zzw f23223u;

    /* JADX INFO: renamed from: v */
    public int f23224v;

    /* JADX INFO: renamed from: w */
    public int f23225w;

    /* JADX INFO: renamed from: x */
    public int f23226x;

    /* JADX INFO: renamed from: y */
    public Exception f23227y;

    /* JADX INFO: renamed from: z */
    public boolean f23228z;

    public zzae(int i2, zzw zzwVar) {
        this.f23222t = i2;
        this.f23223u = zzwVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10779a() {
        int i2 = this.f23224v + this.f23225w + this.f23226x;
        int i3 = this.f23222t;
        if (i2 == i3) {
            Exception exc = this.f23227y;
            zzw zzwVar = this.f23223u;
            if (exc == null) {
                if (this.f23228z) {
                    zzwVar.m10788d();
                    return;
                } else {
                    zzwVar.m10785a(null);
                    return;
                }
            }
            int i4 = this.f23225w;
            int length = String.valueOf(i4).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + length + 8 + 24);
            sb.append(i4);
            sb.append(" out of ");
            sb.append(i3);
            sb.append(" underlying tasks failed");
            zzwVar.m10787c(new ExecutionException(sb.toString(), this.f23227y));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* JADX INFO: renamed from: b */
    public final void mo10766b() {
        synchronized (this.f23221s) {
            this.f23226x++;
            this.f23228z = true;
            m10779a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.f23221s) {
            this.f23225w++;
            this.f23227y = exc;
            m10779a();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.f23221s) {
            this.f23224v++;
            m10779a();
        }
    }
}
