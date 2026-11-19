package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import com.google.protobuf.AbstractC6185M;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p022N.C0371O;
import p022N.C0375Q;
import p022N.C0389X0;
import p022N.C0393Z0;
import p068j0.InterfaceC6418a;

/* JADX INFO: loaded from: classes2.dex */
public final class Ordering {
    public static final Companion Companion = new Companion(null);
    private final Direction dir;
    private final Expression expr;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final Ordering ascending(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new Ordering(expr, Direction.ASCENDING);
        }

        public final Ordering descending(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new Ordering(expr, Direction.DESCENDING);
        }

        private Companion() {
        }

        public final Ordering ascending(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new Ordering(Expression.Companion.field(fieldName), Direction.ASCENDING);
        }

        public final Ordering descending(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new Ordering(Expression.Companion.field(fieldName), Direction.DESCENDING);
        }
    }

    public enum Direction {
        ASCENDING(Values.encodeValue("ascending")),
        DESCENDING(Values.encodeValue("descending"));

        private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());
        private final C0393Z0 proto;

        Direction(C0393Z0 c0393z0) {
            this.proto = c0393z0;
        }

        public static InterfaceC6418a getEntries() {
            return $ENTRIES;
        }

        public final C0393Z0 getProto() {
            return this.proto;
        }
    }

    public Ordering(Expression expr, Direction dir) {
        AbstractC6452k.m12181e(expr, "expr");
        AbstractC6452k.m12181e(dir, "dir");
        this.expr = expr;
        this.dir = dir;
    }

    public static final Ordering ascending(Expression expression) {
        return Companion.ascending(expression);
    }

    public static final Ordering descending(Expression expression) {
        return Companion.descending(expression);
    }

    public final String canonicalId$com_google_firebase_firebase_firestore() {
        return this.expr.canonicalId$com_google_firebase_firebase_firestore() + (this.dir == Direction.ASCENDING ? "asc" : "desc");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ordering)) {
            return false;
        }
        Ordering ordering = (Ordering) obj;
        return AbstractC6452k.m12177a(this.expr, ordering.expr) && this.dir == ordering.dir;
    }

    public final Direction getDir() {
        return this.dir;
    }

    public final Expression getExpr() {
        return this.expr;
    }

    public int hashCode() {
        return this.dir.hashCode() + (this.expr.hashCode() * 31);
    }

    public final C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        C0371O c0371oM646k = C0375Q.m646k();
        c0371oM646k.m634d("direction", this.dir.getProto());
        c0371oM646k.m634d("expression", this.expr.toProto$com_google_firebase_firebase_firestore(userDataReader));
        c0389x0M714O.m696o(c0371oM646k);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public static final Ordering ascending(String str) {
        return Companion.ascending(str);
    }

    public static final Ordering descending(String str) {
        return Companion.descending(str);
    }
}
