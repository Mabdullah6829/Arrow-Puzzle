package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p057d0.C6283e;
import p058e0.AbstractC6302j;
import p058e0.AbstractC6318z;
import p058e0.C6314v;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregateStage extends Stage<AggregateStage> {
    public static final Companion Companion = new Companion(null);
    private final Map<String, AggregateFunction> accumulators;
    private final Map<String, Expression> groups;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AggregateStage withAccumulators(AliasedAggregate accumulator, AliasedAggregate... additionalAccumulators) {
            AbstractC6452k.m12181e(accumulator, "accumulator");
            AbstractC6452k.m12181e(additionalAccumulators, "additionalAccumulators");
            Map mapM12127u = AbstractC6318z.m12127u(new C6283e(accumulator.getAlias$com_google_firebase_firebase_firestore(), accumulator.getExpr$com_google_firebase_firebase_firestore()));
            for (AliasedAggregate aliasedAggregate : additionalAccumulators) {
                if (mapM12127u.containsKey(aliasedAggregate.getAlias$com_google_firebase_firebase_firestore())) {
                    throw new IllegalArgumentException("Duplicate alias: '" + aliasedAggregate.getAlias$com_google_firebase_firebase_firestore() + '\'');
                }
                mapM12127u = AbstractC6318z.m12128v(mapM12127u, new C6283e(aliasedAggregate.getAlias$com_google_firebase_firebase_firestore(), aliasedAggregate.getExpr$com_google_firebase_firebase_firestore()));
            }
            return new AggregateStage(mapM12127u, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AggregateStage(Map map, AbstractC6447f abstractC6447f) {
        this(map);
    }

    public static final AggregateStage withAccumulators(AliasedAggregate aliasedAggregate, AliasedAggregate... aliasedAggregateArr) {
        return Companion.withAccumulators(aliasedAggregate, aliasedAggregateArr);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        Map<String, AggregateFunction> map = this.accumulators;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6318z.m12126t(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((AggregateFunction) entry.getValue()).toProto$com_google_firebase_firebase_firestore(userDataReader));
        }
        C0393Z0 c0393z0EncodeValue = Values.encodeValue(linkedHashMap);
        Map<String, Expression> map2 = this.groups;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC6318z.m12126t(map2.size()));
        Iterator<T> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), ((Expression) entry2.getValue()).toProto$com_google_firebase_firebase_firestore(userDataReader));
        }
        return AbstractC6302j.m12096r(new C0393Z0[]{c0393z0EncodeValue, Values.encodeValue(linkedHashMap2)});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateStage)) {
            return false;
        }
        AggregateStage aggregateStage = (AggregateStage) obj;
        return AbstractC6452k.m12177a(this.accumulators, aggregateStage.accumulators) && AbstractC6452k.m12177a(this.groups, aggregateStage.groups) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), aggregateStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + ((this.groups.hashCode() + (this.accumulators.hashCode() * 31)) * 31);
    }

    public final AggregateStage withGroups(String groupField, Object... additionalGroups) {
        AbstractC6452k.m12181e(groupField, "groupField");
        AbstractC6452k.m12181e(additionalGroups, "additionalGroups");
        return withGroups(Expression.Companion.field(groupField), Arrays.copyOf(additionalGroups, additionalGroups.length));
    }

    public final AggregateStage withOptions$com_google_firebase_firebase_firestore(AggregateOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new AggregateStage(this.accumulators, this.groups, options.getOptions$com_google_firebase_firebase_firestore());
    }

    public /* synthetic */ AggregateStage(Map map, Map map2, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(map, map2, (i2 & 4) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public AggregateStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new AggregateStage(this.accumulators, this.groups, options);
    }

    public final AggregateStage withGroups(Selectable group, Object... additionalGroups) {
        AbstractC6452k.m12181e(group, "group");
        AbstractC6452k.m12181e(additionalGroups, "additionalGroups");
        Selectable.Companion companion = Selectable.Companion;
        ArrayList arrayList = new ArrayList(additionalGroups.length);
        int i2 = 0;
        for (Object obj : additionalGroups) {
            arrayList.add(companion.toSelectable(obj));
        }
        Map mapM12127u = AbstractC6318z.m12127u(new C6283e(group.getAlias$com_google_firebase_firebase_firestore(), group.getExpr$com_google_firebase_firebase_firestore()));
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            Selectable selectable = (Selectable) obj2;
            if (mapM12127u.containsKey(selectable.getAlias$com_google_firebase_firebase_firestore())) {
                throw new IllegalArgumentException("Duplicate alias: '" + selectable.getAlias$com_google_firebase_firebase_firestore() + '\'');
            }
            mapM12127u = AbstractC6318z.m12128v(mapM12127u, new C6283e(selectable.getAlias$com_google_firebase_firebase_firestore(), selectable.getExpr$com_google_firebase_firebase_firestore()));
        }
        return new AggregateStage(this.accumulators, mapM12127u, getOptions$com_google_firebase_firebase_firestore());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AggregateStage(Map<String, AggregateFunction> map, Map<String, ? extends Expression> map2, InternalOptions internalOptions) {
        super("aggregate", internalOptions, null);
        this.accumulators = map;
        this.groups = map2;
    }

    private AggregateStage(Map<String, AggregateFunction> map) {
        this(map, C6314v.f24339s, null, 4, null);
    }
}
