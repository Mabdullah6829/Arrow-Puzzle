package androidx.core.view.insets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.C1141R;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object PROTECTION_VIEW = new Object();
    private ProtectionGroup mGroup;
    private final List<Protection> mProtections;

    public ProtectionLayout(Context context) {
        super(context);
        this.mProtections = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    private void addProtectionView(Context context, int i2, Protection protection) {
        int width;
        int i3;
        int height;
        Protection.Attributes attributes = protection.getAttributes();
        int side = protection.getSide();
        int i4 = -1;
        if (side != 1) {
            if (side == 2) {
                height = attributes.getHeight();
                i3 = 48;
            } else if (side == 4) {
                width = attributes.getWidth();
                i3 = 5;
            } else {
                if (side != 8) {
                    throw new IllegalArgumentException("Unexpected side: " + protection.getSide());
                }
                height = attributes.getHeight();
                i3 = 80;
            }
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, height, i3);
            Insets margin = attributes.getMargin();
            layoutParams.leftMargin = margin.left;
            layoutParams.topMargin = margin.top;
            layoutParams.rightMargin = margin.right;
            layoutParams.bottomMargin = margin.bottom;
            final View view = new View(context);
            view.setTag(PROTECTION_VIEW);
            view.setTranslationX(attributes.getTranslationX());
            view.setTranslationY(attributes.getTranslationY());
            view.setAlpha(attributes.getAlpha());
            view.setVisibility(attributes.isVisible() ? 0 : 4);
            view.setBackground(attributes.getDrawable());
            attributes.setCallback(new Protection.Attributes.Callback() { // from class: androidx.core.view.insets.ProtectionLayout.1
                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onAlphaChanged(float f2) {
                    view.setAlpha(f2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onDrawableChanged(Drawable drawable) {
                    view.setBackground(drawable);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onHeightChanged(int i5) {
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    layoutParams2.height = i5;
                    view.setLayoutParams(layoutParams2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onMarginChanged(Insets insets) {
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    layoutParams2.leftMargin = insets.left;
                    layoutParams2.topMargin = insets.top;
                    layoutParams2.rightMargin = insets.right;
                    layoutParams2.bottomMargin = insets.bottom;
                    view.setLayoutParams(layoutParams2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onTranslationXChanged(float f2) {
                    view.setTranslationX(f2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onTranslationYChanged(float f2) {
                    view.setTranslationY(f2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onVisibilityChanged(boolean z) {
                    view.setVisibility(z ? 0 : 4);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void onWidthChanged(int i5) {
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    layoutParams2.width = i5;
                    view.setLayoutParams(layoutParams2);
                }
            });
            addView(view, i2, layoutParams);
        }
        width = attributes.getWidth();
        i3 = 3;
        i4 = width;
        height = -1;
        final FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, height, i3);
        Insets margin2 = attributes.getMargin();
        layoutParams2.leftMargin = margin2.left;
        layoutParams2.topMargin = margin2.top;
        layoutParams2.rightMargin = margin2.right;
        layoutParams2.bottomMargin = margin2.bottom;
        final View view2 = new View(context);
        view2.setTag(PROTECTION_VIEW);
        view2.setTranslationX(attributes.getTranslationX());
        view2.setTranslationY(attributes.getTranslationY());
        view2.setAlpha(attributes.getAlpha());
        view2.setVisibility(attributes.isVisible() ? 0 : 4);
        view2.setBackground(attributes.getDrawable());
        attributes.setCallback(new Protection.Attributes.Callback() { // from class: androidx.core.view.insets.ProtectionLayout.1
            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onAlphaChanged(float f2) {
                view2.setAlpha(f2);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onDrawableChanged(Drawable drawable) {
                view2.setBackground(drawable);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onHeightChanged(int i5) {
                FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                layoutParams3.height = i5;
                view2.setLayoutParams(layoutParams3);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onMarginChanged(Insets insets) {
                FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                layoutParams3.leftMargin = insets.left;
                layoutParams3.topMargin = insets.top;
                layoutParams3.rightMargin = insets.right;
                layoutParams3.bottomMargin = insets.bottom;
                view2.setLayoutParams(layoutParams3);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onTranslationXChanged(float f2) {
                view2.setTranslationX(f2);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onTranslationYChanged(float f2) {
                view2.setTranslationY(f2);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onVisibilityChanged(boolean z) {
                view2.setVisibility(z ? 0 : 4);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void onWidthChanged(int i5) {
                FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                layoutParams3.width = i5;
                view2.setLayoutParams(layoutParams3);
            }
        });
        addView(view2, i2, layoutParams2);
    }

    private void addProtectionViews() {
        if (this.mProtections.isEmpty()) {
            return;
        }
        this.mGroup = new ProtectionGroup(getOrInstallSystemBarStateMonitor(), this.mProtections);
        int childCount = getChildCount();
        int size = this.mGroup.size();
        for (int i2 = 0; i2 < size; i2++) {
            addProtectionView(getContext(), i2 + childCount, this.mGroup.getProtection(i2));
        }
    }

    private SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i2 = C1141R.id.tag_system_bar_state_monitor;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof SystemBarStateMonitor) {
            return (SystemBarStateMonitor) tag;
        }
        SystemBarStateMonitor systemBarStateMonitor = new SystemBarStateMonitor(viewGroup);
        viewGroup.setTag(i2, systemBarStateMonitor);
        return systemBarStateMonitor;
    }

    private void maybeUninstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i2 = C1141R.id.tag_system_bar_state_monitor;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof SystemBarStateMonitor) {
            SystemBarStateMonitor systemBarStateMonitor = (SystemBarStateMonitor) tag;
            if (systemBarStateMonitor.hasCallback()) {
                return;
            }
            systemBarStateMonitor.detachFromWindow();
            viewGroup.setTag(i2, null);
        }
    }

    private void removeProtectionViews() {
        if (this.mGroup != null) {
            removeViews(getChildCount() - this.mGroup.size(), this.mGroup.size());
            int size = this.mGroup.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mGroup.getProtection(i2).getAttributes().setCallback(null);
            }
            this.mGroup.dispose();
            this.mGroup = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != PROTECTION_VIEW) {
            ProtectionGroup protectionGroup = this.mGroup;
            int childCount = getChildCount() - (protectionGroup != null ? protectionGroup.size() : 0);
            if (i2 > childCount || i2 < 0) {
                i2 = childCount;
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mGroup != null) {
            removeProtectionViews();
        }
        addProtectionViews();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeProtectionViews();
        maybeUninstallSystemBarStateMonitor();
    }

    public void setProtections(List<Protection> list) {
        this.mProtections.clear();
        this.mProtections.addAll(list);
        if (isAttachedToWindow()) {
            removeProtectionViews();
            addProtectionViews();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context, List<Protection> list) {
        super(context);
        this.mProtections = new ArrayList();
        setProtections(list);
    }
}
