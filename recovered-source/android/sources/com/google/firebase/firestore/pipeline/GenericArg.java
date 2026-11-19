package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6318z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GenericArg {
    public static final Companion Companion = new Companion(null);

    public static final class AggregateArg extends GenericArg {
        private final AggregateFunction aggregate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AggregateArg(AggregateFunction aggregate) {
            super(null);
            AbstractC6452k.m12181e(aggregate, "aggregate");
            this.aggregate = aggregate;
        }

        public static /* synthetic */ AggregateArg copy$default(AggregateArg aggregateArg, AggregateFunction aggregateFunction, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                aggregateFunction = aggregateArg.aggregate;
            }
            return aggregateArg.copy(aggregateFunction);
        }

        public final AggregateFunction component1() {
            return this.aggregate;
        }

        public final AggregateArg copy(AggregateFunction aggregate) {
            AbstractC6452k.m12181e(aggregate, "aggregate");
            return new AggregateArg(aggregate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AggregateArg) && AbstractC6452k.m12177a(this.aggregate, ((AggregateArg) obj).aggregate);
        }

        public final AggregateFunction getAggregate() {
            return this.aggregate;
        }

        public int hashCode() {
            return this.aggregate.hashCode();
        }

        @Override // com.google.firebase.firestore.pipeline.GenericArg
        public C0393Z0 toProto(UserDataReader userDataReader) {
            AbstractC6452k.m12181e(userDataReader, "userDataReader");
            return this.aggregate.toProto$com_google_firebase_firebase_firestore(userDataReader);
        }

        public String toString() {
            return "AggregateArg(aggregate=" + this.aggregate + ')';
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final GenericArg from(Object obj) {
            if (obj instanceof AggregateFunction) {
                return new AggregateArg((AggregateFunction) obj);
            }
            if (obj instanceof Ordering) {
                return new OrderingArg((Ordering) obj);
            }
            if (!(obj instanceof Map)) {
                if (!(obj instanceof List)) {
                    return new ExprArg(Expression.Companion.toExprOrConstant$com_google_firebase_firebase_firestore(obj));
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(from(it.next()));
                }
                return new ListArg(arrayList);
            }
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            int iM12126t = AbstractC6318z.m12126t(AbstractC6307o.m12123u(setEntrySet, 10));
            if (iM12126t < 16) {
                iM12126t = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM12126t);
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                AbstractC6452k.m12179c(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) key, GenericArg.Companion.from(value));
            }
            return new MapArg(linkedHashMap);
        }

        private Companion() {
        }
    }

    public static final class ExprArg extends GenericArg {
        private final Expression expr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExprArg(Expression expr) {
            super(null);
            AbstractC6452k.m12181e(expr, "expr");
            this.expr = expr;
        }

        public static /* synthetic */ ExprArg copy$default(ExprArg exprArg, Expression expression, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                expression = exprArg.expr;
            }
            return exprArg.copy(expression);
        }

        public final Expression component1() {
            return this.expr;
        }

        public final ExprArg copy(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new ExprArg(expr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExprArg) && AbstractC6452k.m12177a(this.expr, ((ExprArg) obj).expr);
        }

        public final Expression getExpr() {
            return this.expr;
        }

        public int hashCode() {
            return this.expr.hashCode();
        }

        @Override // com.google.firebase.firestore.pipeline.GenericArg
        public C0393Z0 toProto(UserDataReader userDataReader) {
            AbstractC6452k.m12181e(userDataReader, "userDataReader");
            return this.expr.toProto$com_google_firebase_firebase_firestore(userDataReader);
        }

        public String toString() {
            return "ExprArg(expr=" + this.expr + ')';
        }
    }

    public static final class ListArg extends GenericArg {
        private final List<GenericArg> args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ListArg(List<? extends GenericArg> args) {
            super(null);
            AbstractC6452k.m12181e(args, "args");
            this.args = args;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListArg copy$default(ListArg listArg, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = listArg.args;
            }
            return listArg.copy(list);
        }

        public final List<GenericArg> component1() {
            return this.args;
        }

        public final ListArg copy(List<? extends GenericArg> args) {
            AbstractC6452k.m12181e(args, "args");
            return new ListArg(args);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListArg) && AbstractC6452k.m12177a(this.args, ((ListArg) obj).args);
        }

        public final List<GenericArg> getArgs() {
            return this.args;
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        @Override // com.google.firebase.firestore.pipeline.GenericArg
        public C0393Z0 toProto(UserDataReader userDataReader) {
            AbstractC6452k.m12181e(userDataReader, "userDataReader");
            List<GenericArg> list = this.args;
            ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GenericArg) it.next()).toProto(userDataReader));
            }
            return Values.encodeValue(arrayList);
        }

        public String toString() {
            return "ListArg(args=" + this.args + ')';
        }
    }

    public static final class MapArg extends GenericArg {
        private final Map<String, GenericArg> args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MapArg(Map<String, ? extends GenericArg> args) {
            super(null);
            AbstractC6452k.m12181e(args, "args");
            this.args = args;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapArg copy$default(MapArg mapArg, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                map = mapArg.args;
            }
            return mapArg.copy(map);
        }

        public final Map<String, GenericArg> component1() {
            return this.args;
        }

        public final MapArg copy(Map<String, ? extends GenericArg> args) {
            AbstractC6452k.m12181e(args, "args");
            return new MapArg(args);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapArg) && AbstractC6452k.m12177a(this.args, ((MapArg) obj).args);
        }

        public final Map<String, GenericArg> getArgs() {
            return this.args;
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        @Override // com.google.firebase.firestore.pipeline.GenericArg
        public C0393Z0 toProto(UserDataReader userDataReader) {
            AbstractC6452k.m12181e(userDataReader, "userDataReader");
            Map<String, GenericArg> map = this.args;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6318z.m12126t(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((GenericArg) entry.getValue()).toProto(userDataReader));
            }
            return Values.encodeValue(linkedHashMap);
        }

        public String toString() {
            return "MapArg(args=" + this.args + ')';
        }
    }

    public static final class OrderingArg extends GenericArg {
        private final Ordering ordering;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderingArg(Ordering ordering) {
            super(null);
            AbstractC6452k.m12181e(ordering, "ordering");
            this.ordering = ordering;
        }

        public static /* synthetic */ OrderingArg copy$default(OrderingArg orderingArg, Ordering ordering, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                ordering = orderingArg.ordering;
            }
            return orderingArg.copy(ordering);
        }

        public final Ordering component1() {
            return this.ordering;
        }

        public final OrderingArg copy(Ordering ordering) {
            AbstractC6452k.m12181e(ordering, "ordering");
            return new OrderingArg(ordering);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderingArg) && AbstractC6452k.m12177a(this.ordering, ((OrderingArg) obj).ordering);
        }

        public final Ordering getOrdering() {
            return this.ordering;
        }

        public int hashCode() {
            return this.ordering.hashCode();
        }

        @Override // com.google.firebase.firestore.pipeline.GenericArg
        public C0393Z0 toProto(UserDataReader userDataReader) {
            AbstractC6452k.m12181e(userDataReader, "userDataReader");
            return this.ordering.toProto$com_google_firebase_firebase_firestore(userDataReader);
        }

        public String toString() {
            return "OrderingArg(ordering=" + this.ordering + ')';
        }
    }

    public /* synthetic */ GenericArg(AbstractC6447f abstractC6447f) {
        this();
    }

    public abstract C0393Z0 toProto(UserDataReader userDataReader);

    private GenericArg() {
    }
}
