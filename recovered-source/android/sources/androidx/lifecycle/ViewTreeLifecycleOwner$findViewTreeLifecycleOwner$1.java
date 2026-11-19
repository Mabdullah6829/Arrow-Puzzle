package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends AbstractC6453l implements InterfaceC6498l {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final View invoke(View currentView) {
        AbstractC6452k.m12181e(currentView, "currentView");
        Object parent = currentView.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
