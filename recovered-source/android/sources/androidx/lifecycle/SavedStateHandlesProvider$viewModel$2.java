package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandlesProvider$viewModel$2 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ ViewModelStoreOwner $viewModelStoreOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$viewModelStoreOwner = viewModelStoreOwner;
    }

    @Override // p078p0.InterfaceC6487a
    public final SavedStateHandlesVM invoke() {
        return SavedStateHandleSupport.getSavedStateHandlesVM(this.$viewModelStoreOwner);
    }
}
