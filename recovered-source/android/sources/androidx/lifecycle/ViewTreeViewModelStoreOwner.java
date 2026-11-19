package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C1589R;
import kotlin.jvm.internal.AbstractC6452k;
import p089x0.AbstractC6566i;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        AbstractC6452k.m12181e(view, "<this>");
        return (ViewModelStoreOwner) AbstractC6566i.m12217s(AbstractC6566i.m12220v(AbstractC6566i.m12218t(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC6452k.m12181e(view, "<this>");
        view.setTag(C1589R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
