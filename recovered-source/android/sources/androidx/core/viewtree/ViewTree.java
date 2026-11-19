package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTree {
    public static final ViewParent getParentOrViewTreeDisjointParent(View view) {
        AbstractC6452k.m12181e(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(C1280R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void setViewTreeDisjointParent(View view, ViewParent viewParent) {
        AbstractC6452k.m12181e(view, "<this>");
        view.setTag(C1280R.id.view_tree_disjoint_parent, viewParent);
    }
}
