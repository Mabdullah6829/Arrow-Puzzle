package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeViewModelKt {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        AbstractC6452k.m12181e(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
