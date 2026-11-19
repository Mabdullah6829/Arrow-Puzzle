package com.google.firebase.firestore.pipeline;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0384V;
import p022N.C0393Z0;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6305m;
import p089x0.C6559b;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchStage extends Stage<SearchStage> {
    public static final Companion Companion = new Companion(null);
    private final Selectable[] addFields;
    private final String languageCode;
    private final Long limit;
    private final Long offset;
    private final BooleanExpression query;
    private final Long retrievalDepth;
    private final Ordering[] sort;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final SearchStage withQuery(BooleanExpression query) {
            AbstractC6452k.m12181e(query, "query");
            return new SearchStage(query, null, null, null, null, null, null, null, 254, null);
        }

        private Companion() {
        }

        public final SearchStage withQuery(String rquery) {
            AbstractC6452k.m12181e(rquery, "rquery");
            return withQuery(Expression.Companion.documentMatches(rquery));
        }
    }

    public /* synthetic */ SearchStage(BooleanExpression booleanExpression, String str, Long l2, Ordering[] orderingArr, Long l3, Long l4, Selectable[] selectableArr, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(booleanExpression, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : orderingArr, (i2 & 16) != 0 ? null : l3, (i2 & 32) != 0 ? null : l4, (i2 & 64) != 0 ? null : selectableArr, (i2 & 128) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    public static final SearchStage withQuery(BooleanExpression booleanExpression) {
        return Companion.withQuery(booleanExpression);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return C6559b.f24777a;
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchStage)) {
            return false;
        }
        SearchStage searchStage = (SearchStage) obj;
        return AbstractC6452k.m12177a(this.query, searchStage.query) && AbstractC6452k.m12177a(this.languageCode, searchStage.languageCode) && AbstractC6452k.m12177a(this.retrievalDepth, searchStage.retrievalDepth) && Arrays.equals(this.sort, searchStage.sort) && AbstractC6452k.m12177a(this.offset, searchStage.offset) && AbstractC6452k.m12177a(this.limit, searchStage.limit) && Arrays.equals(this.addFields, searchStage.addFields) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), searchStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        int iHashCode = this.query.hashCode() * 31;
        String str = this.languageCode;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.retrievalDepth;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Ordering[] orderingArr = this.sort;
        int iHashCode4 = (iHashCode3 + (orderingArr != null ? Arrays.hashCode(orderingArr) : 0)) * 31;
        Long l3 = this.offset;
        int iHashCode5 = (iHashCode4 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.limit;
        int iHashCode6 = (iHashCode5 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Selectable[] selectableArr = this.addFields;
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + ((iHashCode6 + (selectableArr != null ? Arrays.hashCode(selectableArr) : 0)) * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public C0384V toProtoStage$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        InternalOptions internalOptionsWith$com_google_firebase_firebase_firestore = getOptions$com_google_firebase_firebase_firestore().with$com_google_firebase_firebase_firestore("query", this.query.toProto$com_google_firebase_firebase_firestore(userDataReader));
        String str = this.languageCode;
        if (str != null) {
            internalOptionsWith$com_google_firebase_firebase_firestore = internalOptionsWith$com_google_firebase_firebase_firestore.with$com_google_firebase_firebase_firestore("language_code", Values.encodeValue(str));
        }
        Long l2 = this.retrievalDepth;
        if (l2 != null) {
            internalOptionsWith$com_google_firebase_firebase_firestore = internalOptionsWith$com_google_firebase_firebase_firestore.with$com_google_firebase_firebase_firestore("retrieval_depth", Values.encodeValue(l2.longValue()));
        }
        Ordering[] orderingArr = this.sort;
        if (orderingArr != null) {
            ArrayList arrayList = new ArrayList(orderingArr.length);
            for (Ordering ordering : orderingArr) {
                arrayList.add(ordering.toProto$com_google_firebase_firebase_firestore(userDataReader));
            }
            internalOptionsWith$com_google_firebase_firebase_firestore = internalOptionsWith$com_google_firebase_firebase_firestore.with$com_google_firebase_firebase_firestore("sort", arrayList);
        }
        Long l3 = this.offset;
        if (l3 != null) {
            internalOptionsWith$com_google_firebase_firebase_firestore = internalOptionsWith$com_google_firebase_firebase_firestore.with$com_google_firebase_firebase_firestore(TypedValues.CycleType.S_WAVE_OFFSET, Values.encodeValue(l3.longValue()));
        }
        Long l4 = this.limit;
        if (l4 != null) {
            internalOptionsWith$com_google_firebase_firebase_firestore = internalOptionsWith$com_google_firebase_firebase_firestore.with$com_google_firebase_firebase_firestore("limit", Values.encodeValue(l4.longValue()));
        }
        Selectable[] selectableArr = this.addFields;
        if (selectableArr != null) {
            internalOptionsWith$com_google_firebase_firebase_firestore = internalOptionsWith$com_google_firebase_firebase_firestore.with$com_google_firebase_firebase_firestore("add_fields", Values.encodeValue((Map<String, C0393Z0>) StageKt.associateWithoutDuplications(selectableArr, userDataReader)));
        }
        return Stage.Companion.toProtoStage$com_google_firebase_firebase_firestore(getName$com_google_firebase_firebase_firestore(), args$com_google_firebase_firebase_firestore(userDataReader), internalOptionsWith$com_google_firebase_firebase_firestore, userDataReader);
    }

    public final SearchStage withAddFields(Selectable field, Selectable... additionalFields) {
        AbstractC6452k.m12181e(field, "field");
        AbstractC6452k.m12181e(additionalFields, "additionalFields");
        return new SearchStage(this.query, this.languageCode, this.retrievalDepth, this.sort, this.offset, this.limit, (Selectable[]) AbstractC6305m.m12108D(AbstractC0846b.m1752k(field), additionalFields).toArray(new Selectable[0]), getOptions$com_google_firebase_firebase_firestore());
    }

    public final SearchStage withLanguageCode(String languageCode) {
        AbstractC6452k.m12181e(languageCode, "languageCode");
        return new SearchStage(this.query, languageCode, this.retrievalDepth, this.sort, this.offset, this.limit, this.addFields, getOptions$com_google_firebase_firebase_firestore());
    }

    public final SearchStage withLimit(long j2) {
        return new SearchStage(this.query, this.languageCode, this.retrievalDepth, this.sort, this.offset, Long.valueOf(j2), this.addFields, getOptions$com_google_firebase_firebase_firestore());
    }

    public final SearchStage withOffset(long j2) {
        return new SearchStage(this.query, this.languageCode, this.retrievalDepth, this.sort, Long.valueOf(j2), this.limit, this.addFields, getOptions$com_google_firebase_firebase_firestore());
    }

    public final SearchStage withRetrievalDepth(long j2) {
        return new SearchStage(this.query, this.languageCode, Long.valueOf(j2), this.sort, this.offset, this.limit, this.addFields, getOptions$com_google_firebase_firebase_firestore());
    }

    public final SearchStage withSort(Ordering order, Ordering... additionalOrderings) {
        AbstractC6452k.m12181e(order, "order");
        AbstractC6452k.m12181e(additionalOrderings, "additionalOrderings");
        return new SearchStage(this.query, this.languageCode, this.retrievalDepth, (Ordering[]) AbstractC6305m.m12108D(AbstractC0846b.m1752k(order), additionalOrderings).toArray(new Ordering[0]), this.offset, this.limit, this.addFields, getOptions$com_google_firebase_firebase_firestore());
    }

    public static final SearchStage withQuery(String str) {
        return Companion.withQuery(str);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public SearchStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new SearchStage(this.query, this.languageCode, this.retrievalDepth, this.sort, this.offset, this.limit, this.addFields, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchStage(BooleanExpression query, String str, Long l2, Ordering[] orderingArr, Long l3, Long l4, Selectable[] selectableArr, InternalOptions options) {
        super(FirebaseAnalytics.Event.SEARCH, options, null);
        AbstractC6452k.m12181e(query, "query");
        AbstractC6452k.m12181e(options, "options");
        this.query = query;
        this.languageCode = str;
        this.retrievalDepth = l2;
        this.sort = orderingArr;
        this.offset = l3;
        this.limit = l4;
        this.addFields = selectableArr;
    }
}
