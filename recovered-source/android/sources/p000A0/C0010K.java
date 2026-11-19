package p000A0;

/* JADX INFO: renamed from: A0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0010K extends AbstractRunnableC0011L {

    /* JADX INFO: renamed from: u */
    public final C0039h f6u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ AbstractC0013N f7v;

    public C0010K(AbstractC0013N abstractC0013N, long j2, C0039h c0039h) {
        this.f7v = abstractC0013N;
        this.f8s = j2;
        this.f9t = -1;
        this.f6u = c0039h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6u.m77B(this.f7v);
    }

    @Override // p000A0.AbstractRunnableC0011L
    public final String toString() {
        return super.toString() + this.f6u;
    }
}
