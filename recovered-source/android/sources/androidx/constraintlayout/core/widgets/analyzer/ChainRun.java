package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ChainRun extends WidgetRun {
    private int mChainStyle;
    ArrayList<WidgetRun> mWidgets;

    public ChainRun(ConstraintWidget constraintWidget, int i2) {
        super(constraintWidget);
        this.mWidgets = new ArrayList<>();
        this.orientation = i2;
        build();
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.mWidget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
            }
        }
        this.mWidget = constraintWidget;
        this.mWidgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.mWidgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        ArrayList<WidgetRun> arrayList = this.mWidgets;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            WidgetRun widgetRun = arrayList.get(i2);
            i2++;
            WidgetRun widgetRun2 = widgetRun;
            int i3 = this.orientation;
            if (i3 == 0) {
                widgetRun2.mWidget.horizontalChainRun = this;
            } else if (i3 == 1) {
                widgetRun2.mWidget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.mWidget.getParent()).isRtl() && this.mWidgets.size() > 1) {
            ArrayList<WidgetRun> arrayList2 = this.mWidgets;
            this.mWidget = arrayList2.get(arrayList2.size() - 1).mWidget;
        }
        this.mChainStyle = this.orientation == 0 ? this.mWidget.getHorizontalChainStyle() : this.mWidget.getVerticalChainStyle();
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i2 = 0; i2 < this.mWidgets.size(); i2++) {
            WidgetRun widgetRun = this.mWidgets.get(i2);
            if (widgetRun.mWidget.getVisibility() != 8) {
                return widgetRun.mWidget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.mWidgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.mWidgets.get(size);
            if (widgetRun.mWidget.getVisibility() != 8) {
                return widgetRun.mWidget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        ArrayList<WidgetRun> arrayList = this.mWidgets;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            WidgetRun widgetRun = arrayList.get(i2);
            i2++;
            widgetRun.apply();
        }
        int size2 = this.mWidgets.size();
        if (size2 < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.mWidgets.get(0).mWidget;
        ConstraintWidget constraintWidget2 = this.mWidgets.get(size2 - 1).mWidget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i2 = 0; i2 < this.mWidgets.size(); i2++) {
            this.mWidgets.get(i2).applyToWidget();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.mRunGroup = null;
        ArrayList<WidgetRun> arrayList = this.mWidgets;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            WidgetRun widgetRun = arrayList.get(i2);
            i2++;
            widgetRun.clear();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.mWidgets.size();
        long wrapDimension = 0;
        for (int i2 = 0; i2 < size; i2++) {
            WidgetRun widgetRun = this.mWidgets.get(i2);
            wrapDimension = ((long) widgetRun.end.mMargin) + widgetRun.getWrapDimension() + wrapDimension + ((long) widgetRun.start.mMargin);
        }
        return wrapDimension;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        int size = this.mWidgets.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.mWidgets.get(i2).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        ArrayList<WidgetRun> arrayList = this.mWidgets;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            WidgetRun widgetRun = arrayList.get(i2);
            i2++;
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int i2;
        int i3;
        boolean z;
        float f2;
        float f3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f4;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.mWidget.getParent();
            boolean zIsRtl = parent instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) parent).isRtl() : false;
            int i12 = this.end.value - this.start.value;
            int size = this.mWidgets.size();
            int i13 = 0;
            while (true) {
                i2 = -1;
                i3 = 8;
                if (i13 >= size) {
                    i13 = -1;
                    break;
                } else if (this.mWidgets.get(i13).mWidget.getVisibility() != 8) {
                    break;
                } else {
                    i13++;
                }
            }
            int i14 = size - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                if (this.mWidgets.get(i15).mWidget.getVisibility() != 8) {
                    i2 = i15;
                    break;
                }
            }
            int i16 = 0;
            while (true) {
                if (i16 >= 2) {
                    z = zIsRtl;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    break;
                }
                int i17 = 0;
                i5 = 0;
                i6 = 0;
                int i18 = 0;
                f3 = 0.0f;
                while (i17 < size) {
                    WidgetRun widgetRun = this.mWidgets.get(i17);
                    if (widgetRun.mWidget.getVisibility() == i3) {
                        z2 = zIsRtl;
                    } else {
                        i18++;
                        if (i17 > 0 && i17 >= i13) {
                            i5 += widgetRun.start.mMargin;
                        }
                        DimensionDependency dimensionDependency = widgetRun.mDimension;
                        int i19 = dimensionDependency.value;
                        boolean z3 = widgetRun.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z3) {
                            int i20 = this.orientation;
                            if (i20 == 0 && !widgetRun.mWidget.mHorizontalRun.mDimension.resolved) {
                                return;
                            }
                            if (i20 == 1 && !widgetRun.mWidget.mVerticalRun.mDimension.resolved) {
                                return;
                            } else {
                                z2 = zIsRtl;
                            }
                        } else {
                            z2 = zIsRtl;
                            if (widgetRun.matchConstraintsType == 1 && i16 == 0) {
                                i19 = dimensionDependency.wrapValue;
                                i6++;
                            } else if (dimensionDependency.resolved) {
                            }
                            z3 = true;
                        }
                        if (z3) {
                            i5 += i19;
                        } else {
                            i6++;
                            float f5 = widgetRun.mWidget.mWeight[this.orientation];
                            if (f5 >= 0.0f) {
                                f3 += f5;
                            }
                        }
                        if (i17 < i14 && i17 < i2) {
                            i5 += -widgetRun.end.mMargin;
                        }
                    }
                    i17++;
                    zIsRtl = z2;
                    i3 = 8;
                }
                z = zIsRtl;
                f2 = 0.0f;
                if (i5 < i12 || i6 == 0) {
                    i4 = i18;
                    break;
                } else {
                    i16++;
                    zIsRtl = z;
                    i3 = 8;
                }
            }
            int i21 = this.start.value;
            if (z) {
                i21 = this.end.value;
            }
            float f6 = 0.5f;
            if (i5 > i12) {
                i21 = z ? i21 + ((int) (((i5 - i12) / 2.0f) + 0.5f)) : i21 - ((int) (((i5 - i12) / 2.0f) + 0.5f));
            }
            if (i6 > 0) {
                float f7 = i12 - i5;
                int i22 = (int) ((f7 / i6) + 0.5f);
                int i23 = 0;
                int i24 = 0;
                while (i23 < size) {
                    WidgetRun widgetRun2 = this.mWidgets.get(i23);
                    float f8 = f6;
                    int i25 = i21;
                    if (widgetRun2.mWidget.getVisibility() != 8 && widgetRun2.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        DimensionDependency dimensionDependency2 = widgetRun2.mDimension;
                        if (dimensionDependency2.resolved) {
                            i22 = i22;
                            i24 = i24;
                        } else {
                            int i26 = f3 > f2 ? (int) (((widgetRun2.mWidget.mWeight[this.orientation] * f7) / f3) + f8) : i22;
                            if (this.orientation == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.mWidget;
                                i10 = constraintWidget.mMatchConstraintMaxWidth;
                                i11 = constraintWidget.mMatchConstraintMinWidth;
                            } else {
                                ConstraintWidget constraintWidget2 = widgetRun2.mWidget;
                                i10 = constraintWidget2.mMatchConstraintMaxHeight;
                                i11 = constraintWidget2.mMatchConstraintMinHeight;
                            }
                            int i27 = i24;
                            int iMax = Math.max(i11, widgetRun2.matchConstraintsType == 1 ? Math.min(i26, dimensionDependency2.wrapValue) : i26);
                            if (i10 > 0) {
                                iMax = Math.min(i10, iMax);
                            }
                            if (iMax != i26) {
                                i24 = i27 + 1;
                                i26 = iMax;
                            } else {
                                i24 = i27;
                            }
                            widgetRun2.mDimension.resolve(i26);
                        }
                    } else {
                        i22 = i22;
                        i24 = i24;
                    }
                    i23++;
                    f6 = f8;
                    i21 = i25;
                    f7 = f7;
                    i22 = i22;
                }
                i7 = i21;
                f4 = f6;
                int i28 = i24;
                if (i28 > 0) {
                    i6 -= i28;
                    i5 = 0;
                    for (int i29 = 0; i29 < size; i29++) {
                        WidgetRun widgetRun3 = this.mWidgets.get(i29);
                        if (widgetRun3.mWidget.getVisibility() != 8) {
                            if (i29 > 0 && i29 >= i13) {
                                i5 += widgetRun3.start.mMargin;
                            }
                            i5 += widgetRun3.mDimension.value;
                            if (i29 < i14 && i29 < i2) {
                                i5 += -widgetRun3.end.mMargin;
                            }
                        }
                    }
                }
                i9 = 2;
                if (this.mChainStyle == 2 && i28 == 0) {
                    i8 = 0;
                    this.mChainStyle = 0;
                } else {
                    i8 = 0;
                }
            } else {
                i7 = i21;
                f4 = 0.5f;
                i8 = 0;
                i9 = 2;
            }
            if (i5 > i12) {
                this.mChainStyle = i9;
            }
            if (i4 > 0 && i6 == 0 && i13 == i2) {
                this.mChainStyle = i9;
            }
            int i30 = this.mChainStyle;
            if (i30 == 1) {
                int i31 = i4 > 1 ? (i12 - i5) / (i4 - 1) : i4 == 1 ? (i12 - i5) / 2 : i8;
                if (i6 > 0) {
                    i31 = i8;
                }
                int i32 = i7;
                while (i8 < size) {
                    WidgetRun widgetRun4 = this.mWidgets.get(z ? size - (i8 + 1) : i8);
                    if (widgetRun4.mWidget.getVisibility() == 8) {
                        widgetRun4.start.resolve(i32);
                        widgetRun4.end.resolve(i32);
                    } else {
                        if (i8 > 0) {
                            i32 = z ? i32 - i31 : i32 + i31;
                        }
                        if (i8 > 0 && i8 >= i13) {
                            i32 = z ? i32 - widgetRun4.start.mMargin : i32 + widgetRun4.start.mMargin;
                        }
                        if (z) {
                            widgetRun4.end.resolve(i32);
                        } else {
                            widgetRun4.start.resolve(i32);
                        }
                        DimensionDependency dimensionDependency3 = widgetRun4.mDimension;
                        int i33 = dimensionDependency3.value;
                        if (widgetRun4.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i33 = dimensionDependency3.wrapValue;
                        }
                        i32 = z ? i32 - i33 : i32 + i33;
                        if (z) {
                            widgetRun4.start.resolve(i32);
                        } else {
                            widgetRun4.end.resolve(i32);
                        }
                        widgetRun4.mResolved = true;
                        if (i8 < i14 && i8 < i2) {
                            i32 = z ? i32 - (-widgetRun4.end.mMargin) : i32 + (-widgetRun4.end.mMargin);
                        }
                    }
                    i8++;
                }
                return;
            }
            if (i30 == 0) {
                int i34 = (i12 - i5) / (i4 + 1);
                if (i6 > 0) {
                    i34 = i8;
                }
                int i35 = i7;
                while (i8 < size) {
                    WidgetRun widgetRun5 = this.mWidgets.get(z ? size - (i8 + 1) : i8);
                    if (widgetRun5.mWidget.getVisibility() == 8) {
                        widgetRun5.start.resolve(i35);
                        widgetRun5.end.resolve(i35);
                    } else {
                        int i36 = z ? i35 - i34 : i35 + i34;
                        if (i8 > 0 && i8 >= i13) {
                            i36 = z ? i36 - widgetRun5.start.mMargin : i36 + widgetRun5.start.mMargin;
                        }
                        if (z) {
                            widgetRun5.end.resolve(i36);
                        } else {
                            widgetRun5.start.resolve(i36);
                        }
                        DimensionDependency dimensionDependency4 = widgetRun5.mDimension;
                        int iMin = dimensionDependency4.value;
                        if (widgetRun5.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            iMin = Math.min(iMin, dimensionDependency4.wrapValue);
                        }
                        i35 = z ? i36 - iMin : i36 + iMin;
                        if (z) {
                            widgetRun5.start.resolve(i35);
                        } else {
                            widgetRun5.end.resolve(i35);
                        }
                        if (i8 < i14 && i8 < i2) {
                            i35 = z ? i35 - (-widgetRun5.end.mMargin) : i35 + (-widgetRun5.end.mMargin);
                        }
                    }
                    i8++;
                }
                return;
            }
            if (i30 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.mWidget.getHorizontalBiasPercent() : this.mWidget.getVerticalBiasPercent();
                if (z) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i37 = (int) (((i12 - i5) * horizontalBiasPercent) + f4);
                if (i37 < 0 || i6 > 0) {
                    i37 = i8;
                }
                int i38 = z ? i7 - i37 : i7 + i37;
                while (i8 < size) {
                    WidgetRun widgetRun6 = this.mWidgets.get(z ? size - (i8 + 1) : i8);
                    if (widgetRun6.mWidget.getVisibility() == 8) {
                        widgetRun6.start.resolve(i38);
                        widgetRun6.end.resolve(i38);
                    } else {
                        if (i8 > 0 && i8 >= i13) {
                            i38 = z ? i38 - widgetRun6.start.mMargin : i38 + widgetRun6.start.mMargin;
                        }
                        if (z) {
                            widgetRun6.end.resolve(i38);
                        } else {
                            widgetRun6.start.resolve(i38);
                        }
                        DimensionDependency dimensionDependency5 = widgetRun6.mDimension;
                        int i39 = dimensionDependency5.value;
                        if (widgetRun6.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i39 = dimensionDependency5.wrapValue;
                        }
                        i38 = z ? i38 - i39 : i38 + i39;
                        if (z) {
                            widgetRun6.start.resolve(i38);
                        } else {
                            widgetRun6.end.resolve(i38);
                        }
                        if (i8 < i14 && i8 < i2) {
                            i38 = z ? i38 - (-widgetRun6.end.mMargin) : i38 + (-widgetRun6.end.mMargin);
                        }
                    }
                    i8++;
                }
            }
        }
    }
}
