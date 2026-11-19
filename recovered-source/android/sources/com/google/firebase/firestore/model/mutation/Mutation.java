package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Mutation {
    private final List<FieldTransform> fieldTransforms;
    private final DocumentKey key;
    private final Precondition precondition;

    public Mutation(DocumentKey documentKey, Precondition precondition) {
        this(documentKey, precondition, new ArrayList());
    }

    @Nullable
    public static Mutation calculateOverlayMutation(MutableDocument mutableDocument, @Nullable FieldMask fieldMask) {
        if (!mutableDocument.hasLocalMutations()) {
            return null;
        }
        if (fieldMask != null && fieldMask.getMask().isEmpty()) {
            return null;
        }
        if (fieldMask == null) {
            return mutableDocument.isNoDocument() ? new DeleteMutation(mutableDocument.getKey(), Precondition.NONE) : new SetMutation(mutableDocument.getKey(), mutableDocument.getData(), Precondition.NONE);
        }
        ObjectValue data = mutableDocument.getData();
        ObjectValue objectValue = new ObjectValue();
        HashSet hashSet = new HashSet();
        for (FieldPath fieldPathPopLast : fieldMask.getMask()) {
            if (!hashSet.contains(fieldPathPopLast)) {
                if (data.get(fieldPathPopLast) == null && fieldPathPopLast.length() > 1) {
                    fieldPathPopLast = fieldPathPopLast.popLast();
                }
                objectValue.set(fieldPathPopLast, data.get(fieldPathPopLast));
                hashSet.add(fieldPathPopLast);
            }
        }
        return new PatchMutation(mutableDocument.getKey(), objectValue, FieldMask.fromSet(hashSet), Precondition.NONE);
    }

    @Nullable
    public abstract FieldMask applyToLocalView(MutableDocument mutableDocument, @Nullable FieldMask fieldMask, Timestamp timestamp);

    public abstract void applyToRemoteDocument(MutableDocument mutableDocument, MutationResult mutationResult);

    public ObjectValue extractTransformBaseValue(Document document) {
        ObjectValue objectValue = null;
        for (FieldTransform fieldTransform : this.fieldTransforms) {
            C0393Z0 c0393z0ComputeBaseValue = fieldTransform.getOperation().computeBaseValue(document.getField(fieldTransform.getFieldPath()));
            if (c0393z0ComputeBaseValue != null) {
                if (objectValue == null) {
                    objectValue = new ObjectValue();
                }
                objectValue.set(fieldTransform.getFieldPath(), c0393z0ComputeBaseValue);
            }
        }
        return objectValue;
    }

    @Nullable
    public abstract FieldMask getFieldMask();

    public List<FieldTransform> getFieldTransforms() {
        return this.fieldTransforms;
    }

    public DocumentKey getKey() {
        return this.key;
    }

    public Precondition getPrecondition() {
        return this.precondition;
    }

    public boolean hasSameKeyAndPrecondition(Mutation mutation) {
        return this.key.equals(mutation.key) && this.precondition.equals(mutation.precondition);
    }

    public int keyAndPreconditionHashCode() {
        return this.precondition.hashCode() + (getKey().hashCode() * 31);
    }

    public String keyAndPreconditionToString() {
        return "key=" + this.key + ", precondition=" + this.precondition;
    }

    public Map<FieldPath, C0393Z0> localTransformResults(Timestamp timestamp, MutableDocument mutableDocument) {
        HashMap map = new HashMap(this.fieldTransforms.size());
        for (FieldTransform fieldTransform : this.fieldTransforms) {
            map.put(fieldTransform.getFieldPath(), fieldTransform.getOperation().applyToLocalView(mutableDocument.getField(fieldTransform.getFieldPath()), timestamp));
        }
        return map;
    }

    public Map<FieldPath, C0393Z0> serverTransformResults(MutableDocument mutableDocument, List<C0393Z0> list) {
        HashMap map = new HashMap(this.fieldTransforms.size());
        Assert.hardAssert(this.fieldTransforms.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.fieldTransforms.size()));
        for (int i2 = 0; i2 < list.size(); i2++) {
            FieldTransform fieldTransform = this.fieldTransforms.get(i2);
            map.put(fieldTransform.getFieldPath(), fieldTransform.getOperation().applyToRemoteDocument(mutableDocument.getField(fieldTransform.getFieldPath()), list.get(i2)));
        }
        return map;
    }

    public void verifyKeyMatches(MutableDocument mutableDocument) {
        Assert.hardAssert(mutableDocument.getKey().equals(getKey()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public Mutation(DocumentKey documentKey, Precondition precondition, List<FieldTransform> list) {
        this.key = documentKey;
        this.precondition = precondition;
        this.fieldTransforms = list;
    }
}
