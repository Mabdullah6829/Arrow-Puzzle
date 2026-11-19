package androidx.core.widget;

/* JADX INFO: renamed from: androidx.core.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1288a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2737s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ ContentLoadingProgressBar f2738t;

    public /* synthetic */ RunnableC1288a(ContentLoadingProgressBar contentLoadingProgressBar, int i2) {
        this.f2737s = i2;
        this.f2738t = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2737s) {
            case 0:
                this.f2738t.lambda$new$0();
                break;
            case 1:
                this.f2738t.lambda$new$1();
                break;
            case 2:
                this.f2738t.showOnUiThread();
                break;
            default:
                this.f2738t.hideOnUiThread();
                break;
        }
    }
}
