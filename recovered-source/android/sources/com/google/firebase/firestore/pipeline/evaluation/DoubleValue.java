package com.google.firebase.firestore.pipeline.evaluation;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleValue implements FirestoreNumber {
    private final double value;

    public DoubleValue(double d) {
        this.value = d;
    }

    public static /* synthetic */ DoubleValue copy$default(DoubleValue doubleValue, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = doubleValue.value;
        }
        return doubleValue.copy(d);
    }

    public final double component1() {
        return this.value;
    }

    public final DoubleValue copy(double d) {
        return new DoubleValue(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) obj).value) == 0;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Double.hashCode(this.value);
    }

    public String toString() {
        return "DoubleValue(value=" + this.value + ')';
    }
}
