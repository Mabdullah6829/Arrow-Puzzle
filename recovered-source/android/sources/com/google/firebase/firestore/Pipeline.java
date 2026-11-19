package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.pipeline.AbstractOptions;
import com.google.firebase.firestore.pipeline.AddFieldsStage;
import com.google.firebase.firestore.pipeline.AggregateOptions;
import com.google.firebase.firestore.pipeline.AggregateStage;
import com.google.firebase.firestore.pipeline.AliasedAggregate;
import com.google.firebase.firestore.pipeline.AliasedExpression;
import com.google.firebase.firestore.pipeline.BooleanExpression;
import com.google.firebase.firestore.pipeline.DefineStage;
import com.google.firebase.firestore.pipeline.DistinctStage;
import com.google.firebase.firestore.pipeline.Expression;
import com.google.firebase.firestore.pipeline.Field;
import com.google.firebase.firestore.pipeline.FindNearestOptions;
import com.google.firebase.firestore.pipeline.FindNearestStage;
import com.google.firebase.firestore.pipeline.FunctionExpression;
import com.google.firebase.firestore.pipeline.InternalOptions;
import com.google.firebase.firestore.pipeline.LimitStage;
import com.google.firebase.firestore.pipeline.OffsetStage;
import com.google.firebase.firestore.pipeline.Ordering;
import com.google.firebase.firestore.pipeline.RawStage;
import com.google.firebase.firestore.pipeline.RemoveFieldsStage;
import com.google.firebase.firestore.pipeline.ReplaceStage;
import com.google.firebase.firestore.pipeline.SampleStage;
import com.google.firebase.firestore.pipeline.SearchStage;
import com.google.firebase.firestore.pipeline.SelectStage;
import com.google.firebase.firestore.pipeline.Selectable;
import com.google.firebase.firestore.pipeline.SortStage;
import com.google.firebase.firestore.pipeline.Stage;
import com.google.firebase.firestore.pipeline.UnionStage;
import com.google.firebase.firestore.pipeline.UnnestOptions;
import com.google.firebase.firestore.pipeline.UnnestStage;
import com.google.firebase.firestore.pipeline.WhereStage;
import com.google.firebase.firestore.pipeline.evaluation.UtilsKt;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.AbstractC6185M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0347C;
import p022N.C0349D;
import p022N.C0378S;
import p022N.C0386W;
import p022N.C0393Z0;
import p022N.C0426l0;
import p022N.C0430n0;
import p034T.C0783s0;
import p037U0.AbstractC0846b;
import p057d0.C6289k;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes2.dex */
public final class Pipeline {
    private final FirebaseFirestore firestore;
    private final List<Stage<?>> stages;
    private final UserDataReader userDataReader;

    public static final class ExecuteOptions extends AbstractOptions<ExecuteOptions> {

        public static final class IndexMode {
            public static final Companion Companion = new Companion(null);
            public static final IndexMode RECOMMENDED = new IndexMode("recommended");
            private final String value;

            public static final class Companion {
                public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                    this();
                }

                private Companion() {
                }
            }

            private IndexMode(String str) {
                this.value = str;
            }

            public final String getValue$com_google_firebase_firebase_firestore() {
                return this.value;
            }
        }

        private ExecuteOptions(InternalOptions internalOptions) {
            super(internalOptions);
        }

        public final ExecuteOptions withIndexMode(IndexMode indexMode) {
            AbstractC6452k.m12181e(indexMode, "indexMode");
            return with("index_mode", indexMode.getValue$com_google_firebase_firebase_firestore());
        }

        public ExecuteOptions() {
            this(InternalOptions.EMPTY);
        }

