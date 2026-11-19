package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.collection.ScatterMapKt;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    static final float WAVE_SMOOTHNESS = 0.48f;
    final PathMeasure activePathMeasure;
    final Path cachedActivePath;
    final Path displayedActivePath;
    S spec;
    final Matrix transform;

    public static class ActiveIndicator {

        @FloatRange(from = 0.0d, m1892to = Contrast.RATIO_MIN)
        float amplitudeFraction = 1.0f;

        @ColorInt
        int color;

        @FloatRange(from = 0.0d, m1892to = Contrast.RATIO_MIN)
        float endFraction;

        @Px
        int gapSize;
        boolean isDeterminate;

        @FloatRange(from = 0.0d, m1892to = Contrast.RATIO_MIN)
        float phaseFraction;
        float rotationDegree;

        @FloatRange(from = 0.0d, m1892to = Contrast.RATIO_MIN)
        float startFraction;
    }

    public DrawingDelegate(S s2) {
        Path path = new Path();
        this.cachedActivePath = path;
        this.displayedActivePath = new Path();
        this.activePathMeasure = new PathMeasure(path, false);
        this.spec = s2;
        this.transform = new Matrix();
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, m1892to = Contrast.RATIO_MIN) float f2, boolean z, boolean z2);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i2, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m1893to = ScatterMapKt.Sentinel) int i3);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m1893to = ScatterMapKt.Sentinel) int i2);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, m1892to = Contrast.RATIO_MIN) float f2, @FloatRange(from = 0.0d, m1892to = Contrast.RATIO_MIN) float f3, @ColorInt int i2, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m1893to = ScatterMapKt.Sentinel) int i3, @Px int i4);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public abstract void invalidateCachedPaths();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m1892to = Contrast.RATIO_MIN) float f2, boolean z, boolean z2) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f2, z, z2);
    }

    public float vectorToCanvasRotation(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public class PathPoint {
        float[] posVec;
        float[] tanVec;
        final Matrix transform;

        public PathPoint() {
            this.posVec = new float[2];
            this.tanVec = new float[]{1.0f, 0.0f};
            this.transform = new Matrix();
        }

        public float distance(DrawingDelegate<S>.PathPoint pathPoint) {
            float[] fArr = pathPoint.posVec;
            float f2 = fArr[0];
            float[] fArr2 = this.posVec;
            return (float) Math.hypot(f2 - fArr2[0], fArr[1] - fArr2[1]);
        }

        public void moveAcross(float f2) {
            float[] fArr = this.tanVec;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.posVec;
            double d = f2;
            double d2 = fAtan2;
            fArr2[0] = (float) ((Math.cos(d2) * d) + ((double) fArr2[0]));
            float[] fArr3 = this.posVec;
            fArr3[1] = (float) AbstractC0271e0.m393a(d2, d, fArr3[1]);
        }

        public void moveAlong(float f2) {
            float[] fArr = this.tanVec;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            float[] fArr2 = this.posVec;
            double d = f2;
            double d2 = fAtan2;
            fArr2[0] = (float) ((Math.cos(d2) * d) + ((double) fArr2[0]));
            float[] fArr3 = this.posVec;
            fArr3[1] = (float) AbstractC0271e0.m393a(d2, d, fArr3[1]);
        }

        public void reset() {
            Arrays.fill(this.posVec, 0.0f);
            Arrays.fill(this.tanVec, 0.0f);
            this.tanVec[0] = 1.0f;
            this.transform.reset();
        }

        public void rotate(float f2) {
            this.transform.reset();
            this.transform.setRotate(f2);
            this.transform.mapPoints(this.posVec);
            this.transform.mapPoints(this.tanVec);
        }

        public void scale(float f2, float f3) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] * f2;
            fArr[1] = fArr[1] * f3;
            float[] fArr2 = this.tanVec;
            fArr2[0] = fArr2[0] * f2;
            fArr2[1] = fArr2[1] * f3;
        }

        public void translate(float f2, float f3) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] + f2;
            fArr[1] = fArr[1] + f3;
        }

        public PathPoint(DrawingDelegate drawingDelegate, DrawingDelegate<S>.PathPoint pathPoint) {
            this(pathPoint.posVec, pathPoint.tanVec);
        }

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.posVec = fArr3;
            this.tanVec = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.tanVec, 0, 2);
            this.transform = new Matrix();
        }
    }
}
