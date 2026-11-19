package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1707x10fac0e2 extends AbstractC6453l implements InterfaceC6498l {
    public static final C1707x10fac0e2 INSTANCE = new C1707x10fac0e2();

    public C1707x10fac0e2() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final View invoke(View view) {
        AbstractC6452k.m12181e(view, "view");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
