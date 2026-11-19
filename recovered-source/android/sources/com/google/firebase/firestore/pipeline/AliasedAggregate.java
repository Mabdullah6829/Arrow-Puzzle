package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class AliasedAggregate {
    private final String alias;
    private final AggregateFunction expr;

    public AliasedAggregate(String alias, AggregateFunction expr) {
        AbstractC6452k.m12181e(alias, "alias");
        AbstractC6452k.m12181e(expr, "expr");
        this.alias = alias;
        this.expr = expr;
    }

    public final String getAlias$com_google_firebase_firebase_firestore() {
        return this.alias;
    }

    public final AggregateFunction getExpr$com_google_firebase_firebase_firestore() {
        return this.expr;
    }
}
