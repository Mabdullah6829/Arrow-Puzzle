package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import p089x0.AbstractC6566i;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        AbstractC6452k.m12181e(view, "<this>");
        return (OnBackPressedDispatcherOwner) AbstractC6566i.m12217s(AbstractC6566i.m12220v(AbstractC6566i.m12218t(view, C0942x8c7c000a.INSTANCE), C0943x8c7c000b.INSTANCE));
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        AbstractC6452k.m12181e(view, "<this>");
        AbstractC6452k.m12181e(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C0939R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
