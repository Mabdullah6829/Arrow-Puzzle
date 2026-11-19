package com.google.android.material.listitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C5183R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class ListItemCardView extends MaterialCardView implements SwipeableListItem {
    private static final int[] SWIPED_STATE_SET = {C5183R.attr.state_swiped};
    private boolean isSwiped;

    @NonNull
    private final LinkedHashSet<SwipeCallback> swipeCallbacks;
    private boolean swipeEnabled;
    private final int swipeMaxOvershoot;

    public static abstract class SwipeCallback {
        public abstract void onSwipe(@Px int i2);

        public abstract <T extends View & RevealableListItem> void onSwipeStateChanged(int i2, @NonNull T t, int i3);
    }

    public ListItemCardView(Context context) {
        this(context, null);
    }

    public void addSwipeCallback(@NonNull SwipeCallback swipeCallback) {
        this.swipeCallbacks.add(swipeCallback);
    }

    @Override // com.google.android.material.listitem.SwipeableListItem
    public int getSwipeMaxOvershoot() {
        return this.swipeMaxOvershoot;
    }

    @Override // com.google.android.material.listitem.SwipeableListItem
    public boolean isSwipeEnabled() {
        return this.swipeEnabled;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.isSwiped) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, SWIPED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // com.google.android.material.listitem.SwipeableListItem
    public void onSwipe(@Px int i2) {
        Iterator<SwipeCallback> it = this.swipeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSwipe(i2);
        }
    }

    @Override // com.google.android.material.listitem.SwipeableListItem
    public <T extends View & RevealableListItem> void onSwipeStateChanged(int i2, T t, int i3) {
        this.isSwiped = i2 != 3;
        refreshDrawableState();
        Iterator<SwipeCallback> it = this.swipeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSwipeStateChanged(i2, t, i3);
        }
    }

    public void removeSwipeCallback(@NonNull SwipeCallback swipeCallback) {
        this.swipeCallbacks.remove(swipeCallback);
    }

    @Override // com.google.android.material.listitem.SwipeableListItem
    public void setSwipeEnabled(boolean z) {
        this.swipeEnabled = z;
    }

    public ListItemCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.listItemCardViewStyle);
    }

    public ListItemCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
        this(context, attributeSet, i2, C5183R.style.Widget_Material3_ListItemCardView);
    }

    public ListItemCardView(Context context, AttributeSet attributeSet, int i2, @StyleRes int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        this.isSwiped = false;
        this.swipeCallbacks = new LinkedHashSet<>();
        Context context2 = getContext();
        this.swipeMaxOvershoot = getResources().getDimensionPixelSize(C5183R.dimen.m3_list_max_swipe_overshoot);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C5183R.styleable.ListItemCardView, i2, i3, new int[0]);
        this.swipeEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C5183R.styleable.ListItemCardView_swipeEnabled, true);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
    }
}
