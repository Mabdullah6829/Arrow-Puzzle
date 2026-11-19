package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i2) {
        int i3;
        ChainHead[] chainHeadArr;
        int i4;
        if (i2 == 0) {
            i3 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i4 = 0;
        } else {
            i3 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i4 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i2, i4, chainHead);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
  0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
  0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x038a  */
    /* JADX WARN: Code duplicated, block: B:290:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:293:0x04be  */
    /* JADX WARN: Code duplicated, block: B:294:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:297:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:298:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:300:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:302:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:305:0x04de  */
    /* JADX WARN: Code duplicated, block: B:318:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.constraintlayout.core.SolverVariable] */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i2, int i3, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        ?? r0;
        LinearSystem linearSystem2;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i4;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        int i5;
        ConstraintAnchor[] constraintAnchorArr;
        int i6;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor5;
        Object obj;
        float f3;
        int size;
        ConstraintAnchor constraintAnchor6;
        int i7;
        int i8 = i2;
        ConstraintWidget constraintWidget = chainHead.mFirst;
        ConstraintWidget constraintWidget2 = chainHead.mLast;
        ConstraintWidget constraintWidget3 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget4 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget5 = chainHead.mHead;
        float f4 = chainHead.mTotalWeight;
        boolean z4 = constraintWidgetContainer.mListDimensionBehaviors[i8] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i8 == 0) {
            int i9 = constraintWidget5.mHorizontalChainStyle;
            z = i9 == 0;
            z2 = i9 == 1;
            if (i9 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i10 = constraintWidget5.mVerticalChainStyle;
            z = i10 == 0;
            z2 = i10 == 1;
            if (i10 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r14 = constraintWidget;
        boolean z5 = false;
        while (true) {
            f2 = f4;
            Object obj2 = null;
            if (z5) {
                break;
            }
            ConstraintAnchor constraintAnchor7 = r14.mListAnchors[i3];
            int i11 = z3 ? 1 : 4;
            int margin = constraintAnchor7.getMargin();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r14.mListDimensionBehaviors[i8];
            boolean z6 = z4;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z7 = dimensionBehaviour == dimensionBehaviour2 && r14.mResolvedMatchConstraintDefault[i8] == 0;
            boolean z8 = z3;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.mTarget;
            if (constraintAnchor8 != null && r14 != constraintWidget) {
                margin = constraintAnchor8.getMargin() + margin;
            }
            int i12 = margin;
            if (z8 && r14 != constraintWidget && r14 != constraintWidget3) {
                i11 = 8;
            }
            boolean z9 = z7;
            ConstraintAnchor constraintAnchor9 = constraintAnchor7.mTarget;
            if (constraintAnchor9 != null) {
                if (r14 == constraintWidget3) {
                    linearSystem.addGreaterThan(constraintAnchor7.mSolverVariable, constraintAnchor9.mSolverVariable, i12, 6);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor7.mSolverVariable, constraintAnchor9.mSolverVariable, i12, 8);
                }
                if (z9 && !z8) {
                    i11 = 5;
                }
                linearSystem.addEquality(constraintAnchor7.mSolverVariable, constraintAnchor7.mTarget.mSolverVariable, i12, (r14 == constraintWidget3 && z8 && r14.isInBarrier(i8)) ? 5 : i11);
            } else {
                z5 = z5;
                z = z;
            }
            if (z6) {
                if (r14.getVisibility() == 8 || r14.mListDimensionBehaviors[i8] != dimensionBehaviour2) {
                    i7 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr2 = r14.mListAnchors;
                    i7 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr2[i3 + 1].mSolverVariable, constraintAnchorArr2[i3].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r14.mListAnchors[i3].mSolverVariable, constraintWidgetContainer.mListAnchors[i3].mSolverVariable, i7, 8);
            }
            ConstraintAnchor constraintAnchor10 = r14.mListAnchors[i3 + 1].mTarget;
            if (constraintAnchor10 != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor10.mOwner;
                ConstraintAnchor constraintAnchor11 = constraintWidget6.mListAnchors[i3].mTarget;
                if (constraintAnchor11 != null && constraintAnchor11.mOwner == r14) {
                    obj2 = constraintWidget6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z5 = z5;
            } else {
                z5 = true;
            }
            f4 = f2;
            z4 = z6;
            z3 = z8;
            z = z;
            r14 = r14;
        }
        boolean z10 = z4;
        boolean z11 = z3;
        boolean z12 = z;
        if (constraintWidget4 != null) {
            int i13 = i3 + 1;
            if (constraintWidget2.mListAnchors[i13].mTarget != null) {
                ConstraintAnchor constraintAnchor12 = constraintWidget4.mListAnchors[i13];
                if (constraintWidget4.mListDimensionBehaviors[i8] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mResolvedMatchConstraintDefault[i8] == 0 && !z11) {
                    ConstraintAnchor constraintAnchor13 = constraintAnchor12.mTarget;
                    if (constraintAnchor13.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor13.mSolverVariable, -constraintAnchor12.getMargin(), 5);
                    } else if (z11) {
                        constraintAnchor6 = constraintAnchor12.mTarget;
                        if (constraintAnchor6.mOwner == constraintWidgetContainer) {
                            linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor6.mSolverVariable, -constraintAnchor12.getMargin(), 4);
                        }
                    }
                } else if (z11) {
                    constraintAnchor6 = constraintAnchor12.mTarget;
                    if (constraintAnchor6.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor6.mSolverVariable, -constraintAnchor12.getMargin(), 4);
                    }
                }
                linearSystem.addLowerThan(constraintAnchor12.mSolverVariable, constraintWidget2.mListAnchors[i13].mTarget.mSolverVariable, -constraintAnchor12.getMargin(), 6);
            }
        }
        if (z10) {
            int i14 = i3 + 1;
            SolverVariable solverVariable5 = constraintWidgetContainer.mListAnchors[i14].mSolverVariable;
            ConstraintAnchor constraintAnchor14 = constraintWidget2.mListAnchors[i14];
            linearSystem.addGreaterThan(solverVariable5, constraintAnchor14.mSolverVariable, constraintAnchor14.getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f2 : chainHead.mWidgetsMatchCount;
            float f6 = 0.0f;
            float f7 = 0.0f;
            ConstraintWidget constraintWidget7 = null;
            int i15 = 0;
            while (i15 < size) {
                ConstraintWidget constraintWidget8 = arrayList.get(i15);
                float f8 = constraintWidget8.mWeight[i8];
                if (f8 < f6) {
                    if (chainHead.mHasComplexMatchWeights) {
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget8.mListAnchors;
                        f6 = f6;
                        linearSystem.addEquality(constraintAnchorArr3[i3 + 1].mSolverVariable, constraintAnchorArr3[i3].mSolverVariable, 0, 4);
                    } else {
                        f8 = 1.0f;
                    }
                    arrayList = arrayList;
                    i15++;
                    f6 = f6;
                    arrayList = arrayList;
                }
                float f9 = f8;
                if (f9 == f6) {
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget8.mListAnchors;
                    linearSystem.addEquality(constraintAnchorArr4[i3 + 1].mSolverVariable, constraintAnchorArr4[i3].mSolverVariable, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (constraintWidget7 != null) {
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget7.mListAnchors;
                        SolverVariable solverVariable6 = constraintAnchorArr5[i3].mSolverVariable;
                        int i16 = i3 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr5[i16].mSolverVariable;
                        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget8.mListAnchors;
                        SolverVariable solverVariable8 = constraintAnchorArr6[i3].mSolverVariable;
                        SolverVariable solverVariable9 = constraintAnchorArr6[i16].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f7, f5, f9, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    constraintWidget7 = constraintWidget8;
                    f7 = f9;
                }
                i15++;
                f6 = f6;
                arrayList = arrayList;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z11)) {
            ConstraintAnchor constraintAnchor15 = constraintWidget.mListAnchors[i3];
            int i17 = i3 + 1;
            ConstraintAnchor constraintAnchor16 = constraintWidget2.mListAnchors[i17];
            ConstraintAnchor constraintAnchor17 = constraintAnchor15.mTarget;
            SolverVariable solverVariable10 = constraintAnchor17 != null ? constraintAnchor17.mSolverVariable : null;
            ConstraintAnchor constraintAnchor18 = constraintAnchor16.mTarget;
            SolverVariable solverVariable11 = constraintAnchor18 != null ? constraintAnchor18.mSolverVariable : null;
            ConstraintAnchor constraintAnchor19 = constraintWidget3.mListAnchors[i3];
            if (constraintWidget4 != null) {
                constraintAnchor16 = constraintWidget4.mListAnchors[i17];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                if (i8 == 0) {
                    f3 = constraintWidget5.mHorizontalBiasPercent;
                } else {
                    f3 = constraintWidget5.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor19.mSolverVariable, solverVariable10, constraintAnchor19.getMargin(), f3, solverVariable11, constraintAnchor16.mSolverVariable, constraintAnchor16.getMargin(), 7);
            }
        } else {
            if (!z12 || constraintWidget3 == null) {
                if (z2 && constraintWidget3 != null) {
                    int i18 = chainHead.mWidgetsMatchCount;
                    boolean z13 = i18 > 0 && chainHead.mWidgetsCount == i18;
                    ConstraintWidget constraintWidget9 = constraintWidget3;
                    ConstraintWidget constraintWidget10 = constraintWidget9;
                    while (constraintWidget9 != null) {
                        ConstraintWidget constraintWidget11 = constraintWidget9.mNextChainWidget[i2];
                        while (constraintWidget11 != null && constraintWidget11.getVisibility() == 8) {
                            constraintWidget11 = constraintWidget11.mNextChainWidget[i2];
                        }
                        if (constraintWidget9 != constraintWidget3 && constraintWidget9 != constraintWidget4 && constraintWidget11 != null) {
                            if (constraintWidget11 == constraintWidget4) {
                                constraintWidget11 = null;
                            }
                            ConstraintAnchor constraintAnchor20 = constraintWidget9.mListAnchors[i3];
                            SolverVariable solverVariable12 = constraintAnchor20.mSolverVariable;
                            ConstraintAnchor constraintAnchor21 = constraintAnchor20.mTarget;
                            if (constraintAnchor21 != null) {
                                SolverVariable solverVariable13 = constraintAnchor21.mSolverVariable;
                            }
                            int i19 = i3 + 1;
                            SolverVariable solverVariable14 = constraintWidget10.mListAnchors[i19].mSolverVariable;
                            int margin2 = constraintAnchor20.getMargin();
                            int margin3 = constraintWidget9.mListAnchors[i19].getMargin();
                            if (constraintWidget11 != null) {
                                constraintAnchor = constraintWidget11.mListAnchors[i3];
                                solverVariable = constraintAnchor.mSolverVariable;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor.mTarget;
                                solverVariable2 = constraintAnchor22 != null ? constraintAnchor22.mSolverVariable : null;
                            } else {
                                constraintAnchor = constraintWidget4.mListAnchors[i3];
                                solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                                solverVariable2 = constraintWidget9.mListAnchors[i19].mSolverVariable;
                            }
                            if (constraintAnchor != null) {
                                margin3 += constraintAnchor.getMargin();
                            }
                            int margin4 = constraintWidget10.mListAnchors[i19].getMargin() + margin2;
                            SolverVariable solverVariable15 = solverVariable2;
                            int i20 = z13 ? 8 : 4;
                            if (solverVariable12 != null && solverVariable14 != null && solverVariable != null && solverVariable15 != null) {
                                linearSystem.addCentering(solverVariable12, solverVariable14, margin4, 0.5f, solverVariable, solverVariable15, margin3, i20);
                            }
                            constraintWidget11 = constraintWidget11;
                        }
                        if (constraintWidget9.getVisibility() != 8) {
                            constraintWidget10 = constraintWidget9;
                        }
                        constraintWidget9 = constraintWidget11;
                    }
                    ConstraintAnchor constraintAnchor23 = constraintWidget3.mListAnchors[i3];
                    ConstraintAnchor constraintAnchor24 = constraintWidget.mListAnchors[i3].mTarget;
                    int i21 = i3 + 1;
                    ConstraintAnchor constraintAnchor25 = constraintWidget4.mListAnchors[i21];
                    ConstraintAnchor constraintAnchor26 = constraintWidget2.mListAnchors[i21].mTarget;
                    if (constraintAnchor24 == null) {
                        r0 = linearSystem;
                    } else {
                        if (constraintWidget3 != constraintWidget4) {
                            linearSystem.addEquality(constraintAnchor23.mSolverVariable, constraintAnchor24.mSolverVariable, constraintAnchor23.getMargin(), 5);
                        } else if (constraintAnchor26 != null) {
                            linearSystem2 = linearSystem;
                            linearSystem2.addCentering(constraintAnchor23.mSolverVariable, constraintAnchor24.mSolverVariable, constraintAnchor23.getMargin(), 0.5f, constraintAnchor25.mSolverVariable, constraintAnchor26.mSolverVariable, constraintAnchor25.getMargin(), 5);
                        }
                        r0 = linearSystem;
                    }
                    if (constraintAnchor26 != null && constraintWidget3 != constraintWidget4) {
                        r0.addEquality(constraintAnchor25.mSolverVariable, constraintAnchor26.mSolverVariable, -constraintAnchor25.getMargin(), 5);
                    }
                }
                if ((z12 && !z2) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
                    return;
                }
                constraintAnchorArr = constraintWidget3.mListAnchors;
                ConstraintAnchor constraintAnchor27 = constraintAnchorArr[i3];
                if (constraintWidget4 == null) {
                    constraintWidget4 = constraintWidget3;
                }
                i6 = i3 + 1;
                constraintAnchor3 = constraintWidget4.mListAnchors[i6];
                constraintAnchor4 = constraintAnchor27.mTarget;
                if (constraintAnchor4 != null) {
                    solverVariable4 = constraintAnchor4.mSolverVariable;
                } else {
                    solverVariable4 = null;
                }
                constraintAnchor5 = constraintAnchor3.mTarget;
                if (constraintAnchor5 != null) {
                    obj = constraintAnchor5.mSolverVariable;
                } else {
                    obj = null;
                }
                if (constraintWidget2 != constraintWidget4) {
                    ConstraintAnchor constraintAnchor28 = constraintWidget2.mListAnchors[i6].mTarget;
                    obj = constraintAnchor28 != null ? constraintAnchor28.mSolverVariable : null;
                }
                if (constraintWidget3 == constraintWidget4) {
                    constraintAnchor3 = constraintAnchorArr[i6];
                }
                if (solverVariable4 != null || obj == null) {
                }
                r0.addCentering(constraintAnchor27.mSolverVariable, solverVariable4, constraintAnchor27.getMargin(), 0.5f, obj, constraintAnchor3.mSolverVariable, constraintWidget4.mListAnchors[i6].getMargin(), 5);
                return;
            }
            int i22 = chainHead.mWidgetsMatchCount;
            boolean z14 = i22 > 0 && chainHead.mWidgetsCount == i22;
            ConstraintWidget constraintWidget12 = constraintWidget3;
            ConstraintWidget constraintWidget13 = constraintWidget12;
            while (constraintWidget12 != null) {
                ConstraintWidget constraintWidget14 = constraintWidget12.mNextChainWidget[i8];
                while (true) {
                    if (constraintWidget14 == null) {
                        i4 = 8;
                        break;
                    }
                    i4 = 8;
                    if (constraintWidget14.getVisibility() != 8) {
                        break;
                    } else {
                        constraintWidget14 = constraintWidget14.mNextChainWidget[i8];
                    }
                }
                if (constraintWidget14 != null || constraintWidget12 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor29 = constraintWidget12.mListAnchors[i3];
                    SolverVariable solverVariable16 = constraintAnchor29.mSolverVariable;
                    ConstraintAnchor constraintAnchor30 = constraintAnchor29.mTarget;
                    SolverVariable solverVariable17 = constraintAnchor30 != null ? constraintAnchor30.mSolverVariable : null;
                    if (constraintWidget13 != constraintWidget12) {
                        solverVariable17 = constraintWidget13.mListAnchors[i3 + 1].mSolverVariable;
                    } else if (constraintWidget12 == constraintWidget3) {
                        ConstraintAnchor constraintAnchor31 = constraintWidget.mListAnchors[i3].mTarget;
                        solverVariable17 = constraintAnchor31 != null ? constraintAnchor31.mSolverVariable : null;
                    }
                    int margin5 = constraintAnchor29.getMargin();
                    int i23 = i3 + 1;
                    int margin6 = constraintWidget12.mListAnchors[i23].getMargin();
                    if (constraintWidget14 != null) {
                        constraintAnchor2 = constraintWidget14.mListAnchors[i3];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget2.mListAnchors[i23].mTarget;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.mSolverVariable : null;
                    }
                    SolverVariable solverVariable18 = constraintWidget12.mListAnchors[i23].mSolverVariable;
                    if (constraintAnchor2 != null) {
                        margin6 += constraintAnchor2.getMargin();
                    }
                    int margin7 = constraintWidget13.mListAnchors[i23].getMargin() + margin5;
                    if (solverVariable16 == null || solverVariable17 == null || solverVariable3 == null || solverVariable18 == null) {
                        i5 = 8;
                    } else {
                        if (constraintWidget12 == constraintWidget3) {
                            margin7 = constraintWidget3.mListAnchors[i3].getMargin();
                        }
                        if (constraintWidget12 == constraintWidget4) {
                            margin6 = constraintWidget4.mListAnchors[i23].getMargin();
                        }
                        constraintWidget14 = constraintWidget14;
                        i5 = 8;
                        linearSystem.addCentering(solverVariable16, solverVariable17, margin7, 0.5f, solverVariable3, solverVariable18, margin6, z14 ? 8 : 5);
                    }
                    if (constraintWidget12.getVisibility() != i5) {
                        constraintWidget13 = constraintWidget12;
                    }
                    i8 = i2;
                    constraintWidget12 = constraintWidget14;
                } else {
                    i5 = i4;
                }
                if (constraintWidget12.getVisibility() != i5) {
                    constraintWidget13 = constraintWidget12;
                }
                i8 = i2;
                constraintWidget12 = constraintWidget14;
            }
        }
        r0 = linearSystem;
        if (z12) {
        }
        constraintAnchorArr = constraintWidget3.mListAnchors;
        ConstraintAnchor constraintAnchor210 = constraintAnchorArr[i3];
        if (constraintWidget4 == null) {
            constraintWidget4 = constraintWidget3;
        }
        i6 = i3 + 1;
        constraintAnchor3 = constraintWidget4.mListAnchors[i6];
        constraintAnchor4 = constraintAnchor210.mTarget;
        if (constraintAnchor4 != null) {
            solverVariable4 = constraintAnchor4.mSolverVariable;
        } else {
            solverVariable4 = null;
        }
        constraintAnchor5 = constraintAnchor3.mTarget;
        if (constraintAnchor5 != null) {
            obj = constraintAnchor5.mSolverVariable;
        } else {
            obj = null;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor211 = constraintWidget2.mListAnchors[i6].mTarget;
            obj = constraintAnchor211 != null ? constraintAnchor211.mSolverVariable : null;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor3 = constraintAnchorArr[i6];
        }
        if (solverVariable4 != null) {
        }
    }
}
