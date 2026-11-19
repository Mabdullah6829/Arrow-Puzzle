package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC6487a enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(Cancellable cancellable) {
        AbstractC6452k.m12181e(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC6487a getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEvent) {
        AbstractC6452k.m12181e(backEvent, "backEvent");
    }

    public void handleOnBackStarted(BackEventCompat backEvent) {
        AbstractC6452k.m12181e(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public final void removeCancellable(Cancellable cancellable) {
        AbstractC6452k.m12181e(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        InterfaceC6487a interfaceC6487a = this.enabledChangedCallback;
        if (interfaceC6487a != null) {
            interfaceC6487a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC6487a interfaceC6487a) {
        this.enabledChangedCallback = interfaceC6487a;
    }
}
