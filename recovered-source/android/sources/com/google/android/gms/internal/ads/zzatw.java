package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzatw {

    /* JADX INFO: renamed from: c */
    public static final boolean f6917c = zzatx.f6920a;

    /* JADX INFO: renamed from: a */
    public final ArrayList f6918a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f6919b = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m4400a(String str, long j2) {
        if (this.f6919b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f6918a.add(new zzatv(str, j2, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4401b(String str) {
        long j2;
        this.f6919b = true;
        ArrayList arrayList = this.f6918a;
        int i2 = 0;
        if (arrayList.size() == 0) {
            j2 = 0;
        } else {
            j2 = ((zzatv) arrayList.get(arrayList.size() - 1)).f6916c - ((zzatv) arrayList.get(0)).f6916c;
        }
        if (j2 > 0) {
            long j3 = ((zzatv) arrayList.get(0)).f6916c;
            zzatx.m4403b("(%-4d ms) %s", Long.valueOf(j2), str);
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                zzatv zzatvVar = (zzatv) obj;
                long j4 = zzatvVar.f6916c;
                zzatx.m4403b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzatvVar.f6915b), zzatvVar.f6914a);
                j3 = j4;
            }
        }
    }

    public final void finalize() {
        if (this.f6919b) {
            return;
        }
        m4401b("Request on the loose");
        zzatx.m4404c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
