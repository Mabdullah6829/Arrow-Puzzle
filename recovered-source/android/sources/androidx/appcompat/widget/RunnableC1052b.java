package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1052b implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2586s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Toolbar f2587t;

    public /* synthetic */ RunnableC1052b(Toolbar toolbar, int i2) {
        this.f2586s = i2;
        this.f2587t = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2586s) {
            case 0:
                this.f2587t.collapseActionView();
                break;
            default:
                this.f2587t.invalidateMenu();
                break;
        }
    }
}
