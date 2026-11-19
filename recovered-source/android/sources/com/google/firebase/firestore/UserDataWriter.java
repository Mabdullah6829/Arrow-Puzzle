package com.google.firebase.firestore;

import androidx.annotation.RestrictTo;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.C6197S0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p022N.C0393Z0;
import p022N.C0406e;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class UserDataWriter {
    private final FirebaseFirestore firestore;
    private final DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior;

    /* JADX INFO: renamed from: com.google.firebase.firestore.UserDataWriter$1 */
    public static /* synthetic */ class C57381 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$DocumentSnapshot$ServerTimestampBehavior */
        static final /* synthetic */ int[] f23648x1f31a5ae;

        static {
            int[] iArr = new int[DocumentSnapshot.ServerTimestampBehavior.values().length];
            f23648x1f31a5ae = iArr;
            try {
                iArr[DocumentSnapshot.ServerTimestampBehavior.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23648x1f31a5ae[DocumentSnapshot.ServerTimestampBehavior.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UserDataWriter(FirebaseFirestore firebaseFirestore, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        this.firestore = firebaseFirestore;
        this.serverTimestampBehavior = serverTimestampBehavior;
    }

    private List<Object> convertArray(C0406e c0406e) {
        ArrayList arrayList = new ArrayList(c0406e.m800j());
        Iterator it = c0406e.getValuesList().iterator();
        while (it.hasNext()) {
            arrayList.add(convertValue((C0393Z0) it.next()));
        }
        return arrayList;
    }

    private Object convertReference(C0393Z0 c0393z0) {
        DatabaseId databaseIdFromName = DatabaseId.fromName(c0393z0.m734D());
        DocumentKey documentKeyFromName = DocumentKey.fromName(c0393z0.m734D());
        DatabaseId databaseId = this.firestore.getDatabaseId();
        if (!databaseIdFromName.equals(databaseId)) {
            Logger.warn("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", documentKeyFromName.getPath(), databaseIdFromName.getProjectId(), databaseIdFromName.getDatabaseId(), databaseId.getProjectId(), databaseId.getDatabaseId());
        }
        return new DocumentReference(documentKeyFromName, this.firestore);
    }

    private Object convertServerTimestamp(C0393Z0 c0393z0) {
        int i2 = C57381.f23648x1f31a5ae[this.serverTimestampBehavior.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return convertTimestamp(ServerTimestamps.getLocalWriteTime(c0393z0));
        }
        C0393Z0 previousValue = ServerTimestamps.getPreviousValue(c0393z0);
        if (previousValue == null) {
            return null;
        }
        return convertValue(previousValue);
    }

    private Object convertTimestamp(C6197S0 c6197s0) {
        return new Timestamp(c6197s0.m11820i(), c6197s0.m11819h());
    }

    public Map<String, Object> convertObject(Map<String, C0393Z0> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, C0393Z0> entry : map.entrySet()) {
            map2.put(entry.getKey(), convertValue(entry.getValue()));
        }
        return map2;
    }

    public Object convertValue(C0393Z0 c0393z0) {
        switch (Values.typeOrder(c0393z0)) {
            case 0:
                return null;
            case 1:
            case 9:
            case 11:
            case 12:
            case 14:
            default:
                throw Assert.fail("Unknown value type: " + c0393z0.m737G(), new Object[0]);
            case 2:
                return Boolean.valueOf(c0393z0.m746u());
            case 3:
            case 4:
                return c0393z0.m740J() ? Long.valueOf(c0393z0.m732B()) : Double.valueOf(c0393z0.m748x());
            case 5:
                return convertTimestamp(c0393z0.m736F());
            case 6:
                return convertServerTimestamp(c0393z0);
            case 7:
                return c0393z0.m735E();
            case 8:
                return Blob.fromByteString(c0393z0.m747v());
            case 10:
                return convertReference(c0393z0);
            case 13:
                return new GeoPoint(c0393z0.m731A().m1190h(), c0393z0.m731A().m1191i());
            case 15:
                return convertArray(c0393z0.m745t());
            case 16:
                return convertVectorValue(c0393z0.m733C().m648h());
            case 17:
                return convertObject(c0393z0.m733C().m648h());
        }
    }

    public VectorValue convertVectorValue(Map<String, C0393Z0> map) {
        List valuesList = map.get("value").m745t().getValuesList();
        double[] dArr = new double[valuesList.size()];
        for (int i2 = 0; i2 < valuesList.size(); i2++) {
            dArr[i2] = ((C0393Z0) valuesList.get(i2)).m748x();
        }
        return new VectorValue(dArr);
    }
}
