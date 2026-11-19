package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcherKt {
    public static final OnBackPressedCallback addCallback(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final boolean z, final InterfaceC6498l onBackPressed) {
        AbstractC6452k.m12181e(onBackPressedDispatcher, "<this>");
        AbstractC6452k.m12181e(onBackPressed, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
            return onBackPressedCallback;
        }
        onBackPressedDispatcher.addCallback(onBackPressedCallback);
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z, InterfaceC6498l interfaceC6498l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z, interfaceC6498l);
    }
}
