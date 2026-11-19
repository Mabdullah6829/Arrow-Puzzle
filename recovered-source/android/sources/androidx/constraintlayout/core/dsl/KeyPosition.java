package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class KeyPosition extends Keys {
    private int mFrame;
    private String mTarget;
    private String mTransitionEasing = null;
    private float mPercentWidth = Float.NaN;
    private float mPercentHeight = Float.NaN;
    private float mPercentX = Float.NaN;
    private float mPercentY = Float.NaN;
    private Type mPositionType = Type.CARTESIAN;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPosition(String str, int i2) {
        this.mTarget = null;
        this.mFrame = 0;
        this.mTarget = str;
        this.mFrame = i2;
    }

    public int getFrames() {
        return this.mFrame;
    }

    public float getPercentHeight() {
        return this.mPercentHeight;
    }

    public float getPercentWidth() {
        return this.mPercentWidth;
    }

    public float getPercentX() {
        return this.mPercentX;
    }

    public float getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int i2) {
        this.mFrame = i2;
    }

    public void setPercentHeight(float f2) {
        this.mPercentHeight = f2;
    }

    public void setPercentWidth(float f2) {
        this.mPercentWidth = f2;
    }

    public void setPercentX(float f2) {
        this.mPercentX = f2;
    }

    public void setPercentY(float f2) {
        this.mPercentY = f2;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTarget(String str) {
        this.mTarget = str;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder sbM408p = AbstractC0271e0.m408p("KeyPositions:{\n");
        append(sbM408p, TypedValues.AttributesType.S_TARGET, this.mTarget);
        sbM408p.append("frame:");
        sbM408p.append(this.mFrame);
        sbM408p.append(",\n");
        if (this.mPositionType != null) {
            sbM408p.append("type:'");
            sbM408p.append(this.mPositionType);
            sbM408p.append("',\n");
        }
        append(sbM408p, "easing", this.mTransitionEasing);
        append(sbM408p, "percentX", this.mPercentX);
        append(sbM408p, "percentY", this.mPercentY);
        append(sbM408p, "percentWidth", this.mPercentWidth);
        append(sbM408p, "percentHeight", this.mPercentHeight);
        sbM408p.append("},\n");
        return sbM408p.toString();
    }
}
