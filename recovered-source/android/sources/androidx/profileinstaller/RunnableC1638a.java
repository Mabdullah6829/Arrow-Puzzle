package androidx.profileinstaller;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1638a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2823s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f2824t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f2825u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f2826v;

    public /* synthetic */ RunnableC1638a(int i2, Object obj, int i3, Object obj2) {
        this.f2823s = i3;
        this.f2824t = obj;
        this.f2825u = i2;
        this.f2826v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2823s) {
            case 0:
                ((ProfileInstaller.DiagnosticsCallback) this.f2824t).onResultReceived(this.f2825u, this.f2826v);
                break;
            case 1:
                ((ProfileInstaller.DiagnosticsCallback) this.f2824t).onDiagnosticReceived(this.f2825u, this.f2826v);
                break;
            default:
                ((DeviceProfileWriter) this.f2824t).lambda$result$0(this.f2825u, this.f2826v);
                break;
        }
    }
}
