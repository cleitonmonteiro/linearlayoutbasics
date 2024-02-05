# LinearLayoutBasics

Idealização apenas para exemplificar como criar uma tela com Linear Layout.
Algumas features do Android não foram usadas para simplificar o exemplo.

## Detalhes do layout
```xml
<LinearLayout android:orientation="vertical">
    <ImageView
        android:id="@+id/android_image"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:background="@drawable/baseline_android_24"
        android:backgroundTint="#4DAE51"
        android:contentDescription="Android image" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="Texto da tela!" />

    <Button
        android:id="@+id/message_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="Mostrar mensagem" />
</LinearLayout>
```

## Executando o app

<img src="res/result-actions.gif" height="500px">