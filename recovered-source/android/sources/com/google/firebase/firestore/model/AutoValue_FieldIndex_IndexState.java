package com.google.firebase.firestore.model;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_FieldIndex_IndexState extends FieldIndex.IndexState {
    private final FieldIndex.IndexOffset offset;
    private final long sequenceNumber;

    public AutoValue_FieldIndex_IndexState(long j2, FieldIndex.IndexOffset indexOffset) {
        this.sequenceNumber = j2;
        if (indexOffset == null) {
            throw new NullPointerException("Null offset");
        }
        this.offset = indexOffset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FieldIndex.IndexState) {
            FieldIndex.IndexState indexState = (FieldIndex.IndexState) obj;
            if (this.sequenceNumber == indexState.getSequenceNumber() && this.offset.equals(indexState.getOffset())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexState
    public FieldIndex.IndexOffset getOffset() {
        return this.offset;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexState
    public long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public int hashCode() {
        long j2 = this.sequenceNumber;
        return ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.offset.hashCode();
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.sequenceNumber + ", offset=" + this.offset + "}";
    }
}
