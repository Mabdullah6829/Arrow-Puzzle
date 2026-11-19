package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0022X;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State minState, DispatchQueue dispatchQueue, final InterfaceC0022X parentJob) {
        AbstractC6452k.m12181e(lifecycle, "lifecycle");
        AbstractC6452k.m12181e(minState, "minState");
        AbstractC6452k.m12181e(dispatchQueue, "dispatchQueue");
        AbstractC6452k.m12181e(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f2816s, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            parentJob.mo29e(null);
            finish();
        }
    }

    private final void handleDestroy(InterfaceC0022X interfaceC0022X) {
        interfaceC0022X.mo29e(null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController this$0, InterfaceC0022X parentJob, LifecycleOwner source, Lifecycle.Event event) {
        AbstractC6452k.m12181e(this$0, "this$0");
        AbstractC6452k.m12181e(parentJob, "$parentJob");
        AbstractC6452k.m12181e(source, "source");
        AbstractC6452k.m12181e(event, "<anonymous parameter 1>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            parentJob.mo29e(null);
            this$0.finish();
        } else if (source.getLifecycle().getCurrentState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.pause();
        } else {
            this$0.dispatchQueue.resume();
        }
    }

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
