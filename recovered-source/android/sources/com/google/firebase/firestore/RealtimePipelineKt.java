package com.google.firebase.firestore;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6504r;

/* JADX INFO: loaded from: classes2.dex */
public final class RealtimePipelineKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            try {
                iArr[DocumentViewChange.Type.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentViewChange.Type.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentViewChange.Type.MODIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentViewChange.Type.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> List<T> changesFromSnapshot(MetadataChanges metadataChanges, ViewSnapshot snapshot, InterfaceC6504r fromDocument) {
        int iIndexOf;
        int iIndexOf2;
        AbstractC6452k.m12181e(metadataChanges, "metadataChanges");
        AbstractC6452k.m12181e(snapshot, "snapshot");
        AbstractC6452k.m12181e(fromDocument, "fromDocument");
        ArrayList arrayList = new ArrayList();
        if (snapshot.getOldDocuments().isEmpty()) {
            Document document = null;
            int i2 = 0;
            for (DocumentViewChange documentViewChange : snapshot.getChanges()) {
                Document document2 = documentViewChange.getDocument();
                Assert.hardAssert(documentViewChange.getType() == DocumentViewChange.Type.ADDED, "Invalid added event for first snapshot", new Object[0]);
                Assert.hardAssert(document == null || snapshot.getQuery().comparator().compare(document, document2) < 0, "Got added events in wrong order", new Object[0]);
                AbstractC6452k.m12178b(document2);
                arrayList.add(fromDocument.invoke(document2, DocumentChange.Type.ADDED, -1, Integer.valueOf(i2)));
                document = document2;
                i2++;
            }
        } else {
            DocumentSet oldDocuments = snapshot.getOldDocuments();
            for (DocumentViewChange documentViewChange2 : snapshot.getChanges()) {
                if (metadataChanges != MetadataChanges.EXCLUDE || documentViewChange2.getType() != DocumentViewChange.Type.METADATA) {
                    Document document3 = documentViewChange2.getDocument();
                    DocumentChange.Type type = getType(documentViewChange2);
                    if (type != DocumentChange.Type.ADDED) {
                        iIndexOf = oldDocuments.indexOf(document3.getKey());
                        Assert.hardAssert(iIndexOf >= 0, "Index for document not found", new Object[0]);
                        oldDocuments = oldDocuments.remove(document3.getKey());
                    } else {
                        iIndexOf = -1;
                    }
                    if (type != DocumentChange.Type.REMOVED) {
                        oldDocuments = oldDocuments.add(document3);
                        iIndexOf2 = oldDocuments.indexOf(document3.getKey());
                        Assert.hardAssert(iIndexOf2 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        iIndexOf2 = -1;
                    }
                    AbstractC6452k.m12178b(document3);
                    arrayList.add(fromDocument.invoke(document3, type, Integer.valueOf(iIndexOf), Integer.valueOf(iIndexOf2)));
                }
            }
        }
        return arrayList;
    }

    private static final DocumentChange.Type getType(DocumentViewChange documentViewChange) {
        DocumentViewChange.Type type = documentViewChange.getType();
        int i2 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            return DocumentChange.Type.ADDED;
        }
        if (i2 == 2 || i2 == 3) {
            return DocumentChange.Type.MODIFIED;
        }
        if (i2 == 4) {
            return DocumentChange.Type.REMOVED;
        }
        throw new IllegalArgumentException("Unknown view change type: " + documentViewChange.getType());
    }
}
