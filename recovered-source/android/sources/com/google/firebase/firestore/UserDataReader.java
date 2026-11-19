package com.google.firebase.firestore;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.pipeline.Expression;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.CustomClassMapper;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p001B.InterfaceC0082h;
import p022N.C0371O;
import p022N.C0375Q;
import p022N.C0389X0;
import p022N.C0393Z0;
import p022N.C0403d;
import p022N.C0406e;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class UserDataReader {
    private final DatabaseId databaseId;

    public UserDataReader(DatabaseId databaseId) {
        this.databaseId = databaseId;
    }

    private ObjectValue convertAndParseDocumentData(Object obj, UserData.ParseContext parseContext) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        C0393Z0 data = parseData(CustomClassMapper.convertToPlainJavaTypes(obj), parseContext);
        if (data.m741K()) {
            return new ObjectValue(data);
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: " + Util.typeName(obj));
    }

    private List<C0393Z0> parseArrayTransformElements(List<Object> list) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(convertAndParseFieldData(list.get(i2), parseAccumulator.rootContext().childContext(i2)));
        }
        return arrayList;
    }

    @Nullable
    private C0393Z0 parseData(Object obj, UserData.ParseContext parseContext) {
        if (obj instanceof Map) {
            return parseMap((Map) obj, parseContext);
        }
        if (obj instanceof FieldValue) {
            parseSentinelFieldValue((FieldValue) obj, parseContext);
            return null;
        }
        if (parseContext.getPath() != null) {
            parseContext.addToFieldMask(parseContext.getPath());
        }
        if (!(obj instanceof List)) {
            return parseScalarValue(obj, parseContext);
        }
        if (!parseContext.isArrayElement() || parseContext.getDataSource() == UserData.Source.ArrayArgument) {
            return parseList((List) obj, parseContext);
        }
        throw parseContext.createError("Nested arrays are not supported");
    }

    private <T> C0393Z0 parseList(List<T> list, UserData.ParseContext parseContext) {
        C0403d c0403dM798k = C0406e.m798k();
        Iterator<T> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C0393Z0 data = parseData(it.next(), parseContext.childContext(i2));
            if (data == null) {
                C0389X0 c0389x0M714O = C0393Z0.m714O();
                c0389x0M714O.m698q();
                data = (C0393Z0) c0389x0M714O.m12341build();
            }
            c0403dM798k.m788c(data);
            i2++;
        }
        C0389X0 c0389x0M714O2 = C0393Z0.m714O();
        c0389x0M714O2.m687c(c0403dM798k);
        return (C0393Z0) c0389x0M714O2.m12341build();
    }

    private <K, V> C0393Z0 parseMap(Map<K, V> map, UserData.ParseContext parseContext) {
        if (map.isEmpty()) {
            if (parseContext.getPath() != null && !parseContext.getPath().isEmpty()) {
                parseContext.addToFieldMask(parseContext.getPath());
            }
            C0389X0 c0389x0M714O = C0393Z0.m714O();
            c0389x0M714O.m697p(C0375Q.m645f());
            return (C0393Z0) c0389x0M714O.m12341build();
        }
        C0371O c0371oM646k = C0375Q.m646k();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw parseContext.createError(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
            }
            String str = (String) entry.getKey();
            C0393Z0 data = parseData(entry.getValue(), parseContext.childContext(str));
            if (data != null) {
                c0371oM646k.m634d(str, data);
            }
        }
        C0389X0 c0389x0M714O2 = C0393Z0.m714O();
        c0389x0M714O2.m696o(c0371oM646k);
        return (C0393Z0) c0389x0M714O2.m12341build();
    }

    private void parseSentinelFieldValue(FieldValue fieldValue, UserData.ParseContext parseContext) {
        if (!parseContext.isWrite()) {
            throw parseContext.createError(fieldValue.getMethodName() + "() can only be used with set() and update()");
        }
        if (parseContext.getPath() == null) {
            throw parseContext.createError(fieldValue.getMethodName() + "() is not currently supported inside arrays");
        }
        if (fieldValue instanceof FieldValue.DeleteFieldValue) {
            if (parseContext.getDataSource() == UserData.Source.MergeSet) {
                parseContext.addToFieldMask(parseContext.getPath());
                return;
            } else {
                if (parseContext.getDataSource() != UserData.Source.Update) {
                    throw parseContext.createError("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                }
                Assert.hardAssert(parseContext.getPath().length() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw parseContext.createError("FieldValue.delete() can only appear at the top level of your update data");
            }
        }
        if (fieldValue instanceof FieldValue.ServerTimestampFieldValue) {
            parseContext.addToFieldTransforms(parseContext.getPath(), ServerTimestampOperation.getInstance());
            return;
        }
        if (fieldValue instanceof FieldValue.ArrayUnionFieldValue) {
            parseContext.addToFieldTransforms(parseContext.getPath(), new ArrayTransformOperation.Union(parseArrayTransformElements(((FieldValue.ArrayUnionFieldValue) fieldValue).getElements())));
        } else if (fieldValue instanceof FieldValue.ArrayRemoveFieldValue) {
            parseContext.addToFieldTransforms(parseContext.getPath(), new ArrayTransformOperation.Remove(parseArrayTransformElements(((FieldValue.ArrayRemoveFieldValue) fieldValue).getElements())));
        } else {
            if (!(fieldValue instanceof FieldValue.NumericIncrementFieldValue)) {
                throw Assert.fail("Unknown FieldValue type: %s", Util.typeName(fieldValue));
            }
            parseContext.addToFieldTransforms(parseContext.getPath(), new NumericIncrementTransformOperation(parseQueryValue(((FieldValue.NumericIncrementFieldValue) fieldValue).getOperand())));
        }
    }

    public C0393Z0 convertAndParseFieldData(Object obj, UserData.ParseContext parseContext) {
        return parseData(CustomClassMapper.convertToPlainJavaTypes(obj), parseContext);
    }

    public DatabaseId getDatabaseId() {
        return this.databaseId;
    }

    public UserData.ParsedSetData parseMergeData(Object obj, @Nullable FieldMask fieldMask) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.MergeSet);
        ObjectValue objectValueConvertAndParseDocumentData = convertAndParseDocumentData(obj, parseAccumulator.rootContext());
        if (fieldMask == null) {
            return parseAccumulator.toMergeData(objectValueConvertAndParseDocumentData);
        }
        for (com.google.firebase.firestore.model.FieldPath fieldPath : fieldMask.getMask()) {
            if (!parseAccumulator.contains(fieldPath)) {
                throw new IllegalArgumentException("Field '" + fieldPath.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return parseAccumulator.toMergeData(objectValueConvertAndParseDocumentData, fieldMask);
    }

    public C0393Z0 parseQueryValue(Object obj) {
        return parseQueryValue(obj, false);
    }

    public C0393Z0 parseScalarValue(Object obj, final UserData.ParseContext parseContext) {
        if (obj == null) {
            return Values.NULL_VALUE;
        }
        if (obj.getClass().isArray()) {
            throw parseContext.createError("Arrays are not supported; use a List instead");
        }
        if (obj instanceof DocumentReference) {
            DocumentReference documentReference = (DocumentReference) obj;
            Objects.requireNonNull(parseContext);
            validateDocumentReference(documentReference, new InterfaceC0082h() { // from class: com.google.firebase.firestore.v
                @Override // p001B.InterfaceC0082h
                public final Object apply(Object obj2) {
                    return parseContext.createError((String) obj2);
                }
            });
            return Values.encodeValue(documentReference);
        }
        if (obj instanceof Expression) {
            throw parseContext.createError("Pipeline expressions are not supported user objects");
        }
        try {
            return Values.encodeAnyValue(obj);
        } catch (IllegalArgumentException unused) {
            throw parseContext.createError("Unsupported type: " + Util.typeName(obj));
        }
    }

    public UserData.ParsedSetData parseSetData(Object obj) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Set);
        return parseAccumulator.toSetData(convertAndParseDocumentData(obj, parseAccumulator.rootContext()));
    }

    public UserData.ParsedUpdateData parseUpdateData(Map<String, Object> map) {
        Preconditions.checkNotNull(map, "Provided update data must not be null.");
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Update);
        UserData.ParseContext parseContextRootContext = parseAccumulator.rootContext();
        ObjectValue objectValue = new ObjectValue();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            com.google.firebase.firestore.model.FieldPath internalPath = FieldPath.fromDotSeparatedPath(entry.getKey()).getInternalPath();
            Object value = entry.getValue();
            if (value instanceof FieldValue.DeleteFieldValue) {
                parseContextRootContext.addToFieldMask(internalPath);
            } else {
                C0393Z0 c0393z0ConvertAndParseFieldData = convertAndParseFieldData(value, parseContextRootContext.childContext(internalPath));
                if (c0393z0ConvertAndParseFieldData != null) {
                    parseContextRootContext.addToFieldMask(internalPath);
                    objectValue.set(internalPath, c0393z0ConvertAndParseFieldData);
                }
            }
        }
        return parseAccumulator.toUpdateData(objectValue);
    }

    public void validateDocumentReference(DocumentReference documentReference, InterfaceC0082h interfaceC0082h) {
        DatabaseId databaseId = documentReference.getFirestore().getDatabaseId();
        if (databaseId.equals(this.databaseId)) {
            return;
        }
        throw ((RuntimeException) interfaceC0082h.apply("Document reference is for database " + databaseId.getProjectId() + "/" + databaseId.getDatabaseId() + " but should be for database " + this.databaseId.getProjectId() + "/" + this.databaseId.getDatabaseId()));
    }

    public C0393Z0 parseQueryValue(Object obj, boolean z) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(z ? UserData.Source.ArrayArgument : UserData.Source.Argument);
        C0393Z0 c0393z0ConvertAndParseFieldData = convertAndParseFieldData(obj, parseAccumulator.rootContext());
        Assert.hardAssert(c0393z0ConvertAndParseFieldData != null, "Parsed data should not be null.", new Object[0]);
        Assert.hardAssert(parseAccumulator.getFieldTransforms().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return c0393z0ConvertAndParseFieldData;
    }

    public UserData.ParsedUpdateData parseUpdateData(List<Object> list) {
        com.google.firebase.firestore.model.FieldPath internalPath;
        Assert.hardAssert(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Update);
        UserData.ParseContext parseContextRootContext = parseAccumulator.rootContext();
        ObjectValue objectValue = new ObjectValue();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z = next instanceof String;
            Assert.hardAssert(z || (next instanceof FieldPath), "Expected argument to be String or FieldPath.", new Object[0]);
            if (z) {
                internalPath = FieldPath.fromDotSeparatedPath((String) next).getInternalPath();
            } else {
                internalPath = ((FieldPath) next).getInternalPath();
            }
            if (next2 instanceof FieldValue.DeleteFieldValue) {
                parseContextRootContext.addToFieldMask(internalPath);
            } else {
                C0393Z0 c0393z0ConvertAndParseFieldData = convertAndParseFieldData(next2, parseContextRootContext.childContext(internalPath));
                if (c0393z0ConvertAndParseFieldData != null) {
                    parseContextRootContext.addToFieldMask(internalPath);
                    objectValue.set(internalPath, c0393z0ConvertAndParseFieldData);
                }
            }
        }
        return parseAccumulator.toUpdateData(objectValue);
    }
}
