package androidx.graphics.shapes;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class MutableCubic extends Cubic {
    public MutableCubic() {
        super(null, 1, null);
    }

    private final void transformOnePoint(PointTransformer pointTransformer, int i2) {
        int i3 = i2 + 1;
        long jMo12309transformXgqJiTY = pointTransformer.mo12309transformXgqJiTY(getPoints$graphics_shapes_release()[i2], getPoints$graphics_shapes_release()[i3]);
        getPoints$graphics_shapes_release()[i2] = Float.intBitsToFloat((int) (jMo12309transformXgqJiTY >> 32));
        getPoints$graphics_shapes_release()[i3] = Float.intBitsToFloat((int) (jMo12309transformXgqJiTY & 4294967295L));
    }

    public final void interpolate(Cubic c1, Cubic c2, float f2) {
        AbstractC6452k.m12181e(c1, "c1");
        AbstractC6452k.m12181e(c2, "c2");
        for (int i2 = 0; i2 < 8; i2++) {
            getPoints$graphics_shapes_release()[i2] = Utils.interpolate(c1.getPoints$graphics_shapes_release()[i2], c2.getPoints$graphics_shapes_release()[i2], f2);
        }
    }

    public final void transform(PointTransformer f2) {
        AbstractC6452k.m12181e(f2, "f");
        transformOnePoint(f2, 0);
        transformOnePoint(f2, 2);
        transformOnePoint(f2, 4);
        transformOnePoint(f2, 6);
    }
}
