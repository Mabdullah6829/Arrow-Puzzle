package androidx.graphics.shapes;

import kotlin.jvm.internal.AbstractC6447f;

/* JADX INFO: loaded from: classes.dex */
public final class CornerRounding {
    public static final Companion Companion;
    public static final CornerRounding Unrounded;
    private final float radius;
    private final float smoothing;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    static {
        AbstractC6447f abstractC6447f = null;
        Companion = new Companion(abstractC6447f);
        float f2 = 0.0f;
        Unrounded = new CornerRounding(f2, f2, 3, abstractC6447f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CornerRounding() {
        float f2 = 0.0f;
        this(f2, f2, 3, null);
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    public CornerRounding(float f2, float f3) {
        this.radius = f2;
        this.smoothing = f3;
    }

    public /* synthetic */ CornerRounding(float f2, float f3, int i2, AbstractC6447f abstractC6447f) {
        this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3);
    }
}
