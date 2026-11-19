package androidx.constraintlayout.core.utils;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class GridCore extends VirtualLayout {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int SPANS_RESPECT_WIDGET_ORDER = 2;
    public static final int SUB_GRID_BY_COL_ROW = 1;
    public static final int VERTICAL = 1;
    private ConstraintWidget[] mBoxWidgets;
    private String mColumnWeights;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    ConstraintWidgetContainer mContainer;
    private int mFlags;
    private float mHorizontalGaps;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private String mRowWeights;
    private int mRows;
    private int mRowsSet;
    private String mSkips;
    private int[][] mSpanMatrix;
    private String mSpans;
    private float mVerticalGaps;
    private boolean mExtraSpaceHandled = false;
    private int mNextAvailableIndex = 0;
    Set<String> mSpanIds = new HashSet();
    private int mSpanIndex = 0;

    public GridCore() {
        updateActualRowsAndColumns();
        initMatrices();
    }

    private void addConstraints() {
        setBoxWidgetVerticalChains();
        setBoxWidgetHorizontalChains();
        arrangeWidgets();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    private void arrangeWidgets() {
        int[][] iArr;
        int i2;
        for (int i3 = 0; i3 < this.mWidgetsCount; i3++) {
            if (!this.mSpanIds.contains(this.mWidgets[i3].stringId)) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return;
                }
                if (!isSpansRespectWidgetOrder() || (iArr = this.mSpanMatrix) == null || (i2 = this.mSpanIndex) >= iArr.length) {
                    connectWidget(this.mWidgets[i3], rowByIndex, colByIndex, 1, 1);
                } else {
                    int[] iArr2 = iArr[i2];
                    if (iArr2[0] == nextPosition) {
                        this.mPositionMatrix[rowByIndex][colByIndex] = true;
                        if (invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget = this.mWidgets[i3];
                            int[] iArr3 = this.mSpanMatrix[this.mSpanIndex];
                            connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
                            this.mSpanIndex++;
                        }
                    } else {
                        connectWidget(this.mWidgets[i3], rowByIndex, colByIndex, 1, 1);
                    }
                }
            }
        }
    }

    private void clearHorizontalAttributes(ConstraintWidget constraintWidget) {
        constraintWidget.setHorizontalWeight(-1.0f);
        constraintWidget.mLeft.reset();
        constraintWidget.mRight.reset();
    }

    private void clearVerticalAttributes(ConstraintWidget constraintWidget) {
        constraintWidget.setVerticalWeight(-1.0f);
        constraintWidget.mTop.reset();
        constraintWidget.mBottom.reset();
        constraintWidget.mBaseline.reset();
    }

    private void connectWidget(ConstraintWidget constraintWidget, int i2, int i3, int i4, int i5) {
        constraintWidget.mLeft.connect(this.mBoxWidgets[i3].mLeft, 0);
        constraintWidget.mTop.connect(this.mBoxWidgets[i2].mTop, 0);
        constraintWidget.mRight.connect(this.mBoxWidgets[(i3 + i5) - 1].mRight, 0);
        constraintWidget.mBottom.connect(this.mBoxWidgets[(i2 + i4) - 1].mBottom, 0);
    }

    private void createBoxes() {
        int iMax = Math.max(this.mRows, this.mColumns);
        ConstraintWidget[] constraintWidgetArr = this.mBoxWidgets;
        int i2 = 0;
        if (constraintWidgetArr == null) {
            this.mBoxWidgets = new ConstraintWidget[iMax];
            while (true) {
                ConstraintWidget[] constraintWidgetArr2 = this.mBoxWidgets;
                if (i2 >= constraintWidgetArr2.length) {
                    return;
                }
                constraintWidgetArr2[i2] = makeNewWidget();
                i2++;
            }
        } else {
            if (iMax == constraintWidgetArr.length) {
                return;
            }
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[iMax];
            while (i2 < iMax) {
                ConstraintWidget[] constraintWidgetArr4 = this.mBoxWidgets;
                if (i2 < constraintWidgetArr4.length) {
                    constraintWidgetArr3[i2] = constraintWidgetArr4[i2];
                } else {
                    constraintWidgetArr3[i2] = makeNewWidget();
                }
                i2++;
            }
            while (true) {
                ConstraintWidget[] constraintWidgetArr5 = this.mBoxWidgets;
                if (iMax >= constraintWidgetArr5.length) {
                    this.mBoxWidgets = constraintWidgetArr3;
                    return;
                } else {
                    this.mContainer.remove(constraintWidgetArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private void fillConstraintMatrix(boolean z) {
        int[][] spans;
        int[][] spans2;
        if (z) {
            for (int i2 = 0; i2 < this.mPositionMatrix.length; i2++) {
                int i3 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i3 < zArr[0].length) {
                        zArr[i2][i3] = true;
                        i3++;
                    }
                }
            }
            for (int i4 = 0; i4 < this.mConstraintMatrix.length; i4++) {
                int i5 = 0;
                while (true) {
                    int[][] iArr = this.mConstraintMatrix;
                    if (i5 < iArr[0].length) {
                        iArr[i4][i5] = -1;
                        i5++;
                    }
                }
            }
        }
        this.mNextAvailableIndex = 0;
        String str = this.mSkips;
        if (str != null && !str.trim().isEmpty() && (spans2 = parseSpans(this.mSkips, false)) != null) {
            handleSkips(spans2);
        }
        String str2 = this.mSpans;
        if (str2 == null || str2.trim().isEmpty() || (spans = parseSpans(this.mSpans, true)) == null) {
            return;
        }
        handleSpans(spans);
    }

    private int getColByIndex(int i2) {
        return this.mOrientation == 1 ? i2 / this.mRows : i2 % this.mColumns;
    }

    private int getNextPosition() {
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2 = this.mNextAvailableIndex;
            if (i2 >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i2);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z = true;
            }
            this.mNextAvailableIndex++;
        }
        return i2;
    }

    private int getRowByIndex(int i2) {
        return this.mOrientation == 1 ? i2 % this.mRows : i2 / this.mColumns;
    }

    private void handleSkips(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!invalidatePositions(getRowByIndex(iArr2[0]), getColByIndex(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void handleSpans(int[][] iArr) {
        if (!isSpansRespectWidgetOrder()) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int rowByIndex = getRowByIndex(iArr[i2][0]);
                int colByIndex = getColByIndex(iArr[i2][0]);
                int[] iArr2 = iArr[i2];
                if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                    break;
                }
                ConstraintWidget constraintWidget = this.mWidgets[i2];
                int[] iArr3 = iArr[i2];
                connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
                this.mSpanIds.add(this.mWidgets[i2].stringId);
            }
        }
    }

    private void initMatrices() {
        boolean[][] zArr;
        int[][] iArr = this.mConstraintMatrix;
        boolean z = false;
        if (iArr != null && iArr.length == this.mWidgetsCount && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z = true;
        }
        if (!z) {
            initVariables();
        }
        fillConstraintMatrix(z);
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i2 = this.mWidgetsCount;
        if (i2 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean invalidatePositions(int i2, int i3, int i4, int i5) {
        for (int i6 = i2; i6 < i2 + i4; i6++) {
            for (int i7 = i3; i7 < i3 + i5; i7++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i6 < zArr.length && i7 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i6];
                    if (zArr2[i7]) {
                        zArr2[i7] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isSpansRespectWidgetOrder() {
        return (this.mFlags & 2) > 0;
    }

    private boolean isSubGridByColRow() {
        return (this.mFlags & 1) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$parseSpans$0(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private ConstraintWidget makeNewWidget() {
        ConstraintWidget constraintWidget = new ConstraintWidget();
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        constraintWidget.stringId = String.valueOf(constraintWidget.hashCode());
        return constraintWidget;
    }

    private int[][] parseSpans(String str, boolean z) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new C1110a(0));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.mRows != 1 && this.mColumns != 1) {
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    String[] strArrSplit2 = strArrSplit[i2].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i2][0] = Integer.parseInt(strArrSplit2[0]);
                    if (isSubGridByColRow()) {
                        iArr[i2][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i2][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i2][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i2][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                String[] strArrSplit4 = strArrSplit[i5].trim().split(":");
                iArr[i5][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i5];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.mColumns == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i3 += iArr[i5][1];
                    if (z) {
                        i3--;
                    }
                }
                if (this.mRows == 1) {
                    iArr[i5][2] = Integer.parseInt(strArrSplit4[1]);
                    i4 += iArr[i5][2];
                    if (z) {
                        i4--;
                    }
                }
            }
            if (i3 != 0 && !this.mExtraSpaceHandled) {
                setRows(this.mRows + i3);
            }
            if (i4 != 0 && !this.mExtraSpaceHandled) {
                setColumns(this.mColumns + i4);
            }
            this.mExtraSpaceHandled = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] parseWeights(int i2, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 < strArrSplit.length) {
                try {
                    fArr[i3] = Float.parseFloat(strArrSplit[i3]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i3] + "`: " + e.getMessage());
                    fArr[i3] = 1.0f;
                }
            } else {
                fArr[i3] = 1.0f;
            }
        }
        return fArr;
    }

    private void setBoxWidgetHorizontalChains() {
        int i2;
        int iMax = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] weights = parseWeights(this.mColumns, this.mColumnWeights);
        if (this.mColumns == 1) {
            clearHorizontalAttributes(constraintWidget);
            constraintWidget.mLeft.connect(this.mLeft, 0);
            constraintWidget.mRight.connect(this.mRight, 0);
            return;
        }
        int i3 = 0;
        while (true) {
            i2 = this.mColumns;
            if (i3 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.mBoxWidgets[i3];
            clearHorizontalAttributes(constraintWidget2);
            if (weights != null) {
                constraintWidget2.setHorizontalWeight(weights[i3]);
            }
            if (i3 > 0) {
                constraintWidget2.mLeft.connect(this.mBoxWidgets[i3 - 1].mRight, 0);
            } else {
                constraintWidget2.mLeft.connect(this.mLeft, 0);
            }
            if (i3 < this.mColumns - 1) {
                constraintWidget2.mRight.connect(this.mBoxWidgets[i3 + 1].mLeft, 0);
            } else {
                constraintWidget2.mRight.connect(this.mRight, 0);
            }
            if (i3 > 0) {
                constraintWidget2.mLeft.mMargin = (int) this.mHorizontalGaps;
            }
            i3++;
        }
        while (i2 < iMax) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i2];
            clearHorizontalAttributes(constraintWidget3);
            constraintWidget3.mLeft.connect(this.mLeft, 0);
            constraintWidget3.mRight.connect(this.mRight, 0);
            i2++;
        }
    }

    private void setBoxWidgetVerticalChains() {
        int i2;
        int iMax = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] weights = parseWeights(this.mRows, this.mRowWeights);
        if (this.mRows == 1) {
            clearVerticalAttributes(constraintWidget);
            constraintWidget.mTop.connect(this.mTop, 0);
            constraintWidget.mBottom.connect(this.mBottom, 0);
            return;
        }
        int i3 = 0;
        while (true) {
            i2 = this.mRows;
            if (i3 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.mBoxWidgets[i3];
            clearVerticalAttributes(constraintWidget2);
            if (weights != null) {
                constraintWidget2.setVerticalWeight(weights[i3]);
            }
            if (i3 > 0) {
                constraintWidget2.mTop.connect(this.mBoxWidgets[i3 - 1].mBottom, 0);
            } else {
                constraintWidget2.mTop.connect(this.mTop, 0);
            }
            if (i3 < this.mRows - 1) {
                constraintWidget2.mBottom.connect(this.mBoxWidgets[i3 + 1].mTop, 0);
            } else {
                constraintWidget2.mBottom.connect(this.mBottom, 0);
            }
            if (i3 > 0) {
                constraintWidget2.mTop.mMargin = (int) this.mVerticalGaps;
            }
            i3++;
        }
        while (i2 < iMax) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i2];
            clearVerticalAttributes(constraintWidget3);
            constraintWidget3.mTop.connect(this.mTop, 0);
            constraintWidget3.mBottom.connect(this.mBottom, 0);
            i2++;
        }
    }

    private void setupGrid(boolean z) {
        int[][] spans;
        if (this.mRows < 1 || this.mColumns < 1) {
            return;
        }
        if (z) {
            for (int i2 = 0; i2 < this.mPositionMatrix.length; i2++) {
                int i3 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i3 < zArr[0].length) {
                        zArr[i2][i3] = true;
                        i3++;
                    }
                }
            }
            this.mSpanIds.clear();
        }
        this.mNextAvailableIndex = 0;
        String str = this.mSkips;
        if (str != null && !str.trim().isEmpty() && (spans = parseSpans(this.mSkips, false)) != null) {
            handleSkips(spans);
        }
        String str2 = this.mSpans;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.mSpanMatrix = parseSpans(this.mSpans, true);
        }
        createBoxes();
        int[][] iArr = this.mSpanMatrix;
        if (iArr != null) {
            handleSpans(iArr);
        }
    }

    private void updateActualRowsAndColumns() {
        int i2;
        int i3 = this.mRowsSet;
        if (i3 != 0 && (i2 = this.mColumnsSet) != 0) {
            this.mRows = i3;
            this.mColumns = i2;
            return;
        }
        int i4 = this.mColumnsSet;
        if (i4 > 0) {
            this.mColumns = i4;
            this.mRows = ((this.mWidgetsCount + i4) - 1) / i4;
        } else if (i3 > 0) {
            this.mRows = i3;
            this.mColumns = ((this.mWidgetsCount + i3) - 1) / i3;
        } else {
            int iSqrt = (int) (Math.sqrt(this.mWidgetsCount) + 1.5d);
            this.mRows = iSqrt;
            this.mColumns = ((this.mWidgetsCount + iSqrt) - 1) / iSqrt;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        addConstraints();
    }

    public String getColumnWeights() {
        return this.mColumnWeights;
    }

    public ConstraintWidgetContainer getContainer() {
        return this.mContainer;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public String getRowWeights() {
        return this.mRowWeights;
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i2, int i3, int i4, int i5) {
        super.measure(i2, i3, i4, i5);
        this.mContainer = (ConstraintWidgetContainer) getParent();
        setupGrid(false);
        this.mContainer.add(this.mBoxWidgets);
    }

    public void setColumnWeights(String str) {
        String str2 = this.mColumnWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mColumnWeights = str;
        }
    }

    public void setColumns(int i2) {
        if (i2 <= 50 && this.mColumnsSet != i2) {
            this.mColumnsSet = i2;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setContainer(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mContainer = constraintWidgetContainer;
    }

    public void setFlags(int i2) {
        this.mFlags = i2;
    }

    public void setHorizontalGaps(float f2) {
        if (f2 >= 0.0f && this.mHorizontalGaps != f2) {
            this.mHorizontalGaps = f2;
        }
    }

    public void setOrientation(int i2) {
        if ((i2 == 0 || i2 == 1) && this.mOrientation != i2) {
            this.mOrientation = i2;
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.mRowWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mRowWeights = str;
        }
    }

    public void setRows(int i2) {
        if (i2 <= 50 && this.mRowsSet != i2) {
            this.mRowsSet = i2;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setSkips(String str) {
        String str2 = this.mSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mExtraSpaceHandled = false;
            this.mSkips = str;
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.mSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mExtraSpaceHandled = false;
            this.mSpans = charSequence.toString();
        }
    }

    public void setVerticalGaps(float f2) {
        if (f2 >= 0.0f && this.mVerticalGaps != f2) {
            this.mVerticalGaps = f2;
        }
    }

    public GridCore(int i2, int i3) {
        this.mRowsSet = i2;
        this.mColumnsSet = i3;
        if (i2 > 50) {
            this.mRowsSet = 3;
        }
        if (i3 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initMatrices();
    }
}
