package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC6451j;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends AbstractC6451j implements InterfaceC6498l {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // p078p0.InterfaceC6498l
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
