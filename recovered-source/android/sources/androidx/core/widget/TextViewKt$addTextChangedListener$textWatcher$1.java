package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6504r;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ InterfaceC6498l $afterTextChanged;
    final /* synthetic */ InterfaceC6504r $beforeTextChanged;
    final /* synthetic */ InterfaceC6504r $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(InterfaceC6498l interfaceC6498l, InterfaceC6504r interfaceC6504r, InterfaceC6504r interfaceC6504r2) {
        this.$afterTextChanged = interfaceC6498l;
        this.$beforeTextChanged = interfaceC6504r;
        this.$onTextChanged = interfaceC6504r2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
