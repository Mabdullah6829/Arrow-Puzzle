package p044a0;

import java.util.concurrent.atomic.AtomicLong;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p030R.AbstractC0570n;
import p030R.C0546b;
import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: a0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0894p extends AbstractC0570n {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0570n f2511b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0896r f2512c;

    public C0894p(C0896r c0896r, AbstractC0570n abstractC0570n) {
        this.f2512c = c0896r;
        this.f2511b = abstractC0570n;
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: a */
    public final void mo1321a() {
        this.f2511b.mo1321a();
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: b */
    public final void mo1322b() {
        this.f2511b.mo1322b();
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: c */
    public final void mo1323c(int i2) {
        this.f2511b.mo1323c(i2);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: d */
    public final void mo1324d(int i2, long j2) {
        this.f2511b.mo1324d(i2, j2);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: e */
    public final void mo1325e(C0559h0 c0559h0) {
        this.f2511b.mo1325e(c0559h0);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: f */
    public final void mo1326f(long j2) {
        this.f2511b.mo1326f(j2);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: g */
    public final void mo1327g(long j2) {
        this.f2511b.mo1327g(j2);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: h */
    public final void mo1328h() {
        this.f2511b.mo1328h();
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: i */
    public final void mo1329i(int i2) {
        this.f2511b.mo1329i(i2);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: j */
    public final void mo1330j(int i2, long j2, long j3) {
        this.f2511b.mo1330j(i2, j2, j3);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: k */
    public final void mo1331k(long j2) {
        this.f2511b.mo1331k(j2);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: l */
    public final void mo1332l(long j2) {
        this.f2511b.mo1332l(j2);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: m */
    public final void mo1333m(C0589w0 c0589w0) {
        C0889k c0889k = this.f2512c.f2514a;
        boolean zM1352e = c0589w0.m1352e();
        C0893o c0893o = c0889k.f2490a;
        if (c0893o.f2508e != null || c0893o.f2509f != null) {
            if (zM1352e) {
                ((AtomicLong) c0889k.f2491b.f333u).getAndIncrement();
            } else {
                ((AtomicLong) c0889k.f2491b.f332t).getAndIncrement();
            }
        }
        this.f2511b.mo1333m(c0589w0);
    }

    @Override // p030R.AbstractC0570n
    /* JADX INFO: renamed from: n */
    public final void mo1334n(C0546b c0546b, C0559h0 c0559h0) {
        this.f2511b.mo1334n(c0546b, c0559h0);
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f2511b, "delegate");
        return c0087mM143s.toString();
    }
}
