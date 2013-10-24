package com.example.demo.cardlistview;




import net.londatiga.android.ActionItem;
import net.londatiga.android.QuickAction;

import android.app.Activity;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * @author Gleb Iakovlev
 *
 */


public class ActivityAdapter extends ArrayAdapter<ActivityModel>{

	

	Context context; 
	    int layoutResourceId;  
	    private int mSelectedRow = 0;
	    ActivityModel data[] = null;
		private OnActionSelected actionlistener;
		
	    public ActivityAdapter(Context context, int layoutResourceId, ActivityModel data[]) {
		
			super(context, layoutResourceId, data);
	        this.layoutResourceId = layoutResourceId;
	        this.context = context;
	        this.data = data;
		}
	    
	    
	    @Override
	    public View getView(final int position, View convertView, ViewGroup parent) {
	    	
	    	   View row = convertView;
	    	   ActHolder holder = null;
	    	 
		    	
		    	
		    	
	    	   if(row == null)
	           {
	    		   
	    		   LayoutInflater inflater = ((Activity)context).getLayoutInflater();
	               row = inflater.inflate(layoutResourceId, parent, false);
	    		   
	               holder = new ActHolder();
	               
	               holder.txtTitle = (TextView)row.findViewById(R.id.title);
	               holder.description = (TextView)row.findViewById(R.id.description);
	               holder.icon = (ImageView) row.findViewById(R.id.menu);
	               
	               
	               
	               //Declare our action items
	               ActionItem addItem 		= new ActionItem(DemoAppMain.ID_OPTION1, "Add", context.getResources().getDrawable(R.drawable.ic_add));
	       		ActionItem acceptItem 	= new ActionItem(DemoAppMain.ID_OPTION2, "Accept", context.getResources().getDrawable(R.drawable.ic_accept));	
	               
	       		final QuickAction mQuickAction 	= new QuickAction(context); 
	       		
	       		mQuickAction.setOnActionItemClickListener(new QuickAction.OnActionItemClickListener() {
	    			@Override
	    			public void onItemClick(QuickAction quickAction, int pos, int actionId) {
	    			
	    				
	    				
	    				/*** Set Listener to get selected quick action  and row number  ***/
	    				
	    				if(actionlistener !=null){
	    				actionlistener.onQuickItemSelected(actionId , mSelectedRow);
	    				}
	    				
	    				
	    				
	    			}
	    		});
	       		
	       		
	       		mQuickAction.addActionItem(addItem);
	    		mQuickAction.addActionItem(acceptItem);
	               
	               holder.icon.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View view) {
							mSelectedRow = position;
							mQuickAction.show(view);
							
						}
	    		     });
	               
	           
				 
				 
	               row.setTag(holder);
	               
	           }else{
	        	   
	        	   holder = (ActHolder)row.getTag();
	           }
	    	   
	    	   
	    	
	    	   ActivityModel model = data[position];
	    	   
	    	   holder.txtTitle.setText(model.title);
	    	   holder.description.setText(model.description);
	    	
	    	   return row;
	    	
	    }
	    
	    
	    public OnActionSelected getActionlistener() {
			return actionlistener;
		}


		public void setActionlistener(OnActionSelected actionlistener) {
			this.actionlistener = actionlistener;
		}


		static class ActHolder
	    {
	      //  ImageView imgIcon;
	        TextView txtTitle;
	        TextView description;
	        ImageView icon;
	    } 
	    
	
	
}
