package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class KeyPositions extends Keys {
    private int[] mFrames;
    private String[] mTarget;
    private String mTransitionEasing = null;
    private Type mPositionType = null;
    private float[] mPercentWidth = null;
    private float[] mPercentHeight = null;
    private float[] mPercentX = null;
    private float[] mPercentY = null;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPositions(int i2, String... strArr) {
        this.mFrames = null;
        this.mTarget = strArr;
        int[] iArr = new int[i2];
        this.mFrames = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.mFrames;
            if (i3 >= iArr2.length) {
                return;
            }
            iArr2[i3] = (int) ((i3 * length) + length);
            i3++;
        }
    }

    public int[] getFrames() {
        return this.mFrames;
    }

    public float[] getPercentHeight() {
        return this.mPercentHeight;
    }

    public float[] getPercentWidth() {
        return this.mPercentWidth;
    }

    public float[] getPercentX() {
        return this.mPercentX;
    }

    public float[] getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String[] getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int... iArr) {
        this.mFrames = iArr;
    }

    public void setPercentHeight(float... fArr) {
        this.mPercentHeight = fArr;
    }

    public void setPercentWidth(float... fArr) {
        this.mPercentWidth = fArr;
    }

    public void setPercentX(float... fArr) {
        this.mPercentX = fArr;
    }

    public void setPercentY(float... fArr) {
        this.mPercentY = fArr;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder sbM408p = AbstractC0271e0.m408p("KeyPositions:{\n");
        append(sbM408p, TypedValues.AttributesType.S_TARGET, this.mTarget);
        sbM408p.append("frame:");
        sbM408p.append(Arrays.toString(this.mFrames));
        sbM408p.append(",\n");
        if (this.mPositionType != null) {
            sbM408p.append("type:'");
            sbM408p.append(this.mPositionType);
            sbM408p.append("',\n");
        }
        append(sbM408p, "easing", this.mTransitionEasing);
        append(sbM408p, "percentX", this.mPercentX);
        append(sbM408p, "percentX", this.mPercentY);
        append(sbM408p, "percentWidth", this.mPercentWidth);
        append(sbM408p, "percentHeight", this.mPercentHeight);
        sbM408p.append("},\n");
        return sbM408p.toString();
    }
}
