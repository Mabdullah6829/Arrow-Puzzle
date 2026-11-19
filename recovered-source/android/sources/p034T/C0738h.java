package p034T;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: T.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0738h implements InterfaceC0670M0 {

    /* JADX INFO: renamed from: a */
    public final AtomicLong f1883a;

    public C0738h(int i2) {
        switch (i2) {
            case 1:
                this.f1883a = new AtomicLong();
                break;
            default:
                this.f1883a = new AtomicLong();
                break;
        }
    }

    @Override // p034T.InterfaceC0670M0
    /* JADX INFO: renamed from: a */
    public void mo1516a() {
        this.f1883a.getAndAdd(1L);
    }
}
