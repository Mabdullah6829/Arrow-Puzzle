package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0942x8c7c000a extends AbstractC6453l implements InterfaceC6498l {
    public static final C0942x8c7c000a INSTANCE = new C0942x8c7c000a();

    public C0942x8c7c000a() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final View invoke(View it) {
        AbstractC6452k.m12181e(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
