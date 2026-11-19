package androidx.core.os;

import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ InterfaceC6487a $action;

    public HandlerKt$postAtTime$runnable$1(InterfaceC6487a interfaceC6487a) {
        this.$action = interfaceC6487a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
