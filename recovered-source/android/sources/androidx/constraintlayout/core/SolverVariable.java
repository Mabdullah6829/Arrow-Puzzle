package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    private static final boolean DO_NOT_USE = false;
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int sUniqueConstantId = 1;
    private static int sUniqueErrorId = 1;
    private static int sUniqueId = 1;
    private static int sUniqueSlackId = 1;
    private static int sUniqueUnrestrictedId = 1;
    public float computedValue;

    /* JADX INFO: renamed from: id */
    public int f2606id;
    public boolean inGoal;
    public boolean isFinalValue;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    int mDefinitionId;
    float[] mGoalStrengthVector;
    HashSet<ArrayRow> mInRows;
    boolean mIsSynonym;
    private String mName;
    float[] mStrengthVector;
    int mSynonym;
    float mSynonymDelta;
    Type mType;
    public int strength;
    public int usageInRowCount;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, Type type) {
        this.f2606id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        if (str != null) {
            StringBuilder sbM408p = AbstractC0271e0.m408p(str);
            sbM408p.append(sUniqueErrorId);
            return sbM408p.toString();
        }
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            StringBuilder sb = new StringBuilder("U");
            int i2 = sUniqueUnrestrictedId + 1;
            sUniqueUnrestrictedId = i2;
            sb.append(i2);
            return sb.toString();
        }
        if (iOrdinal == 1) {
            StringBuilder sb2 = new StringBuilder("C");
            int i3 = sUniqueConstantId + 1;
            sUniqueConstantId = i3;
            sb2.append(i3);
            return sb2.toString();
        }
        if (iOrdinal == 2) {
            StringBuilder sb3 = new StringBuilder("S");
            int i4 = sUniqueSlackId + 1;
            sUniqueSlackId = i4;
            sb3.append(i4);
            return sb3.toString();
        }
        if (iOrdinal == 3) {
            StringBuilder sb4 = new StringBuilder("e");
            int i5 = sUniqueErrorId + 1;
            sUniqueErrorId = i5;
            sb4.append(i5);
            return sb4.toString();
        }
        if (iOrdinal != 4) {
            throw new AssertionError(type.name());
        }
        StringBuilder sb5 = new StringBuilder("V");
        int i6 = sUniqueId + 1;
        sUniqueId = i6;
        sb5.append(i6);
        return sb5.toString();
    }

    public static void increaseErrorId() {
        sUniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i2 = 0;
        while (true) {
            int i3 = this.mClientEquationsCount;
            if (i2 >= i3) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i3 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i4 = this.mClientEquationsCount;
                arrayRowArr2[i4] = arrayRow;
                this.mClientEquationsCount = i4 + 1;
                return;
            }
            if (this.mClientEquations[i2] == arrayRow) {
                return;
            } else {
                i2++;
            }
        }
    }

    public void clearStrengths() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.mStrengthVector[i2] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i2 = this.mClientEquationsCount;
        int i3 = 0;
        while (i3 < i2) {
            if (this.mClientEquations[i3] == arrayRow) {
                while (i3 < i2 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i4 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.mClientEquationsCount--;
                return;
            }
            i3++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.f2606id = -1;
        this.mDefinitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i2 = this.mClientEquationsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f2) {
        this.computedValue = f2;
        this.isFinalValue = true;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i2 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f2) {
        this.mIsSynonym = true;
        this.mSynonym = solverVariable.f2606id;
        this.mSynonymDelta = f2;
        int i2 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        String strM414v = this + "[";
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        while (i2 < this.mStrengthVector.length) {
            StringBuilder sbM408p = AbstractC0271e0.m408p(strM414v);
            sbM408p.append(this.mStrengthVector[i2]);
            String string = sbM408p.toString();
            float[] fArr = this.mStrengthVector;
            float f2 = fArr[i2];
            if (f2 > 0.0f) {
                z = false;
            } else if (f2 < 0.0f) {
                z = true;
            }
            if (f2 != 0.0f) {
                z2 = false;
            }
            strM414v = i2 < fArr.length - 1 ? AbstractC0271e0.m414v(string, ", ") : AbstractC0271e0.m414v(string, "] ");
            i2++;
        }
        if (z) {
            strM414v = AbstractC0271e0.m414v(strM414v, " (-)");
        }
        return z2 ? AbstractC0271e0.m414v(strM414v, " (*)") : strM414v;
    }

    public String toString() {
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.f2606id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i2 = this.mClientEquationsCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.mClientEquations[i3].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f2606id - solverVariable.f2606id;
    }

    public SolverVariable(Type type, String str) {
        this.f2606id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mType = type;
    }
}
