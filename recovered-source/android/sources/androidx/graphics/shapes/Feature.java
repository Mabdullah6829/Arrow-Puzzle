package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p060f0.C6335c;

/* JADX INFO: loaded from: classes.dex */
public abstract class Feature {
    private final List<Cubic> cubics;

    public static final class Corner extends Feature {
        private final boolean convex;
        private final long roundedCenter;
        private final long vertex;

        public /* synthetic */ Corner(List list, long j2, long j3, boolean z, AbstractC6447f abstractC6447f) {
            this(list, j2, j3, z);
        }

        public final boolean getConvex() {
            return this.convex;
        }

        /* JADX INFO: renamed from: getRoundedCenter-1ufDz9w, reason: not valid java name */
        public final long m12289getRoundedCenter1ufDz9w() {
            return this.roundedCenter;
        }

        /* JADX INFO: renamed from: getVertex-1ufDz9w, reason: not valid java name */
        public final long m12290getVertex1ufDz9w() {
            return this.vertex;
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) FloatFloatPair.m12256toStringimpl(this.vertex)) + ", center=" + ((Object) FloatFloatPair.m12256toStringimpl(this.roundedCenter)) + ", convex=" + this.convex;
        }

        @Override // androidx.graphics.shapes.Feature
        public Feature transformed$graphics_shapes_release(PointTransformer f2) {
            AbstractC6452k.m12181e(f2, "f");
            C6335c c6335cM1747f = AbstractC0846b.m1747f();
            int size = getCubics().size();
            for (int i2 = 0; i2 < size; i2++) {
                c6335cM1747f.add(getCubics().get(i2).transformed(f2));
            }
            return new Corner(AbstractC0846b.m1744c(c6335cM1747f), PointKt.m12307transformedso9K2fw(this.vertex, f2), PointKt.m12307transformedso9K2fw(this.roundedCenter, f2), this.convex, null);
        }

        public /* synthetic */ Corner(List list, long j2, long j3, boolean z, int i2, AbstractC6447f abstractC6447f) {
            this(list, j2, j3, (i2 & 8) != 0 ? true : z, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Corner(List<? extends Cubic> cubics, long j2, long j3, boolean z) {
            super(cubics);
            AbstractC6452k.m12181e(cubics, "cubics");
            this.vertex = j2;
            this.roundedCenter = j3;
            this.convex = z;
        }
    }

    public static final class Edge extends Feature {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edge(List<? extends Cubic> cubics) {
            super(cubics);
            AbstractC6452k.m12181e(cubics, "cubics");
        }

        public String toString() {
            return "Edge";
        }

        @Override // androidx.graphics.shapes.Feature
        public Edge transformed$graphics_shapes_release(PointTransformer f2) {
            AbstractC6452k.m12181e(f2, "f");
            C6335c c6335cM1747f = AbstractC0846b.m1747f();
            int size = getCubics().size();
            for (int i2 = 0; i2 < size; i2++) {
                c6335cM1747f.add(getCubics().get(i2).transformed(f2));
            }
            return new Edge(AbstractC0846b.m1744c(c6335cM1747f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Feature(List<? extends Cubic> cubics) {
        AbstractC6452k.m12181e(cubics, "cubics");
        this.cubics = cubics;
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public abstract Feature transformed$graphics_shapes_release(PointTransformer pointTransformer);
}
