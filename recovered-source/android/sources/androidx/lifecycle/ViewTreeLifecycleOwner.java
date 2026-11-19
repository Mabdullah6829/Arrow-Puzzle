package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C1587R;
import kotlin.jvm.internal.AbstractC6452k;
import p089x0.AbstractC6566i;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        AbstractC6452k.m12181e(view, "<this>");
        return (LifecycleOwner) AbstractC6566i.m12217s(AbstractC6566i.m12220v(AbstractC6566i.m12218t(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        AbstractC6452k.m12181e(view, "<this>");
        view.setTag(C1587R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
