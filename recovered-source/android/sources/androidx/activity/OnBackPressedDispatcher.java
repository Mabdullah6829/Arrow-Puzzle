package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6451j;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p058e0.C6301i;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final C6301i onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$1 */
    public static final class C09321 extends AbstractC6453l implements InterfaceC6498l {
        public C09321() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return C6289k.f24318a;
        }

        public final void invoke(BackEventCompat backEvent) {
            AbstractC6452k.m12181e(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackStarted(backEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$2 */
    public static final class C09332 extends AbstractC6453l implements InterfaceC6498l {
        public C09332() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return C6289k.f24318a;
        }

        public final void invoke(BackEventCompat backEvent) {
            AbstractC6452k.m12181e(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackProgressed(backEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$3 */
    public static final class C09343 extends AbstractC6453l implements InterfaceC6487a {
        public C09343() {
            super(0);
        }

        @Override // p078p0.InterfaceC6487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12241invoke();
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12241invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$4 */
    public static final class C09354 extends AbstractC6453l implements InterfaceC6487a {
        public C09354() {
            super(0);
        }

        @Override // p078p0.InterfaceC6487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12242invoke();
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12242invoke() {
            OnBackPressedDispatcher.this.onBackCancelled();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$5 */
    public static final class C09365 extends AbstractC6453l implements InterfaceC6487a {
        public C09365() {
            super(0);
        }

        @Override // p078p0.InterfaceC6487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12243invoke();
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12243invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(InterfaceC6487a onBackInvoked) {
            AbstractC6452k.m12181e(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final InterfaceC6487a onBackInvoked) {
            AbstractC6452k.m12181e(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.g
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(onBackInvoked);
                }
            };
        }

        public final void registerOnBackInvokedCallback(Object dispatcher, int i2, Object callback) {
            AbstractC6452k.m12181e(dispatcher, "dispatcher");
            AbstractC6452k.m12181e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) callback);
        }

        public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            AbstractC6452k.m12181e(dispatcher, "dispatcher");
            AbstractC6452k.m12181e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final OnBackInvokedCallback createOnBackAnimationCallback(final InterfaceC6498l onBackStarted, final InterfaceC6498l onBackProgressed, final InterfaceC6487a onBackInvoked, final InterfaceC6487a onBackCancelled) {
            AbstractC6452k.m12181e(onBackStarted, "onBackStarted");
            AbstractC6452k.m12181e(onBackProgressed, "onBackProgressed");
            AbstractC6452k.m12181e(onBackInvoked, "onBackInvoked");
            AbstractC6452k.m12181e(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                public void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    AbstractC6452k.m12181e(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                public void onBackStarted(BackEvent backEvent) {
                    AbstractC6452k.m12181e(backEvent, "backEvent");
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            AbstractC6452k.m12181e(lifecycle, "lifecycle");
            AbstractC6452k.m12181e(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            AbstractC6452k.m12181e(source, "source");
            AbstractC6452k.m12181e(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }
    }

    public final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            AbstractC6452k.m12181e(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (AbstractC6452k.m12177a(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            InterfaceC6487a enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1 */
    public /* synthetic */ class C09381 extends AbstractC6451j implements InterfaceC6487a {
        public C09381(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p078p0.InterfaceC6487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12244invoke();
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12244invoke() {
            ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackCancelled() {
        Object objPrevious;
        C6301i c6301i = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = c6301i.listIterator(c6301i.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        Object objPrevious;
        C6301i c6301i = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = c6301i.listIterator(c6301i.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackProgressed(backEventCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackStarted(BackEventCompat backEventCompat) {
        Object objPrevious;
        C6301i c6301i = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = c6301i.listIterator(c6301i.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.inProgressCallback = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEventCompat);
        }
    }

    private final void updateBackInvokedCallbackState(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.backInvokedCallbackRegistered) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (z || !this.backInvokedCallbackRegistered) {
                return;
            }
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z = this.hasEnabledCallbacks;
        C6301i c6301i = this.onBackPressedCallbacks;
        boolean z2 = false;
        if (c6301i == null || !c6301i.isEmpty()) {
            Iterator it = c6301i.iterator();
            while (it.hasNext()) {
                if (((OnBackPressedCallback) it.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z2;
        if (z2 != z) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z2);
            }
        }
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        AbstractC6452k.m12181e(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        AbstractC6452k.m12181e(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.addLast(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    public final void dispatchOnBackProgressed(BackEventCompat backEvent) {
        AbstractC6452k.m12181e(backEvent, "backEvent");
        onBackProgressed(backEvent);
    }

    public final void dispatchOnBackStarted(BackEventCompat backEvent) {
        AbstractC6452k.m12181e(backEvent, "backEvent");
        onBackStarted(backEvent);
    }

    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void onBackPressed() {
        Object objPrevious;
        C6301i c6301i = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = c6301i.listIterator(c6301i.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        AbstractC6452k.m12181e(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new C6301i();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.onBackInvokedCallback = i2 >= 34 ? Api34Impl.INSTANCE.createOnBackAnimationCallback(new C09321(), new C09332(), new C09343(), new C09354()) : Api33Impl.INSTANCE.createOnBackInvokedCallback(new C09365());
        }
    }

    public final void addCallback(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        AbstractC6452k.m12181e(owner, "owner");
        AbstractC6452k.m12181e(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C09381(this));
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i2, AbstractC6447f abstractC6447f) {
        this((i2 & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
