package com.google.firebase.firestore.pipeline;

import com.google.firebase.Timestamp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.Blob;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.Pipeline;
import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.VectorValue;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt;
import com.google.firebase.firestore.pipeline.evaluation.ArrayKt;
import com.google.firebase.firestore.pipeline.evaluation.ComparisonKt;
import com.google.firebase.firestore.pipeline.evaluation.DebugKt;
import com.google.firebase.firestore.pipeline.evaluation.EvaluateResultValue;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.firebase.firestore.pipeline.evaluation.GenericsKt;
import com.google.firebase.firestore.pipeline.evaluation.LogicalKt;
import com.google.firebase.firestore.pipeline.evaluation.MapsKt;
import com.google.firebase.firestore.pipeline.evaluation.Strings;
import com.google.firebase.firestore.pipeline.evaluation.TimestampKt;
import com.google.firebase.firestore.pipeline.evaluation.UtilsKt;
import com.google.firebase.firestore.pipeline.evaluation.VectorKt;
import com.google.firebase.firestore.util.CustomClassMapper;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p014I0.C0313b;
import p022N.C0393Z0;
import p034T.C0783s0;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6311s;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Expression {
    public static final Companion Companion = new Companion(null);
    private static final Expression NULL = new Constant(Values.NULL_VALUE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private final Expression pojoToExprOrConstant(Object obj) {
            Expression pipelineValueExpression;
            if (obj == null) {
                pipelineValueExpression = Expression.NULL;
            } else if (obj instanceof Expression) {
                pipelineValueExpression = (Expression) obj;
            } else if (obj instanceof String) {
                pipelineValueExpression = constant((String) obj);
            } else if (obj instanceof Number) {
                pipelineValueExpression = constant((Number) obj);
            } else if (obj instanceof Date) {
                pipelineValueExpression = constant((Date) obj);
            } else if (obj instanceof Timestamp) {
                pipelineValueExpression = constant((Timestamp) obj);
            } else if (obj instanceof Boolean) {
                pipelineValueExpression = constant(((Boolean) obj).booleanValue());
            } else if (obj instanceof GeoPoint) {
                pipelineValueExpression = constant((GeoPoint) obj);
            } else if (obj instanceof Blob) {
                pipelineValueExpression = constant((Blob) obj);
            } else if (obj instanceof DocumentReference) {
                pipelineValueExpression = constant((DocumentReference) obj);
            } else if (obj instanceof byte[]) {
                pipelineValueExpression = constant((byte[]) obj);
            } else if (obj instanceof VectorValue) {
                pipelineValueExpression = constant((VectorValue) obj);
            } else if (obj instanceof C0393Z0) {
                pipelineValueExpression = new Constant((C0393Z0) obj);
            } else if (obj instanceof Map) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        throw new IllegalArgumentException("Maps with non-string keys are not supported");
                    }
                    AbstractC6311s.m12124v(AbstractC6306n.m12120r(Expression.Companion.constant((String) key), pojoToExprOrConstant(entry.getValue())), arrayList);
                }
                pipelineValueExpression = map$com_google_firebase_firebase_firestore((Expression[]) arrayList.toArray(new Expression[0]));
            } else if (obj instanceof List) {
                pipelineValueExpression = array((List<? extends Object>) obj);
            } else {
                pipelineValueExpression = obj instanceof Pipeline ? new PipelineValueExpression((Pipeline) obj) : null;
            }
            if (pipelineValueExpression != null) {
                return pipelineValueExpression;
            }
            throw new IllegalArgumentException("Unknown type: " + obj);
        }

        private final Expression[] toArrayOfExprOrConstant(Iterable<? extends Object> iterable) {
            ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(iterable, 10));
            Iterator<? extends Object> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(toExprOrConstant$com_google_firebase_firebase_firestore(it.next()));
            }
            return (Expression[]) arrayList.toArray(new Expression[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Expression toExpr(Object obj, InterfaceC6498l interfaceC6498l) {
            if (obj == null) {
                return Expression.NULL;
            }
            if (obj instanceof Expression) {
                return (Expression) obj;
            }
            if (obj instanceof String) {
                return constant((String) obj);
            }
            if (obj instanceof Number) {
                return constant((Number) obj);
            }
            if (obj instanceof Date) {
                return constant((Date) obj);
            }
            if (obj instanceof Timestamp) {
                return constant((Timestamp) obj);
            }
            if (obj instanceof Boolean) {
                return constant(((Boolean) obj).booleanValue());
            }
            if (obj instanceof GeoPoint) {
                return constant((GeoPoint) obj);
            }
            if (obj instanceof Blob) {
                return constant((Blob) obj);
            }
            if (obj instanceof DocumentReference) {
                return constant((DocumentReference) obj);
            }
            if (obj instanceof byte[]) {
                return constant((byte[]) obj);
            }
            if (obj instanceof VectorValue) {
                return constant((VectorValue) obj);
            }
            if (obj instanceof C0393Z0) {
                return new Constant((C0393Z0) obj);
            }
            if (!(obj instanceof Map)) {
                if (obj instanceof List) {
                    return array((List<? extends Object>) obj);
                }
                if (obj instanceof Pipeline) {
                    return new PipelineValueExpression((Pipeline) obj);
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException("Maps with non-string keys are not supported");
                }
                AbstractC6311s.m12124v(AbstractC6306n.m12120r(Expression.Companion.constant((String) key), interfaceC6498l.invoke(entry.getValue())), arrayList);
            }
            return map$com_google_firebase_firebase_firestore((Expression[]) arrayList.toArray(new Expression[0]));
        }

        public final Expression abs(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("abs", ArithmeticKt.getEvaluateAbs(), numericExpr);
        }

        public final Expression add(Expression first, Expression second) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("add", ArithmeticKt.getEvaluateAdd(), first, second);
        }

        public final BooleanExpression and(BooleanExpression condition, BooleanExpression... conditions) {
            AbstractC6452k.m12181e(condition, "condition");
            AbstractC6452k.m12181e(conditions, "conditions");
            return new BooleanFunctionExpression("and", LogicalKt.getEvaluateAnd(), (Expression) condition, Arrays.copyOf(conditions, conditions.length));
        }

        public final Expression array(Object... elements) {
            AbstractC6452k.m12181e(elements, "elements");
            InterfaceC6498l evaluateArray = ArrayKt.getEvaluateArray();
            ArrayList arrayList = new ArrayList(elements.length);
            for (Object obj : elements) {
                arrayList.add(toExprOrConstant$com_google_firebase_firebase_firestore(obj));
            }
            return new FunctionExpression("array", evaluateArray, (Expression[]) arrayList.toArray(new Expression[0]), null, 8, null);
        }

        public final Expression arrayConcat(Expression firstArray, Expression secondArray, Object... otherArrays) {
            AbstractC6452k.m12181e(firstArray, "firstArray");
            AbstractC6452k.m12181e(secondArray, "secondArray");
            AbstractC6452k.m12181e(otherArrays, "otherArrays");
            return new FunctionExpression("array_concat", ArrayKt.getEvaluateArrayConcat(), firstArray, secondArray, Arrays.copyOf(otherArrays, otherArrays.length));
        }

        public final BooleanExpression arrayContains(Expression array, Expression element) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(element, "element");
            return new BooleanFunctionExpression("array_contains", ArrayKt.getEvaluateArrayContains(), array, element);
        }

        public final BooleanExpression arrayContainsAll(Expression array, List<? extends Object> values) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(values, "values");
            return arrayContainsAll(array, array(values));
        }

        public final BooleanExpression arrayContainsAny(Expression array, List<? extends Object> values) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(values, "values");
            return new BooleanFunctionExpression("array_contains_any", ArrayKt.getEvaluateArrayContainsAny(), array, array(values));
        }

        public final Expression arrayFilter(Expression array, String alias, BooleanExpression filter) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(alias, "alias");
            AbstractC6452k.m12181e(filter, "filter");
            return new FunctionExpression("array_filter", UtilsKt.getNotImplemented(), array, constant(alias), filter);
        }

        public final Expression arrayFirst(Expression array) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_first", ArrayKt.getEvaluateArrayFirst(), array);
        }

        public final Expression arrayFirstN(Expression array, int i2) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_first_n", ArrayKt.getEvaluateArrayFirstN(), array, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayGet(Expression array, Expression offset) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(offset, "offset");
            return new FunctionExpression("array_get", ArrayKt.getEvaluateArrayGet(), array, offset);
        }

        public final Expression arrayIndexOf(Expression array, Object obj) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_index_of", ArrayKt.getEvaluateArrayIndexOf(), array, toExprOrConstant$com_google_firebase_firebase_firestore(obj), constant("first"));
        }

        public final Expression arrayIndexOfAll(Expression array, Object obj) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_index_of_all", ArrayKt.getEvaluateArrayIndexOfAll(), array, toExprOrConstant$com_google_firebase_firebase_firestore(obj));
        }

        public final Expression arrayLast(Expression array) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_last", ArrayKt.getEvaluateArrayLast(), array);
        }

        public final Expression arrayLastIndexOf(Expression array, Object obj) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_index_of", ArrayKt.getEvaluateArrayIndexOf(), array, toExprOrConstant$com_google_firebase_firebase_firestore(obj), constant("last"));
        }

        public final Expression arrayLastN(Expression array, int i2) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_last_n", ArrayKt.getEvaluateArrayLastN(), array, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayLength(Expression array) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_length", ArrayKt.getEvaluateArrayLength(), array);
        }

        public final Expression arrayMaximum(Expression array) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("maximum", ArrayKt.getEvaluateArrayMaximum(), array);
        }

        public final Expression arrayMaximumN(Expression array, int i2) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("maximum_n", ArrayKt.getEvaluateArrayMaximumN(), array, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayMinimum(Expression array) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("minimum", ArrayKt.getEvaluateArrayMinimum(), array);
        }

        public final Expression arrayMinimumN(Expression array, int i2) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("minimum_n", ArrayKt.getEvaluateArrayMinimumN(), array, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayReverse(Expression array) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_reverse", ArrayKt.getEvaluateArrayReverse(), array);
        }

        public final Expression arraySlice(Expression array, int i2, int i3) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), array, toExprOrConstant$com_google_firebase_firebase_firestore(Integer.valueOf(i2)), toExprOrConstant$com_google_firebase_firebase_firestore(Integer.valueOf(i3)));
        }

        public final Expression arraySliceToEnd(Expression array, int i2) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), array, toExprOrConstant$com_google_firebase_firebase_firestore(Integer.valueOf(i2)));
        }

        public final Expression arraySum(Expression array) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("sum", UtilsKt.getNotImplemented(), array);
        }

        public final Expression arrayTransform(Expression array, String elementAlias, Expression transform) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(elementAlias, "elementAlias");
            AbstractC6452k.m12181e(transform, "transform");
            return new FunctionExpression("array_transform", UtilsKt.getNotImplemented(), array, constant(elementAlias), transform);
        }

        public final Expression arrayTransformWithIndex(Expression array, String elementAlias, String indexAlias, Expression transform) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(elementAlias, "elementAlias");
            AbstractC6452k.m12181e(indexAlias, "indexAlias");
            AbstractC6452k.m12181e(transform, "transform");
            return new FunctionExpression("array_transform", UtilsKt.getNotImplemented(), array, constant(elementAlias), constant(indexAlias), transform);
        }

        public final Expression bitAnd(Expression bits, Expression bitsOther) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_and", UtilsKt.getNotImplemented(), bits, bitsOther);
        }

        public final Expression bitLeftShift(Expression bits, Expression numberExpr) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(numberExpr, "numberExpr");
            return new FunctionExpression("bit_left_shift", UtilsKt.getNotImplemented(), bits, numberExpr);
        }

        public final Expression bitNot(Expression bits) {
            AbstractC6452k.m12181e(bits, "bits");
            return new FunctionExpression("bit_not", UtilsKt.getNotImplemented(), bits);
        }

        public final Expression bitOr(Expression bits, Expression bitsOther) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_or", UtilsKt.getNotImplemented(), bits, bitsOther);
        }

        public final Expression bitRightShift(Expression bits, Expression numberExpr) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(numberExpr, "numberExpr");
            return new FunctionExpression("bit_right_shift", UtilsKt.getNotImplemented(), bits, numberExpr);
        }

        public final Expression bitXor(Expression bits, Expression bitsOther) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_xor", UtilsKt.getNotImplemented(), bits, bitsOther);
        }

        public final Expression byteLength(Expression value) {
            AbstractC6452k.m12181e(value, "value");
            return new FunctionExpression("byte_length", Strings.getEvaluateByteLength(), value);
        }

        public final Expression ceil(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("ceil", ArithmeticKt.getEvaluateCeil(), numericExpr);
        }

        public final Expression charLength(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("char_length", Strings.getEvaluateCharLength(), expr);
        }

        public final Expression coalesce(Expression expression, Object replacement, Object... others) {
            AbstractC6452k.m12181e(expression, "expression");
            AbstractC6452k.m12181e(replacement, "replacement");
            AbstractC6452k.m12181e(others, "others");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(replacement);
            c0783s0.m1658b(others);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("coalesce", notImplemented, expression, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression collectionId(Expression path) {
            AbstractC6452k.m12181e(path, "path");
            return new FunctionExpression("collection_id", UtilsKt.getNotImplemented(), path);
        }

        public final Expression concat(Expression first, Expression second, Object... others) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            AbstractC6452k.m12181e(others, "others");
            return new FunctionExpression("concat", GenericsKt.getEvaluateConcat(), first, second, Arrays.copyOf(others, others.length));
        }

        public final Expression conditional(BooleanExpression condition, Expression thenExpr, Expression elseExpr) {
            AbstractC6452k.m12181e(condition, "condition");
            AbstractC6452k.m12181e(thenExpr, "thenExpr");
            AbstractC6452k.m12181e(elseExpr, "elseExpr");
            return new FunctionExpression("conditional", LogicalKt.getEvaluateCond(), condition, thenExpr, elseExpr);
        }

        public final Expression constant(String value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Expression cosineDistance(Expression vector1, Expression vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("cosine_distance", VectorKt.getEvaluateCosineDistance(), vector1, vector2);
        }

        public final Expression currentDocument() {
            return new FunctionExpression("current_document", UtilsKt.getNotImplemented());
        }

        public final Expression currentTimestamp() {
            return new FunctionExpression("current_timestamp", UtilsKt.getNotImplemented());
        }

        public final Expression divide(Expression dividend, Expression divisor) {
            AbstractC6452k.m12181e(dividend, "dividend");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("divide", ArithmeticKt.getEvaluateDivide(), dividend, divisor);
        }

        public final Expression documentId(Expression documentPath) {
            AbstractC6452k.m12181e(documentPath, "documentPath");
            return new FunctionExpression("document_id", UtilsKt.getNotImplemented(), documentPath);
        }

        public final BooleanExpression documentMatches(String rquery) {
            AbstractC6452k.m12181e(rquery, "rquery");
            return new BooleanFunctionExpression("document_matches", UtilsKt.getNotImplemented(), constant(rquery));
        }

        public final Expression dotProduct(Expression vector1, Expression vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("dot_product", VectorKt.getEvaluateDotProductDistance(), vector1, vector2);
        }

        public final BooleanExpression endsWith(Expression stringExpr, Expression suffix) {
            AbstractC6452k.m12181e(stringExpr, "stringExpr");
            AbstractC6452k.m12181e(suffix, "suffix");
            return new BooleanFunctionExpression("ends_with", Strings.getEvaluateEndsWith(), stringExpr, suffix);
        }

        public final BooleanExpression equal(Expression left, Expression right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("equal", ComparisonKt.getEvaluateEq(), left, right);
        }

        public final BooleanExpression equalAny(Expression expression, List<? extends Object> values) {
            AbstractC6452k.m12181e(expression, "expression");
            AbstractC6452k.m12181e(values, "values");
            return equalAny(expression, array(values));
        }

        public final Expression error$com_google_firebase_firebase_firestore(String message) {
            AbstractC6452k.m12181e(message, "message");
            return new FunctionExpression(Constants.IPC_BUNDLE_KEY_SEND_ERROR, DebugKt.getEvaluateError(), constant(message));
        }

        public final Expression euclideanDistance(Expression vector1, Expression vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("euclidean_distance", VectorKt.getEvaluateEuclideanDistance(), vector1, vector2);
        }

        public final BooleanExpression exists(Expression value) {
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("exists", DebugKt.getEvaluateExists(), value);
        }

        public final Expression exp(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("exp", ArithmeticKt.getEvaluateExp(), numericExpr);
        }

        public final Field field(String name) {
            AbstractC6452k.m12181e(name, "name");
            int iHashCode = name.hashCode();
            if (iHashCode != -1178228688) {
                if (iHashCode != -625729597) {
                    if (iHashCode == -281103477 && name.equals(DocumentKey.KEY_FIELD_NAME)) {
                        FieldPath KEY_PATH = FieldPath.KEY_PATH;
                        AbstractC6452k.m12180d(KEY_PATH, "KEY_PATH");
                        return new Field(KEY_PATH);
                    }
                } else if (name.equals(FieldPath.UPDATE_TIME_NAME)) {
                    FieldPath UPDATE_TIME_PATH = FieldPath.UPDATE_TIME_PATH;
                    AbstractC6452k.m12180d(UPDATE_TIME_PATH, "UPDATE_TIME_PATH");
                    return new Field(UPDATE_TIME_PATH);
                }
            } else if (name.equals(FieldPath.CREATE_TIME_NAME)) {
                FieldPath CREATE_TIME_PATH = FieldPath.CREATE_TIME_PATH;
                AbstractC6452k.m12180d(CREATE_TIME_PATH, "CREATE_TIME_PATH");
                return new Field(CREATE_TIME_PATH);
            }
            FieldPath internalPath = com.google.firebase.firestore.FieldPath.fromDotSeparatedPath(name).getInternalPath();
            AbstractC6452k.m12180d(internalPath, "getInternalPath(...)");
            return new Field(internalPath);
        }

        public final Expression floor(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("floor", ArithmeticKt.getEvaluateFloor(), numericExpr);
        }

        public final Expression geoDistance(String fieldName, GeoPoint location) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(location, "location");
            return geoDistance(field(fieldName), location);
        }

        public final Expression getField(Expression expression, String key) {
            AbstractC6452k.m12181e(expression, "expression");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("get_field", UtilsKt.getNotImplemented(), expression, key);
        }

        public final BooleanExpression greaterThan(Expression left, Expression right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("greater_than", ComparisonKt.getEvaluateGt(), left, right);
        }

        public final BooleanExpression greaterThanOrEqual(Expression left, Expression right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("greater_than_or_equal", ComparisonKt.getEvaluateGte(), left, right);
        }

        public final Expression ifAbsent(Expression ifExpr, Expression elseExpr) {
            AbstractC6452k.m12181e(ifExpr, "ifExpr");
            AbstractC6452k.m12181e(elseExpr, "elseExpr");
            return new FunctionExpression("if_absent", UtilsKt.getNotImplemented(), ifExpr, elseExpr);
        }

        public final Expression ifError(Expression tryExpr, Expression catchExpr) {
            AbstractC6452k.m12181e(tryExpr, "tryExpr");
            AbstractC6452k.m12181e(catchExpr, "catchExpr");
            return new FunctionExpression("if_error", UtilsKt.getNotImplemented(), tryExpr, catchExpr);
        }

        public final Expression ifNull(Expression ifExpr, Expression elseExpr) {
            AbstractC6452k.m12181e(ifExpr, "ifExpr");
            AbstractC6452k.m12181e(elseExpr, "elseExpr");
            return new FunctionExpression("if_null", UtilsKt.getNotImplemented(), ifExpr, elseExpr);
        }

        public final BooleanExpression isAbsent(Expression value) {
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("is_absent", DebugKt.getEvaluateIsAbsent(), value);
        }

        public final BooleanExpression isError(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new BooleanFunctionExpression("is_error", DebugKt.getEvaluateIsError(), expr);
        }

        public final BooleanExpression isType(Expression expr, String type) {
            AbstractC6452k.m12181e(expr, "expr");
            AbstractC6452k.m12181e(type, "type");
            return new BooleanFunctionExpression("is_type", UtilsKt.getNotImplemented(), expr, constant(type));
        }

        public final Expression join(Expression arrayExpression, String delimiter) {
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("join", ArrayKt.getEvaluateJoin(), arrayExpression, constant(delimiter));
        }

        public final Expression length(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("length", GenericsKt.getEvaluateLength(), expr);
        }

        public final BooleanExpression lessThan(Expression left, Expression right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("less_than", ComparisonKt.getEvaluateLt(), left, right);
        }

        public final BooleanExpression lessThanOrEqual(Expression left, Expression right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("less_than_or_equal", ComparisonKt.getEvaluateLte(), left, right);
        }

        public final BooleanExpression like(Expression stringExpression, Expression pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("like", Strings.getEvaluateLike(), stringExpression, pattern);
        }

        /* JADX INFO: renamed from: ln */
        public final Expression m11446ln(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("ln", ArithmeticKt.getEvaluateLn(), numericExpr);
        }

        public final Expression log(Expression numericExpr, Number base) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            AbstractC6452k.m12181e(base, "base");
            return new FunctionExpression("log", ArithmeticKt.getEvaluateLog(), numericExpr, constant(base));
        }

        public final Expression log10(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("log10", ArithmeticKt.getEvaluateLog10(), numericExpr);
        }

        public final Expression logicalMaximum(Expression expr, Object... others) {
            AbstractC6452k.m12181e(expr, "expr");
            AbstractC6452k.m12181e(others, "others");
            return new FunctionExpression("maximum", LogicalKt.getEvaluateLogicalMaximum(), expr, Arrays.copyOf(others, others.length));
        }

        public final Expression logicalMinimum(Expression expr, Object... others) {
            AbstractC6452k.m12181e(expr, "expr");
            AbstractC6452k.m12181e(others, "others");
            return new FunctionExpression("minimum", LogicalKt.getEvaluateLogicalMinimum(), expr, Arrays.copyOf(others, others.length));
        }

        public final Expression ltrim(Expression stringExpression) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            return new FunctionExpression("ltrim", UtilsKt.getNotImplemented(), stringExpression);
        }

        public final Expression ltrimValue(Expression stringExpression, String valuesToTrim) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("ltrim", UtilsKt.getNotImplemented(), stringExpression, constant(valuesToTrim));
        }

        public final Expression map(Map<String, ? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends Object> entry : elements.entrySet()) {
                Companion companion = Expression.Companion;
                AbstractC6311s.m12124v(AbstractC6306n.m12120r(companion.constant(entry.getKey()), companion.toExprOrConstant$com_google_firebase_firebase_firestore(entry.getValue())), arrayList);
            }
            return map$com_google_firebase_firebase_firestore((Expression[]) arrayList.toArray(new Expression[0]));
        }

        public final Expression map$com_google_firebase_firebase_firestore(Expression[] elements) {
            AbstractC6452k.m12181e(elements, "elements");
            return new FunctionExpression("map", MapsKt.getEvaluateMap(), elements, null, 8, null);
        }

        public final Expression mapEntries(Expression mapExpr) {
            AbstractC6452k.m12181e(mapExpr, "mapExpr");
            return new FunctionExpression("map_entries", UtilsKt.getNotImplemented(), mapExpr);
        }

        public final Expression mapGet(Expression mapExpression, String key) {
            AbstractC6452k.m12181e(mapExpression, "mapExpression");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("map_get", MapsKt.getEvaluateMapGet(), mapExpression, key);
        }

        public final Expression mapKeys(Expression mapExpr) {
            AbstractC6452k.m12181e(mapExpr, "mapExpr");
            return new FunctionExpression("map_keys", UtilsKt.getNotImplemented(), mapExpr);
        }

        public final Expression mapMerge(Expression firstMap, Expression secondMap, Expression... otherMaps) {
            AbstractC6452k.m12181e(firstMap, "firstMap");
            AbstractC6452k.m12181e(secondMap, "secondMap");
            AbstractC6452k.m12181e(otherMaps, "otherMaps");
            return new FunctionExpression("map_merge", UtilsKt.getNotImplemented(), firstMap, secondMap, Arrays.copyOf(otherMaps, otherMaps.length));
        }

        public final Expression mapRemove(Expression mapExpr, Expression key) {
            AbstractC6452k.m12181e(mapExpr, "mapExpr");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("map_remove", UtilsKt.getNotImplemented(), mapExpr, key);
        }

        public final Expression mapSet(Expression mapExpr, Expression key, Expression value, Expression... moreKeyValues) {
            AbstractC6452k.m12181e(mapExpr, "mapExpr");
            AbstractC6452k.m12181e(key, "key");
            AbstractC6452k.m12181e(value, "value");
            AbstractC6452k.m12181e(moreKeyValues, "moreKeyValues");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(value);
            c0783s0.m1658b(moreKeyValues);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("map_set", notImplemented, mapExpr, key, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression mapValues(Expression mapExpr) {
            AbstractC6452k.m12181e(mapExpr, "mapExpr");
            return new FunctionExpression("map_values", UtilsKt.getNotImplemented(), mapExpr);
        }

        public final Expression mod(Expression dividend, Expression divisor) {
            AbstractC6452k.m12181e(dividend, "dividend");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("mod", ArithmeticKt.getEvaluateMod(), dividend, divisor);
        }

        public final Expression multiply(Expression first, Expression second) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("multiply", ArithmeticKt.getEvaluateMultiply(), first, second);
        }

        public final BooleanExpression nor(BooleanExpression condition, BooleanExpression... conditions) {
            AbstractC6452k.m12181e(condition, "condition");
            AbstractC6452k.m12181e(conditions, "conditions");
            return new BooleanFunctionExpression("nor", UtilsKt.getNotImplemented(), (Expression) condition, Arrays.copyOf(conditions, conditions.length));
        }

        public final BooleanExpression not(BooleanExpression condition) {
            AbstractC6452k.m12181e(condition, "condition");
            return new BooleanFunctionExpression("not", ComparisonKt.getEvaluateNot(), condition);
        }

        public final BooleanExpression notEqual(Expression left, Expression right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("not_equal", ComparisonKt.getEvaluateNeq(), left, right);
        }

        public final BooleanExpression notEqualAny(Expression expression, List<? extends Object> values) {
            AbstractC6452k.m12181e(expression, "expression");
            AbstractC6452k.m12181e(values, "values");
            return notEqualAny(expression, array(values));
        }

        public final Expression nullValue() {
            return Expression.NULL;
        }

        /* JADX INFO: renamed from: or */
        public final BooleanExpression m11448or(BooleanExpression condition, BooleanExpression... conditions) {
            AbstractC6452k.m12181e(condition, "condition");
            AbstractC6452k.m12181e(conditions, "conditions");
            return new BooleanFunctionExpression("or", LogicalKt.getEvaluateOr(), (Expression) condition, Arrays.copyOf(conditions, conditions.length));
        }

        public final Expression parent(Expression documentPath) {
            AbstractC6452k.m12181e(documentPath, "documentPath");
            return new FunctionExpression("parent", UtilsKt.getNotImplemented(), documentPath);
        }

        public final Expression pow(Expression numericExpr, Number exponent) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            AbstractC6452k.m12181e(exponent, "exponent");
            return new FunctionExpression("pow", ArithmeticKt.getEvaluatePow(), numericExpr, constant(exponent));
        }

        public final Expression rand() {
            return new FunctionExpression("rand", UtilsKt.getNotImplemented());
        }

        public final Expression rawFunction(String name, Expression... expr) {
            AbstractC6452k.m12181e(name, "name");
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression(name, UtilsKt.getNotImplemented(), expr, null, 8, null);
        }

        public final BooleanExpression regexContains(Expression stringExpression, Expression pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_contains", Strings.getEvaluateRegexContains(), stringExpression, pattern);
        }

        public final Expression regexFind(Expression stringExpression, Expression pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find", Strings.getEvaluateRegexFind(), stringExpression, pattern);
        }

        public final Expression regexFindAll(Expression stringExpression, Expression pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find_all", Strings.getEvaluateRegexFindAll(), stringExpression, pattern);
        }

        public final BooleanExpression regexMatch(Expression stringExpression, Expression pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_match", Strings.getEvaluateRegexMatch(), stringExpression, pattern);
        }

        public final Expression reverse(Expression stringExpression) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            return new FunctionExpression("reverse", Strings.getEvaluateReverse(), stringExpression);
        }

        public final Expression round(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("round", ArithmeticKt.getEvaluateRound(), numericExpr);
        }

        public final Expression roundToPrecision(Expression numericExpr, int i2) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("round", ArithmeticKt.getEvaluateRoundToPrecision(), numericExpr, constant(Integer.valueOf(i2)));
        }

        public final Expression rtrim(Expression stringExpression) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            return new FunctionExpression("rtrim", UtilsKt.getNotImplemented(), stringExpression);
        }

        public final Expression rtrimValue(Expression stringExpression, String valuesToTrim) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("rtrim", UtilsKt.getNotImplemented(), stringExpression, constant(valuesToTrim));
        }

        public final Expression score() {
            return new FunctionExpression(FirebaseAnalytics.Param.SCORE, UtilsKt.getNotImplemented());
        }

        public final Expression split(Expression value, Expression delimiter) {
            AbstractC6452k.m12181e(value, "value");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("split", UtilsKt.getNotImplemented(), value, delimiter);
        }

        public final Expression sqrt(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("sqrt", ArithmeticKt.getEvaluateSqrt(), numericExpr);
        }

        public final BooleanExpression startsWith(Expression stringExpr, Expression prefix) {
            AbstractC6452k.m12181e(stringExpr, "stringExpr");
            AbstractC6452k.m12181e(prefix, "prefix");
            return new BooleanFunctionExpression("starts_with", Strings.getEvaluateStartsWith(), stringExpr, prefix);
        }

        public final Expression stringConcat(Expression firstString, Expression... otherStrings) {
            AbstractC6452k.m12181e(firstString, "firstString");
            AbstractC6452k.m12181e(otherStrings, "otherStrings");
            return new FunctionExpression("string_concat", Strings.getEvaluateStrConcat(), firstString, Arrays.copyOf(otherStrings, otherStrings.length));
        }

        public final BooleanExpression stringContains(Expression stringExpression, Expression substring) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(substring, "substring");
            return new BooleanFunctionExpression("string_contains", Strings.getEvaluateStrContains(), stringExpression, substring);
        }

        public final Expression stringIndexOf(Expression stringExpression, Expression substring) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(substring, "substring");
            return new FunctionExpression("string_index_of", UtilsKt.getNotImplemented(), stringExpression, substring);
        }

        public final Expression stringRepeat(Expression stringExpression, int i2) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            return new FunctionExpression("string_repeat", UtilsKt.getNotImplemented(), stringExpression, constant(Integer.valueOf(i2)));
        }

        public final Expression stringReplaceAll(Expression stringExpression, Expression oldValue, Expression newValue) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_all", UtilsKt.getNotImplemented(), stringExpression, oldValue, newValue);
        }

        public final Expression stringReplaceOne(Expression stringExpression, Expression oldValue, Expression newValue) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_one", UtilsKt.getNotImplemented(), stringExpression, oldValue, newValue);
        }

        public final Expression stringReverse(Expression str) {
            AbstractC6452k.m12181e(str, "str");
            return new FunctionExpression("string_reverse", Strings.getEvaluateStringReverse(), str);
        }

        public final Expression substring(Expression stringExpression, Expression index, Expression length) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(index, "index");
            AbstractC6452k.m12181e(length, "length");
            return new FunctionExpression("substring", Strings.getEvaluateSubstring(), stringExpression, index, length);
        }

        public final Expression subtract(Expression minuend, Expression subtrahend) {
            AbstractC6452k.m12181e(minuend, "minuend");
            AbstractC6452k.m12181e(subtrahend, "subtrahend");
            return new FunctionExpression("subtract", ArithmeticKt.getEvaluateSubtract(), minuend, subtrahend);
        }

        public final Expression switchOn(BooleanExpression condition, Object result, Object... others) {
            AbstractC6452k.m12181e(condition, "condition");
            AbstractC6452k.m12181e(result, "result");
            AbstractC6452k.m12181e(others, "others");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            Expression exprOrConstant$com_google_firebase_firebase_firestore = toExprOrConstant$com_google_firebase_firebase_firestore(result);
            Expression[] arrayOfExprOrConstant$com_google_firebase_firebase_firestore = toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(others);
            return new FunctionExpression("switch_on", notImplemented, condition, exprOrConstant$com_google_firebase_firebase_firestore, Arrays.copyOf(arrayOfExprOrConstant$com_google_firebase_firebase_firestore, arrayOfExprOrConstant$com_google_firebase_firebase_firestore.length));
        }

        public final Expression timestampAdd(Expression timestamp, Expression unit, Expression amount) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(unit, "unit");
            AbstractC6452k.m12181e(amount, "amount");
            return new FunctionExpression("timestamp_add", TimestampKt.getEvaluateTimestampAdd(), timestamp, unit, amount);
        }

        public final Expression timestampDiff(Expression end, Expression start, Expression unit) {
            AbstractC6452k.m12181e(end, "end");
            AbstractC6452k.m12181e(start, "start");
            AbstractC6452k.m12181e(unit, "unit");
            return new FunctionExpression("timestamp_diff", UtilsKt.getNotImplemented(), end, start, unit);
        }

        public final Expression timestampExtract(Expression timestamp, Expression part) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(part, "part");
            return new FunctionExpression("timestamp_extract", UtilsKt.getNotImplemented(), timestamp, part);
        }

        public final Expression timestampExtractWithTimezone(Expression timestamp, Expression part, Expression timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_extract", UtilsKt.getNotImplemented(), timestamp, part, timezone);
        }

        public final Expression timestampSubtract(Expression timestamp, Expression unit, Expression amount) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(unit, "unit");
            AbstractC6452k.m12181e(amount, "amount");
            return new FunctionExpression("timestamp_subtract", TimestampKt.getEvaluateTimestampSub(), timestamp, unit, amount);
        }

        public final Expression timestampToUnixMicros(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("timestamp_to_unix_micros", TimestampKt.getEvaluateTimestampToUnixMicros(), expr);
        }

        public final Expression timestampToUnixMillis(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("timestamp_to_unix_millis", TimestampKt.getEvaluateTimestampToUnixMillis(), expr);
        }

        public final Expression timestampToUnixSeconds(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("timestamp_to_unix_seconds", TimestampKt.getEvaluateTimestampToUnixSeconds(), expr);
        }

        public final Expression timestampTruncate(Expression timestamp, String granularity) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(granularity, "granularity");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), timestamp, constant(granularity));
        }

        public final Expression timestampTruncateWithTimezone(Expression timestamp, String granularity, String timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), timestamp, constant(granularity), constant(timezone));
        }

        public final Expression[] toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(Object[] others) {
            AbstractC6452k.m12181e(others, "others");
            ArrayList arrayList = new ArrayList(others.length);
            for (Object obj : others) {
                arrayList.add(toExprOrConstant$com_google_firebase_firebase_firestore(obj));
            }
            return (Expression[]) arrayList.toArray(new Expression[0]);
        }

        public final Expression toExprOrConstant$com_google_firebase_firebase_firestore(Object obj) {
            Expression pipelineValueExpression;
            if (obj == null) {
                pipelineValueExpression = Expression.NULL;
            } else if (obj instanceof Expression) {
                pipelineValueExpression = (Expression) obj;
            } else if (obj instanceof String) {
                pipelineValueExpression = constant((String) obj);
            } else if (obj instanceof Number) {
                pipelineValueExpression = constant((Number) obj);
            } else if (obj instanceof Date) {
                pipelineValueExpression = constant((Date) obj);
            } else if (obj instanceof Timestamp) {
                pipelineValueExpression = constant((Timestamp) obj);
            } else if (obj instanceof Boolean) {
                pipelineValueExpression = constant(((Boolean) obj).booleanValue());
            } else if (obj instanceof GeoPoint) {
                pipelineValueExpression = constant((GeoPoint) obj);
            } else if (obj instanceof Blob) {
                pipelineValueExpression = constant((Blob) obj);
            } else if (obj instanceof DocumentReference) {
                pipelineValueExpression = constant((DocumentReference) obj);
            } else if (obj instanceof byte[]) {
                pipelineValueExpression = constant((byte[]) obj);
            } else if (obj instanceof VectorValue) {
                pipelineValueExpression = constant((VectorValue) obj);
            } else if (obj instanceof C0393Z0) {
                pipelineValueExpression = new Constant((C0393Z0) obj);
            } else if (obj instanceof Map) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        throw new IllegalArgumentException("Maps with non-string keys are not supported");
                    }
                    AbstractC6311s.m12124v(AbstractC6306n.m12120r(Expression.Companion.constant((String) key), toExprOrConstant$com_google_firebase_firebase_firestore(entry.getValue())), arrayList);
                }
                pipelineValueExpression = map$com_google_firebase_firebase_firestore((Expression[]) arrayList.toArray(new Expression[0]));
            } else if (obj instanceof List) {
                pipelineValueExpression = array((List<? extends Object>) obj);
            } else {
                pipelineValueExpression = obj instanceof Pipeline ? new PipelineValueExpression((Pipeline) obj) : null;
            }
            return pipelineValueExpression == null ? pojoToExprOrConstant(CustomClassMapper.convertToPlainJavaTypes(obj)) : pipelineValueExpression;
        }

        public final Expression toLower(Expression stringExpression) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            return new FunctionExpression("to_lower", Strings.getEvaluateToLowercase(), stringExpression);
        }

        public final Expression toUpper(Expression stringExpression) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            return new FunctionExpression("to_upper", Strings.getEvaluateToUppercase(), stringExpression);
        }

        public final Expression trim(Expression stringExpression) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            return new FunctionExpression("trim", Strings.getEvaluateTrim(), stringExpression);
        }

        public final Expression trimValue(Expression stringExpression, Expression valueToTrim) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(valueToTrim, "valueToTrim");
            return new FunctionExpression("trim", UtilsKt.getNotImplemented(), stringExpression, valueToTrim);
        }

        public final Expression trunc(Expression numericExpr) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("trunc", UtilsKt.getNotImplemented(), numericExpr);
        }

        public final Expression truncToPrecision(Expression numericExpr, int i2) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            return new FunctionExpression("trunc", UtilsKt.getNotImplemented(), numericExpr, constant(Integer.valueOf(i2)));
        }

        public final Expression type(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("type", UtilsKt.getNotImplemented(), expr);
        }

        public final Expression unixMicrosToTimestamp(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("unix_micros_to_timestamp", TimestampKt.getEvaluateUnixMicrosToTimestamp(), expr);
        }

        public final Expression unixMillisToTimestamp(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("unix_millis_to_timestamp", TimestampKt.getEvaluateUnixMillisToTimestamp(), expr);
        }

        public final Expression unixSecondsToTimestamp(Expression expr) {
            AbstractC6452k.m12181e(expr, "expr");
            return new FunctionExpression("unix_seconds_to_timestamp", TimestampKt.getEvaluateUnixSecondsToTimestamp(), expr);
        }

        public final Expression variable(String name) {
            AbstractC6452k.m12181e(name, "name");
            return new Variable(name);
        }

        public final Expression vector(double[] vector) {
            AbstractC6452k.m12181e(vector, "vector");
            return new Constant(Values.encodeVectorValue(vector));
        }

        public final Expression vectorLength(Expression vectorExpression) {
            AbstractC6452k.m12181e(vectorExpression, "vectorExpression");
            return new FunctionExpression("vector_length", VectorKt.getEvaluateVectorLength(), vectorExpression);
        }

        public final BooleanExpression xor(BooleanExpression condition, BooleanExpression... conditions) {
            AbstractC6452k.m12181e(condition, "condition");
            AbstractC6452k.m12181e(conditions, "conditions");
            return new BooleanFunctionExpression("xor", LogicalKt.getEvaluateXor(), (Expression) condition, Arrays.copyOf(conditions, conditions.length));
        }

        private Companion() {
        }

        public final Expression abs(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("abs", ArithmeticKt.getEvaluateAbs(), numericField);
        }

        public final Expression add(Expression first, Number second) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("add", ArithmeticKt.getEvaluateAdd(), first, second);
        }

        public final Expression arrayConcat(Expression firstArray, Object secondArray, Object... otherArrays) {
            AbstractC6452k.m12181e(firstArray, "firstArray");
            AbstractC6452k.m12181e(secondArray, "secondArray");
            AbstractC6452k.m12181e(otherArrays, "otherArrays");
            InterfaceC6498l evaluateArrayConcat = ArrayKt.getEvaluateArrayConcat();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(secondArray);
            c0783s0.m1658b(otherArrays);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("array_concat", evaluateArrayConcat, firstArray, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final BooleanExpression arrayContains(String arrayFieldName, Expression element) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(element, "element");
            return new BooleanFunctionExpression("array_contains", ArrayKt.getEvaluateArrayContains(), arrayFieldName, element);
        }

        public final BooleanExpression arrayContainsAll(Expression array, Expression arrayExpression) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("array_contains_all", ArrayKt.getEvaluateArrayContainsAll(), array, arrayExpression);
        }

        public final Expression arrayFilter(String arrayFieldName, String alias, BooleanExpression filter) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(alias, "alias");
            AbstractC6452k.m12181e(filter, "filter");
            return new FunctionExpression("array_filter", UtilsKt.getNotImplemented(), arrayFieldName, constant(alias), filter);
        }

        public final Expression arrayFirst(String arrayFieldName) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_first", ArrayKt.getEvaluateArrayFirst(), arrayFieldName);
        }

        public final Expression arrayFirstN(Expression array, Expression n2) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("array_first_n", ArrayKt.getEvaluateArrayFirstN(), array, n2);
        }

        public final Expression arrayGet(Expression array, int i2) {
            AbstractC6452k.m12181e(array, "array");
            return new FunctionExpression("array_get", ArrayKt.getEvaluateArrayGet(), array, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayLast(String arrayFieldName) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_last", ArrayKt.getEvaluateArrayLast(), arrayFieldName);
        }

        public final Expression arrayLastN(Expression array, Expression n2) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("array_last_n", ArrayKt.getEvaluateArrayLastN(), array, n2);
        }

        public final Expression arrayLength(String arrayFieldName) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_length", ArrayKt.getEvaluateArrayLength(), arrayFieldName);
        }

        public final Expression arrayMaximum(String arrayFieldName) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("maximum", ArrayKt.getEvaluateArrayMaximum(), arrayFieldName);
        }

        public final Expression arrayMaximumN(Expression array, Expression n2) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("maximum_n", ArrayKt.getEvaluateArrayMaximumN(), array, n2);
        }

        public final Expression arrayMinimum(String arrayFieldName) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("minimum", ArrayKt.getEvaluateArrayMinimum(), arrayFieldName);
        }

        public final Expression arrayMinimumN(Expression array, Expression n2) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("minimum_n", ArrayKt.getEvaluateArrayMinimumN(), array, n2);
        }

        public final Expression arrayReverse(String arrayFieldName) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_reverse", ArrayKt.getEvaluateArrayReverse(), arrayFieldName);
        }

        public final Expression arraySliceToEnd(Expression array, Expression offset) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(offset, "offset");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), array, toExprOrConstant$com_google_firebase_firebase_firestore(offset));
        }

        public final Expression arraySum(String arrayFieldName) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("sum", UtilsKt.getNotImplemented(), arrayFieldName);
        }

        public final Expression bitAnd(Expression bits, byte[] bitsOther) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_and", UtilsKt.getNotImplemented(), bits, constant(bitsOther));
        }

        public final Expression bitLeftShift(Expression bits, int i2) {
            AbstractC6452k.m12181e(bits, "bits");
            return new FunctionExpression("bit_left_shift", UtilsKt.getNotImplemented(), bits, Integer.valueOf(i2));
        }

        public final Expression bitNot(String bitsFieldName) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            return new FunctionExpression("bit_not", UtilsKt.getNotImplemented(), bitsFieldName);
        }

        public final Expression bitOr(Expression bits, byte[] bitsOther) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_or", UtilsKt.getNotImplemented(), bits, constant(bitsOther));
        }

        public final Expression bitRightShift(Expression bits, int i2) {
            AbstractC6452k.m12181e(bits, "bits");
            return new FunctionExpression("bit_right_shift", UtilsKt.getNotImplemented(), bits, Integer.valueOf(i2));
        }

        public final Expression bitXor(Expression bits, byte[] bitsOther) {
            AbstractC6452k.m12181e(bits, "bits");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_xor", UtilsKt.getNotImplemented(), bits, constant(bitsOther));
        }

        public final Expression byteLength(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("byte_length", Strings.getEvaluateByteLength(), fieldName);
        }

        public final Expression ceil(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("ceil", ArithmeticKt.getEvaluateCeil(), numericField);
        }

        public final Expression charLength(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("char_length", Strings.getEvaluateCharLength(), fieldName);
        }

        public final Expression collectionId(String pathField) {
            AbstractC6452k.m12181e(pathField, "pathField");
            return collectionId(field(pathField));
        }

        public final Expression concat(Expression first, Object second, Object... others) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            AbstractC6452k.m12181e(others, "others");
            InterfaceC6498l evaluateConcat = GenericsKt.getEvaluateConcat();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(second);
            c0783s0.m1658b(others);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("concat", evaluateConcat, first, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression conditional(BooleanExpression condition, Object thenValue, Object elseValue) {
            AbstractC6452k.m12181e(condition, "condition");
            AbstractC6452k.m12181e(thenValue, "thenValue");
            AbstractC6452k.m12181e(elseValue, "elseValue");
            return new FunctionExpression("conditional", LogicalKt.getEvaluateCond(), condition, thenValue, elseValue);
        }

        public final Expression constant(Number value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Expression cosineDistance(Expression vector1, double[] vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("cosine_distance", VectorKt.getEvaluateCosineDistance(), vector1, vector(vector2));
        }

        public final Expression divide(Expression dividend, Number divisor) {
            AbstractC6452k.m12181e(dividend, "dividend");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("divide", ArithmeticKt.getEvaluateDivide(), dividend, divisor);
        }

        public final Expression documentId(String documentPath) {
            AbstractC6452k.m12181e(documentPath, "documentPath");
            return documentId(constant(documentPath));
        }

        public final Expression dotProduct(Expression vector1, double[] vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("dot_product", VectorKt.getEvaluateDotProductDistance(), vector1, vector(vector2));
        }

        public final BooleanExpression endsWith(Expression stringExpr, String suffix) {
            AbstractC6452k.m12181e(stringExpr, "stringExpr");
            AbstractC6452k.m12181e(suffix, "suffix");
            return new BooleanFunctionExpression("ends_with", Strings.getEvaluateEndsWith(), stringExpr, suffix);
        }

        public final BooleanExpression equal(Expression left, Object right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("equal", ComparisonKt.getEvaluateEq(), left, right);
        }

        public final BooleanExpression equalAny(Expression expression, Expression arrayExpression) {
            AbstractC6452k.m12181e(expression, "expression");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("equal_any", ArrayKt.getEvaluateEqAny(), expression, arrayExpression);
        }

        public final Expression euclideanDistance(Expression vector1, double[] vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("euclidean_distance", VectorKt.getEvaluateEuclideanDistance(), vector1, vector(vector2));
        }

        public final BooleanExpression exists(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new BooleanFunctionExpression("exists", DebugKt.getEvaluateExists(), fieldName);
        }

        public final Expression exp(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("exp", ArithmeticKt.getEvaluateExp(), numericField);
        }

        public final Expression floor(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("floor", ArithmeticKt.getEvaluateFloor(), numericField);
        }

        public final Expression geoDistance(Field field, GeoPoint location) {
            AbstractC6452k.m12181e(field, "field");
            AbstractC6452k.m12181e(location, "location");
            return new FunctionExpression("geo_distance", UtilsKt.getNotImplemented(), field, constant(location));
        }

        public final Expression getField(String fieldName, String key) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("get_field", UtilsKt.getNotImplemented(), fieldName, key);
        }

        public final BooleanExpression greaterThan(Expression left, Object right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("greater_than", ComparisonKt.getEvaluateGt(), left, right);
        }

        public final BooleanExpression greaterThanOrEqual(Expression left, Object right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("greater_than_or_equal", ComparisonKt.getEvaluateGte(), left, right);
        }

        public final Expression ifAbsent(Expression ifExpr, Object elseValue) {
            AbstractC6452k.m12181e(ifExpr, "ifExpr");
            AbstractC6452k.m12181e(elseValue, "elseValue");
            return new FunctionExpression("if_absent", UtilsKt.getNotImplemented(), ifExpr, elseValue);
        }

        public final BooleanExpression ifError(BooleanExpression tryExpr, BooleanExpression catchExpr) {
            AbstractC6452k.m12181e(tryExpr, "tryExpr");
            AbstractC6452k.m12181e(catchExpr, "catchExpr");
            return new BooleanFunctionExpression("if_error", UtilsKt.getNotImplemented(), (Expression) tryExpr, (Expression) catchExpr);
        }

        public final Expression ifNull(Expression ifExpr, Object elseValue) {
            AbstractC6452k.m12181e(ifExpr, "ifExpr");
            AbstractC6452k.m12181e(elseValue, "elseValue");
            return new FunctionExpression("if_null", UtilsKt.getNotImplemented(), ifExpr, elseValue);
        }

        public final BooleanExpression isAbsent(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new BooleanFunctionExpression("is_absent", DebugKt.getEvaluateIsAbsent(), fieldName);
        }

        public final BooleanExpression isType(String fieldName, String type) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(type, "type");
            return new BooleanFunctionExpression("is_type", UtilsKt.getNotImplemented(), fieldName, constant(type));
        }

        public final Expression join(Expression arrayExpression, Expression delimiterExpression) {
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            AbstractC6452k.m12181e(delimiterExpression, "delimiterExpression");
            return new FunctionExpression("join", ArrayKt.getEvaluateJoin(), arrayExpression, delimiterExpression);
        }

        public final Expression length(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("length", GenericsKt.getEvaluateLength(), fieldName);
        }

        public final BooleanExpression lessThan(Expression left, Object right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("less_than", ComparisonKt.getEvaluateLt(), left, right);
        }

        public final BooleanExpression lessThanOrEqual(Expression left, Object right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("less_than_or_equal", ComparisonKt.getEvaluateLte(), left, right);
        }

        public final BooleanExpression like(Expression stringExpression, String pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("like", Strings.getEvaluateLike(), stringExpression, pattern);
        }

        /* JADX INFO: renamed from: ln */
        public final Expression m11447ln(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("ln", ArithmeticKt.getEvaluateLn(), numericField);
        }

        public final Expression log(String numericField, Number base) {
            AbstractC6452k.m12181e(numericField, "numericField");
            AbstractC6452k.m12181e(base, "base");
            return new FunctionExpression("log", ArithmeticKt.getEvaluateLog(), numericField, constant(base));
        }

        public final Expression log10(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("log10", ArithmeticKt.getEvaluateLog10(), numericField);
        }

        public final Expression logicalMaximum(String fieldName, Object... others) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(others, "others");
            return new FunctionExpression("maximum", LogicalKt.getEvaluateLogicalMaximum(), fieldName, Arrays.copyOf(others, others.length));
        }

        public final Expression logicalMinimum(String fieldName, Object... others) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(others, "others");
            return new FunctionExpression("minimum", LogicalKt.getEvaluateLogicalMinimum(), fieldName, Arrays.copyOf(others, others.length));
        }

        public final Expression ltrim(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("ltrim", UtilsKt.getNotImplemented(), field(fieldName));
        }

        public final Expression ltrimValue(Expression stringExpression, Expression valuesToTrim) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("ltrim", UtilsKt.getNotImplemented(), stringExpression, valuesToTrim);
        }

        public final Expression mapEntries(String mapField) {
            AbstractC6452k.m12181e(mapField, "mapField");
            return new FunctionExpression("map_entries", UtilsKt.getNotImplemented(), field(mapField));
        }

        public final Expression mapGet(String fieldName, String key) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("map_get", MapsKt.getEvaluateMapGet(), fieldName, key);
        }

        public final Expression mapKeys(String mapField) {
            AbstractC6452k.m12181e(mapField, "mapField");
            return new FunctionExpression("map_keys", UtilsKt.getNotImplemented(), field(mapField));
        }

        public final Expression mapMerge(String firstMapFieldName, Expression secondMap, Expression... otherMaps) {
            AbstractC6452k.m12181e(firstMapFieldName, "firstMapFieldName");
            AbstractC6452k.m12181e(secondMap, "secondMap");
            AbstractC6452k.m12181e(otherMaps, "otherMaps");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(secondMap);
            c0783s0.m1658b(otherMaps);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("map_merge", notImplemented, firstMapFieldName, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression mapRemove(String mapField, Expression key) {
            AbstractC6452k.m12181e(mapField, "mapField");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("map_remove", UtilsKt.getNotImplemented(), mapField, key);
        }

        public final Expression mapValues(String mapField) {
            AbstractC6452k.m12181e(mapField, "mapField");
            return new FunctionExpression("map_values", UtilsKt.getNotImplemented(), field(mapField));
        }

        public final Expression mod(Expression dividend, Number divisor) {
            AbstractC6452k.m12181e(dividend, "dividend");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("mod", ArithmeticKt.getEvaluateMod(), dividend, divisor);
        }

        public final Expression multiply(Expression first, Number second) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("multiply", ArithmeticKt.getEvaluateMultiply(), first, second);
        }

        public final BooleanExpression notEqual(Expression left, Object right) {
            AbstractC6452k.m12181e(left, "left");
            AbstractC6452k.m12181e(right, "right");
            return new BooleanFunctionExpression("not_equal", ComparisonKt.getEvaluateNeq(), left, right);
        }

        public final BooleanExpression notEqualAny(Expression expression, Expression arrayExpression) {
            AbstractC6452k.m12181e(expression, "expression");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("not_equal_any", ArrayKt.getEvaluateNotEqAny(), expression, arrayExpression);
        }

        public final Expression parent(String documentPath) {
            AbstractC6452k.m12181e(documentPath, "documentPath");
            return parent(constant(documentPath));
        }

        public final Expression pow(String numericField, Number exponent) {
            AbstractC6452k.m12181e(numericField, "numericField");
            AbstractC6452k.m12181e(exponent, "exponent");
            return new FunctionExpression("pow", ArithmeticKt.getEvaluatePow(), numericField, constant(exponent));
        }

        public final BooleanExpression regexContains(Expression stringExpression, String pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_contains", Strings.getEvaluateRegexContains(), stringExpression, pattern);
        }

        public final Expression regexFind(Expression stringExpression, String pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find", Strings.getEvaluateRegexFind(), stringExpression, pattern);
        }

        public final Expression regexFindAll(Expression stringExpression, String pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find_all", Strings.getEvaluateRegexFindAll(), stringExpression, pattern);
        }

        public final BooleanExpression regexMatch(Expression stringExpression, String pattern) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_match", Strings.getEvaluateRegexMatch(), stringExpression, pattern);
        }

        public final Expression reverse(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("reverse", Strings.getEvaluateReverse(), fieldName);
        }

        public final Expression round(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("round", ArithmeticKt.getEvaluateRound(), numericField);
        }

        public final Expression roundToPrecision(String numericField, int i2) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("round", ArithmeticKt.getEvaluateRoundToPrecision(), numericField, constant(Integer.valueOf(i2)));
        }

        public final Expression rtrim(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("rtrim", UtilsKt.getNotImplemented(), field(fieldName));
        }

        public final Expression rtrimValue(Expression stringExpression, Expression valuesToTrim) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("rtrim", UtilsKt.getNotImplemented(), stringExpression, valuesToTrim);
        }

        public final Expression split(Expression value, String delimiter) {
            AbstractC6452k.m12181e(value, "value");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("split", UtilsKt.getNotImplemented(), value, constant(delimiter));
        }

        public final Expression sqrt(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("sqrt", ArithmeticKt.getEvaluateSqrt(), numericField);
        }

        public final BooleanExpression startsWith(Expression stringExpr, String prefix) {
            AbstractC6452k.m12181e(stringExpr, "stringExpr");
            AbstractC6452k.m12181e(prefix, "prefix");
            return new BooleanFunctionExpression("starts_with", Strings.getEvaluateStartsWith(), stringExpr, prefix);
        }

        public final Expression stringConcat(Expression firstString, Object... otherStrings) {
            AbstractC6452k.m12181e(firstString, "firstString");
            AbstractC6452k.m12181e(otherStrings, "otherStrings");
            return new FunctionExpression("string_concat", Strings.getEvaluateStrConcat(), firstString, Arrays.copyOf(otherStrings, otherStrings.length));
        }

        public final BooleanExpression stringContains(Expression stringExpression, String substring) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(substring, "substring");
            return new BooleanFunctionExpression("string_contains", Strings.getEvaluateStrContains(), stringExpression, substring);
        }

        public final Expression stringIndexOf(Expression stringExpression, String substring) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(substring, "substring");
            return new FunctionExpression("string_index_of", UtilsKt.getNotImplemented(), stringExpression, constant(substring));
        }

        public final Expression stringRepeat(Expression stringExpression, Expression count) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(count, "count");
            return new FunctionExpression("string_repeat", UtilsKt.getNotImplemented(), stringExpression, count);
        }

        public final Expression stringReplaceAll(Expression stringExpression, String oldValue, String newValue) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_all", UtilsKt.getNotImplemented(), stringExpression, constant(oldValue), constant(newValue));
        }

        public final Expression stringReplaceOne(Expression stringExpression, String oldValue, String newValue) {
            AbstractC6452k.m12181e(stringExpression, "stringExpression");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_one", UtilsKt.getNotImplemented(), stringExpression, constant(oldValue), constant(newValue));
        }

        public final Expression stringReverse(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("string_reverse", Strings.getEvaluateStringReverse(), fieldName);
        }

        public final Expression substring(String fieldName, int i2, int i3) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("substring", Strings.getEvaluateSubstring(), fieldName, Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public final Expression subtract(Expression minuend, Number subtrahend) {
            AbstractC6452k.m12181e(minuend, "minuend");
            AbstractC6452k.m12181e(subtrahend, "subtrahend");
            return new FunctionExpression("subtract", ArithmeticKt.getEvaluateSubtract(), minuend, subtrahend);
        }

        public final Expression timestampAdd(Expression timestamp, String unit, long j2) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(unit, "unit");
            return new FunctionExpression("timestamp_add", TimestampKt.getEvaluateTimestampAdd(), timestamp, unit, Long.valueOf(j2));
        }

        public final Expression timestampDiff(Expression end, Expression start, String unit) {
            AbstractC6452k.m12181e(end, "end");
            AbstractC6452k.m12181e(start, "start");
            AbstractC6452k.m12181e(unit, "unit");
            return timestampDiff(end, start, constant(unit));
        }

        public final Expression timestampExtract(Expression timestamp, String part) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(part, "part");
            return timestampExtract(timestamp, constant(part));
        }

        public final Expression timestampExtractWithTimezone(Expression timestamp, Expression part, String timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return timestampExtractWithTimezone(timestamp, part, constant(timezone));
        }

        public final Expression timestampSubtract(Expression timestamp, String unit, long j2) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(unit, "unit");
            return new FunctionExpression("timestamp_subtract", TimestampKt.getEvaluateTimestampSub(), timestamp, unit, Long.valueOf(j2));
        }

        public final Expression timestampToUnixMicros(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("timestamp_to_unix_micros", TimestampKt.getEvaluateTimestampToUnixMicros(), fieldName);
        }

        public final Expression timestampToUnixMillis(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("timestamp_to_unix_millis", TimestampKt.getEvaluateTimestampToUnixMillis(), fieldName);
        }

        public final Expression timestampToUnixSeconds(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("timestamp_to_unix_seconds", TimestampKt.getEvaluateTimestampToUnixSeconds(), fieldName);
        }

        public final Expression timestampTruncate(Expression timestamp, Expression granularity) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(granularity, "granularity");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), timestamp, granularity);
        }

        public final Expression toLower(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("to_lower", Strings.getEvaluateToLowercase(), fieldName);
        }

        public final Expression toUpper(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("to_upper", Strings.getEvaluateToUppercase(), fieldName);
        }

        public final Expression trim(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("trim", Strings.getEvaluateTrim(), fieldName);
        }

        public final Expression trimValue(String fieldName, String valueToTrim) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(valueToTrim, "valueToTrim");
            return new FunctionExpression("trim", UtilsKt.getNotImplemented(), fieldName, constant(valueToTrim));
        }

        public final Expression trunc(String numericField) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("trunc", UtilsKt.getNotImplemented(), numericField);
        }

        public final Expression truncToPrecision(String numericField, int i2) {
            AbstractC6452k.m12181e(numericField, "numericField");
            return new FunctionExpression("trunc", UtilsKt.getNotImplemented(), numericField, constant(Integer.valueOf(i2)));
        }

        public final Expression type(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("type", UtilsKt.getNotImplemented(), fieldName);
        }

        public final Expression unixMicrosToTimestamp(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("unix_micros_to_timestamp", TimestampKt.getEvaluateUnixMicrosToTimestamp(), fieldName);
        }

        public final Expression unixMillisToTimestamp(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("unix_millis_to_timestamp", TimestampKt.getEvaluateUnixMillisToTimestamp(), fieldName);
        }

        public final Expression unixSecondsToTimestamp(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("unix_seconds_to_timestamp", TimestampKt.getEvaluateUnixSecondsToTimestamp(), fieldName);
        }

        public final Expression vector(VectorValue vector) {
            AbstractC6452k.m12181e(vector, "vector");
            return new Constant(Values.encodeValue(vector));
        }

        public final Expression vectorLength(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("vector_length", VectorKt.getEvaluateVectorLength(), fieldName);
        }

        public final Expression add(String numericFieldName, Expression second) {
            AbstractC6452k.m12181e(numericFieldName, "numericFieldName");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("add", ArithmeticKt.getEvaluateAdd(), numericFieldName, second);
        }

        public final BooleanExpression arrayContains(Expression array, Object element) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(element, "element");
            return new BooleanFunctionExpression("array_contains", ArrayKt.getEvaluateArrayContains(), array, element);
        }

        public final Expression arrayFirstN(String arrayFieldName, Expression n2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("array_first_n", ArrayKt.getEvaluateArrayFirstN(), arrayFieldName, n2);
        }

        public final Expression arrayGet(String arrayFieldName, Expression offset) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(offset, "offset");
            return new FunctionExpression("array_get", ArrayKt.getEvaluateArrayGet(), arrayFieldName, offset);
        }

        public final Expression arrayLastN(String arrayFieldName, Expression n2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("array_last_n", ArrayKt.getEvaluateArrayLastN(), arrayFieldName, n2);
        }

        public final Expression arrayMaximumN(String arrayFieldName, int i2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("maximum_n", ArrayKt.getEvaluateArrayMaximumN(), arrayFieldName, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayMinimumN(String arrayFieldName, Expression n2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("minimum_n", ArrayKt.getEvaluateArrayMinimumN(), arrayFieldName, n2);
        }

        public final Expression arraySliceToEnd(String arrayFieldName, int i2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), arrayFieldName, toExprOrConstant$com_google_firebase_firebase_firestore(Integer.valueOf(i2)));
        }

        public final Expression bitAnd(String bitsFieldName, Expression bitsOther) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_and", UtilsKt.getNotImplemented(), bitsFieldName, bitsOther);
        }

        public final Expression bitLeftShift(String bitsFieldName, Expression numberExpr) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(numberExpr, "numberExpr");
            return new FunctionExpression("bit_left_shift", UtilsKt.getNotImplemented(), bitsFieldName, numberExpr);
        }

        public final Expression bitOr(String bitsFieldName, Expression bitsOther) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_or", UtilsKt.getNotImplemented(), bitsFieldName, bitsOther);
        }

        public final Expression bitRightShift(String bitsFieldName, Expression numberExpr) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(numberExpr, "numberExpr");
            return new FunctionExpression("bit_right_shift", UtilsKt.getNotImplemented(), bitsFieldName, numberExpr);
        }

        public final Expression bitXor(String bitsFieldName, Expression bitsOther) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_xor", UtilsKt.getNotImplemented(), bitsFieldName, bitsOther);
        }

        public final Expression constant(Date value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Expression cosineDistance(Expression vector1, VectorValue vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("cosine_distance", VectorKt.getEvaluateCosineDistance(), vector1, vector2);
        }

        public final Expression divide(String dividendFieldName, Expression divisor) {
            AbstractC6452k.m12181e(dividendFieldName, "dividendFieldName");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("divide", ArithmeticKt.getEvaluateDivide(), dividendFieldName, divisor);
        }

        public final Expression documentId(DocumentReference docRef) {
            AbstractC6452k.m12181e(docRef, "docRef");
            return documentId(constant(docRef));
        }

        public final Expression dotProduct(Expression vector1, VectorValue vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("dot_product", VectorKt.getEvaluateDotProductDistance(), vector1, vector2);
        }

        public final BooleanExpression endsWith(String fieldName, Expression suffix) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(suffix, "suffix");
            return new BooleanFunctionExpression("ends_with", Strings.getEvaluateEndsWith(), fieldName, suffix);
        }

        public final BooleanExpression equal(String fieldName, Expression expression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(expression, "expression");
            return new BooleanFunctionExpression("equal", ComparisonKt.getEvaluateEq(), fieldName, expression);
        }

        public final BooleanExpression equalAny(String fieldName, List<? extends Object> values) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(values, "values");
            return equalAny(fieldName, array(values));
        }

        public final Expression euclideanDistance(Expression vector1, VectorValue vector2) {
            AbstractC6452k.m12181e(vector1, "vector1");
            AbstractC6452k.m12181e(vector2, "vector2");
            return new FunctionExpression("euclidean_distance", VectorKt.getEvaluateEuclideanDistance(), vector1, vector2);
        }

        public final Expression getField(Expression expression, Expression keyExpression) {
            AbstractC6452k.m12181e(expression, "expression");
            AbstractC6452k.m12181e(keyExpression, "keyExpression");
            return new FunctionExpression("get_field", UtilsKt.getNotImplemented(), expression, keyExpression);
        }

        public final BooleanExpression greaterThan(String fieldName, Expression expression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(expression, "expression");
            return new BooleanFunctionExpression("greater_than", ComparisonKt.getEvaluateGt(), fieldName, expression);
        }

        public final BooleanExpression greaterThanOrEqual(String fieldName, Expression expression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(expression, "expression");
            return new BooleanFunctionExpression("greater_than_or_equal", ComparisonKt.getEvaluateGte(), fieldName, expression);
        }

        public final Expression ifAbsent(String ifFieldName, Expression elseExpr) {
            AbstractC6452k.m12181e(ifFieldName, "ifFieldName");
            AbstractC6452k.m12181e(elseExpr, "elseExpr");
            return new FunctionExpression("if_absent", UtilsKt.getNotImplemented(), ifFieldName, elseExpr);
        }

        public final Expression ifError(Expression tryExpr, Object catchValue) {
            AbstractC6452k.m12181e(tryExpr, "tryExpr");
            AbstractC6452k.m12181e(catchValue, "catchValue");
            return new FunctionExpression("if_error", UtilsKt.getNotImplemented(), tryExpr, catchValue);
        }

        public final Expression ifNull(String ifFieldName, Expression elseExpr) {
            AbstractC6452k.m12181e(ifFieldName, "ifFieldName");
            AbstractC6452k.m12181e(elseExpr, "elseExpr");
            return new FunctionExpression("if_null", UtilsKt.getNotImplemented(), ifFieldName, elseExpr);
        }

        public final Expression join(String arrayFieldName, String delimiter) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("join", ArrayKt.getEvaluateJoin(), arrayFieldName, constant(delimiter));
        }

        public final BooleanExpression lessThan(String fieldName, Expression expression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(expression, "expression");
            return new BooleanFunctionExpression("less_than", ComparisonKt.getEvaluateLt(), fieldName, expression);
        }

        public final BooleanExpression lessThanOrEqual(String fieldName, Expression expression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(expression, "expression");
            return new BooleanFunctionExpression("less_than_or_equal", ComparisonKt.getEvaluateLte(), fieldName, expression);
        }

        public final BooleanExpression like(String fieldName, Expression pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("like", Strings.getEvaluateLike(), fieldName, pattern);
        }

        public final Expression log(Expression numericExpr, Expression base) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            AbstractC6452k.m12181e(base, "base");
            return new FunctionExpression("log", ArithmeticKt.getEvaluateLog(), numericExpr, base);
        }

        public final Expression ltrimValue(String fieldName, String valuesToTrim) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("ltrim", UtilsKt.getNotImplemented(), field(fieldName), constant(valuesToTrim));
        }

        public final Expression mapGet(Expression mapExpression, Expression keyExpression) {
            AbstractC6452k.m12181e(mapExpression, "mapExpression");
            AbstractC6452k.m12181e(keyExpression, "keyExpression");
            return new FunctionExpression("map_get", MapsKt.getEvaluateMapGet(), mapExpression, keyExpression);
        }

        public final Expression mapRemove(Expression mapExpr, String key) {
            AbstractC6452k.m12181e(mapExpr, "mapExpr");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("map_remove", UtilsKt.getNotImplemented(), mapExpr, key);
        }

        public final Expression mod(String dividendFieldName, Expression divisor) {
            AbstractC6452k.m12181e(dividendFieldName, "dividendFieldName");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("mod", ArithmeticKt.getEvaluateMod(), dividendFieldName, divisor);
        }

        public final Expression multiply(String numericFieldName, Expression second) {
            AbstractC6452k.m12181e(numericFieldName, "numericFieldName");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("multiply", ArithmeticKt.getEvaluateMultiply(), numericFieldName, second);
        }

        public final BooleanExpression notEqual(String fieldName, Expression expression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(expression, "expression");
            return new BooleanFunctionExpression("not_equal", ComparisonKt.getEvaluateNeq(), fieldName, expression);
        }

        public final BooleanExpression notEqualAny(String fieldName, List<? extends Object> values) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(values, "values");
            return notEqualAny(fieldName, array(values));
        }

        public final Expression parent(DocumentReference docRef) {
            AbstractC6452k.m12181e(docRef, "docRef");
            return parent(constant(docRef));
        }

        public final Expression pow(Expression numericExpr, Expression exponent) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            AbstractC6452k.m12181e(exponent, "exponent");
            return new FunctionExpression("pow", ArithmeticKt.getEvaluatePow(), numericExpr, exponent);
        }

        public final BooleanExpression regexContains(String fieldName, Expression pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_contains", Strings.getEvaluateRegexContains(), fieldName, pattern);
        }

        public final Expression regexFind(String fieldName, Expression pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find", Strings.getEvaluateRegexFind(), fieldName, pattern);
        }

        public final Expression regexFindAll(String fieldName, Expression pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find_all", Strings.getEvaluateRegexFindAll(), fieldName, pattern);
        }

        public final BooleanExpression regexMatch(String fieldName, Expression pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_match", Strings.getEvaluateRegexMatch(), fieldName, pattern);
        }

        public final Expression roundToPrecision(Expression numericExpr, Expression decimalPlace) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            AbstractC6452k.m12181e(decimalPlace, "decimalPlace");
            return new FunctionExpression("round", ArithmeticKt.getEvaluateRoundToPrecision(), numericExpr, decimalPlace);
        }

        public final Expression rtrimValue(String fieldName, String valuesToTrim) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("rtrim", UtilsKt.getNotImplemented(), field(fieldName), constant(valuesToTrim));
        }

        public final Expression split(Expression value, Blob delimiter) {
            AbstractC6452k.m12181e(value, "value");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("split", UtilsKt.getNotImplemented(), value, constant(delimiter));
        }

        public final BooleanExpression startsWith(String fieldName, Expression prefix) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(prefix, "prefix");
            return new BooleanFunctionExpression("starts_with", Strings.getEvaluateStartsWith(), fieldName, prefix);
        }

        public final Expression stringConcat(String fieldName, Expression... otherStrings) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(otherStrings, "otherStrings");
            return new FunctionExpression("string_concat", Strings.getEvaluateStrConcat(), fieldName, Arrays.copyOf(otherStrings, otherStrings.length));
        }

        public final BooleanExpression stringContains(String fieldName, Expression substring) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(substring, "substring");
            return new BooleanFunctionExpression("string_contains", Strings.getEvaluateStrContains(), fieldName, substring);
        }

        public final Expression stringIndexOf(String fieldName, Expression substring) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(substring, "substring");
            return new FunctionExpression("string_index_of", UtilsKt.getNotImplemented(), field(fieldName), substring);
        }

        public final Expression stringRepeat(String fieldName, int i2) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new FunctionExpression("string_repeat", UtilsKt.getNotImplemented(), field(fieldName), constant(Integer.valueOf(i2)));
        }

        public final Expression subtract(String numericFieldName, Expression subtrahend) {
            AbstractC6452k.m12181e(numericFieldName, "numericFieldName");
            AbstractC6452k.m12181e(subtrahend, "subtrahend");
            return new FunctionExpression("subtract", ArithmeticKt.getEvaluateSubtract(), numericFieldName, subtrahend);
        }

        public final Expression timestampAdd(String fieldName, Expression unit, Expression amount) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(unit, "unit");
            AbstractC6452k.m12181e(amount, "amount");
            return new FunctionExpression("timestamp_add", TimestampKt.getEvaluateTimestampAdd(), fieldName, unit, amount);
        }

        public final Expression timestampDiff(String endFieldName, String startFieldName, String unit) {
            AbstractC6452k.m12181e(endFieldName, "endFieldName");
            AbstractC6452k.m12181e(startFieldName, "startFieldName");
            AbstractC6452k.m12181e(unit, "unit");
            return timestampDiff(field(endFieldName), field(startFieldName), constant(unit));
        }

        public final Expression timestampExtract(String fieldName, Expression part) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(part, "part");
            return timestampExtract(field(fieldName), part);
        }

        public final Expression timestampExtractWithTimezone(Expression timestamp, String part, String timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return timestampExtractWithTimezone(timestamp, constant(part), constant(timezone));
        }

        public final Expression timestampSubtract(String fieldName, Expression unit, Expression amount) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(unit, "unit");
            AbstractC6452k.m12181e(amount, "amount");
            return new FunctionExpression("timestamp_subtract", TimestampKt.getEvaluateTimestampSub(), fieldName, unit, amount);
        }

        public final Expression timestampTruncate(String fieldName, String granularity) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(granularity, "granularity");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), field(fieldName), constant(granularity));
        }

        public final Expression truncToPrecision(Expression numericExpr, Expression decimalPlace) {
            AbstractC6452k.m12181e(numericExpr, "numericExpr");
            AbstractC6452k.m12181e(decimalPlace, "decimalPlace");
            return new FunctionExpression("trunc", UtilsKt.getNotImplemented(), numericExpr, decimalPlace);
        }

        public final Expression add(String numericFieldName, Number second) {
            AbstractC6452k.m12181e(numericFieldName, "numericFieldName");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("add", ArithmeticKt.getEvaluateAdd(), numericFieldName, second);
        }

        public final BooleanExpression arrayContains(String arrayFieldName, Object element) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(element, "element");
            return new BooleanFunctionExpression("array_contains", ArrayKt.getEvaluateArrayContains(), arrayFieldName, element);
        }

        public final Expression arrayFirstN(String arrayFieldName, int i2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_first_n", ArrayKt.getEvaluateArrayFirstN(), arrayFieldName, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayGet(String arrayFieldName, int i2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_get", ArrayKt.getEvaluateArrayGet(), arrayFieldName, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayLastN(String arrayFieldName, int i2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_last_n", ArrayKt.getEvaluateArrayLastN(), arrayFieldName, constant(Integer.valueOf(i2)));
        }

        public final Expression arrayMaximumN(String arrayFieldName, Expression n2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(n2, "n");
            return new FunctionExpression("maximum_n", ArrayKt.getEvaluateArrayMaximumN(), arrayFieldName, n2);
        }

        public final Expression arrayMinimumN(String arrayFieldName, int i2) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("minimum_n", ArrayKt.getEvaluateArrayMinimumN(), arrayFieldName, constant(Integer.valueOf(i2)));
        }

        public final Expression arraySliceToEnd(String arrayFieldName, Expression offset) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(offset, "offset");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), arrayFieldName, toExprOrConstant$com_google_firebase_firebase_firestore(offset));
        }

        public final Expression bitAnd(String bitsFieldName, byte[] bitsOther) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_and", UtilsKt.getNotImplemented(), bitsFieldName, constant(bitsOther));
        }

        public final Expression bitLeftShift(String bitsFieldName, int i2) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            return new FunctionExpression("bit_left_shift", UtilsKt.getNotImplemented(), bitsFieldName, Integer.valueOf(i2));
        }

        public final Expression bitOr(String bitsFieldName, byte[] bitsOther) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_or", UtilsKt.getNotImplemented(), bitsFieldName, constant(bitsOther));
        }

        public final Expression bitRightShift(String bitsFieldName, int i2) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            return new FunctionExpression("bit_right_shift", UtilsKt.getNotImplemented(), bitsFieldName, Integer.valueOf(i2));
        }

        public final Expression bitXor(String bitsFieldName, byte[] bitsOther) {
            AbstractC6452k.m12181e(bitsFieldName, "bitsFieldName");
            AbstractC6452k.m12181e(bitsOther, "bitsOther");
            return new FunctionExpression("bit_xor", UtilsKt.getNotImplemented(), bitsFieldName, constant(bitsOther));
        }

        public final Expression constant(Timestamp value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Expression cosineDistance(String vectorFieldName, Expression vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("cosine_distance", VectorKt.getEvaluateCosineDistance(), vectorFieldName, vector);
        }

        public final Expression divide(String dividendFieldName, Number divisor) {
            AbstractC6452k.m12181e(dividendFieldName, "dividendFieldName");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("divide", ArithmeticKt.getEvaluateDivide(), dividendFieldName, divisor);
        }

        public final Expression dotProduct(String vectorFieldName, Expression vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("dot_product", VectorKt.getEvaluateDotProductDistance(), vectorFieldName, vector);
        }

        public final BooleanExpression endsWith(String fieldName, String suffix) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(suffix, "suffix");
            return new BooleanFunctionExpression("ends_with", Strings.getEvaluateEndsWith(), fieldName, suffix);
        }

        public final BooleanExpression equal(String fieldName, Object value) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("equal", ComparisonKt.getEvaluateEq(), fieldName, value);
        }

        public final BooleanExpression equalAny(String fieldName, Expression arrayExpression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("equal_any", ArrayKt.getEvaluateEqAny(), fieldName, arrayExpression);
        }

        public final Expression euclideanDistance(String vectorFieldName, Expression vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("euclidean_distance", VectorKt.getEvaluateEuclideanDistance(), vectorFieldName, vector);
        }

        public final Expression getField(String fieldName, Expression keyExpression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(keyExpression, "keyExpression");
            return new FunctionExpression("get_field", UtilsKt.getNotImplemented(), fieldName, keyExpression);
        }

        public final BooleanExpression greaterThan(String fieldName, Object value) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("greater_than", ComparisonKt.getEvaluateGt(), fieldName, value);
        }

        public final BooleanExpression greaterThanOrEqual(String fieldName, Object value) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("greater_than_or_equal", ComparisonKt.getEvaluateGte(), fieldName, value);
        }

        public final Expression ifAbsent(String ifFieldName, Object elseValue) {
            AbstractC6452k.m12181e(ifFieldName, "ifFieldName");
            AbstractC6452k.m12181e(elseValue, "elseValue");
            return new FunctionExpression("if_absent", UtilsKt.getNotImplemented(), ifFieldName, elseValue);
        }

        public final Expression ifNull(String ifFieldName, Object elseValue) {
            AbstractC6452k.m12181e(ifFieldName, "ifFieldName");
            AbstractC6452k.m12181e(elseValue, "elseValue");
            return new FunctionExpression("if_null", UtilsKt.getNotImplemented(), ifFieldName, elseValue);
        }

        public final Expression join(String arrayFieldName, Expression delimiterExpression) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(delimiterExpression, "delimiterExpression");
            return new FunctionExpression("join", ArrayKt.getEvaluateJoin(), arrayFieldName, delimiterExpression);
        }

        public final BooleanExpression lessThan(String fieldName, Object value) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("less_than", ComparisonKt.getEvaluateLt(), fieldName, value);
        }

        public final BooleanExpression lessThanOrEqual(String fieldName, Object value) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("less_than_or_equal", ComparisonKt.getEvaluateLte(), fieldName, value);
        }

        public final BooleanExpression like(String fieldName, String pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("like", Strings.getEvaluateLike(), fieldName, pattern);
        }

        public final Expression log(String numericField, Expression base) {
            AbstractC6452k.m12181e(numericField, "numericField");
            AbstractC6452k.m12181e(base, "base");
            return new FunctionExpression("log", ArithmeticKt.getEvaluateLog(), numericField, base);
        }

        public final Expression ltrimValue(String fieldName, Expression valuesToTrim) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("ltrim", UtilsKt.getNotImplemented(), field(fieldName), valuesToTrim);
        }

        public final Expression mapGet(String fieldName, Expression keyExpression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(keyExpression, "keyExpression");
            return new FunctionExpression("map_get", MapsKt.getEvaluateMapGet(), fieldName, keyExpression);
        }

        public final Expression mapRemove(String mapField, String key) {
            AbstractC6452k.m12181e(mapField, "mapField");
            AbstractC6452k.m12181e(key, "key");
            return new FunctionExpression("map_remove", UtilsKt.getNotImplemented(), mapField, key);
        }

        public final Expression mod(String dividendFieldName, Number divisor) {
            AbstractC6452k.m12181e(dividendFieldName, "dividendFieldName");
            AbstractC6452k.m12181e(divisor, "divisor");
            return new FunctionExpression("mod", ArithmeticKt.getEvaluateMod(), dividendFieldName, divisor);
        }

        public final Expression multiply(String numericFieldName, Number second) {
            AbstractC6452k.m12181e(numericFieldName, "numericFieldName");
            AbstractC6452k.m12181e(second, "second");
            return new FunctionExpression("multiply", ArithmeticKt.getEvaluateMultiply(), numericFieldName, second);
        }

        public final BooleanExpression notEqual(String fieldName, Object value) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(value, "value");
            return new BooleanFunctionExpression("not_equal", ComparisonKt.getEvaluateNeq(), fieldName, value);
        }

        public final BooleanExpression notEqualAny(String fieldName, Expression arrayExpression) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("not_equal_any", ArrayKt.getEvaluateNotEqAny(), fieldName, arrayExpression);
        }

        public final Expression pow(String numericField, Expression exponent) {
            AbstractC6452k.m12181e(numericField, "numericField");
            AbstractC6452k.m12181e(exponent, "exponent");
            return new FunctionExpression("pow", ArithmeticKt.getEvaluatePow(), numericField, exponent);
        }

        public final BooleanExpression regexContains(String fieldName, String pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_contains", Strings.getEvaluateRegexContains(), fieldName, pattern);
        }

        public final Expression regexFind(String fieldName, String pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find", Strings.getEvaluateRegexFind(), fieldName, pattern);
        }

        public final Expression regexFindAll(String fieldName, String pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new FunctionExpression("regex_find_all", Strings.getEvaluateRegexFindAll(), fieldName, pattern);
        }

        public final BooleanExpression regexMatch(String fieldName, String pattern) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(pattern, "pattern");
            return new BooleanFunctionExpression("regex_match", Strings.getEvaluateRegexMatch(), fieldName, pattern);
        }

        public final Expression roundToPrecision(String numericField, Expression decimalPlace) {
            AbstractC6452k.m12181e(numericField, "numericField");
            AbstractC6452k.m12181e(decimalPlace, "decimalPlace");
            return new FunctionExpression("round", ArithmeticKt.getEvaluateRoundToPrecision(), numericField, decimalPlace);
        }

        public final Expression rtrimValue(String fieldName, Expression valuesToTrim) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
            return new FunctionExpression("rtrim", UtilsKt.getNotImplemented(), field(fieldName), valuesToTrim);
        }

        public final Expression split(String fieldName, Expression delimiter) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("split", UtilsKt.getNotImplemented(), fieldName, delimiter);
        }

        public final BooleanExpression startsWith(String fieldName, String prefix) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(prefix, "prefix");
            return new BooleanFunctionExpression("starts_with", Strings.getEvaluateStartsWith(), fieldName, prefix);
        }

        public final Expression stringConcat(String fieldName, Object... otherStrings) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(otherStrings, "otherStrings");
            return new FunctionExpression("string_concat", Strings.getEvaluateStrConcat(), fieldName, Arrays.copyOf(otherStrings, otherStrings.length));
        }

        public final BooleanExpression stringContains(String fieldName, String substring) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(substring, "substring");
            return new BooleanFunctionExpression("string_contains", Strings.getEvaluateStrContains(), fieldName, substring);
        }

        public final Expression stringIndexOf(String fieldName, String substring) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(substring, "substring");
            return new FunctionExpression("string_index_of", UtilsKt.getNotImplemented(), field(fieldName), constant(substring));
        }

        public final Expression stringRepeat(String fieldName, Expression count) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(count, "count");
            return new FunctionExpression("string_repeat", UtilsKt.getNotImplemented(), field(fieldName), count);
        }

        public final Expression subtract(String numericFieldName, Number subtrahend) {
            AbstractC6452k.m12181e(numericFieldName, "numericFieldName");
            AbstractC6452k.m12181e(subtrahend, "subtrahend");
            return new FunctionExpression("subtract", ArithmeticKt.getEvaluateSubtract(), numericFieldName, subtrahend);
        }

        public final Expression timestampAdd(String fieldName, String unit, long j2) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(unit, "unit");
            return new FunctionExpression("timestamp_add", TimestampKt.getEvaluateTimestampAdd(), fieldName, unit, Long.valueOf(j2));
        }

        public final Expression timestampDiff(String endFieldName, Expression start, String unit) {
            AbstractC6452k.m12181e(endFieldName, "endFieldName");
            AbstractC6452k.m12181e(start, "start");
            AbstractC6452k.m12181e(unit, "unit");
            return timestampDiff(field(endFieldName), start, constant(unit));
        }

        public final Expression timestampExtract(String fieldName, String part) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(part, "part");
            return timestampExtract(field(fieldName), constant(part));
        }

        public final Expression timestampExtractWithTimezone(String fieldName, Expression part, String timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return timestampExtractWithTimezone(field(fieldName), part, constant(timezone));
        }

        public final Expression timestampSubtract(String fieldName, String unit, long j2) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(unit, "unit");
            return new FunctionExpression("timestamp_subtract", TimestampKt.getEvaluateTimestampSub(), fieldName, unit, Long.valueOf(j2));
        }

        public final Expression timestampTruncate(String fieldName, Expression granularity) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(granularity, "granularity");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), field(fieldName), granularity);
        }

        public final Expression truncToPrecision(String numericField, Expression decimalPlace) {
            AbstractC6452k.m12181e(numericField, "numericField");
            AbstractC6452k.m12181e(decimalPlace, "decimalPlace");
            return new FunctionExpression("trunc", UtilsKt.getNotImplemented(), numericField, decimalPlace);
        }

        public final BooleanExpression arrayContainsAny(Expression array, Expression arrayExpression) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("array_contains_any", ArrayKt.getEvaluateArrayContainsAny(), array, arrayExpression);
        }

        public final Expression arrayIndexOfAll(String arrayFieldName, Object obj) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_index_of_all", ArrayKt.getEvaluateArrayIndexOfAll(), arrayFieldName, toExprOrConstant$com_google_firebase_firebase_firestore(obj));
        }

        public final BooleanExpression constant(boolean z) {
            return new BooleanConstant(new Constant(Values.encodeValue(z)));
        }

        public final Expression cosineDistance(String vectorFieldName, double[] vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("cosine_distance", VectorKt.getEvaluateCosineDistance(), vectorFieldName, vector(vector));
        }

        public final Expression dotProduct(String vectorFieldName, double[] vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("dot_product", VectorKt.getEvaluateDotProductDistance(), vectorFieldName, vector(vector));
        }

        public final Expression euclideanDistance(String vectorFieldName, double[] vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("euclidean_distance", VectorKt.getEvaluateEuclideanDistance(), vectorFieldName, vector(vector));
        }

        public final Expression split(String fieldName, String delimiter) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("split", UtilsKt.getNotImplemented(), fieldName, constant(delimiter));
        }

        public final Expression timestampDiff(Expression end, String startFieldName, String unit) {
            AbstractC6452k.m12181e(end, "end");
            AbstractC6452k.m12181e(startFieldName, "startFieldName");
            AbstractC6452k.m12181e(unit, "unit");
            return timestampDiff(end, field(startFieldName), constant(unit));
        }

        public final Expression timestampExtractWithTimezone(String fieldName, String part, String timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return timestampExtractWithTimezone(field(fieldName), constant(part), constant(timezone));
        }

        public final BooleanExpression arrayContainsAll(String arrayFieldName, List<? extends Object> values) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(values, "values");
            return new BooleanFunctionExpression("array_contains_all", ArrayKt.getEvaluateArrayContainsAll(), arrayFieldName, array(values));
        }

        public final Expression arrayIndexOf(String arrayFieldName, Object obj) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_index_of", ArrayKt.getEvaluateArrayIndexOf(), arrayFieldName, toExprOrConstant$com_google_firebase_firebase_firestore(obj), constant("first"));
        }

        public final Expression arrayLastIndexOf(String arrayFieldName, Object obj) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_index_of", ArrayKt.getEvaluateArrayIndexOf(), arrayFieldName, toExprOrConstant$com_google_firebase_firebase_firestore(obj), constant("last"));
        }

        public final Expression arraySlice(String arrayFieldName, int i2, int i3) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), arrayFieldName, toExprOrConstant$com_google_firebase_firebase_firestore(Integer.valueOf(i2)), toExprOrConstant$com_google_firebase_firebase_firestore(Integer.valueOf(i3)));
        }

        public final Expression arrayTransform(String arrayFieldName, String elementAlias, Expression transform) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(elementAlias, "elementAlias");
            AbstractC6452k.m12181e(transform, "transform");
            return new FunctionExpression("array_transform", UtilsKt.getNotImplemented(), arrayFieldName, constant(elementAlias), transform);
        }

        public final Expression coalesce(String fieldName, Object replacement, Object... others) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(replacement, "replacement");
            AbstractC6452k.m12181e(others, "others");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(replacement);
            c0783s0.m1658b(others);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("coalesce", notImplemented, fieldName, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression constant(GeoPoint value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Expression cosineDistance(String vectorFieldName, VectorValue vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("cosine_distance", VectorKt.getEvaluateCosineDistance(), vectorFieldName, vector);
        }

        public final Expression dotProduct(String vectorFieldName, VectorValue vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("dot_product", VectorKt.getEvaluateDotProductDistance(), vectorFieldName, vector);
        }

        public final Expression mapSet(Expression mapExpr, String key, Object obj, Object... moreKeyValues) {
            AbstractC6452k.m12181e(mapExpr, "mapExpr");
            AbstractC6452k.m12181e(key, "key");
            AbstractC6452k.m12181e(moreKeyValues, "moreKeyValues");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            Expression expressionConstant = constant(key);
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(toExprOrConstant$com_google_firebase_firebase_firestore(obj));
            c0783s0.m1658b(toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(moreKeyValues));
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("map_set", notImplemented, mapExpr, expressionConstant, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression split(String fieldName, Blob delimiter) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(delimiter, "delimiter");
            return new FunctionExpression("split", UtilsKt.getNotImplemented(), fieldName, constant(delimiter));
        }

        public final Expression timestampExtractWithTimezone(Expression timestamp, String part, Expression timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return timestampExtractWithTimezone(timestamp, constant(part), timezone);
        }

        public final Expression timestampTruncateWithTimezone(Expression timestamp, Expression granularity, String timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), timestamp, granularity, constant(timezone));
        }

        public final Expression arrayConcat(String firstArrayField, Expression secondArray, Object... otherArrays) {
            AbstractC6452k.m12181e(firstArrayField, "firstArrayField");
            AbstractC6452k.m12181e(secondArray, "secondArray");
            AbstractC6452k.m12181e(otherArrays, "otherArrays");
            InterfaceC6498l evaluateArrayConcat = ArrayKt.getEvaluateArrayConcat();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(secondArray);
            c0783s0.m1658b(otherArrays);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("array_concat", evaluateArrayConcat, firstArrayField, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression arrayTransformWithIndex(String arrayFieldName, String elementAlias, String indexAlias, Expression transform) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(elementAlias, "elementAlias");
            AbstractC6452k.m12181e(indexAlias, "indexAlias");
            AbstractC6452k.m12181e(transform, "transform");
            return new FunctionExpression("array_transform", UtilsKt.getNotImplemented(), arrayFieldName, constant(elementAlias), constant(indexAlias), transform);
        }

        public final Expression concat(String first, Expression second, Object... others) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            AbstractC6452k.m12181e(others, "others");
            InterfaceC6498l evaluateConcat = GenericsKt.getEvaluateConcat();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(second);
            c0783s0.m1658b(others);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("concat", evaluateConcat, first, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression constant(byte[] value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Expression stringReplaceAll(String fieldName, Expression oldValue, Expression newValue) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_all", UtilsKt.getNotImplemented(), field(fieldName), oldValue, newValue);
        }

        public final Expression stringReplaceOne(String fieldName, Expression oldValue, Expression newValue) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_one", UtilsKt.getNotImplemented(), field(fieldName), oldValue, newValue);
        }

        public final Expression timestampExtractWithTimezone(String fieldName, Expression part, Expression timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return timestampExtractWithTimezone(field(fieldName), part, timezone);
        }

        public final Expression array(List<? extends Object> elements) {
            AbstractC6452k.m12181e(elements, "elements");
            InterfaceC6498l evaluateArray = ArrayKt.getEvaluateArray();
            ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(elements, 10));
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                arrayList.add(toExprOrConstant$com_google_firebase_firebase_firestore(it.next()));
            }
            return new FunctionExpression("array", evaluateArray, (Expression[]) arrayList.toArray(new Expression[0]), null, 8, null);
        }

        public final Expression constant(Blob value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Field field(com.google.firebase.firestore.FieldPath fieldPath) {
            AbstractC6452k.m12181e(fieldPath, "fieldPath");
            FieldPath internalPath = fieldPath.getInternalPath();
            AbstractC6452k.m12180d(internalPath, "getInternalPath(...)");
            return new Field(internalPath);
        }

        public final Expression stringReplaceAll(String fieldName, String oldValue, String newValue) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_all", UtilsKt.getNotImplemented(), field(fieldName), constant(oldValue), constant(newValue));
        }

        public final Expression stringReplaceOne(String fieldName, String oldValue, String newValue) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(oldValue, "oldValue");
            AbstractC6452k.m12181e(newValue, "newValue");
            return new FunctionExpression("string_replace_one", UtilsKt.getNotImplemented(), field(fieldName), constant(oldValue), constant(newValue));
        }

        public final Expression timestampExtractWithTimezone(String fieldName, String part, Expression timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(part, "part");
            AbstractC6452k.m12181e(timezone, "timezone");
            return timestampExtractWithTimezone(field(fieldName), constant(part), timezone);
        }

        public final BooleanExpression arrayContainsAny(String arrayFieldName, List<? extends Object> values) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(values, "values");
            return new BooleanFunctionExpression("array_contains_any", ArrayKt.getEvaluateArrayContainsAny(), arrayFieldName, array(values));
        }

        public final Expression constant(DocumentReference ref) {
            AbstractC6452k.m12181e(ref, "ref");
            return new Constant(Values.encodeValue(ref));
        }

        public final Expression euclideanDistance(String vectorFieldName, VectorValue vector) {
            AbstractC6452k.m12181e(vectorFieldName, "vectorFieldName");
            AbstractC6452k.m12181e(vector, "vector");
            return new FunctionExpression("euclidean_distance", VectorKt.getEvaluateEuclideanDistance(), vectorFieldName, vector);
        }

        public final BooleanExpression arrayContainsAll(String arrayFieldName, Expression arrayExpression) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("array_contains_all", ArrayKt.getEvaluateArrayContainsAll(), arrayFieldName, arrayExpression);
        }

        public final Expression constant(VectorValue value) {
            AbstractC6452k.m12181e(value, "value");
            return new Constant(Values.encodeValue(value));
        }

        public final Expression timestampTruncateWithTimezone(String fieldName, String granularity, String timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), field(fieldName), constant(granularity), constant(timezone));
        }

        public final Expression arraySlice(Expression array, Expression offset, Expression length) {
            AbstractC6452k.m12181e(array, "array");
            AbstractC6452k.m12181e(offset, "offset");
            AbstractC6452k.m12181e(length, "length");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), array, toExprOrConstant$com_google_firebase_firebase_firestore(offset), toExprOrConstant$com_google_firebase_firebase_firestore(length));
        }

        public final Expression concat(String first, Object second, Object... others) {
            AbstractC6452k.m12181e(first, "first");
            AbstractC6452k.m12181e(second, "second");
            AbstractC6452k.m12181e(others, "others");
            InterfaceC6498l evaluateConcat = GenericsKt.getEvaluateConcat();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(second);
            c0783s0.m1658b(others);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("concat", evaluateConcat, first, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final BooleanExpression arrayContainsAny(String arrayFieldName, Expression arrayExpression) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
            return new BooleanFunctionExpression("array_contains_any", ArrayKt.getEvaluateArrayContainsAny(), arrayFieldName, arrayExpression);
        }

        public final Expression arrayConcat(String firstArrayField, Object secondArray, Object... otherArrays) {
            AbstractC6452k.m12181e(firstArrayField, "firstArrayField");
            AbstractC6452k.m12181e(secondArray, "secondArray");
            AbstractC6452k.m12181e(otherArrays, "otherArrays");
            InterfaceC6498l evaluateArrayConcat = ArrayKt.getEvaluateArrayConcat();
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(secondArray);
            c0783s0.m1658b(otherArrays);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("array_concat", evaluateArrayConcat, firstArrayField, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression arraySlice(String arrayFieldName, Expression offset, Expression length) {
            AbstractC6452k.m12181e(arrayFieldName, "arrayFieldName");
            AbstractC6452k.m12181e(offset, "offset");
            AbstractC6452k.m12181e(length, "length");
            return new FunctionExpression("array_slice", UtilsKt.getNotImplemented(), arrayFieldName, toExprOrConstant$com_google_firebase_firebase_firestore(offset), toExprOrConstant$com_google_firebase_firebase_firestore(length));
        }

        public final Expression mapSet(String mapField, Expression key, Expression value, Expression... moreKeyValues) {
            AbstractC6452k.m12181e(mapField, "mapField");
            AbstractC6452k.m12181e(key, "key");
            AbstractC6452k.m12181e(value, "value");
            AbstractC6452k.m12181e(moreKeyValues, "moreKeyValues");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            Field field = field(mapField);
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(value);
            c0783s0.m1658b(moreKeyValues);
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("map_set", notImplemented, field, key, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression timestampTruncateWithTimezone(String fieldName, Expression granularity, String timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), field(fieldName), granularity, constant(timezone));
        }

        public final Expression mapSet(String mapField, String key, Object obj, Object... moreKeyValues) {
            AbstractC6452k.m12181e(mapField, "mapField");
            AbstractC6452k.m12181e(key, "key");
            AbstractC6452k.m12181e(moreKeyValues, "moreKeyValues");
            InterfaceC6498l notImplemented = UtilsKt.getNotImplemented();
            Field field = field(mapField);
            Expression expressionConstant = constant(key);
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(toExprOrConstant$com_google_firebase_firebase_firestore(obj));
            c0783s0.m1658b(toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(moreKeyValues));
            ArrayList arrayList = c0783s0.f2033b;
            return new FunctionExpression("map_set", notImplemented, field, expressionConstant, arrayList.toArray(new Object[arrayList.size()]));
        }

        public final Expression timestampTruncateWithTimezone(Expression timestamp, String granularity, Expression timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), timestamp, constant(granularity), timezone);
        }

        public final Expression timestampTruncateWithTimezone(Expression timestamp, Expression granularity, Expression timezone) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), timestamp, granularity, timezone);
        }

        public final Expression timestampTruncateWithTimezone(String fieldName, String granularity, Expression timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), field(fieldName), constant(granularity), timezone);
        }

        public final Expression timestampTruncateWithTimezone(String fieldName, Expression granularity, Expression timezone) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(granularity, "granularity");
            AbstractC6452k.m12181e(timezone, "timezone");
            return new FunctionExpression("timestamp_trunc", UtilsKt.getNotImplemented(), field(fieldName), granularity, timezone);
        }
    }

    public static final class Constant extends Expression {
        private final C0393Z0 value;

        public Constant(C0393Z0 value) {
            AbstractC6452k.m12181e(value, "value");
            this.value = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EvaluateResultValue evaluateFunction$lambda$0(Constant constant, MutableDocument mutableDocument) {
            AbstractC6452k.m12181e(mutableDocument, "<unused var>");
            return new EvaluateResultValue(constant.value);
        }

        @Override // com.google.firebase.firestore.pipeline.Expression
        public String canonicalId$com_google_firebase_firebase_firestore() {
            return "cst(" + Values.canonicalId(this.value) + ')';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Constant) {
                return AbstractC6452k.m12177a(this.value, ((Constant) obj).value);
            }
            return false;
        }

        @Override // com.google.firebase.firestore.pipeline.Expression
        public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
            AbstractC6452k.m12181e(context, "context");
            return new C0313b(this, 2);
        }

        public final C0393Z0 getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // com.google.firebase.firestore.pipeline.Expression
        public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
            AbstractC6452k.m12181e(userDataReader, "userDataReader");
            return this.value;
        }

        public String toString() {
            return canonicalId$com_google_firebase_firebase_firestore();
        }
    }

    public static final Expression abs(Expression expression) {
        return Companion.abs(expression);
    }

    public static final Expression add(Expression expression, Expression expression2) {
        return Companion.add(expression, expression2);
    }

    public static final BooleanExpression and(BooleanExpression booleanExpression, BooleanExpression... booleanExpressionArr) {
        return Companion.and(booleanExpression, booleanExpressionArr);
    }

    public static final Expression array(List<? extends Object> list) {
        return Companion.array(list);
    }

    public static final Expression arrayConcat(Expression expression, Expression expression2, Object... objArr) {
        return Companion.arrayConcat(expression, expression2, objArr);
    }

    public static final BooleanExpression arrayContains(Expression expression, Expression expression2) {
        return Companion.arrayContains(expression, expression2);
    }

    public static final BooleanExpression arrayContainsAll(Expression expression, Expression expression2) {
        return Companion.arrayContainsAll(expression, expression2);
    }

    public static final BooleanExpression arrayContainsAny(Expression expression, Expression expression2) {
        return Companion.arrayContainsAny(expression, expression2);
    }

    public static final Expression arrayFilter(Expression expression, String str, BooleanExpression booleanExpression) {
        return Companion.arrayFilter(expression, str, booleanExpression);
    }

    public static final Expression arrayFirst(Expression expression) {
        return Companion.arrayFirst(expression);
    }

    public static final Expression arrayFirstN(Expression expression, int i2) {
        return Companion.arrayFirstN(expression, i2);
    }

    public static final Expression arrayGet(Expression expression, int i2) {
        return Companion.arrayGet(expression, i2);
    }

    public static final Expression arrayIndexOf(Expression expression, Object obj) {
        return Companion.arrayIndexOf(expression, obj);
    }

    public static final Expression arrayIndexOfAll(Expression expression, Object obj) {
        return Companion.arrayIndexOfAll(expression, obj);
    }

    public static final Expression arrayLast(Expression expression) {
        return Companion.arrayLast(expression);
    }

    public static final Expression arrayLastIndexOf(Expression expression, Object obj) {
        return Companion.arrayLastIndexOf(expression, obj);
    }

    public static final Expression arrayLastN(Expression expression, int i2) {
        return Companion.arrayLastN(expression, i2);
    }

    public static final Expression arrayLength(Expression expression) {
        return Companion.arrayLength(expression);
    }

    public static final Expression arrayMaximum(Expression expression) {
        return Companion.arrayMaximum(expression);
    }

    public static final Expression arrayMaximumN(Expression expression, int i2) {
        return Companion.arrayMaximumN(expression, i2);
    }

    public static final Expression arrayMinimum(Expression expression) {
        return Companion.arrayMinimum(expression);
    }

    public static final Expression arrayMinimumN(Expression expression, int i2) {
        return Companion.arrayMinimumN(expression, i2);
    }

    public static final Expression arrayReverse(Expression expression) {
        return Companion.arrayReverse(expression);
    }

    public static final Expression arraySlice(Expression expression, int i2, int i3) {
        return Companion.arraySlice(expression, i2, i3);
    }

    public static final Expression arraySliceToEnd(Expression expression, int i2) {
        return Companion.arraySliceToEnd(expression, i2);
    }

    public static final Expression arraySum(Expression expression) {
        return Companion.arraySum(expression);
    }

    public static final Expression arrayTransform(Expression expression, String str, Expression expression2) {
        return Companion.arrayTransform(expression, str, expression2);
    }

    public static final Expression arrayTransformWithIndex(Expression expression, String str, String str2, Expression expression2) {
        return Companion.arrayTransformWithIndex(expression, str, str2, expression2);
    }

    public static final Expression bitAnd(Expression expression, Expression expression2) {
        return Companion.bitAnd(expression, expression2);
    }

    public static final Expression bitLeftShift(Expression expression, int i2) {
        return Companion.bitLeftShift(expression, i2);
    }

    public static final Expression bitNot(Expression expression) {
        return Companion.bitNot(expression);
    }

    public static final Expression bitOr(Expression expression, Expression expression2) {
        return Companion.bitOr(expression, expression2);
    }

    public static final Expression bitRightShift(Expression expression, int i2) {
        return Companion.bitRightShift(expression, i2);
    }

    public static final Expression bitXor(Expression expression, Expression expression2) {
        return Companion.bitXor(expression, expression2);
    }

    public static final Expression byteLength(Expression expression) {
        return Companion.byteLength(expression);
    }

    public static final Expression ceil(Expression expression) {
        return Companion.ceil(expression);
    }

    public static final Expression charLength(Expression expression) {
        return Companion.charLength(expression);
    }

    public static final Expression coalesce(Expression expression, Object obj, Object... objArr) {
        return Companion.coalesce(expression, obj, objArr);
    }

    public static final Expression collectionId(Expression expression) {
        return Companion.collectionId(expression);
    }

    public static final Expression concat(Expression expression, Expression expression2, Object... objArr) {
        return Companion.concat(expression, expression2, objArr);
    }

    public static final Expression conditional(BooleanExpression booleanExpression, Expression expression, Expression expression2) {
        return Companion.conditional(booleanExpression, expression, expression2);
    }

    public static final BooleanExpression constant(boolean z) {
        return Companion.constant(z);
    }

    public static final Expression cosineDistance(Expression expression, VectorValue vectorValue) {
        return Companion.cosineDistance(expression, vectorValue);
    }

    public static final Expression currentDocument() {
        return Companion.currentDocument();
    }

    public static final Expression currentTimestamp() {
        return Companion.currentTimestamp();
    }

    public static final Expression divide(Expression expression, Expression expression2) {
        return Companion.divide(expression, expression2);
    }

    public static final Expression documentId(DocumentReference documentReference) {
        return Companion.documentId(documentReference);
    }

    public static final BooleanExpression documentMatches(String str) {
        return Companion.documentMatches(str);
    }

    public static final Expression dotProduct(Expression expression, VectorValue vectorValue) {
        return Companion.dotProduct(expression, vectorValue);
    }

    public static final BooleanExpression endsWith(Expression expression, Expression expression2) {
        return Companion.endsWith(expression, expression2);
    }

    public static final BooleanExpression equal(Expression expression, Expression expression2) {
        return Companion.equal(expression, expression2);
    }

    public static final BooleanExpression equalAny(Expression expression, Expression expression2) {
        return Companion.equalAny(expression, expression2);
    }

    public static final Expression euclideanDistance(Expression expression, VectorValue vectorValue) {
        return Companion.euclideanDistance(expression, vectorValue);
    }

    public static final BooleanExpression exists(Expression expression) {
        return Companion.exists(expression);
    }

    public static final Expression exp(Expression expression) {
        return Companion.exp(expression);
    }

    public static final Field field(com.google.firebase.firestore.FieldPath fieldPath) {
        return Companion.field(fieldPath);
    }

    public static final Expression floor(Expression expression) {
        return Companion.floor(expression);
    }

    public static final Expression geoDistance(Field field, GeoPoint geoPoint) {
        return Companion.geoDistance(field, geoPoint);
    }

    public static final Expression getField(Expression expression, Expression expression2) {
        return Companion.getField(expression, expression2);
    }

    public static final BooleanExpression greaterThan(Expression expression, Expression expression2) {
        return Companion.greaterThan(expression, expression2);
    }

    public static final BooleanExpression greaterThanOrEqual(Expression expression, Expression expression2) {
        return Companion.greaterThanOrEqual(expression, expression2);
    }

    public static final Expression ifAbsent(Expression expression, Expression expression2) {
        return Companion.ifAbsent(expression, expression2);
    }

    public static final BooleanExpression ifError(BooleanExpression booleanExpression, BooleanExpression booleanExpression2) {
        return Companion.ifError(booleanExpression, booleanExpression2);
    }

    public static final Expression ifNull(Expression expression, Expression expression2) {
        return Companion.ifNull(expression, expression2);
    }

    public static final BooleanExpression isAbsent(Expression expression) {
        return Companion.isAbsent(expression);
    }

    public static final BooleanExpression isError(Expression expression) {
        return Companion.isError(expression);
    }

    public static final BooleanExpression isType(Expression expression, String str) {
        return Companion.isType(expression, str);
    }

    public static final Expression join(Expression expression, Expression expression2) {
        return Companion.join(expression, expression2);
    }

    public static final Expression length(Expression expression) {
        return Companion.length(expression);
    }

    public static final BooleanExpression lessThan(Expression expression, Expression expression2) {
        return Companion.lessThan(expression, expression2);
    }

    public static final BooleanExpression lessThanOrEqual(Expression expression, Expression expression2) {
        return Companion.lessThanOrEqual(expression, expression2);
    }

    public static final BooleanExpression like(Expression expression, Expression expression2) {
        return Companion.like(expression, expression2);
    }

    /* JADX INFO: renamed from: ln */
    public static final Expression m11442ln(Expression expression) {
        return Companion.m11446ln(expression);
    }

    public static final Expression log(Expression expression, Expression expression2) {
        return Companion.log(expression, expression2);
    }

    public static final Expression log10(Expression expression) {
        return Companion.log10(expression);
    }

    public static final Expression logicalMaximum(Expression expression, Object... objArr) {
        return Companion.logicalMaximum(expression, objArr);
    }

    public static final Expression logicalMinimum(Expression expression, Object... objArr) {
        return Companion.logicalMinimum(expression, objArr);
    }

    public static final Expression ltrim(Expression expression) {
        return Companion.ltrim(expression);
    }

    public static final Expression ltrimValue(Expression expression, Expression expression2) {
        return Companion.ltrimValue(expression, expression2);
    }

    public static final Expression map(Map<String, ? extends Object> map) {
        return Companion.map(map);
    }

    public static final Expression mapEntries(Expression expression) {
        return Companion.mapEntries(expression);
    }

    public static final Expression mapGet(Expression expression, Expression expression2) {
        return Companion.mapGet(expression, expression2);
    }

    public static final Expression mapKeys(Expression expression) {
        return Companion.mapKeys(expression);
    }

    public static final Expression mapMerge(Expression expression, Expression expression2, Expression... expressionArr) {
        return Companion.mapMerge(expression, expression2, expressionArr);
    }

    public static final Expression mapRemove(Expression expression, Expression expression2) {
        return Companion.mapRemove(expression, expression2);
    }

    public static final Expression mapSet(Expression expression, Expression expression2, Expression expression3, Expression... expressionArr) {
        return Companion.mapSet(expression, expression2, expression3, expressionArr);
    }

    public static final Expression mapValues(Expression expression) {
        return Companion.mapValues(expression);
    }

    public static final Expression mod(Expression expression, Expression expression2) {
        return Companion.mod(expression, expression2);
    }

    public static final Expression multiply(Expression expression, Expression expression2) {
        return Companion.multiply(expression, expression2);
    }

    public static final BooleanExpression nor(BooleanExpression booleanExpression, BooleanExpression... booleanExpressionArr) {
        return Companion.nor(booleanExpression, booleanExpressionArr);
    }

    public static final BooleanExpression not(BooleanExpression booleanExpression) {
        return Companion.not(booleanExpression);
    }

    public static final BooleanExpression notEqual(Expression expression, Expression expression2) {
        return Companion.notEqual(expression, expression2);
    }

    public static final BooleanExpression notEqualAny(Expression expression, Expression expression2) {
        return Companion.notEqualAny(expression, expression2);
    }

    public static final Expression nullValue() {
        return Companion.nullValue();
    }

    /* JADX INFO: renamed from: or */
    public static final BooleanExpression m11444or(BooleanExpression booleanExpression, BooleanExpression... booleanExpressionArr) {
        return Companion.m11448or(booleanExpression, booleanExpressionArr);
    }

    public static final Expression parent(DocumentReference documentReference) {
        return Companion.parent(documentReference);
    }

    public static final Expression pow(Expression expression, Expression expression2) {
        return Companion.pow(expression, expression2);
    }

    public static final Expression rand() {
        return Companion.rand();
    }

    public static final Expression rawFunction(String str, Expression... expressionArr) {
        return Companion.rawFunction(str, expressionArr);
    }

    public static final BooleanExpression regexContains(Expression expression, Expression expression2) {
        return Companion.regexContains(expression, expression2);
    }

    public static final Expression regexFind(Expression expression, Expression expression2) {
        return Companion.regexFind(expression, expression2);
    }

    public static final Expression regexFindAll(Expression expression, Expression expression2) {
        return Companion.regexFindAll(expression, expression2);
    }

    public static final BooleanExpression regexMatch(Expression expression, Expression expression2) {
        return Companion.regexMatch(expression, expression2);
    }

    public static final Expression reverse(Expression expression) {
        return Companion.reverse(expression);
    }

    public static final Expression round(Expression expression) {
        return Companion.round(expression);
    }

    public static final Expression roundToPrecision(Expression expression, int i2) {
        return Companion.roundToPrecision(expression, i2);
    }

    public static final Expression rtrim(Expression expression) {
        return Companion.rtrim(expression);
    }

    public static final Expression rtrimValue(Expression expression, Expression expression2) {
        return Companion.rtrimValue(expression, expression2);
    }

    public static final Expression score() {
        return Companion.score();
    }

    public static final Expression split(Expression expression, Blob blob) {
        return Companion.split(expression, blob);
    }

    public static final Expression sqrt(Expression expression) {
        return Companion.sqrt(expression);
    }

    public static final BooleanExpression startsWith(Expression expression, Expression expression2) {
        return Companion.startsWith(expression, expression2);
    }

    public static final Expression stringConcat(Expression expression, Expression... expressionArr) {
        return Companion.stringConcat(expression, expressionArr);
    }

    public static final BooleanExpression stringContains(Expression expression, Expression expression2) {
        return Companion.stringContains(expression, expression2);
    }

    public static final Expression stringIndexOf(Expression expression, Expression expression2) {
        return Companion.stringIndexOf(expression, expression2);
    }

    public static final Expression stringRepeat(Expression expression, int i2) {
        return Companion.stringRepeat(expression, i2);
    }

    public static final Expression stringReplaceAll(Expression expression, Expression expression2, Expression expression3) {
        return Companion.stringReplaceAll(expression, expression2, expression3);
    }

    public static final Expression stringReplaceOne(Expression expression, Expression expression2, Expression expression3) {
        return Companion.stringReplaceOne(expression, expression2, expression3);
    }

    public static final Expression stringReverse(Expression expression) {
        return Companion.stringReverse(expression);
    }

    public static final Expression substring(Expression expression, Expression expression2, Expression expression3) {
        return Companion.substring(expression, expression2, expression3);
    }

    public static final Expression subtract(Expression expression, Expression expression2) {
        return Companion.subtract(expression, expression2);
    }

    public static final Expression switchOn(BooleanExpression booleanExpression, Object obj, Object... objArr) {
        return Companion.switchOn(booleanExpression, obj, objArr);
    }

    public static final Expression timestampAdd(Expression expression, Expression expression2, Expression expression3) {
        return Companion.timestampAdd(expression, expression2, expression3);
    }

    public static final Expression timestampDiff(Expression expression, Expression expression2, Expression expression3) {
        return Companion.timestampDiff(expression, expression2, expression3);
    }

    public static final Expression timestampExtract(Expression expression, Expression expression2) {
        return Companion.timestampExtract(expression, expression2);
    }

    public static final Expression timestampExtractWithTimezone(Expression expression, Expression expression2, Expression expression3) {
        return Companion.timestampExtractWithTimezone(expression, expression2, expression3);
    }

    public static final Expression timestampSubtract(Expression expression, Expression expression2, Expression expression3) {
        return Companion.timestampSubtract(expression, expression2, expression3);
    }

    public static final Expression timestampToUnixMicros(Expression expression) {
        return Companion.timestampToUnixMicros(expression);
    }

    public static final Expression timestampToUnixMillis(Expression expression) {
        return Companion.timestampToUnixMillis(expression);
    }

    public static final Expression timestampToUnixSeconds(Expression expression) {
        return Companion.timestampToUnixSeconds(expression);
    }

    public static final Expression timestampTruncate(Expression expression, Expression expression2) {
        return Companion.timestampTruncate(expression, expression2);
    }

    public static final Expression timestampTruncateWithTimezone(Expression expression, Expression expression2, Expression expression3) {
        return Companion.timestampTruncateWithTimezone(expression, expression2, expression3);
    }

    public static final Expression toLower(Expression expression) {
        return Companion.toLower(expression);
    }

    public static final Expression toUpper(Expression expression) {
        return Companion.toUpper(expression);
    }

    public static final Expression trim(Expression expression) {
        return Companion.trim(expression);
    }

    public static final Expression trimValue(Expression expression, Expression expression2) {
        return Companion.trimValue(expression, expression2);
    }

    public static final Expression trunc(Expression expression) {
        return Companion.trunc(expression);
    }

    public static final Expression truncToPrecision(Expression expression, int i2) {
        return Companion.truncToPrecision(expression, i2);
    }

    public static final Expression type(Expression expression) {
        return Companion.type(expression);
    }

    public static final Expression unixMicrosToTimestamp(Expression expression) {
        return Companion.unixMicrosToTimestamp(expression);
    }

    public static final Expression unixMillisToTimestamp(Expression expression) {
        return Companion.unixMillisToTimestamp(expression);
    }

    public static final Expression unixSecondsToTimestamp(Expression expression) {
        return Companion.unixSecondsToTimestamp(expression);
    }

    public static final Expression variable(String str) {
        return Companion.variable(str);
    }

    public static final Expression vector(VectorValue vectorValue) {
        return Companion.vector(vectorValue);
    }

    public static final Expression vectorLength(Expression expression) {
        return Companion.vectorLength(expression);
    }

    public static final BooleanExpression xor(BooleanExpression booleanExpression, BooleanExpression... booleanExpressionArr) {
        return Companion.xor(booleanExpression, booleanExpressionArr);
    }

    public AliasedExpression alias(String alias) {
        AbstractC6452k.m12181e(alias, "alias");
        return new AliasedExpression(alias, this);
    }

    public final AggregateFunction arrayAgg() {
        return AggregateFunction.Companion.arrayAgg(this);
    }

    public final AggregateFunction arrayAggDistinct() {
        return AggregateFunction.Companion.arrayAggDistinct(this);
    }

    public final BooleanExpression asBoolean() {
        if (this instanceof BooleanExpression) {
            return (BooleanExpression) this;
        }
        if (this instanceof Constant) {
            return new BooleanConstant((Constant) this);
        }
        return this instanceof Field ? new BooleanField((Field) this) : new BooleanFunctionExpression((FunctionExpression) this);
    }

    public final Ordering ascending() {
        return Ordering.Companion.ascending(this);
    }

    public final AggregateFunction average() {
        return AggregateFunction.Companion.average(this);
    }

    public abstract String canonicalId$com_google_firebase_firebase_firestore();

    public final AggregateFunction count() {
        return AggregateFunction.Companion.count(this);
    }

    public final AggregateFunction countDistinct() {
        return AggregateFunction.Companion.countDistinct(this);
    }

    public final Ordering descending() {
        return Ordering.Companion.descending(this);
    }

    public abstract InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext evaluationContext);

    public final AggregateFunction first() {
        return AggregateFunction.Companion.first(this);
    }

    public final AggregateFunction last() {
        return AggregateFunction.Companion.last(this);
    }

    public final AggregateFunction maximum() {
        return AggregateFunction.Companion.maximum(this);
    }

    public final AggregateFunction minimum() {
        return AggregateFunction.Companion.minimum(this);
    }

    public final AggregateFunction sum() {
        return AggregateFunction.Companion.sum(this);
    }

    public abstract C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader);

    public static final Expression abs(String str) {
        return Companion.abs(str);
    }

    public static final Expression add(Expression expression, Number number) {
        return Companion.add(expression, number);
    }

    public static final Expression array(Object... objArr) {
        return Companion.array(objArr);
    }

    public static final Expression arrayConcat(Expression expression, Object obj, Object... objArr) {
        return Companion.arrayConcat(expression, obj, objArr);
    }

    public static final BooleanExpression arrayContains(Expression expression, Object obj) {
        return Companion.arrayContains(expression, obj);
    }

    public static final BooleanExpression arrayContainsAll(Expression expression, List<? extends Object> list) {
        return Companion.arrayContainsAll(expression, list);
    }

    public static final BooleanExpression arrayContainsAny(Expression expression, List<? extends Object> list) {
        return Companion.arrayContainsAny(expression, list);
    }

    public static final Expression arrayFilter(String str, String str2, BooleanExpression booleanExpression) {
        return Companion.arrayFilter(str, str2, booleanExpression);
    }

    public static final Expression arrayFirst(String str) {
        return Companion.arrayFirst(str);
    }

    public static final Expression arrayFirstN(Expression expression, Expression expression2) {
        return Companion.arrayFirstN(expression, expression2);
    }

    public static final Expression arrayGet(Expression expression, Expression expression2) {
        return Companion.arrayGet(expression, expression2);
    }

    public static final Expression arrayIndexOf(String str, Object obj) {
        return Companion.arrayIndexOf(str, obj);
    }

    public static final Expression arrayIndexOfAll(String str, Object obj) {
        return Companion.arrayIndexOfAll(str, obj);
    }

    public static final Expression arrayLast(String str) {
        return Companion.arrayLast(str);
    }

    public static final Expression arrayLastIndexOf(String str, Object obj) {
        return Companion.arrayLastIndexOf(str, obj);
    }

    public static final Expression arrayLastN(Expression expression, Expression expression2) {
        return Companion.arrayLastN(expression, expression2);
    }

    public static final Expression arrayLength(String str) {
        return Companion.arrayLength(str);
    }

    public static final Expression arrayMaximum(String str) {
        return Companion.arrayMaximum(str);
    }

    public static final Expression arrayMaximumN(Expression expression, Expression expression2) {
        return Companion.arrayMaximumN(expression, expression2);
    }

    public static final Expression arrayMinimum(String str) {
        return Companion.arrayMinimum(str);
    }

    public static final Expression arrayMinimumN(Expression expression, Expression expression2) {
        return Companion.arrayMinimumN(expression, expression2);
    }

    public static final Expression arrayReverse(String str) {
        return Companion.arrayReverse(str);
    }

    public static final Expression arraySlice(Expression expression, Expression expression2, Expression expression3) {
        return Companion.arraySlice(expression, expression2, expression3);
    }

    public static final Expression arraySliceToEnd(Expression expression, Expression expression2) {
        return Companion.arraySliceToEnd(expression, expression2);
    }

    public static final Expression arraySum(String str) {
        return Companion.arraySum(str);
    }

    public static final Expression arrayTransform(String str, String str2, Expression expression) {
        return Companion.arrayTransform(str, str2, expression);
    }

    public static final Expression arrayTransformWithIndex(String str, String str2, String str3, Expression expression) {
        return Companion.arrayTransformWithIndex(str, str2, str3, expression);
    }

    public static final Expression bitAnd(Expression expression, byte[] bArr) {
        return Companion.bitAnd(expression, bArr);
    }

    public static final Expression bitLeftShift(Expression expression, Expression expression2) {
        return Companion.bitLeftShift(expression, expression2);
    }

    public static final Expression bitNot(String str) {
        return Companion.bitNot(str);
    }

    public static final Expression bitOr(Expression expression, byte[] bArr) {
        return Companion.bitOr(expression, bArr);
    }

    public static final Expression bitRightShift(Expression expression, Expression expression2) {
        return Companion.bitRightShift(expression, expression2);
    }

    public static final Expression bitXor(Expression expression, byte[] bArr) {
        return Companion.bitXor(expression, bArr);
    }

    public static final Expression byteLength(String str) {
        return Companion.byteLength(str);
    }

    public static final Expression ceil(String str) {
        return Companion.ceil(str);
    }

    public static final Expression charLength(String str) {
        return Companion.charLength(str);
    }

    public static final Expression coalesce(String str, Object obj, Object... objArr) {
        return Companion.coalesce(str, obj, objArr);
    }

    public static final Expression collectionId(String str) {
        return Companion.collectionId(str);
    }

    public static final Expression concat(Expression expression, Object obj, Object... objArr) {
        return Companion.concat(expression, obj, objArr);
    }

    public static final Expression conditional(BooleanExpression booleanExpression, Object obj, Object obj2) {
        return Companion.conditional(booleanExpression, obj, obj2);
    }

    public static final Expression constant(Timestamp timestamp) {
        return Companion.constant(timestamp);
    }

    public static final Expression cosineDistance(Expression expression, Expression expression2) {
        return Companion.cosineDistance(expression, expression2);
    }

    public static final Expression divide(Expression expression, Number number) {
        return Companion.divide(expression, number);
    }

    public static final Expression documentId(Expression expression) {
        return Companion.documentId(expression);
    }

    public static final Expression dotProduct(Expression expression, Expression expression2) {
        return Companion.dotProduct(expression, expression2);
    }

    public static final BooleanExpression endsWith(Expression expression, String str) {
        return Companion.endsWith(expression, str);
    }

    public static final BooleanExpression equal(Expression expression, Object obj) {
        return Companion.equal(expression, obj);
    }

    public static final BooleanExpression equalAny(Expression expression, List<? extends Object> list) {
        return Companion.equalAny(expression, list);
    }

    public static final Expression euclideanDistance(Expression expression, Expression expression2) {
        return Companion.euclideanDistance(expression, expression2);
    }

    public static final BooleanExpression exists(String str) {
        return Companion.exists(str);
    }

    public static final Expression exp(String str) {
        return Companion.exp(str);
    }

    public static final Field field(String str) {
        return Companion.field(str);
    }

    public static final Expression floor(String str) {
        return Companion.floor(str);
    }

    public static final Expression geoDistance(String str, GeoPoint geoPoint) {
        return Companion.geoDistance(str, geoPoint);
    }

    public static final Expression getField(Expression expression, String str) {
        return Companion.getField(expression, str);
    }

    public static final BooleanExpression greaterThan(Expression expression, Object obj) {
        return Companion.greaterThan(expression, obj);
    }

    public static final BooleanExpression greaterThanOrEqual(Expression expression, Object obj) {
        return Companion.greaterThanOrEqual(expression, obj);
    }

    public static final Expression ifAbsent(Expression expression, Object obj) {
        return Companion.ifAbsent(expression, obj);
    }

    public static final Expression ifError(Expression expression, Expression expression2) {
        return Companion.ifError(expression, expression2);
    }

    public static final Expression ifNull(Expression expression, Object obj) {
        return Companion.ifNull(expression, obj);
    }

    public static final BooleanExpression isAbsent(String str) {
        return Companion.isAbsent(str);
    }

    public static final BooleanExpression isType(String str, String str2) {
        return Companion.isType(str, str2);
    }

    public static final Expression join(Expression expression, String str) {
        return Companion.join(expression, str);
    }

    public static final Expression length(String str) {
        return Companion.length(str);
    }

    public static final BooleanExpression lessThan(Expression expression, Object obj) {
        return Companion.lessThan(expression, obj);
    }

    public static final BooleanExpression lessThanOrEqual(Expression expression, Object obj) {
        return Companion.lessThanOrEqual(expression, obj);
    }

    public static final BooleanExpression like(Expression expression, String str) {
        return Companion.like(expression, str);
    }

    /* JADX INFO: renamed from: ln */
    public static final Expression m11443ln(String str) {
        return Companion.m11447ln(str);
    }

    public static final Expression log(Expression expression, Number number) {
        return Companion.log(expression, number);
    }

    public static final Expression log10(String str) {
        return Companion.log10(str);
    }

    public static final Expression logicalMaximum(String str, Object... objArr) {
        return Companion.logicalMaximum(str, objArr);
    }

    public static final Expression logicalMinimum(String str, Object... objArr) {
        return Companion.logicalMinimum(str, objArr);
    }

    public static final Expression ltrim(String str) {
        return Companion.ltrim(str);
    }

    public static final Expression ltrimValue(Expression expression, String str) {
        return Companion.ltrimValue(expression, str);
    }

    public static final Expression mapEntries(String str) {
        return Companion.mapEntries(str);
    }

    public static final Expression mapGet(Expression expression, String str) {
        return Companion.mapGet(expression, str);
    }

    public static final Expression mapKeys(String str) {
        return Companion.mapKeys(str);
    }

    public static final Expression mapMerge(String str, Expression expression, Expression... expressionArr) {
        return Companion.mapMerge(str, expression, expressionArr);
    }

    public static final Expression mapRemove(Expression expression, String str) {
        return Companion.mapRemove(expression, str);
    }

    public static final Expression mapSet(Expression expression, String str, Object obj, Object... objArr) {
        return Companion.mapSet(expression, str, obj, objArr);
    }

    public static final Expression mapValues(String str) {
        return Companion.mapValues(str);
    }

    public static final Expression mod(Expression expression, Number number) {
        return Companion.mod(expression, number);
    }

    public static final Expression multiply(Expression expression, Number number) {
        return Companion.multiply(expression, number);
    }

    public static final BooleanExpression notEqual(Expression expression, Object obj) {
        return Companion.notEqual(expression, obj);
    }

    public static final BooleanExpression notEqualAny(Expression expression, List<? extends Object> list) {
        return Companion.notEqualAny(expression, list);
    }

    public static final Expression parent(Expression expression) {
        return Companion.parent(expression);
    }

    public static final Expression pow(Expression expression, Number number) {
        return Companion.pow(expression, number);
    }

    public static final BooleanExpression regexContains(Expression expression, String str) {
        return Companion.regexContains(expression, str);
    }

    public static final Expression regexFind(Expression expression, String str) {
        return Companion.regexFind(expression, str);
    }

    public static final Expression regexFindAll(Expression expression, String str) {
        return Companion.regexFindAll(expression, str);
    }

    public static final BooleanExpression regexMatch(Expression expression, String str) {
        return Companion.regexMatch(expression, str);
    }

    public static final Expression reverse(String str) {
        return Companion.reverse(str);
    }

    public static final Expression round(String str) {
        return Companion.round(str);
    }

    public static final Expression roundToPrecision(Expression expression, Expression expression2) {
        return Companion.roundToPrecision(expression, expression2);
    }

    public static final Expression rtrim(String str) {
        return Companion.rtrim(str);
    }

    public static final Expression rtrimValue(Expression expression, String str) {
        return Companion.rtrimValue(expression, str);
    }

    public static final Expression split(Expression expression, Expression expression2) {
        return Companion.split(expression, expression2);
    }

    public static final Expression sqrt(String str) {
        return Companion.sqrt(str);
    }

    public static final BooleanExpression startsWith(Expression expression, String str) {
        return Companion.startsWith(expression, str);
    }

    public static final Expression stringConcat(Expression expression, Object... objArr) {
        return Companion.stringConcat(expression, objArr);
    }

    public static final BooleanExpression stringContains(Expression expression, String str) {
        return Companion.stringContains(expression, str);
    }

    public static final Expression stringIndexOf(Expression expression, String str) {
        return Companion.stringIndexOf(expression, str);
    }

    public static final Expression stringRepeat(Expression expression, Expression expression2) {
        return Companion.stringRepeat(expression, expression2);
    }

    public static final Expression stringReplaceAll(Expression expression, String str, String str2) {
        return Companion.stringReplaceAll(expression, str, str2);
    }

    public static final Expression stringReplaceOne(Expression expression, String str, String str2) {
        return Companion.stringReplaceOne(expression, str, str2);
    }

    public static final Expression stringReverse(String str) {
        return Companion.stringReverse(str);
    }

    public static final Expression substring(String str, int i2, int i3) {
        return Companion.substring(str, i2, i3);
    }

    public static final Expression subtract(Expression expression, Number number) {
        return Companion.subtract(expression, number);
    }

    public static final Expression timestampAdd(Expression expression, String str, long j2) {
        return Companion.timestampAdd(expression, str, j2);
    }

    public static final Expression timestampDiff(Expression expression, Expression expression2, String str) {
        return Companion.timestampDiff(expression, expression2, str);
    }

    public static final Expression timestampExtract(Expression expression, String str) {
        return Companion.timestampExtract(expression, str);
    }

    public static final Expression timestampExtractWithTimezone(Expression expression, Expression expression2, String str) {
        return Companion.timestampExtractWithTimezone(expression, expression2, str);
    }

    public static final Expression timestampSubtract(Expression expression, String str, long j2) {
        return Companion.timestampSubtract(expression, str, j2);
    }

    public static final Expression timestampToUnixMicros(String str) {
        return Companion.timestampToUnixMicros(str);
    }

    public static final Expression timestampToUnixMillis(String str) {
        return Companion.timestampToUnixMillis(str);
    }

    public static final Expression timestampToUnixSeconds(String str) {
        return Companion.timestampToUnixSeconds(str);
    }

    public static final Expression timestampTruncate(Expression expression, String str) {
        return Companion.timestampTruncate(expression, str);
    }

    public static final Expression timestampTruncateWithTimezone(Expression expression, Expression expression2, String str) {
        return Companion.timestampTruncateWithTimezone(expression, expression2, str);
    }

    public static final Expression toLower(String str) {
        return Companion.toLower(str);
    }

    public static final Expression toUpper(String str) {
        return Companion.toUpper(str);
    }

    public static final Expression trim(String str) {
        return Companion.trim(str);
    }

    public static final Expression trimValue(String str, String str2) {
        return Companion.trimValue(str, str2);
    }

    public static final Expression trunc(String str) {
        return Companion.trunc(str);
    }

    public static final Expression truncToPrecision(Expression expression, Expression expression2) {
        return Companion.truncToPrecision(expression, expression2);
    }

    public static final Expression type(String str) {
        return Companion.type(str);
    }

    public static final Expression unixMicrosToTimestamp(String str) {
        return Companion.unixMicrosToTimestamp(str);
    }

    public static final Expression unixMillisToTimestamp(String str) {
        return Companion.unixMillisToTimestamp(str);
    }

    public static final Expression unixSecondsToTimestamp(String str) {
        return Companion.unixSecondsToTimestamp(str);
    }

    public static final Expression vector(double[] dArr) {
        return Companion.vector(dArr);
    }

    public static final Expression vectorLength(String str) {
        return Companion.vectorLength(str);
    }

    public final BooleanExpression isError() {
        return Companion.isError(this);
    }

    public static final Expression add(String str, Expression expression) {
        return Companion.add(str, expression);
    }

    public static final Expression arrayConcat(String str, Expression expression, Object... objArr) {
        return Companion.arrayConcat(str, expression, objArr);
    }

    public static final BooleanExpression arrayContains(String str, Expression expression) {
        return Companion.arrayContains(str, expression);
    }

    public static final BooleanExpression arrayContainsAll(String str, Expression expression) {
        return Companion.arrayContainsAll(str, expression);
    }

    public static final BooleanExpression arrayContainsAny(String str, Expression expression) {
        return Companion.arrayContainsAny(str, expression);
    }

    public static final Expression arrayFirstN(String str, int i2) {
        return Companion.arrayFirstN(str, i2);
    }

    public static final Expression arrayGet(String str, int i2) {
        return Companion.arrayGet(str, i2);
    }

    public static final Expression arrayLastN(String str, int i2) {
        return Companion.arrayLastN(str, i2);
    }

    public static final Expression arrayMaximumN(String str, int i2) {
        return Companion.arrayMaximumN(str, i2);
    }

    public static final Expression arrayMinimumN(String str, int i2) {
        return Companion.arrayMinimumN(str, i2);
    }

    public static final Expression arraySlice(String str, int i2, int i3) {
        return Companion.arraySlice(str, i2, i3);
    }

    public static final Expression arraySliceToEnd(String str, int i2) {
        return Companion.arraySliceToEnd(str, i2);
    }

    public static final Expression bitAnd(String str, Expression expression) {
        return Companion.bitAnd(str, expression);
    }

    public static final Expression bitLeftShift(String str, int i2) {
        return Companion.bitLeftShift(str, i2);
    }

    public static final Expression bitOr(String str, Expression expression) {
        return Companion.bitOr(str, expression);
    }

    public static final Expression bitRightShift(String str, int i2) {
        return Companion.bitRightShift(str, i2);
    }

    public static final Expression bitXor(String str, Expression expression) {
        return Companion.bitXor(str, expression);
    }

    public static final Expression concat(String str, Expression expression, Object... objArr) {
        return Companion.concat(str, expression, objArr);
    }

    public static final Expression constant(Blob blob) {
        return Companion.constant(blob);
    }

    public static final Expression cosineDistance(Expression expression, double[] dArr) {
        return Companion.cosineDistance(expression, dArr);
    }

    public static final Expression divide(String str, Expression expression) {
        return Companion.divide(str, expression);
    }

    public static final Expression documentId(String str) {
        return Companion.documentId(str);
    }

    public static final Expression dotProduct(Expression expression, double[] dArr) {
        return Companion.dotProduct(expression, dArr);
    }

    public static final BooleanExpression endsWith(String str, Expression expression) {
        return Companion.endsWith(str, expression);
    }

    public static final BooleanExpression equal(String str, Expression expression) {
        return Companion.equal(str, expression);
    }

    public static final BooleanExpression equalAny(String str, Expression expression) {
        return Companion.equalAny(str, expression);
    }

    public static final Expression euclideanDistance(Expression expression, double[] dArr) {
        return Companion.euclideanDistance(expression, dArr);
    }

    public static final Expression getField(String str, Expression expression) {
        return Companion.getField(str, expression);
    }

    public static final BooleanExpression greaterThan(String str, Expression expression) {
        return Companion.greaterThan(str, expression);
    }

    public static final BooleanExpression greaterThanOrEqual(String str, Expression expression) {
        return Companion.greaterThanOrEqual(str, expression);
    }

    public static final Expression ifAbsent(String str, Expression expression) {
        return Companion.ifAbsent(str, expression);
    }

    public static final Expression ifError(Expression expression, Object obj) {
        return Companion.ifError(expression, obj);
    }

    public static final Expression ifNull(String str, Expression expression) {
        return Companion.ifNull(str, expression);
    }

    public static final Expression join(String str, Expression expression) {
        return Companion.join(str, expression);
    }

    public static final BooleanExpression lessThan(String str, Expression expression) {
        return Companion.lessThan(str, expression);
    }

    public static final BooleanExpression lessThanOrEqual(String str, Expression expression) {
        return Companion.lessThanOrEqual(str, expression);
    }

    public static final BooleanExpression like(String str, Expression expression) {
        return Companion.like(str, expression);
    }

    public static final Expression log(String str, Expression expression) {
        return Companion.log(str, expression);
    }

    public static final Expression ltrimValue(String str, Expression expression) {
        return Companion.ltrimValue(str, expression);
    }

    public static final Expression mapGet(String str, Expression expression) {
        return Companion.mapGet(str, expression);
    }

    public static final Expression mapRemove(String str, Expression expression) {
        return Companion.mapRemove(str, expression);
    }

    public static final Expression mapSet(String str, Expression expression, Expression expression2, Expression... expressionArr) {
        return Companion.mapSet(str, expression, expression2, expressionArr);
    }

    public static final Expression mod(String str, Expression expression) {
        return Companion.mod(str, expression);
    }

    public static final Expression multiply(String str, Expression expression) {
        return Companion.multiply(str, expression);
    }

    public static final BooleanExpression notEqual(String str, Expression expression) {
        return Companion.notEqual(str, expression);
    }

    public static final BooleanExpression notEqualAny(String str, Expression expression) {
        return Companion.notEqualAny(str, expression);
    }

    public static final Expression parent(String str) {
        return Companion.parent(str);
    }

    public static final Expression pow(String str, Expression expression) {
        return Companion.pow(str, expression);
    }

    public static final BooleanExpression regexContains(String str, Expression expression) {
        return Companion.regexContains(str, expression);
    }

    public static final Expression regexFind(String str, Expression expression) {
        return Companion.regexFind(str, expression);
    }

    public static final Expression regexFindAll(String str, Expression expression) {
        return Companion.regexFindAll(str, expression);
    }

    public static final BooleanExpression regexMatch(String str, Expression expression) {
        return Companion.regexMatch(str, expression);
    }

    public static final Expression roundToPrecision(String str, int i2) {
        return Companion.roundToPrecision(str, i2);
    }

    public static final Expression rtrimValue(String str, Expression expression) {
        return Companion.rtrimValue(str, expression);
    }

    public static final Expression split(Expression expression, String str) {
        return Companion.split(expression, str);
    }

    public static final BooleanExpression startsWith(String str, Expression expression) {
        return Companion.startsWith(str, expression);
    }

    public static final Expression stringConcat(String str, Expression... expressionArr) {
        return Companion.stringConcat(str, expressionArr);
    }

    public static final BooleanExpression stringContains(String str, Expression expression) {
        return Companion.stringContains(str, expression);
    }

    public static final Expression stringIndexOf(String str, Expression expression) {
        return Companion.stringIndexOf(str, expression);
    }

    public static final Expression stringRepeat(String str, int i2) {
        return Companion.stringRepeat(str, i2);
    }

    public static final Expression stringReplaceAll(String str, Expression expression, Expression expression2) {
        return Companion.stringReplaceAll(str, expression, expression2);
    }

    public static final Expression stringReplaceOne(String str, Expression expression, Expression expression2) {
        return Companion.stringReplaceOne(str, expression, expression2);
    }

    public static final Expression subtract(String str, Expression expression) {
        return Companion.subtract(str, expression);
    }

    public static final Expression timestampAdd(String str, Expression expression, Expression expression2) {
        return Companion.timestampAdd(str, expression, expression2);
    }

    public static final Expression timestampDiff(Expression expression, String str, String str2) {
        return Companion.timestampDiff(expression, str, str2);
    }

    public static final Expression timestampExtract(String str, Expression expression) {
        return Companion.timestampExtract(str, expression);
    }

    public static final Expression timestampExtractWithTimezone(Expression expression, String str, Expression expression2) {
        return Companion.timestampExtractWithTimezone(expression, str, expression2);
    }

    public static final Expression timestampSubtract(String str, Expression expression, Expression expression2) {
        return Companion.timestampSubtract(str, expression, expression2);
    }

    public static final Expression timestampTruncate(String str, Expression expression) {
        return Companion.timestampTruncate(str, expression);
    }

    public static final Expression timestampTruncateWithTimezone(Expression expression, String str, Expression expression2) {
        return Companion.timestampTruncateWithTimezone(expression, str, expression2);
    }

    public static final Expression truncToPrecision(String str, int i2) {
        return Companion.truncToPrecision(str, i2);
    }

    public final Expression abs() {
        return Companion.abs(this);
    }

    public final Expression arrayFilter(String alias, BooleanExpression filter) {
        AbstractC6452k.m12181e(alias, "alias");
        AbstractC6452k.m12181e(filter, "filter");
        return Companion.arrayFilter(this, alias, filter);
    }

    public final Expression arrayFirst() {
        return Companion.arrayFirst(this);
    }

    public final Expression arrayIndexOf(Object obj) {
        return Companion.arrayIndexOf(this, obj);
    }

    public final Expression arrayIndexOfAll(Object obj) {
        return Companion.arrayIndexOfAll(this, obj);
    }

    public final Expression arrayLast() {
        return Companion.arrayLast(this);
    }

    public final Expression arrayLastIndexOf(Object obj) {
        return Companion.arrayLastIndexOf(this, obj);
    }

    public final Expression arrayLength() {
        return Companion.arrayLength(this);
    }

    public final Expression arrayMaximum() {
        return Companion.arrayMaximum(this);
    }

    public final Expression arrayMinimum() {
        return Companion.arrayMinimum(this);
    }

    public final Expression arrayReverse() {
        return Companion.arrayReverse(this);
    }

    public final Expression arraySum() {
        return Companion.arraySum(this);
    }

    public final Expression arrayTransform(String elementAlias, Expression transform) {
        AbstractC6452k.m12181e(elementAlias, "elementAlias");
        AbstractC6452k.m12181e(transform, "transform");
        return Companion.arrayTransform(this, elementAlias, transform);
    }

    public final Expression arrayTransformWithIndex(String elementAlias, String indexAlias, Expression transform) {
        AbstractC6452k.m12181e(elementAlias, "elementAlias");
        AbstractC6452k.m12181e(indexAlias, "indexAlias");
        AbstractC6452k.m12181e(transform, "transform");
        return Companion.arrayTransformWithIndex(this, elementAlias, indexAlias, transform);
    }

    public final Expression bitNot() {
        return Companion.bitNot(this);
    }

    public final Expression byteLength() {
        return Companion.byteLength(this);
    }

    public final Expression ceil() {
        return Companion.ceil(this);
    }

    public final Expression charLength() {
        return Companion.charLength(this);
    }

    public final Expression coalesce(Object replacement, Object... others) {
        AbstractC6452k.m12181e(replacement, "replacement");
        AbstractC6452k.m12181e(others, "others");
        return Companion.coalesce(this, replacement, Arrays.copyOf(others, others.length));
    }

    public final Expression collectionId() {
        return Companion.collectionId(this);
    }

    public final BooleanExpression exists() {
        return Companion.exists(this);
    }

    public final Expression exp() {
        return Companion.exp(this);
    }

    public final Expression floor() {
        return Companion.floor(this);
    }

    public final BooleanExpression isAbsent() {
        return Companion.isAbsent(this);
    }

    public final BooleanExpression isType(String type) {
        AbstractC6452k.m12181e(type, "type");
        return Companion.isType(this, type);
    }

    public final Expression length() {
        return Companion.length(this);
    }

    /* JADX INFO: renamed from: ln */
    public final Expression m11445ln() {
        return Companion.m11446ln(this);
    }

    public final Expression log10() {
        return Companion.log10(this);
    }

    public final Expression logicalMaximum(Expression... others) {
        AbstractC6452k.m12181e(others, "others");
        return Companion.logicalMaximum(this, Arrays.copyOf(others, others.length));
    }

    public final Expression logicalMinimum(Expression... others) {
        AbstractC6452k.m12181e(others, "others");
        return Companion.logicalMinimum(this, Arrays.copyOf(others, others.length));
    }

    public final Expression ltrim() {
        return Companion.ltrim(this);
    }

    public final Expression mapEntries() {
        return Companion.mapEntries(this);
    }

    public final Expression mapKeys() {
        return Companion.mapKeys(this);
    }

    public final Expression mapMerge(Expression mapExpr, Expression... otherMaps) {
        AbstractC6452k.m12181e(mapExpr, "mapExpr");
        AbstractC6452k.m12181e(otherMaps, "otherMaps");
        return Companion.mapMerge(this, mapExpr, (Expression[]) Arrays.copyOf(otherMaps, otherMaps.length));
    }

    public final Expression mapValues() {
        return Companion.mapValues(this);
    }

    public final Expression reverse() {
        return Companion.reverse(this);
    }

    public final Expression round() {
        return Companion.round(this);
    }

    public final Expression rtrim() {
        return Companion.rtrim(this);
    }

    public final Expression sqrt() {
        return Companion.sqrt(this);
    }

    public final Expression stringReverse() {
        return Companion.stringReverse(this);
    }

    public final Expression substring(Expression start, Expression length) {
        AbstractC6452k.m12181e(start, "start");
        AbstractC6452k.m12181e(length, "length");
        return Companion.substring(this, start, length);
    }

    public final Expression timestampToUnixMicros() {
        return Companion.timestampToUnixMicros(this);
    }

    public final Expression timestampToUnixMillis() {
        return Companion.timestampToUnixMillis(this);
    }

    public final Expression timestampToUnixSeconds() {
        return Companion.timestampToUnixSeconds(this);
    }

    public final Expression toLower() {
        return Companion.toLower(this);
    }

    public final Expression toUpper() {
        return Companion.toUpper(this);
    }

    public final Expression trim() {
        return Companion.trim(this);
    }

    public final Expression trimValue(String valueToTrim) {
        AbstractC6452k.m12181e(valueToTrim, "valueToTrim");
        Companion companion = Companion;
        return companion.trimValue(this, companion.constant(valueToTrim));
    }

    public final Expression trunc() {
        return Companion.trunc(this);
    }

    public final Expression type() {
        return Companion.type(this);
    }

    public final Expression unixMicrosToTimestamp() {
        return Companion.unixMicrosToTimestamp(this);
    }

    public final Expression unixMillisToTimestamp() {
        return Companion.unixMillisToTimestamp(this);
    }

    public final Expression unixSecondsToTimestamp() {
        return Companion.unixSecondsToTimestamp(this);
    }

    public final Expression vectorLength() {
        return Companion.vectorLength(this);
    }

    public static final Expression add(String str, Number number) {
        return Companion.add(str, number);
    }

    public static final Expression arrayConcat(String str, Object obj, Object... objArr) {
        return Companion.arrayConcat(str, obj, objArr);
    }

    public static final BooleanExpression arrayContains(String str, Object obj) {
        return Companion.arrayContains(str, obj);
    }

    public static final BooleanExpression arrayContainsAll(String str, List<? extends Object> list) {
        return Companion.arrayContainsAll(str, list);
    }

    public static final BooleanExpression arrayContainsAny(String str, List<? extends Object> list) {
        return Companion.arrayContainsAny(str, list);
    }

    public static final Expression arrayFirstN(String str, Expression expression) {
        return Companion.arrayFirstN(str, expression);
    }

    public static final Expression arrayGet(String str, Expression expression) {
        return Companion.arrayGet(str, expression);
    }

    public static final Expression arrayLastN(String str, Expression expression) {
        return Companion.arrayLastN(str, expression);
    }

    public static final Expression arrayMaximumN(String str, Expression expression) {
        return Companion.arrayMaximumN(str, expression);
    }

    public static final Expression arrayMinimumN(String str, Expression expression) {
        return Companion.arrayMinimumN(str, expression);
    }

    public static final Expression arraySlice(String str, Expression expression, Expression expression2) {
        return Companion.arraySlice(str, expression, expression2);
    }

    public static final Expression arraySliceToEnd(String str, Expression expression) {
        return Companion.arraySliceToEnd(str, expression);
    }

    public static final Expression bitAnd(String str, byte[] bArr) {
        return Companion.bitAnd(str, bArr);
    }

    public static final Expression bitLeftShift(String str, Expression expression) {
        return Companion.bitLeftShift(str, expression);
    }

    public static final Expression bitOr(String str, byte[] bArr) {
        return Companion.bitOr(str, bArr);
    }

    public static final Expression bitRightShift(String str, Expression expression) {
        return Companion.bitRightShift(str, expression);
    }

    public static final Expression bitXor(String str, byte[] bArr) {
        return Companion.bitXor(str, bArr);
    }

    public static final Expression concat(String str, Object obj, Object... objArr) {
        return Companion.concat(str, obj, objArr);
    }

    public static final Expression constant(DocumentReference documentReference) {
        return Companion.constant(documentReference);
    }

    public static final Expression cosineDistance(String str, VectorValue vectorValue) {
        return Companion.cosineDistance(str, vectorValue);
    }

    public static final Expression divide(String str, Number number) {
        return Companion.divide(str, number);
    }

    public static final Expression dotProduct(String str, VectorValue vectorValue) {
        return Companion.dotProduct(str, vectorValue);
    }

    public static final BooleanExpression endsWith(String str, String str2) {
        return Companion.endsWith(str, str2);
    }

    public static final BooleanExpression equal(String str, Object obj) {
        return Companion.equal(str, obj);
    }

    public static final BooleanExpression equalAny(String str, List<? extends Object> list) {
        return Companion.equalAny(str, list);
    }

    public static final Expression euclideanDistance(String str, VectorValue vectorValue) {
        return Companion.euclideanDistance(str, vectorValue);
    }

    public static final Expression getField(String str, String str2) {
        return Companion.getField(str, str2);
    }

    public static final BooleanExpression greaterThan(String str, Object obj) {
        return Companion.greaterThan(str, obj);
    }

    public static final BooleanExpression greaterThanOrEqual(String str, Object obj) {
        return Companion.greaterThanOrEqual(str, obj);
    }

    public static final Expression ifAbsent(String str, Object obj) {
        return Companion.ifAbsent(str, obj);
    }

    public static final Expression ifNull(String str, Object obj) {
        return Companion.ifNull(str, obj);
    }

    public static final Expression join(String str, String str2) {
        return Companion.join(str, str2);
    }

    public static final BooleanExpression lessThan(String str, Object obj) {
        return Companion.lessThan(str, obj);
    }

    public static final BooleanExpression lessThanOrEqual(String str, Object obj) {
        return Companion.lessThanOrEqual(str, obj);
    }

    public static final BooleanExpression like(String str, String str2) {
        return Companion.like(str, str2);
    }

    public static final Expression log(String str, Number number) {
        return Companion.log(str, number);
    }

    public static final Expression ltrimValue(String str, String str2) {
        return Companion.ltrimValue(str, str2);
    }

    public static final Expression mapGet(String str, String str2) {
        return Companion.mapGet(str, str2);
    }

    public static final Expression mapRemove(String str, String str2) {
        return Companion.mapRemove(str, str2);
    }

    public static final Expression mapSet(String str, String str2, Object obj, Object... objArr) {
        return Companion.mapSet(str, str2, obj, objArr);
    }

    public static final Expression mod(String str, Number number) {
        return Companion.mod(str, number);
    }

    public static final Expression multiply(String str, Number number) {
        return Companion.multiply(str, number);
    }

    public static final BooleanExpression notEqual(String str, Object obj) {
        return Companion.notEqual(str, obj);
    }

    public static final BooleanExpression notEqualAny(String str, List<? extends Object> list) {
        return Companion.notEqualAny(str, list);
    }

    public static final Expression pow(String str, Number number) {
        return Companion.pow(str, number);
    }

    public static final BooleanExpression regexContains(String str, String str2) {
        return Companion.regexContains(str, str2);
    }

    public static final Expression regexFind(String str, String str2) {
        return Companion.regexFind(str, str2);
    }

    public static final Expression regexFindAll(String str, String str2) {
        return Companion.regexFindAll(str, str2);
    }

    public static final BooleanExpression regexMatch(String str, String str2) {
        return Companion.regexMatch(str, str2);
    }

    public static final Expression roundToPrecision(String str, Expression expression) {
        return Companion.roundToPrecision(str, expression);
    }

    public static final Expression rtrimValue(String str, String str2) {
        return Companion.rtrimValue(str, str2);
    }

    public static final Expression split(String str, Blob blob) {
        return Companion.split(str, blob);
    }

    public static final BooleanExpression startsWith(String str, String str2) {
        return Companion.startsWith(str, str2);
    }

    public static final Expression stringConcat(String str, Object... objArr) {
        return Companion.stringConcat(str, objArr);
    }

    public static final BooleanExpression stringContains(String str, String str2) {
        return Companion.stringContains(str, str2);
    }

    public static final Expression stringIndexOf(String str, String str2) {
        return Companion.stringIndexOf(str, str2);
    }

    public static final Expression stringRepeat(String str, Expression expression) {
        return Companion.stringRepeat(str, expression);
    }

    public static final Expression stringReplaceAll(String str, String str2, String str3) {
        return Companion.stringReplaceAll(str, str2, str3);
    }

    public static final Expression stringReplaceOne(String str, String str2, String str3) {
        return Companion.stringReplaceOne(str, str2, str3);
    }

    public static final Expression subtract(String str, Number number) {
        return Companion.subtract(str, number);
    }

    public static final Expression timestampAdd(String str, String str2, long j2) {
        return Companion.timestampAdd(str, str2, j2);
    }

    public static final Expression timestampDiff(String str, Expression expression, String str2) {
        return Companion.timestampDiff(str, expression, str2);
    }

    public static final Expression timestampExtract(String str, String str2) {
        return Companion.timestampExtract(str, str2);
    }

    public static final Expression timestampExtractWithTimezone(Expression expression, String str, String str2) {
        return Companion.timestampExtractWithTimezone(expression, str, str2);
    }

    public static final Expression timestampSubtract(String str, String str2, long j2) {
        return Companion.timestampSubtract(str, str2, j2);
    }

    public static final Expression timestampTruncate(String str, String str2) {
        return Companion.timestampTruncate(str, str2);
    }

    public static final Expression timestampTruncateWithTimezone(Expression expression, String str, String str2) {
        return Companion.timestampTruncateWithTimezone(expression, str, str2);
    }

    public static final Expression truncToPrecision(String str, Expression expression) {
        return Companion.truncToPrecision(str, expression);
    }

    public final Expression documentId() {
        return Companion.documentId(this);
    }

    public final Expression ifError(Expression catchExpr) {
        AbstractC6452k.m12181e(catchExpr, "catchExpr");
        return Companion.ifError(this, catchExpr);
    }

    public final Expression logicalMaximum(Object... others) {
        AbstractC6452k.m12181e(others, "others");
        return Companion.logicalMaximum(this, Arrays.copyOf(others, others.length));
    }

    public final Expression logicalMinimum(Object... others) {
        AbstractC6452k.m12181e(others, "others");
        return Companion.logicalMinimum(this, Arrays.copyOf(others, others.length));
    }

    public final Expression parent() {
        return Companion.parent(this);
    }

    public final Expression substring(int i2, int i3) {
        Companion companion = Companion;
        return companion.substring(this, companion.constant(Integer.valueOf(i2)), companion.constant(Integer.valueOf(i3)));
    }

    public final Expression trimValue(Expression valueToTrim) {
        AbstractC6452k.m12181e(valueToTrim, "valueToTrim");
        return Companion.trimValue(this, valueToTrim);
    }

    public static final Expression constant(GeoPoint geoPoint) {
        return Companion.constant(geoPoint);
    }

    public static final Expression cosineDistance(String str, Expression expression) {
        return Companion.cosineDistance(str, expression);
    }

    public static final Expression dotProduct(String str, Expression expression) {
        return Companion.dotProduct(str, expression);
    }

    public static final Expression euclideanDistance(String str, Expression expression) {
        return Companion.euclideanDistance(str, expression);
    }

    public static final Expression split(String str, Expression expression) {
        return Companion.split(str, expression);
    }

    public static final Expression timestampDiff(String str, String str2, String str3) {
        return Companion.timestampDiff(str, str2, str3);
    }

    public static final Expression timestampExtractWithTimezone(String str, Expression expression, Expression expression2) {
        return Companion.timestampExtractWithTimezone(str, expression, expression2);
    }

    public static final Expression timestampTruncateWithTimezone(String str, Expression expression, Expression expression2) {
        return Companion.timestampTruncateWithTimezone(str, expression, expression2);
    }

    public final Expression add(Expression second) {
        AbstractC6452k.m12181e(second, "second");
        return Companion.add(this, second);
    }

    public final Expression arrayConcat(Expression secondArray, Object... otherArrays) {
        AbstractC6452k.m12181e(secondArray, "secondArray");
        AbstractC6452k.m12181e(otherArrays, "otherArrays");
        return Companion.arrayConcat(this, secondArray, Arrays.copyOf(otherArrays, otherArrays.length));
    }

    public final BooleanExpression arrayContains(Expression element) {
        AbstractC6452k.m12181e(element, "element");
        return Companion.arrayContains(this, element);
    }

    public final BooleanExpression arrayContainsAll(List<? extends Object> values) {
        AbstractC6452k.m12181e(values, "values");
        return Companion.arrayContainsAll(this, values);
    }

    public final BooleanExpression arrayContainsAny(List<? extends Object> values) {
        AbstractC6452k.m12181e(values, "values");
        return Companion.arrayContainsAny(this, values);
    }

    public final Expression arrayFirstN(int i2) {
        return Companion.arrayFirstN(this, i2);
    }

    public final Expression arrayGet(Expression offset) {
        AbstractC6452k.m12181e(offset, "offset");
        return Companion.arrayGet(this, offset);
    }

    public final Expression arrayLastN(int i2) {
        return Companion.arrayLastN(this, i2);
    }

    public final Expression arrayMaximumN(int i2) {
        return Companion.arrayMaximumN(this, i2);
    }

    public final Expression arrayMinimumN(int i2) {
        return Companion.arrayMinimumN(this, i2);
    }

    public final Expression arraySlice(int i2, int i3) {
        return Companion.arraySlice(this, i2, i3);
    }

    public final Expression arraySliceToEnd(int i2) {
        return Companion.arraySliceToEnd(this, i2);
    }

    public final Expression bitAnd(Expression bitsOther) {
        AbstractC6452k.m12181e(bitsOther, "bitsOther");
        return Companion.bitAnd(this, bitsOther);
    }

    public final Expression bitLeftShift(Expression numberExpr) {
        AbstractC6452k.m12181e(numberExpr, "numberExpr");
        return Companion.bitLeftShift(this, numberExpr);
    }

    public final Expression bitOr(Expression bitsOther) {
        AbstractC6452k.m12181e(bitsOther, "bitsOther");
        return Companion.bitOr(this, bitsOther);
    }

    public final Expression bitRightShift(Expression numberExpr) {
        AbstractC6452k.m12181e(numberExpr, "numberExpr");
        return Companion.bitRightShift(this, numberExpr);
    }

    public final Expression bitXor(Expression bitsOther) {
        AbstractC6452k.m12181e(bitsOther, "bitsOther");
        return Companion.bitXor(this, bitsOther);
    }

    public final Expression concat(Expression second, Object... others) {
        AbstractC6452k.m12181e(second, "second");
        AbstractC6452k.m12181e(others, "others");
        return Companion.concat(this, second, Arrays.copyOf(others, others.length));
    }

    public final Expression divide(Expression divisor) {
        AbstractC6452k.m12181e(divisor, "divisor");
        return Companion.divide(this, divisor);
    }

    public final BooleanExpression endsWith(Expression suffix) {
        AbstractC6452k.m12181e(suffix, "suffix");
        return Companion.endsWith(this, suffix);
    }

    public final BooleanExpression equal(Expression other) {
        AbstractC6452k.m12181e(other, "other");
        return Companion.equal(this, other);
    }

    public final BooleanExpression equalAny(List<? extends Object> values) {
        AbstractC6452k.m12181e(values, "values");
        return Companion.equalAny(this, values);
    }

    public final Expression getField(String key) {
        AbstractC6452k.m12181e(key, "key");
        return Companion.getField(this, key);
    }

    public final BooleanExpression greaterThan(Expression other) {
        AbstractC6452k.m12181e(other, "other");
        return Companion.greaterThan(this, other);
    }

    public final BooleanExpression greaterThanOrEqual(Expression other) {
        AbstractC6452k.m12181e(other, "other");
        return Companion.greaterThanOrEqual(this, other);
    }

    public final Expression ifAbsent(Expression elseExpr) {
        AbstractC6452k.m12181e(elseExpr, "elseExpr");
        return Companion.ifAbsent(this, elseExpr);
    }

    public final Expression ifError(Object catchValue) {
        AbstractC6452k.m12181e(catchValue, "catchValue");
        return Companion.ifError(this, catchValue);
    }

    public final Expression ifNull(Expression elseExpression) {
        AbstractC6452k.m12181e(elseExpression, "elseExpression");
        return Companion.ifNull(this, elseExpression);
    }

    public final Expression join(String delimiter) {
        AbstractC6452k.m12181e(delimiter, "delimiter");
        return Companion.join(this, delimiter);
    }

    public final BooleanExpression lessThan(Expression other) {
        AbstractC6452k.m12181e(other, "other");
        return Companion.lessThan(this, other);
    }

    public final BooleanExpression lessThanOrEqual(Expression other) {
        AbstractC6452k.m12181e(other, "other");
        return Companion.lessThanOrEqual(this, other);
    }

    public final BooleanExpression like(Expression pattern) {
        AbstractC6452k.m12181e(pattern, "pattern");
        return Companion.like(this, pattern);
    }

    public final Expression ltrimValue(String valuesToTrim) {
        AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
        return Companion.ltrimValue(this, valuesToTrim);
    }

    public final Expression mapGet(Expression keyExpression) {
        AbstractC6452k.m12181e(keyExpression, "keyExpression");
        return Companion.mapGet(this, keyExpression);
    }

    public final Expression mapRemove(Expression keyExpression) {
        AbstractC6452k.m12181e(keyExpression, "keyExpression");
        return Companion.mapRemove(this, keyExpression);
    }

    public final Expression mapSet(Expression key, Expression value, Expression... moreKeyValues) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        AbstractC6452k.m12181e(moreKeyValues, "moreKeyValues");
        return Companion.mapSet(this, key, value, (Expression[]) Arrays.copyOf(moreKeyValues, moreKeyValues.length));
    }

    public final Expression mod(Expression divisor) {
        AbstractC6452k.m12181e(divisor, "divisor");
        return Companion.mod(this, divisor);
    }

    public final Expression multiply(Expression second) {
        AbstractC6452k.m12181e(second, "second");
        return Companion.multiply(this, second);
    }

    public final BooleanExpression notEqual(Expression other) {
        AbstractC6452k.m12181e(other, "other");
        return Companion.notEqual(this, other);
    }

    public final BooleanExpression notEqualAny(List<? extends Object> values) {
        AbstractC6452k.m12181e(values, "values");
        return Companion.notEqualAny(this, values);
    }

    public final Expression pow(Number exponent) {
        AbstractC6452k.m12181e(exponent, "exponent");
        return Companion.pow(this, exponent);
    }

    public final BooleanExpression regexContains(Expression pattern) {
        AbstractC6452k.m12181e(pattern, "pattern");
        return Companion.regexContains(this, pattern);
    }

    public final BooleanExpression regexMatch(Expression pattern) {
        AbstractC6452k.m12181e(pattern, "pattern");
        return Companion.regexMatch(this, pattern);
    }

    public final Expression roundToPrecision(int i2) {
        return Companion.roundToPrecision(this, i2);
    }

    public final Expression rtrimValue(String valuesToTrim) {
        AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
        return Companion.rtrimValue(this, valuesToTrim);
    }

    public final BooleanExpression startsWith(Expression prefix) {
        AbstractC6452k.m12181e(prefix, "prefix");
        return Companion.startsWith(this, prefix);
    }

    public final Expression stringConcat(Expression... stringExpressions) {
        AbstractC6452k.m12181e(stringExpressions, "stringExpressions");
        return Companion.stringConcat(this, (Expression[]) Arrays.copyOf(stringExpressions, stringExpressions.length));
    }

    public final BooleanExpression stringContains(Expression substring) {
        AbstractC6452k.m12181e(substring, "substring");
        return Companion.stringContains(this, substring);
    }

    public final Expression stringIndexOf(String substring) {
        AbstractC6452k.m12181e(substring, "substring");
        return Companion.stringIndexOf(this, substring);
    }

    public final Expression stringRepeat(int i2) {
        return Companion.stringRepeat(this, i2);
    }

    public final Expression stringReplaceAll(String oldValue, String newValue) {
        AbstractC6452k.m12181e(oldValue, "oldValue");
        AbstractC6452k.m12181e(newValue, "newValue");
        return Companion.stringReplaceAll(this, oldValue, newValue);
    }

    public final Expression stringReplaceOne(String oldValue, String newValue) {
        AbstractC6452k.m12181e(oldValue, "oldValue");
        AbstractC6452k.m12181e(newValue, "newValue");
        return Companion.stringReplaceOne(this, oldValue, newValue);
    }

    public final Expression subtract(Expression subtrahend) {
        AbstractC6452k.m12181e(subtrahend, "subtrahend");
        return Companion.subtract(this, subtrahend);
    }

    public final Expression timestampAdd(Expression unit, Expression amount) {
        AbstractC6452k.m12181e(unit, "unit");
        AbstractC6452k.m12181e(amount, "amount");
        return Companion.timestampAdd(this, unit, amount);
    }

    public final Expression timestampExtract(Expression part) {
        AbstractC6452k.m12181e(part, "part");
        return Companion.timestampExtract(this, part);
    }

    public final Expression timestampSubtract(Expression unit, Expression amount) {
        AbstractC6452k.m12181e(unit, "unit");
        AbstractC6452k.m12181e(amount, "amount");
        return Companion.timestampSubtract(this, unit, amount);
    }

    public final Expression timestampTruncate(String granularity) {
        AbstractC6452k.m12181e(granularity, "granularity");
        return Companion.timestampTruncate(this, granularity);
    }

    public final Expression truncToPrecision(int i2) {
        return Companion.truncToPrecision(this, i2);
    }

    public static final Expression constant(VectorValue vectorValue) {
        return Companion.constant(vectorValue);
    }

    public static final Expression cosineDistance(String str, double[] dArr) {
        return Companion.cosineDistance(str, dArr);
    }

    public static final Expression dotProduct(String str, double[] dArr) {
        return Companion.dotProduct(str, dArr);
    }

    public static final Expression euclideanDistance(String str, double[] dArr) {
        return Companion.euclideanDistance(str, dArr);
    }

    public static final Expression split(String str, String str2) {
        return Companion.split(str, str2);
    }

    public static final Expression timestampExtractWithTimezone(String str, Expression expression, String str2) {
        return Companion.timestampExtractWithTimezone(str, expression, str2);
    }

    public static final Expression timestampTruncateWithTimezone(String str, Expression expression, String str2) {
        return Companion.timestampTruncateWithTimezone(str, expression, str2);
    }

    public final Expression add(Number second) {
        AbstractC6452k.m12181e(second, "second");
        return Companion.add(this, second);
    }

    public final Expression arrayConcat(Object secondArray, Object... otherArrays) {
        AbstractC6452k.m12181e(secondArray, "secondArray");
        AbstractC6452k.m12181e(otherArrays, "otherArrays");
        return Companion.arrayConcat(this, secondArray, Arrays.copyOf(otherArrays, otherArrays.length));
    }

    public final BooleanExpression arrayContains(Object element) {
        AbstractC6452k.m12181e(element, "element");
        return Companion.arrayContains(this, element);
    }

    public final BooleanExpression arrayContainsAll(Expression arrayExpression) {
        AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
        return Companion.arrayContainsAll(this, arrayExpression);
    }

    public final BooleanExpression arrayContainsAny(Expression arrayExpression) {
        AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
        return Companion.arrayContainsAny(this, arrayExpression);
    }

    public final Expression arrayFirstN(Expression n2) {
        AbstractC6452k.m12181e(n2, "n");
        return Companion.arrayFirstN(this, n2);
    }

    public final Expression arrayGet(int i2) {
        return Companion.arrayGet(this, i2);
    }

    public final Expression arrayLastN(Expression n2) {
        AbstractC6452k.m12181e(n2, "n");
        return Companion.arrayLastN(this, n2);
    }

    public final Expression arrayMaximumN(Expression n2) {
        AbstractC6452k.m12181e(n2, "n");
        return Companion.arrayMaximumN(this, n2);
    }

    public final Expression arrayMinimumN(Expression n2) {
        AbstractC6452k.m12181e(n2, "n");
        return Companion.arrayMinimumN(this, n2);
    }

    public final Expression arraySlice(Expression offset, Expression length) {
        AbstractC6452k.m12181e(offset, "offset");
        AbstractC6452k.m12181e(length, "length");
        return Companion.arraySlice(this, offset, length);
    }

    public final Expression arraySliceToEnd(Expression offset) {
        AbstractC6452k.m12181e(offset, "offset");
        return Companion.arraySliceToEnd(this, offset);
    }

    public final Expression bitAnd(byte[] bitsOther) {
        AbstractC6452k.m12181e(bitsOther, "bitsOther");
        return Companion.bitAnd(this, bitsOther);
    }

    public final Expression bitLeftShift(int i2) {
        return Companion.bitLeftShift(this, i2);
    }

    public final Expression bitOr(byte[] bitsOther) {
        AbstractC6452k.m12181e(bitsOther, "bitsOther");
        return Companion.bitOr(this, bitsOther);
    }

    public final Expression bitRightShift(int i2) {
        return Companion.bitRightShift(this, i2);
    }

    public final Expression bitXor(byte[] bitsOther) {
        AbstractC6452k.m12181e(bitsOther, "bitsOther");
        return Companion.bitXor(this, bitsOther);
    }

    public final Expression concat(Object second, Object... others) {
        AbstractC6452k.m12181e(second, "second");
        AbstractC6452k.m12181e(others, "others");
        return Companion.concat(this, second, Arrays.copyOf(others, others.length));
    }

    public final Expression divide(Number divisor) {
        AbstractC6452k.m12181e(divisor, "divisor");
        return Companion.divide(this, divisor);
    }

    public final BooleanExpression endsWith(String suffix) {
        AbstractC6452k.m12181e(suffix, "suffix");
        return Companion.endsWith(this, suffix);
    }

    public final BooleanExpression equal(Object value) {
        AbstractC6452k.m12181e(value, "value");
        return Companion.equal(this, value);
    }

    public final BooleanExpression equalAny(Expression arrayExpression) {
        AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
        return Companion.equalAny(this, arrayExpression);
    }

    public final Expression getField(Expression keyExpression) {
        AbstractC6452k.m12181e(keyExpression, "keyExpression");
        return Companion.getField(this, keyExpression);
    }

    public final BooleanExpression greaterThan(Object value) {
        AbstractC6452k.m12181e(value, "value");
        return Companion.greaterThan(this, value);
    }

    public final BooleanExpression greaterThanOrEqual(Object value) {
        AbstractC6452k.m12181e(value, "value");
        return Companion.greaterThanOrEqual(this, value);
    }

    public final Expression ifAbsent(Object elseValue) {
        AbstractC6452k.m12181e(elseValue, "elseValue");
        return Companion.ifAbsent(this, elseValue);
    }

    public final Expression ifNull(Object elseValue) {
        AbstractC6452k.m12181e(elseValue, "elseValue");
        return Companion.ifNull(this, elseValue);
    }

    public final Expression join(Expression delimiterExpression) {
        AbstractC6452k.m12181e(delimiterExpression, "delimiterExpression");
        return Companion.join(this, delimiterExpression);
    }

    public final BooleanExpression lessThan(Object value) {
        AbstractC6452k.m12181e(value, "value");
        return Companion.lessThan(this, value);
    }

    public final BooleanExpression lessThanOrEqual(Object value) {
        AbstractC6452k.m12181e(value, "value");
        return Companion.lessThanOrEqual(this, value);
    }

    public final BooleanExpression like(String pattern) {
        AbstractC6452k.m12181e(pattern, "pattern");
        return Companion.like(this, pattern);
    }

    public final Expression ltrimValue(Expression valuesToTrim) {
        AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
        return Companion.ltrimValue(this, valuesToTrim);
    }

    public final Expression mapGet(String key) {
        AbstractC6452k.m12181e(key, "key");
        return Companion.mapGet(this, key);
    }

    public final Expression mapRemove(String key) {
        AbstractC6452k.m12181e(key, "key");
        return Companion.mapRemove(this, key);
    }

    public final Expression mapSet(String key, Object obj, Object... moreKeyValues) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(moreKeyValues, "moreKeyValues");
        return Companion.mapSet(this, key, obj, Arrays.copyOf(moreKeyValues, moreKeyValues.length));
    }

    public final Expression mod(Number divisor) {
        AbstractC6452k.m12181e(divisor, "divisor");
        return Companion.mod(this, divisor);
    }

    public final Expression multiply(Number second) {
        AbstractC6452k.m12181e(second, "second");
        return Companion.multiply(this, second);
    }

    public final BooleanExpression notEqual(Object value) {
        AbstractC6452k.m12181e(value, "value");
        return Companion.notEqual(this, value);
    }

    public final BooleanExpression notEqualAny(Expression arrayExpression) {
        AbstractC6452k.m12181e(arrayExpression, "arrayExpression");
        return Companion.notEqualAny(this, arrayExpression);
    }

    public final Expression pow(Expression exponent) {
        AbstractC6452k.m12181e(exponent, "exponent");
        return Companion.pow(this, exponent);
    }

    public final BooleanExpression regexContains(String pattern) {
        AbstractC6452k.m12181e(pattern, "pattern");
        return Companion.regexContains(this, pattern);
    }

    public final BooleanExpression regexMatch(String pattern) {
        AbstractC6452k.m12181e(pattern, "pattern");
        return Companion.regexMatch(this, pattern);
    }

    public final Expression roundToPrecision(Expression decimalPlace) {
        AbstractC6452k.m12181e(decimalPlace, "decimalPlace");
        return Companion.roundToPrecision(this, decimalPlace);
    }

    public final Expression rtrimValue(Expression valuesToTrim) {
        AbstractC6452k.m12181e(valuesToTrim, "valuesToTrim");
        return Companion.rtrimValue(this, valuesToTrim);
    }

    public final BooleanExpression startsWith(String prefix) {
        AbstractC6452k.m12181e(prefix, "prefix");
        return Companion.startsWith(this, prefix);
    }

    public final Expression stringConcat(String... strings) {
        AbstractC6452k.m12181e(strings, "strings");
        return Companion.stringConcat(this, Arrays.copyOf(strings, strings.length));
    }

    public final BooleanExpression stringContains(String substring) {
        AbstractC6452k.m12181e(substring, "substring");
        return Companion.stringContains(this, substring);
    }

    public final Expression stringIndexOf(Expression substring) {
        AbstractC6452k.m12181e(substring, "substring");
        return Companion.stringIndexOf(this, substring);
    }

    public final Expression stringRepeat(Expression count) {
        AbstractC6452k.m12181e(count, "count");
        return Companion.stringRepeat(this, count);
    }

    public final Expression stringReplaceAll(Expression oldValue, Expression newValue) {
        AbstractC6452k.m12181e(oldValue, "oldValue");
        AbstractC6452k.m12181e(newValue, "newValue");
        return Companion.stringReplaceAll(this, oldValue, newValue);
    }

    public final Expression stringReplaceOne(Expression oldValue, Expression newValue) {
        AbstractC6452k.m12181e(oldValue, "oldValue");
        AbstractC6452k.m12181e(newValue, "newValue");
        return Companion.stringReplaceOne(this, oldValue, newValue);
    }

    public final Expression subtract(Number subtrahend) {
        AbstractC6452k.m12181e(subtrahend, "subtrahend");
        return Companion.subtract(this, subtrahend);
    }

    public final Expression timestampAdd(String unit, long j2) {
        AbstractC6452k.m12181e(unit, "unit");
        return Companion.timestampAdd(this, unit, j2);
    }

    public final Expression timestampDiff(Expression start, Expression unit) {
        AbstractC6452k.m12181e(start, "start");
        AbstractC6452k.m12181e(unit, "unit");
        return Companion.timestampDiff(this, start, unit);
    }

    public final Expression timestampExtract(String part) {
        AbstractC6452k.m12181e(part, "part");
        return Companion.timestampExtract(this, part);
    }

    public final Expression timestampSubtract(String unit, long j2) {
        AbstractC6452k.m12181e(unit, "unit");
        return Companion.timestampSubtract(this, unit, j2);
    }

    public final Expression timestampTruncate(Expression granularity) {
        AbstractC6452k.m12181e(granularity, "granularity");
        return Companion.timestampTruncate(this, granularity);
    }

    public final Expression truncToPrecision(Expression decimalPlace) {
        AbstractC6452k.m12181e(decimalPlace, "decimalPlace");
        return Companion.truncToPrecision(this, decimalPlace);
    }

    public static final Expression constant(Number number) {
        return Companion.constant(number);
    }

    public static final Expression timestampExtractWithTimezone(String str, String str2, Expression expression) {
        return Companion.timestampExtractWithTimezone(str, str2, expression);
    }

    public static final Expression timestampTruncateWithTimezone(String str, String str2, Expression expression) {
        return Companion.timestampTruncateWithTimezone(str, str2, expression);
    }

    public final Expression cosineDistance(Expression vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.cosineDistance(this, vector);
    }

    public final Expression dotProduct(Expression vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.dotProduct(this, vector);
    }

    public final Expression euclideanDistance(Expression vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.euclideanDistance(this, vector);
    }

    public final Expression split(Expression delimiter) {
        AbstractC6452k.m12181e(delimiter, "delimiter");
        return Companion.split(this, delimiter);
    }

    public final Expression stringConcat(Object... strings) {
        AbstractC6452k.m12181e(strings, "strings");
        return Companion.stringConcat(this, Arrays.copyOf(strings, strings.length));
    }

    public final Expression timestampDiff(Expression start, String unit) {
        AbstractC6452k.m12181e(start, "start");
        AbstractC6452k.m12181e(unit, "unit");
        return Companion.timestampDiff(this, start, unit);
    }

    public static final Expression constant(String str) {
        return Companion.constant(str);
    }

    public static final Expression timestampExtractWithTimezone(String str, String str2, String str3) {
        return Companion.timestampExtractWithTimezone(str, str2, str3);
    }

    public static final Expression timestampTruncateWithTimezone(String str, String str2, String str3) {
        return Companion.timestampTruncateWithTimezone(str, str2, str3);
    }

    public final Expression cosineDistance(double[] vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.cosineDistance(this, vector);
    }

    public final Expression dotProduct(double[] vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.dotProduct(this, vector);
    }

    public final Expression euclideanDistance(double[] vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.euclideanDistance(this, vector);
    }

    public final Expression split(String delimiter) {
        AbstractC6452k.m12181e(delimiter, "delimiter");
        return Companion.split(this, delimiter);
    }

    public final Expression timestampDiff(String startFieldName, String unit) {
        AbstractC6452k.m12181e(startFieldName, "startFieldName");
        AbstractC6452k.m12181e(unit, "unit");
        return Companion.timestampDiff(this, startFieldName, unit);
    }

    public static final Expression constant(Date date) {
        return Companion.constant(date);
    }

    public final Expression cosineDistance(VectorValue vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.cosineDistance(this, vector);
    }

    public final Expression dotProduct(VectorValue vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.dotProduct(this, vector);
    }

    public final Expression euclideanDistance(VectorValue vector) {
        AbstractC6452k.m12181e(vector, "vector");
        return Companion.euclideanDistance(this, vector);
    }

    public final Expression split(Blob delimiter) {
        AbstractC6452k.m12181e(delimiter, "delimiter");
        return Companion.split(this, delimiter);
    }

    public final Expression timestampExtractWithTimezone(Expression part, String timezone) {
        AbstractC6452k.m12181e(part, "part");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampExtractWithTimezone(this, part, timezone);
    }

    public final Expression timestampTruncateWithTimezone(String granularity, String timezone) {
        AbstractC6452k.m12181e(granularity, "granularity");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampTruncateWithTimezone(this, granularity, timezone);
    }

    public static final Expression constant(byte[] bArr) {
        return Companion.constant(bArr);
    }

    public final Expression timestampExtractWithTimezone(String part, String timezone) {
        AbstractC6452k.m12181e(part, "part");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampExtractWithTimezone(this, part, timezone);
    }

    public final Expression timestampTruncateWithTimezone(Expression granularity, String timezone) {
        AbstractC6452k.m12181e(granularity, "granularity");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampTruncateWithTimezone(this, granularity, timezone);
    }

    public final Expression timestampExtractWithTimezone(Expression part, Expression timezone) {
        AbstractC6452k.m12181e(part, "part");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampExtractWithTimezone(this, part, timezone);
    }

    public final Expression timestampTruncateWithTimezone(String granularity, Expression timezone) {
        AbstractC6452k.m12181e(granularity, "granularity");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampTruncateWithTimezone(this, granularity, timezone);
    }

    public final Expression timestampExtractWithTimezone(String part, Expression timezone) {
        AbstractC6452k.m12181e(part, "part");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampExtractWithTimezone(this, part, timezone);
    }

    public final Expression timestampTruncateWithTimezone(Expression granularity, Expression timezone) {
        AbstractC6452k.m12181e(granularity, "granularity");
        AbstractC6452k.m12181e(timezone, "timezone");
        return Companion.timestampTruncateWithTimezone(this, granularity, timezone);
    }
}
