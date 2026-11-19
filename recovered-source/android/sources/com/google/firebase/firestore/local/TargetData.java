package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.TargetOrPipeline;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.WatchStream;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.AbstractC6251n;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class TargetData {

    @Nullable
    private final Integer expectedCount;
    private final SnapshotVersion lastLimboFreeSnapshotVersion;
    private final QueryPurpose purpose;
    private final AbstractC6251n resumeToken;
    private final long sequenceNumber;
    private final SnapshotVersion snapshotVersion;
    private final TargetOrPipeline target;
    private final int targetId;

    public TargetData(TargetOrPipeline targetOrPipeline, int i2, long j2, QueryPurpose queryPurpose, SnapshotVersion snapshotVersion, SnapshotVersion snapshotVersion2, AbstractC6251n abstractC6251n, @Nullable Integer num) {
        this.target = (TargetOrPipeline) Preconditions.checkNotNull(targetOrPipeline);
        this.targetId = i2;
        this.sequenceNumber = j2;
        this.lastLimboFreeSnapshotVersion = snapshotVersion2;
        this.purpose = queryPurpose;
        this.snapshotVersion = (SnapshotVersion) Preconditions.checkNotNull(snapshotVersion);
        this.resumeToken = (AbstractC6251n) Preconditions.checkNotNull(abstractC6251n);
        this.expectedCount = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TargetData.class == obj.getClass()) {
            TargetData targetData = (TargetData) obj;
            if (this.target.equals(targetData.target) && this.targetId == targetData.targetId && this.sequenceNumber == targetData.sequenceNumber && this.purpose.equals(targetData.purpose) && this.snapshotVersion.equals(targetData.snapshotVersion) && this.lastLimboFreeSnapshotVersion.equals(targetData.lastLimboFreeSnapshotVersion) && this.resumeToken.equals(targetData.resumeToken) && Objects.equals(this.expectedCount, targetData.expectedCount)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Integer getExpectedCount() {
        return this.expectedCount;
    }

    public SnapshotVersion getLastLimboFreeSnapshotVersion() {
        return this.lastLimboFreeSnapshotVersion;
    }

    public QueryPurpose getPurpose() {
        return this.purpose;
    }

    public AbstractC6251n getResumeToken() {
        return this.resumeToken;
    }

    public long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public SnapshotVersion getSnapshotVersion() {
        return this.snapshotVersion;
    }

    public TargetOrPipeline getTarget() {
        return this.target;
    }

    public int getTargetId() {
        return this.targetId;
    }

    public int hashCode() {
        return Objects.hashCode(this.expectedCount) + ((this.resumeToken.hashCode() + ((this.lastLimboFreeSnapshotVersion.hashCode() + ((this.snapshotVersion.hashCode() + ((this.purpose.hashCode() + (((((this.target.hashCode() * 31) + this.targetId) * 31) + ((int) this.sequenceNumber)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TargetData{target=" + this.target + ", targetId=" + this.targetId + ", sequenceNumber=" + this.sequenceNumber + ", purpose=" + this.purpose + ", snapshotVersion=" + this.snapshotVersion + ", lastLimboFreeSnapshotVersion=" + this.lastLimboFreeSnapshotVersion + ", resumeToken=" + this.resumeToken + ", expectedCount=" + this.expectedCount + '}';
    }

    public TargetData withExpectedCount(@Nullable Integer num) {
        return new TargetData(this.target, this.targetId, this.sequenceNumber, this.purpose, this.snapshotVersion, this.lastLimboFreeSnapshotVersion, this.resumeToken, num);
    }

    public TargetData withLastLimboFreeSnapshotVersion(SnapshotVersion snapshotVersion) {
        return new TargetData(this.target, this.targetId, this.sequenceNumber, this.purpose, this.snapshotVersion, snapshotVersion, this.resumeToken, this.expectedCount);
    }

    public TargetData withResumeToken(AbstractC6251n abstractC6251n, SnapshotVersion snapshotVersion) {
        return new TargetData(this.target, this.targetId, this.sequenceNumber, this.purpose, snapshotVersion, this.lastLimboFreeSnapshotVersion, abstractC6251n, null);
    }

    public TargetData withSequenceNumber(long j2) {
        return new TargetData(this.target, this.targetId, j2, this.purpose, this.snapshotVersion, this.lastLimboFreeSnapshotVersion, this.resumeToken, this.expectedCount);
    }

    public TargetData withTarget(TargetOrPipeline targetOrPipeline) {
        return new TargetData(targetOrPipeline, this.targetId, this.sequenceNumber, this.purpose, this.snapshotVersion, this.lastLimboFreeSnapshotVersion, this.resumeToken, this.expectedCount);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TargetData(TargetOrPipeline targetOrPipeline, int i2, long j2, QueryPurpose queryPurpose) {
        SnapshotVersion snapshotVersion = SnapshotVersion.NONE;
        this(targetOrPipeline, i2, j2, queryPurpose, snapshotVersion, snapshotVersion, WatchStream.EMPTY_RESUME_TOKEN, null);
    }
}
