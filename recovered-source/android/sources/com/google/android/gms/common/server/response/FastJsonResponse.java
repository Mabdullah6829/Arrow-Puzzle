package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class FastJsonResponse {

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        /* JADX INFO: renamed from: A */
        public final String f4589A;

        /* JADX INFO: renamed from: B */
        public zan f4590B;

        /* JADX INFO: renamed from: C */
        public final StringToIntConverter f4591C;

        /* JADX INFO: renamed from: s */
        public final int f4592s;

        /* JADX INFO: renamed from: t */
        public final int f4593t;

        /* JADX INFO: renamed from: u */
        public final boolean f4594u;

        /* JADX INFO: renamed from: v */
        public final int f4595v;

        /* JADX INFO: renamed from: w */
        public final boolean f4596w;

        /* JADX INFO: renamed from: x */
        public final String f4597x;

        /* JADX INFO: renamed from: y */
        public final int f4598y;

        /* JADX INFO: renamed from: z */
        public final Class f4599z;

        public Field(int i2, int i3, boolean z, int i4, boolean z2, String str, int i5, String str2, com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.f4592s = i2;
            this.f4593t = i3;
            this.f4594u = z;
            this.f4595v = i4;
            this.f4596w = z2;
            this.f4597x = str;
            this.f4598y = i5;
            if (str2 == null) {
                this.f4599z = null;
                this.f4589A = null;
            } else {
                this.f4599z = SafeParcelResponse.class;
                this.f4589A = str2;
            }
            if (zaaVar == null) {
                this.f4591C = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.f4585t;
            if (stringToIntConverter == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.f4591C = stringToIntConverter;
        }

        public final String toString() {
            Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
            toStringHelper.m3536a(Integer.valueOf(this.f4592s), "versionCode");
            toStringHelper.m3536a(Integer.valueOf(this.f4593t), "typeIn");
            toStringHelper.m3536a(Boolean.valueOf(this.f4594u), "typeInArray");
            toStringHelper.m3536a(Integer.valueOf(this.f4595v), "typeOut");
            toStringHelper.m3536a(Boolean.valueOf(this.f4596w), "typeOutArray");
            toStringHelper.m3536a(this.f4597x, "outputFieldName");
            toStringHelper.m3536a(Integer.valueOf(this.f4598y), "safeParcelFieldId");
            String str = this.f4589A;
            if (str == null) {
                str = null;
            }
            toStringHelper.m3536a(str, "concreteTypeName");
            Class cls = this.f4599z;
            if (cls != null) {
                toStringHelper.m3536a(cls.getCanonicalName(), "concreteType.class");
            }
            if (this.f4591C != null) {
                toStringHelper.m3536a(StringToIntConverter.class.getCanonicalName(), "converterName");
            }
            return toStringHelper.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
            SafeParcelWriter.m3588n(parcel, 1, 4);
            parcel.writeInt(this.f4592s);
            SafeParcelWriter.m3588n(parcel, 2, 4);
            parcel.writeInt(this.f4593t);
            SafeParcelWriter.m3588n(parcel, 3, 4);
            parcel.writeInt(this.f4594u ? 1 : 0);
            SafeParcelWriter.m3588n(parcel, 4, 4);
            parcel.writeInt(this.f4595v);
            SafeParcelWriter.m3588n(parcel, 5, 4);
            parcel.writeInt(this.f4596w ? 1 : 0);
            SafeParcelWriter.m3583i(parcel, 6, this.f4597x);
            SafeParcelWriter.m3588n(parcel, 7, 4);
            parcel.writeInt(this.f4598y);
            String str = this.f4589A;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.m3583i(parcel, 8, str);
            StringToIntConverter stringToIntConverter = this.f4591C;
            SafeParcelWriter.m3582h(parcel, 9, stringToIntConverter != null ? new com.google.android.gms.common.server.converter.zaa(stringToIntConverter) : null, i2);
            SafeParcelWriter.m3590p(iM3589o, parcel);
        }
    }

    public interface FieldConverter<I, O> {
    }

    /* JADX INFO: renamed from: f */
    public static final Object m3621f(Field field, Object obj) {
        StringToIntConverter stringToIntConverter = field.f4591C;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.f4583u.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.f4582t.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static final void m3622g(StringBuilder sb, Field field, Object obj) {
        int i2 = field.f4593t;
        if (i2 == 11) {
            Class cls = field.f4599z;
            Preconditions.m3544h(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i2 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.m3651a((String) obj));
            sb.append("\"");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Map mo3623a();

    /* JADX INFO: renamed from: b */
    public final Object m3624b(Field field) {
        String str = field.f4597x;
        if (field.f4599z == null) {
            return mo3625c();
        }
        if (mo3625c() != null) {
            throw new IllegalStateException(AbstractC0271e0.m398f("Concrete field shouldn't be value object: ", str));
        }
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(strSubstring).length());
            sb.append("get");
            sb.append(upperCase);
            sb.append(strSubstring);
            return getClass().getMethod(sb.toString(), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo3625c();

    /* JADX INFO: renamed from: d */
    public final boolean m3626d(Field field) {
        if (field.f4595v != 11) {
            return mo3627e();
        }
        if (field.f4596w) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo3627e();

    public String toString() {
        Map mapMo3623a = mo3623a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapMo3623a.keySet()) {
            Field field = (Field) mapMo3623a.get(str);
            if (m3626d(field)) {
                Object objM3621f = m3621f(field, m3624b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objM3621f != null) {
                    switch (field.f4595v) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objM3621f, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objM3621f, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.m3652a(sb, (HashMap) objM3621f);
                            break;
                        default:
                            if (field.f4594u) {
                                ArrayList arrayList = (ArrayList) objM3621f;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i2);
                                    if (obj != null) {
                                        m3622g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                m3622g(sb, field, objM3621f);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
