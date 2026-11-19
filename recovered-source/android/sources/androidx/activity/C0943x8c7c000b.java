package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0943x8c7c000b extends AbstractC6453l implements InterfaceC6498l {
    public static final C0943x8c7c000b INSTANCE = new C0943x8c7c000b();

    public C0943x8c7c000b() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final OnBackPressedDispatcherOwner invoke(View it) {
        AbstractC6452k.m12181e(it, "it");
        Object tag = it.getTag(C0939R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}
