package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt;
import com.google.firebase.firestore.pipeline.evaluation.ArrayKt;
import com.google.firebase.firestore.pipeline.evaluation.ComparisonKt;
import com.google.firebase.firestore.pipeline.evaluation.DebugKt;
import com.google.firebase.firestore.pipeline.evaluation.LogicalKt;
import com.google.firebase.firestore.pipeline.evaluation.MapsKt;
import com.google.firebase.firestore.pipeline.evaluation.Strings;
import com.google.firebase.firestore.pipeline.evaluation.TimestampKt;
import com.google.firebase.firestore.pipeline.evaluation.UtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import p057d0.C6283e;
import p058e0.AbstractC6318z;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionRegistry {
    public static final FunctionRegistry INSTANCE = new FunctionRegistry();
    private static final Map<String, InterfaceC6498l> functions;

    static {
        C6283e[] c6283eArr = {new C6283e("and", LogicalKt.getEvaluateAnd()), new C6283e("or", LogicalKt.getEvaluateOr()), new C6283e("xor", LogicalKt.getEvaluateXor()), new C6283e("not", ComparisonKt.getEvaluateNot()), new C6283e("round", ArithmeticKt.getEvaluateRound()), new C6283e("ceil", ArithmeticKt.getEvaluateCeil()), new C6283e("floor", ArithmeticKt.getEvaluateFloor()), new C6283e("pow", ArithmeticKt.getEvaluatePow()), new C6283e("sqrt", ArithmeticKt.getEvaluateSqrt()), new C6283e("add", ArithmeticKt.getEvaluateAdd()), new C6283e("subtract", ArithmeticKt.getEvaluateSubtract()), new C6283e("multiply", ArithmeticKt.getEvaluateMultiply()), new C6283e("divide", ArithmeticKt.getEvaluateDivide()), new C6283e("mod", ArithmeticKt.getEvaluateMod()), new C6283e("eq_any", ArrayKt.getEvaluateEqAny()), new C6283e("not_eq_any", ArrayKt.getEvaluateNotEqAny()), new C6283e("is_nan", LogicalKt.getEvaluateIsNaN()), new C6283e("is_not_nan", LogicalKt.getEvaluateIsNotNaN()), new C6283e("is_null", LogicalKt.getEvaluateIsNull()), new C6283e("is_not_null", LogicalKt.getEvaluateIsNotNull()), new C6283e("char_length", Strings.getEvaluateCharLength()), new C6283e("byte_length", Strings.getEvaluateByteLength()), new C6283e("like", Strings.getEvaluateLike()), new C6283e("regex_contains", Strings.getEvaluateRegexContains()), new C6283e("regex_find", Strings.getEvaluateRegexFind()), new C6283e("regex_find_all", Strings.getEvaluateRegexFindAll()), new C6283e("regex_match", Strings.getEvaluateRegexMatch()), new C6283e("logical_max", LogicalKt.getEvaluateLogicalMaximum()), new C6283e("logical_min", LogicalKt.getEvaluateLogicalMinimum()), new C6283e("reverse", Strings.getEvaluateReverse()), new C6283e("str_contains", Strings.getEvaluateStrContains()), new C6283e("starts_with", Strings.getEvaluateStartsWith()), new C6283e("ends_with", Strings.getEvaluateEndsWith()), new C6283e("to_lowercase", Strings.getEvaluateToLowercase()), new C6283e("to_uppercase", Strings.getEvaluateToUppercase()), new C6283e("trim", Strings.getEvaluateTrim()), new C6283e("str_concat", Strings.getEvaluateStrConcat()), new C6283e("map", MapsKt.getEvaluateMap()), new C6283e("map_get", MapsKt.getEvaluateMapGet()), new C6283e("is_error", DebugKt.getEvaluateIsError()), new C6283e("exists", DebugKt.getEvaluateExists()), new C6283e("cond", LogicalKt.getEvaluateCond()), new C6283e("eq", ComparisonKt.getEvaluateEq()), new C6283e("neq", ComparisonKt.getEvaluateNeq()), new C6283e("gt", ComparisonKt.getEvaluateGt()), new C6283e("gte", ComparisonKt.getEvaluateGte()), new C6283e("lt", ComparisonKt.getEvaluateLt()), new C6283e("lte", ComparisonKt.getEvaluateLte()), new C6283e("array", ArrayKt.getEvaluateArray()), new C6283e("array_contains", ArrayKt.getEvaluateArrayContains()), new C6283e("array_contains_any", ArrayKt.getEvaluateArrayContainsAny()), new C6283e("array_contains_all", ArrayKt.getEvaluateArrayContainsAll()), new C6283e("array_get", ArrayKt.getEvaluateArrayGet()), new C6283e("array_length", ArrayKt.getEvaluateArrayLength()), new C6283e("array_first", ArrayKt.getEvaluateArrayFirst()), new C6283e("array_last", ArrayKt.getEvaluateArrayLast()), new C6283e("array_first_n", ArrayKt.getEvaluateArrayFirstN()), new C6283e("array_last_n", ArrayKt.getEvaluateArrayLastN()), new C6283e("array_minimum", ArrayKt.getEvaluateArrayMinimum()), new C6283e("array_maximum", ArrayKt.getEvaluateArrayMaximum()), new C6283e("array_minimum_n", ArrayKt.getEvaluateArrayMinimumN()), new C6283e("array_maximum_n", ArrayKt.getEvaluateArrayMaximumN()), new C6283e("array_index_of", ArrayKt.getEvaluateArrayIndexOf()), new C6283e("array_index_of_all", ArrayKt.getEvaluateArrayIndexOfAll()), new C6283e("timestamp_add", TimestampKt.getEvaluateTimestampAdd()), new C6283e("timestamp_sub", TimestampKt.getEvaluateTimestampSub()), new C6283e("timestamp_to_unix_micros", TimestampKt.getEvaluateTimestampToUnixMicros()), new C6283e("timestamp_to_unix_millis", TimestampKt.getEvaluateTimestampToUnixMillis()), new C6283e("timestamp_to_unix_seconds", TimestampKt.getEvaluateTimestampToUnixSeconds()), new C6283e("unix_micros_to_timestamp", TimestampKt.getEvaluateUnixMicrosToTimestamp()), new C6283e("unix_millis_to_timestamp", TimestampKt.getEvaluateUnixMillisToTimestamp()), new C6283e("unix_seconds_to_timestamp", TimestampKt.getEvaluateUnixSecondsToTimestamp()), new C6283e("bit_and", UtilsKt.getNotImplemented()), new C6283e("bit_or", UtilsKt.getNotImplemented()), new C6283e("bit_xor", UtilsKt.getNotImplemented()), new C6283e("bit_not", UtilsKt.getNotImplemented()), new C6283e("bit_left_shift", UtilsKt.getNotImplemented()), new C6283e("bit_right_shift", UtilsKt.getNotImplemented()), new C6283e("is_absent", UtilsKt.getNotImplemented()), new C6283e("rand", UtilsKt.getNotImplemented()), new C6283e("map_merge", UtilsKt.getNotImplemented()), new C6283e("map_remove", UtilsKt.getNotImplemented()), new C6283e("map_set", UtilsKt.getNotImplemented()), new C6283e("map_keys", UtilsKt.getNotImplemented()), new C6283e("map_values", UtilsKt.getNotImplemented()), new C6283e("map_entries", UtilsKt.getNotImplemented()), new C6283e("cosine_distance", UtilsKt.getNotImplemented()), new C6283e("dot_product", UtilsKt.getNotImplemented()), new C6283e("timestamp_trunc", UtilsKt.getNotImplemented()), new C6283e("type", UtilsKt.getNotImplemented()), new C6283e("is_type", UtilsKt.getNotImplemented()), new C6283e("substring", UtilsKt.getNotImplemented()), new C6283e("string_repeat", UtilsKt.getNotImplemented()), new C6283e("string_replace_all", UtilsKt.getNotImplemented()), new C6283e("string_replace_one", UtilsKt.getNotImplemented()), new C6283e("string_index_of", UtilsKt.getNotImplemented()), new C6283e("ltrim", UtilsKt.getNotImplemented()), new C6283e("rtrim", UtilsKt.getNotImplemented()), new C6283e("split", UtilsKt.getNotImplemented())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6318z.m12126t(99));
        AbstractC6318z.m12129w(linkedHashMap, c6283eArr);
        functions = linkedHashMap;
    }

    private FunctionRegistry() {
    }

    public final Map<String, InterfaceC6498l> getFunctions() {
        return functions;
    }
}
