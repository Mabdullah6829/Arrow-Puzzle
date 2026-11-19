package com.google.firebase.firestore.model;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p022N.C0371O;
import p022N.C0375Q;
import p022N.C0389X0;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectValue implements Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Object lock;

    @Nullable
    private volatile C0393Z0 mergedValue;

    @GuardedBy("lock")
    private final Map<String, Object> overlayMap;

    @GuardedBy("lock")
    private C0393Z0 partialValue;

    public ObjectValue(C0393Z0 c0393z0) {
        this.lock = new Object();
        this.overlayMap = new HashMap();
        Assert.hardAssert(c0393z0.m741K(), "ObjectValues should be backed by a MapValue", new Object[0]);
        Assert.hardAssert(!ServerTimestamps.isServerTimestamp(c0393z0), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.mergedValue = c0393z0;
    }

    @Nullable
    private static C0375Q applyOverlay(C0393Z0 c0393z0, FieldPath fieldPath, Map<String, Object> map) {
        C0393Z0 c0393z0ExtractNestedValue = extractNestedValue(c0393z0, fieldPath);
        C0371O c0371oM646k = Values.isMapValue(c0393z0ExtractNestedValue) ? (C0371O) c0393z0ExtractNestedValue.m733C().m12349toBuilder() : C0375Q.m646k();
        boolean z = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C0375Q c0375qApplyOverlay = applyOverlay(c0393z0, fieldPath.append(key), (Map) value);
                if (c0375qApplyOverlay != null) {
                    C0389X0 c0389x0M714O = C0393Z0.m714O();
                    c0389x0M714O.m697p(c0375qApplyOverlay);
                    c0371oM646k.m634d(key, (C0393Z0) c0389x0M714O.m12341build());
                    z = true;
                }
            } else {
                if (value instanceof C0393Z0) {
                    c0371oM646k.m634d(key, (C0393Z0) value);
                } else if (c0371oM646k.m632b(key)) {
                    Assert.hardAssert(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    c0371oM646k.m635e(key);
                }
                z = true;
            }
        }
        if (z) {
            return (C0375Q) c0371oM646k.m12341build();
        }
        return null;
    }

    private C0393Z0 buildProto() {
        C0393Z0 c0393z0;
        C0375Q c0375qApplyOverlay;
        C0393Z0 c0393z1 = this.mergedValue;
        if (c0393z1 != null) {
            return c0393z1;
        }
        synchronized (this.lock) {
            try {
                c0393z0 = this.mergedValue;
                if (c0393z0 == null) {
                    if (this.overlayMap.isEmpty() || (c0375qApplyOverlay = applyOverlay(this.partialValue, FieldPath.EMPTY_PATH, this.overlayMap)) == null) {
                        c0393z0 = this.partialValue;
                    } else {
                        C0389X0 c0389x0M714O = C0393Z0.m714O();
                        c0389x0M714O.m697p(c0375qApplyOverlay);
                        c0393z0 = (C0393Z0) c0389x0M714O.m12341build();
                    }
                    this.mergedValue = c0393z0;
                    this.partialValue = null;
                    this.overlayMap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0393z0;
    }

    private FieldMask extractFieldMask(C0375Q c0375q) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : c0375q.m648h().entrySet()) {
            FieldPath fieldPathFromSingleSegment = FieldPath.fromSingleSegment((String) entry.getKey());
            if (Values.isMapValue((C0393Z0) entry.getValue())) {
                Set<FieldPath> mask = extractFieldMask(((C0393Z0) entry.getValue()).m733C()).getMask();
                if (mask.isEmpty()) {
                    hashSet.add(fieldPathFromSingleSegment);
                } else {
                    Iterator<FieldPath> it = mask.iterator();
                    while (it.hasNext()) {
                        hashSet.add(fieldPathFromSingleSegment.append(it.next()));
                    }
                }
            } else {
                hashSet.add(fieldPathFromSingleSegment);
            }
        }
        return FieldMask.fromSet(hashSet);
    }

    @Nullable
    private static C0393Z0 extractNestedValue(C0393Z0 c0393z0, FieldPath fieldPath) {
        if (fieldPath.isEmpty()) {
            return c0393z0;
        }
        for (int i2 = 0; i2 < fieldPath.length() - 1; i2++) {
            c0393z0 = c0393z0.m733C().m649i(fieldPath.getSegment(i2));
            if (!Values.isMapValue(c0393z0)) {
                return null;
            }
        }
        return c0393z0.m733C().m649i(fieldPath.getLastSegment());
    }

    public static ObjectValue fromMap(Map<String, C0393Z0> map) {
        return new ObjectValue(Values.encodeValue(map));
    }

    private void setOverlay(FieldPath fieldPath, @Nullable C0393Z0 c0393z0) {
        synchronized (this.lock) {
            try {
                if (this.mergedValue != null) {
                    this.partialValue = this.mergedValue;
                    this.mergedValue = null;
                }
                setOverlay(this.overlayMap, fieldPath, c0393z0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void delete(FieldPath fieldPath) {
        Assert.hardAssert(!fieldPath.isEmpty(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        setOverlay(fieldPath, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectValue) {
            return Values.equals(buildProto(), ((ObjectValue) obj).buildProto());
        }
        return false;
    }

    @Nullable
    public C0393Z0 get(FieldPath fieldPath) {
        return extractNestedValue(buildProto(), fieldPath);
    }

    public FieldMask getFieldMask() {
        return extractFieldMask(buildProto().m733C());
    }

    public Map<String, C0393Z0> getFieldsMap() {
        return buildProto().m733C().m648h();
    }

    public int hashCode() {
        return buildProto().hashCode();
    }

    public void set(FieldPath fieldPath, C0393Z0 c0393z0) {
        Assert.hardAssert(!fieldPath.isEmpty(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        setOverlay(fieldPath, c0393z0);
    }

    public void setAll(Map<FieldPath, C0393Z0> map) {
        for (Map.Entry<FieldPath, C0393Z0> entry : map.entrySet()) {
            FieldPath key = entry.getKey();
            if (entry.getValue() == null) {
                delete(key);
            } else {
                set(key, entry.getValue());
            }
        }
    }

    @NonNull
    public String toString() {
        return "ObjectValue{internalValue=" + Values.canonicalId(buildProto()) + '}';
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ObjectValue m12328clone() {
        return new ObjectValue(buildProto());
    }

    private static void setOverlay(Map<String, Object> map, FieldPath fieldPath, @Nullable C0393Z0 c0393z0) {
        Map<String, Object> map2;
        for (int i2 = 0; i2 < fieldPath.length() - 1; i2++) {
            String segment = fieldPath.getSegment(i2);
            Object obj = map.get(segment);
            if (obj instanceof Map) {
                map2 = (Map) obj;
            } else {
                if (obj instanceof C0393Z0) {
                    C0393Z0 c0393z1 = (C0393Z0) obj;
                    if (c0393z1.m741K()) {
                        HashMap map3 = new HashMap(c0393z1.m733C().m648h());
                        map.put(segment, map3);
                        map = map3;
                    }
                }
                map2 = new HashMap<>();
                map.put(segment, map2);
            }
            map = map2;
        }
        map.put(fieldPath.getLastSegment(), c0393z0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectValue() {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m697p(C0375Q.m645f());
        this((C0393Z0) c0389x0M714O.m12341build());
    }
}
