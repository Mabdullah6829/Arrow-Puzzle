package com.google.firebase.firestore.core;

import com.google.firebase.firestore.RealtimePipeline;
import com.google.firebase.firestore.model.Document;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class QueryOrPipeline {

    public static final class PipelineWrapper extends QueryOrPipeline {
        private final RealtimePipeline pipeline;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PipelineWrapper(RealtimePipeline pipeline) {
            super(null);
            AbstractC6452k.m12181e(pipeline, "pipeline");
            this.pipeline = pipeline;
        }

        public static /* synthetic */ PipelineWrapper copy$default(PipelineWrapper pipelineWrapper, RealtimePipeline realtimePipeline, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                realtimePipeline = pipelineWrapper.pipeline;
            }
            return pipelineWrapper.copy(realtimePipeline);
        }

        public final RealtimePipeline component1$com_google_firebase_firebase_firestore() {
            return this.pipeline;
        }

        public final PipelineWrapper copy(RealtimePipeline pipeline) {
            AbstractC6452k.m12181e(pipeline, "pipeline");
            return new PipelineWrapper(pipeline);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PipelineWrapper) && AbstractC6452k.m12177a(this.pipeline, ((PipelineWrapper) obj).pipeline);
        }

        public final RealtimePipeline getPipeline$com_google_firebase_firebase_firestore() {
            return this.pipeline;
        }

        public int hashCode() {
            return this.pipeline.hashCode();
        }

        @Override // com.google.firebase.firestore.core.QueryOrPipeline
        public String toString() {
            return "PipelineWrapper(pipeline=" + this.pipeline + ')';
        }
    }

    public static final class QueryWrapper extends QueryOrPipeline {
        private final Query query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QueryWrapper(Query query) {
            super(null);
            AbstractC6452k.m12181e(query, "query");
            this.query = query;
        }

        public static /* synthetic */ QueryWrapper copy$default(QueryWrapper queryWrapper, Query query, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                query = queryWrapper.query;
            }
            return queryWrapper.copy(query);
        }

        public final Query component1$com_google_firebase_firebase_firestore() {
            return this.query;
        }

        public final QueryWrapper copy(Query query) {
            AbstractC6452k.m12181e(query, "query");
            return new QueryWrapper(query);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QueryWrapper) && AbstractC6452k.m12177a(this.query, ((QueryWrapper) obj).query);
        }

        public final Query getQuery$com_google_firebase_firebase_firestore() {
            return this.query;
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        @Override // com.google.firebase.firestore.core.QueryOrPipeline
        public String toString() {
            return "QueryWrapper(query=" + this.query + ')';
        }
    }

    public /* synthetic */ QueryOrPipeline(AbstractC6447f abstractC6447f) {
        this();
    }

    public final String canonicalId() {
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore().canonicalId$com_google_firebase_firebase_firestore();
        }
        if (!(this instanceof QueryWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        String canonicalId = ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore().getCanonicalId();
        AbstractC6452k.m12180d(canonicalId, "getCanonicalId(...)");
        return canonicalId;
    }

    public final Comparator<Document> comparator() {
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore().comparator$com_google_firebase_firebase_firestore();
        }
        if (!(this instanceof QueryWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        Comparator<Document> comparator = ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore().comparator();
        AbstractC6452k.m12180d(comparator, "comparator(...)");
        return comparator;
    }

    public final boolean hasLimit() {
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore().hasLimit$com_google_firebase_firebase_firestore();
        }
        if (this instanceof QueryWrapper) {
            return ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore().hasLimit();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isPipeline() {
        return this instanceof PipelineWrapper;
    }

    public final boolean isQuery() {
        return this instanceof QueryWrapper;
    }

    public final boolean matches(Document doc) {
        AbstractC6452k.m12181e(doc, "doc");
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore().matches$com_google_firebase_firebase_firestore(doc);
        }
        if (this instanceof QueryWrapper) {
            return ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore().matches(doc);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean matchesAllDocuments() {
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore().matchesAllDocuments$com_google_firebase_firebase_firestore();
        }
        if (this instanceof QueryWrapper) {
            return ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore().matchesAllDocuments();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RealtimePipeline pipeline$com_google_firebase_firebase_firestore() {
        return ((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore();
    }

    public final Query query() {
        return ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore();
    }

    public String toString() {
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore().canonicalId$com_google_firebase_firebase_firestore();
        }
        if (!(this instanceof QueryWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore().toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    public final TargetOrPipeline toTargetOrPipeline() {
        if (this instanceof PipelineWrapper) {
            return new TargetOrPipeline.PipelineWrapper(((PipelineWrapper) this).getPipeline$com_google_firebase_firebase_firestore());
        }
        if (!(this instanceof QueryWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        Target target = ((QueryWrapper) this).getQuery$com_google_firebase_firebase_firestore().toTarget();
        AbstractC6452k.m12180d(target, "toTarget(...)");
        return new TargetOrPipeline.TargetWrapper(target);
    }

    private QueryOrPipeline() {
    }
}
