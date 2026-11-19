package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class SetMutation extends Mutation {
    private final ObjectValue value;

    public SetMutation(DocumentKey documentKey, ObjectValue objectValue, Precondition precondition) {
        this(documentKey, objectValue, precondition, new ArrayList());
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public FieldMask applyToLocalView(MutableDocument mutableDocument, @Nullable FieldMask fieldMask, Timestamp timestamp) {
        verifyKeyMatches(mutableDocument);
        if (!getPrecondition().isValidFor(mutableDocument)) {
            return fieldMask;
        }
        Map<FieldPath, C0393Z0> mapLocalTransformResults = localTransformResults(timestamp, mutableDocument);
        ObjectValue objectValueM12328clone = this.value.m12328clone();
        objectValueM12328clone.setAll(mapLocalTransformResults);
        mutableDocument.convertToFoundDocument(mutableDocument.getVersion(), objectValueM12328clone).setHasLocalMutations();
        return null;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    public void applyToRemoteDocument(MutableDocument mutableDocument, MutationResult mutationResult) {
        verifyKeyMatches(mutableDocument);
        ObjectValue objectValueM12328clone = this.value.m12328clone();
        objectValueM12328clone.setAll(serverTransformResults(mutableDocument, mutationResult.getTransformResults()));
        mutableDocument.convertToFoundDocument(mutationResult.getVersion(), objectValueM12328clone).setHasCommittedMutations();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SetMutation.class == obj.getClass()) {
            SetMutation setMutation = (SetMutation) obj;
            if (hasSameKeyAndPrecondition(setMutation) && this.value.equals(setMutation.value) && getFieldTransforms().equals(setMutation.getFieldTransforms())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.model.mutation.Mutation
    @Nullable
    public FieldMask getFieldMask() {
        return null;
    }

    public ObjectValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (keyAndPreconditionHashCode() * 31);
    }

    public String toString() {
        return "SetMutation{" + keyAndPreconditionToString() + ", value=" + this.value + "}";
    }

    public SetMutation(DocumentKey documentKey, ObjectValue objectValue, Precondition precondition, List<FieldTransform> list) {
        super(documentKey, precondition, list);
        this.value = objectValue;
    }
}
