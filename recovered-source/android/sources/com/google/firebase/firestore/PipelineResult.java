package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class PipelineResult {
    private final Timestamp createTime;
    private final Map<String, C0393Z0> fields;
    private final DocumentReference ref;
    private final Timestamp updateTime;
    private final UserDataWriter userDataWriter;

    public PipelineResult(UserDataWriter userDataWriter, DocumentReference documentReference, Map<String, C0393Z0> fields, Timestamp timestamp, Timestamp timestamp2) {
        AbstractC6452k.m12181e(userDataWriter, "userDataWriter");
        AbstractC6452k.m12181e(fields, "fields");
        this.userDataWriter = userDataWriter;
        this.fields = fields;
        this.createTime = timestamp;
        this.updateTime = timestamp2;
        this.ref = documentReference;
    }

    private final C0393Z0 extractNestedValue(FieldPath fieldPath) {
        Iterator<String> it = fieldPath.getInternalPath().iterator();
        AbstractC6452k.m12180d(it, "iterator(...)");
        if (!it.hasNext()) {
            return Values.encodeValue(this.fields);
        }
        String next = it.next();
        if (!this.fields.containsKey(next)) {
            return null;
        }
        C0393Z0 c0393z0M649i = this.fields.get(next);
        while (it.hasNext()) {
            String next2 = it.next();
            if (c0393z0M649i == null || !c0393z0M649i.m741K()) {
                return null;
            }
            c0393z0M649i = c0393z0M649i.m733C().m649i(next2);
        }
        return c0393z0M649i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PipelineResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type com.google.firebase.firestore.PipelineResult");
        PipelineResult pipelineResult = (PipelineResult) obj;
        return AbstractC6452k.m12177a(this.ref, pipelineResult.ref) && AbstractC6452k.m12177a(this.fields, pipelineResult.fields);
    }

    public final Object get(String field) {
        AbstractC6452k.m12181e(field, "field");
        FieldPath fieldPathFromDotSeparatedPath = FieldPath.fromDotSeparatedPath(field);
        AbstractC6452k.m12180d(fieldPathFromDotSeparatedPath, "fromDotSeparatedPath(...)");
        return get(fieldPathFromDotSeparatedPath);
    }

    public final Timestamp getCreateTime() {
        return this.createTime;
    }

    public final Map<String, Object> getData() {
        Map<String, Object> mapConvertObject = this.userDataWriter.convertObject(this.fields);
        AbstractC6452k.m12180d(mapConvertObject, "convertObject(...)");
        return mapConvertObject;
    }

    public final String getId() {
        DocumentReference documentReference = this.ref;
        if (documentReference != null) {
            return documentReference.getId();
        }
        return null;
    }

    public final DocumentReference getRef() {
        return this.ref;
    }

    public final Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        DocumentReference documentReference = this.ref;
        return this.fields.hashCode() + ((documentReference != null ? documentReference.hashCode() : 0) * 31);
    }

    public String toString() {
        return "PipelineResult{ref=" + this.ref + ", updateTime=" + this.updateTime + "}, data=" + getData();
    }

    public final Object get(FieldPath fieldPath) {
        AbstractC6452k.m12181e(fieldPath, "fieldPath");
        return this.userDataWriter.convertValue(extractNestedValue(fieldPath));
    }

    public PipelineResult(Document document, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior, FirebaseFirestore firestore) {
        AbstractC6452k.m12181e(document, "document");
        AbstractC6452k.m12181e(serverTimestampBehavior, "serverTimestampBehavior");
        AbstractC6452k.m12181e(firestore, "firestore");
        UserDataWriter userDataWriter = new UserDataWriter(firestore, serverTimestampBehavior);
        DocumentReference documentReference = new DocumentReference(document.getKey(), firestore);
        Map<String, C0393Z0> fieldsMap = document.getData().getFieldsMap();
        AbstractC6452k.m12180d(fieldsMap, "getFieldsMap(...)");
        SnapshotVersion createTime = document.getCreateTime();
        this(userDataWriter, documentReference, fieldsMap, createTime != null ? createTime.getTimestamp() : null, document.getVersion().getTimestamp());
    }
}
