package androidx.graphics.shapes;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class ProgressableFeature {
    private final Feature feature;
    private final float progress;

    public ProgressableFeature(float f2, Feature feature) {
        AbstractC6452k.m12181e(feature, "feature");
        this.progress = f2;
        this.feature = feature;
    }

    public static /* synthetic */ ProgressableFeature copy$default(ProgressableFeature progressableFeature, float f2, Feature feature, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = progressableFeature.progress;
        }
        if ((i2 & 2) != 0) {
            feature = progressableFeature.feature;
        }
        return progressableFeature.copy(f2, feature);
    }

    public final float component1() {
        return this.progress;
    }

    public final Feature component2() {
        return this.feature;
    }

    public final ProgressableFeature copy(float f2, Feature feature) {
        AbstractC6452k.m12181e(feature, "feature");
        return new ProgressableFeature(f2, feature);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressableFeature)) {
            return false;
        }
        ProgressableFeature progressableFeature = (ProgressableFeature) obj;
        return Float.compare(this.progress, progressableFeature.progress) == 0 && AbstractC6452k.m12177a(this.feature, progressableFeature.feature);
    }

    public final Feature getFeature() {
        return this.feature;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return this.feature.hashCode() + (Float.hashCode(this.progress) * 31);
    }

    public String toString() {
        return "ProgressableFeature(progress=" + this.progress + ", feature=" + this.feature + ')';
    }
}
