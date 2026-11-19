package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    LinkedHashMap<String, ConstraintAttribute> mAttributes;
    float mHeight;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPosition;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;

    /* JADX INFO: renamed from: mX */
    float f2641mX;

    /* JADX INFO: renamed from: mY */
    float f2642mY;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i2 = Key.UNSET;
        this.mPathMotionArc = i2;
        this.mAnimateRelativeTo = i2;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            return Float.isNaN(f2) != Float.isNaN(f3);
        }
        return Math.abs(f2 - f3) > 1.0E-6f;
    }

    private static float xRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return (((f6 - f4) * f3) - ((f7 - f5) * f2)) + f4;
    }

    private static float yRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return ((f7 - f5) * f3) + ((f6 - f4) * f2) + f5;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController motionController) {
        motionController.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        boolean zDiff = diff(this.f2641mX, motionPaths.f2641mX);
        boolean zDiff2 = diff(this.f2642mY, motionPaths.f2642mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z2 = zDiff | zDiff2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.f2641mX, this.f2642mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 < 6) {
                dArr[i2] = fArr[i3];
                i2++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f2 = this.mWidth;
        float f3 = this.mHeight;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        fArr[i2] = f2;
        fArr[i2 + 1] = f3;
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fM393a = this.f2641mX;
        float fCos = this.f2642mY;
        float f2 = this.mWidth;
        float f3 = this.mHeight;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fM393a = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d2 = fM393a;
            double d3 = fCos;
            fM393a = (float) (AbstractC0271e0.m393a(d3, d2, f5) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
        }
        fArr[i2] = (f2 / 2.0f) + fM393a + 0.0f;
        fArr[i2 + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    public void getCenterVelocity(double d, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fM393a = this.f2641mX;
        float fCos = this.f2642mY;
        float f2 = this.mWidth;
        float f3 = this.mHeight;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fM393a = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d2 = fM393a;
            double d3 = fCos;
            fM393a = (float) (AbstractC0271e0.m393a(d3, d2, f5) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
        }
        fArr[i2] = (f2 / 2.0f) + fM393a + 0.0f;
        fArr[i2 + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i2) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        int i3 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i2] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        while (i3 < iNumberOfInterpolatedValues) {
            dArr[i2] = fArr[i3];
            i3++;
            i2++;
        }
        return iNumberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fM393a = this.f2641mX;
        float fCos = this.f2642mY;
        float f2 = this.mWidth;
        float f3 = this.mHeight;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fM393a = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d = fM393a;
            double d2 = fCos;
            fM393a = (float) (AbstractC0271e0.m393a(d2, d, centerX) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) centerY) - (Math.cos(d2) * d)) - ((double) (f3 / 2.0f)));
        }
        float f5 = f2 + fM393a;
        float f6 = f3 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i2] = fM393a + 0.0f;
        fArr[i2 + 1] = fCos + 0.0f;
        fArr[i2 + 2] = f5 + 0.0f;
        fArr[i2 + 3] = fCos + 0.0f;
        fArr[i2 + 4] = f5 + 0.0f;
        fArr[i2 + 5] = f6 + 0.0f;
        fArr[i2 + 6] = fM393a + 0.0f;
        fArr[i2 + 7] = f6 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    public void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.mWidth;
        float f6 = motionPaths.mWidth;
        float f7 = f5 - f6;
        float f8 = motionPaths2.mHeight;
        float f9 = motionPaths.mHeight;
        float f10 = f8 - f9;
        this.mPosition = this.mTime;
        float f11 = motionPaths.f2641mX;
        float f12 = (f6 / 2.0f) + f11;
        float f13 = motionPaths.f2642mY;
        float f14 = (f9 / 2.0f) + f13;
        float f15 = f2;
        float f16 = (f5 / 2.0f) + motionPaths2.f2641mX;
        float f17 = (f8 / 2.0f) + motionPaths2.f2642mY;
        if (f12 > f16) {
            f12 = f16;
            f16 = f12;
        }
        if (f14 <= f17) {
            f14 = f17;
            f17 = f14;
        }
        float f18 = f16 - f12;
        float f19 = f14 - f17;
        float f20 = f7 * f3;
        float f21 = f20 / 2.0f;
        this.f2641mX = (int) (((f18 * f15) + f11) - f21);
        float f22 = f10 * f4;
        float f23 = f22 / 2.0f;
        this.f2642mY = (int) (((f19 * f15) + f13) - f23);
        this.mWidth = (int) (f6 + f20);
        this.mHeight = (int) (f9 + f22);
        float f24 = Float.isNaN(keyPosition.mPercentX) ? f15 : keyPosition.mPercentX;
        float f25 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f15 = keyPosition.mPercentY;
        }
        float f26 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f2641mX = (int) (((f26 * f19) + ((f24 * f18) + motionPaths.f2641mX)) - f21);
        this.f2642mY = (int) (((f19 * f15) + ((f18 * f25) + motionPaths.f2642mY)) - f23);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.mWidth;
        float f6 = motionPaths.mWidth;
        float f7 = f5 - f6;
        float f8 = motionPaths2.mHeight;
        float f9 = motionPaths.mHeight;
        float f10 = f8 - f9;
        this.mPosition = this.mTime;
        float f11 = motionPaths.f2641mX;
        float f12 = motionPaths.f2642mY;
        float f13 = f2;
        float f14 = ((f5 / 2.0f) + motionPaths2.f2641mX) - ((f6 / 2.0f) + f11);
        float f15 = ((f8 / 2.0f) + motionPaths2.f2642mY) - ((f9 / 2.0f) + f12);
        float f16 = f7 * f3;
        float f17 = f16 / 2.0f;
        this.f2641mX = (int) (((f14 * f13) + f11) - f17);
        float f18 = f10 * f4;
        float f19 = f18 / 2.0f;
        this.f2642mY = (int) (((f15 * f13) + f12) - f19);
        this.mWidth = (int) (f6 + f16);
        this.mHeight = (int) (f9 + f18);
        float f20 = Float.isNaN(keyPosition.mPercentX) ? f13 : keyPosition.mPercentX;
        float f21 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f13 = keyPosition.mPercentY;
        }
        float f22 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.f2641mX = (int) (((f22 * f15) + ((f20 * f14) + motionPaths.f2641mX)) - f17);
        this.f2642mY = (int) (((f15 * f13) + ((f14 * f21) + motionPaths.f2642mY)) - f19);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.mWidth - motionPaths.mWidth;
        float f6 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f2 = keyPosition.mPercentX;
        }
        float f7 = motionPaths.f2641mX;
        float f8 = motionPaths.mWidth;
        float f9 = motionPaths.f2642mY;
        float f10 = motionPaths.mHeight;
        float f11 = f2;
        float f12 = ((motionPaths2.mWidth / 2.0f) + motionPaths2.f2641mX) - ((f8 / 2.0f) + f7);
        float f13 = ((motionPaths2.mHeight / 2.0f) + motionPaths2.f2642mY) - ((f10 / 2.0f) + f9);
        float f14 = f12 * f11;
        float f15 = f5 * f3;
        float f16 = f15 / 2.0f;
        this.f2641mX = (int) ((f7 + f14) - f16);
        float f17 = f13 * f11;
        float f18 = f6 * f4;
        float f19 = f18 / 2.0f;
        this.f2642mY = (int) ((f9 + f17) - f19);
        this.mWidth = (int) (f8 + f15);
        this.mHeight = (int) (f10 + f18);
        float f20 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f21 = (int) ((motionPaths.f2641mX + f14) - f16);
        float f22 = (int) ((motionPaths.f2642mY + f17) - f19);
        this.f2641mX = f21 + ((-f13) * f20);
        this.f2642mY = f22 + (f12 * f20);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPolar(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float fM394b;
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.mWidth;
        float f6 = motionPaths.mWidth;
        float f7 = motionPaths2.mHeight;
        float f8 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (((f5 - f6) * f3) + f6);
        this.mHeight = (int) (((f7 - f8) * f4) + f8);
        if (keyPosition.mPositionType != 2) {
            float f9 = Float.isNaN(keyPosition.mPercentX) ? f2 : keyPosition.mPercentX;
            float f10 = motionPaths2.f2641mX;
            float f11 = motionPaths.f2641mX;
            this.f2641mX = AbstractC0271e0.m394b(f10, f11, f9, f11);
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f2 = keyPosition.mPercentY;
            }
            float f12 = motionPaths2.f2642mY;
            float f13 = motionPaths.f2642mY;
            this.f2642mY = AbstractC0271e0.m394b(f12, f13, f2, f13);
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f14 = motionPaths2.f2641mX;
                float f15 = motionPaths.f2641mX;
                fMin = AbstractC0271e0.m394b(f14, f15, f2, f15);
            } else {
                fMin = Math.min(f4, f3) * keyPosition.mPercentX;
            }
            this.f2641mX = fMin;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f16 = motionPaths2.f2642mY;
                float f17 = motionPaths.f2642mY;
                fM394b = AbstractC0271e0.m394b(f16, f17, f2, f17);
            } else {
                fM394b = keyPosition.mPercentY;
            }
            this.f2642mY = fM394b;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.mWidth;
        float f6 = motionPaths.mWidth;
        float f7 = f5 - f6;
        float f8 = motionPaths2.mHeight;
        float f9 = motionPaths.mHeight;
        float f10 = f8 - f9;
        this.mPosition = this.mTime;
        float f11 = motionPaths.f2641mX;
        float f12 = motionPaths.f2642mY;
        float f13 = (f5 / 2.0f) + motionPaths2.f2641mX;
        float f14 = (f8 / 2.0f) + motionPaths2.f2642mY;
        float f15 = f7 * f3;
        this.f2641mX = (int) ((((f13 - ((f6 / 2.0f) + f11)) * f2) + f11) - (f15 / 2.0f));
        float f16 = f10 * f4;
        this.f2642mY = (int) ((((f14 - ((f9 / 2.0f) + f12)) * f2) + f12) - (f16 / 2.0f));
        this.mWidth = (int) (f6 + f15);
        this.mHeight = (int) (f9 + f16);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f2641mX = (int) (keyPosition.mPercentX * (i2 - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f2642mY = (int) (keyPosition.mPercentY * (i3 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f2, float f3, float f4, float f5) {
        this.f2641mX = f2;
        this.f2642mY = f3;
        this.mWidth = f4;
        this.mHeight = f5;
    }

    public void setDpDt(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f8 = (float) dArr[i2];
            double d = dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f4 = f8;
            } else if (i3 == 2) {
                f6 = f8;
            } else if (i3 == 3) {
                f5 = f8;
            } else if (i3 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((0.0f * f5) / 2.0f);
        float f10 = f6 - ((0.0f * f7) / 2.0f);
        fArr[0] = (((f5 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
        fArr[1] = (((f7 * 1.0f) + f10) * f3) + ((1.0f - f3) * f10) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setView(float f2, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f3;
        float f4 = this.f2641mX;
        float f5 = this.f2642mY;
        float f6 = this.mWidth;
        float f7 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i2 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i2];
            this.mTempDelta = new double[i2];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            double[] dArr4 = this.mTempValue;
            int i4 = iArr[i3];
            dArr4[i4] = dArr[i3];
            this.mTempDelta[i4] = dArr2[i3];
        }
        float f8 = Float.NaN;
        int i5 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i5 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i5]) && (dArr3 == null || dArr3[i5] == 0.0d)) {
                f3 = f8;
            } else {
                double d = dArr3 != null ? dArr3[i5] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i5])) {
                    d = this.mTempValue[i5] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.mTempDelta[i5];
                if (i5 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i5 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i5 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i5 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i5 == 5) {
                    f8 = f13;
                }
                i5++;
            }
            f8 = f3;
            i5++;
        }
        float f15 = f8;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f2, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f16;
            double d3 = f4;
            double d4 = f5;
            float fM393a = (float) (AbstractC0271e0.m393a(d4, d3, d2) - ((double) (f6 / 2.0f)));
            float fCos = (float) ((((double) f17) - (Math.cos(d4) * d3)) - ((double) (f7 / 2.0f)));
            double d5 = f18;
            double d6 = f9;
            double d7 = f10;
            float fCos2 = (float) ((Math.cos(d4) * d3 * d7) + AbstractC0271e0.m393a(d4, d6, d5));
            float fSin = (float) ((Math.sin(d4) * d3 * d7) + (((double) f19) - (Math.cos(d4) * d6)));
            if (dArr2.length >= 2) {
                dArr2[0] = fCos2;
                dArr2[1] = fSin;
            }
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2(fSin, fCos2)) + ((double) f15)));
            }
            f4 = fM393a;
            f5 = fCos;
        } else if (!Float.isNaN(f15)) {
            view.setRotation(f15 + ((float) Math.toDegrees(Math.atan2((f12 / 2.0f) + f10, (f11 / 2.0f) + f9))) + 0.0f);
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f4, f5, f6 + f4, f7 + f5);
            return;
        }
        float f20 = f4 + 0.5f;
        int i6 = (int) f20;
        float f21 = f5 + 0.5f;
        int i7 = (int) f21;
        int i8 = (int) (f20 + f6);
        int i9 = (int) (f21 + f7);
        int i10 = i8 - i6;
        int i11 = i9 - i7;
        if (i10 != view.getMeasuredWidth() || i11 != view.getMeasuredHeight() || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i10, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY));
        }
        view.layout(i6, i7, i8, i9);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d = (((this.mWidth / 2.0f) + this.f2641mX) - motionPaths.f2641mX) - (motionPaths.mWidth / 2.0f);
        double d2 = (((this.mHeight / 2.0f) + this.f2642mY) - motionPaths.f2642mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.f2641mX = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f2642mY = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f2642mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public MotionPaths(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i4 = Key.UNSET;
        this.mPathMotionArc = i4;
        this.mAnimateRelativeTo = i4;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i2, i3, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i5 = keyPosition.mPositionType;
        if (i5 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
            return;
        }
        if (i5 == 2) {
            initScreen(i2, i3, keyPosition, motionPaths, motionPaths2);
        } else if (i5 != 3) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initAxis(keyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f2;
        float fM393a = this.f2641mX;
        float fCos = this.f2642mY;
        float f3 = this.mWidth;
        float f4 = this.mHeight;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f9 = (float) dArr[i2];
            float f10 = (float) dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fM393a = f9;
                f5 = f10;
            } else if (i3 == 2) {
                fCos = f9;
                f7 = f10;
            } else if (i3 == 3) {
                f3 = f9;
                f6 = f10;
            } else if (i3 == 4) {
                f4 = f9;
                f8 = f10;
            }
        }
        float f11 = (f6 / 2.0f) + f5;
        float fM393a2 = (f8 / 2.0f) + f7;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d, fArr3, fArr4);
            float f12 = fArr3[0];
            float f13 = fArr3[1];
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            f2 = 2.0f;
            double d2 = fM393a;
            double d3 = fCos;
            fM393a = (float) (AbstractC0271e0.m393a(d3, d2, f12) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) f13) - (Math.cos(d3) * d2)) - ((double) (f4 / 2.0f)));
            double d4 = f5;
            double dM393a = AbstractC0271e0.m393a(d3, d4, f14);
            double d5 = f7;
            float fCos2 = (float) ((Math.cos(d3) * d5) + dM393a);
            fM393a2 = (float) AbstractC0271e0.m393a(d3, d5, ((double) f15) - (Math.cos(d3) * d4));
            f11 = fCos2;
        } else {
            f2 = 2.0f;
        }
        fArr[0] = (f3 / f2) + fM393a + 0.0f;
        fArr[1] = (f4 / f2) + fCos + 0.0f;
        fArr2[0] = f11;
        fArr2[1] = fM393a2;
    }
}
