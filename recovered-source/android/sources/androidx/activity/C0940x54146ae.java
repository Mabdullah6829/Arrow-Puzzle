package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0940x54146ae extends AbstractC6453l implements InterfaceC6498l {
    public static final C0940x54146ae INSTANCE = new C0940x54146ae();

    public C0940x54146ae() {
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
