package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhax extends zzhbw implements Runnable {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f18437C = 0;

    /* JADX INFO: renamed from: A */
    public Class f18438A;

    /* JADX INFO: renamed from: B */
    public Object f18439B;

    /* JADX INFO: renamed from: z */
    public ListenableFuture f18440z;

    public zzhax(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.f18440z = listenableFuture;
        this.f18438A = cls;
        this.f18439B = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: e */
    public final void mo6897e() {
        m7325m(this.f18440z);
        this.f18440z = null;
        this.f18438A = null;
        this.f18439B = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: f */
    public final String mo6898f() {
        String strM2450q;
        ListenableFuture listenableFuture = this.f18440z;
        Class cls = this.f18438A;
        Object obj = this.f18439B;
        String strMo6898f = super.mo6898f();
        if (listenableFuture != null) {
            String string = listenableFuture.toString();
            strM2450q = AbstractC1456a.m2450q(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strM2450q = "";
        }
        if (cls == null || obj == null) {
            if (strMo6898f != null) {
                return strM2450q.concat(strMo6898f);
            }
            return null;
        }
        int length = strM2450q.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        AbstractC0271e0.m413u(sb, strM2450q, "exceptionType=[", string2, "], fallback=[");
        return AbstractC0271e0.m403k(sb, string3, "]");
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo7312r(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM7378l;
        ListenableFuture listenableFuture = this.f18440z;
        Class cls = this.f18438A;
        Object obj = this.f18439B;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f18440z = null;
        try {
            th = listenableFuture instanceof zzhdh ? ((zzhdh) listenableFuture).mo7319a() : null;
            objM7378l = th == null ? zzhcf.m7378l(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                AbstractC0271e0.m413u(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            m7320c(objM7378l);
            return;
        }
        if (!cls.isInstance(th)) {
            m7324l(listenableFuture);
            return;
        }
        try {
            Object objMo7313s = mo7313s(obj, th);
            this.f18438A = null;
            this.f18439B = null;
            mo7312r(objMo7313s);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m7321d(th2);
            } finally {
                this.f18438A = null;
                this.f18439B = null;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract Object mo7313s(Object obj, Throwable th);
}
