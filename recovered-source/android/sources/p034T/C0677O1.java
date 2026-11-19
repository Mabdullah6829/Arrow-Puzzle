package p034T;

/* JADX INFO: renamed from: T.O1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0677O1 implements InterfaceC0688S1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1517b;

    public /* synthetic */ C0677O1(int i2, int i3) {
        this.f1516a = i3;
        this.f1517b = i2;
    }

    @Override // p034T.InterfaceC0688S1
    /* JADX INFO: renamed from: a */
    public final void mo1523a(C0709Z1 c0709z1) {
        switch (this.f1516a) {
            case 0:
                c0709z1.f1657a.mo1545g(this.f1517b);
                break;
            case 1:
                c0709z1.f1657a.mo1541c(this.f1517b);
                break;
            default:
                c0709z1.f1657a.mo1544f(this.f1517b);
                break;
        }
    }
}
