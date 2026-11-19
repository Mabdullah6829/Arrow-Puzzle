package androidx.activity;

import kotlin.jvm.internal.AbstractC6451j;
import p057d0.C6289k;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends AbstractC6451j implements InterfaceC6487a {
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // p078p0.InterfaceC6487a
    public /* bridge */ /* synthetic */ Object invoke() {
        m12245invoke();
        return C6289k.f24318a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m12245invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
