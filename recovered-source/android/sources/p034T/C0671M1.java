package p034T;

import p030R.C0588w;
import p030R.C0592y;
import p030R.InterfaceC0574p;

/* JADX INFO: renamed from: T.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0671M1 implements InterfaceC0688S1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1509b;

    public /* synthetic */ C0671M1(Object obj, int i2) {
        this.f1508a = i2;
        this.f1509b = obj;
    }

    @Override // p034T.InterfaceC0688S1
    /* JADX INFO: renamed from: a */
    public final void mo1523a(C0709Z1 c0709z1) {
        switch (this.f1508a) {
            case 0:
                c0709z1.f1657a.mo1539a((InterfaceC0574p) this.f1509b);
                break;
            case 1:
                c0709z1.f1657a.mo1546h((C0588w) this.f1509b);
                break;
            default:
                c0709z1.f1657a.mo1547i((C0592y) this.f1509b);
                break;
        }
    }
}