        @Override // com.google.firebase.firestore.pipeline.AbstractOptions
        public ExecuteOptions self$com_google_firebase_firebase_firestore(InternalOptions options) {
            AbstractC6452k.m12181e(options, "options");
            return new ExecuteOptions(options);
        }
    }

    public final class ObserverSnapshotTask implements PipelineResultObserver {
        private final UserDataWriter userDataWriter;
        private final TaskCompletionSource<Snapshot> taskCompletionSource = new TaskCompletionSource<>();
        private final List<PipelineResult> results = new ArrayList();

        public ObserverSnapshotTask() {
            this.userDataWriter = new UserDataWriter(Pipeline.this.firestore, DocumentSnapshot.ServerTimestampBehavior.DEFAULT);
        }

        public final Task<Snapshot> getTask() {
            zzw zzwVar = this.taskCompletionSource.f23216a;
            AbstractC6452k.m12180d(zzwVar, "getTask(...)");
            return zzwVar;
        }

        @Override // com.google.firebase.firestore.PipelineResultObserver
        public void onComplete(Timestamp executionTime) {
            AbstractC6452k.m12181e(executionTime, "executionTime");
            this.taskCompletionSource.m10768b(new Snapshot(executionTime, this.results));
        }

        @Override // com.google.firebase.firestore.PipelineResultObserver
        public void onDocument(DocumentKey documentKey, Map<String, C0393Z0> data, Timestamp timestamp, Timestamp timestamp2) {
            AbstractC6452k.m12181e(data, "data");
            this.results.add(new PipelineResult(this.userDataWriter, documentKey == null ? null : new DocumentReference(documentKey, Pipeline.this.firestore), data, timestamp, timestamp2));
        }

        @Override // com.google.firebase.firestore.PipelineResultObserver
        public void onError(FirebaseFirestoreException exception) {
            AbstractC6452k.m12181e(exception, "exception");
            this.taskCompletionSource.m10767a(exception);
        }
    }

    public static final class Snapshot implements Iterable<PipelineResult>, InterfaceC6520a {
        private final Timestamp executionTime;
        private final List<PipelineResult> results;

        public Snapshot(Timestamp executionTime, List<PipelineResult> results) {
            AbstractC6452k.m12181e(executionTime, "executionTime");
            AbstractC6452k.m12181e(results, "results");
            this.executionTime = executionTime;
            this.results = results;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Snapshot.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type com.google.firebase.firestore.Pipeline.Snapshot");
            return AbstractC6452k.m12177a(this.results, ((Snapshot) obj).results);
        }

        public final Timestamp getExecutionTime() {
            return this.executionTime;
        }

        public final List<PipelineResult> getResults() {
            return this.results;
        }

        public int hashCode() {
            return this.results.hashCode();
        }

        @Override // java.lang.Iterable
        public Iterator<PipelineResult> iterator() {
            return this.results.iterator();
        }

        public String toString() {
            return "Snapshot{executionTime=" + this.executionTime + ", results=" + this.results + '}';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pipeline(FirebaseFirestore firebaseFirestore, UserDataReader userDataReader, List<? extends Stage<?>> stages) {
        AbstractC6452k.m12181e(stages, "stages");
        this.firestore = firebaseFirestore;
        this.userDataReader = userDataReader;
        this.stages = stages;
    }

    private final Pipeline append(Stage<?> stage) {
        return new Pipeline(this.firestore, this.userDataReader, AbstractC6305m.m12107C(stage, this.stages));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6289k execute$lambda$2(C0349D c0349d, ObserverSnapshotTask observerSnapshotTask, FirestoreClient firestoreClient) {
        AbstractC6452k.m12178b(firestoreClient);
        firestoreClient.executePipeline(c0349d, observerSnapshotTask);
        return C6289k.f24318a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline addFields(Selectable field, Selectable... additionalFields) {
        AbstractC6452k.m12181e(field, "field");
        AbstractC6452k.m12181e(additionalFields, "additionalFields");
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(field);
        c0783s0.m1658b(additionalFields);
        ArrayList arrayList = c0783s0.f2033b;
        return append(new AddFieldsStage((Selectable[]) arrayList.toArray(new Selectable[arrayList.size()]), null, 2, 0 == true ? 1 : 0));
    }

    public final Pipeline aggregate(AliasedAggregate accumulator, AliasedAggregate... additionalAccumulators) {
        AbstractC6452k.m12181e(accumulator, "accumulator");
        AbstractC6452k.m12181e(additionalAccumulators, "additionalAccumulators");
        return append(AggregateStage.Companion.withAccumulators(accumulator, (AliasedAggregate[]) Arrays.copyOf(additionalAccumulators, additionalAccumulators.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline define(AliasedExpression aliasedExpression, AliasedExpression... additionalExpressions) {
        AbstractC6452k.m12181e(aliasedExpression, "aliasedExpression");
        AbstractC6452k.m12181e(additionalExpressions, "additionalExpressions");
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(aliasedExpression);
        c0783s0.m1658b(additionalExpressions);
        ArrayList arrayList = c0783s0.f2033b;
        return append(new DefineStage((AliasedExpression[]) arrayList.toArray(new AliasedExpression[arrayList.size()]), null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline distinct(Selectable group, Object... additionalGroups) {
        AbstractC6452k.m12181e(group, "group");
        AbstractC6452k.m12181e(additionalGroups, "additionalGroups");
        int i2 = 2;
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(group);
        Selectable.Companion companion = Selectable.Companion;
        ArrayList arrayList = new ArrayList(additionalGroups.length);
        for (Object obj : additionalGroups) {
            arrayList.add(companion.toSelectable(obj));
        }
        c0783s0.m1658b(arrayList.toArray(new Selectable[0]));
        ArrayList arrayList2 = c0783s0.f2033b;
        return append(new DistinctStage((Selectable[]) arrayList2.toArray(new Selectable[arrayList2.size()]), null, i2, 0 == true ? 1 : 0));
    }

    public final DocumentReference documentReference$com_google_firebase_firebase_firestore(DocumentKey key) {
        AbstractC6452k.m12181e(key, "key");
        return new DocumentReference(key, this.firestore);
    }

    public final Task<Snapshot> execute() {
        return execute$com_google_firebase_firebase_firestore(null);
    }

    public final Task<Snapshot> execute$com_google_firebase_firebase_firestore(InternalOptions internalOptions) {
        C0349D executePipelineRequest$com_google_firebase_firebase_firestore = toExecutePipelineRequest$com_google_firebase_firebase_firestore(internalOptions);
        ObserverSnapshotTask observerSnapshotTask = new ObserverSnapshotTask();
        Logger.debug("Pipeline", "Executing pipeline: " + executePipelineRequest$com_google_firebase_firebase_firestore, new Object[0]);
        FirebaseFirestore firebaseFirestore = this.firestore;
        if (firebaseFirestore != null) {
        }
        return observerSnapshotTask.getTask();
    }

    public final Pipeline findNearest(String vectorField, double[] vectorValue, FindNearestStage.DistanceMeasure distanceMeasure) {
        AbstractC6452k.m12181e(vectorField, "vectorField");
        AbstractC6452k.m12181e(vectorValue, "vectorValue");
        AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
        return append(FindNearestStage.Companion.of$com_google_firebase_firebase_firestore$default(FindNearestStage.Companion, vectorField, vectorValue, distanceMeasure, (FindNearestOptions) null, 8, (Object) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline limit(int i2) {
        return append(new LimitStage(i2, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline offset(int i2) {
        return append(new OffsetStage(i2, null, 2, 0 == true ? 1 : 0));
    }

    public final Pipeline rawStage(RawStage rawStage) {
        AbstractC6452k.m12181e(rawStage, "rawStage");
        return append(rawStage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline removeFields(Field field, Field... additionalFields) {
        AbstractC6452k.m12181e(field, "field");
        AbstractC6452k.m12181e(additionalFields, "additionalFields");
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(field);
        c0783s0.m1658b(additionalFields);
        ArrayList arrayList = c0783s0.f2033b;
        return append(new RemoveFieldsStage((Field[]) arrayList.toArray(new Field[arrayList.size()]), null, 2, 0 == true ? 1 : 0));
    }

    public final Pipeline replaceWith(String field) {
        AbstractC6452k.m12181e(field, "field");
        return replaceWith(Expression.Companion.field(field));
    }

    public final Pipeline sample(int i2) {
        return append(SampleStage.Companion.withDocLimit(i2));
    }

    public final Pipeline search(SearchStage searchStage) {
        AbstractC6452k.m12181e(searchStage, "searchStage");
        return append(searchStage);
    }

    public final Pipeline select(Selectable selection, Object... additionalSelections) {
        AbstractC6452k.m12181e(selection, "selection");
        AbstractC6452k.m12181e(additionalSelections, "additionalSelections");
        return append(SelectStage.Companion.m11454of(selection, Arrays.copyOf(additionalSelections, additionalSelections.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline sort(Ordering order, Ordering... additionalOrders) {
        AbstractC6452k.m12181e(order, "order");
        AbstractC6452k.m12181e(additionalOrders, "additionalOrders");
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(order);
        c0783s0.m1658b(additionalOrders);
        ArrayList arrayList = c0783s0.f2033b;
        return append(new SortStage((Ordering[]) arrayList.toArray(new Ordering[arrayList.size()]), null, 2, 0 == true ? 1 : 0));
    }

    public final Expression toArrayExpression() {
        return new FunctionExpression("array", UtilsKt.getNotImplemented(), Expression.Companion.toExprOrConstant$com_google_firebase_firebase_firestore(this));
    }

    public final C0349D toExecutePipelineRequest$com_google_firebase_firebase_firestore(InternalOptions internalOptions) {
        FirebaseFirestore firebaseFirestore = this.firestore;
        if (firebaseFirestore == null) {
            throw new IllegalStateException("This pipeline was created without a database (e.g., as a subcollection pipeline) and cannot be executed directly. It can only be used as part of another pipeline.");
        }
        DatabaseId databaseId = firebaseFirestore.getDatabaseId();
        AbstractC6452k.m12180d(databaseId, "getDatabaseId(...)");
        C0347C c0347cM535h = C0349D.m535h();
        c0347cM535h.m521b("projects/" + databaseId.getProjectId() + "/databases/" + databaseId.getDatabaseId());
        UserDataReader userDataReader = this.firestore.getUserDataReader();
        AbstractC6452k.m12180d(userDataReader, "getUserDataReader(...)");
        c0347cM535h.m522c(toStructuredPipelineProto$com_google_firebase_firebase_firestore(internalOptions, userDataReader));
        AbstractC6185M abstractC6185MM12341build = c0347cM535h.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0349D) abstractC6185MM12341build;
    }

    public final C0386W toPipelineProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0378S c0378sM682h = C0386W.m682h();
        List<Stage<?>> list = this.stages;
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Stage) it.next()).toProtoStage$com_google_firebase_firebase_firestore(userDataReader));
        }
        c0378sM682h.m666b(arrayList);
        AbstractC6185M abstractC6185MM12341build = c0378sM682h.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0386W) abstractC6185MM12341build;
    }

    public final Expression toScalarExpression() {
        return new FunctionExpression("scalar", UtilsKt.getNotImplemented(), Expression.Companion.toExprOrConstant$com_google_firebase_firebase_firestore(this));
    }

    public final C0430n0 toStructuredPipelineProto$com_google_firebase_firebase_firestore(InternalOptions internalOptions, UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0426l0 c0426l0M867i = C0430n0.m867i();
        c0426l0M867i.m855c(toPipelineProto$com_google_firebase_firebase_firestore(userDataReader));
        if (internalOptions != null) {
            internalOptions.forEach$com_google_firebase_firebase_firestore(new Pipeline$toStructuredPipelineProto$1(c0426l0M867i));
        }
        AbstractC6185M abstractC6185MM12341build = c0426l0M867i.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0430n0) abstractC6185MM12341build;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline union(Pipeline other) {
        AbstractC6452k.m12181e(other, "other");
        return append(new UnionStage(other, null, 2, 0 == true ? 1 : 0));
    }

    public final Pipeline unnest(String arrayField, String alias) {
        AbstractC6452k.m12181e(arrayField, "arrayField");
        AbstractC6452k.m12181e(alias, "alias");
        return unnest(Expression.Companion.field(arrayField).alias(alias));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline where(BooleanExpression condition) {
        AbstractC6452k.m12181e(condition, "condition");
        return append(new WhereStage(condition, null, 2, 0 == true ? 1 : 0));
    }

    public final Pipeline aggregate(AggregateStage aggregateStage) {
        AbstractC6452k.m12181e(aggregateStage, "aggregateStage");
        return aggregate(aggregateStage, new AggregateOptions());
    }

    public final Task<Snapshot> execute(ExecuteOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return execute$com_google_firebase_firebase_firestore(options.getOptions$com_google_firebase_firebase_firestore());
    }

    public final Pipeline findNearest(Field vectorField, double[] vectorValue, FindNearestStage.DistanceMeasure distanceMeasure) {
        AbstractC6452k.m12181e(vectorField, "vectorField");
        AbstractC6452k.m12181e(vectorValue, "vectorValue");
        AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
        return append(FindNearestStage.Companion.of$com_google_firebase_firebase_firestore$default(FindNearestStage.Companion, vectorField, vectorValue, distanceMeasure, (FindNearestOptions) null, 8, (Object) null));
    }

    public final Pipeline replaceWith(Expression mapValue) {
        AbstractC6452k.m12181e(mapValue, "mapValue");
        return append(new ReplaceStage(mapValue, ReplaceStage.Mode.Companion.getFULL_REPLACE(), null, 4, null));
    }

    public final Pipeline sample(SampleStage sample) {
        AbstractC6452k.m12181e(sample, "sample");
        return append(sample);
    }

    public final Pipeline select(String fieldName, Object... additionalSelections) {
        AbstractC6452k.m12181e(fieldName, "fieldName");
        AbstractC6452k.m12181e(additionalSelections, "additionalSelections");
        return append(SelectStage.Companion.m11455of(fieldName, Arrays.copyOf(additionalSelections, additionalSelections.length)));
    }

    public final Pipeline unnest(Selectable arrayWithAlias) {
        AbstractC6452k.m12181e(arrayWithAlias, "arrayWithAlias");
        return unnest(arrayWithAlias, new UnnestOptions());
    }

    public final Pipeline aggregate(AggregateStage aggregateStage, AggregateOptions options) {
        AbstractC6452k.m12181e(aggregateStage, "aggregateStage");
        AbstractC6452k.m12181e(options, "options");
        return append(aggregateStage.withOptions$com_google_firebase_firebase_firestore(options));
    }

    public final Pipeline findNearest(String vectorField, Expression vectorValue, FindNearestStage.DistanceMeasure distanceMeasure, FindNearestOptions options) {
        AbstractC6452k.m12181e(vectorField, "vectorField");
        AbstractC6452k.m12181e(vectorValue, "vectorValue");
        AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
        AbstractC6452k.m12181e(options, "options");
        return append(FindNearestStage.Companion.of$com_google_firebase_firebase_firestore(vectorField, vectorValue, distanceMeasure, options));
    }

    public final Pipeline unnest(Selectable arrayWithAlias, UnnestOptions options) {
        AbstractC6452k.m12181e(arrayWithAlias, "arrayWithAlias");
        AbstractC6452k.m12181e(options, "options");
        return append(new UnnestStage(arrayWithAlias, options.getOptions$com_google_firebase_firebase_firestore()));
    }

    public final Pipeline unnest(UnnestStage unnestStage) {
        AbstractC6452k.m12181e(unnestStage, "unnestStage");
        return append(unnestStage);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pipeline(FirebaseFirestore firebaseFirestore, UserDataReader userDataReader, Stage<?> stage) {
        this(firebaseFirestore, userDataReader, (List<? extends Stage<?>>) AbstractC0846b.m1752k(stage));
        AbstractC6452k.m12181e(stage, "stage");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline removeFields(String field, String... additionalFields) {
        AbstractC6452k.m12181e(field, "field");
        AbstractC6452k.m12181e(additionalFields, "additionalFields");
        int i2 = 2;
        C0783s0 c0783s0 = new C0783s0(2);
        Expression.Companion companion = Expression.Companion;
        c0783s0.m1657a(companion.field(field));
        ArrayList arrayList = new ArrayList(additionalFields.length);
        for (String str : additionalFields) {
            arrayList.add(companion.field(str));
        }
        c0783s0.m1658b(arrayList.toArray(new Field[0]));
        ArrayList arrayList2 = c0783s0.f2033b;
        return append(new RemoveFieldsStage((Field[]) arrayList2.toArray(new Field[arrayList2.size()]), null, i2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline distinct(String groupField, Object... additionalGroups) {
        AbstractC6452k.m12181e(groupField, "groupField");
        AbstractC6452k.m12181e(additionalGroups, "additionalGroups");
        int i2 = 2;
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(Expression.Companion.field(groupField));
        Selectable.Companion companion = Selectable.Companion;
        ArrayList arrayList = new ArrayList(additionalGroups.length);
        for (Object obj : additionalGroups) {
            arrayList.add(companion.toSelectable(obj));
        }
        c0783s0.m1658b(arrayList.toArray(new Selectable[0]));
        ArrayList arrayList2 = c0783s0.f2033b;
        return append(new DistinctStage((Selectable[]) arrayList2.toArray(new Selectable[arrayList2.size()]), null, i2, 0 == true ? 1 : 0));
    }
}
