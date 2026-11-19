package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0947d implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2561s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f2562t;

    public /* synthetic */ RunnableC0947d(Object obj, int i2) {
        this.f2561s = i2;
        this.f2562t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2561s) {
            case 0:
                ((ComponentActivity.ReportFullyDrawnExecutorApi16Impl) this.f2562t).lambda$execute$0();
                break;
            case 1:
                ((ComponentActivity) this.f2562t).invalidateMenu();
                break;
            case 2:
                ComponentDialog.onBackPressedDispatcher$lambda$1((ComponentDialog) this.f2562t);
                break;
            default:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) this.f2562t);
                break;
        }
    }
}
