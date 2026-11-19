package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.AbstractC6251n;
import java.util.List;
import p030R.C0589w0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WatchChange {

    public static final class DocumentChange extends WatchChange {
        private final DocumentKey documentKey;

        @Nullable
        private final MutableDocument newDocument;
        private final List<Integer> removedTargetIds;
        private final List<Integer> updatedTargetIds;

        public DocumentChange(List<Integer> list, List<Integer> list2, DocumentKey documentKey, @Nullable MutableDocument mutableDocument) {
            super();
            this.updatedTargetIds = list;
            this.removedTargetIds = list2;
            this.documentKey = documentKey;
            this.newDocument = mutableDocument;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && DocumentChange.class == obj.getClass()) {
                DocumentChange documentChange = (DocumentChange) obj;
                if (!this.updatedTargetIds.equals(documentChange.updatedTargetIds) || !this.removedTargetIds.equals(documentChange.removedTargetIds) || !this.documentKey.equals(documentChange.documentKey)) {
                    return false;
                }
                MutableDocument mutableDocument = this.newDocument;
                MutableDocument mutableDocument2 = documentChange.newDocument;
                if (mutableDocument != null) {
                    return mutableDocument.equals(mutableDocument2);
                }
                if (mutableDocument2 == null) {
                    return true;
                }
            }
            return false;
        }

        public DocumentKey getDocumentKey() {
            return this.documentKey;
        }

        @Nullable
        public MutableDocument getNewDocument() {
            return this.newDocument;
        }

        public List<Integer> getRemovedTargetIds() {
            return this.removedTargetIds;
        }

        public List<Integer> getUpdatedTargetIds() {
            return this.updatedTargetIds;
        }

        public int hashCode() {
            int iHashCode = (this.documentKey.hashCode() + ((this.removedTargetIds.hashCode() + (this.updatedTargetIds.hashCode() * 31)) * 31)) * 31;
            MutableDocument mutableDocument = this.newDocument;
            return iHashCode + (mutableDocument != null ? mutableDocument.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.updatedTargetIds + ", removedTargetIds=" + this.removedTargetIds + ", key=" + this.documentKey + ", newDocument=" + this.newDocument + '}';
        }
    }

    public static final class ExistenceFilterWatchChange extends WatchChange {
        private final ExistenceFilter existenceFilter;
        private final int targetId;

        public ExistenceFilterWatchChange(int i2, ExistenceFilter existenceFilter) {
            super();
            this.targetId = i2;
            this.existenceFilter = existenceFilter;
        }

        public ExistenceFilter getExistenceFilter() {
            return this.existenceFilter;
        }

        public int getTargetId() {
            return this.targetId;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.targetId + ", existenceFilter=" + this.existenceFilter + '}';
        }
    }

    public static final class WatchTargetChange extends WatchChange {

        @Nullable
        private final C0589w0 cause;
        private final WatchTargetChangeType changeType;
        private final AbstractC6251n resumeToken;
        private final List<Integer> targetIds;

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, List<Integer> list) {
            this(watchTargetChangeType, list, WatchStream.EMPTY_RESUME_TOKEN, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && WatchTargetChange.class == obj.getClass()) {
                WatchTargetChange watchTargetChange = (WatchTargetChange) obj;
                if (this.changeType != watchTargetChange.changeType || !this.targetIds.equals(watchTargetChange.targetIds) || !this.resumeToken.equals(watchTargetChange.resumeToken)) {
                    return false;
                }
                C0589w0 c0589w0 = this.cause;
                if (c0589w0 != null) {
                    C0589w0 c0589w1 = watchTargetChange.cause;
                    return c0589w1 != null && c0589w0.f1287a.equals(c0589w1.f1287a);
                }
                if (watchTargetChange.cause == null) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public C0589w0 getCause() {
            return this.cause;
        }

        public WatchTargetChangeType getChangeType() {
            return this.changeType;
        }

        public AbstractC6251n getResumeToken() {
            return this.resumeToken;
        }

        public List<Integer> getTargetIds() {
            return this.targetIds;
        }

        public int hashCode() {
            int iHashCode = (this.resumeToken.hashCode() + ((this.targetIds.hashCode() + (this.changeType.hashCode() * 31)) * 31)) * 31;
            C0589w0 c0589w0 = this.cause;
            return iHashCode + (c0589w0 != null ? c0589w0.f1287a.hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.changeType + ", targetIds=" + this.targetIds + '}';
        }

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, List<Integer> list, AbstractC6251n abstractC6251n) {
            this(watchTargetChangeType, list, abstractC6251n, null);
        }

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, List<Integer> list, AbstractC6251n abstractC6251n, @Nullable C0589w0 c0589w0) {
            super();
            Assert.hardAssert(c0589w0 == null || watchTargetChangeType == WatchTargetChangeType.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.changeType = watchTargetChangeType;
            this.targetIds = list;
            this.resumeToken = abstractC6251n;
            if (c0589w0 != null && !c0589w0.m1352e()) {
                this.cause = c0589w0;
            } else {
                this.cause = null;
            }
        }
    }

    public enum WatchTargetChangeType {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private WatchChange() {
    }
}
