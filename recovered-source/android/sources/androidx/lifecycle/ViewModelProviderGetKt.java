package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelProviderGetKt {
    public static final CreationExtras defaultCreationExtras(ViewModelStoreOwner owner) {
        AbstractC6452k.m12181e(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    public static final <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        AbstractC6452k.m12181e(viewModelProvider, "<this>");
        AbstractC6452k.m12184h();
        throw null;
    }
}
