package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.AggregateField;
import com.google.firebase.firestore.RealtimePipeline;
import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.CompositeFilter;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.core.TargetOrPipeline;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.FieldTransform;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.model.mutation.SetMutation;
import com.google.firebase.firestore.model.mutation.TransformOperation;
import com.google.firebase.firestore.model.mutation.VerifyMutation;
import com.google.firebase.firestore.pipeline.CollectionGroupSource;
import com.google.firebase.firestore.pipeline.CollectionSource;
import com.google.firebase.firestore.pipeline.DocumentsSource;
import com.google.firebase.firestore.pipeline.Expression;
import com.google.firebase.firestore.pipeline.Field;
import com.google.firebase.firestore.pipeline.FunctionExpression;
import com.google.firebase.firestore.pipeline.InternalOptions;
import com.google.firebase.firestore.pipeline.LimitStage;
import com.google.firebase.firestore.pipeline.Ordering;
import com.google.firebase.firestore.pipeline.SortStage;
import com.google.firebase.firestore.pipeline.Stage;
import com.google.firebase.firestore.pipeline.WhereStage;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.C6187N;
import com.google.protobuf.C6189O;
import com.google.protobuf.C6195R0;
import com.google.protobuf.C6197S0;
import com.google.protobuf.InterfaceC6206X;
import com.google.protobuf.InterfaceC6210Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p011H.AbstractC0271e0;
import p022N.C0343A;
import p022N.C0344A0;
import p022N.C0348C0;
import p022N.C0350D0;
import p022N.C0352E0;
import p022N.C0353F;
import p022N.C0356G0;
import p022N.C0360I0;
import p022N.C0361J;
import p022N.C0362J0;
import p022N.C0364K0;
import p022N.C0366L0;
import p022N.C0368M0;
import p022N.C0369N;
import p022N.C0370N0;
import p022N.C0372O0;
import p022N.C0374P0;
import p022N.C0376Q0;
import p022N.C0377R0;
import p022N.C0381T0;
import p022N.C0384V;
import p022N.C0386W;
import p022N.C0388X;
import p022N.C0390Y;
import p022N.C0393Z0;
import p022N.C0396a1;
import p022N.C0401c0;
import p022N.C0402c1;
import p022N.C0403d;
import p022N.C0404d0;
import p022N.C0406e;
import p022N.C0407e0;
import p022N.C0410f0;
import p022N.C0413g0;
import p022N.C0416h0;
import p022N.C0418i;
import p022N.C0419i0;
import p022N.C0420i1;
import p022N.C0422j0;
import p022N.C0424k0;
import p022N.C0431o;
import p022N.C0432o0;
import p022N.C0433p;
import p022N.C0434p0;
import p022N.C0435q;
import p022N.C0436q0;
import p022N.C0438r0;
import p022N.C0439s;
import p022N.C0441t;
import p022N.C0442t0;
import p022N.C0443u;
import p022N.C0445v;
import p022N.C0446v0;
import p022N.C0447w;
import p022N.C0449x;
import p022N.C0450x0;
import p022N.C0451y;
import p022N.C0452y0;
import p022N.C0454z0;
import p022N.EnumC0346B0;
import p022N.EnumC0358H0;
import p022N.EnumC0379S0;
import p022N.EnumC0391Y0;
import p022N.EnumC0399b1;
import p022N.EnumC0440s0;
import p022N.EnumC0444u0;
import p022N.EnumC0448w0;
import p022N.EnumC0453z;
import p026P.C0493a;
import p030R.C0589w0;
import p072l.AbstractC6468c;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteSerializer {
    private final DatabaseId databaseId;
    private final String databaseName;

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.RemoteSerializer$1 */
    public static /* synthetic */ class C59521 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$CompositeFilter$Operator */
        static final /* synthetic */ int[] f23917xc2525260;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator */
        static final /* synthetic */ int[] f23918x833e630d;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$local$QueryPurpose;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firestore$v1$DocumentTransform$FieldTransform$TransformTypeCase */
        static final /* synthetic */ int[] f23919xdd498c9f;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase */
        static final /* synthetic */ int[] f23920x1837d9f;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firestore$v1$Precondition$ConditionTypeCase */
        static final /* synthetic */ int[] f23921x8f18ca41;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firestore$v1$StructuredQuery$CompositeFilter$Operator */
        static final /* synthetic */ int[] f23922xa1a70d7e;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$StructuredQuery$Direction;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator */
        static final /* synthetic */ int[] f23923xaf95d2b;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firestore$v1$StructuredQuery$Filter$FilterTypeCase */
        static final /* synthetic */ int[] f23924x9d2ee979;

        /* JADX INFO: renamed from: $SwitchMap$com$google$firestore$v1$StructuredQuery$UnaryFilter$Operator */
        static final /* synthetic */ int[] f23925xf473b456;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$Write$OperationCase;

        static {
            int[] iArr = new int[AbstractC6468c.m12194c(6).length];
            f23920x1837d9f = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23920x1837d9f[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23920x1837d9f[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23920x1837d9f[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23920x1837d9f[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23920x1837d9f[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[EnumC0379S0.values().length];
            $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[5] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[EnumC0444u0.values().length];
            $SwitchMap$com$google$firestore$v1$StructuredQuery$Direction = iArr3;
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$Direction[2] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[EnumC0448w0.values().length];
            f23923xaf95d2b = iArr4;
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23923xaf95d2b[2] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23923xaf95d2b[5] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23923xaf95d2b[6] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f23923xaf95d2b[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f23923xaf95d2b[3] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f23923xaf95d2b[7] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f23923xaf95d2b[8] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f23923xaf95d2b[9] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f23923xaf95d2b[10] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[FieldFilter.Operator.values().length];
            f23918x833e630d = iArr5;
            try {
                iArr5[FieldFilter.Operator.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f23918x833e630d[FieldFilter.Operator.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[EnumC0358H0.values().length];
            f23925xf473b456 = iArr6;
            try {
                iArr6[1] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f23925xf473b456[2] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f23925xf473b456[3] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f23925xf473b456[4] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[EnumC0346B0.values().length];
            f23924x9d2ee979 = iArr7;
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f23924x9d2ee979[1] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f23924x9d2ee979[2] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[EnumC0440s0.values().length];
            f23922xa1a70d7e = iArr8;
            try {
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f23922xa1a70d7e[2] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[CompositeFilter.Operator.values().length];
            f23917xc2525260 = iArr9;
            try {
                iArr9[CompositeFilter.Operator.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f23917xc2525260[CompositeFilter.Operator.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[EnumC0391Y0.values().length];
            $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase = iArr10;
            try {
                iArr10[11] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[13] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            int[] iArr11 = new int[QueryPurpose.values().length];
            $SwitchMap$com$google$firebase$firestore$local$QueryPurpose = iArr11;
            try {
                iArr11[QueryPurpose.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$local$QueryPurpose[QueryPurpose.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$local$QueryPurpose[QueryPurpose.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$local$QueryPurpose[QueryPurpose.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr12 = new int[AbstractC6468c.m12194c(7).length];
            f23919xdd498c9f = iArr12;
            try {
                iArr12[0] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f23919xdd498c9f[4] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f23919xdd498c9f[5] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f23919xdd498c9f[1] = 4;
            } catch (NoSuchFieldError unused55) {
            }
            int[] iArr13 = new int[AbstractC6468c.m12194c(3).length];
            f23921x8f18ca41 = iArr13;
            try {
                iArr13[1] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f23921x8f18ca41[0] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f23921x8f18ca41[2] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            int[] iArr14 = new int[EnumC0399b1.values().length];
            $SwitchMap$com$google$firestore$v1$Write$OperationCase = iArr14;
            try {
                iArr14[0] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Write$OperationCase[1] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Write$OperationCase[2] = 3;
            } catch (NoSuchFieldError unused61) {
            }
        }
    }

    public RemoteSerializer(DatabaseId databaseId) {
        this.databaseId = databaseId;
        this.databaseName = encodedDatabaseId(databaseId).canonicalString();
    }

    private FieldMask decodeDocumentMask(C0447w c0447w) {
        int iM925h = c0447w.m925h();
        HashSet hashSet = new HashSet(iM925h);
        for (int i2 = 0; i2 < iM925h; i2++) {
            hashSet.add(FieldPath.fromServerFormat(c0447w.m924g(i2)));
        }
        return FieldMask.fromSet(hashSet);
    }

    private Expression decodeExpression(C0393Z0 c0393z0) {
        int iOrdinal = c0393z0.m737G().ordinal();
        if (iOrdinal != 11) {
            return iOrdinal != 13 ? new Expression.Constant(c0393z0) : decodeFunctionExpression(c0393z0.m750z());
        }
        return new Field(FieldPath.fromServerFormat(c0393z0.m749y()));
    }

    private FieldFilter.Operator decodeFieldFilterOperator(EnumC0448w0 enumC0448w0) {
        switch (C59521.f23923xaf95d2b[enumC0448w0.ordinal()]) {
            case 1:
                return FieldFilter.Operator.LESS_THAN;
            case 2:
                return FieldFilter.Operator.LESS_THAN_OR_EQUAL;
            case 3:
                return FieldFilter.Operator.EQUAL;
            case 4:
                return FieldFilter.Operator.NOT_EQUAL;
            case 5:
                return FieldFilter.Operator.GREATER_THAN_OR_EQUAL;
            case 6:
                return FieldFilter.Operator.GREATER_THAN;
            case 7:
                return FieldFilter.Operator.ARRAY_CONTAINS;
            case 8:
                return FieldFilter.Operator.IN;
            case 9:
                return FieldFilter.Operator.ARRAY_CONTAINS_ANY;
            case 10:
                return FieldFilter.Operator.NOT_IN;
            default:
                throw Assert.fail("Unhandled FieldFilter.operator %d", enumC0448w0);
        }
    }

    private FieldTransform decodeFieldTransform(C0343A c0343a) {
        int iM12193b = AbstractC6468c.m12193b(c0343a.m515o());
        if (iM12193b == 0) {
            Assert.hardAssert(c0343a.m514n() == EnumC0453z.REQUEST_TIME, "Unknown transform setToServerValue: %s", c0343a.m514n());
            return new FieldTransform(FieldPath.fromServerFormat(c0343a.m511k()), ServerTimestampOperation.getInstance());
        }
        if (iM12193b == 1) {
            return new FieldTransform(FieldPath.fromServerFormat(c0343a.m511k()), new NumericIncrementTransformOperation(c0343a.m512l()));
        }
        if (iM12193b == 4) {
            return new FieldTransform(FieldPath.fromServerFormat(c0343a.m511k()), new ArrayTransformOperation.Union(c0343a.m510j().getValuesList()));
        }
        if (iM12193b == 5) {
            return new FieldTransform(FieldPath.fromServerFormat(c0343a.m511k()), new ArrayTransformOperation.Remove(c0343a.m513m().getValuesList()));
        }
        throw Assert.fail("Unknown FieldTransform proto: %s", c0343a);
    }

    private List<Filter> decodeFilters(C0348C0 c0348c0) {
        Filter filterDecodeFilter = decodeFilter(c0348c0);
        if (filterDecodeFilter instanceof CompositeFilter) {
            CompositeFilter compositeFilter = (CompositeFilter) filterDecodeFilter;
            if (compositeFilter.isFlatConjunction()) {
                return compositeFilter.getFilters();
            }
        }
        return Collections.singletonList(filterDecodeFilter);
    }

    private MutableDocument decodeFoundDocument(C0418i c0418i) {
        Assert.hardAssert(AbstractC6468c.m12192a(c0418i.m831h(), 1), "Tried to deserialize a found document from a missing document.", new Object[0]);
        DocumentKey documentKeyDecodeKey = decodeKey(c0418i.m829f().getName());
        ObjectValue objectValueFromMap = ObjectValue.fromMap(c0418i.m829f().m901j());
        SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(c0418i.m829f().m902k());
        Assert.hardAssert(true ^ snapshotVersionDecodeVersion.equals(SnapshotVersion.NONE), "Got a document response with no snapshot version", new Object[0]);
        return MutableDocument.newFoundDocument(documentKeyDecodeKey, snapshotVersionDecodeVersion, objectValueFromMap);
    }

    private FunctionExpression decodeFunctionExpression(C0361J c0361j) {
        String name = c0361j.getName();
        ArrayList arrayList = new ArrayList();
        Iterator it = c0361j.m579h().iterator();
        while (it.hasNext()) {
            arrayList.add(decodeExpression((C0393Z0) it.next()));
        }
        return new FunctionExpression(name, arrayList, InternalOptions.EMPTY);
    }

    private MutableDocument decodeMissingDocument(C0418i c0418i) {
        Assert.hardAssert(AbstractC6468c.m12192a(c0418i.m831h(), 2), "Tried to deserialize a missing document from a found document.", new Object[0]);
        DocumentKey documentKeyDecodeKey = decodeKey(c0418i.m830g());
        SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(c0418i.getReadTime());
        Assert.hardAssert(!snapshotVersionDecodeVersion.equals(SnapshotVersion.NONE), "Got a no document response with no snapshot version", new Object[0]);
        return MutableDocument.newNoDocument(documentKeyDecodeKey, snapshotVersionDecodeVersion);
    }

    private OrderBy decodeOrderBy(C0352E0 c0352e0) {
        OrderBy.Direction direction;
        FieldPath fieldPathFromServerFormat = FieldPath.fromServerFormat(c0352e0.m546h().m946g());
        int iOrdinal = c0352e0.m545g().ordinal();
        if (iOrdinal == 1) {
            direction = OrderBy.Direction.ASCENDING;
        } else {
            if (iOrdinal != 2) {
                throw Assert.fail("Unrecognized direction %d", c0352e0.m545g());
            }
            direction = OrderBy.Direction.DESCENDING;
        }
        return OrderBy.getInstance(direction, fieldPathFromServerFormat);
    }

    private Ordering decodeOrdering(C0393Z0 c0393z0) {
        Assert.hardAssert(c0393z0.m737G() == EnumC0391Y0.f726C, "Invalid proto_value type for Ordering, expected map_value.", new Object[0]);
        Expression expressionDecodeExpression = null;
        Ordering.Direction direction = null;
        for (Map.Entry entry : c0393z0.m733C().m648h().entrySet()) {
            String str = (String) entry.getKey();
            C0393Z0 c0393z1 = (C0393Z0) entry.getValue();
            if (str.equals("expression")) {
                Assert.hardAssert(expressionDecodeExpression == null, "Duplicate 'expression' field in Ordering proto.", new Object[0]);
                expressionDecodeExpression = decodeExpression(c0393z1);
            } else if (str.equals("direction")) {
                Assert.hardAssert(direction == null, "Duplicate 'direction' field in Ordering proto.", new Object[0]);
                Assert.hardAssert(c0393z1.m737G() == EnumC0391Y0.f738x, "Invalid type for 'direction' field in Ordering proto, expected string_value.", new Object[0]);
                String strM735E = c0393z1.m735E();
                if (strM735E.equals("ascending")) {
                    direction = Ordering.Direction.ASCENDING;
                } else {
                    if (!strM735E.equals("descending")) {
                        throw new IllegalArgumentException(AbstractC0271e0.m399g("Invalid string value '", strM735E, "' for 'direction' field in Ordering proto."));
                    }
                    direction = Ordering.Direction.DESCENDING;
                }
            } else {
                continue;
            }
        }
        Assert.hardAssert(expressionDecodeExpression != null, "Missing 'expression' field in Ordering proto.", new Object[0]);
        Assert.hardAssert(direction != null, "Missing 'direction' field in Ordering proto.", new Object[0]);
        return new Ordering(expressionDecodeExpression, direction);
    }

    private Precondition decodePrecondition(C0390Y c0390y) {
        int iM12193b = AbstractC6468c.m12193b(c0390y.m709g());
        if (iM12193b == 0) {
            return Precondition.exists(c0390y.m710i());
        }
        if (iM12193b == 1) {
            return Precondition.updateTime(decodeVersion(c0390y.m711j()));
        }
        if (iM12193b == 2) {
            return Precondition.NONE;
        }
        throw Assert.fail("Unknown precondition", new Object[0]);
    }

    private ResourcePath decodeQueryPath(String str) {
        ResourcePath resourcePathDecodeResourceName = decodeResourceName(str);
        return resourcePathDecodeResourceName.length() == 4 ? ResourcePath.EMPTY : extractLocalPathFromResourceName(resourcePathDecodeResourceName);
    }

    private ResourcePath decodeResourceName(String str) {
        ResourcePath resourcePathFromString = ResourcePath.fromString(str);
        Assert.hardAssert(isValidResourceName(resourcePathFromString), "Tried to deserialize invalid key %s", resourcePathFromString);
        return resourcePathFromString;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private Stage<?> decodeStage(C0384V c0384v) {
        String name = c0384v.getName();
        InterfaceC6210Z<C0393Z0> interfaceC6210ZM679h = c0384v.m679h();
        name.getClass();
        byte b = -1;
        switch (name.hashCode()) {
            case -1741312354:
                if (name.equals("collection")) {
                    b = 0;
                }
                break;
            case -1496245858:
                if (name.equals("collection_group")) {
                    b = 1;
                }
                break;
            case 3536286:
                if (name.equals("sort")) {
                    b = 2;
                }
                break;
            case 102976443:
                if (name.equals("limit")) {
                    b = 3;
                }
                break;
            case 113097959:
                if (name.equals("where")) {
                    b = 4;
                }
                break;
            case 943542968:
                if (name.equals("documents")) {
                    b = 5;
                }
                break;
        }
        EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f740z;
        switch (b) {
            case 0:
                Assert.hardAssert(interfaceC6210ZM679h.size() >= 1 && ((C0393Z0) interfaceC6210ZM679h.get(0)).m737G() == enumC0391Y0, "Invalid 'collection' stage: missing or invalid arguments", new Object[0]);
                return new CollectionSource(ResourcePath.fromString(((C0393Z0) interfaceC6210ZM679h.get(0)).m734D()), this, InternalOptions.EMPTY);
            case 1:
                Assert.hardAssert(interfaceC6210ZM679h.size() >= 1 && ((C0393Z0) interfaceC6210ZM679h.get(0)).m737G() == EnumC0391Y0.f738x, "Invalid 'collection_group' stage: missing or invalid arguments", new Object[0]);
                return new CollectionGroupSource(((C0393Z0) interfaceC6210ZM679h.get(0)).m735E(), InternalOptions.EMPTY);
            case 2:
                Assert.hardAssert(interfaceC6210ZM679h.size() > 0, "Invalid 'sort' stage: missing arguments", new Object[0]);
                ArrayList arrayList = new ArrayList();
                Iterator it = interfaceC6210ZM679h.iterator();
                while (it.hasNext()) {
                    arrayList.add(decodeOrdering((C0393Z0) it.next()));
                }
                return new SortStage((Ordering[]) arrayList.toArray(new Ordering[0]), InternalOptions.EMPTY);
            case 3:
                Assert.hardAssert(interfaceC6210ZM679h.size() >= 1 && ((C0393Z0) interfaceC6210ZM679h.get(0)).m737G() == EnumC0391Y0.f735u, "Invalid 'limit' stage: missing or invalid arguments", new Object[0]);
                return new LimitStage((int) ((C0393Z0) interfaceC6210ZM679h.get(0)).m732B(), InternalOptions.EMPTY);
            case 4:
                Assert.hardAssert(interfaceC6210ZM679h.size() >= 1, "Invalid 'where' stage: missing or invalid arguments", new Object[0]);
                return new WhereStage(decodeExpression((C0393Z0) interfaceC6210ZM679h.get(0)), InternalOptions.EMPTY);
            case 5:
                ArrayList arrayList2 = new ArrayList();
                for (C0393Z0 c0393z0 : interfaceC6210ZM679h) {
                    Assert.hardAssert(c0393z0.m737G() == enumC0391Y0, "Invalid argument type for 'documents' stage: expected reference_value", new Object[0]);
                    arrayList2.add(ResourcePath.fromString(c0393z0.m734D()));
                }
                return new DocumentsSource((ResourcePath[]) arrayList2.toArray(new ResourcePath[0]), InternalOptions.EMPTY);
            default:
                throw new IllegalArgumentException("Unsupported stage type: ".concat(name));
        }
    }

    private Filter decodeUnaryFilter(C0360I0 c0360i0) {
        FieldPath fieldPathFromServerFormat = FieldPath.fromServerFormat(c0360i0.m572h().m946g());
        int iOrdinal = c0360i0.m573i().ordinal();
        if (iOrdinal == 1) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.EQUAL, Values.NAN_VALUE);
        }
        if (iOrdinal == 2) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.EQUAL, Values.NULL_VALUE);
        }
        if (iOrdinal == 3) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.NOT_EQUAL, Values.NAN_VALUE);
        }
        if (iOrdinal == 4) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.NOT_EQUAL, Values.NULL_VALUE);
        }
        throw Assert.fail("Unrecognized UnaryFilter.operator %d", c0360i0.m573i());
    }

    private C0447w encodeDocumentMask(FieldMask fieldMask) {
        C0445v c0445vM923i = C0447w.m923i();
        Iterator<FieldPath> it = fieldMask.getMask().iterator();
        while (it.hasNext()) {
            c0445vM923i.m917b(it.next().canonicalString());
        }
        return (C0447w) c0445vM923i.m12341build();
    }

    private EnumC0448w0 encodeFieldFilterOperator(FieldFilter.Operator operator) {
        switch (C59521.f23918x833e630d[operator.ordinal()]) {
            case 1:
                return EnumC0448w0.LESS_THAN;
            case 2:
                return EnumC0448w0.LESS_THAN_OR_EQUAL;
            case 3:
                return EnumC0448w0.EQUAL;
            case 4:
                return EnumC0448w0.NOT_EQUAL;
            case 5:
                return EnumC0448w0.GREATER_THAN;
            case 6:
                return EnumC0448w0.GREATER_THAN_OR_EQUAL;
            case 7:
                return EnumC0448w0.ARRAY_CONTAINS;
            case 8:
                return EnumC0448w0.IN;
            case 9:
                return EnumC0448w0.ARRAY_CONTAINS_ANY;
            case 10:
                return EnumC0448w0.NOT_IN;
            default:
                throw Assert.fail("Unknown operator %d", operator);
        }
    }

    private C0454z0 encodeFieldPath(FieldPath fieldPath) {
        C0452y0 c0452y0M945h = C0454z0.m945h();
        c0452y0M945h.m942b(fieldPath.canonicalString());
        return (C0454z0) c0452y0M945h.m12341build();
    }

    private C0343A encodeFieldTransform(FieldTransform fieldTransform) {
        TransformOperation operation = fieldTransform.getOperation();
        if (operation instanceof ServerTimestampOperation) {
            C0451y c0451yM509p = C0343A.m509p();
            c0451yM509p.m938c(fieldTransform.getFieldPath().canonicalString());
            c0451yM509p.m941f();
            return (C0343A) c0451yM509p.m12341build();
        }
        if (operation instanceof ArrayTransformOperation.Union) {
            C0451y c0451yM509p2 = C0343A.m509p();
            c0451yM509p2.m938c(fieldTransform.getFieldPath().canonicalString());
            C0403d c0403dM798k = C0406e.m798k();
            c0403dM798k.m787b(((ArrayTransformOperation.Union) operation).getElements());
            c0451yM509p2.m937b(c0403dM798k);
            return (C0343A) c0451yM509p2.m12341build();
        }
        if (operation instanceof ArrayTransformOperation.Remove) {
            C0451y c0451yM509p3 = C0343A.m509p();
            c0451yM509p3.m938c(fieldTransform.getFieldPath().canonicalString());
            C0403d c0403dM798k2 = C0406e.m798k();
            c0403dM798k2.m787b(((ArrayTransformOperation.Remove) operation).getElements());
            c0451yM509p3.m940e(c0403dM798k2);
            return (C0343A) c0451yM509p3.m12341build();
        }
        if (!(operation instanceof NumericIncrementTransformOperation)) {
            throw Assert.fail("Unknown transform: %s", operation);
        }
        C0451y c0451yM509p4 = C0343A.m509p();
        c0451yM509p4.m938c(fieldTransform.getFieldPath().canonicalString());
        c0451yM509p4.m939d(((NumericIncrementTransformOperation) operation).getOperand());
        return (C0343A) c0451yM509p4.m12341build();
    }

    private C0348C0 encodeFilters(List<Filter> list) {
        return encodeFilter(new CompositeFilter(list, CompositeFilter.Operator.AND));
    }

    @Nullable
    private String encodeLabel(QueryPurpose queryPurpose) {
        int i2 = C59521.$SwitchMap$com$google$firebase$firestore$local$QueryPurpose[queryPurpose.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return "existence-filter-mismatch";
        }
        if (i2 == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i2 == 4) {
            return "limbo-document";
        }
        throw Assert.fail("Unrecognized query purpose: %s", queryPurpose);
    }

    private C0352E0 encodeOrderBy(OrderBy orderBy) {
        C0350D0 c0350d0M544i = C0352E0.m544i();
        if (orderBy.getDirection().equals(OrderBy.Direction.ASCENDING)) {
            c0350d0M544i.m536b(EnumC0444u0.ASCENDING);
        } else {
            c0350d0M544i.m536b(EnumC0444u0.DESCENDING);
        }
        c0350d0M544i.m537c(encodeFieldPath(orderBy.getField()));
        return (C0352E0) c0350d0M544i.m12341build();
    }

    private C0390Y encodePrecondition(Precondition precondition) {
        Assert.hardAssert(!precondition.isNone(), "Can't serialize an empty precondition", new Object[0]);
        C0388X c0388xM708k = C0390Y.m708k();
        if (precondition.getUpdateTime() != null) {
            c0388xM708k.m685c(encodeVersion(precondition.getUpdateTime()));
            return (C0390Y) c0388xM708k.m12341build();
        }
        if (precondition.getExists() == null) {
            throw Assert.fail("Unknown Precondition", new Object[0]);
        }
        c0388xM708k.m684b(precondition.getExists().booleanValue());
        return (C0390Y) c0388xM708k.m12341build();
    }

    private String encodeQueryPath(ResourcePath resourcePath) {
        return encodeResourceName(this.databaseId, resourcePath);
    }

    private String encodeResourceName(DatabaseId databaseId, ResourcePath resourcePath) {
        return encodedDatabaseId(databaseId).append("documents").append(resourcePath).canonicalString();
    }

    private C0348C0 encodeUnaryFilter(C0454z0 c0454z0, EnumC0358H0 enumC0358H0) {
        C0356G0 c0356g0M571j = C0360I0.m571j();
        c0356g0M571j.m563b(c0454z0);
        c0356g0M571j.m564c(enumC0358H0);
        C0344A0 c0344a0M527m = C0348C0.m527m();
        c0344a0M527m.m518d(c0356g0M571j);
        return (C0348C0) c0344a0M527m.m12341build();
    }

    private static ResourcePath encodedDatabaseId(DatabaseId databaseId) {
        return ResourcePath.fromSegments(Arrays.asList("projects", databaseId.getProjectId(), "databases", databaseId.getDatabaseId()));
    }

    private static ResourcePath extractLocalPathFromResourceName(ResourcePath resourcePath) {
        Assert.hardAssert(resourcePath.length() > 4 && resourcePath.getSegment(4).equals("documents"), "Tried to deserialize invalid key %s", resourcePath);
        return resourcePath.popFirst(5);
    }

    private C0589w0 fromStatus(C0493a c0493a) {
        return C0589w0.m1349c(c0493a.m1180e()).m1354g(c0493a.m1181g());
    }

    private static boolean isValidResourceName(ResourcePath resourcePath) {
        return resourcePath.length() >= 4 && resourcePath.getSegment(0).equals("projects") && resourcePath.getSegment(2).equals("databases");
    }

    public DatabaseId databaseId() {
        return this.databaseId;
    }

    public String databaseName() {
        return this.databaseName;
    }

    @VisibleForTesting
    public CompositeFilter decodeCompositeFilter(C0442t0 c0442t0) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c0442t0.m912h().iterator();
        while (it.hasNext()) {
            arrayList.add(decodeFilter((C0348C0) it.next()));
        }
        return new CompositeFilter(arrayList, decodeCompositeFilterOperator(c0442t0.m913i()));
    }

    public CompositeFilter.Operator decodeCompositeFilterOperator(EnumC0440s0 enumC0440s0) {
        int i2 = C59521.f23922xa1a70d7e[enumC0440s0.ordinal()];
        if (i2 == 1) {
            return CompositeFilter.Operator.AND;
        }
        if (i2 == 2) {
            return CompositeFilter.Operator.OR;
        }
        throw Assert.fail("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    public Target decodeDocumentsTarget(C0368M0 c0368m0) {
        int iM623h = c0368m0.m623h();
        Assert.hardAssert(iM623h == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(iM623h));
        return Query.atPath(decodeQueryPath(c0368m0.m622g())).toTarget();
    }

    @VisibleForTesting
    public FieldFilter decodeFieldFilter(C0450x0 c0450x0) {
        return FieldFilter.create(FieldPath.fromServerFormat(c0450x0.m934i().m946g()), decodeFieldFilterOperator(c0450x0.m935j()), c0450x0.m936k());
    }

    @VisibleForTesting
    public Filter decodeFilter(C0348C0 c0348c0) {
        int iOrdinal = c0348c0.m530k().ordinal();
        if (iOrdinal == 0) {
            return decodeCompositeFilter(c0348c0.m528h());
        }
        if (iOrdinal == 1) {
            return decodeFieldFilter(c0348c0.m529j());
        }
        if (iOrdinal == 2) {
            return decodeUnaryFilter(c0348c0.m531l());
        }
        throw Assert.fail("Unrecognized Filter.filterType %d", c0348c0.m530k());
    }

    public DocumentKey decodeKey(String str) {
        ResourcePath resourcePathDecodeResourceName = decodeResourceName(str);
        Assert.hardAssert(resourcePathDecodeResourceName.getSegment(1).equals(this.databaseId.getProjectId()), "Tried to deserialize key from different project.", new Object[0]);
        Assert.hardAssert(resourcePathDecodeResourceName.getSegment(3).equals(this.databaseId.getDatabaseId()), "Tried to deserialize key from different database.", new Object[0]);
        return DocumentKey.fromPath(extractLocalPathFromResourceName(resourcePathDecodeResourceName));
    }

    public MutableDocument decodeMaybeDocument(C0418i c0418i) {
        String str;
        if (AbstractC6468c.m12192a(c0418i.m831h(), 1)) {
            return decodeFoundDocument(c0418i);
        }
        if (AbstractC6468c.m12192a(c0418i.m831h(), 2)) {
            return decodeMissingDocument(c0418i);
        }
        int iM831h = c0418i.m831h();
        if (iM831h == 1) {
            str = "FOUND";
        } else if (iM831h != 2) {
            str = iM831h != 3 ? "null" : "RESULT_NOT_SET";
        } else {
            str = "MISSING";
        }
        throw new IllegalArgumentException("Unknown result case: ".concat(str));
    }

    public Mutation decodeMutation(C0402c1 c0402c1) {
        Precondition preconditionDecodePrecondition = c0402c1.m783s() ? decodePrecondition(c0402c1.m775k()) : Precondition.NONE;
        ArrayList arrayList = new ArrayList();
        Iterator it = c0402c1.m781q().iterator();
        while (it.hasNext()) {
            arrayList.add(decodeFieldTransform((C0343A) it.next()));
        }
        int iOrdinal = c0402c1.m777m().ordinal();
        if (iOrdinal == 0) {
            return c0402c1.m786v() ? new PatchMutation(decodeKey(c0402c1.m779o().getName()), ObjectValue.fromMap(c0402c1.m779o().m901j()), decodeDocumentMask(c0402c1.m780p()), preconditionDecodePrecondition, arrayList) : new SetMutation(decodeKey(c0402c1.m779o().getName()), ObjectValue.fromMap(c0402c1.m779o().m901j()), preconditionDecodePrecondition, arrayList);
        }
        if (iOrdinal == 1) {
            return new DeleteMutation(decodeKey(c0402c1.m776l()), preconditionDecodePrecondition);
        }
        if (iOrdinal == 2) {
            return new VerifyMutation(decodeKey(c0402c1.m782r()), preconditionDecodePrecondition);
        }
        throw Assert.fail("Unknown mutation operation: %d", c0402c1.m777m());
    }

    public MutationResult decodeMutationResult(C0420i1 c0420i1, SnapshotVersion snapshotVersion) {
        SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(c0420i1.m839g());
        if (!SnapshotVersion.NONE.equals(snapshotVersionDecodeVersion)) {
            snapshotVersion = snapshotVersionDecodeVersion;
        }
        int iM838f = c0420i1.m838f();
        ArrayList arrayList = new ArrayList(iM838f);
        for (int i2 = 0; i2 < iM838f; i2++) {
            arrayList.add(c0420i1.m837e(i2));
        }
        return new MutationResult(snapshotVersion, arrayList);
    }

    public RealtimePipeline decodePipelineQueryTarget(C0372O0 c0372o0) {
        String str;
        boolean z = c0372o0.m640g() == 1;
        int iM640g = c0372o0.m640g();
        if (iM640g != 1) {
            str = iM640g != 2 ? "null" : "PIPELINETYPE_NOT_SET";
        } else {
            str = "STRUCTURED_PIPELINE";
        }
        Assert.hardAssert(z, "Unknown pipeline_type in PipelineQueryTarget: ".concat(str), new Object[0]);
        C0386W c0386wM868h = c0372o0.m641h().m868h();
        ArrayList arrayList = new ArrayList();
        Iterator it = c0386wM868h.m683g().iterator();
        while (it.hasNext()) {
            arrayList.add(decodeStage((C0384V) it.next()));
        }
        return new RealtimePipeline(null, this, new UserDataReader(databaseId()), arrayList, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public Target decodeQueryTarget(String str, C0362J0 c0362j0) {
        ResourcePath resourcePath;
        String strM891h;
        ?? arrayList;
        ResourcePath resourcePathDecodeQueryPath = decodeQueryPath(str);
        int iM590n = c0362j0.m590n();
        if (iM590n <= 0) {
            resourcePath = resourcePathDecodeQueryPath;
            strM891h = null;
        } else {
            Assert.hardAssert(iM590n == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            C0436q0 c0436q0M589m = c0362j0.m589m();
            if (c0436q0M589m.m890g()) {
                resourcePath = resourcePathDecodeQueryPath;
                strM891h = c0436q0M589m.m891h();
            } else {
                resourcePathDecodeQueryPath = resourcePathDecodeQueryPath.append(c0436q0M589m.m891h());
                resourcePath = resourcePathDecodeQueryPath;
                strM891h = null;
            }
        }
        List<Filter> listDecodeFilters = c0362j0.m599w() ? decodeFilters(c0362j0.m595s()) : Collections.EMPTY_LIST;
        int iM593q = c0362j0.m593q();
        if (iM593q > 0) {
            arrayList = new ArrayList(iM593q);
            for (int i2 = 0; i2 < iM593q; i2++) {
                arrayList.add(decodeOrderBy(c0362j0.m592p(i2)));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return new Target(resourcePath, strM891h, listDecodeFilters, arrayList, c0362j0.m597u() ? c0362j0.m591o().m11809g() : -1L, c0362j0.m598v() ? new Bound(c0362j0.m594r().getValuesList(), c0362j0.m594r().m881g()) : null, c0362j0.m596t() ? new Bound(c0362j0.m588l().getValuesList(), !c0362j0.m588l().m881g()) : null);
    }

    public Timestamp decodeTimestamp(C6197S0 c6197s0) {
        return new Timestamp(c6197s0.m11820i(), c6197s0.m11819h());
    }

    public SnapshotVersion decodeVersion(C6197S0 c6197s0) {
        return (c6197s0.m11820i() == 0 && c6197s0.m11819h() == 0) ? SnapshotVersion.NONE : new SnapshotVersion(decodeTimestamp(c6197s0));
    }

    public SnapshotVersion decodeVersionFromListenResponse(C0369N c0369n) {
        if (c0369n.m629j() != 1) {
            return SnapshotVersion.NONE;
        }
        return c0369n.m630k().m673h() != 0 ? SnapshotVersion.NONE : decodeVersion(c0369n.m630k().getReadTime());
    }

    public WatchChange decodeWatchChange(C0369N c0369n) {
        WatchChange.WatchTargetChangeType watchTargetChangeType;
        int iM12193b = AbstractC6468c.m12193b(c0369n.m629j());
        C0589w0 c0589w0FromStatus = null;
        if (iM12193b == 0) {
            C0381T0 c0381t0M630k = c0369n.m630k();
            int iOrdinal = c0381t0M630k.m672g().ordinal();
            if (iOrdinal == 0) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.NoChange;
            } else if (iOrdinal == 1) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Added;
            } else if (iOrdinal == 2) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Removed;
                c0589w0FromStatus = fromStatus(c0381t0M630k.m671e());
            } else if (iOrdinal == 3) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Current;
            } else {
                if (iOrdinal != 4) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Reset;
            }
            return new WatchChange.WatchTargetChange(watchTargetChangeType, c0381t0M630k.m674i(), c0381t0M630k.getResumeToken(), c0589w0FromStatus);
        }
        if (iM12193b == 1) {
            C0441t c0441tM625f = c0369n.m625f();
            InterfaceC6206X interfaceC6206XM907g = c0441tM625f.m907g();
            InterfaceC6206X interfaceC6206XM906f = c0441tM625f.m906f();
            DocumentKey documentKeyDecodeKey = decodeKey(c0441tM625f.getDocument().getName());
            SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(c0441tM625f.getDocument().m902k());
            Assert.hardAssert(!snapshotVersionDecodeVersion.equals(SnapshotVersion.NONE), "Got a document change without an update time", new Object[0]);
            MutableDocument mutableDocumentNewFoundDocument = MutableDocument.newFoundDocument(documentKeyDecodeKey, snapshotVersionDecodeVersion, ObjectValue.fromMap(c0441tM625f.getDocument().m901j()));
            return new WatchChange.DocumentChange(interfaceC6206XM907g, interfaceC6206XM906f, mutableDocumentNewFoundDocument.getKey(), mutableDocumentNewFoundDocument);
        }
        if (iM12193b == 2) {
            C0443u c0443uM626g = c0369n.m626g();
            InterfaceC6206X interfaceC6206XM916g = c0443uM626g.m916g();
            MutableDocument mutableDocumentNewNoDocument = MutableDocument.newNoDocument(decodeKey(c0443uM626g.m915f()), decodeVersion(c0443uM626g.getReadTime()));
            return new WatchChange.DocumentChange(Collections.EMPTY_LIST, interfaceC6206XM916g, mutableDocumentNewNoDocument.getKey(), mutableDocumentNewNoDocument);
        }
        if (iM12193b == 3) {
            C0449x c0449xM627h = c0369n.m627h();
            return new WatchChange.DocumentChange(Collections.EMPTY_LIST, c0449xM627h.m928g(), decodeKey(c0449xM627h.m927f()), null);
        }
        if (iM12193b != 4) {
            throw new IllegalArgumentException("Unknown change type set");
        }
        C0353F c0353fM628i = c0369n.m628i();
        return new WatchChange.ExistenceFilterWatchChange(c0353fM628i.getTargetId(), new ExistenceFilter(c0353fM628i.m548e(), c0353fM628i.m549g()));
    }

    @VisibleForTesting
    public C0348C0 encodeCompositeFilter(CompositeFilter compositeFilter) {
        ArrayList arrayList = new ArrayList(compositeFilter.getFilters().size());
        Iterator<Filter> it = compositeFilter.getFilters().iterator();
        while (it.hasNext()) {
            arrayList.add(encodeFilter(it.next()));
        }
        if (arrayList.size() == 1) {
            return (C0348C0) arrayList.get(0);
        }
        C0438r0 c0438r0M911j = C0442t0.m911j();
        c0438r0M911j.m893c(encodeCompositeFilterOperator(compositeFilter.getOperator()));
        c0438r0M911j.m892b(arrayList);
        C0344A0 c0344a0M527m = C0348C0.m527m();
        c0344a0M527m.m516b(c0438r0M911j);
        return (C0348C0) c0344a0M527m.m12341build();
    }

    public EnumC0440s0 encodeCompositeFilterOperator(CompositeFilter.Operator operator) {
        int i2 = C59521.f23917xc2525260[operator.ordinal()];
        if (i2 == 1) {
            return EnumC0440s0.AND;
        }
        if (i2 == 2) {
            return EnumC0440s0.OR;
        }
        throw Assert.fail("Unrecognized composite filter type.", new Object[0]);
    }

    public C0439s encodeDocument(DocumentKey documentKey, ObjectValue objectValue) {
        C0435q c0435qM898n = C0439s.m898n();
        c0435qM898n.m885c(encodeKey(documentKey));
        c0435qM898n.m884b(objectValue.getFieldsMap());
        return (C0439s) c0435qM898n.m12341build();
    }

    public C0368M0 encodeDocumentsTarget(Target target) {
        C0366L0 c0366l0M620i = C0368M0.m620i();
        c0366l0M620i.m611b(encodeQueryPath(target.getPath()));
        return (C0368M0) c0366l0M620i.m12341build();
    }

    @VisibleForTesting
    public C0348C0 encodeFilter(Filter filter) {
        if (filter instanceof FieldFilter) {
            return encodeUnaryOrFieldFilter((FieldFilter) filter);
        }
        if (filter instanceof CompositeFilter) {
            return encodeCompositeFilter((CompositeFilter) filter);
        }
        throw Assert.fail("Unrecognized filter type %s", filter.toString());
    }

    public String encodeKey(DocumentKey documentKey) {
        return encodeResourceName(this.databaseId, documentKey.getPath());
    }

    @Nullable
    public Map<String, String> encodeListenRequestLabels(TargetData targetData) {
        String strEncodeLabel = encodeLabel(targetData.getPurpose());
        if (strEncodeLabel == null) {
            return null;
        }
        HashMap map = new HashMap(1);
        map.put("goog-listen-tags", strEncodeLabel);
        return map;
    }

    public C0402c1 encodeMutation(Mutation mutation) {
        C0396a1 c0396a1M772w = C0402c1.m772w();
        if (mutation instanceof SetMutation) {
            c0396a1M772w.m758e(encodeDocument(mutation.getKey(), ((SetMutation) mutation).getValue()));
        } else if (mutation instanceof PatchMutation) {
            c0396a1M772w.m758e(encodeDocument(mutation.getKey(), ((PatchMutation) mutation).getValue()));
            c0396a1M772w.m759f(encodeDocumentMask(mutation.getFieldMask()));
        } else if (mutation instanceof DeleteMutation) {
            c0396a1M772w.m757d(encodeKey(mutation.getKey()));
        } else {
            if (!(mutation instanceof VerifyMutation)) {
                throw Assert.fail("unknown mutation type %s", mutation.getClass());
            }
            c0396a1M772w.m760g(encodeKey(mutation.getKey()));
        }
        Iterator<FieldTransform> it = mutation.getFieldTransforms().iterator();
        while (it.hasNext()) {
            c0396a1M772w.m755b(encodeFieldTransform(it.next()));
        }
        if (!mutation.getPrecondition().isNone()) {
            c0396a1M772w.m756c(encodePrecondition(mutation.getPrecondition()));
        }
        return (C0402c1) c0396a1M772w.m12341build();
    }

    public C0376Q0 encodeQueryTarget(Target target) {
        C0374P0 c0374p0M654j = C0376Q0.m654j();
        C0432o0 c0432o0M587x = C0362J0.m587x();
        ResourcePath path = target.getPath();
        if (target.getCollectionGroup() != null) {
            Assert.hardAssert(path.length() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            c0374p0M654j.m642b(encodeQueryPath(path));
            C0434p0 c0434p0M889i = C0436q0.m889i();
            c0434p0M889i.m883c(target.getCollectionGroup());
            c0434p0M889i.m882b();
            c0432o0M587x.m871b(c0434p0M889i);
        } else {
            Assert.hardAssert(path.length() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            c0374p0M654j.m642b(encodeQueryPath(path.popLast()));
            C0434p0 c0434p0M889i2 = C0436q0.m889i();
            c0434p0M889i2.m883c(path.getLastSegment());
            c0432o0M587x.m871b(c0434p0M889i2);
        }
        if (target.getFilters().size() > 0) {
            c0432o0M587x.m876g(encodeFilters(target.getFilters()));
        }
        Iterator<OrderBy> it = target.getOrderBy().iterator();
        while (it.hasNext()) {
            c0432o0M587x.m872c(encodeOrderBy(it.next()));
        }
        if (target.hasLimit()) {
            C6187N c6187nM11808h = C6189O.m11808h();
            c6187nM11808h.m11780b((int) target.getLimit());
            c0432o0M587x.m874e(c6187nM11808h);
        }
        if (target.getStartAt() != null) {
            C0431o c0431oM880i = C0433p.m880i();
            c0431oM880i.m869b(target.getStartAt().getPosition());
            c0431oM880i.m870c(target.getStartAt().isInclusive());
            c0432o0M587x.m875f(c0431oM880i);
        }
        if (target.getEndAt() != null) {
            C0431o c0431oM880i2 = C0433p.m880i();
            c0431oM880i2.m869b(target.getEndAt().getPosition());
            c0431oM880i2.m870c(!target.getEndAt().isInclusive());
            c0432o0M587x.m873d(c0431oM880i2);
        }
        c0374p0M654j.m643c(c0432o0M587x);
        return (C0376Q0) c0374p0M654j.m12341build();
    }

    public C0424k0 encodeStructuredAggregationQuery(C0376Q0 c0376q0, List<AggregateField> list, HashMap<String, String> map) {
        C0422j0 c0422j0M851g = C0424k0.m851g();
        c0422j0M851g.m844c(c0376q0.m657i());
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i2 = 1;
        for (AggregateField aggregateField : list) {
            if (!hashSet.contains(aggregateField.getAlias())) {
                hashSet.add(aggregateField.getAlias());
                StringBuilder sb = new StringBuilder("aggregate_");
                int i3 = i2 + 1;
                sb.append(i2);
                String string = sb.toString();
                map.put(string, aggregateField.getAlias());
                C0407e0 c0407e0M836i = C0419i0.m836i();
                C0452y0 c0452y0M945h = C0454z0.m945h();
                c0452y0M945h.m942b(aggregateField.getFieldPath());
                C0454z0 c0454z0 = (C0454z0) c0452y0M945h.m12341build();
                if (aggregateField instanceof AggregateField.CountAggregateField) {
                    c0407e0M836i.m803d(C0410f0.m808e());
                } else if (aggregateField instanceof AggregateField.SumAggregateField) {
                    C0413g0 c0413g0M822f = C0416h0.m822f();
                    c0413g0M822f.m811b(c0454z0);
                    c0407e0M836i.m804e((C0416h0) c0413g0M822f.m12341build());
                } else {
                    if (!(aggregateField instanceof AggregateField.AverageAggregateField)) {
                        throw new RuntimeException("Unsupported aggregation");
                    }
                    C0401c0 c0401c0M793f = C0404d0.m793f();
                    c0401c0M793f.m765b(c0454z0);
                    c0407e0M836i.m802c((C0404d0) c0401c0M793f.m12341build());
                }
                c0407e0M836i.m801b(string);
                arrayList.add((C0419i0) c0407e0M836i.m12341build());
                i2 = i3;
            }
        }
        c0422j0M851g.m843b(arrayList);
        return (C0424k0) c0422j0M851g.m12341build();
    }

    public C0377R0 encodeTarget(TargetData targetData) {
        C0364K0 c0364k0M665l = C0377R0.m665l();
        TargetOrPipeline target = targetData.getTarget();
        if (target.isPipeline()) {
            C0370N0 c0370n0M638i = C0372O0.m638i();
            c0370n0M638i.m631b(target.pipeline$com_google_firebase_firebase_firestore().toStructurePipelineProto$com_google_firebase_firebase_firestore());
            c0364k0M665l.m606d(c0370n0M638i);
        } else if (target.target().isDocumentQuery()) {
            c0364k0M665l.m604b(encodeDocumentsTarget(target.target()));
        } else {
            c0364k0M665l.m607e(encodeQueryTarget(target.target()));
        }
        c0364k0M665l.m610i(targetData.getTargetId());
        if (!targetData.getResumeToken().isEmpty() || targetData.getSnapshotVersion().compareTo(SnapshotVersion.NONE) <= 0) {
            c0364k0M665l.m609g(targetData.getResumeToken());
        } else {
            c0364k0M665l.m608f(encodeTimestamp(targetData.getSnapshotVersion().getTimestamp()));
        }
        if (targetData.getExpectedCount() != null && (!targetData.getResumeToken().isEmpty() || targetData.getSnapshotVersion().compareTo(SnapshotVersion.NONE) > 0)) {
            C6187N c6187nM11808h = C6189O.m11808h();
            c6187nM11808h.m11780b(targetData.getExpectedCount().intValue());
            c0364k0M665l.m605c(c6187nM11808h);
        }
        return (C0377R0) c0364k0M665l.m12341build();
    }

    public C6197S0 encodeTimestamp(Timestamp timestamp) {
        C6195R0 c6195r0M11817j = C6197S0.m11817j();
        c6195r0M11817j.m11813c(timestamp.getSeconds());
        c6195r0M11817j.m11812b(timestamp.getNanoseconds());
        return (C6197S0) c6195r0M11817j.m12341build();
    }

    @VisibleForTesting
    public C0348C0 encodeUnaryOrFieldFilter(FieldFilter fieldFilter) {
        FieldFilter.Operator operator = fieldFilter.getOperator();
        C0393Z0 value = fieldFilter.getValue();
        C0454z0 c0454z0EncodeFieldPath = encodeFieldPath(fieldFilter.getField());
        if (operator == FieldFilter.Operator.EQUAL) {
            if (Values.isNanValue(value)) {
                return encodeUnaryFilter(c0454z0EncodeFieldPath, EnumC0358H0.IS_NAN);
            }
            if (Values.isNullValue(value)) {
                return encodeUnaryFilter(c0454z0EncodeFieldPath, EnumC0358H0.IS_NULL);
            }
        } else if (operator == FieldFilter.Operator.NOT_EQUAL) {
            if (Values.isNanValue(value)) {
                return encodeUnaryFilter(c0454z0EncodeFieldPath, EnumC0358H0.IS_NOT_NAN);
            }
            if (Values.isNullValue(value)) {
                return encodeUnaryFilter(c0454z0EncodeFieldPath, EnumC0358H0.IS_NOT_NULL);
            }
        }
        C0446v0 c0446v0M933l = C0450x0.m933l();
        c0446v0M933l.m918b(c0454z0EncodeFieldPath);
        c0446v0M933l.m919c(encodeFieldFilterOperator(operator));
        c0446v0M933l.m920d(value);
        C0344A0 c0344a0M527m = C0348C0.m527m();
        c0344a0M527m.m517c(c0446v0M933l);
        return (C0348C0) c0344a0M527m.m12341build();
    }

    public C6197S0 encodeVersion(SnapshotVersion snapshotVersion) {
        return encodeTimestamp(snapshotVersion.getTimestamp());
    }

    public boolean isLocalResourceName(ResourcePath resourcePath) {
        return isValidResourceName(resourcePath) && resourcePath.getSegment(1).equals(this.databaseId.getProjectId()) && resourcePath.getSegment(3).equals(this.databaseId.getDatabaseId());
    }

    public Target decodeQueryTarget(C0376Q0 c0376q0) {
        return decodeQueryTarget(c0376q0.m656h(), c0376q0.m657i());
    }
}
