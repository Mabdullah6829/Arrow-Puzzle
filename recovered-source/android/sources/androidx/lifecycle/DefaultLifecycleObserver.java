package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner owner) {
        AbstractC6452k.m12181e(owner, "owner");
    }

    default void onDestroy(LifecycleOwner owner) {
        AbstractC6452k.m12181e(owner, "owner");
    }

    default void onPause(LifecycleOwner owner) {
        AbstractC6452k.m12181e(owner, "owner");
    }

    default void onResume(LifecycleOwner owner) {
        AbstractC6452k.m12181e(owner, "owner");
    }

    default void onStart(LifecycleOwner owner) {
        AbstractC6452k.m12181e(owner, "owner");
    }

    default void onStop(LifecycleOwner owner) {
        AbstractC6452k.m12181e(owner, "owner");
    }
}
