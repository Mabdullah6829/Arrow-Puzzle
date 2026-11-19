package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.bundle.BundledQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.TargetOrPipeline;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.AbstractC6251n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p019L.C0326a;
import p019L.C0328c;
import p019L.C0330e;
import p019L.C0332g;
import p019L.EnumC0329d;
import p020M.C0333a;
import p020M.C0335c;
import p020M.EnumC0334b;
import p022N.C0343A;
import p022N.C0370N0;
import p022N.C0372O0;
import p022N.C0376Q0;
import p022N.C0396a1;
import p022N.C0402c1;
import p022N.C0435q;
import p022N.C0439s;
import p072l.AbstractC6468c;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalSerializer {
    private final RemoteSerializer rpcSerializer;

    /* JADX INFO: renamed from: com.google.firebase.firestore.local.LocalSerializer$1 */
    public static /* synthetic */ class C57841 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$proto$MaybeDocument$DocumentTypeCase */
        static final /* synthetic */ int[] f23741xe45654f0;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$proto$Target$TargetTypeCase */
        static final /* synthetic */ int[] f23742x5167ea64;

        static {
            int[] iArr = new int[Target.TargetTypeCase.values().length];
            f23742x5167ea64 = iArr;
            try {
                iArr[Target.TargetTypeCase.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23742x5167ea64[Target.TargetTypeCase.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23742x5167ea64[Target.TargetTypeCase.PIPELINE_QUERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MaybeDocument.DocumentTypeCase.values().length];
            f23741xe45654f0 = iArr2;
            try {
                iArr2[MaybeDocument.DocumentTypeCase.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23741xe45654f0[MaybeDocument.DocumentTypeCase.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23741xe45654f0[MaybeDocument.DocumentTypeCase.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public LocalSerializer(RemoteSerializer remoteSerializer) {
        this.rpcSerializer = remoteSerializer;
    }

    private MutableDocument decodeDocument(C0439s c0439s, boolean z) {
        MutableDocument mutableDocumentNewFoundDocument = MutableDocument.newFoundDocument(this.rpcSerializer.decodeKey(c0439s.getName()), this.rpcSerializer.decodeVersion(c0439s.m902k()), ObjectValue.fromMap(c0439s.m901j()));
        return z ? mutableDocumentNewFoundDocument.setHasCommittedMutations() : mutableDocumentNewFoundDocument;
    }

    private MutableDocument decodeNoDocument(NoDocument noDocument, boolean z) {
        MutableDocument mutableDocumentNewNoDocument = MutableDocument.newNoDocument(this.rpcSerializer.decodeKey(noDocument.getName()), this.rpcSerializer.decodeVersion(noDocument.getReadTime()));
        return z ? mutableDocumentNewNoDocument.setHasCommittedMutations() : mutableDocumentNewNoDocument;
    }

    private MutableDocument decodeUnknownDocument(UnknownDocument unknownDocument) {
        return MutableDocument.newUnknownDocument(this.rpcSerializer.decodeKey(unknownDocument.getName()), this.rpcSerializer.decodeVersion(unknownDocument.getVersion()));
    }

    private C0439s encodeDocument(Document document) {
        C0435q c0435qM898n = C0439s.m898n();
        c0435qM898n.m885c(this.rpcSerializer.encodeKey(document.getKey()));
        c0435qM898n.m884b(document.getData().getFieldsMap());
        c0435qM898n.m886d(this.rpcSerializer.encodeTimestamp(document.getVersion().getTimestamp()));
        return (C0439s) c0435qM898n.m12341build();
    }

    private NoDocument encodeNoDocument(Document document) {
        NoDocument.Builder builderNewBuilder = NoDocument.newBuilder();
        builderNewBuilder.setName(this.rpcSerializer.encodeKey(document.getKey()));
        builderNewBuilder.setReadTime(this.rpcSerializer.encodeTimestamp(document.getVersion().getTimestamp()));
        return (NoDocument) builderNewBuilder.m12341build();
    }

    private UnknownDocument encodeUnknownDocument(Document document) {
        UnknownDocument.Builder builderNewBuilder = UnknownDocument.newBuilder();
        builderNewBuilder.setName(this.rpcSerializer.encodeKey(document.getKey()));
        builderNewBuilder.setVersion(this.rpcSerializer.encodeTimestamp(document.getVersion().getTimestamp()));
        return (UnknownDocument) builderNewBuilder.m12341build();
    }

    public BundledQuery decodeBundledQuery(C0335c c0335c) {
        return new BundledQuery(this.rpcSerializer.decodeQueryTarget(c0335c.m494i(), c0335c.m495j()), c0335c.m493h().equals(EnumC0334b.FIRST) ? Query.LimitType.LIMIT_TO_FIRST : Query.LimitType.LIMIT_TO_LAST);
    }

    public List<FieldIndex.Segment> decodeFieldIndexSegments(C0332g c0332g) {
        ArrayList arrayList = new ArrayList();
        for (C0330e c0330e : c0332g.m484g()) {
            arrayList.add(FieldIndex.Segment.create(FieldPath.fromServerFormat(c0330e.m477h()), AbstractC6468c.m12192a(c0330e.m479j(), 2) ? FieldIndex.Segment.Kind.CONTAINS : c0330e.m478i().equals(EnumC0329d.ASCENDING) ? FieldIndex.Segment.Kind.ASCENDING : FieldIndex.Segment.Kind.DESCENDING));
        }
        return arrayList;
    }

    public MutableDocument decodeMaybeDocument(MaybeDocument maybeDocument) {
        int i2 = C57841.f23741xe45654f0[maybeDocument.getDocumentTypeCase().ordinal()];
        if (i2 == 1) {
            return decodeDocument(maybeDocument.getDocument(), maybeDocument.getHasCommittedMutations());
        }
        if (i2 == 2) {
            return decodeNoDocument(maybeDocument.getNoDocument(), maybeDocument.getHasCommittedMutations());
        }
        if (i2 == 3) {
            return decodeUnknownDocument(maybeDocument.getUnknownDocument());
        }
        throw Assert.fail("Unknown MaybeDocument %s", maybeDocument);
    }

    public Mutation decodeMutation(C0402c1 c0402c1) {
        return this.rpcSerializer.decodeMutation(c0402c1);
    }

    public MutationBatch decodeMutationBatch(WriteBatch writeBatch) {
        int batchId = writeBatch.getBatchId();
        Timestamp timestampDecodeTimestamp = this.rpcSerializer.decodeTimestamp(writeBatch.getLocalWriteTime());
        int baseWritesCount = writeBatch.getBaseWritesCount();
        ArrayList arrayList = new ArrayList(baseWritesCount);
        for (int i2 = 0; i2 < baseWritesCount; i2++) {
            arrayList.add(this.rpcSerializer.decodeMutation(writeBatch.getBaseWrites(i2)));
        }
        ArrayList arrayList2 = new ArrayList(writeBatch.getWritesCount());
        int i3 = 0;
        while (i3 < writeBatch.getWritesCount()) {
            C0402c1 writes = writeBatch.getWrites(i3);
            int i4 = i3 + 1;
            if (i4 >= writeBatch.getWritesCount() || !writeBatch.getWrites(i4).m784t()) {
                arrayList2.add(this.rpcSerializer.decodeMutation(writes));
            } else {
                Assert.hardAssert(writeBatch.getWrites(i3).m785u(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                C0396a1 c0396a1M773x = C0402c1.m773x(writes);
                Iterator it = writeBatch.getWrites(i4).m778n().m520f().iterator();
                while (it.hasNext()) {
                    c0396a1M773x.m755b((C0343A) it.next());
                }
                arrayList2.add(this.rpcSerializer.decodeMutation((C0402c1) c0396a1M773x.m12341build()));
                i3 = i4;
            }
            i3++;
        }
        return new MutationBatch(batchId, timestampDecodeTimestamp, arrayList, arrayList2);
    }

    public TargetData decodeTargetData(Target target) {
        TargetOrPipeline targetWrapper;
        int targetId = target.getTargetId();
        SnapshotVersion snapshotVersionDecodeVersion = this.rpcSerializer.decodeVersion(target.getSnapshotVersion());
        SnapshotVersion snapshotVersionDecodeVersion2 = this.rpcSerializer.decodeVersion(target.getLastLimboFreeSnapshotVersion());
        AbstractC6251n resumeToken = target.getResumeToken();
        long lastListenSequenceNumber = target.getLastListenSequenceNumber();
        int i2 = C57841.f23742x5167ea64[target.getTargetTypeCase().ordinal()];
        if (i2 == 1) {
            targetWrapper = new TargetOrPipeline.TargetWrapper(this.rpcSerializer.decodeDocumentsTarget(target.getDocuments()));
        } else if (i2 == 2) {
            targetWrapper = new TargetOrPipeline.TargetWrapper(this.rpcSerializer.decodeQueryTarget(target.getQuery()));
        } else {
            if (i2 != 3) {
                throw Assert.fail("Unknown targetType %d", target.getTargetTypeCase());
            }
            targetWrapper = new TargetOrPipeline.PipelineWrapper(this.rpcSerializer.decodePipelineQueryTarget(target.getPipelineQuery()));
        }
        return new TargetData(targetWrapper, targetId, lastListenSequenceNumber, QueryPurpose.LISTEN, snapshotVersionDecodeVersion, snapshotVersionDecodeVersion2, resumeToken, null);
    }

    public C0335c encodeBundledQuery(BundledQuery bundledQuery) {
        C0376Q0 c0376q0EncodeQueryTarget = this.rpcSerializer.encodeQueryTarget(bundledQuery.getTarget());
        C0333a c0333aM491k = C0335c.m491k();
        c0333aM491k.m485b(bundledQuery.getLimitType().equals(Query.LimitType.LIMIT_TO_FIRST) ? EnumC0334b.FIRST : EnumC0334b.LAST);
        c0333aM491k.m486c(c0376q0EncodeQueryTarget.m656h());
        c0333aM491k.m487d(c0376q0EncodeQueryTarget.m657i());
        return (C0335c) c0333aM491k.m12341build();
    }

    public C0332g encodeFieldIndexSegments(List<FieldIndex.Segment> list) {
        C0326a c0326aM482h = C0332g.m482h();
        c0326aM482h.m469c();
        for (FieldIndex.Segment segment : list) {
            C0328c c0328cM476k = C0330e.m476k();
            c0328cM476k.m471c(segment.getFieldPath().canonicalString());
            if (segment.getKind() == FieldIndex.Segment.Kind.CONTAINS) {
                c0328cM476k.m470b();
            } else if (segment.getKind() == FieldIndex.Segment.Kind.ASCENDING) {
                c0328cM476k.m472d(EnumC0329d.ASCENDING);
            } else {
                c0328cM476k.m472d(EnumC0329d.DESCENDING);
            }
            c0326aM482h.m468b(c0328cM476k);
        }
        return (C0332g) c0326aM482h.m12341build();
    }

    public MaybeDocument encodeMaybeDocument(Document document) {
        MaybeDocument.Builder builderNewBuilder = MaybeDocument.newBuilder();
        if (document.isNoDocument()) {
            builderNewBuilder.setNoDocument(encodeNoDocument(document));
        } else if (document.isFoundDocument()) {
            builderNewBuilder.setDocument(encodeDocument(document));
        } else {
            if (!document.isUnknownDocument()) {
                throw Assert.fail("Cannot encode invalid document %s", document);
            }
            builderNewBuilder.setUnknownDocument(encodeUnknownDocument(document));
        }
        builderNewBuilder.setHasCommittedMutations(document.hasCommittedMutations());
        return (MaybeDocument) builderNewBuilder.m12341build();
    }

    public C0402c1 encodeMutation(Mutation mutation) {
        return this.rpcSerializer.encodeMutation(mutation);
    }

    public WriteBatch encodeMutationBatch(MutationBatch mutationBatch) {
        WriteBatch.Builder builderNewBuilder = WriteBatch.newBuilder();
        builderNewBuilder.setBatchId(mutationBatch.getBatchId());
        builderNewBuilder.setLocalWriteTime(this.rpcSerializer.encodeTimestamp(mutationBatch.getLocalWriteTime()));
        Iterator<Mutation> it = mutationBatch.getBaseMutations().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addBaseWrites(this.rpcSerializer.encodeMutation(it.next()));
        }
        Iterator<Mutation> it2 = mutationBatch.getMutations().iterator();
        while (it2.hasNext()) {
            builderNewBuilder.addWrites(this.rpcSerializer.encodeMutation(it2.next()));
        }
        return (WriteBatch) builderNewBuilder.m12341build();
    }

    public Target encodeTargetData(TargetData targetData) {
        QueryPurpose queryPurpose = QueryPurpose.LISTEN;
        Assert.hardAssert(queryPurpose.equals(targetData.getPurpose()), "Only queries with purpose %s may be stored, got %s", queryPurpose, targetData.getPurpose());
        Target.Builder builderNewBuilder = Target.newBuilder();
        builderNewBuilder.setTargetId(targetData.getTargetId()).setLastListenSequenceNumber(targetData.getSequenceNumber()).setLastLimboFreeSnapshotVersion(this.rpcSerializer.encodeVersion(targetData.getLastLimboFreeSnapshotVersion())).setSnapshotVersion(this.rpcSerializer.encodeVersion(targetData.getSnapshotVersion())).setResumeToken(targetData.getResumeToken());
        TargetOrPipeline target = targetData.getTarget();
        if (!target.isTarget()) {
            C0370N0 c0370n0M638i = C0372O0.m638i();
            c0370n0M638i.m631b(target.pipeline$com_google_firebase_firebase_firestore().toStructurePipelineProto$com_google_firebase_firebase_firestore());
            builderNewBuilder.setPipelineQuery(c0370n0M638i);
        } else if (target.target().isDocumentQuery()) {
            builderNewBuilder.setDocuments(this.rpcSerializer.encodeDocumentsTarget(target.target()));
        } else {
            builderNewBuilder.setQuery(this.rpcSerializer.encodeQueryTarget(target.target()));
        }
        return (Target) builderNewBuilder.m12341build();
    }
}
