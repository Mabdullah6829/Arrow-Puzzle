package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.FieldPath;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Selectable extends Expression {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final Selectable toSelectable(Object o) {
            AbstractC6452k.m12181e(o, "o");
            if (o instanceof Selectable) {
                return (Selectable) o;
            }
            if (o instanceof String) {
                return Expression.Companion.field((String) o);
            }
            if (o instanceof FieldPath) {
                return Expression.Companion.field((FieldPath) o);
            }
            throw new IllegalArgumentException("Unknown Selectable type: " + o);
        }

        private Companion() {
        }
    }

    public abstract String getAlias$com_google_firebase_firebase_firestore();

    public abstract Expression getExpr$com_google_firebase_firebase_firestore();
}
