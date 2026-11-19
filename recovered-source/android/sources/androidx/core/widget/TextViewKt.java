package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6504r;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewKt {

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$1 */
    public static final class C12821 extends AbstractC6453l implements InterfaceC6504r {
        public static final C12821 INSTANCE = new C12821();

        public C12821() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // p078p0.InterfaceC6504r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$2 */
    public static final class C12832 extends AbstractC6453l implements InterfaceC6504r {
        public static final C12832 INSTANCE = new C12832();

        public C12832() {
            super(4);
        }

        public final void invoke(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // p078p0.InterfaceC6504r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.TextViewKt$addTextChangedListener$3 */
    public static final class C12843 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12843 INSTANCE = new C12843();

        public C12843() {
            super(1);
        }

        public final void invoke(Editable editable) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Editable) obj);
            return C6289k.f24318a;
        }
    }

    public static final TextWatcher addTextChangedListener(TextView textView, InterfaceC6504r interfaceC6504r, InterfaceC6504r interfaceC6504r2, InterfaceC6498l interfaceC6498l) {
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(interfaceC6498l, interfaceC6504r, interfaceC6504r2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, InterfaceC6504r interfaceC6504r, InterfaceC6504r interfaceC6504r2, InterfaceC6498l interfaceC6498l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC6504r = C12821.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            interfaceC6504r2 = C12832.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            interfaceC6498l = C12843.INSTANCE;
        }
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(interfaceC6498l, interfaceC6504r, interfaceC6504r2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, final InterfaceC6498l interfaceC6498l) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                interfaceC6498l.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, final InterfaceC6504r interfaceC6504r) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                interfaceC6504r.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, final InterfaceC6504r interfaceC6504r) {
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                interfaceC6504r.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
