package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.view.GravityCompat;
import com.google.android.material.C5183R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearance;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonGroup extends LinearLayout {
    private static final String LOG_TAG = "MButtonGroup";
    public static final int OVERFLOW_MODE_MENU = 1;
    public static final int OVERFLOW_MODE_NONE = 0;
    public static final int OVERFLOW_MODE_WRAP = 2;
    private boolean buttonOverflowInitialized;

    @Nullable
    private StateListSizeChange buttonSizeChange;
    private final Map<Button, MenuItem> buttonToMenuItemMapping;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private boolean childShapesDirty;

    @Nullable
    private StateListShapeAppearanceModel groupStateListShapeAppearance;

    @Nullable
    StateListCornerSize innerCornerSize;
    private final List<ShapeAppearance> originalChildShapeAppearanceModels;
    private MaterialButton overflowButton;
    private final List<Button> overflowButtonsList;
    private final int overflowMenuItemIconPadding;
    private int overflowMode;
    private PopupMenu popupMenu;
    private final Map<Integer, Button> popupMenuItemToButtonMapping;
    private final PressedStateTracker pressedStateTracker;
    private final List<Integer> rowButtonFirstIndices;

    @Px
    private int spacing;
    private final List<Button> tempOverflowButtonsList;
    private static final int DEF_STYLE_RES = C5183R.style.Widget_Material3_MaterialButtonGroup;
    public static final Object OVERFLOW_BUTTON_TAG = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OverflowMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OverflowUtils {
        private OverflowUtils() {
        }

        @Nullable
        public static CharSequence getMenuItemText(@NonNull View view, @Nullable CharSequence charSequence) {
            if (!TextUtils.isEmpty(charSequence)) {
                return charSequence;
            }
            if (view instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) view;
                if (!TextUtils.isEmpty(materialButton.getText())) {
                    return materialButton.getText();
                }
            }
            return view.getContentDescription();
        }
    }

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(@NonNull MaterialButton materialButton, boolean z) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    public MaterialButtonGroup(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private MenuItem addMenuItemForButton(@NonNull Menu menu, @NonNull final Button button) {
        if (!(button.getLayoutParams() instanceof LayoutParams)) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        CharSequence menuItemText = OverflowUtils.getMenuItemText(button, layoutParams.overflowText);
        Drawable drawable = layoutParams.overflowIcon;
        MenuItem menuItemAdd = menu.add(menuItemText);
        if (drawable != null) {
            int i2 = this.overflowMenuItemIconPadding;
            menuItemAdd.setIcon(new InsetDrawable(drawable, i2, 0, i2, 0));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.google.android.material.button.d
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MaterialButtonGroup.lambda$addMenuItemForButton$2(button, menuItem);
            }
        });
        return menuItemAdd;
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            View childAt2 = getChildAt(i2 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.spacing <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childAt);
            if (getOrientation() == 0) {
                layoutParamsBuildLayoutParams.setMarginEnd(0);
                layoutParamsBuildLayoutParams.setMarginStart(this.spacing - iMin);
                layoutParamsBuildLayoutParams.topMargin = 0;
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = this.spacing - iMin;
                layoutParamsBuildLayoutParams.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private void adjustChildSizeChange() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.buttonSizeChange == null) {
            return;
        }
        if (this.overflowMode != 2) {
            adjustChildSizeChangeInRange(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i2 = 0;
        while (i2 < this.rowButtonFirstIndices.size()) {
            adjustChildSizeChangeInRange(this.rowButtonFirstIndices.get(i2).intValue(), (i2 == this.rowButtonFirstIndices.size() + (-1) ? getChildCount() : this.rowButtonFirstIndices.get(i2 + 1).intValue()) - 1);
            i2++;
        }
    }

    private void adjustChildSizeChangeInRange(int i2, int i3) {
        MaterialButton.WidthChangeDirection widthChangeDirection;
        if (i2 == i3) {
            getChildButton(i2).setWidthChangeDirection(MaterialButton.WidthChangeDirection.NONE);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i4 = i2;
        while (i4 <= i3) {
            if (isChildVisible(i4)) {
                MaterialButton childButton = getChildButton(i4);
                if (i4 == i2) {
                    widthChangeDirection = MaterialButton.WidthChangeDirection.END;
                } else {
                    widthChangeDirection = i4 == i3 ? MaterialButton.WidthChangeDirection.START : MaterialButton.WidthChangeDirection.BOTH;
                }
                childButton.setWidthChangeDirection(widthChangeDirection);
                int buttonAllowedWidthIncrease = getButtonAllowedWidthIncrease(i4);
                if (i4 != i2 && i4 != i3) {
                    buttonAllowedWidthIncrease /= 2;
                }
                iMin = Math.min(iMin, buttonAllowedWidthIncrease);
            }
            i4++;
        }
        while (i2 <= i3) {
            if (isChildVisible(i2)) {
                MaterialButton childButton2 = getChildButton(i2);
                childButton2.setSizeChange(this.buttonSizeChange);
                childButton2.setWidthChangeMax(iMin * 2);
            }
            i2++;
        }
    }

    private int getButtonAllowedWidthIncrease(int i2) {
        if (!isChildVisible(i2) || this.buttonSizeChange == null) {
            return 0;
        }
        int iMax = Math.max(0, this.buttonSizeChange.getMaxWidthChange(getChildButton(i2).getWidth()));
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(i2, true);
        int allowedWidthDecrease = prevVisibleChildButton == null ? 0 : prevVisibleChildButton.getAllowedWidthDecrease();
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(i2, true);
        return Math.min(iMax, allowedWidthDecrease + (nextVisibleChildButton != null ? nextVisibleChildButton.getAllowedWidthDecrease() : 0));
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (isChildVisible(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    @Nullable
    private MaterialButton getNextVisibleChildButton(int i2) {
        return getNextVisibleChildButton(i2, false);
    }

    @NonNull
    private StateListShapeAppearanceModel.Builder getOriginalStateListShapeBuilder(boolean z, boolean z2, int i2) {
        Object obj = this.groupStateListShapeAppearance;
        if (obj == null || (!z && !z2)) {
            obj = (ShapeAppearance) this.originalChildShapeAppearanceModels.get(i2);
        }
        return !(obj instanceof StateListShapeAppearanceModel) ? new StateListShapeAppearanceModel.Builder((ShapeAppearanceModel) this.originalChildShapeAppearanceModels.get(i2)) : ((StateListShapeAppearanceModel) obj).toBuilder();
    }

    @Nullable
    private MaterialButton getPrevVisibleChildButton(int i2) {
        return getPrevVisibleChildButton(i2, false);
    }

    private boolean isChildVisible(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addMenuItemForButton$2(Button button, MenuItem menuItem) {
        button.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeButtonOverflow$1(View view) {
        updateOverflowMenuItemsState();
        this.popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$new$0(MaterialButton materialButton, MaterialButton materialButton2) {
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(indexOfChild(materialButton), indexOfChild(materialButton2));
    }

    private void maybeUpdateOverflowMenu(int i2, int i3) {
        if (this.buttonOverflowInitialized) {
            if (this.overflowMode != 1) {
                this.overflowButton.setVisibility(8);
                return;
            }
            boolean z = getOrientation() == 0;
            this.tempOverflowButtonsList.clear();
            int size = z ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i3);
            int iMeasureAndGetChildButtonSize = measureAndGetChildButtonSize(z, this.overflowButton, i2, i3);
            int iMeasureAndGetChildButtonSize2 = 0;
            for (int i4 = 0; i4 < getChildCount() - 1; i4++) {
                MaterialButton childButton = getChildButton(i4);
                iMeasureAndGetChildButtonSize2 += measureAndGetChildButtonSize(z, childButton, i2, i3);
                if (iMeasureAndGetChildButtonSize2 + iMeasureAndGetChildButtonSize > size) {
                    this.tempOverflowButtonsList.add(childButton);
                }
                if (iMeasureAndGetChildButtonSize2 > size) {
                    for (int i5 = i4 + 1; i5 < getChildCount() - 1; i5++) {
                        this.tempOverflowButtonsList.add(getChildButton(i5));
                    }
                    this.overflowButton.setVisibility(0);
                    maybeUpdateOverflowMenuItemsAndChildVisibility();
                }
            }
            this.overflowButton.setVisibility(8);
            this.tempOverflowButtonsList.clear();
            maybeUpdateOverflowMenuItemsAndChildVisibility();
        }
    }

    private void maybeUpdateOverflowMenuItemsAndChildVisibility() {
        if (this.tempOverflowButtonsList.equals(this.overflowButtonsList)) {
            return;
        }
        for (int i2 = 0; i2 < getChildCount() - 1; i2++) {
            MaterialButton childButton = getChildButton(i2);
            if (this.buttonToMenuItemMapping.containsKey(childButton)) {
                childButton.setVisibility(0);
            }
        }
        this.overflowButtonsList.clear();
        this.overflowButtonsList.addAll(this.tempOverflowButtonsList);
        Menu menu = this.popupMenu.getMenu();
        this.popupMenuItemToButtonMapping.clear();
        this.buttonToMenuItemMapping.clear();
        menu.clear();
        for (Button button : this.overflowButtonsList) {
            MenuItem menuItemAddMenuItemForButton = addMenuItemForButton(menu, button);
            if (menuItemAddMenuItemForButton != null) {
                this.popupMenuItemToButtonMapping.put(Integer.valueOf(menuItemAddMenuItemForButton.getItemId()), button);
                this.buttonToMenuItemMapping.put(button, menuItemAddMenuItemForButton);
                button.setVisibility(8);
            }
        }
        updateOverflowMenuItemsState();
    }

    private int maybeWrapButtons(int i2, int i3) {
        this.rowButtonFirstIndices.clear();
        int size = View.MeasureSpec.getSize(i2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        int iMax = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (isChildVisible(i6)) {
                MaterialButton childButton = getChildButton(i6);
                measureChild(childButton, i2, i3);
                int measuredWidth = childButton.getMeasuredWidth();
                int measuredHeight = childButton.getMeasuredHeight();
                if (measuredWidth > 0) {
                    LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
                    if (i4 + measuredWidth + (arrayList.isEmpty() ? 0 : this.spacing) > size || arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                        i5 += iMax + (this.rowButtonFirstIndices.isEmpty() ? 0 : this.spacing);
                        this.rowButtonFirstIndices.add(Integer.valueOf(i6));
                        layoutParamsBuildLayoutParams.setMarginStart(-i4);
                        arrayList.clear();
                        i4 = 0;
                        iMax = 0;
                    }
                    i4 += measuredWidth + (i4 == 0 ? 0 : this.spacing);
                    iMax = Math.max(iMax, measuredHeight);
                    arrayList.add(Integer.valueOf(i6));
                    layoutParamsBuildLayoutParams.topMargin += i5;
                    childButton.setLayoutParams(layoutParamsBuildLayoutParams);
                }
            }
        }
        arrayList2.add(Integer.valueOf(i4));
        int iIntValue = ((Integer) Collections.max(arrayList2)).intValue();
        int i7 = 0;
        for (int i8 = 0; i8 < this.rowButtonFirstIndices.size(); i8++) {
            int iIntValue2 = this.rowButtonFirstIndices.get(i8).intValue();
            int iIntValue3 = ((Integer) arrayList2.get(i8)).intValue();
            MaterialButton childButton2 = getChildButton(iIntValue2);
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams2 = buildLayoutParams(childButton2);
            int i9 = layoutParamsBuildLayoutParams2.gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            int absoluteGravity = Gravity.getAbsoluteGravity(i9, getLayoutDirection());
            int i10 = iIntValue - iIntValue3;
            if (i9 != 8388611) {
                if (absoluteGravity == 1) {
                    i10 /= 2;
                }
                layoutParamsBuildLayoutParams2.setMarginStart((layoutParamsBuildLayoutParams2.getMarginStart() + i10) - i7);
                childButton2.setLayoutParams(layoutParamsBuildLayoutParams2);
                i7 = i10;
            }
        }
        return getPaddingBottom() + getPaddingTop() + i5 + iMax;
    }

    private int measureAndGetChildButtonSize(boolean z, Button button, int i2, int i3) {
        int i4;
        int i5;
        measureChild(button, i2, i3);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        int measuredWidth = z ? button.getMeasuredWidth() : button.getMeasuredHeight();
        if (z) {
            i4 = layoutParams.leftMargin;
            i5 = layoutParams.rightMargin;
        } else {
            i4 = layoutParams.topMargin;
            i5 = layoutParams.bottomMargin;
        }
        int i6 = i4 + i5;
        if (measuredWidth == 0) {
            measuredWidth = z ? button.getMinimumWidth() : button.getMinimumHeight();
        }
        return measuredWidth + i6;
    }

    private void recoverAllChildrenLayoutParams() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildButton(i2).recoverOriginalLayoutParams();
        }
    }

    private void resetChildMargins(int i2) {
        if (getChildCount() == 0 || i2 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(getChildButton(i2));
        if (getOrientation() == 1) {
            layoutParamsBuildLayoutParams.topMargin = 0;
            layoutParamsBuildLayoutParams.bottomMargin = 0;
        } else {
            layoutParamsBuildLayoutParams.setMarginEnd(0);
            layoutParamsBuildLayoutParams.setMarginStart(0);
            layoutParamsBuildLayoutParams.leftMargin = 0;
            layoutParamsBuildLayoutParams.rightMargin = 0;
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(getChildButton(i2), Integer.valueOf(i2));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void updateOverflowMenuItemsState() {
        for (Map.Entry<Button, MenuItem> entry : this.buttonToMenuItemMapping.entrySet()) {
            Button key = entry.getKey();
            MenuItem value = entry.getValue();
            if (entry.getKey() instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) key;
                value.setCheckable(materialButton.isCheckable());
                value.setChecked(materialButton.isChecked());
            }
            value.setEnabled(key.isEnabled());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i2, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        recoverAllChildrenLayoutParams();
        this.childShapesDirty = true;
        int iIndexOfChild = indexOfChild(this.overflowButton);
        if (iIndexOfChild < 0 || i2 != -1) {
            super.addView(view, i2, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        this.originalChildShapeAppearanceModels.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    @NonNull
    public LinearLayout.LayoutParams buildLayoutParams(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListSizeChange getButtonSizeChange() {
        return this.buttonSizeChange;
    }

    @NonNull
    public MaterialButton getChildButton(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.childOrder;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w(LOG_TAG, "Child order wasn't updated");
        return i3;
    }

    @NonNull
    public ShapeAppearanceModel getChildOriginalShapeAppearanceModel(int i2) {
        return this.originalChildShapeAppearanceModels.get(i2).getDefaultShape();
    }

    @NonNull
    public CornerSize getInnerCornerSize() {
        return this.innerCornerSize.getDefaultCornerSize();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListCornerSize getInnerCornerSizeStateList() {
        return this.innerCornerSize;
    }

    @Nullable
    public Drawable getOverflowButtonIcon() {
        return this.overflowButton.getIcon();
    }

    public int getOverflowMode() {
        return this.overflowMode;
    }

    @Nullable
    public ShapeAppearanceModel getShapeAppearance() {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.groupStateListShapeAppearance;
        if (stateListShapeAppearanceModel == null) {
            return null;
        }
        return stateListShapeAppearanceModel.getDefaultShape(true);
    }

    @Px
    public int getSpacing() {
        return this.spacing;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearance() {
        return this.groupStateListShapeAppearance;
    }

    public void initializeButtonOverflow(@NonNull Context context, @NonNull TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(C5183R.styleable.MaterialButtonGroup_overflowButtonIcon);
        MaterialButton materialButton = (MaterialButton) LayoutInflater.from(context).inflate(C5183R.layout.m3_button_group_overflow_button, (ViewGroup) this, false);
        this.overflowButton = materialButton;
        materialButton.setTag(OVERFLOW_BUTTON_TAG);
        setOverflowButtonIcon(drawable);
        if (this.overflowButton.getContentDescription() == null) {
            this.overflowButton.setContentDescription(getResources().getString(C5183R.string.mtrl_button_overflow_icon_content_description));
        }
        this.overflowButton.setVisibility(8);
        PopupMenu popupMenu = new PopupMenu(getContext(), this.overflowButton, 17, 0, MaterialAttributes.resolveOrThrow(this, C5183R.attr.materialButtonGroupPopupMenuStyle));
        this.popupMenu = popupMenu;
        popupMenu.setForceShowIcon(true);
        this.overflowButton.setOnClickListener(new ViewOnClickListenerC5240b(this, 0));
        addView(this.overflowButton);
        this.buttonOverflowInitialized = true;
    }

    public boolean isOverflowMenuSupported() {
        return true;
    }

    public void onButtonWidthChanged(@NonNull MaterialButton materialButton, int i2) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(iIndexOfChild, true);
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(iIndexOfChild, true);
        if (prevVisibleChildButton == null && nextVisibleChildButton == null) {
            return;
        }
        if (prevVisibleChildButton == null) {
            nextVisibleChildButton.setDisplayedWidthDecrease(i2);
        }
        if (nextVisibleChildButton == null) {
            prevVisibleChildButton.setDisplayedWidthDecrease(i2);
        }
        if (prevVisibleChildButton == null || nextVisibleChildButton == null) {
            return;
        }
        prevVisibleChildButton.setDisplayedWidthDecrease(i2 / 2);
        nextVisibleChildButton.setDisplayedWidthDecrease((i2 + 1) / 2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            recoverAllChildrenLayoutParams();
            adjustChildSizeChange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iMaybeWrapButtons;
        adjustChildMarginsAndUpdateLayout();
        if (this.overflowMode != 2) {
            iMaybeWrapButtons = 0;
        } else {
            if (getOrientation() == 1) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible to the vertical orientation.");
            }
            if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible with wrap_content layout width.");
            }
            iMaybeWrapButtons = maybeWrapButtons(i2, i3);
        }
        maybeUpdateOverflowMenu(i2, i3);
        updateChildShapes();
        super.onMeasure(i2, i3);
        if (this.overflowMode != 2 || iMaybeWrapButtons == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), iMaybeWrapButtons);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalChildShapeAppearanceModels.remove(iIndexOfChild);
        }
        this.childShapesDirty = true;
        updateChildShapes();
        recoverAllChildrenLayoutParams();
        adjustChildMarginsAndUpdateLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setButtonSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.buttonSizeChange != stateListSizeChange) {
            this.buttonSizeChange = stateListSizeChange;
            adjustChildSizeChange();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildButton(i2).setEnabled(z);
        }
    }

    public void setInnerCornerSize(@NonNull CornerSize cornerSize) {
        this.innerCornerSize = StateListCornerSize.create(cornerSize);
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInnerCornerSizeStateList(@NonNull StateListCornerSize stateListCornerSize) {
        this.innerCornerSize = stateListCornerSize;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (getOrientation() != i2) {
            this.childShapesDirty = true;
        }
        super.setOrientation(i2);
    }

    public void setOverflowButtonIcon(@Nullable Drawable drawable) {
        this.overflowButton.lambda$setSecondaryIcon$3(drawable);
    }

    public void setOverflowButtonIconResource(@DrawableRes int i2) {
        this.overflowButton.setIconResource(i2);
    }

    public void setOverflowMode(int i2) {
        if (this.overflowMode != i2) {
            this.overflowMode = i2;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(shapeAppearanceModel).build();
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setSpacing(@Px int i2) {
        this.spacing = i2;
        invalidate();
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearance(@Nullable StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.groupStateListShapeAppearance = stateListShapeAppearanceModel;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @VisibleForTesting
    public void updateChildShapes() {
        int iSwapCornerPositionRtl;
        if (!(this.innerCornerSize == null && this.groupStateListShapeAppearance == null) && this.childShapesDirty) {
            this.childShapesDirty = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton childButton = getChildButton(i2);
                if (childButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    StateListShapeAppearanceModel.Builder originalStateListShapeBuilder = getOriginalStateListShapeBuilder(z, z2, i2);
                    boolean z3 = getOrientation() == 0;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                    if (z3) {
                        iSwapCornerPositionRtl = z ? 5 : 0;
                        if (z2) {
                            iSwapCornerPositionRtl |= 10;
                        }
                        if (zIsLayoutRtl) {
                            iSwapCornerPositionRtl = StateListShapeAppearanceModel.swapCornerPositionRtl(iSwapCornerPositionRtl);
                        }
                    } else {
                        iSwapCornerPositionRtl = z ? 3 : 0;
                        if (z2) {
                            iSwapCornerPositionRtl |= 12;
                        }
                    }
                    StateListShapeAppearanceModel stateListShapeAppearanceModelBuild = originalStateListShapeBuilder.setCornerSizeOverride(this.innerCornerSize, ~iSwapCornerPositionRtl).build();
                    boolean zIsStateful = stateListShapeAppearanceModelBuild.isStateful();
                    StateListShapeAppearanceModel defaultShape = stateListShapeAppearanceModelBuild;
                    if (!zIsStateful) {
                        defaultShape = stateListShapeAppearanceModelBuild.getDefaultShape(true);
                    }
                    childButton.setShapeAppearance(defaultShape);
                }
                i2++;
            }
        }
    }

    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5183R.attr.materialButtonGroupStyle);
    }

    @Nullable
    private MaterialButton getNextVisibleChildButton(int i2, boolean z) {
        int childCount = getChildCount();
        int i3 = i2 + 1;
        while (true) {
            if (i3 >= childCount) {
                i3 = -1;
                break;
            }
            if (isChildVisible(i3)) {
                break;
            }
            i3++;
        }
        if (z && !this.rowButtonFirstIndices.isEmpty()) {
            int i4 = 0;
            while (i4 < this.rowButtonFirstIndices.size()) {
                int iIntValue = this.rowButtonFirstIndices.get(i4).intValue();
                int iIntValue2 = i4 == this.rowButtonFirstIndices.size() + (-1) ? childCount - 1 : this.rowButtonFirstIndices.get(i4 + 1).intValue() - 1;
                if (i2 >= iIntValue && i2 <= iIntValue2 && (i3 < iIntValue || i3 > iIntValue2)) {
                    return null;
                }
                i4++;
            }
        }
        if (i3 == -1) {
            return null;
        }
        return getChildButton(i3);
    }

    @Nullable
    private MaterialButton getPrevVisibleChildButton(int i2, boolean z) {
        int childCount = getChildCount();
        int i3 = i2 - 1;
        while (true) {
            if (i3 < 0) {
                i3 = -1;
                break;
            }
            if (isChildVisible(i3)) {
                break;
            }
            i3--;
        }
        if (z && !this.rowButtonFirstIndices.isEmpty()) {
            int i4 = 0;
            while (i4 < this.rowButtonFirstIndices.size()) {
                int iIntValue = this.rowButtonFirstIndices.get(i4).intValue();
                int iIntValue2 = i4 == this.rowButtonFirstIndices.size() + (-1) ? childCount : this.rowButtonFirstIndices.get(i4 + 1).intValue();
                if (i2 >= iIntValue && i2 < iIntValue2 && (i3 < iIntValue || i3 >= iIntValue2)) {
                    return null;
                }
                i4++;
            }
        }
        if (i3 == -1) {
            return null;
        }
        return getChildButton(i3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        this.overflowMode = 0;
        this.originalChildShapeAppearanceModels = new ArrayList();
        this.pressedStateTracker = new PressedStateTracker();
        this.childOrderComparator = new C5241c(this, 0);
        this.childShapesDirty = true;
        this.popupMenuItemToButtonMapping = new HashMap();
        this.buttonToMenuItemMapping = new HashMap();
        this.tempOverflowButtonsList = new ArrayList();
        this.overflowButtonsList = new ArrayList();
        this.rowButtonFirstIndices = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C5183R.styleable.MaterialButtonGroup, i2, i3, new int[0]);
        int i4 = C5183R.styleable.MaterialButtonGroup_buttonSizeChange;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.buttonSizeChange = StateListSizeChange.create(context2, typedArrayObtainStyledAttributes, i4);
        }
        int i5 = C5183R.styleable.MaterialButtonGroup_shapeAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            StateListShapeAppearanceModel stateListShapeAppearanceModelCreate = StateListShapeAppearanceModel.create(context2, typedArrayObtainStyledAttributes, i5);
            this.groupStateListShapeAppearance = stateListShapeAppearanceModelCreate;
            if (stateListShapeAppearanceModelCreate == null) {
                this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(i5, 0), typedArrayObtainStyledAttributes.getResourceId(C5183R.styleable.MaterialButtonGroup_shapeAppearanceOverlay, 0)).build()).build();
            }
        }
        int i6 = C5183R.styleable.MaterialButtonGroup_innerCornerSize;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            this.innerCornerSize = StateListCornerSize.create(context2, typedArrayObtainStyledAttributes, i6, new AbsoluteCornerSize(0.0f));
        }
        this.spacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5183R.styleable.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C5183R.styleable.MaterialButtonGroup_android_enabled, true));
        setOverflowMode(typedArrayObtainStyledAttributes.getInt(C5183R.styleable.MaterialButtonGroup_overflowMode, 0));
        this.overflowMenuItemIconPadding = getResources().getDimensionPixelOffset(C5183R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        if (isOverflowMenuSupported()) {
            initializeButtonOverflow(context2, typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NonNull
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NonNull
    public LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NonNull
    public LayoutParams generateLayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5183R.styleable.MaterialButtonGroup_Layout);
            this.overflowIcon = typedArrayObtainStyledAttributes.getDrawable(C5183R.styleable.MaterialButtonGroup_Layout_layout_overflowIcon);
            this.overflowText = typedArrayObtainStyledAttributes.getText(C5183R.styleable.MaterialButtonGroup_Layout_layout_overflowText);
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
