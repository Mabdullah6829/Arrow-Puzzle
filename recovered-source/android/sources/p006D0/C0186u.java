package p006D0;

import kotlin.jvm.internal.C6462u;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p062g0.InterfaceC6348c;

/* JADX INFO: renamed from: D0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0186u implements InterfaceC0171f {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f367s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C6462u f368t;

    public /* synthetic */ C0186u(C6462u c6462u, int i2) {
        this.f367s = i2;
        this.f368t = c6462u;
    }

    @Override // p006D0.InterfaceC0171f
    public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) {
        switch (this.f367s) {
            case 0:
                this.f368t.f24636s = obj;
                throw new AbortFlowException(this);
            default:
                this.f368t.f24636s = obj;
                throw new AbortFlowException(this);
        }
    }
}
