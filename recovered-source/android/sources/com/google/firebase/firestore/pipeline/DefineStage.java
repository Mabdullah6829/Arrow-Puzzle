package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p022N.C0393Z0;
import p034T.C0783s0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class DefineStage extends Stage<DefineStage> {
    public static final Companion Companion = new Companion(null);
    private final AliasedExpression[] aliasedExpressions;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final DefineStage withVariables(AliasedExpression aliasedExpression, AliasedExpression... additionalExpressions) {
            AbstractC6452k.m12181e(aliasedExpression, "aliasedExpression");
            AbstractC6452k.m12181e(additionalExpressions, "additionalExpressions");
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(aliasedExpression);
            c0783s0.m1658b(additionalExpressions);
            ArrayList arrayList = c0783s0.f2033b;
            return new DefineStage((AliasedExpression[]) arrayList.toArray(new AliasedExpression[arrayList.size()]), null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DefineStage(AliasedExpression[] aliasedExpressionArr, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(aliasedExpressionArr, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence canonicalId$lambda$0(AliasedExpression it) {
        AbstractC6452k.m12181e(it, "it");
        return it.getAlias$com_google_firebase_firebase_firestore() + '=' + it.getExpr$com_google_firebase_firebase_firestore().canonicalId$com_google_firebase_firebase_firestore();
    }

    public static final DefineStage withVariables(AliasedExpression aliasedExpression, AliasedExpression... aliasedExpressionArr) {
        return Companion.withVariables(aliasedExpression, aliasedExpressionArr);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{Values.encodeValue((Map<String, C0393Z0>) StageKt.associateWithoutDuplications(this.aliasedExpressions, userDataReader))});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return getName$com_google_firebase_firebase_firestore() + '(' + AbstractC6302j.m12093D(this.aliasedExpressions, new C0059r(2)) + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefineStage)) {
            return false;
        }
        DefineStage defineStage = (DefineStage) obj;
        return Arrays.equals(this.aliasedExpressions, defineStage.aliasedExpressions) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), defineStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public final AliasedExpression[] getAliasedExpressions$com_google_firebase_firebase_firestore() {
        return this.aliasedExpressions;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (Arrays.hashCode(this.aliasedExpressions) * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public DefineStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new DefineStage(this.aliasedExpressions, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefineStage(AliasedExpression[] aliasedExpressions, InternalOptions options) {
        super("let", options, null);
        AbstractC6452k.m12181e(aliasedExpressions, "aliasedExpressions");
        AbstractC6452k.m12181e(options, "options");
        this.aliasedExpressions = aliasedExpressions;
    }
}
