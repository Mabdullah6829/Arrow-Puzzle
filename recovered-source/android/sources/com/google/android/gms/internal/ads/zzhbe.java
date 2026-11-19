package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbe extends zzhbw implements Runnable {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f18481B = 0;

    /* JADX INFO: renamed from: A */
    public Object f18482A;

    /* JADX INFO: renamed from: z */
    public ListenableFuture f18483z;

    public zzhbe(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f18483z = listenableFuture;
        this.f18482A = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: e */
    public final void mo6897e() {
        m7325m(this.f18483z);
        this.f18483z = null;
        this.f18482A = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: f */
    public final String mo6898f() {
        String strM2450q;
        ListenableFuture listenableFuture = this.f18483z;
        Object obj = this.f18482A;
        String strMo6898f = super.mo6898f();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strM2450q = AbstractC1456a.m2450q(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strM2450q = "";
        }
        if (obj == null) {
            if (strMo6898f != null) {
                return strM2450q.concat(strMo6898f);
            }
            return null;
        }
        int length = strM2450q.length();
        String string2 = obj.toString();
        return AbstractC1456a.m2451r(new StringBuilder(string2.length() + length + 10 + 1), strM2450q, "function=[", string2, "]");
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo7342r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f18483z;
        Object obj = this.f18482A;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f18483z = null;
        if (listenableFuture.isCancelled()) {
            m7324l(listenableFuture);
            return;
        }
        try {
            try {
                Object objMo7343s = mo7343s(obj, zzhcf.m7378l(listenableFuture));
                this.f18482A = null;
                mo7342r(objMo7343s);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m7321d(th);
                } finally {
                    this.f18482A = null;
                }
            }
        } catch (Error e) {
            m7321d(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m7321d(e2.getCause());
        } catch (Exception e3) {
            m7321d(e3);
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract Object mo7343s(Object obj, Object obj2);
}
