package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: androidx.core.view.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnApplyWindowInsetsListenerC1274m implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return ViewGroupCompat.lambda$installCompatInsetsDispatch$0(view, windowInsets);
    }
}
