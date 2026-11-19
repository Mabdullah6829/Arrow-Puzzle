package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleSupport$savedStateHandlesVM$1$1 extends AbstractC6453l implements InterfaceC6498l {
    public static final SavedStateHandleSupport$savedStateHandlesVM$1$1 INSTANCE = new SavedStateHandleSupport$savedStateHandlesVM$1$1();

    public SavedStateHandleSupport$savedStateHandlesVM$1$1() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final SavedStateHandlesVM invoke(CreationExtras initializer) {
        AbstractC6452k.m12181e(initializer, "$this$initializer");
        return new SavedStateHandlesVM();
    }
}
