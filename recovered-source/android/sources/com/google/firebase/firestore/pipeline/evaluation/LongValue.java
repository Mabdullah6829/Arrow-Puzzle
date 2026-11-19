package com.google.firebase.firestore.pipeline.evaluation;

/* JADX INFO: loaded from: classes2.dex */
public final class LongValue implements FirestoreNumber {
    private final long value;

    public LongValue(long j2) {
        this.value = j2;
    }

    public static /* synthetic */ LongValue copy$default(LongValue longValue, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = longValue.value;
        }
        return longValue.copy(j2);
    }

    public final long component1() {
        return this.value;
    }

    public final LongValue copy(long j2) {
        return new LongValue(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LongValue) && this.value == ((LongValue) obj).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    public String toString() {
        return "LongValue(value=" + this.value + ')';
    }
}
