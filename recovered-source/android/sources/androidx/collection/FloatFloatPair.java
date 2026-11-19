package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m12246boximpl(long j2) {
        return new FloatFloatPair(j2);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m12247component1impl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m12248component2impl(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m12250constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m12251equalsimpl(long j2, Object obj) {
        return (obj instanceof FloatFloatPair) && j2 == ((FloatFloatPair) obj).m12257unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12252equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m12253getFirstimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m12254getSecondimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m12255hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m12256toStringimpl(long j2) {
        return "(" + Float.intBitsToFloat((int) (j2 >> 32)) + ", " + Float.intBitsToFloat((int) (j2 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m12251equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m12255hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m12256toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m12257unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m12249constructorimpl(float f2, float f3) {
        return m12250constructorimpl((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }
}
