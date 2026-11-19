package p032S;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import com.google.firebase.firestore.remote.RunnableC5964g;
import java.util.concurrent.TimeUnit;
import p000A0.RunnableC0046k0;
import p030R.AbstractC0541X;
import p030R.AbstractC0562j;
import p030R.C0556g;
import p030R.C0567l0;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: S.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0599c extends AbstractC0541X {

    /* JADX INFO: renamed from: a */
    public final AbstractC0541X f1315a;

    /* JADX INFO: renamed from: b */
    public final Context f1316b;

    /* JADX INFO: renamed from: c */
    public final ConnectivityManager f1317c;

    /* JADX INFO: renamed from: d */
    public final Object f1318d = new Object();

    /* JADX INFO: renamed from: e */
    public Runnable f1319e;

    public C0599c(AbstractC0541X abstractC0541X, Context context) {
        this.f1315a = abstractC0541X;
        this.f1316b = context;
        if (context == null) {
            this.f1317c = null;
            return;
        }
        this.f1317c = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            m1355x();
        } catch (SecurityException e) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: k */
    public final AbstractC0562j mo1245k(C0567l0 c0567l0, C0556g c0556g) {
        return this.f1315a.mo1245k(c0567l0, c0556g);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: r */
    public final boolean mo1276r(long j2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return this.f1315a.mo1276r(j2);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: s */
    public final void mo1277s() {
        this.f1315a.mo1277s();
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: t */
    public final EnumC0578r mo1278t() {
        return this.f1315a.mo1278t();
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: u */
    public final void mo1279u(EnumC0578r enumC0578r, RunnableC5964g runnableC5964g) {
        this.f1315a.mo1279u(enumC0578r, runnableC5964g);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: v */
    public final AbstractC0541X mo1280v() {
        synchronized (this.f1318d) {
            try {
                Runnable runnable = this.f1319e;
                if (runnable != null) {
                    runnable.run();
                    this.f1319e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1315a.mo1280v();
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: w */
    public final AbstractC0541X mo1281w() {
        synchronized (this.f1318d) {
            try {
                Runnable runnable = this.f1319e;
                if (runnable != null) {
                    runnable.run();
                    this.f1319e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1315a.mo1281w();
    }

    /* JADX INFO: renamed from: x */
    public final void m1355x() {
        ConnectivityManager connectivityManager = this.f1317c;
        if (connectivityManager != null) {
            C0597a c0597a = new C0597a(this);
            connectivityManager.registerDefaultNetworkCallback(c0597a);
            this.f1319e = new RunnableC0046k0(this, c0597a, 5, false);
        } else {
            C0598b c0598b = new C0598b(this);
            this.f1316b.registerReceiver(c0598b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f1319e = new RunnableC0046k0(this, c0598b, 6, false);
        }
    }
}
