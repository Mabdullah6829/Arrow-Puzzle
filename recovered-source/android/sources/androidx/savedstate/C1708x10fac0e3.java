package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1708x10fac0e3 extends AbstractC6453l implements InterfaceC6498l {
    public static final C1708x10fac0e3 INSTANCE = new C1708x10fac0e3();

    public C1708x10fac0e3() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final SavedStateRegistryOwner invoke(View view) {
        AbstractC6452k.m12181e(view, "view");
        Object tag = view.getTag(C1706R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}
