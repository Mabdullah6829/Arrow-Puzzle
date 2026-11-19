package p034T;

import p030R.AbstractC0560i;
import p030R.AbstractC0562j;
import p030R.C0559h0;

/* JADX INFO: renamed from: T.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0675O extends AbstractC0562j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1513a;

    @Override // p030R.AbstractC0562j
    public final void cancel(String str, Throwable th) {
        int i2 = this.f1513a;
    }

    @Override // p030R.AbstractC0562j
    public final void halfClose() {
        int i2 = this.f1513a;
    }

    @Override // p030R.AbstractC0562j
    public boolean isReady() {
        switch (this.f1513a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return super.isReady();
        }
    }

    @Override // p030R.AbstractC0562j
    public final void request(int i2) {
        int i3 = this.f1513a;
    }

    @Override // p030R.AbstractC0562j
    public final void sendMessage(Object obj) {
        int i2 = this.f1513a;
    }

    @Override // p030R.AbstractC0562j
    public final void start(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
        switch (this.f1513a) {
            case 0:
            case 1:
                break;
            default:
                abstractC0560i.onClose(C0720c1.f1739g0, new C0559h0());
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m1527d() {
    }

    /* JADX INFO: renamed from: e */
    private final void m1528e() {
    }

    /* JADX INFO: renamed from: f */
    private final void m1529f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m1530g(int i2) {
    }

    /* JADX INFO: renamed from: h */
    private final void m1531h(int i2) {
    }

    /* JADX INFO: renamed from: i */
    private final void m1532i(int i2) {
    }

    /* JADX INFO: renamed from: j */
    private final void m1533j(Object obj) {
    }

    /* JADX INFO: renamed from: k */
    private final void m1534k(Object obj) {
    }

    /* JADX INFO: renamed from: l */
    private final void m1535l(Object obj) {
    }

    /* JADX INFO: renamed from: a */
    private final void m1524a(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1525b(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1526c(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    private final void m1536m(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
    }

    /* JADX INFO: renamed from: n */
    private final void m1537n(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
    }
}
