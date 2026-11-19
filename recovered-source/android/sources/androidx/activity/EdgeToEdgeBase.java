package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
final class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle, Window window, View view, boolean z, boolean z2) {
        AbstractC6452k.m12181e(statusBarStyle, "statusBarStyle");
        AbstractC6452k.m12181e(navigationBarStyle, "navigationBarStyle");
        AbstractC6452k.m12181e(window, "window");
        AbstractC6452k.m12181e(view, "view");
    }
}
