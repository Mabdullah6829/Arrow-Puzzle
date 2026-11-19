package com.google.firebase.firestore;

import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;
import com.google.firebase.firestore.core.QueryOrPipeline;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.BooleanExpression;
import com.google.firebase.firestore.pipeline.BooleanFunctionExpression;
import com.google.firebase.firestore.pipeline.Expression;
import com.google.firebase.firestore.pipeline.Field;
import com.google.firebase.firestore.pipeline.FunctionExpression;
import com.google.firebase.firestore.pipeline.InternalOptions;
import com.google.firebase.firestore.pipeline.LimitStage;
import com.google.firebase.firestore.pipeline.OffsetStage;
import com.google.firebase.firestore.pipeline.Ordering;
import com.google.firebase.firestore.pipeline.SortStage;
import com.google.firebase.firestore.pipeline.Stage;
import com.google.firebase.firestore.pipeline.WhereStage;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import com.google.protobuf.AbstractC6185M;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p004C0.C0151p;
import p004C0.EnumC0136a;
import p004C0.InterfaceC0152q;
import p006D0.C0168c;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;
import p022N.C0378S;
import p022N.C0386W;
import p022N.C0426l0;
import p022N.C0430n0;
import p034T.C0783s0;
import p037U0.AbstractC0846b;
import p057d0.C6289k;
import p057d0.InterfaceC6281c;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.C6290A;
import p058e0.C6291B;
import p060f0.C6335c;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p068j0.InterfaceC6418a;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class RealtimePipeline {
    private final FirebaseFirestore firestore;
    private final EventManager.ListenOptions internalOptions;
    private final InterfaceC6281c rewrittenStages$delegate;
    private final RemoteSerializer serializer;
    private final List<Stage<?>> stages;
    private final UserDataReader userDataReader;

    /* JADX INFO: renamed from: com.google.firebase.firestore.RealtimePipeline$snapshots$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.firestore.RealtimePipeline$snapshots$1", m12159f = "RealtimePipeline.kt", m12160l = {428}, m12161m = "invokeSuspend")
    public static final class C57351 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ ListenOptions $options;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57351(ListenOptions listenOptions, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$options = listenOptions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC0152q interfaceC0152q, Snapshot snapshot, FirebaseFirestoreException firebaseFirestoreException) {
            if (snapshot != null) {
                ((C0151p) interfaceC0152q).f269v.mo227g(snapshot);
            } else {
                ((C0151p) interfaceC0152q).f269v.m230k(false, firebaseFirestoreException);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6289k invokeSuspend$lambda$1(ListenerRegistration listenerRegistration) {
            listenerRegistration.remove();
            return C6289k.f24318a;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C57351 c57351 = RealtimePipeline.this.new C57351(this.$options, interfaceC6348c);
            c57351.L$0 = obj;
            return c57351;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0152q interfaceC0152q, InterfaceC6348c interfaceC6348c) {
            return ((C57351) create(interfaceC0152q, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0152q interfaceC0152q = (InterfaceC0152q) this.L$0;
                C5942r c5942r = new C5942r(RealtimePipeline.this.addSnapshotListener(this.$options, new C5941q(interfaceC0152q, 2)), 2);
                this.label = 1;
                if (AbstractC0243G.m367e(interfaceC0152q, c5942r, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealtimePipeline(FirebaseFirestore firebaseFirestore, RemoteSerializer serializer, UserDataReader userDataReader, List<? extends Stage<?>> stages, EventManager.ListenOptions listenOptions) {
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        AbstractC6452k.m12181e(stages, "stages");
        this.firestore = firebaseFirestore;
        this.serializer = serializer;
        this.userDataReader = userDataReader;
        this.stages = stages;
        this.internalOptions = listenOptions;
        this.rewrittenStages$delegate = AbstractC0242F.m357n(new C5942r(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSnapshotListener$lambda$1(EventListener eventListener, RealtimePipeline realtimePipeline, ListenOptions listenOptions, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        Snapshot snapshot;
        if (viewSnapshot != null) {
            FirebaseFirestore firebaseFirestore = realtimePipeline.firestore;
            AbstractC6452k.m12178b(firebaseFirestore);
            snapshot = new Snapshot(viewSnapshot, firebaseFirestore, listenOptions);
        } else {
            snapshot = null;
        }
        eventListener.onEvent(snapshot, firebaseFirestoreException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListenerRegistration addSnapshotListener$lambda$3(RealtimePipeline realtimePipeline, ListenOptions listenOptions, AsyncEventListener asyncEventListener, FirestoreClient firestoreClient) {
        AbstractC6452k.m12178b(firestoreClient);
        QueryListener queryListenerListen = firestoreClient.listen(new QueryOrPipeline.PipelineWrapper(realtimePipeline), listenOptions.toListenOptions$com_google_firebase_firebase_firestore(), asyncEventListener);
        AbstractC6452k.m12180d(queryListenerListen, "listen(...)");
        return new C5765h(asyncEventListener, firestoreClient, queryListenerListen, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSnapshotListener$lambda$3$lambda$2(AsyncEventListener asyncEventListener, FirestoreClient firestoreClient, QueryListener queryListener) {
        asyncEventListener.mute();
        AbstractC6452k.m12178b(firestoreClient);
        firestoreClient.stopListening(queryListener);
    }

    private final RealtimePipeline append(Stage<?> stage) {
        return with(AbstractC6305m.m12107C(stage, this.stages));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence canonicalId$lambda$6(Stage stage) {
        AbstractC6452k.m12181e(stage, "stage");
        return stage.canonicalId$com_google_firebase_firebase_firestore();
    }

    private final EvaluationContext evaluateContext() {
        return new EvaluationContext(this);
    }

    private final SortStage getLastEffectiveSortStage() {
        Stage stage;
        List<Stage<?>> rewrittenStages$com_google_firebase_firebase_firestore = getRewrittenStages$com_google_firebase_firebase_firestore();
        AbstractC6452k.m12181e(rewrittenStages$com_google_firebase_firebase_firestore, "<this>");
        Iterator it = new C6291B(rewrittenStages$com_google_firebase_firebase_firestore).iterator();
        do {
            ListIterator listIterator = ((C6290A) it).f24319s;
            if (!listIterator.hasPrevious()) {
                throw Assert.fail("RealtimePipeline must contain at least one Sort stage (ensured by RewriteStages).", new Object[0]);
            }
            stage = (Stage) listIterator.previous();
        } while (!(stage instanceof SortStage));
        return (SortStage) stage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rewrittenStages_delegate$lambda$5(RealtimePipeline realtimePipeline) {
        C6335c c6335cM1747f = AbstractC0846b.m1747f();
        boolean z = false;
        for (Stage<?> stage : realtimePipeline.stages) {
            if ((stage instanceof LimitStage) || (stage instanceof OffsetStage)) {
                if (!z) {
                    c6335cM1747f.add(SortStage.Companion.getBY_DOCUMENT_ID$com_google_firebase_firebase_firestore());
                    z = true;
                }
                c6335cM1747f.add(stage);
            } else if (stage instanceof SortStage) {
                c6335cM1747f.add(((SortStage) stage).withStableOrdering$com_google_firebase_firebase_firestore());
                z = true;
            } else {
                c6335cM1747f.add(stage);
            }
        }
        if (!z) {
            c6335cM1747f.add(SortStage.Companion.getBY_DOCUMENT_ID$com_google_firebase_firebase_firestore());
        }
        return AbstractC0846b.m1744c(c6335cM1747f);
    }

    private final RealtimePipeline with(List<? extends Stage<?>> list) {
        return new RealtimePipeline(this.firestore, this.serializer, this.userDataReader, list, null, 16, null);
    }

    public final ListenerRegistration addSnapshotListener(EventListener<Snapshot> listener) {
        AbstractC6452k.m12181e(listener, "listener");
        return addSnapshotListener(ListenOptions.DEFAULT, listener);
    }

    public final String canonicalId$com_google_firebase_firebase_firestore() {
        return AbstractC6305m.m12105A(getRewrittenStages$com_google_firebase_firebase_firestore(), "|", null, null, new C0059r(1), 30);
    }

    public final Comparator<Document> comparator$com_google_firebase_firebase_firestore() {
        return getLastEffectiveSortStage().comparator$com_google_firebase_firebase_firestore(evaluateContext());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimePipeline)) {
            return false;
        }
        RealtimePipeline realtimePipeline = (RealtimePipeline) obj;
        if (AbstractC6452k.m12177a(this.serializer.databaseId(), realtimePipeline.serializer.databaseId())) {
            return AbstractC6452k.m12177a(getRewrittenStages$com_google_firebase_firebase_firestore(), realtimePipeline.getRewrittenStages$com_google_firebase_firebase_firestore());
        }
        return false;
    }

    public final List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(inputs, "inputs");
        EvaluationContext evaluationContext = new EvaluationContext(this);
        Iterator<T> it = getRewrittenStages$com_google_firebase_firebase_firestore().iterator();
        while (it.hasNext()) {
            inputs = ((Stage) it.next()).evaluate$com_google_firebase_firebase_firestore(evaluationContext, inputs);
        }
        return inputs;
    }

    public final FirebaseFirestore getFirestore$com_google_firebase_firebase_firestore() {
        return this.firestore;
    }

    public final EventManager.ListenOptions getInternalOptions$com_google_firebase_firebase_firestore() {
        return this.internalOptions;
    }

    public final List<Stage<?>> getRewrittenStages$com_google_firebase_firebase_firestore() {
        return (List) this.rewrittenStages$delegate.getValue();
    }

    public final RemoteSerializer getSerializer$com_google_firebase_firebase_firestore() {
        return this.serializer;
    }

    public final List<Stage<?>> getStages$com_google_firebase_firebase_firestore() {
        return this.stages;
    }

    public final UserDataReader getUserDataReader$com_google_firebase_firebase_firestore() {
        return this.userDataReader;
    }

    public final boolean hasLimit$com_google_firebase_firebase_firestore() {
        Iterator<Stage<?>> it = getRewrittenStages$com_google_firebase_firebase_firestore().iterator();
        while (it.hasNext()) {
            if (AbstractC6452k.m12177a(it.next().getName$com_google_firebase_firebase_firestore(), "limit")) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.stages.hashCode() + (this.serializer.databaseId().hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RealtimePipeline limit(int i2) {
        return append(new LimitStage(i2, null, 2, 0 == true ? 1 : 0));
    }

    public final boolean matches$com_google_firebase_firebase_firestore(Document doc) {
        AbstractC6452k.m12181e(doc, "doc");
        return !evaluate$com_google_firebase_firebase_firestore(AbstractC0846b.m1752k((MutableDocument) doc)).isEmpty();
    }

    public final boolean matchesAllDocuments$com_google_firebase_firebase_firestore() {
        com.google.firebase.firestore.model.FieldPath fieldPath$com_google_firebase_firebase_firestore;
        for (Stage<?> stage : getRewrittenStages$com_google_firebase_firebase_firestore()) {
            if (AbstractC6452k.m12177a(stage.getName$com_google_firebase_firebase_firestore(), "limit")) {
                return false;
            }
            if (stage instanceof WhereStage) {
                Expression condition$com_google_firebase_firebase_firestore = ((WhereStage) stage).getCondition$com_google_firebase_firebase_firestore();
                BooleanFunctionExpression booleanFunctionExpression = condition$com_google_firebase_firebase_firestore instanceof BooleanFunctionExpression ? (BooleanFunctionExpression) condition$com_google_firebase_firebase_firestore : null;
                Expression expr = booleanFunctionExpression != null ? booleanFunctionExpression.getExpr() : null;
                FunctionExpression functionExpression = expr instanceof FunctionExpression ? (FunctionExpression) expr : null;
                if (AbstractC6452k.m12177a(functionExpression != null ? functionExpression.getName$com_google_firebase_firebase_firestore() : null, "exists") && functionExpression.getParams$com_google_firebase_firebase_firestore().length == 1) {
                    Expression expression = functionExpression.getParams$com_google_firebase_firebase_firestore()[0];
                    Field field = expression instanceof Field ? (Field) expression : null;
                    if (field == null || (fieldPath$com_google_firebase_firebase_firestore = field.getFieldPath$com_google_firebase_firebase_firestore()) == null || !fieldPath$com_google_firebase_firebase_firestore.isKeyField()) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final InterfaceC0170e snapshots() {
        return snapshots(ListenOptions.DEFAULT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RealtimePipeline sort(Ordering order, Ordering... additionalOrders) {
        AbstractC6452k.m12181e(order, "order");
        AbstractC6452k.m12181e(additionalOrders, "additionalOrders");
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(order);
        c0783s0.m1658b(additionalOrders);
        ArrayList arrayList = c0783s0.f2033b;
        return append(new SortStage((Ordering[]) arrayList.toArray(new Ordering[arrayList.size()]), null, 2, 0 == true ? 1 : 0));
    }

    public String toString() {
        return canonicalId$com_google_firebase_firebase_firestore();
    }

    public final C0430n0 toStructurePipelineProto$com_google_firebase_firebase_firestore() {
        C0426l0 c0426l0M867i = C0430n0.m867i();
        C0378S c0378sM682h = C0386W.m682h();
        List<Stage<?>> rewrittenStages$com_google_firebase_firebase_firestore = getRewrittenStages$com_google_firebase_firebase_firestore();
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(rewrittenStages$com_google_firebase_firebase_firestore, 10));
        Iterator<T> it = rewrittenStages$com_google_firebase_firebase_firestore.iterator();
        while (it.hasNext()) {
            arrayList.add(((Stage) it.next()).toProtoStage$com_google_firebase_firebase_firestore(this.userDataReader));
        }
        c0378sM682h.m666b(arrayList);
        c0426l0M867i.m855c((C0386W) c0378sM682h.m12341build());
        AbstractC6185M abstractC6185MBuild = c0426l0M867i.m12341build();
        AbstractC6452k.m12180d(abstractC6185MBuild, "build(...)");
        return (C0430n0) abstractC6185MBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RealtimePipeline where(BooleanExpression condition) {
        AbstractC6452k.m12181e(condition, "condition");
        return append(new WhereStage(condition, null, 2, 0 == true ? 1 : 0));
    }

    public final RealtimePipeline withListenOptions$com_google_firebase_firebase_firestore(EventManager.ListenOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new RealtimePipeline(this.firestore, this.serializer, this.userDataReader, this.stages, options);
    }

    public final ListenerRegistration addSnapshotListener(ListenOptions options, EventListener<Snapshot> listener) {
        AbstractC6452k.m12181e(options, "options");
        AbstractC6452k.m12181e(listener, "listener");
        Executor DEFAULT_CALLBACK_EXECUTOR = Executors.DEFAULT_CALLBACK_EXECUTOR;
        AbstractC6452k.m12180d(DEFAULT_CALLBACK_EXECUTOR, "DEFAULT_CALLBACK_EXECUTOR");
        return addSnapshotListener(DEFAULT_CALLBACK_EXECUTOR, options, listener);
    }

    public final InterfaceC0170e snapshots(ListenOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new C0168c(new C57351(options, null), C6354i.f24409s, -2, EnumC0136a.f215s);
    }

    public final ListenerRegistration addSnapshotListener(Executor executor, EventListener<Snapshot> listener) {
        AbstractC6452k.m12181e(executor, "executor");
        AbstractC6452k.m12181e(listener, "listener");
        return addSnapshotListener(executor, ListenOptions.DEFAULT, listener);
    }

    public static final class ListenOptions {
        public static final Companion Companion = new Companion(null);
        public static final ListenOptions DEFAULT = new ListenOptions(ListenSource.DEFAULT, DocumentSnapshot.ServerTimestampBehavior.NONE, MetadataChanges.EXCLUDE, InternalOptions.EMPTY);
        private final MetadataChanges metadataChanges;
        private final DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior;
        private final ListenSource source;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            private Companion() {
            }
        }

        private ListenOptions(ListenSource listenSource, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior, MetadataChanges metadataChanges, InternalOptions internalOptions) {
            this.source = listenSource;
            this.serverTimestampBehavior = serverTimestampBehavior;
            this.metadataChanges = metadataChanges;
        }

        public final MetadataChanges getMetadataChanges$com_google_firebase_firebase_firestore() {
            return this.metadataChanges;
        }

        /* JADX INFO: renamed from: getServerTimestampBehavior$com_google_firebase_firebase_firestore */
        public final DocumentSnapshot.ServerTimestampBehavior m11294xb651e9d8() {
            return this.serverTimestampBehavior;
        }

        public final ListenSource getSource$com_google_firebase_firebase_firestore() {
            return this.source;
        }

        public final EventManager.ListenOptions toListenOptions$com_google_firebase_firebase_firestore() {
            EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
            listenOptions.source = this.source;
            MetadataChanges metadataChanges = this.metadataChanges;
            MetadataChanges metadataChanges2 = MetadataChanges.INCLUDE;
            listenOptions.includeQueryMetadataChanges = metadataChanges == metadataChanges2;
            listenOptions.includeDocumentMetadataChanges = metadataChanges == metadataChanges2;
            listenOptions.waitForSyncWhenOnline = false;
            listenOptions.serverTimestampBehavior = this.serverTimestampBehavior;
            return listenOptions;
        }

        public final ListenOptions withMetadataChanges(MetadataChanges metadataChanges) {
            AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
            return new ListenOptions(this.source, this.serverTimestampBehavior, metadataChanges, InternalOptions.EMPTY);
        }

        public final ListenOptions withServerTimestampBehavior(DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
            AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
            return new ListenOptions(this.source, serverTimestampBehavior, this.metadataChanges, InternalOptions.EMPTY);
        }

        public final ListenOptions withSource(ListenSource source) {
            AbstractC6452k.m12181e(source, "source");
            return new ListenOptions(source, this.serverTimestampBehavior, this.metadataChanges, InternalOptions.EMPTY);
        }

        public ListenOptions() {
            this(ListenSource.DEFAULT, DocumentSnapshot.ServerTimestampBehavior.NONE, MetadataChanges.EXCLUDE, InternalOptions.EMPTY);
        }
    }

    public static final class Snapshot {
        private final FirebaseFirestore firestore;
        private final ListenOptions options;
        private final ViewSnapshot viewSnapshot;

        public static final class SnapshotMetadata {
            private final boolean hasPendingWrites;
            private final boolean isConsistentBetweenListeners;

            public SnapshotMetadata(boolean z, boolean z2) {
                this.hasPendingWrites = z;
                this.isConsistentBetweenListeners = z2;
            }

            public static /* synthetic */ SnapshotMetadata copy$default(SnapshotMetadata snapshotMetadata, boolean z, boolean z2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = snapshotMetadata.hasPendingWrites;
                }
                if ((i2 & 2) != 0) {
                    z2 = snapshotMetadata.isConsistentBetweenListeners;
                }
                return snapshotMetadata.copy(z, z2);
            }

            public final boolean component1() {
                return this.hasPendingWrites;
            }

            public final boolean component2() {
                return this.isConsistentBetweenListeners;
            }

            public final SnapshotMetadata copy(boolean z, boolean z2) {
                return new SnapshotMetadata(z, z2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SnapshotMetadata)) {
                    return false;
                }
                SnapshotMetadata snapshotMetadata = (SnapshotMetadata) obj;
                return this.hasPendingWrites == snapshotMetadata.hasPendingWrites && this.isConsistentBetweenListeners == snapshotMetadata.isConsistentBetweenListeners;
            }

            public final boolean getHasPendingWrites() {
                return this.hasPendingWrites;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isConsistentBetweenListeners) + (Boolean.hashCode(this.hasPendingWrites) * 31);
            }

            public final boolean isConsistentBetweenListeners() {
                return this.isConsistentBetweenListeners;
            }

            public String toString() {
                return "SnapshotMetadata(hasPendingWrites=" + this.hasPendingWrites + ", isConsistentBetweenListeners=" + this.isConsistentBetweenListeners + ')';
            }
        }

        public Snapshot(ViewSnapshot viewSnapshot, FirebaseFirestore firestore, ListenOptions options) {
            AbstractC6452k.m12181e(viewSnapshot, "viewSnapshot");
            AbstractC6452k.m12181e(firestore, "firestore");
            AbstractC6452k.m12181e(options, "options");
            this.viewSnapshot = viewSnapshot;
            this.firestore = firestore;
            this.options = options;
        }

        public static /* synthetic */ List getChanges$default(Snapshot snapshot, MetadataChanges metadataChanges, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                metadataChanges = null;
            }
            return snapshot.getChanges(metadataChanges);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ResultChange getChanges$lambda$1(Snapshot snapshot, Document doc, DocumentChange.Type type, int i2, int i3) {
            AbstractC6452k.m12181e(doc, "doc");
            AbstractC6452k.m12181e(type, "type");
            return new ResultChange(snapshot.firestore, doc, snapshot.options.m11294xb651e9d8(), type, i2, i3);
        }

        public final List<ResultChange> getChanges(MetadataChanges metadataChanges) {
            if (metadataChanges == null) {
                metadataChanges = MetadataChanges.EXCLUDE;
            }
            return RealtimePipelineKt.changesFromSnapshot(metadataChanges, this.viewSnapshot, new C5971u(this, 1));
        }

        public final SnapshotMetadata getMetadata() {
            return new SnapshotMetadata(this.viewSnapshot.hasPendingWrites(), !this.viewSnapshot.isFromCache());
        }

        public final List<PipelineResult> getResults() {
            DocumentSet documents = this.viewSnapshot.getDocuments();
            AbstractC6452k.m12180d(documents, "getDocuments(...)");
            ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(documents, 10));
            for (Document document : documents) {
                AbstractC6452k.m12178b(document);
                arrayList.add(new PipelineResult(document, this.options.m11294xb651e9d8(), this.firestore));
            }
            return arrayList;
        }

        public static final class ResultChange {
            public static final Companion Companion = new Companion(null);
            private final Integer newIndex;
            private final Integer oldIndex;
            private final PipelineResult result;
            private final ChangeType type;

            public enum ChangeType {
                ADDED,
                MODIFIED,
                REMOVED;

                private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());

                public static InterfaceC6418a getEntries() {
                    return $ENTRIES;
                }
            }

            public static final class Companion {

                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DocumentChange.Type.values().length];
                        try {
                            iArr[DocumentChange.Type.ADDED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DocumentChange.Type.MODIFIED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DocumentChange.Type.REMOVED.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                    this();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final ChangeType getChangeType(DocumentChange.Type type) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i2 == 1) {
                        return ChangeType.ADDED;
                    }
                    if (i2 == 2) {
                        return ChangeType.MODIFIED;
                    }
                    if (i2 == 3) {
                        return ChangeType.REMOVED;
                    }
                    throw new NoWhenBranchMatchedException();
                }

                private Companion() {
                }
            }

            public ResultChange(PipelineResult result, ChangeType type, Integer num, Integer num2) {
                AbstractC6452k.m12181e(result, "result");
                AbstractC6452k.m12181e(type, "type");
                this.result = result;
                this.type = type;
                this.oldIndex = num;
                this.newIndex = num2;
            }

            public static /* synthetic */ ResultChange copy$default(ResultChange resultChange, PipelineResult pipelineResult, ChangeType changeType, Integer num, Integer num2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    pipelineResult = resultChange.result;
                }
                if ((i2 & 2) != 0) {
                    changeType = resultChange.type;
                }
                if ((i2 & 4) != 0) {
                    num = resultChange.oldIndex;
                }
                if ((i2 & 8) != 0) {
                    num2 = resultChange.newIndex;
                }
                return resultChange.copy(pipelineResult, changeType, num, num2);
            }

            public final PipelineResult component1() {
                return this.result;
            }

            public final ChangeType component2() {
                return this.type;
            }

            public final Integer component3() {
                return this.oldIndex;
            }

            public final Integer component4() {
                return this.newIndex;
            }

            public final ResultChange copy(PipelineResult result, ChangeType type, Integer num, Integer num2) {
                AbstractC6452k.m12181e(result, "result");
                AbstractC6452k.m12181e(type, "type");
                return new ResultChange(result, type, num, num2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ResultChange)) {
                    return false;
                }
                ResultChange resultChange = (ResultChange) obj;
                return AbstractC6452k.m12177a(this.result, resultChange.result) && this.type == resultChange.type && AbstractC6452k.m12177a(this.oldIndex, resultChange.oldIndex) && AbstractC6452k.m12177a(this.newIndex, resultChange.newIndex);
            }

            public final Integer getNewIndex() {
                return this.newIndex;
            }

            public final Integer getOldIndex() {
                return this.oldIndex;
            }

            public final PipelineResult getResult() {
                return this.result;
            }

            public final ChangeType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = (this.type.hashCode() + (this.result.hashCode() * 31)) * 31;
                Integer num = this.oldIndex;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.newIndex;
                return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public String toString() {
                return "ResultChange(result=" + this.result + ", type=" + this.type + ", oldIndex=" + this.oldIndex + ", newIndex=" + this.newIndex + ')';
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public ResultChange(FirebaseFirestore firestore, Document doc, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior, DocumentChange.Type type, int i2, int i3) {
                this(new PipelineResult(doc, serverTimestampBehavior, firestore), Companion.getChangeType(type), Integer.valueOf(i2), Integer.valueOf(i3));
                AbstractC6452k.m12181e(firestore, "firestore");
                AbstractC6452k.m12181e(doc, "doc");
                AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
                AbstractC6452k.m12181e(type, "type");
            }
        }
    }

    public final ListenerRegistration addSnapshotListener(Executor executor, ListenOptions options, EventListener<Snapshot> listener) {
        AbstractC6452k.m12181e(executor, "executor");
        AbstractC6452k.m12181e(options, "options");
        AbstractC6452k.m12181e(listener, "listener");
        AsyncEventListener asyncEventListener = new AsyncEventListener(executor, new C5764g(listener, this, options, 2));
        FirebaseFirestore firebaseFirestore = this.firestore;
        AbstractC6452k.m12178b(firebaseFirestore);
        Object objCallClient = firebaseFirestore.callClient(new C5820o(this, options, asyncEventListener, 1));
        AbstractC6452k.m12180d(objCallClient, "callClient(...)");
        return (ListenerRegistration) objCallClient;
    }

    public /* synthetic */ RealtimePipeline(FirebaseFirestore firebaseFirestore, RemoteSerializer remoteSerializer, UserDataReader userDataReader, List list, EventManager.ListenOptions listenOptions, int i2, AbstractC6447f abstractC6447f) {
        this(firebaseFirestore, remoteSerializer, userDataReader, list, (i2 & 16) != 0 ? null : listenOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealtimePipeline(FirebaseFirestore firestore, RemoteSerializer serializer, UserDataReader userDataReader, Stage<?> stage) {
        this(firestore, serializer, userDataReader, AbstractC0846b.m1752k(stage), null, 16, null);
        AbstractC6452k.m12181e(firestore, "firestore");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        AbstractC6452k.m12181e(stage, "stage");
    }
}
