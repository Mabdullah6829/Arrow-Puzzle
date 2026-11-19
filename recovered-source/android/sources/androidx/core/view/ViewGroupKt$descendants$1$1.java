package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupKt$descendants$1$1 extends AbstractC6453l implements InterfaceC6498l {
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final Iterator<View> invoke(View view) {
        InterfaceC6563f children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
