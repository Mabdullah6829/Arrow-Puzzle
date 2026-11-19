package com.google.android.material.carousel;

import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: renamed from: com.google.android.material.carousel.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC5252a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23380b;

    public /* synthetic */ ViewOnLayoutChangeListenerC5252a(Object obj, int i2) {
        this.f23379a = i2;
        this.f23380b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        switch (this.f23379a) {
            case 0:
                ((CarouselLayoutManager) this.f23380b).lambda$new$0(view, i2, i3, i4, i5, i6, i7, i8, i9);
                break;
            default:
                ((NavigationBarItemView) this.f23380b).lambda$new$0(view, i2, i3, i4, i5, i6, i7, i8, i9);
                break;
        }
    }
}
