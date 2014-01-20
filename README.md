demo.cardlistview
=================

![alt tag](https://github.com/elcrion/demo.cardlistview/blob/master/screen.png?raw=true)



This is an example of an android app with the Google Play-like card list view.
In order for this project to work use QuickAction (https://github.com/lorensiuswlt/NewQuickAction) project as library.

To set up the listview, follow these steps : 

1. Add "@drawable/rowshadow" as a background to all row elements of your list and set the padding for the item as :

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="100dp"
    android:orientation="vertical"
    android:padding="3dp" >

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
    
        android:background="@drawable/rowshadow" >

        <TextView
           ....../>

        <TextView
          ...... />

        <ImageView
           ...... />

    </RelativeLayout>

</LinearLayout>

2. Add   

        android:divider="@android:color/transparent"
        android:dividerHeight="1dip"

to ListView elements
 
This approach is compatible with android 2.3 and older 

