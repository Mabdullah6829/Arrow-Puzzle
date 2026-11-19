package p081r;

import android.content.Context;
import p050c0.InterfaceC1888a;
import p074m.InterfaceC6475b;

/* JADX INFO: renamed from: r.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6526e implements InterfaceC6475b {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24745s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC1888a f24746t;

    public /* synthetic */ C6526e(InterfaceC1888a interfaceC1888a, int i2) {
        this.f24745s = i2;
        this.f24746t = interfaceC1888a;
    }

    @Override // p050c0.InterfaceC1888a
    public final Object get() {
        switch (this.f24745s) {
            case 0:
                String packageName = ((Context) this.f24746t.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new C6532k((Context) this.f24746t.get(), "com.google.android.datatransport.events", Integer.valueOf(C6532k.f24759v).intValue());
        }
    }
}
