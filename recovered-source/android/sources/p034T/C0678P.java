package p034T;

import p030R.AbstractC0560i;
import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0678P extends AbstractRunnableC0663K {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f1518u = 1;

    /* JADX INFO: renamed from: v */
    public final AbstractC0560i f1519v;

    /* JADX INFO: renamed from: w */
    public final C0589w0 f1520w;

    public C0678P(C0705Y0 c0705y0, AbstractC0560i abstractC0560i, C0589w0 c0589w0) {
        super(c0705y0.f1630c, 0);
        this.f1519v = abstractC0560i;
        this.f1520w = c0589w0;
    }

    @Override // p034T.AbstractRunnableC0663K
    /* JADX INFO: renamed from: b */
    public final void mo1520b() {
        switch (this.f1518u) {
            case 0:
                this.f1519v.onClose(this.f1520w, new C0559h0());
                break;
            default:
                this.f1519v.onClose(this.f1520w, new C0559h0());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0678P(C0687S0 c0687s0, AbstractC0560i abstractC0560i, C0589w0 c0589w0) {
        super(c0687s0.f1571e, 0);
        this.f1519v = abstractC0560i;
        this.f1520w = c0589w0;
    }
}
