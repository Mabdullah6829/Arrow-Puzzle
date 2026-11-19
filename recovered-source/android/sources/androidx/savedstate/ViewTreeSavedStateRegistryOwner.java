package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import p089x0.AbstractC6566i;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        AbstractC6452k.m12181e(view, "<this>");
        return (SavedStateRegistryOwner) AbstractC6566i.m12217s(AbstractC6566i.m12220v(AbstractC6566i.m12218t(view, C1707x10fac0e2.INSTANCE), C1708x10fac0e3.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        AbstractC6452k.m12181e(view, "<this>");
        view.setTag(C1706R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
