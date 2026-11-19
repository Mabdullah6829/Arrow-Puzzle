package com.google.android.material.overflow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.TooltipCompat;
import com.google.android.material.C5183R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.overflow.OverflowLinearLayout;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class OverflowLinearLayout extends LinearLayout {
    private static final int DEF_STYLE_RES = C5183R.style.Widget_Material3_OverflowLinearLayout;

    @NonNull
    private final MaterialButton overflowButton;
    private boolean overflowButtonAdded;
    private final Set<View> overflowViews;

    public OverflowLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    private int getChildSize(boolean z, View view, int i2, int i3) {
        int measuredHeight;
        int i4;
        int minimumHeight;
        int i5;
        measureChild(view, i2, i3);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z) {
            measuredHeight = view.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
            i4 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin;
            i4 = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
        }
        int i6 = measuredHeight + i4;
        if (i6 != 0) {
            return i6;
        }
        if (z) {
            minimumHeight = view.getMinimumWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
            i5 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
        } else {
            minimumHeight = view.getMinimumHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin;
            i5 = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
        }
        return minimumHeight + i5;
    }

    private int getOverflowButtonSize(boolean z, View view, int i2, int i3) {
        int measuredHeight;
        int i4;
        measureChild(view, i2, i3);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            measuredHeight = view.getMeasuredWidth() + layoutParams.leftMargin;
            i4 = layoutParams.rightMargin;
        } else {
            measuredHeight = view.getMeasuredHeight() + layoutParams.topMargin;
            i4 = layoutParams.bottomMargin;
        }
        return measuredHeight + i4;
    }

    private void handleOverflowButtonClick(PopupMenu popupMenu, int i2) {
        int i3;
        popupMenu.getMenu().clear();
        popupMenu.setForceShowIcon(true);
        for (final View view : this.overflowViews) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            final MenuItem menuItemAdd = popupMenu.getMenu().add(MaterialButtonGroup.OverflowUtils.getMenuItemText(view, layoutParams.overflowText));
            Drawable drawable = layoutParams.overflowIcon;
            if (drawable != null) {
                i3 = i2;
                menuItemAdd.setIcon(new InsetDrawable(drawable, i3, 0, i2, 0));
            } else {
                i3 = i2;
            }
            if (view instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) view;
                menuItemAdd.setCheckable(materialButton.isCheckable());
                menuItemAdd.setChecked(materialButton.isChecked());
            }
            menuItemAdd.setEnabled(view.isEnabled());
            menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: y.a
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return OverflowLinearLayout.lambda$handleOverflowButtonClick$1(view, menuItemAdd, menuItem);
                }
            });
            i2 = i3;
        }
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$handleOverflowButtonClick$1(View view, MenuItem menuItem, MenuItem menuItem2) {
        view.performClick();
        if (menuItem.isCheckable()) {
            menuItem.setChecked(!menuItem.isChecked());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(PopupMenu popupMenu, int i2, View view) {
        handleOverflowButtonClick(popupMenu, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Nullable
    public Drawable getOverflowButtonIcon() {
        return this.overflowButton.getIcon();
    }

    @NonNull
    public Set<View> getOverflowedViews() {
        return this.overflowViews;
    }

    public boolean isOverflowed() {
        return !this.overflowViews.isEmpty();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z = getOrientation() == 0;
        int childCount = this.overflowButtonAdded ? getChildCount() - 1 : getChildCount();
        int size = z ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i3);
        int overflowButtonSize = getOverflowButtonSize(z, this.overflowButton, i2, i3);
        this.overflowButton.setVisibility(8);
        this.overflowViews.clear();
        int childSize = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.setVisibility(0);
            childSize += getChildSize(z, childAt, i2, i3);
            if (childSize + overflowButtonSize > size) {
                this.overflowViews.add(childAt);
            }
            if (childSize > size) {
                for (int i5 = i4 + 1; i5 < childCount; i5++) {
                    this.overflowViews.add(getChildAt(i5));
                }
                Iterator<View> it = this.overflowViews.iterator();
                while (it.hasNext()) {
                    it.next().setVisibility(8);
                }
                if (!this.overflowButtonAdded) {
                    addView(this.overflowButton);
                    this.overflowButtonAdded = true;
                }
                this.overflowButton.setVisibility(0);
                super.onMeasure(i2, i3);
            }
        }
        this.overflowButton.setVisibility(8);
        this.overflowViews.clear();
        super.onMeasure(i2, i3);
    }

    public void setOverflowButtonIcon(@Nullable Drawable drawable) {
        this.overflowButton.lambda$setSecondaryIcon$3(drawable);
    }

    public void setOverflowButtonIconResource(@DrawableRes int i2) {
        this.overflowButton.setIconResource(i2);
    }

    public OverflowLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.overflowLinearLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OverflowLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        this.overflowButtonAdded = false;
        this.overflowViews = new LinkedHashSet();
        Context context2 = getContext();
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C5183R.styleable.OverflowLinearLayout, i2, i3, new int[0]);
        Drawable drawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(C5183R.styleable.OverflowLinearLayout_overflowButtonIcon);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context2).inflate(C5183R.layout.m3_overflow_linear_layout_overflow_button, (ViewGroup) this, false);
        this.overflowButton = materialButton;
        TooltipCompat.setTooltipText(materialButton, getResources().getString(C5183R.string.m3_overflow_linear_layout_button_tooltip_text));
        setOverflowButtonIcon(drawable);
        if (materialButton.getContentDescription() == null) {
            materialButton.setContentDescription(context2.getString(C5183R.string.m3_overflow_linear_layout_button_content_description));
        }
        final PopupMenu popupMenu = new PopupMenu(getContext(), materialButton, 17, 0, MaterialAttributes.resolveOrThrow(this, C5183R.attr.overflowLinearLayoutPopupMenuStyle));
        final int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(C5183R.dimen.m3_overflow_item_icon_horizontal_padding);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: y.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24796s.lambda$new$0(popupMenu, dimensionPixelOffset, view);
            }
        });
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NonNull
    public LayoutParams generateDefaultLayoutParams() {
        if (getOrientation() == 0) {
            return new LayoutParams(-2, -2);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NonNull
    public LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NonNull
    public LayoutParams generateLayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams(layoutParams);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        @Nullable
        public Drawable overflowIcon;

        @Nullable
        public CharSequence overflowText;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.overflowIcon = null;
            this.overflowText = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5183R.styleable.OverflowLinearLayout_Layout);
            this.overflowIcon = typedArrayObtainStyledAttributes.getDrawable(C5183R.styleable.OverflowLinearLayout_Layout_layout_overflowIcon);
            this.overflowText = typedArrayObtainStyledAttributes.getText(C5183R.styleable.OverflowLinearLayout_Layout_layout_overflowText);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(int i2, int i3, float f2) {
            super(i2, i3, f2);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(int i2, int i3, float f2, @Nullable Drawable drawable, @Nullable CharSequence charSequence) {
            super(i2, i3, f2);
            this.overflowIcon = drawable;
            this.overflowText = charSequence;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(@NonNull LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.overflowIcon = null;
            this.overflowText = null;
            this.overflowText = layoutParams.overflowText;
            this.overflowIcon = layoutParams.overflowIcon;
        }
    }
}
