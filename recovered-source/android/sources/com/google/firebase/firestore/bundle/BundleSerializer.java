package com.google.firebase.firestore.bundle;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6195R0;
import com.google.protobuf.C6197S0;
import com.google.protobuf.C6248m;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;
import p022N.C0371O;
import p022N.C0375Q;
import p022N.C0389X0;
import p022N.C0393Z0;
import p022N.C0403d;
import p022N.C0406e;
import p028Q.C0499a;
import p028Q.C0500b;

/* JADX INFO: loaded from: classes2.dex */
public class BundleSerializer {
    private static final long MILLIS_PER_SECOND = 1000;
    private final RemoteSerializer remoteSerializer;
    private final SimpleDateFormat timestampFormat;

    public BundleSerializer(RemoteSerializer remoteSerializer) {
        this.remoteSerializer = remoteSerializer;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.timestampFormat = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void decodeArrayValue(C0389X0 c0389x0, @Nullable JSONArray jSONArray) {
        C0403d c0403dM798k = C0406e.m798k();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                c0403dM798k.m788c(decodeValue(jSONArray.getJSONObject(i2)));
            }
        }
        c0389x0.m687c(c0403dM798k);
    }

    private BundledQuery decodeBundledQuery(JSONObject jSONObject) throws JSONException {
        String string;
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        verifyNoSelect(jSONObject2);
        ResourcePath resourcePathDecodeName = decodeName(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray("from");
        verifyCollectionSelector(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.optBoolean("allDescendants", false)) {
            string = jSONObject3.getString("collectionId");
        } else {
            resourcePathDecodeName = resourcePathDecodeName.append(jSONObject3.getString("collectionId"));
            string = null;
        }
        ResourcePath resourcePath = resourcePathDecodeName;
        String str = string;
        List<Filter> listDecodeWhere = decodeWhere(jSONObject2.optJSONObject("where"));
        List<OrderBy> listDecodeOrderBy = decodeOrderBy(jSONObject2.optJSONArray("orderBy"));
        Bound boundDecodeStartAtBound = decodeStartAtBound(jSONObject2.optJSONObject("startAt"));
        Bound boundDecodeEndAtBound = decodeEndAtBound(jSONObject2.optJSONObject("endAt"));
        verifyNoOffset(jSONObject2);
        return new BundledQuery(new Query(resourcePath, str, listDecodeWhere, listDecodeOrderBy, decodeLimit(jSONObject2), Query.LimitType.LIMIT_TO_FIRST, boundDecodeStartAtBound, boundDecodeEndAtBound).toTarget(), decodeLimitType(jSONObject));
    }

    private void decodeCompositeFilter(List<Filter> list, JSONObject jSONObject) {
        if (!jSONObject.getString("op").equals("AND")) {
            throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filters");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                decodeFilter(list, jSONArrayOptJSONArray.getJSONObject(i2));
            }
        }
    }

    private Bound decodeEndAtBound(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new Bound(decodePosition(jSONObject), !jSONObject.optBoolean("before", false));
    }

    private void decodeFieldFilter(List<Filter> list, JSONObject jSONObject) {
        list.add(FieldFilter.create(decodeFieldReference(jSONObject.getJSONObject("field")), decodeFieldFilterOperator(jSONObject.getString("op")), decodeValue(jSONObject.getJSONObject("value"))));
    }

    private FieldFilter.Operator decodeFieldFilterOperator(String str) {
        return FieldFilter.Operator.valueOf(str);
    }

    private FieldPath decodeFieldReference(JSONObject jSONObject) {
        return FieldPath.fromServerFormat(jSONObject.getString("fieldPath"));
    }

    private void decodeFilter(List<Filter> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("compositeFilter")) {
            decodeCompositeFilter(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            decodeFieldFilter(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            decodeUnaryFilter(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void decodeGeoPoint(C0389X0 c0389x0, JSONObject jSONObject) {
        C0499a c0499aM1189j = C0500b.m1189j();
        c0499aM1189j.m1184b(jSONObject.optDouble("latitude"));
        c0499aM1189j.m1185c(jSONObject.optDouble("longitude"));
        c0389x0.m694l(c0499aM1189j);
    }

    private int decodeLimit(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("limit");
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("value", -1) : jSONObject.optInt("limit", -1);
    }

    private Query.LimitType decodeLimitType(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("limitType", "FIRST");
        if (strOptString.equals("FIRST")) {
            return Query.LimitType.LIMIT_TO_FIRST;
        }
        if (strOptString.equals("LAST")) {
            return Query.LimitType.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: ".concat(strOptString));
    }

    private void decodeMapValue(C0389X0 c0389x0, @Nullable JSONObject jSONObject) {
        C0371O c0371oM646k = C0375Q.m646k();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c0371oM646k.m634d(next, decodeValue(jSONObject.getJSONObject(next)));
            }
        }
        c0389x0.m696o(c0371oM646k);
    }

    private ResourcePath decodeName(String str) {
        ResourcePath resourcePathFromString = ResourcePath.fromString(str);
        if (this.remoteSerializer.isLocalResourceName(resourcePathFromString)) {
            return resourcePathFromString.popFirst(5);
        }
        throw new IllegalArgumentException(AbstractC0271e0.m398f("Resource name is not valid for current instance: ", str));
    }

    private List<OrderBy> decodeOrderBy(@Nullable JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                arrayList.add(OrderBy.getInstance(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? OrderBy.Direction.ASCENDING : OrderBy.Direction.DESCENDING, decodeFieldReference(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    private List<C0393Z0> decodePosition(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(decodeValue(jSONArrayOptJSONArray.getJSONObject(i2)));
            }
        }
        return arrayList;
    }

    private SnapshotVersion decodeSnapshotVersion(Object obj) {
        return new SnapshotVersion(decodeTimestamp(obj));
    }

    private Bound decodeStartAtBound(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new Bound(decodePosition(jSONObject), jSONObject.optBoolean("before", false));
    }

    private Timestamp decodeTimestamp(JSONObject jSONObject) {
        return new Timestamp(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private static long decodeTimezoneOffset(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Invalid offset value: ".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return (Long.parseLong(strSubstring2) + (Long.parseLong(strSubstring) * 60)) * 60;
    }

    private void decodeUnaryFilter(List<Filter> list, JSONObject jSONObject) throws JSONException {
        FieldPath fieldPathDecodeFieldReference = decodeFieldReference(jSONObject.getJSONObject("field"));
        String string = jSONObject.getString("op");
        string.getClass();
        switch (string) {
            case "IS_NAN":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.EQUAL, Values.NAN_VALUE));
                return;
            case "IS_NULL":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.EQUAL, Values.NULL_VALUE));
                return;
            case "IS_NOT_NAN":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.NOT_EQUAL, Values.NAN_VALUE));
                return;
            case "IS_NOT_NULL":
                list.add(FieldFilter.create(fieldPathDecodeFieldReference, FieldFilter.Operator.NOT_EQUAL, Values.NULL_VALUE));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: ".concat(string));
        }
    }

    private C0393Z0 decodeValue(JSONObject jSONObject) {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        if (jSONObject.has("nullValue")) {
            c0389x0M714O.m698q();
        } else if (jSONObject.has("booleanValue")) {
            c0389x0M714O.m689e(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            c0389x0M714O.m695m(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            c0389x0M714O.m691g(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            decodeTimestamp(c0389x0M714O, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            c0389x0M714O.m701t(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            byte[] bArrDecode = Base64.decode(jSONObject.getString("bytesValue"), 0);
            C6248m c6248m = AbstractC6251n.f24219t;
            c0389x0M714O.m690f(AbstractC6251n.m11896j(bArrDecode, 0, bArrDecode.length));
        } else if (jSONObject.has("referenceValue")) {
            c0389x0M714O.m700s(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            decodeGeoPoint(c0389x0M714O, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            decodeArrayValue(c0389x0M714O, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else {
            if (!jSONObject.has("mapValue")) {
                throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
            }
            decodeMapValue(c0389x0M714O, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
        return (C0393Z0) c0389x0M714O.m12341build();
    }

    private List<Filter> decodeWhere(@Nullable JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            decodeFilter(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int parseNanos(String str) {
        int iCharAt = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            iCharAt *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: ".concat(str));
                }
                iCharAt = (str.charAt(i2) - '0') + iCharAt;
            }
        }
        return iCharAt;
    }

    private void verifyCollectionSelector(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void verifyNoOffset(JSONObject jSONObject) {
        if (jSONObject.has(TypedValues.CycleType.S_WAVE_OFFSET)) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void verifyNoSelect(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    public BundleMetadata decodeBundleMetadata(JSONObject jSONObject) {
        return new BundleMetadata(jSONObject.getString("id"), jSONObject.getInt("version"), decodeSnapshotVersion(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public BundledDocumentMetadata decodeBundledDocumentMetadata(JSONObject jSONObject) {
        DocumentKey documentKeyFromPath = DocumentKey.fromPath(decodeName(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME)));
        SnapshotVersion snapshotVersionDecodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("readTime"));
        boolean zOptBoolean = jSONObject.optBoolean("exists", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i2));
            }
        }
        return new BundledDocumentMetadata(documentKeyFromPath, snapshotVersionDecodeSnapshotVersion, zOptBoolean, arrayList);
    }

    public BundleDocument decodeDocument(JSONObject jSONObject) {
        DocumentKey documentKeyFromPath = DocumentKey.fromPath(decodeName(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME)));
        SnapshotVersion snapshotVersionDecodeSnapshotVersion = decodeSnapshotVersion(jSONObject.get("updateTime"));
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        decodeMapValue(c0389x0M714O, jSONObject.getJSONObject("fields"));
        return new BundleDocument(MutableDocument.newFoundDocument(documentKeyFromPath, snapshotVersionDecodeSnapshotVersion, ObjectValue.fromMap(c0389x0M714O.m686b().m648h())));
    }

    public NamedQuery decodeNamedQuery(JSONObject jSONObject) {
        return new NamedQuery(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), decodeBundledQuery(jSONObject.getJSONObject("bundledQuery")), decodeSnapshotVersion(jSONObject.get("readTime")));
    }

    private Timestamp decodeTimestamp(String str) {
        try {
            int iIndexOf = str.indexOf(84);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: ".concat(str));
            }
            int iIndexOf2 = str.indexOf(90, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(43, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(45, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: ".concat(str));
            }
            int nanos = 0;
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = "";
            int iIndexOf3 = strSubstring.indexOf(46);
            if (iIndexOf3 != -1) {
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                strSubstring2 = strSubstring.substring(iIndexOf3 + 1);
                strSubstring = strSubstring3;
            }
            long time = this.timestampFormat.parse(strSubstring).getTime() / 1000;
            if (!strSubstring2.isEmpty()) {
                nanos = parseNanos(strSubstring2);
            }
            if (str.charAt(iIndexOf2) != 'Z') {
                long jDecodeTimezoneOffset = decodeTimezoneOffset(str.substring(iIndexOf2 + 1));
                time = str.charAt(iIndexOf2) == '+' ? time - jDecodeTimezoneOffset : time + jDecodeTimezoneOffset;
            } else if (str.length() != iIndexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(iIndexOf2) + "\"");
            }
            return new Timestamp(time, nanos);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Failed to parse timestamp", e);
        }
    }

    private Timestamp decodeTimestamp(Object obj) {
        if (obj instanceof String) {
            return decodeTimestamp((String) obj);
        }
        if (obj instanceof JSONObject) {
            return decodeTimestamp((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private void decodeTimestamp(C0389X0 c0389x0, Object obj) {
        Timestamp timestampDecodeTimestamp = decodeTimestamp(obj);
        C6195R0 c6195r0M11817j = C6197S0.m11817j();
        c6195r0M11817j.m11813c(timestampDecodeTimestamp.getSeconds());
        c6195r0M11817j.m11812b(timestampDecodeTimestamp.getNanoseconds());
        c0389x0.m702u(c6195r0M11817j);
    }
}
