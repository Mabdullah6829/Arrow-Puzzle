package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;
import p089x0.AbstractC6566i;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        AbstractC6452k.m12181e(view, "<this>");
        return (FullyDrawnReporterOwner) AbstractC6566i.m12217s(AbstractC6566i.m12220v(AbstractC6566i.m12218t(view, C0940x54146ae.INSTANCE), C0941x54146af.INSTANCE));
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        AbstractC6452k.m12181e(view, "<this>");
        AbstractC6452k.m12181e(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(C0939R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
