package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    /* JADX INFO: renamed from: s */
    public final int f4600s;

    /* JADX INFO: renamed from: t */
    public final Parcel f4601t;

    /* JADX INFO: renamed from: u */
    public final int f4602u;

    /* JADX INFO: renamed from: v */
    public final zan f4603v;

    /* JADX INFO: renamed from: w */
    public final String f4604w;

    /* JADX INFO: renamed from: x */
    public int f4605x;

    /* JADX INFO: renamed from: y */
    public int f4606y;

    public SafeParcelResponse(int i2, Parcel parcel, zan zanVar) {
        this.f4600s = i2;
        Preconditions.m3544h(parcel);
        this.f4601t = parcel;
        this.f4602u = 2;
        this.f4603v = zanVar;
        this.f4604w = zanVar == null ? null : zanVar.f4615u;
        this.f4605x = 2;
    }

    /* JADX INFO: renamed from: i */
    public static void m3628i(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).f4598y, entry);
        }
        sb.append('{');
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i2);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                StringToIntConverter stringToIntConverter = field.f4591C;
                String str2 = field.f4589A;
                int i3 = field.f4595v;
                if (stringToIntConverter != null) {
                    switch (i3) {
                        case 0:
                            m3630k(sb, field, FastJsonResponse.m3621f(field, Integer.valueOf(SafeParcelReader.m3567q(i2, parcel))));
                            break;
                        case 1:
                            int iM3570t = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iM3570t == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iM3570t);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            m3630k(sb, field, FastJsonResponse.m3621f(field, bigInteger2));
                            break;
                        case 2:
                            m3630k(sb, field, FastJsonResponse.m3621f(field, Long.valueOf(SafeParcelReader.m3568r(i2, parcel))));
                            break;
                        case 3:
                            m3630k(sb, field, FastJsonResponse.m3621f(field, Float.valueOf(SafeParcelReader.m3565o(i2, parcel))));
                            break;
                        case 4:
                            SafeParcelReader.m3573w(parcel, i2, 8);
                            m3630k(sb, field, FastJsonResponse.m3621f(field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            m3630k(sb, field, FastJsonResponse.m3621f(field, SafeParcelReader.m3551a(i2, parcel)));
                            break;
                        case 6:
                            m3630k(sb, field, FastJsonResponse.m3621f(field, Boolean.valueOf(SafeParcelReader.m3564n(i2, parcel))));
                            break;
                        case 7:
                            m3630k(sb, field, FastJsonResponse.m3621f(field, SafeParcelReader.m3558h(i2, parcel)));
                            break;
                        case 8:
                        case 9:
                            m3630k(sb, field, FastJsonResponse.m3621f(field, SafeParcelReader.m3553c(i2, parcel)));
                            break;
                        case 10:
                            Bundle bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleM3552b.keySet()) {
                                String string = bundleM3552b.getString(str3);
                                Preconditions.m3544h(string);
                                map2.put(str3, string);
                            }
                            m3630k(sb, field, FastJsonResponse.m3621f(field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 25), "Unknown field out type = ", i3));
                    }
                } else if (field.f4596w) {
                    sb.append("[");
                    switch (i3) {
                        case 0:
                            int[] iArrM3555e = SafeParcelReader.m3555e(i2, parcel);
                            int length = iArrM3555e.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(iArrM3555e[i4]);
                            }
                            break;
                        case 1:
                            int iM3570t2 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM3570t2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i5 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i5];
                                for (int i6 = 0; i6 < i5; i6++) {
                                    bigIntegerArr[i6] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iM3570t2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i7 = 0; i7 < length2; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i7]);
                            }
                            break;
                        case 2:
                            int iM3570t3 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iM3570t3 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iM3570t3);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i8 = 0; i8 < length3; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(jArrCreateLongArray[i8]);
                            }
                            break;
                        case 3:
                            int iM3570t4 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iM3570t4 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iM3570t4);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i9 = 0; i9 < length4; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(fArrCreateFloatArray[i9]);
                            }
                            break;
                        case 4:
                            int iM3570t5 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iM3570t5 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iM3570t5);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i10 = 0; i10 < length5; i10++) {
                                if (i10 != 0) {
                                    sb.append(",");
                                }
                                sb.append(dArrCreateDoubleArray[i10]);
                            }
                            break;
                        case 5:
                            int iM3570t6 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iM3570t6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i11 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i11];
                                for (int i12 = 0; i12 < i11; i12++) {
                                    bigDecimalArr[i12] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iM3570t6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i13 = 0; i13 < length6; i13++) {
                                if (i13 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i13]);
                            }
                            break;
                        case 6:
                            int iM3570t7 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iM3570t7 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iM3570t7);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i14 = 0; i14 < length7; i14++) {
                                if (i14 != 0) {
                                    sb.append(",");
                                }
                                sb.append(zArrCreateBooleanArray[i14]);
                            }
                            break;
                        case 7:
                            String[] strArrM3559i = SafeParcelReader.m3559i(i2, parcel);
                            int length8 = strArrM3559i.length;
                            for (int i15 = 0; i15 < length8; i15++) {
                                if (i15 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArrM3559i[i15]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int iM3570t8 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iM3570t8 == 0) {
                                parcelArr = null;
                            } else {
                                int i16 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i16];
                                for (int i17 = 0; i17 < i16; i17++) {
                                    int i18 = parcel.readInt();
                                    if (i18 != 0) {
                                        int iDataPosition9 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition9, i18);
                                        parcelArr2[i17] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition9 + i18);
                                    } else {
                                        parcelArr2[i17] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition8 + iM3570t8);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i19 = 0; i19 < length9; i19++) {
                                if (i19 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i19].setDataPosition(0);
                                Preconditions.m3544h(str2);
                                Preconditions.m3544h(field.f4590B);
                                Map map3 = (Map) field.f4590B.f4614t.get(str2);
                                Preconditions.m3544h(map3);
                                m3628i(sb, map3, parcelArr[i19]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (i3) {
                        case 0:
                            sb.append(SafeParcelReader.m3567q(i2, parcel));
                            break;
                        case 1:
                            int iM3570t9 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iM3570t9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition10 + iM3570t9);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m3568r(i2, parcel));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m3565o(i2, parcel));
                            break;
                        case 4:
                            SafeParcelReader.m3573w(parcel, i2, 8);
                            sb.append(parcel.readDouble());
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m3551a(i2, parcel));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m3564n(i2, parcel));
                            break;
                        case 7:
                            String strM3558h = SafeParcelReader.m3558h(i2, parcel);
                            sb.append("\"");
                            sb.append(JsonUtils.m3651a(strM3558h));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
                            sb.append("\"");
                            sb.append(bArrM3553c == null ? null : Base64.encodeToString(bArrM3553c, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrM3553c2 = SafeParcelReader.m3553c(i2, parcel);
                            sb.append("\"");
                            sb.append(bArrM3553c2 == null ? null : Base64.encodeToString(bArrM3553c2, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleM3552b2 = SafeParcelReader.m3552b(i2, parcel);
                            Set<String> setKeySet = bundleM3552b2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str4 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str4);
                                sb.append("\":\"");
                                sb.append(JsonUtils.m3651a(bundleM3552b2.getString(str4)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int iM3570t10 = SafeParcelReader.m3570t(i2, parcel);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iM3570t10 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition11, iM3570t10);
                                parcel.setDataPosition(iDataPosition11 + iM3570t10);
                            }
                            parcelObtain.setDataPosition(0);
                            Preconditions.m3544h(str2);
                            Preconditions.m3544h(field.f4590B);
                            Map map4 = (Map) field.f4590B.f4614t.get(str2);
                            Preconditions.m3544h(map4);
                            m3628i(sb, map4, parcelObtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iM3572v) {
            throw new SafeParcelReader.ParseException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM3572v).length() + 26), "Overread allowed size end=", iM3572v), parcel);
        }
        sb.append('}');
    }

    /* JADX INFO: renamed from: j */
    public static final void m3629j(StringBuilder sb, int i2, Object obj) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                Preconditions.m3544h(obj);
                sb.append(JsonUtils.m3651a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                return;
            case 10:
                Preconditions.m3544h(obj);
                MapUtils.m3652a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 15), "Unknown type = ", i2));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m3630k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        boolean z = field.f4594u;
        int i2 = field.f4593t;
        if (!z) {
            m3629j(sb, i2, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                sb.append(",");
            }
            m3629j(sb, i2, arrayList.get(i3));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* JADX INFO: renamed from: a */
    public final Map mo3623a() {
        zan zanVar = this.f4603v;
        if (zanVar == null) {
            return null;
        }
        String str = this.f4604w;
        Preconditions.m3544h(str);
        return (Map) zanVar.f4614t.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* JADX INFO: renamed from: c */
    public final Object mo3625c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* JADX INFO: renamed from: e */
    public final boolean mo3627e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* JADX INFO: renamed from: h */
    public final Parcel m3631h() {
        int i2 = this.f4605x;
        Parcel parcel = this.f4601t;
        if (i2 != 0) {
            if (i2 != 1) {
                return parcel;
            }
            SafeParcelWriter.m3590p(this.f4606y, parcel);
            this.f4605x = 2;
            return parcel;
        }
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        this.f4606y = iM3589o;
        SafeParcelWriter.m3590p(iM3589o, parcel);
        this.f4605x = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        zan zanVar = this.f4603v;
        Preconditions.m3545i(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelM3631h = m3631h();
        parcelM3631h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f4604w;
        Preconditions.m3544h(str);
        Map map = (Map) zanVar.f4614t.get(str);
        Preconditions.m3544h(map);
        m3628i(sb, map, parcelM3631h);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4600s);
        Parcel parcelM3631h = m3631h();
        if (parcelM3631h != null) {
            int iM3589o2 = SafeParcelWriter.m3589o(2, parcel);
            parcel.appendFrom(parcelM3631h, 0, parcelM3631h.dataSize());
            SafeParcelWriter.m3590p(iM3589o2, parcel);
        }
        SafeParcelWriter.m3582h(parcel, 3, this.f4602u != 0 ? this.f4603v : null, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
