demo.cardlistview
=================

This is an example of  android google like card list view 
In order this project to work use QuickAction (https://github.com/lorensiuswlt/NewQuickAction)  project as library

To set up the listview follow this steps : 

1.Add "@drawable/rowshadow" as a bacground to row element of your list and make padding to the item, like this : 

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

2.Add   android:divider="@android:color/transparent"
        android:dividerHeight="1dip"

to ListView elements
 

