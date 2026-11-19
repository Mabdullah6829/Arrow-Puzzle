package com.google.firebase.firestore.core;

import com.google.firebase.firestore.RealtimePipeline;
import com.google.firebase.firestore.model.ResourcePath;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TargetOrPipeline {

    public static final class PipelineWrapper extends TargetOrPipeline {
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

        public final RealtimePipeline component1() {
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

        public final RealtimePipeline getPipeline() {
            return this.pipeline;
        }

        public int hashCode() {
            return this.pipeline.hashCode();
        }

        @Override // com.google.firebase.firestore.core.TargetOrPipeline
        public String toString() {
            return "PipelineWrapper(pipeline=" + this.pipeline + ')';
        }
    }

    public static final class TargetWrapper extends TargetOrPipeline {
        private final Target target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TargetWrapper(Target target) {
            super(null);
            AbstractC6452k.m12181e(target, "target");
            this.target = target;
        }

        public static /* synthetic */ TargetWrapper copy$default(TargetWrapper targetWrapper, Target target, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                target = targetWrapper.target;
            }
            return targetWrapper.copy(target);
        }

        public final Target component1() {
            return this.target;
        }

        public final TargetWrapper copy(Target target) {
            AbstractC6452k.m12181e(target, "target");
            return new TargetWrapper(target);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TargetWrapper) && AbstractC6452k.m12177a(this.target, ((TargetWrapper) obj).target);
        }

        public final Target getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        @Override // com.google.firebase.firestore.core.TargetOrPipeline
        public String toString() {
            return "TargetWrapper(target=" + this.target + ')';
        }
    }

    public /* synthetic */ TargetOrPipeline(AbstractC6447f abstractC6447f) {
        this();
    }

    public final String canonicalId() {
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline().canonicalId$com_google_firebase_firebase_firestore();
        }
        if (!(this instanceof TargetWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        String canonicalId = ((TargetWrapper) this).getTarget().getCanonicalId();
        AbstractC6452k.m12180d(canonicalId, "getCanonicalId(...)");
        return canonicalId;
    }

    public final ResourcePath getSingleDocPath() {
        String[] pipelineDocuments;
        if (this instanceof PipelineWrapper) {
            PipelineWrapper pipelineWrapper = (PipelineWrapper) this;
            if (PipelineUtilKt.getPipelineSourceType(pipelineWrapper.getPipeline()) == PipelineSourceType.DOCUMENTS && (pipelineDocuments = PipelineUtilKt.getPipelineDocuments(pipelineWrapper.getPipeline())) != null && pipelineDocuments.length == 1) {
                return ResourcePath.fromString(pipelineDocuments[0]);
            }
            return null;
        }
        if (!(this instanceof TargetWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        TargetWrapper targetWrapper = (TargetWrapper) this;
        if (targetWrapper.getTarget().isDocumentQuery()) {
            return targetWrapper.getTarget().getPath();
        }
        return null;
    }

    public final boolean isPipeline() {
        return this instanceof PipelineWrapper;
    }

    public final boolean isTarget() {
        return this instanceof TargetWrapper;
    }

    public final RealtimePipeline pipeline$com_google_firebase_firebase_firestore() {
        return ((PipelineWrapper) this).getPipeline();
    }

    public final Target target() {
        return ((TargetWrapper) this).getTarget();
    }

    public String toString() {
        if (this instanceof PipelineWrapper) {
            return ((PipelineWrapper) this).getPipeline().canonicalId$com_google_firebase_firebase_firestore();
        }
        if (!(this instanceof TargetWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = ((TargetWrapper) this).getTarget().toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    private TargetOrPipeline() {
    }
}
