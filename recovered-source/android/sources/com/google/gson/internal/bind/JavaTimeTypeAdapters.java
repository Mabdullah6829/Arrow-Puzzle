package com.google.gson.internal.bind;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.floatingactionbutton.AbstractC5333a;
import com.google.firebase.heartbeatinfo.AbstractC5988d;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
final class JavaTimeTypeAdapters implements TypeAdapters.FactorySupplier {
    private static final TypeAdapter<Duration> DURATION = new TypeAdapters.IntegerFieldsTypeAdapter<Duration>("seconds", "nanos") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.1
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(Duration duration) {
            return integerValues2(AbstractC5988d.m11572l(duration));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public Duration create(long[] jArr) {
            return Duration.ofSeconds(jArr[0], jArr[1]);
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(Duration duration) {
            return new long[]{duration.getSeconds(), duration.getNano()};
        }
    };
    private static final TypeAdapter<Instant> INSTANT = new TypeAdapters.IntegerFieldsTypeAdapter<Instant>("seconds", "nanos") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.2
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(Instant instant) {
            return integerValues2(AbstractC5333a.m10997g(instant));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public Instant create(long[] jArr) {
            return Instant.ofEpochSecond(jArr[0], jArr[1]);
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(Instant instant) {
            return new long[]{instant.getEpochSecond(), instant.getNano()};
        }
    };
    private static final TypeAdapter<LocalDate> LOCAL_DATE = new TypeAdapters.IntegerFieldsTypeAdapter<LocalDate>("year", "month", "day") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.3
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(LocalDate localDate) {
            return integerValues2(AbstractC6152a.m11660e(localDate));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public LocalDate create(long[] jArr) {
            return LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(LocalDate localDate) {
            return new long[]{localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()};
        }
    };
    public static final TypeAdapter<LocalTime> LOCAL_TIME = new TypeAdapters.IntegerFieldsTypeAdapter<LocalTime>("hour", "minute", "second", "nano") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.4
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(LocalTime localTime) {
            return integerValues2(AbstractC6152a.m11666k(localTime));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public LocalTime create(long[] jArr) {
            return LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(LocalTime localTime) {
            return new long[]{localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNano()};
        }
    };
    private static final TypeAdapter<MonthDay> MONTH_DAY = new TypeAdapters.IntegerFieldsTypeAdapter<MonthDay>("month", "day") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.6
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(MonthDay monthDay) {
            return integerValues2(AbstractC6153b.m11687f(monthDay));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public MonthDay create(long[] jArr) {
            return MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(MonthDay monthDay) {
            return new long[]{monthDay.getMonthValue(), monthDay.getDayOfMonth()};
        }
    };
    private static final TypeAdapter<Period> PERIOD = new TypeAdapters.IntegerFieldsTypeAdapter<Period>("years", "months", "days") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.9
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(Period period) {
            return integerValues2(AbstractC6153b.m11693l(period));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public Period create(long[] jArr) {
            return Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(Period period) {
            return new long[]{period.getYears(), period.getMonths(), period.getDays()};
        }
    };
    private static final TypeAdapter<Year> YEAR = new TypeAdapters.IntegerFieldsTypeAdapter<Year>("year") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.10
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(Year year) {
            return integerValues2(AbstractC5988d.m11576p(year));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public Year create(long[] jArr) {
            return Year.of(Math.toIntExact(jArr[0]));
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(Year year) {
            return new long[]{year.getValue()};
        }
    };
    private static final TypeAdapter<YearMonth> YEAR_MONTH = new TypeAdapters.IntegerFieldsTypeAdapter<YearMonth>("year", "month") { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.11
        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public /* bridge */ /* synthetic */ long[] integerValues(YearMonth yearMonth) {
            return integerValues2(AbstractC5988d.m11578r(yearMonth));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters.IntegerFieldsTypeAdapter
        public YearMonth create(long[] jArr) {
            return YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
        }

        /* JADX INFO: renamed from: integerValues, reason: avoid collision after fix types in other method */
        public long[] integerValues2(YearMonth yearMonth) {
            return new long[]{yearMonth.getYear(), yearMonth.getMonthValue()};
        }
    };
    private static final TypeAdapter<ZoneId> ZONE_ID = new TypeAdapter<ZoneId>() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.12
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, ZoneId zoneId) throws IOException {
            write2(jsonWriter, AbstractC6152a.m11668m(zoneId));
        }

        @Override // com.google.gson.TypeAdapter
        public ZoneId read(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            String strNextString = null;
            Integer numValueOf = null;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("totalSeconds")) {
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                } else if (strNextName.equals("id")) {
                    strNextString = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (strNextString != null) {
                return ZoneId.of(strNextString);
            }
            if (numValueOf != null) {
                return ZoneOffset.ofTotalSeconds(numValueOf.intValue());
            }
            throw new JsonSyntaxException("Missing id or totalSeconds field; at path " + jsonReader.getPreviousPath());
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(JsonWriter jsonWriter, ZoneId zoneId) throws IOException {
            if (AbstractC5988d.m11586z(zoneId)) {
                jsonWriter.beginObject();
                jsonWriter.name("totalSeconds");
                jsonWriter.value(AbstractC5988d.m11582v(zoneId).getTotalSeconds());
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("id");
            jsonWriter.value(zoneId.getId());
            jsonWriter.endObject();
        }
    }.nullSafe();
    static final TypeAdapterFactory JAVA_TIME_FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.14
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!rawType.getName().startsWith("java.time.")) {
                return null;
            }
            if (rawType == AbstractC6152a.m11658c()) {
                return JavaTimeTypeAdapters.DURATION;
            }
            if (rawType == AbstractC5333a.m10993c()) {
                return JavaTimeTypeAdapters.INSTANT;
            }
            if (rawType == AbstractC5988d.m11568h()) {
                return JavaTimeTypeAdapters.LOCAL_DATE;
            }
            if (rawType == AbstractC5988d.m11558B()) {
                return (TypeAdapter<T>) JavaTimeTypeAdapters.LOCAL_TIME;
            }
            if (rawType == AbstractC6152a.m11680y()) {
                return JavaTimeTypeAdapters.localDateTime(gson);
            }
            if (rawType == AbstractC6152a.m11681z()) {
                return JavaTimeTypeAdapters.MONTH_DAY;
            }
            if (rawType == AbstractC6152a.m11652A()) {
                return JavaTimeTypeAdapters.offsetDateTime(gson);
            }
            if (rawType == AbstractC6152a.m11653B()) {
                return JavaTimeTypeAdapters.offsetTime(gson);
            }
            if (rawType == AbstractC6152a.m11654C()) {
                return JavaTimeTypeAdapters.PERIOD;
            }
            if (rawType == AbstractC6152a.m11655D()) {
                return JavaTimeTypeAdapters.YEAR;
            }
            if (rawType == AbstractC6152a.m11675t()) {
                return JavaTimeTypeAdapters.YEAR_MONTH;
            }
            if (rawType == AbstractC5988d.m11560D() || rawType == AbstractC5988d.m11559C()) {
                return JavaTimeTypeAdapters.ZONE_ID;
            }
            if (rawType == AbstractC6152a.m11678w()) {
                return JavaTimeTypeAdapters.zonedDateTime(gson);
            }
            return null;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static TypeAdapter<LocalDateTime> localDateTime(Gson gson) {
        final TypeAdapter adapter = gson.getAdapter(AbstractC5988d.m11568h());
        final TypeAdapter adapter2 = gson.getAdapter(AbstractC5988d.m11558B());
        return new TypeAdapter<LocalDateTime>() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, LocalDateTime localDateTime) throws IOException {
                write2(jsonWriter, AbstractC6152a.m11662g(localDateTime));
            }

            @Override // com.google.gson.TypeAdapter
            public LocalDateTime read(JsonReader jsonReader) throws IOException {
                jsonReader.beginObject();
                LocalDate localDateM11660e = null;
                LocalTime localTimeM11666k = null;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("date")) {
                        localDateM11660e = AbstractC6152a.m11660e(adapter.read(jsonReader));
                    } else if (strNextName.equals("time")) {
                        localTimeM11666k = AbstractC6152a.m11666k(adapter2.read(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return LocalDateTime.of(AbstractC6152a.m11660e(JavaTimeTypeAdapters.requireNonNullField(localDateM11660e, "date", jsonReader)), AbstractC6152a.m11666k(JavaTimeTypeAdapters.requireNonNullField(localTimeM11666k, "time", jsonReader)));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, LocalDateTime localDateTime) throws IOException {
                jsonWriter.beginObject();
                jsonWriter.name("date");
                adapter.write(jsonWriter, localDateTime.toLocalDate());
                jsonWriter.name("time");
                adapter2.write(jsonWriter, localDateTime.toLocalTime());
                jsonWriter.endObject();
            }
        }.nullSafe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TypeAdapter<OffsetDateTime> offsetDateTime(Gson gson) {
        final TypeAdapter<LocalDateTime> typeAdapterLocalDateTime = localDateTime(gson);
        final TypeAdapter adapter = gson.getAdapter(AbstractC5988d.m11559C());
        return new TypeAdapter<OffsetDateTime>() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, OffsetDateTime offsetDateTime) throws IOException {
                write2(jsonWriter, AbstractC6153b.m11688g(offsetDateTime));
            }

            @Override // com.google.gson.TypeAdapter
            public OffsetDateTime read(JsonReader jsonReader) throws IOException {
                jsonReader.beginObject();
                LocalDateTime localDateTimeM11662g = null;
                ZoneOffset zoneOffsetM11582v = null;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                        zoneOffsetM11582v = AbstractC5988d.m11582v(adapter.read(jsonReader));
                    } else if (strNextName.equals("dateTime")) {
                        localDateTimeM11662g = AbstractC6152a.m11662g(typeAdapterLocalDateTime.read(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return OffsetDateTime.of(AbstractC6152a.m11662g(JavaTimeTypeAdapters.requireNonNullField(localDateTimeM11662g, "dateTime", jsonReader)), AbstractC5988d.m11582v(JavaTimeTypeAdapters.requireNonNullField(zoneOffsetM11582v, TypedValues.CycleType.S_WAVE_OFFSET, jsonReader)));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, OffsetDateTime offsetDateTime) throws IOException {
                jsonWriter.beginObject();
                jsonWriter.name("dateTime");
                typeAdapterLocalDateTime.write(jsonWriter, offsetDateTime.toLocalDateTime());
                jsonWriter.name(TypedValues.CycleType.S_WAVE_OFFSET);
                adapter.write(jsonWriter, offsetDateTime.getOffset());
                jsonWriter.endObject();
            }
        }.nullSafe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TypeAdapter<OffsetTime> offsetTime(Gson gson) {
        final TypeAdapter adapter = gson.getAdapter(AbstractC5988d.m11558B());
        final TypeAdapter adapter2 = gson.getAdapter(AbstractC5988d.m11559C());
        return new TypeAdapter<OffsetTime>() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, OffsetTime offsetTime) throws IOException {
                write2(jsonWriter, AbstractC6153b.m11690i(offsetTime));
            }

            @Override // com.google.gson.TypeAdapter
            public OffsetTime read(JsonReader jsonReader) throws IOException {
                jsonReader.beginObject();
                LocalTime localTimeM11666k = null;
                ZoneOffset zoneOffsetM11582v = null;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                        zoneOffsetM11582v = AbstractC5988d.m11582v(adapter2.read(jsonReader));
                    } else if (strNextName.equals("time")) {
                        localTimeM11666k = AbstractC6152a.m11666k(adapter.read(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return OffsetTime.of(AbstractC6152a.m11666k(JavaTimeTypeAdapters.requireNonNullField(localTimeM11666k, "time", jsonReader)), AbstractC5988d.m11582v(JavaTimeTypeAdapters.requireNonNullField(zoneOffsetM11582v, TypedValues.CycleType.S_WAVE_OFFSET, jsonReader)));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, OffsetTime offsetTime) throws IOException {
                jsonWriter.beginObject();
                jsonWriter.name("time");
                adapter.write(jsonWriter, offsetTime.toLocalTime());
                jsonWriter.name(TypedValues.CycleType.S_WAVE_OFFSET);
                adapter2.write(jsonWriter, offsetTime.getOffset());
                jsonWriter.endObject();
            }
        }.nullSafe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T requireNonNullField(T t, String str, JsonReader jsonReader) {
        if (t != null) {
            return t;
        }
        StringBuilder sbM411s = AbstractC0271e0.m411s("Missing ", str, " field; at path ");
        sbM411s.append(jsonReader.getPreviousPath());
        throw new JsonSyntaxException(sbM411s.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TypeAdapter<ZonedDateTime> zonedDateTime(Gson gson) {
        final TypeAdapter<LocalDateTime> typeAdapterLocalDateTime = localDateTime(gson);
        final TypeAdapter adapter = gson.getAdapter(AbstractC5988d.m11559C());
        final TypeAdapter adapter2 = gson.getAdapter(AbstractC5988d.m11560D());
        return new TypeAdapter<ZonedDateTime>() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, ZonedDateTime zonedDateTime) throws IOException {
                write2(jsonWriter, AbstractC6152a.m11671p(zonedDateTime));
            }

            @Override // com.google.gson.TypeAdapter
            public ZonedDateTime read(JsonReader jsonReader) throws IOException {
                jsonReader.beginObject();
                LocalDateTime localDateTimeM11662g = null;
                ZoneOffset zoneOffsetM11582v = null;
                ZoneId zoneIdM11668m = null;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "offset":
                            zoneOffsetM11582v = AbstractC5988d.m11582v(adapter.read(jsonReader));
                            break;
                        case "zone":
                            zoneIdM11668m = AbstractC6152a.m11668m(adapter2.read(jsonReader));
                            break;
                        case "dateTime":
                            localDateTimeM11662g = AbstractC6152a.m11662g(typeAdapterLocalDateTime.read(jsonReader));
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return ZonedDateTime.ofInstant(AbstractC6152a.m11662g(JavaTimeTypeAdapters.requireNonNullField(localDateTimeM11662g, "dateTime", jsonReader)), AbstractC5988d.m11582v(JavaTimeTypeAdapters.requireNonNullField(zoneOffsetM11582v, TypedValues.CycleType.S_WAVE_OFFSET, jsonReader)), AbstractC6152a.m11668m(JavaTimeTypeAdapters.requireNonNullField(zoneIdM11668m, "zone", jsonReader)));
            }

            /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
            public void write2(JsonWriter jsonWriter, ZonedDateTime zonedDateTime) throws IOException {
                if (zonedDateTime == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("dateTime");
                typeAdapterLocalDateTime.write(jsonWriter, zonedDateTime.toLocalDateTime());
                jsonWriter.name(TypedValues.CycleType.S_WAVE_OFFSET);
                adapter.write(jsonWriter, zonedDateTime.getOffset());
                jsonWriter.name("zone");
                adapter2.write(jsonWriter, zonedDateTime.getZone());
                jsonWriter.endObject();
            }
        }.nullSafe();
    }

    @Override // com.google.gson.internal.bind.TypeAdapters.FactorySupplier
    public TypeAdapterFactory get() {
        return JAVA_TIME_FACTORY;
    }
}
