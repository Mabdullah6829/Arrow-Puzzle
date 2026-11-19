package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaca extends Handler implements Runnable {

    /* JADX INFO: renamed from: s */
    public final zzacb f4886s;

    /* JADX INFO: renamed from: t */
    public zzabx f4887t;

    /* JADX INFO: renamed from: u */
    public IOException f4888u;

    /* JADX INFO: renamed from: v */
    public int f4889v;

    /* JADX INFO: renamed from: w */
    public Thread f4890w;

    /* JADX INFO: renamed from: x */
    public boolean f4891x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f4892y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzacf f4893z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaca(zzacf zzacfVar, Looper looper, zzacb zzacbVar, zzabx zzabxVar, long j2) {
        super(looper);
        Objects.requireNonNull(zzacfVar);
        this.f4893z = zzacfVar;
        this.f4886s = zzacbVar;
        this.f4887t = zzabxVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m3943a(boolean z) {
        this.f4892y = z;
        this.f4888u = null;
        if (hasMessages(1)) {
            this.f4891x = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f4891x = true;
                    ((zzyi) this.f4886s).f21341g = true;
                    Thread thread = this.f4890w;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f4893z.f4898b = null;
            SystemClock.elapsedRealtime();
            zzabx zzabxVar = this.f4887t;
            zzabxVar.getClass();
            ((zzyr) zzabxVar).m9036o(this.f4886s, true);
            this.f4887t = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3944b() {
        zzxc zzxcVar;
        SystemClock.elapsedRealtime();
        zzabx zzabxVar = this.f4887t;
        zzabxVar.getClass();
        int i2 = this.f4889v;
        zzyr zzyrVar = (zzyr) zzabxVar;
        zzyi zzyiVar = (zzyi) this.f4886s;
        zzio zzioVar = zzyiVar.f21336b;
        if (i2 == 0) {
            Uri uri = zzyiVar.f21344j.f19195a;
            Map map = Collections.EMPTY_MAP;
            zzxcVar = new zzxc();
        } else {
            Uri uri2 = zzioVar.f20024b;
            zzxcVar = new zzxc();
        }
        zzxv zzxvVar = zzyrVar.f21398v;
        zzxvVar.m9029a(new zzxu(zzxvVar, zzxcVar, new zzxh(-1, null, zzfm.m6518t(zzyiVar.f21343i), zzfm.m6518t(zzyrVar.f21381S)), i2));
        this.f4888u = null;
        zzacf zzacfVar = this.f4893z;
        zzaca zzacaVar = zzacfVar.f4898b;
        zzacaVar.getClass();
        ((zzack) zzacfVar.f4897a).execute(zzacaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        zzabz zzabzVar;
        zzahd zzahdVar;
        if (this.f4892y) {
            return;
        }
        int i2 = message.what;
        int i3 = 1;
        if (i2 == 1) {
            m3944b();
            return;
        }
        if (i2 == 4) {
            throw ((Error) message.obj);
        }
        zzacf zzacfVar = this.f4893z;
        zzacfVar.f4898b = null;
        SystemClock.elapsedRealtime();
        zzabx zzabxVar = this.f4887t;
        zzabxVar.getClass();
        if (this.f4891x) {
            ((zzyr) zzabxVar).m9036o(this.f4886s, false);
            return;
        }
        int i4 = message.what;
        if (i4 == 2) {
            try {
                ((zzyr) zzabxVar).m9037p(this.f4886s);
                return;
            } catch (RuntimeException e) {
                zzeh.m6214f("LoadTask", "Unexpected exception handling load completed", e);
                this.f4893z.f4899c = new zzace(e);
                return;
            }
        }
        if (i4 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f4888u = iOException;
        int i5 = this.f4889v;
        this.f4889v = i5 + 1;
        zzyr zzyrVar = (zzyr) zzabxVar;
        zzyi zzyiVar = (zzyi) this.f4886s;
        Uri uri = zzyiVar.f21336b.f20024b;
        zzxc zzxcVar = new zzxc();
        String str = zzfm.f16091a;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min(i5 * 1000, 5000);
                break;
            }
            if ((cause instanceof zzat) || (cause instanceof FileNotFoundException) || (cause instanceof zzif) || (cause instanceof zzace) || ((cause instanceof zzhs) && ((zzhs) cause).f19162s == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzabzVar = zzacf.f4896e;
        } else {
            int iM9044x = zzyrVar.m9044x();
            int i6 = iM9044x > zzyrVar.f21392d0 ? 1 : 0;
            if (zzyrVar.f21388Z || !((zzahdVar = zzyrVar.f21380R) == null || zzahdVar.zza() == -9223372036854775807L)) {
                zzyrVar.f21392d0 = iM9044x;
            } else {
                boolean z = zzyrVar.f21376N;
                if (!z || zzyrVar.m9040s()) {
                    zzyrVar.f21385W = z;
                    zzyrVar.f21389a0 = 0L;
                    zzyrVar.f21392d0 = 0;
                    for (zzzc zzzcVar : zzyrVar.f21373K) {
                        zzzcVar.m9059k(false);
                    }
                    zzyiVar.f21340f.f5303a = 0L;
                    zzyiVar.f21343i = 0L;
                    i3 = 1;
                    zzyiVar.f21342h = true;
                    zzyiVar.f21346l = false;
                } else {
                    zzyrVar.f21391c0 = true;
                    zzabzVar = zzacf.f4895d;
                }
            }
            zzabzVar = new zzabz(i6, jMin);
        }
        int i7 = zzabzVar.f4884a;
        int i8 = (i7 == 0 || i7 == i3) ? i3 : 0;
        zzxv zzxvVar = zzyrVar.f21398v;
        zzxvVar.m9029a(new zzxr(zzxvVar, zzxcVar, new zzxh(-1, null, zzfm.m6518t(zzyiVar.f21343i), zzfm.m6518t(zzyrVar.f21381S)), iOException, i8 ^ 1));
        int i9 = zzabzVar.f4884a;
        if (i9 == 3) {
            zzacfVar.f4899c = this.f4888u;
            return;
        }
        if (i9 != 2) {
            if (i9 == 1) {
                this.f4889v = 1;
            }
            long jMin2 = zzabzVar.f4885b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f4889v - 1) * 1000, 5000);
            }
            zzacf zzacfVar2 = this.f4893z;
            zzgtr.m7133f(zzacfVar2.f4898b == null);
            zzacfVar2.f4898b = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                m3944b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f4891x;
                this.f4890w = Thread.currentThread();
            }
            if (!z) {
                zzacb zzacbVar = this.f4886s;
                String simpleName = zzacbVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    ((zzyi) zzacbVar).m9031a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f4890w = null;
                Thread.interrupted();
            }
            if (this.f4892y) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f4892y) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.f4892y) {
                return;
            }
            zzeh.m6214f("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(3, new zzace(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.f4892y) {
                zzeh.m6214f("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f4892y) {
                return;
            }
            zzeh.m6214f("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(3, new zzace(e4)).sendToTarget();
        }
    }
}
