package androidx.graphics.shapes;

import androidx.collection.MutableFloatList;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p057d0.C6283e;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleMapper {
    public static final Companion Companion = new Companion(null);
    public static final DoubleMapper Identity;
    private final MutableFloatList sourceValues;
    private final MutableFloatList targetValues;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        C6283e c6283e = new C6283e(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        Identity = new DoubleMapper(c6283e, new C6283e(fValueOf2, fValueOf2));
    }

    public DoubleMapper(C6283e... mappings) {
        AbstractC6452k.m12181e(mappings, "mappings");
        this.sourceValues = new MutableFloatList(mappings.length);
        this.targetValues = new MutableFloatList(mappings.length);
        int length = mappings.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.sourceValues.add(((Number) mappings[i2].f24308s).floatValue());
            this.targetValues.add(((Number) mappings[i2].f24309t).floatValue());
        }
        FloatMappingKt.validateProgress(this.sourceValues);
        FloatMappingKt.validateProgress(this.targetValues);
    }

    public final float map(float f2) {
        return FloatMappingKt.linearMap(this.sourceValues, this.targetValues, f2);
    }

    public final float mapBack(float f2) {
        return FloatMappingKt.linearMap(this.targetValues, this.sourceValues, f2);
    }
}
