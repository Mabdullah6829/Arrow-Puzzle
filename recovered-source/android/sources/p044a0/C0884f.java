package p044a0;

import p030R.C0580s;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: a0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0884f implements InterfaceC0537T {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2474a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0537T f2475b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0880b f2476c;

    public /* synthetic */ C0884f(AbstractC0880b abstractC0880b, InterfaceC0537T interfaceC0537T, int i2) {
        this.f2474a = i2;
        this.f2476c = abstractC0880b;
        this.f2475b = interfaceC0537T;
    }

    @Override // p030R.InterfaceC0537T
    /* JADX INFO: renamed from: a */
    public final void mo1263a(C0580s c0580s) {
        switch (this.f2474a) {
            case 0:
                this.f2475b.mo1263a(c0580s);
                ((C0885g) this.f2476c).f2478b.mo1263a(c0580s);
                break;
            default:
                C0897s c0897s = (C0897s) this.f2476c;
                c0897s.f2519d = c0580s;
                if (!c0897s.f2518c) {
                    this.f2475b.mo1263a(c0580s);
                }
                break;
        }
    }
}
