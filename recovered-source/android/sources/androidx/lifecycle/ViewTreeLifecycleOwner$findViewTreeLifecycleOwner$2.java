package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C1587R;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends AbstractC6453l implements InterfaceC6498l {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final LifecycleOwner invoke(View viewParent) {
        AbstractC6452k.m12181e(viewParent, "viewParent");
        Object tag = viewParent.getTag(C1587R.id.view_tree_lifecycle_owner);
        if (tag instanceof LifecycleOwner) {
            return (LifecycleOwner) tag;
        }
        return null;
    }
}
