package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0941x54146af extends AbstractC6453l implements InterfaceC6498l {
    public static final C0941x54146af INSTANCE = new C0941x54146af();

    public C0941x54146af() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final FullyDrawnReporterOwner invoke(View it) {
        AbstractC6452k.m12181e(it, "it");
        Object tag = it.getTag(C0939R.id.report_drawn);
        if (tag instanceof FullyDrawnReporterOwner) {
            return (FullyDrawnReporterOwner) tag;
        }
        return null;
    }
}
